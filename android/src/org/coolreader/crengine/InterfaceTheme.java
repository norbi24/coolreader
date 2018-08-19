package org.coolreader.crengine;

import org.coolreader.R;

public class InterfaceTheme {

	public final static InterfaceTheme BLACK = new InterfaceTheme("BLACK", R.style.Theme_Black, R.style.Theme_Black_Dialog_Normal, R.style.Theme_Black_Dialog_Fullscreen, R.string.options_app_ui_theme_black, 0xFF000000)
			.setRootDelimiter(R.drawable.divider_black_tiled, 2)
			.setBackgrounds(
					R.drawable.ui_status_background_browser_black, 
					R.drawable.ui_toolbar_background_browser_black,
					R.drawable.ui_toolbar_background_browser_vertical_black,
					0, 0xFF000000)
			.setToolbarButtonAlpha(DeviceInfo.EINK_SCREEN ? 0xFF : 0x80);

	public final static InterfaceTheme WHITE = new InterfaceTheme("WHITE", R.style.Theme_White, R.style.Theme_White_Dialog_Normal, R.style.Theme_White_Dialog_Fullscreen, R.string.options_app_ui_theme_white, 0xFFFFFFFF)
			.setRootDelimiter(R.drawable.divider_white_tiled, 2)
			.setBackgrounds(
					R.drawable.ui_status_background_browser_white, 
					R.drawable.ui_toolbar_background_browser_white,
					R.drawable.ui_toolbar_background_browser_vertical_white,
					0, 0xFFFFFFFF)
			.setToolbarButtonAlpha(DeviceInfo.EINK_SCREEN ? 0xFF : 0xE0);

	public final static InterfaceTheme LIGHT = new InterfaceTheme("LIGHT", R.style.Theme_Light, R.style.Theme_Light_Dialog_Normal, R.style.Theme_Light_Dialog_Fullscreen, R.string.options_app_ui_theme_light, 0xFF000000)
			.setRootDelimiter(R.drawable.divider_light_tiled_v3, 16)
			.setBackgrounds(
					R.drawable.ui_status_background_browser_light, 
					R.drawable.ui_toolbar_background_browser_light,
					R.drawable.ui_toolbar_background_browser_vertical_light,
					R.drawable.background_tiled_light, 0)
			.setToolbarButtonAlpha(DeviceInfo.EINK_SCREEN ? 0xFF : 0xC0);
//			.setBackgrounds(
//					R.drawable.ui_status_background_browser_light, 
//					R.drawable.ui_toolbar_background_browser_light,
//					R.drawable.ui_toolbar_background_browser_vertical_light,
//					R.drawable.ui_status_background_reader_light, 
//					R.drawable.ui_toolbar_background_reader_light,
//					R.drawable.ui_toolbar_background_reader_vertical_light,
//					0x404040, 0xC0);

	public final static InterfaceTheme DARK = new InterfaceTheme("DARK", R.style.Theme_Dark, R.style.Theme_Dark_Dialog_Normal, R.style.Theme_Dark_Dialog_Fullscreen, R.string.options_app_ui_theme_dark, 0xFF000000)
			.setRootDelimiter(R.drawable.divider_dark_tiled_v3, 16)
			.setBackgrounds(
					R.drawable.ui_status_background_browser_dark, 
					R.drawable.ui_toolbar_background_browser_dark,
					R.drawable.ui_toolbar_background_browser_vertical_dark,
					R.drawable.background_tiled_dark, 0)
			.setToolbarButtonAlpha(DeviceInfo.EINK_SCREEN ? 0xFF : 0x90);
//			.setBackgrounds(
//					R.drawable.ui_status_background_browser_dark,
//					R.drawable.ui_toolbar_background_browser_dark,
//					R.drawable.ui_toolbar_background_browser_vertical_dark,
//					R.drawable.ui_status_background_reader_dark,
//					R.drawable.ui_toolbar_background_reader_dark,
//					R.drawable.ui_toolbar_background_reader_vertical_dark,
//					0xE0E0E0, 0x90);

	public final static InterfaceTheme GRAY1 = new InterfaceTheme("GRAY1", R.style.Theme_Gray1, R.style.Theme_Gray1_Dialog_Normal, R.style.Theme_Gray1_Dialog_Fullscreen, R.string.options_app_ui_theme_gray1, 0xFF555555)
			.setRootDelimiter(R.drawable.divider_black_tiled, 2)
			.setBackgrounds(
					R.drawable.ui_status_background_browser_gray1,
					R.drawable.ui_toolbar_background_browser_gray1,
					R.drawable.ui_toolbar_background_browser_vertical_gray1,
					0, 0xFF555555)
			.setToolbarButtonAlpha(DeviceInfo.EINK_SCREEN ? 0xFF : 0x80);

	public final static InterfaceTheme GRAY2 = new InterfaceTheme("GRAY2", R.style.Theme_Gray2, R.style.Theme_Gray2_Dialog_Normal, R.style.Theme_Gray2_Dialog_Fullscreen, R.string.options_app_ui_theme_gray2, 0xFFCCCCCC)
			.setRootDelimiter(R.drawable.divider_white_tiled, 2)
			.setBackgrounds(
					R.drawable.ui_status_background_browser_gray2,
					R.drawable.ui_toolbar_background_browser_gray2,
					R.drawable.ui_toolbar_background_browser_vertical_gray2,
					0, 0xFFCCCCCC)
			.setToolbarButtonAlpha(DeviceInfo.EINK_SCREEN ? 0xFF : 0xE0);
	public final static InterfaceTheme HICONTRAST1 = new InterfaceTheme("HICONTRAST1", R.style.Theme_HiContrast1, R.style.Theme_HiContrast1_Dialog_Normal, R.style.Theme_HiContrast1_Dialog_Fullscreen, R.string.options_app_ui_theme_hicontrast1, 0xFFFFFFFF)
			.setRootDelimiter(R.drawable.divider_white_tiled, 2)
			.setBackgrounds(
					R.drawable.ui_status_background_browser_white,
					R.drawable.ui_toolbar_background_browser_white,
					R.drawable.ui_toolbar_background_browser_vertical_white,
					0, 0xFFFFFFFF)
			.setToolbarButtonAlpha(0xFF);
	public final static InterfaceTheme HICONTRAST2 = new InterfaceTheme("HICONTRAST2", R.style.Theme_HiContrast2, R.style.Theme_HiContrast2_Dialog_Normal, R.style.Theme_HiContrast2_Dialog_Fullscreen, R.string.options_app_ui_theme_hicontrast2, 0xFFFFFFFF)
			.setRootDelimiter(R.drawable.divider_black_tiled, 2)
			.setBackgrounds(
					R.drawable.ui_status_background_browser_black,
					R.drawable.ui_toolbar_background_browser_black,
					R.drawable.ui_toolbar_background_browser_vertical_black,
					0, 0xFF000000)
			.setToolbarButtonAlpha(0xFF);

	public String getCode() {
		return code;
	}

	public int getThemeId() {
		return themeId;
	}

	public int getDialogThemeId() {
		return dialogThemeId;
	}

	public int getFullscreenDialogThemeId() {
		return fsDialogThemeId;
	}

	public int getDisplayNameResourceId() {
		return displayNameResourceId;
	}
	
	public int getActionBarBackgroundColorReading() {
		return actionBarBackgroundColorReading;
	}
	
//	public Drawable getActionBarBackgroundDrawableReading() {
//		return Utils.solidColorDrawable(actionBarBackgroundColorReading);
//	}
//	
//	public Drawable getActionBarBackgroundDrawableBrowser() {
//		return Utils.solidColorDrawable(0);
//	}
	
	public int getRootDelimiterResourceId() {
		return rootDelimiterResourceId;
	}
	
	public int getRootDelimiterHeight() {
		return rootDelimiterHeight;
	}
	
	public int getBrowserStatusBackground() {
		return browserStatusBackground;
	}
	
	public int getBrowserToolbarBackground(boolean vertical) {
		return !vertical ? browserToolbarBackground : browserToolbarBackgroundVertical;
	}
	
//	public int getReaderStatusBackground() {
//		return readerStatusBackground;
//	}
//	
//	public int getReaderToolbarBackground(boolean vertical) {
//		return !vertical ? readerToolbarBackground : readerToolbarBackgroundVertical;
//	}
	
//	public int getStatusTextColor() {
//		return statusTextColor;
//	}
	
	public int getToolbarButtonAlpha() {
		return toolbarButtonAlpha;
	}

	public int getPopupToolbarBackground() {
		return popupToolbarBackground;
	}

	public int getPopupToolbarBackgroundColor() {
		return popupToolbarBackgroundColor;
	}

	
	public final static InterfaceTheme[] allThemes = {
		BLACK, WHITE, DARK, LIGHT, GRAY1, GRAY2, HICONTRAST1, HICONTRAST2
	};
	
	public static InterfaceTheme findByCode(String code) {
		if (code == null)
			return null;
		for (InterfaceTheme t : allThemes)
			if (t.getCode().equals(code))
				return t;
		return null;
	}
	
	private final String code;
	private final int themeId;
	private final int dialogThemeId;
	private final int fsDialogThemeId;
	private final int displayNameResourceId;
	private final int actionBarBackgroundColorReading;
	private int rootDelimiterResourceId;
	private int rootDelimiterHeight;
	
	private int browserStatusBackground;
	private int browserToolbarBackground;
	private int browserToolbarBackgroundVertical;
	private int popupToolbarBackground;
	private int popupToolbarBackgroundColor;
//	private int readerStatusBackground;
//	private int readerToolbarBackground;
//	private int readerToolbarBackgroundVertical;
//	private int statusTextColor;
	private int toolbarButtonAlpha;
	
	private InterfaceTheme setToolbarButtonAlpha(int toolbarButtonAlpha) {
		this.toolbarButtonAlpha = toolbarButtonAlpha;
		return this;
	}
//	private InterfaceTheme setBackgrounds(int browserStatusBackground, int browserToolbarBackground,
//			int browserToolbarBackgroundVertical, int readerStatusBackground, 
//			int readerToolbarBackground, int readerToolbarBackgroundVertical,
//			int statusTextColor, int toolbarButtonAlpha) {
//		this.browserStatusBackground = browserStatusBackground;
//		this.browserToolbarBackground = browserToolbarBackground;
//		this.browserToolbarBackgroundVertical = browserToolbarBackgroundVertical;
//		this.readerStatusBackground = readerStatusBackground;
//		this.readerToolbarBackground = readerToolbarBackground;
//		this.readerToolbarBackgroundVertical = readerToolbarBackgroundVertical;
//		this.statusTextColor = statusTextColor;
//		this.toolbarButtonAlpha = toolbarButtonAlpha;
//		return this;
//	}

	private InterfaceTheme setBackgrounds(int browserStatusBackground,
			int browserToolbarBackground, int browserToolbarBackgroundVertical, 
			int popupToolbarBackground, int browserToolbarBackgroundColor) {
		this.browserStatusBackground = browserStatusBackground;
		this.browserToolbarBackground = browserToolbarBackground;
		this.browserToolbarBackgroundVertical = browserToolbarBackgroundVertical;
		this.popupToolbarBackground = popupToolbarBackground;
		this.popupToolbarBackgroundColor = browserToolbarBackgroundColor;
		return this;
	}
	
	private InterfaceTheme(String code, int themeId, int dialogThemeId, int fsDialogThemeId, int displayNameResourceId, int actionBarBackgroundColorReading) {
		this.code = code;
		this.themeId = themeId;
		this.dialogThemeId = dialogThemeId;
		this.fsDialogThemeId = fsDialogThemeId;
		this.displayNameResourceId = displayNameResourceId;
		this.actionBarBackgroundColorReading = actionBarBackgroundColorReading;
	}
	
	private InterfaceTheme setRootDelimiter(int resourceId, int height) {
		this.rootDelimiterResourceId = resourceId;
		this.rootDelimiterHeight = height;
		return this;
	}
	
	@Override
	public String toString() {
		return "Theme[code=" + code + ", themeId=" + themeId + "]";
	}

	public final void applyActionIcons() {

	}
}
