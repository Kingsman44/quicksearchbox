package com.android.launcher3.allapps;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.ClickShadowView;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.Launcher;

/* compiled from: PG */
public class AllAppsRecyclerViewContainerView extends FrameLayout implements BubbleTextView.BubbleTextShadowHandler {
    private final ClickShadowView mTouchFeedbackView;

    public AllAppsRecyclerViewContainerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void setPressedIcon(BubbleTextView bubbleTextView, Bitmap bitmap) {
        if (bitmap == null) {
            this.mTouchFeedbackView.setBitmap((Bitmap) null);
            this.mTouchFeedbackView.animate().cancel();
        } else if (this.mTouchFeedbackView.setBitmap(bitmap)) {
            this.mTouchFeedbackView.alignWithIconView(bubbleTextView, (ViewGroup) bubbleTextView.getParent());
            this.mTouchFeedbackView.animateShadow();
        }
    }

    public AllAppsRecyclerViewContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AllAppsRecyclerViewContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DeviceProfile deviceProfile = Launcher.getLauncher(context).mDeviceProfile;
        ClickShadowView clickShadowView = new ClickShadowView(context);
        this.mTouchFeedbackView = clickShadowView;
        int extraSize = deviceProfile.allAppsIconSizePx + clickShadowView.getExtraSize();
        addView(clickShadowView, extraSize, extraSize);
    }
}
