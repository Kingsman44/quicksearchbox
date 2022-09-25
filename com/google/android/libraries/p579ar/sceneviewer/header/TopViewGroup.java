package com.google.android.libraries.p579ar.sceneviewer.header;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.browser.p059a.C0963k;
import androidx.core.content.C1878d;
import com.google.android.apps.search.sceneviewer.C141570m;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.header.logoview.ConfigurableLogoView;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ModelViewer;
import com.google.android.libraries.p579ar.sceneviewer.occlusions.OcclusionsHost;
import com.google.android.libraries.p579ar.sceneviewer.occlusions.OcclusionsPopup;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AnimationUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ViewUtilities;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.p3723ar.p3724a.p3725a.C47890a;
import java.util.List;

/* renamed from: com.google.android.libraries.ar.sceneviewer.header.TopViewGroup */
/* compiled from: PG */
public final class TopViewGroup extends RelativeLayout {
    private static final int HEADER_FADE_IN_DURATION_MS = 150;
    private static final int HEADER_FADE_OUT_DURATION_MS = 50;
    private static final float OCCLUSIONS_OFF_ICON_OPACITY = 0.5f;
    private static final float OCCLUSIONS_ON_ICON_OPACITY = 1.0f;
    private static final String PRIVACY_POLICY_URL = "https://policies.google.com/privacy";
    private static final String TERMS_OF_SERVICE_URL = "https://policies.google.com/terms";
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.header.TopViewGroup");
    private int appBarBackgroundResource = C10698R.C10699drawable.app_bar_background;
    private C47890a buildType;
    private ViewGroup buttonGroup;
    private ConfigurableLogoView customLogo;
    private boolean debugModeEnabled = false;
    private DebugModeListener debugModeListener = TopViewGroup$$ExternalSyntheticLambda7.INSTANCE;
    private int displayCutoutHeightPx;
    private int enterDevModeClickCount = 0;
    private ImageView exitButton;
    private ImageView googleLogo;
    private ViewGroup innerTopViewGroup;
    private boolean isLandscape = false;
    private LogoType logoType = LogoType.DISABLE;
    private Uri modelUri;
    private ModelViewer modelViewer;
    private ModelViewer.Host modelViewerHost;
    private ToggleButton occlusionsButton;
    private OcclusionsHost occlusionsHost;
    private OcclusionsPopup occlusionsPopup;
    private ImageView overflowButton;
    private PopupWindow overflowMenu;
    private View overflowPopup;
    private Types.ViewerMode previousMode = Types.ViewerMode.INVALID;
    private View sendFeedbackButton;

    /* renamed from: com.google.android.libraries.ar.sceneviewer.header.TopViewGroup$ColorMode */
    /* compiled from: PG */
    public enum ColorMode {
        DEFAULT,
        LIGHT
    }

    /* renamed from: com.google.android.libraries.ar.sceneviewer.header.TopViewGroup$DebugModeListener */
    /* compiled from: PG */
    public interface DebugModeListener {
        void debugModeEnabled(boolean z);
    }

    /* renamed from: com.google.android.libraries.ar.sceneviewer.header.TopViewGroup$LogoType */
    /* compiled from: PG */
    public enum LogoType {
        DISABLE,
        GOOGLE,
        CUSTOM
    }

    public TopViewGroup(Context context) {
        super(context);
    }

    private int getAppBackgroundResource() {
        return this.displayCutoutHeightPx > 0 ? this.isLandscape ? C10698R.C10699drawable.app_bar_background_notch_land : C10698R.C10699drawable.app_bar_background_notch : this.isLandscape ? C10698R.C10699drawable.app_bar_background_land : C10698R.C10699drawable.app_bar_background;
    }

    private Rect getMargins() {
        ViewGroup.LayoutParams layoutParams = this.innerTopViewGroup.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return new Rect(0, 0, 0, 0);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        return new Rect(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
    }

    private OcclusionsPopup inflateOcclusionPopup() {
        LayoutInflater.from(getContext()).inflate(C10698R.layout.occlusions_popup, this);
        OcclusionsPopup occlusionsPopup2 = (OcclusionsPopup) findViewById(C10698R.C10700id.occlusions_popup);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) occlusionsPopup2.getLayoutParams();
        layoutParams.addRule(21);
        occlusionsPopup2.setLayoutParams(layoutParams);
        return occlusionsPopup2;
    }

    static /* synthetic */ void lambda$new$0(boolean z) {
    }

    private void setCutoutMargin(int i) {
        ViewGroup.LayoutParams layoutParams = this.innerTopViewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (this.isLandscape) {
                layoutParams2.setMargins(i, 0, 0, 0);
            } else {
                layoutParams2.setMargins(0, i, 0, 0);
            }
            this.innerTopViewGroup.setLayoutParams(layoutParams2);
            this.displayCutoutHeightPx = i;
        }
    }

    private void setupDebugMenuOnPopup(View view) {
        if (this.buildType.equals(C47890a.STANDALONE)) {
            TextView textView = (TextView) view.findViewById(C10698R.C10700id.debug_info_toggle);
            textView.setVisibility(0);
            textView.setText(C10698R.string.show_debug_info);
            textView.setOnClickListener(new TopViewGroup$$ExternalSyntheticLambda0(this, textView));
            setupLightingCapture(view);
        }
    }

    private void setupLightingCapture(View view) {
        View findViewById = view.findViewById(C10698R.C10700id.capture_lighting_button);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new TopViewGroup$$ExternalSyntheticLambda13(this));
    }

    private void setupOcclusionsUi() {
        this.occlusionsButton.setOnClickListener(new TopViewGroup$$ExternalSyntheticLambda12(this));
        updateOcclusionsUi();
    }

    private void setupOverflowMenu() {
        this.overflowPopup = LayoutInflater.from(getContext()).inflate(C10698R.layout.overflow_popup, this, false);
        this.overflowMenu = new PopupWindow(this.overflowPopup, -2, -2, true);
        View findViewById = this.overflowPopup.findViewById(C10698R.C10700id.direct_link_button);
        findViewById.setOnClickListener(new TopViewGroup$$ExternalSyntheticLambda3(this));
        this.overflowPopup.findViewById(C10698R.C10700id.menu_header).setOnClickListener(new TopViewGroup$$ExternalSyntheticLambda4(this, findViewById));
        this.overflowPopup.findViewById(C10698R.C10700id.privacy_policy_button).setOnClickListener(new TopViewGroup$$ExternalSyntheticLambda5(this));
        this.overflowPopup.findViewById(C10698R.C10700id.terms_of_service_button).setOnClickListener(new TopViewGroup$$ExternalSyntheticLambda6(this));
        this.sendFeedbackButton = this.overflowPopup.findViewById(C10698R.C10700id.send_feedback_button);
    }

    private void showOcclusionsPopup() {
        if (this.occlusionsPopup == null) {
            this.occlusionsPopup = inflateOcclusionPopup();
            updateOcclusionPopupPosition();
        }
        OcclusionsPopup occlusionsPopup2 = this.occlusionsPopup;
        if (occlusionsPopup2 == null) {
            ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42325)).mo56386p("Unable to inflate occlusions popup, not showing the popup.");
        } else {
            occlusionsPopup2.showIfApplicable(this.occlusionsButton);
        }
    }

    /* access modifiers changed from: private */
    public void updateOcclusionPopupPosition() {
        OcclusionsPopup occlusionsPopup2 = this.occlusionsPopup;
        if (occlusionsPopup2 != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) occlusionsPopup2.getLayoutParams();
            int dimensionPixelSize = getResources().getDimensionPixelSize(C10698R.dimen.occlusions_popup_x_offset);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C10698R.dimen.occlusions_popup_y_offset) + ViewUtilities.getBoundingRect(this.occlusionsButton).bottom;
            if (layoutParams.topMargin != dimensionPixelSize2) {
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
                this.occlusionsPopup.setLayoutParams(layoutParams);
            }
            this.occlusionsPopup.pointAt(this.occlusionsButton);
        }
    }

    public void configCustomLogo(C141570m mVar, String str) {
        setLogoType(LogoType.CUSTOM);
        this.customLogo.configCustomLogo(mVar, str);
    }

    public void dismissOverflowMenu() {
        this.overflowMenu.dismiss();
    }

    public void initialize(C47890a aVar, ModelViewer modelViewer2, ModelViewer.Host host) {
        this.buildType = aVar;
        this.modelViewer = modelViewer2;
        this.modelViewerHost = host;
        setupDebugMenuOnPopup(this.overflowPopup);
    }

    /* renamed from: lambda$onFinishInflate$5$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18789x1655ac99(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        int dpToPx = ViewUtilities.dpToPx(getContext(), 1);
        this.enterDevModeClickCount = 0;
        this.overflowMenu.showAsDropDown(view, -width, (-height) - dpToPx);
    }

    /* renamed from: lambda$setMode$1$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18790x6b80ce65() {
        setBackgroundResource(this.appBarBackgroundResource);
        AnimationUtilities.fade(this, AnimationUtilities.Fade.IN, HEADER_FADE_IN_DURATION_MS).start();
    }

    /* renamed from: lambda$setMode$2$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18791xb9404666(int i) {
        this.exitButton.setImageDrawable(getContext().getDrawable(i));
        AnimationUtilities.fade(this.exitButton, AnimationUtilities.Fade.IN, HEADER_FADE_IN_DURATION_MS).start();
    }

    /* renamed from: lambda$setMode$3$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18792x6ffbe67(int i) {
        this.overflowButton.setImageDrawable(getContext().getDrawable(i));
        AnimationUtilities.fade(this.overflowButton, AnimationUtilities.Fade.IN, HEADER_FADE_IN_DURATION_MS).start();
    }

    /* renamed from: lambda$setMode$4$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18793x54bf3668(Drawable drawable) {
        this.googleLogo.setImageDrawable(drawable);
        AnimationUtilities.fade(this.googleLogo, AnimationUtilities.Fade.IN, HEADER_FADE_IN_DURATION_MS).start();
    }

    /* renamed from: lambda$setupDebugMenuOnPopup$11$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18794xf8224b19(TextView textView, View view) {
        boolean z = !this.debugModeEnabled;
        this.debugModeEnabled = z;
        if (z) {
            textView.setText(C10698R.string.hide_debug_info);
        } else {
            textView.setText(C10698R.string.show_debug_info);
        }
        this.overflowMenu.dismiss();
        this.debugModeListener.debugModeEnabled(this.debugModeEnabled);
    }

    /* renamed from: lambda$setupLightingCapture$12$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18795x8762667b(View view) {
        this.modelViewer.captureDebugLightingValues();
    }

    /* renamed from: lambda$setupOcclusionsUi$6$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18796x13871dc(View view) {
        Types.Notification notification;
        boolean areOcclusionsActive = this.occlusionsHost.areOcclusionsActive();
        ViewerLogger.getInstance().logAction(areOcclusionsActive ? ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.TOGGLE_OCCLUSIONS_OFF : ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.TOGGLE_OCCLUSIONS_ON);
        this.occlusionsHost.setOcclusionsActive(!areOcclusionsActive);
        ModelViewer.Host host = this.modelViewerHost;
        if (host != null) {
            if (this.occlusionsHost.areOcclusionsActive()) {
                notification = Types.Notification.OCCLUSION_ON;
            } else {
                notification = Types.Notification.OCCLUSION_OFF;
            }
            host.showNotification(notification);
        }
        updateOcclusionsUi();
    }

    /* renamed from: lambda$setupOverflowMenu$10$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18797x1b3abc32(View view) {
        this.overflowMenu.dismiss();
        new C0963k().mo3582a().mo3590a(getContext(), Uri.parse(TERMS_OF_SERVICE_URL));
    }

    /* renamed from: lambda$setupOverflowMenu$7$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18798x4e27bae4(View view) {
        if (this.modelUri == null) {
            ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42323)).mo56386p("modelUri is null, not launching intent");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.modelUri.toString());
        intent.setType("text/plain");
        getContext().startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    /* renamed from: lambda$setupOverflowMenu$8$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18799x9be732e5(View view, View view2) {
        int i = this.enterDevModeClickCount + 1;
        this.enterDevModeClickCount = i;
        if (i > 5) {
            view.setVisibility(0);
        }
    }

    /* renamed from: lambda$setupOverflowMenu$9$com-google-android-libraries-ar-sceneviewer-header-TopViewGroup */
    public /* synthetic */ void mo18800xe9a6aae6(View view) {
        this.overflowMenu.dismiss();
        new C0963k().mo3582a().mo3590a(getContext(), Uri.parse(PRIVACY_POLICY_URL));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.exitButton = (ImageView) findViewById(C10698R.C10700id.exit_button);
        this.overflowButton = (ImageView) findViewById(C10698R.C10700id.overflow_button);
        this.occlusionsButton = (ToggleButton) findViewById(C10698R.C10700id.occlusions_button);
        this.innerTopViewGroup = (ViewGroup) findViewById(C10698R.C10700id.inner_top_group);
        this.buttonGroup = (ViewGroup) findViewById(C10698R.C10700id.top_tools);
        this.googleLogo = (ImageView) findViewById(C10698R.C10700id.googlelogo);
        this.customLogo = (ConfigurableLogoView) findViewById(C10698R.C10700id.customlogo);
        setupOverflowMenu();
        this.overflowButton.setOnClickListener(new TopViewGroup$$ExternalSyntheticLambda1(this));
        this.innerTopViewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new TopViewGroup$$ExternalSyntheticLambda2(this));
    }

    public void setColorMode(ColorMode colorMode) {
        if (colorMode == ColorMode.LIGHT) {
            this.exitButton.setColorFilter(C1878d.m5128a(getContext(), C10698R.color.exit_button_light));
            this.overflowButton.setColorFilter(C1878d.m5128a(getContext(), C10698R.color.overflow_button_light));
            this.googleLogo.setColorFilter(C1878d.m5128a(getContext(), C10698R.color.sceneviewer_google_logo_color_light));
            return;
        }
        this.exitButton.clearColorFilter();
        this.overflowButton.clearColorFilter();
        this.googleLogo.clearColorFilter();
    }

    public void setDebugToggleClickListener(DebugModeListener debugModeListener2) {
        this.debugModeListener = debugModeListener2;
    }

    public void setDisplayCutout(DisplayCutout displayCutout) {
        List<Rect> boundingRects = displayCutout.getBoundingRects();
        if (!boundingRects.isEmpty()) {
            Rect rect = boundingRects.get(0);
            Rect boundingRect = ViewUtilities.getBoundingRect(this.innerTopViewGroup);
            if (boundingRect.intersect(rect)) {
                setCutoutMargin(this.isLandscape ? rect.width() : rect.height());
                return;
            }
            Rect margins = getMargins();
            if (this.displayCutoutHeightPx != 0) {
                boundingRect.offset(-margins.left, -margins.top);
                if (!boundingRect.intersect(rect)) {
                    ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42324)).mo56386p("Setting display cutout, setting");
                    setCutoutMargin(0);
                }
            }
        }
    }

    public void setExitButtonClickListener(View.OnClickListener onClickListener) {
        this.exitButton.setOnClickListener(onClickListener);
    }

    public void setLandscapeMode(boolean z) {
        if (z != this.isLandscape) {
            this.isLandscape = z;
            ViewUtilities.Direction direction = z ? ViewUtilities.Direction.COUNTER_CLOCKWISE : ViewUtilities.Direction.CLOCKWISE;
            ViewUtilities.rotate(this, direction);
            ViewUtilities.rotate(this.innerTopViewGroup, direction);
            ViewUtilities.rotate(this.buttonGroup, direction);
            ViewUtilities.rotate(this.googleLogo, direction, true);
            ViewUtilities.rotate(this.customLogo, direction, true);
            ViewUtilities.rotate(this.exitButton, direction);
            ViewUtilities.rotate(this.overflowButton, direction);
            ViewUtilities.rotate(this.occlusionsButton, direction);
            int appBackgroundResource = getAppBackgroundResource();
            this.appBarBackgroundResource = appBackgroundResource;
            setBackgroundResource(appBackgroundResource);
        }
    }

    public void setLogoType(LogoType logoType2) {
        LogoType logoType3 = LogoType.DISABLE;
        int ordinal = logoType2.ordinal();
        if (ordinal == 1) {
            this.googleLogo.setVisibility(0);
            this.customLogo.setVisibility(8);
        } else if (ordinal != 2) {
            this.googleLogo.setVisibility(8);
            this.customLogo.setVisibility(8);
        } else {
            this.googleLogo.setVisibility(8);
            this.customLogo.setVisibility(0);
        }
        this.logoType = logoType2;
    }

    public void setMode(Types.ViewerMode viewerMode) {
        int i;
        int i2;
        int i3;
        int i4;
        OcclusionsPopup occlusionsPopup2;
        if (this.previousMode != viewerMode) {
            this.previousMode = viewerMode;
            int i5 = C10698R.C10699drawable.quantum_gm_ic_close_vd_theme_24;
            int i6 = C10698R.C10699drawable.sceneviewer_google_logo;
            int i7 = C10698R.C10699drawable.quantum_gm_ic_more_vert_vd_theme_24;
            if (Types.ViewerMode.AR.equals(viewerMode)) {
                i4 = getAppBackgroundResource();
                i3 = C10698R.C10699drawable.quantum_gm_ic_close_white_24;
                i2 = C10698R.C10699drawable.sceneviewer_google_logo_white;
                i = C10698R.C10699drawable.quantum_gm_ic_more_vert_white_24;
            } else {
                i = i7;
                i2 = i6;
                i3 = i5;
                i4 = 0;
            }
            this.appBarBackgroundResource = i4;
            AnimationUtilities.fade(this, AnimationUtilities.Fade.OUT, 50).withEndAction(new TopViewGroup$$ExternalSyntheticLambda8(this)).start();
            AnimationUtilities.fade(this.exitButton, AnimationUtilities.Fade.OUT, 50).withEndAction(new TopViewGroup$$ExternalSyntheticLambda9(this, i3)).start();
            AnimationUtilities.fade(this.overflowButton, AnimationUtilities.Fade.OUT, 50).withEndAction(new TopViewGroup$$ExternalSyntheticLambda10(this, i)).start();
            if (this.logoType == LogoType.GOOGLE) {
                AnimationUtilities.fade(this.googleLogo, AnimationUtilities.Fade.OUT, 50).withEndAction(new TopViewGroup$$ExternalSyntheticLambda11(this, getContext().getDrawable(i2))).start();
            }
            if (Types.ViewerMode.THREE_D.equals(viewerMode) && (occlusionsPopup2 = this.occlusionsPopup) != null && occlusionsPopup2.getVisibility() == 0) {
                this.occlusionsPopup.setVisibility(8);
            }
            updateOcclusionsUi();
        }
    }

    public void setModelUri(Uri uri) {
        this.modelUri = uri;
    }

    public void setOcclusionsHost(OcclusionsHost occlusionsHost2) {
        this.occlusionsHost = occlusionsHost2;
        setupOcclusionsUi();
    }

    public void setSendFeedbackButtonClickListener(View.OnClickListener onClickListener) {
        this.sendFeedbackButton.setVisibility(0);
        this.sendFeedbackButton.setOnClickListener(onClickListener);
    }

    public void updateOcclusionsUi() {
        OcclusionsHost occlusionsHost2 = this.occlusionsHost;
        if (occlusionsHost2 == null || !occlusionsHost2.areOcclusionsAvailable()) {
            this.occlusionsButton.setVisibility(8);
            return;
        }
        if (this.occlusionsHost.areOcclusionsRendered()) {
            updateOcclusionPopupPosition();
            showOcclusionsPopup();
        }
        if (this.occlusionsButton.getVisibility() != 0) {
            this.occlusionsButton.setVisibility(0);
        }
        this.occlusionsButton.setChecked(this.occlusionsHost.areOcclusionsActive());
        this.occlusionsButton.setAlpha(true != this.occlusionsHost.areOcclusionsActive() ? OCCLUSIONS_OFF_ICON_OPACITY : OCCLUSIONS_ON_ICON_OPACITY);
    }

    public TopViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
