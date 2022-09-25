package com.android.launcher3;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.android.launcher3.BaseRecyclerViewFastScrollBar;
import com.android.launcher3.FastBitmapDrawable;
import com.android.launcher3.IconCache;
import com.android.launcher3.model.PackageItemInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.text.NumberFormat;

/* compiled from: PG */
public class BubbleTextView extends TextView implements BaseRecyclerViewFastScrollBar.FastScrollFocusableView {
    private static SparseArray sPreloaderThemes = new SparseArray(2);
    private final Drawable mBackground;
    private boolean mBackgroundSizeChanged;
    private final boolean mCustomShadowsEnabled;
    private final boolean mDeferShadowGenerationOnTouch;
    public boolean mDisableRelayout;
    public Drawable mIcon;
    public IconCache.IconLoadRequest mIconLoadRequest;
    private final int mIconSize;
    private boolean mIgnorePressedStateChange;
    public final Launcher mLauncher;
    private final boolean mLayoutHorizontal;
    public final CheckLongPressHelper mLongPressHelper;
    public View.OnLongClickListener mOnLongClickListener;
    private final HolographicOutlineHelper mOutlineHelper;
    private Bitmap mPressedBackground;
    private float mSlop;
    private boolean mStayPressed;
    private final StylusEventHelper mStylusEventHelper;
    private int mTextColor;

    /* compiled from: PG */
    public interface BubbleTextShadowHandler {
        void setPressedIcon(BubbleTextView bubbleTextView, Bitmap bitmap);
    }

    public BubbleTextView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private final Resources.Theme getPreloaderTheme() {
        Object tag = getTag();
        int i = R.style.PreloadIcon;
        if (tag != null && (tag instanceof ShortcutInfo) && ((ShortcutInfo) tag).container >= 0) {
            i = 2132149841;
        }
        Resources.Theme theme = (Resources.Theme) sPreloaderThemes.get(i);
        if (theme != null) {
            return theme;
        }
        Resources.Theme newTheme = getResources().newTheme();
        newTheme.applyStyle(i, true);
        sPreloaderThemes.put(i, newTheme);
        return newTheme;
    }

    private final void setIcon$ar$ds(Drawable drawable, int i) {
        this.mIcon = drawable;
        if (i != -1) {
            drawable.setBounds(0, 0, i, i);
        }
        applyCompoundDrawables(this.mIcon);
    }

    private final void updateIconState() {
        Drawable drawable = this.mIcon;
        if (drawable instanceof FastBitmapDrawable) {
            FastBitmapDrawable fastBitmapDrawable = (FastBitmapDrawable) drawable;
            if ((getTag() instanceof ItemInfo) && ((ItemInfo) getTag()).isDisabled()) {
                fastBitmapDrawable.animateState(FastBitmapDrawable.State.DISABLED);
            } else if (isPressed() || this.mStayPressed) {
                fastBitmapDrawable.animateState(FastBitmapDrawable.State.PRESSED);
            } else {
                fastBitmapDrawable.animateState(FastBitmapDrawable.State.NORMAL);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void applyCompoundDrawables(Drawable drawable) {
        if (!this.mLayoutHorizontal) {
            setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (Utilities.ATLEAST_JB_MR1) {
            setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void applyDummyInfo() {
        ColorDrawable colorDrawable = new ColorDrawable();
        this.mLauncher.resizeIconDrawable$ar$ds(colorDrawable);
        setIcon$ar$ds(colorDrawable, this.mIconSize);
        setText(BuildConfig.FLAVOR);
    }

    public final void applyFromApplicationInfo(AppInfo appInfo) {
        FastBitmapDrawable createIconDrawable = this.mLauncher.createIconDrawable(appInfo.iconBitmap);
        if (appInfo.isDisabled()) {
            createIconDrawable.setState(FastBitmapDrawable.State.DISABLED);
        }
        setIcon$ar$ds(createIconDrawable, this.mIconSize);
        setText(appInfo.title);
        CharSequence charSequence = appInfo.contentDescription;
        if (charSequence != null) {
            setContentDescription(charSequence);
        }
        super.setTag(appInfo);
        verifyHighRes();
    }

    public final void applyFromPackageItemInfo(PackageItemInfo packageItemInfo) {
        setIcon$ar$ds(this.mLauncher.createIconDrawable(packageItemInfo.iconBitmap), this.mIconSize);
        setText(packageItemInfo.title);
        CharSequence charSequence = packageItemInfo.contentDescription;
        if (charSequence != null) {
            setContentDescription(charSequence);
        }
        super.setTag(packageItemInfo);
        verifyHighRes();
    }

    public final void applyFromShortcutInfo(ShortcutInfo shortcutInfo, IconCache iconCache, boolean z) {
        FastBitmapDrawable createIconDrawable = this.mLauncher.createIconDrawable(shortcutInfo.getIcon(iconCache));
        if (shortcutInfo.isDisabled()) {
            createIconDrawable.setState(FastBitmapDrawable.State.DISABLED);
        }
        setIcon$ar$ds(createIconDrawable, this.mIconSize);
        CharSequence charSequence = shortcutInfo.contentDescription;
        if (charSequence != null) {
            setContentDescription(charSequence);
        }
        setText(shortcutInfo.title);
        setTag(shortcutInfo);
        if (z || shortcutInfo.hasStatusFlag(3)) {
            applyState(z);
        }
    }

    public final void applyState(boolean z) {
        String str;
        PreloadIconDrawable preloadIconDrawable;
        if (getTag() instanceof ShortcutInfo) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) getTag();
            int i = shortcutInfo.hasStatusFlag(3) ? shortcutInfo.hasStatusFlag(4) ? shortcutInfo.mInstallProgress : 0 : 100;
            if (i > 0) {
                Context context = getContext();
                NumberFormat percentInstance = NumberFormat.getPercentInstance();
                double d = (double) i;
                Double.isNaN(d);
                str = context.getString(R.string.app_downloading_title, new Object[]{shortcutInfo.title, percentInstance.format(d * 0.01d)});
            } else {
                str = getContext().getString(R.string.app_waiting_download_title, new Object[]{shortcutInfo.title});
            }
            setContentDescription(str);
            Drawable drawable = this.mIcon;
            if (drawable != null) {
                if (drawable instanceof PreloadIconDrawable) {
                    preloadIconDrawable = (PreloadIconDrawable) drawable;
                } else {
                    preloadIconDrawable = new PreloadIconDrawable(this.mIcon, getPreloaderTheme());
                    setIcon$ar$ds(preloadIconDrawable, this.mIconSize);
                }
                preloadIconDrawable.setLevel(i);
                if (z && preloadIconDrawable.mAnimationProgress <= -1.0f) {
                    ObjectAnimator objectAnimator = preloadIconDrawable.mAnimator;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    preloadIconDrawable.setAnimationProgress(0.0f);
                    preloadIconDrawable.mAnimator = ObjectAnimator.ofFloat(preloadIconDrawable, "animationProgress", new float[]{0.0f, 1.0f});
                    preloadIconDrawable.mAnimator.start();
                }
            }
        }
    }

    public final void cancelLongPress() {
        super.cancelLongPress();
        this.mLongPressHelper.cancelLongPress();
    }

    public final void draw(Canvas canvas) {
        if (!this.mCustomShadowsEnabled) {
            super.draw(canvas);
            return;
        }
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (this.mBackgroundSizeChanged) {
                drawable.setBounds(0, 0, getRight() - getLeft(), getBottom() - getTop());
                this.mBackgroundSizeChanged = false;
            }
            if ((scrollX | scrollY) == 0) {
                drawable.draw(canvas);
            } else {
                canvas.translate((float) scrollX, (float) scrollY);
                drawable.draw(canvas);
                canvas.translate((float) (-scrollX), (float) (-scrollY));
            }
        }
        if (getCurrentTextColor() == getResources().getColor(17170445)) {
            getPaint().clearShadowLayer();
            super.draw(canvas);
            return;
        }
        getPaint().setShadowLayer(4.0f, 0.0f, 2.0f, -587202560);
        super.draw(canvas);
        canvas.save();
        canvas.clipRect((float) getScrollX(), (float) (getScrollY() + getExtendedPaddingTop()), (float) (getScrollX() + getWidth()), (float) (getScrollY() + getHeight()), Region.Op.INTERSECT);
        getPaint().setShadowLayer(1.75f, 0.0f, 0.0f, -872415232);
        super.draw(canvas);
        canvas.restore();
    }

    public final boolean hasDeepShortcuts() {
        return !this.mLauncher.getShortcutIdsForItem((ItemInfo) getTag()).isEmpty();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = this.mIcon;
        if (drawable2 instanceof PreloadIconDrawable) {
            ((PreloadIconDrawable) drawable2).applyPreloaderTheme(getPreloaderTheme());
        }
        this.mSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (this.mPressedBackground != null) {
            return true;
        }
        this.mPressedBackground = this.mOutlineHelper.createMediumDropShadow(this);
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.mIgnorePressedStateChange = true;
        boolean onKeyUp = super.onKeyUp(i, keyEvent);
        this.mPressedBackground = null;
        this.mIgnorePressedStateChange = false;
        updateIconState();
        return onKeyUp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1 != 3) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            boolean r0 = super.onTouchEvent(r4)
            com.android.launcher3.StylusEventHelper r1 = r3.mStylusEventHelper
            boolean r1 = r1.checkAndPerformStylusEvent(r4)
            r2 = 1
            if (r1 == 0) goto L_0x0013
            com.android.launcher3.CheckLongPressHelper r0 = r3.mLongPressHelper
            r0.cancelLongPress()
            r0 = 1
        L_0x0013:
            int r1 = r4.getAction()
            if (r1 == 0) goto L_0x0047
            if (r1 == r2) goto L_0x0038
            r2 = 2
            if (r1 == r2) goto L_0x0022
            r4 = 3
            if (r1 == r4) goto L_0x0038
            goto L_0x0062
        L_0x0022:
            float r1 = r4.getX()
            float r4 = r4.getY()
            float r2 = r3.mSlop
            boolean r4 = com.android.launcher3.Utilities.pointInView(r3, r1, r4, r2)
            if (r4 != 0) goto L_0x0062
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            goto L_0x0062
        L_0x0038:
            boolean r4 = r3.isPressed()
            if (r4 != 0) goto L_0x0041
            r4 = 0
            r3.mPressedBackground = r4
        L_0x0041:
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            goto L_0x0062
        L_0x0047:
            boolean r4 = r3.mDeferShadowGenerationOnTouch
            if (r4 != 0) goto L_0x0057
            android.graphics.Bitmap r4 = r3.mPressedBackground
            if (r4 != 0) goto L_0x0057
            com.android.launcher3.HolographicOutlineHelper r4 = r3.mOutlineHelper
            android.graphics.Bitmap r4 = r4.createMediumDropShadow(r3)
            r3.mPressedBackground = r4
        L_0x0057:
            com.android.launcher3.StylusEventHelper r4 = r3.mStylusEventHelper
            boolean r4 = r4.mIsButtonPressed
            if (r4 != 0) goto L_0x0062
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.postCheckForLongPress()
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.BubbleTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void requestLayout() {
        if (!this.mDisableRelayout) {
            super.requestLayout();
        }
    }

    public final void setFastScrollFocusState(FastBitmapDrawable.State state, boolean z) {
        Drawable drawable = this.mIcon;
        if (drawable instanceof FastBitmapDrawable) {
            FastBitmapDrawable fastBitmapDrawable = (FastBitmapDrawable) drawable;
            if (z) {
                FastBitmapDrawable.State state2 = fastBitmapDrawable.mState;
                if (fastBitmapDrawable.animateState(state)) {
                    ViewPropertyAnimator scaleY = animate().scaleX(state.viewScale).scaleY(state.viewScale);
                    int i = 0;
                    if (state.ordinal() == 0 && state2.ordinal() == 2) {
                        i = 68;
                    }
                    scaleY.setStartDelay((long) i).setDuration((long) FastBitmapDrawable.getDurationForStateChange(state2, state)).start();
                }
            } else if (fastBitmapDrawable.setState(state)) {
                animate().cancel();
                setScaleX(state.viewScale);
                setScaleY(state.viewScale);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        if (!(getLeft() == i && getRight() == i3 && getTop() == i2 && getBottom() == i4)) {
            this.mBackgroundSizeChanged = true;
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.mOnLongClickListener = onLongClickListener;
    }

    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (!this.mIgnorePressedStateChange) {
            updateIconState();
        }
    }

    public final void setTag(Object obj) {
        if (obj != null) {
            LauncherModel.checkItemInfo((ItemInfo) obj);
        }
        super.setTag(obj);
    }

    public final void setTextColor(int i) {
        this.mTextColor = i;
        super.setTextColor(i);
    }

    public final void setTextVisibility(boolean z) {
        Resources resources = getResources();
        if (z) {
            super.setTextColor(this.mTextColor);
        } else {
            super.setTextColor(resources.getColor(17170445));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.mBackground || super.verifyDrawable(drawable);
    }

    public final void verifyHighRes() {
        IconCache.IconLoadRequest iconLoadRequest = this.mIconLoadRequest;
        if (iconLoadRequest != null) {
            iconLoadRequest.mHandler.removeCallbacks(iconLoadRequest.mRunnable);
            this.mIconLoadRequest = null;
        }
        if (getTag() instanceof AppInfo) {
            AppInfo appInfo = (AppInfo) getTag();
            if (appInfo.usingLowResIcon) {
                this.mIconLoadRequest = LauncherAppState.getInstance().mIconCache.updateIconInBackground(this, appInfo);
            }
        } else if (getTag() instanceof ShortcutInfo) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) getTag();
            if (shortcutInfo.usingLowResIcon) {
                this.mIconLoadRequest = LauncherAppState.getInstance().mIconCache.updateIconInBackground(this, shortcutInfo);
            }
        } else if (getTag() instanceof PackageItemInfo) {
            PackageItemInfo packageItemInfo = (PackageItemInfo) getTag();
            if (packageItemInfo.usingLowResIcon) {
                this.mIconLoadRequest = LauncherAppState.getInstance().mIconCache.updateIconInBackground(this, packageItemInfo);
            }
        }
    }

    public BubbleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: package-private */
    public final void setStayPressed(boolean z) {
        this.mStayPressed = z;
        if (!z) {
            this.mPressedBackground = null;
        } else if (this.mPressedBackground == null) {
            this.mPressedBackground = this.mOutlineHelper.createMediumDropShadow(this);
        }
        ViewParent parent = getParent();
        if (parent != null && (parent.getParent() instanceof BubbleTextShadowHandler)) {
            ((BubbleTextShadowHandler) parent.getParent()).setPressedIcon(this, this.mPressedBackground);
        }
        updateIconState();
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.mTextColor = colorStateList.getDefaultColor();
        super.setTextColor(colorStateList);
    }

    public BubbleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDisableRelayout = false;
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        DeviceProfile deviceProfile = launcher.mDeviceProfile;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BubbleTextView, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        this.mCustomShadowsEnabled = z;
        this.mLayoutHorizontal = obtainStyledAttributes.getBoolean(4, false);
        this.mDeferShadowGenerationOnTouch = obtainStyledAttributes.getBoolean(1, false);
        int integer = obtainStyledAttributes.getInteger(2, 0);
        int i2 = deviceProfile.iconSizePx;
        if (integer == 0) {
            setTextSize(0, (float) deviceProfile.iconTextSizePx);
        } else if (integer == 1) {
            setTextSize(2, deviceProfile.allAppsIconTextSizeSp);
            i2 = deviceProfile.allAppsIconSizePx;
        } else if (integer == 4) {
            setTextSize(0, (float) deviceProfile.folderChildTextSizePx);
            int i3 = deviceProfile.folderChildDrawablePaddingPx;
            setCompoundDrawablePadding(0);
            i2 = deviceProfile.folderChildIconSizePx;
        }
        this.mIconSize = obtainStyledAttributes.getDimensionPixelSize(3, i2);
        obtainStyledAttributes.recycle();
        if (z) {
            this.mBackground = getBackground();
            setBackground((Drawable) null);
        } else {
            this.mBackground = null;
        }
        this.mLongPressHelper = new CheckLongPressHelper(this);
        this.mStylusEventHelper = new StylusEventHelper(this);
        this.mOutlineHelper = HolographicOutlineHelper.obtain(getContext());
        if (z) {
            setShadowLayer(4.0f, 0.0f, 2.0f, -587202560);
        }
        setAccessibilityDelegate(LauncherAppState.getInstance().mAccessibilityDelegate);
    }
}
