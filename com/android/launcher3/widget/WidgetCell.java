package com.android.launcher3.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.launcher3.BaseActivity;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.StylusEventHelper;
import com.android.launcher3.Utilities;
import com.android.launcher3.WidgetPreviewLoader;
import com.android.launcher3.compat.AppWidgetManagerCompat;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class WidgetCell extends LinearLayout implements View.OnLayoutChangeListener {
    public WidgetPreviewLoader.PreviewLoadRequest mActiveRequest;
    private BaseActivity mActivity;
    private int mCellSize;
    private String mDimensionsFormatString;
    private Object mInfo;
    private int mPresetPreviewSize;
    private StylusEventHelper mStylusEventHelper;
    public TextView mWidgetDims;
    public WidgetImageView mWidgetImage;
    public TextView mWidgetName;
    private WidgetPreviewLoader mWidgetPreviewLoader;

    public WidgetCell(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void applyFromAppWidgetProviderInfo(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, WidgetPreviewLoader widgetPreviewLoader) {
        InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
        this.mInfo = launcherAppWidgetProviderInfo;
        this.mWidgetName.setText(AppWidgetManagerCompat.getInstance(getContext()).loadLabel(launcherAppWidgetProviderInfo));
        int min = Math.min(launcherAppWidgetProviderInfo.spanX, invariantDeviceProfile.numColumns);
        int min2 = Math.min(launcherAppWidgetProviderInfo.spanY, invariantDeviceProfile.numRows);
        this.mWidgetDims.setText(String.format(this.mDimensionsFormatString, new Object[]{Integer.valueOf(min), Integer.valueOf(min2)}));
        this.mWidgetPreviewLoader = widgetPreviewLoader;
    }

    public final void applyFromShortcutInfo(ShortcutConfigActivityInfo shortcutConfigActivityInfo, WidgetPreviewLoader widgetPreviewLoader) {
        this.mInfo = shortcutConfigActivityInfo;
        this.mWidgetName.setText(shortcutConfigActivityInfo.getLabel());
        this.mWidgetDims.setText(String.format(this.mDimensionsFormatString, new Object[]{1, 1}));
        this.mWidgetPreviewLoader = widgetPreviewLoader;
    }

    public final void applyPreview(Bitmap bitmap) {
        if (bitmap != null) {
            WidgetImageView widgetImageView = this.mWidgetImage;
            widgetImageView.mBitmap = bitmap;
            widgetImageView.invalidate();
            this.mWidgetImage.setAlpha(0.0f);
            this.mWidgetImage.animate().alpha(1.0f).setDuration(90);
        }
    }

    public final void ensurePreview() {
        WidgetPreviewLoader.WidgetCacheKey widgetCacheKey;
        if (this.mActiveRequest == null) {
            int[] previewSize = getPreviewSize();
            WidgetPreviewLoader widgetPreviewLoader = this.mWidgetPreviewLoader;
            Object obj = this.mInfo;
            int i = previewSize[0];
            int i2 = previewSize[1];
            String str = i + "x" + i2;
            if (obj instanceof LauncherAppWidgetProviderInfo) {
                LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo = (LauncherAppWidgetProviderInfo) obj;
                widgetCacheKey = new WidgetPreviewLoader.WidgetCacheKey(launcherAppWidgetProviderInfo.provider, widgetPreviewLoader.mWidgetManager.getUser(launcherAppWidgetProviderInfo), str);
            } else {
                ShortcutConfigActivityInfo shortcutConfigActivityInfo = (ShortcutConfigActivityInfo) obj;
                widgetCacheKey = new WidgetPreviewLoader.WidgetCacheKey(shortcutConfigActivityInfo.getComponent(), shortcutConfigActivityInfo.getUser(), str);
            }
            WidgetPreviewLoader.PreviewLoadTask previewLoadTask = new WidgetPreviewLoader.PreviewLoadTask(widgetCacheKey, obj, i, i2, this);
            previewLoadTask.executeOnExecutor(Utilities.THREAD_POOL_EXECUTOR, new Void[0]);
            this.mActiveRequest = new WidgetPreviewLoader.PreviewLoadRequest(previewLoadTask);
        }
    }

    public final int[] getPreviewSize() {
        int i = this.mPresetPreviewSize;
        return new int[]{i, i};
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.mWidgetImage = (WidgetImageView) findViewById(R.id.widget_preview);
        this.mWidgetName = (TextView) findViewById(R.id.widget_name);
        this.mWidgetDims = (TextView) findViewById(R.id.widget_dims);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        removeOnLayoutChangeListener(this);
        ensurePreview();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.mStylusEventHelper.checkAndPerformStylusEvent(motionEvent)) {
            return true;
        }
        return onTouchEvent;
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        int i = this.mCellSize;
        layoutParams.height = i;
        layoutParams.width = i;
        super.setLayoutParams(layoutParams);
    }

    public WidgetCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.mActivity = BaseActivity.fromContext(context);
        this.mStylusEventHelper = new StylusEventHelper(this);
        this.mDimensionsFormatString = resources.getString(R.string.widget_dims_format);
        int i2 = (int) (((float) this.mActivity.mDeviceProfile.cellWidthPx) * 2.6f);
        this.mCellSize = i2;
        this.mPresetPreviewSize = (int) (((float) i2) * 0.8f);
        setWillNotDraw(false);
        setClipToPadding(false);
        setAccessibilityDelegate(LauncherAppState.getInstance().mAccessibilityDelegate);
    }
}
