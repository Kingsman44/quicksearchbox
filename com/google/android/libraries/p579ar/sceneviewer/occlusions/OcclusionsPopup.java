package com.google.android.libraries.p579ar.sceneviewer.occlusions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ViewUtilities;

/* renamed from: com.google.android.libraries.ar.sceneviewer.occlusions.OcclusionsPopup */
/* compiled from: PG */
public final class OcclusionsPopup extends LinearLayout {
    private static final String HAS_SEEN_OCCLUSIONS_POPUP_KEY = "has_seen_occlusions_popup";
    private static final String SHARED_PREFERENCES = "ARCore.Sceneviewer.viewer_activity";
    private boolean hasCheckedOcclusionsPopupKeyThisSession = false;
    /* access modifiers changed from: private */
    public boolean isReady = false;
    private View occlusionsPopupArrow;
    private View occlusionsPopupArrowSpacing;
    /* access modifiers changed from: private */
    public View targetView;

    public OcclusionsPopup(Context context) {
        super(context);
    }

    private void showWhenReady() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C10745a(this));
    }

    /* renamed from: lambda$onFinishInflate$0$com-google-android-libraries-ar-sceneviewer-occlusions-OcclusionsPopup */
    public /* synthetic */ void mo19137xfe49d550(View view) {
        getContext().getSharedPreferences(SHARED_PREFERENCES, 0).edit().putBoolean(HAS_SEEN_OCCLUSIONS_POPUP_KEY, true).commit();
        setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.occlusionsPopupArrowSpacing = findViewById(C10742R.C10744id.arrow_spacing);
        this.occlusionsPopupArrow = findViewById(C10742R.C10744id.occlusions_popup_arrow);
        showWhenReady();
        findViewById(C10742R.C10744id.occlusions_popup_dismiss).setOnClickListener(new OcclusionsPopup$$ExternalSyntheticLambda0(this));
    }

    public void pointAt(View view) {
        ViewGroup.LayoutParams layoutParams = this.occlusionsPopupArrowSpacing.getLayoutParams();
        layoutParams.width = (int) (((float) (ViewUtilities.getBoundingRect(this).right - (this.occlusionsPopupArrow.getWidth() / 2))) - ((float) ViewUtilities.getBoundingRect(view).centerX()));
        this.occlusionsPopupArrowSpacing.setLayoutParams(layoutParams);
    }

    public void show(View view) {
        this.targetView = view;
        if (!this.isReady) {
            showWhenReady();
            return;
        }
        setVisibility(4);
        pointAt(view);
        setVisibility(0);
        this.hasCheckedOcclusionsPopupKeyThisSession = true;
    }

    public void showIfApplicable(View view) {
        if (!this.hasCheckedOcclusionsPopupKeyThisSession && !getContext().getSharedPreferences(SHARED_PREFERENCES, 0).getBoolean(HAS_SEEN_OCCLUSIONS_POPUP_KEY, false)) {
            show(view);
        }
    }

    public OcclusionsPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OcclusionsPopup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
