package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.browser.p059a.C0963k;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AnimationUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.UriUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ViewUtilities;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import java.net.URISyntaxException;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.BottomViewGroup */
/* compiled from: PG */
public final class BottomViewGroup extends LinearLayout {
    private static final float ANIMATION_FRAME_DELAY = 33.33f;
    private static final int BOTTOM_UI_HIDE_TRANSLATE_OFFSET_PX = 1;
    private static final int BOTTOM_UI_Y_POSITION_EPSILON_DP = 3;
    private static final int CLAMP_THRESHOLD_DP = 70;
    private static final int COLLAPSED_PEEK_HEIGHT_DP = 8;
    private static final int FADE_IN_DISTANCE_DP = 12;
    private static final int FLING_THRESHOLD_VELOCITY = 150;
    private static final String INTENT_SCHEME = "intent";
    private static final int PEEK_HEIGHT_DP = 96;
    private static final int UI_ANIMATION_DURATION_MS = 300;
    private static final int VISIT_BUTTON_RELAYOUT_TEXT_LENGTH_LIMIT = 16;
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.infocard.BottomViewGroup");
    private final Animator.AnimatorListener animatorListener = new C10713a(this);
    /* access modifiers changed from: private */
    public final ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new BottomViewGroup$$ExternalSyntheticLambda6(this);
    private ViewGroup bottomTextGroup;
    private ImageView bottomViewGrabBar;
    private CardWebView cardWebView;
    /* access modifiers changed from: private */
    public boolean cardWebViewEnabled = false;
    private boolean cardWebViewLoaded = false;
    private final int collapsedPeekHeight = ViewUtilities.dpToPx(getContext(), 8);
    private ViewPropertyAnimator currentAnimator = null;
    private int currentHeight = 0;
    /* access modifiers changed from: private */
    public boolean draggingEnabled = true;
    private final int epsilon = ViewUtilities.dpToPx(getContext(), 3);
    private final int fadeInDistance = ViewUtilities.dpToPx(getContext(), 12);
    /* access modifiers changed from: private */
    public boolean fullyInflated = false;
    /* access modifiers changed from: private */
    public boolean isDragging = false;
    private boolean isLowProfile = false;
    private boolean isStreamingMode = false;
    private final int peekHeight = ViewUtilities.dpToPx(getContext(), 96);
    private PositionListener positionListener;
    private boolean relayoutActive = false;
    private ViewTreeObserver.OnGlobalLayoutListener setHeightFullyInflatedListener = BottomViewGroup$$ExternalSyntheticLambda5.INSTANCE;
    private ViewTreeObserver.OnGlobalLayoutListener setStateFullyInflatedListener = BottomViewGroup$$ExternalSyntheticLambda4.INSTANCE;
    private View shareButton;
    /* access modifiers changed from: private */
    public StateChangeListener stateChangeListener = null;
    private TextView subtitleTextView;
    private TextView titleTextView;
    private boolean uiVisible = false;
    /* access modifiers changed from: private */
    public Types.Visibility visibilityState = Types.Visibility.PEEKING;
    private View visitButton;
    private View visitButtonBackgroundRenderer;
    private ImageView visitImageView;
    private TextView visitTextView;
    private boolean webViewOnlyModeEnabled = false;

    /* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.BottomViewGroup$PositionListener */
    /* compiled from: PG */
    public interface PositionListener {
        void onNewPosition(float f, float f2);
    }

    /* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.BottomViewGroup$StateChangeListener */
    /* compiled from: PG */
    public interface StateChangeListener {
        void onVisibilityStateChanged(Types.Visibility visibility);
    }

    public BottomViewGroup(Context context) {
        super(context);
    }

    private Intent createShareTextIntent(String str) {
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SHARE);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        return Intent.createChooser(intent, (CharSequence) null);
    }

    private int getCardWebViewHeight() {
        if (this.cardWebView.getVisibility() == 8) {
            return 0;
        }
        return this.cardWebView.getHeight();
    }

    /* access modifiers changed from: private */
    public Types.Visibility getStateFromYPos(float f) {
        int top = getTop();
        int height = getHeight() + top;
        int i = this.epsilon;
        if (f > ((float) (height - i))) {
            return Types.Visibility.HIDDEN;
        }
        if (f < ((float) (top + i))) {
            return Types.Visibility.EXPANDED;
        }
        if (f <= ((float) (height - ViewUtilities.dpToPx(getContext(), 96)))) {
            return Types.Visibility.PEEKING;
        }
        return Types.Visibility.COLLAPSED;
    }

    static /* synthetic */ void lambda$new$0() {
    }

    static /* synthetic */ void lambda$new$1() {
    }

    /* access modifiers changed from: private */
    public void onUpdatePosition() {
        float max = Math.max(Math.min((((float) (getBottom() - this.collapsedPeekHeight)) - getY()) / ((float) this.fadeInDistance), 1.0f), 0.0f);
        if (Math.abs(max - getAlpha()) > 0.05f) {
            setAlpha(max);
        }
        PositionListener positionListener2 = this.positionListener;
        if (positionListener2 != null) {
            positionListener2.onNewPosition(getX(), getY());
        }
    }

    private void openLink(Uri uri) {
        Uri outboundLink = UriUtilities.getOutboundLink(uri);
        if (outboundLink != null) {
            if (INTENT_SCHEME.equals(outboundLink.getScheme())) {
                try {
                    Intent parseUri = Intent.parseUri(outboundLink.toString(), 1);
                    if (parseUri != null) {
                        getContext().startActivity(parseUri);
                    }
                } catch (URISyntaxException e) {
                    ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e)).mo56372aa(42333)).mo56386p("Failed to parse intent URI");
                }
            } else {
                ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.OPEN_LINK);
                ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42332)).mo56389s("Opening link: %s", outboundLink);
                new C0963k().mo3582a().mo3590a(getContext(), outboundLink);
            }
        }
    }

    private void relayout(boolean z) {
        if (z != this.relayoutActive) {
            View findViewById = findViewById(C10709R.C10711id.visit_button_group);
            View findViewById2 = findViewById(C10709R.C10711id.title_text_group);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            if (z) {
                layoutParams.removeRule(10);
                layoutParams.addRule(3, C10709R.C10711id.title_text_group);
            } else {
                layoutParams.removeRule(3);
                layoutParams.addRule(10);
            }
            findViewById.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
            if (z) {
                layoutParams2.removeRule(16);
                layoutParams2.addRule(21);
            } else {
                layoutParams2.removeRule(21);
                layoutParams2.addRule(16, C10709R.C10711id.visit_button_group);
            }
            findViewById2.setLayoutParams(layoutParams2);
            this.relayoutActive = z;
        }
    }

    private void setCardWebViewEnabled(boolean z) {
        boolean z2 = false;
        int i = 8;
        if (z && this.cardWebViewLoaded) {
            i = 0;
        }
        this.cardWebView.setVisibility(i);
        this.bottomViewGrabBar.setVisibility(i);
        if ((z && this.cardWebViewLoaded) || this.isLowProfile) {
            z2 = true;
        }
        setDraggable(z2);
        this.cardWebViewEnabled = z;
    }

    public void clear() {
        setVisitButtonText(getResources().getString(C10709R.string.visit_link));
        setVisitButtonColor(getResources().getString(C10709R.color.button_background_color));
        setCardContent((String) null);
        setTitle((String) null);
        setLink(BuildConfig.FLAVOR);
        setShareText((String) null);
    }

    public void enableFlipKartButton(boolean z) {
        int i;
        boolean z2 = this.visitButton.getVisibility() == 0;
        View view = this.visitButton;
        if (view != null && z2) {
            view.setVisibility(8);
        }
        if (z) {
            i = C10709R.C10711id.buy_now_button;
        } else {
            i = C10709R.C10711id.visit_button;
        }
        View findViewById = findViewById(i);
        this.visitButton = findViewById;
        if (findViewById != null && z2) {
            findViewById.setVisibility(0);
        }
    }

    public void enableLowProfile(boolean z) {
        this.isLowProfile = z;
        boolean z2 = true;
        if (!z && !this.cardWebViewLoaded) {
            z2 = false;
        }
        setDraggable(z2, 0);
        setState(this.visibilityState, 0);
    }

    public void enableWebViewOnlyMode(boolean z) {
        ViewGroup viewGroup = this.bottomTextGroup;
        int i = true != z ? 0 : 8;
        viewGroup.setVisibility(i);
        this.bottomViewGrabBar.setVisibility(i);
        setDraggable(!z || this.isLowProfile, 0);
        if (this.cardWebView.getVisibility() != 0) {
            this.cardWebView.setVisibility(0);
        }
        if (z) {
            setBackgroundColor(0);
        } else {
            setBackground(getContext().getDrawable(C10709R.C10710drawable.popup_footer_bg));
        }
        int dimension = (int) getResources().getDimension(C10709R.dimen.bottom_view_bottom_padding);
        int dimension2 = (int) getResources().getDimension(C10709R.dimen.bottom_view_top_padding);
        if (true == z) {
            dimension2 = 0;
        }
        if (true == z) {
            dimension = 0;
        }
        setPadding(0, dimension2, 0, dimension);
        this.cardWebView.enableTransparentMode(z);
        this.webViewOnlyModeEnabled = z;
        onUpdatePosition();
    }

    public CardWebView getCardWebView() {
        return this.cardWebView;
    }

    public int getCollapsedYValue() {
        if (this.bottomViewGrabBar.getVisibility() != 0 || !this.isLowProfile) {
            return getTop() + getCardWebViewHeight();
        }
        return getBottom() - this.collapsedPeekHeight;
    }

    public int getPeekingYValue() {
        return getTop() + Math.max(getCardWebViewHeight() - this.peekHeight, 0);
    }

    public Types.Visibility getState() {
        return this.visibilityState;
    }

    public boolean isCardWebViewEnabled() {
        return this.cardWebViewEnabled;
    }

    public boolean isCardWebViewReady() {
        return this.cardWebView.getVisibility() == 0 && this.cardWebView.isPageLoaded();
    }

    public boolean isLowProfileEnabled() {
        return this.isLowProfile;
    }

    public boolean isReady() {
        if (this.fullyInflated) {
            return this.cardWebViewLoaded || !this.cardWebViewEnabled;
        }
        return false;
    }

    public boolean isWebViewOnlyModeEnabled() {
        return this.webViewOnlyModeEnabled;
    }

    /* renamed from: lambda$new$2$com-google-android-libraries-ar-sceneviewer-infocard-BottomViewGroup */
    public /* synthetic */ void mo18862xa94ea204(ValueAnimator valueAnimator) {
        onUpdatePosition();
    }

    /* renamed from: lambda$onFinishInflate$3$com-google-android-libraries-ar-sceneviewer-infocard-BottomViewGroup */
    public /* synthetic */ void mo18863x2849f4ce(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 != i6) {
            onUpdatePosition();
        }
    }

    /* renamed from: lambda$onFinishInflate$4$com-google-android-libraries-ar-sceneviewer-infocard-BottomViewGroup */
    public /* synthetic */ void mo18864x612a556d() {
        if (this.currentHeight != getHeight()) {
            this.currentHeight = getHeight();
            setState(this.visibilityState, 0);
        }
    }

    /* renamed from: lambda$onFinishInflate$5$com-google-android-libraries-ar-sceneviewer-infocard-BottomViewGroup */
    public /* synthetic */ void mo18865x9a0ab60c(String str, int i) {
        boolean z = true;
        this.cardWebViewLoaded = true;
        boolean z2 = !C58837ba.m90859h(str) && !str.equals("about:blank");
        ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42331)).mo56386p("listened to page finished");
        if (!z2 || i != 0) {
            z = false;
        }
        setCardWebViewEnabled(z);
    }

    /* renamed from: lambda$setLink$6$com-google-android-libraries-ar-sceneviewer-infocard-BottomViewGroup */
    public /* synthetic */ void mo18866x920df8a4(Uri uri, View view) {
        openLink(uri);
    }

    /* renamed from: lambda$setShareText$7$com-google-android-libraries-ar-sceneviewer-infocard-BottomViewGroup */
    public /* synthetic */ void mo18867x40e0b6bb(String str, View view) {
        getContext().startActivity(createShareTextIntent(str));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.titleTextView = (TextView) findViewById(C10709R.C10711id.title_view);
        this.subtitleTextView = (TextView) findViewById(C10709R.C10711id.subtitle_view);
        this.visitButton = findViewById(C10709R.C10711id.visit_button);
        this.visitButtonBackgroundRenderer = findViewById(C10709R.C10711id.visit_button_background_renderer);
        this.visitTextView = (TextView) findViewById(C10709R.C10711id.visit_button_text);
        this.visitImageView = (ImageView) findViewById(C10709R.C10711id.visit_button_image);
        this.shareButton = findViewById(C10709R.C10711id.share_button);
        this.cardWebView = (CardWebView) findViewById(C10709R.C10711id.card_web_view);
        this.bottomViewGrabBar = (ImageView) findViewById(C10709R.C10711id.bottom_view_grab_bar);
        this.bottomTextGroup = (ViewGroup) findViewById(C10709R.C10711id.bottom_text_group);
        getViewTreeObserver().addOnGlobalLayoutListener(new C10714b(this));
        addOnLayoutChangeListener(new BottomViewGroup$$ExternalSyntheticLambda0(this));
        this.cardWebView.getViewTreeObserver().addOnGlobalLayoutListener(new BottomViewGroup$$ExternalSyntheticLambda1(this));
        this.cardWebView.addPageLoadListener(new BottomViewGroup$$ExternalSyntheticLambda2(this));
        setOnTouchListener(new C10715c(this));
    }

    public void setAgsaVersion(String str) {
        if (str != null) {
            this.cardWebView.setGsaVersionName(str);
        }
    }

    public void setCardContent(String str) {
        if (C58837ba.m90859h(str)) {
            this.cardWebView.stopLoading();
            setCardWebViewEnabled(false);
            return;
        }
        this.cardWebView.stopLoading();
        this.cardWebView.loadUrl(str);
    }

    public void setCardWebView(CardWebView cardWebView2) {
        this.cardWebView = cardWebView2;
    }

    public void setDraggable(boolean z) {
        setDraggable(z, UI_ANIMATION_DURATION_MS);
    }

    public void setHeight(int i) {
        if (!this.fullyInflated) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.setHeightFullyInflatedListener);
            this.setHeightFullyInflatedListener = new C10716d(this, i);
            getViewTreeObserver().addOnGlobalLayoutListener(this.setHeightFullyInflatedListener);
            return;
        }
        int dpToPx = ViewUtilities.dpToPx(getContext(), i);
        int top = getTop();
        int height = getHeight() + top;
        int i2 = height - dpToPx;
        if (dpToPx <= 0) {
            top = height - 1;
        } else if (i2 > top) {
            top = i2;
        }
        float f = (float) top;
        Types.Visibility stateFromYPos = getStateFromYPos(f);
        this.visibilityState = stateFromYPos;
        StateChangeListener stateChangeListener2 = this.stateChangeListener;
        if (stateChangeListener2 != null) {
            stateChangeListener2.onVisibilityStateChanged(stateFromYPos);
        }
        ViewPropertyAnimator updateListener = animate().setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(300).y(f).setListener(this.animatorListener).setUpdateListener(this.animatorUpdateListener);
        this.currentAnimator = updateListener;
        updateListener.start();
    }

    public void setLink(Uri uri) {
        String host = UriUtilities.getHost(uri);
        if (host != null) {
            this.subtitleTextView.setText(host);
            this.subtitleTextView.setVisibility(0);
            this.visitButton.setOnClickListener(new BottomViewGroup$$ExternalSyntheticLambda3(this, uri));
            this.visitButton.setVisibility(0);
            return;
        }
        this.visitButton.setVisibility(8);
        this.subtitleTextView.setVisibility(8);
    }

    public void setPositionListener(PositionListener positionListener2) {
        this.positionListener = positionListener2;
    }

    public void setShareText(String str) {
        if (this.shareButton != null) {
            if (str == null || str.isEmpty()) {
                this.shareButton.setVisibility(8);
                return;
            }
            this.shareButton.setVisibility(0);
            this.shareButton.setOnClickListener(new BottomViewGroup$$ExternalSyntheticLambda7(this, str));
        }
    }

    public void setState(Types.Visibility visibility) {
        setState(visibility, UI_ANIMATION_DURATION_MS);
    }

    public void setStateChangeListener(StateChangeListener stateChangeListener2) {
        this.stateChangeListener = stateChangeListener2;
    }

    public void setStreamingMode(boolean z) {
        this.isStreamingMode = z;
        setState(this.visibilityState, 0);
    }

    public void setSubtitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.subtitleTextView.setVisibility(8);
            return;
        }
        this.subtitleTextView.setVisibility(0);
        this.subtitleTextView.setText(str);
    }

    public void setTitle(String str) {
        if (str != null) {
            this.titleTextView.setText(Html.fromHtml(str));
            this.titleTextView.setVisibility(0);
            return;
        }
        this.titleTextView.setVisibility(8);
    }

    public void setUiVisible(boolean z, int i) {
        this.uiVisible = z;
        setState(z ? Types.Visibility.PEEKING : Types.Visibility.HIDDEN, i);
    }

    public void setVisitButtonColor(String str) {
        if (!TextUtils.isEmpty(str) && this.visitButton != null) {
            try {
                int parseColor = Color.parseColor(str);
                Drawable drawable = getContext().getDrawable(C10709R.C10710drawable.round_button_bg);
                if (drawable != null) {
                    int[][] iArr = {new int[]{-16842919}, new int[]{16842919}};
                    float[] fArr = new float[3];
                    Color.colorToHSV(parseColor, fArr);
                    if (fArr[2] <= 0.75f || fArr[1] >= 0.5f) {
                        this.visitTextView.setTextColor(-1);
                    } else {
                        this.visitTextView.setTextColor(-12303292);
                    }
                    fArr[2] = fArr[2] * 0.8f;
                    drawable.setTintList(new ColorStateList(iArr, new int[]{parseColor, Color.HSVToColor(fArr)}));
                    this.visitButtonBackgroundRenderer.setBackground(drawable);
                }
            } catch (IllegalArgumentException unused) {
                ((C59052c) ((C59052c) logger.mo56226d()).mo56372aa(42335)).mo56386p("setVisitButtonColor called with invalid color string");
            }
        }
    }

    public void setVisitButtonText(String str) {
        if (!TextUtils.isEmpty(str) && this.visitTextView != null) {
            ImageView imageView = this.visitImageView;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.visitTextView.setText(str);
            relayout(str.length() > 16);
            int dimensionPixelSize = getResources().getDimensionPixelSize(C10709R.dimen.visit_button_padding);
            this.visitTextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
    }

    private void setDraggable(boolean z, int i) {
        this.draggingEnabled = z;
        AnimationUtilities.animateVisibility(this.bottomViewGrabBar, z, i);
    }

    public void setState(Types.Visibility visibility, int i) {
        int i2;
        Types.Visibility visibility2;
        if (!this.fullyInflated) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.setStateFullyInflatedListener);
            this.setStateFullyInflatedListener = new C10717e(this, visibility, i);
            getViewTreeObserver().addOnGlobalLayoutListener(this.setStateFullyInflatedListener);
        } else if (this.uiVisible || visibility == Types.Visibility.HIDDEN) {
            if (!Types.Visibility.HIDDEN.equals(visibility) && (this.cardWebView.getVisibility() != 0 || !this.cardWebView.isPageLoaded())) {
                visibility = Types.Visibility.COLLAPSED;
            }
            if (Types.Visibility.PEEKING.equals(visibility) && this.isLowProfile) {
                visibility = Types.Visibility.COLLAPSED;
            }
            if (this.isStreamingMode) {
                visibility = Types.Visibility.HIDDEN;
            }
            int ordinal = visibility.ordinal();
            if (ordinal == 1) {
                i2 = getTop();
            } else if (ordinal == 2) {
                i2 = getPeekingYValue();
            } else if (ordinal == 3) {
                i2 = getCollapsedYValue();
            } else if (ordinal == 5) {
                i2 = (getTop() + getHeight()) - 1;
            } else {
                return;
            }
            float f = (float) i2;
            ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                this.currentAnimator = null;
            }
            if (i == 0) {
                setY(f);
                onUpdatePosition();
            } else {
                ViewPropertyAnimator updateListener = animate().setInterpolator(new AccelerateDecelerateInterpolator()).setDuration((long) i).y(f).setListener(this.animatorListener).setUpdateListener(this.animatorUpdateListener);
                this.currentAnimator = updateListener;
                updateListener.start();
            }
            StateChangeListener stateChangeListener2 = this.stateChangeListener;
            if (!(stateChangeListener2 == null || (visibility2 = this.visibilityState) == visibility)) {
                stateChangeListener2.onVisibilityStateChanged(visibility2);
            }
            this.visibilityState = visibility;
        } else {
            ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42334)).mo56386p("Attempting to set Visibility when UI is not visible, ignoring.");
        }
    }

    public BottomViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setLink(String str) {
        if (TextUtils.isEmpty(str)) {
            setLink(Uri.EMPTY);
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse.getHost() == null || parse.getScheme() == null) {
            setSubtitle(str);
        } else {
            setLink(parse);
        }
    }

    public BottomViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
