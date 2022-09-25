package com.android.launcher3;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import com.android.launcher3.FastBitmapDrawable;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class PendingAppWidgetHostView extends LauncherAppWidgetHostView implements View.OnClickListener {
    private static Resources.Theme sPreloaderTheme;
    private Drawable mCenterDrawable;
    private View.OnClickListener mClickListener;
    private View mDefaultView;
    private final boolean mDisabledForSafeMode;
    private boolean mDrawableSizeChanged;
    private Bitmap mIcon;
    private final Intent mIconLookupIntent;
    private final LauncherAppWidgetInfo mInfo;
    private final Launcher mLauncher;
    private final TextPaint mPaint;
    private final Rect mRect = new Rect();
    private Drawable mSettingIconDrawable;
    private Layout mSetupTextLayout;
    private final int mStartState;

    public PendingAppWidgetHostView(Context context, LauncherAppWidgetInfo launcherAppWidgetInfo, boolean z) {
        super(context);
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        this.mInfo = launcherAppWidgetInfo;
        this.mStartState = launcherAppWidgetInfo.restoreStatus;
        this.mIconLookupIntent = new Intent().setComponent(launcherAppWidgetInfo.providerName);
        this.mDisabledForSafeMode = z;
        TextPaint textPaint = new TextPaint();
        this.mPaint = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(0, (float) launcher.mDeviceProfile.iconTextSizePx, getResources().getDisplayMetrics()));
        setBackgroundResource(R.drawable.quantum_panel_dark);
        setWillNotDraw(false);
        if (Utilities.ATLEAST_LOLLIPOP) {
            setElevation(getResources().getDimension(R.dimen.pending_widget_elevation));
        }
    }

    public final void applyState() {
        Drawable drawable = this.mCenterDrawable;
        if (drawable != null) {
            drawable.setLevel(Math.max(this.mInfo.installProgress, 0));
        }
    }

    /* access modifiers changed from: protected */
    public final View getDefaultView() {
        if (this.mDefaultView == null) {
            View inflate = this.mInflater.inflate(R.layout.appwidget_not_ready, this, false);
            this.mDefaultView = inflate;
            inflate.setOnClickListener(this);
            applyState();
        }
        return this.mDefaultView;
    }

    public final boolean isReadyForClickSetup() {
        int i = this.mInfo.restoreStatus;
        return (i & 2) == 0 && (i & 4) != 0;
    }

    public final boolean isReinflateRequired() {
        return this.mStartState != this.mInfo.restoreStatus;
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.mClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            android.graphics.drawable.Drawable r2 = r0.mCenterDrawable
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r2 = r0.mDrawableSizeChanged
            if (r2 == 0) goto L_0x0161
            com.android.launcher3.Launcher r2 = r0.mLauncher
            com.android.launcher3.DeviceProfile r2 = r2.mDeviceProfile
            int r3 = r22.getPaddingTop()
            int r4 = r22.getPaddingBottom()
            int r5 = r22.getPaddingLeft()
            int r6 = r22.getPaddingRight()
            android.content.res.Resources r7 = r22.getResources()
            r8 = 2131171145(0x7f071749, float:1.7956668E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r8 = r7 + r7
            int r9 = r22.getWidth()
            int r9 = r9 - r5
            int r9 = r9 - r6
            int r13 = r9 - r8
            int r6 = r22.getHeight()
            int r6 = r6 - r3
            int r6 = r6 - r4
            int r6 = r6 - r8
            android.graphics.drawable.Drawable r4 = r0.mSettingIconDrawable
            r8 = 0
            if (r4 != 0) goto L_0x008d
            android.graphics.drawable.Drawable r3 = r0.mCenterDrawable
            boolean r4 = r3 instanceof com.android.launcher3.PreloadIconDrawable
            if (r4 == 0) goto L_0x004d
            com.android.launcher3.PreloadIconDrawable r3 = (com.android.launcher3.PreloadIconDrawable) r3
            int r3 = r3.mRingOutset
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            int r2 = r2.iconSizePx
            int r4 = r3 + r3
            int r2 = r2 + r4
            int r4 = java.lang.Math.min(r13, r6)
            int r2 = java.lang.Math.min(r2, r4)
            android.graphics.Rect r4 = r0.mRect
            r4.set(r8, r8, r2, r2)
            android.graphics.Rect r2 = r0.mRect
            r2.inset(r3, r3)
            android.graphics.Rect r2 = r0.mRect
            int r3 = r22.getWidth()
            android.graphics.Rect r4 = r0.mRect
            int r4 = r4.width()
            int r3 = r3 - r4
            int r3 = r3 / 2
            int r4 = r22.getHeight()
            android.graphics.Rect r5 = r0.mRect
            int r5 = r5.height()
            int r4 = r4 - r5
            int r4 = r4 / 2
            r2.offsetTo(r3, r4)
            android.graphics.drawable.Drawable r2 = r0.mCenterDrawable
            android.graphics.Rect r3 = r0.mRect
            r2.setBounds(r3)
            goto L_0x015e
        L_0x008d:
            int r4 = java.lang.Math.min(r13, r6)
            int r4 = java.lang.Math.max(r8, r4)
            float r4 = (float) r4
            int r9 = java.lang.Math.max(r13, r6)
            float r9 = (float) r9
            r18 = 1072064102(0x3fe66666, float:1.8)
            float r10 = r4 * r18
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a6
            float r4 = r9 / r18
        L_0x00a6:
            int r9 = r2.iconSizePx
            float r9 = (float) r9
            float r4 = java.lang.Math.min(r4, r9)
            int r4 = (int) r4
            int r9 = r22.getHeight()
            int r9 = r9 - r4
            int r9 = r9 / 2
            r15 = 0
            r0.mSetupTextLayout = r15
            if (r13 <= 0) goto L_0x0104
            android.text.StaticLayout r14 = new android.text.StaticLayout
            android.content.res.Resources r10 = r22.getResources()
            r11 = 2132087017(0x7f1510e9, float:1.9814277E38)
            java.lang.CharSequence r11 = r10.getText(r11)
            android.text.TextPaint r12 = r0.mPaint
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_CENTER
            r17 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 1
            r10 = r14
            r8 = r14
            r14 = r16
            r21 = r9
            r9 = r15
            r15 = r17
            r16 = r19
            r17 = r20
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r0.mSetupTextLayout = r8
            int r8 = r8.getHeight()
            float r10 = (float) r8
            float r11 = (float) r4
            float r11 = r11 * r18
            float r10 = r10 + r11
            int r11 = r2.iconDrawablePaddingPx
            float r11 = (float) r11
            float r10 = r10 + r11
            float r6 = (float) r6
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0101
            int r6 = r22.getHeight()
            int r6 = r6 - r8
            int r8 = r2.iconDrawablePaddingPx
            int r6 = r6 - r8
            int r6 = r6 - r4
            int r9 = r6 / 2
            goto L_0x0108
        L_0x0101:
            r0.mSetupTextLayout = r9
            goto L_0x0106
        L_0x0104:
            r21 = r9
        L_0x0106:
            r9 = r21
        L_0x0108:
            android.graphics.Rect r6 = r0.mRect
            r8 = 0
            r6.set(r8, r8, r4, r4)
            android.graphics.Rect r6 = r0.mRect
            int r8 = r22.getWidth()
            int r8 = r8 - r4
            int r8 = r8 / 2
            r6.offset(r8, r9)
            android.graphics.drawable.Drawable r6 = r0.mCenterDrawable
            android.graphics.Rect r8 = r0.mRect
            r6.setBounds(r8)
            int r5 = r5 + r7
            android.graphics.Rect r6 = r0.mRect
            r6.left = r5
            android.graphics.Rect r6 = r0.mRect
            float r4 = (float) r4
            r8 = 1053609165(0x3ecccccd, float:0.4)
            float r4 = r4 * r8
            int r4 = (int) r4
            int r8 = r6.left
            int r8 = r8 + r4
            r6.right = r8
            android.graphics.Rect r6 = r0.mRect
            int r3 = r3 + r7
            r6.top = r3
            android.graphics.Rect r3 = r0.mRect
            int r6 = r3.top
            int r6 = r6 + r4
            r3.bottom = r6
            android.graphics.drawable.Drawable r3 = r0.mSettingIconDrawable
            android.graphics.Rect r4 = r0.mRect
            r3.setBounds(r4)
            android.text.Layout r3 = r0.mSetupTextLayout
            if (r3 == 0) goto L_0x015e
            android.graphics.Rect r3 = r0.mRect
            r3.left = r5
            android.graphics.Rect r3 = r0.mRect
            android.graphics.drawable.Drawable r4 = r0.mCenterDrawable
            android.graphics.Rect r4 = r4.getBounds()
            int r4 = r4.bottom
            int r2 = r2.iconDrawablePaddingPx
            int r4 = r4 + r2
            r3.top = r4
        L_0x015e:
            r2 = 0
            r0.mDrawableSizeChanged = r2
        L_0x0161:
            android.graphics.drawable.Drawable r2 = r0.mCenterDrawable
            r2.draw(r1)
            android.graphics.drawable.Drawable r2 = r0.mSettingIconDrawable
            if (r2 == 0) goto L_0x016d
            r2.draw(r1)
        L_0x016d:
            android.text.Layout r2 = r0.mSetupTextLayout
            if (r2 == 0) goto L_0x0189
            r23.save()
            android.graphics.Rect r2 = r0.mRect
            int r2 = r2.left
            float r2 = (float) r2
            android.graphics.Rect r3 = r0.mRect
            int r3 = r3.top
            float r3 = (float) r3
            r1.translate(r2, r3)
            android.text.Layout r2 = r0.mSetupTextLayout
            r2.draw(r1)
            r23.restore()
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.PendingAppWidgetHostView.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mDrawableSizeChanged = true;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
    }

    public final void updateAppWidgetSize(Bundle bundle, int i, int i2, int i3, int i4) {
    }

    public final void updateIcon(IconCache iconCache) {
        Bitmap icon = iconCache.getIcon(this.mIconLookupIntent, this.mInfo.user);
        if (this.mIcon != icon) {
            this.mIcon = icon;
            Drawable drawable = this.mCenterDrawable;
            if (drawable != null) {
                drawable.setCallback((Drawable.Callback) null);
                this.mCenterDrawable = null;
            }
            Bitmap bitmap = this.mIcon;
            if (bitmap != null) {
                if (this.mDisabledForSafeMode) {
                    FastBitmapDrawable createIconDrawable = this.mLauncher.createIconDrawable(bitmap);
                    createIconDrawable.setState(FastBitmapDrawable.State.DISABLED);
                    this.mCenterDrawable = createIconDrawable;
                    this.mSettingIconDrawable = null;
                } else if (isReadyForClickSetup()) {
                    this.mCenterDrawable = new FastBitmapDrawable(this.mIcon);
                    this.mSettingIconDrawable = getResources().getDrawable(R.drawable.ic_setting).mutate();
                    float[] fArr = new float[3];
                    Color.colorToHSV(Utilities.findDominantColorByHue$ar$ds(this.mIcon), fArr);
                    fArr[1] = Math.min(fArr[1], 0.7f);
                    fArr[2] = 1.0f;
                    this.mSettingIconDrawable.setColorFilter(Color.HSVToColor(fArr), PorterDuff.Mode.SRC_IN);
                } else {
                    if (sPreloaderTheme == null) {
                        Resources.Theme newTheme = getResources().newTheme();
                        sPreloaderTheme = newTheme;
                        newTheme.applyStyle(R.style.PreloadIcon, true);
                    }
                    PreloadIconDrawable preloadIconDrawable = new PreloadIconDrawable(this.mLauncher.createIconDrawable(this.mIcon), sPreloaderTheme);
                    this.mCenterDrawable = preloadIconDrawable;
                    preloadIconDrawable.setCallback(this);
                    this.mSettingIconDrawable = null;
                    applyState();
                }
                this.mDrawableSizeChanged = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.mCenterDrawable || super.verifyDrawable(drawable);
    }
}
