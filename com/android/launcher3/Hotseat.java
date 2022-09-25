package com.android.launcher3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.Stats;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class Hotseat extends FrameLayout implements Stats.LaunchSourceProvider {
    private int mAllAppsButtonRank;
    public CellLayout mContent;
    private final boolean mHasVerticalHotseat;
    private Launcher mLauncher;

    public Hotseat(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void fillInLaunchSourceData(View view, Bundle bundle) {
        bundle.putString("container", "hotseat");
    }

    /* access modifiers changed from: package-private */
    public final int getCellXFromOrder(int i) {
        if (this.mHasVerticalHotseat) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int getCellYFromOrder(int i) {
        if (this.mHasVerticalHotseat) {
            return this.mContent.mCountY - (i + 1);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int getOrderInHotseat(int i, int i2) {
        return this.mHasVerticalHotseat ? (this.mContent.mCountY - i2) - 1 : i;
    }

    public final boolean isAllAppsButtonRank(int i) {
        return i == this.mAllAppsButtonRank;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        this.mAllAppsButtonRank = deviceProfile.inv.hotseatAllAppsRank;
        this.mContent = (CellLayout) findViewById(R.id.layout);
        if (!deviceProfile.isLandscape || deviceProfile.isLargeTablet) {
            this.mContent.setGridSize(deviceProfile.inv.numHotseatIcons, 1);
        } else {
            this.mContent.setGridSize(1, deviceProfile.inv.numHotseatIcons);
        }
        CellLayout cellLayout = this.mContent;
        cellLayout.mIsHotseat = true;
        cellLayout.mShortcutsAndWidgets.mContainerType = 1;
        cellLayout.mChildScale = cellLayout.mHotseatScale;
        resetLayout();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mLauncher.mWorkspace.workspaceInModalState();
    }

    /* access modifiers changed from: package-private */
    public final void resetLayout() {
        this.mContent.removeAllViewsInLayout();
        Context context = getContext();
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.all_apps_button, this.mContent, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.all_apps_button_icon);
        this.mLauncher.resizeIconDrawable$ar$ds(drawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.all_apps_button_scale_down);
        Rect bounds = drawable.getBounds();
        int i = dimensionPixelSize / 2;
        drawable.setBounds(bounds.left, bounds.top + i, bounds.right - dimensionPixelSize, bounds.bottom - i);
        textView.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        textView.setContentDescription(context.getString(R.string.all_apps_button_label));
        textView.setOnKeyListener(new HotseatIconKeyEventListener());
        Launcher launcher = this.mLauncher;
        if (launcher != null) {
            launcher.mAllAppsButton = textView;
            textView.setOnTouchListener(launcher.getHapticFeedbackTouchListener());
            textView.setOnClickListener(this.mLauncher);
            textView.setOnLongClickListener(this.mLauncher);
            textView.setOnFocusChangeListener(this.mLauncher.mFocusHandler);
        }
        int i2 = this.mAllAppsButtonRank;
        CellLayout.LayoutParams layoutParams = new CellLayout.LayoutParams(getCellXFromOrder(i2), getCellYFromOrder(i2), 1, 1);
        layoutParams.canReorder = false;
        this.mContent.addViewToCellLayout(textView, -1, textView.getId(), layoutParams, true);
    }

    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mContent.setOnLongClickListener(onLongClickListener);
    }

    public Hotseat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Hotseat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        this.mHasVerticalHotseat = launcher.mDeviceProfile.isVerticalBarLayout();
    }
}
