package com.android.launcher3.shortcuts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.LogAccelerateInterpolator;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.shortcuts.DeepShortcutsContainer;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import com.android.launcher3.util.PillRevealOutlineProvider;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public class DeepShortcutView extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final Point sTempPoint = new Point();
    public DeepShortcutTextView mBubbleText;
    public View mIconView;
    public DeepShortcutsContainer.UnbadgedShortcutInfo mInfo;
    public float mOpenAnimationProgress;
    public final Rect mPillRect;

    /* compiled from: PG */
    final class CloseInterpolator extends LogAccelerateInterpolator {
        private final float mRemainingProgress;
        private final float mStartProgress;

        public CloseInterpolator(float f) {
            this.mStartProgress = 1.0f - f;
            this.mRemainingProgress = f;
        }

        public final float getInterpolation(float f) {
            return this.mStartProgress + (super.getInterpolation(f) * this.mRemainingProgress);
        }
    }

    /* compiled from: PG */
    final class ZoomRevealOutlineProvider extends PillRevealOutlineProvider {
        private final float mFullHeight;
        private final boolean mPivotLeft;
        private final View mTranslateView;
        private final float mTranslateX;
        private final float mTranslateYMultiplier;
        private final View mZoomView;

        public ZoomRevealOutlineProvider(int i, int i2, Rect rect, View view, View view2, boolean z, boolean z2) {
            super(i, i2, rect);
            this.mTranslateView = view;
            this.mZoomView = view2;
            this.mFullHeight = (float) rect.height();
            this.mTranslateYMultiplier = true != z ? -0.5f : 0.5f;
            this.mPivotLeft = z2;
            this.mTranslateX = (float) (z2 ? rect.height() / 2 : rect.right - (rect.height() / 2));
        }

        public final void setProgress(float f) {
            super.setProgress(f);
            this.mZoomView.setScaleX(f);
            this.mZoomView.setScaleY(f);
            float height = (float) this.mOutline.height();
            this.mTranslateView.setTranslationY(this.mTranslateYMultiplier * (this.mFullHeight - height));
            this.mTranslateView.setTranslationX(this.mTranslateX - (this.mPivotLeft ? ((float) this.mOutline.left) + (height / 2.0f) : ((float) this.mOutline.right) - (height / 2.0f)));
        }
    }

    public DeepShortcutView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public final ShortcutInfo getFinalInfo() {
        ShortcutInfo shortcutInfo = new ShortcutInfo((ShortcutInfo) this.mInfo);
        LauncherModel.sWorker.post(new Runnable(shortcutInfo, this.mInfo.mDetail) {
            final /* synthetic */ ShortcutInfoCompat val$fullDetail;
            final /* synthetic */ ShortcutInfo val$info;

            {
                this.val$info = r2;
                this.val$fullDetail = r3;
            }

            public final void run() {
                ShortcutInfo shortcutInfo = this.val$info;
                ShortcutInfoCompat shortcutInfoCompat = this.val$fullDetail;
                LauncherAppState.getInstance();
                shortcutInfo.updateFromDeepShortcutInfo(shortcutInfoCompat, LauncherAppState.sContext);
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.val$info);
                LauncherModel.this.bindUpdatedShortcuts(arrayList, this.val$fullDetail.getUserHandle());
            }
        });
        return shortcutInfo;
    }

    public final Point getIconCenter() {
        Point point = sTempPoint;
        int measuredHeight = getMeasuredHeight() / 2;
        point.x = measuredHeight;
        point.y = measuredHeight;
        if (Utilities.isRtl(getResources())) {
            point.x = getMeasuredWidth() - point.x;
        }
        return point;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.mOpenAnimationProgress = valueAnimator.getAnimatedFraction();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.mIconView = findViewById(R.id.deep_shortcut_icon);
        this.mBubbleText = (DeepShortcutTextView) findViewById(R.id.deep_shortcut);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.mPillRect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public DeepShortcutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DeepShortcutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPillRect = new Rect();
    }
}
