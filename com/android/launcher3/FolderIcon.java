package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.launcher3.DragLayer;
import com.android.launcher3.DropTarget;
import com.android.launcher3.FolderInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class FolderIcon extends FrameLayout implements FolderInfo.FolderListener {
    public static Drawable sSharedFolderLeaveBehind = null;
    static boolean sStaticValuesDirty = true;
    PreviewItemDrawingParams mAnimParams = new PreviewItemDrawingParams(0.0f, 0.0f, 0.0f, 0.0f);
    boolean mAnimating = false;
    private int mAvailableSpaceInPreview;
    private float mBaselineIconScale;
    private int mBaselineIconSize;
    ItemInfo mDragInfo;
    Folder mFolder;
    public BubbleTextView mFolderName;
    FolderRingAnimator mFolderRingAnimator = null;
    ArrayList mHiddenItems = new ArrayList();
    public FolderInfo mInfo;
    private int mIntrinsicIconSize;
    Launcher mLauncher;
    private CheckLongPressHelper mLongPressHelper;
    private float mMaxPerspectiveShift;
    private Rect mOldBounds = new Rect();
    OnAlarmListener mOnOpenListener = new OnAlarmListener() {
        public final void onAlarm$ar$ds() {
            ShortcutInfo shortcutInfo;
            ItemInfo itemInfo = FolderIcon.this.mDragInfo;
            if (itemInfo instanceof AppInfo) {
                shortcutInfo = new ShortcutInfo((AppInfo) itemInfo);
                shortcutInfo.spanX = 1;
                shortcutInfo.spanY = 1;
            } else {
                shortcutInfo = (ShortcutInfo) itemInfo;
            }
            Folder folder = FolderIcon.this.mFolder;
            folder.mCurrentDragInfo = shortcutInfo;
            folder.mEmptyCellRank = folder.mContent.allocateRankForNewItem$ar$ds();
            folder.mIsExternalDrag = true;
            folder.mDragInProgress = true;
            folder.mDragController.mListeners.add(folder);
            FolderIcon folderIcon = FolderIcon.this;
            folderIcon.mLauncher.openFolder(folderIcon);
        }
    };
    public Alarm mOpenAlarm = new Alarm();
    private PreviewItemDrawingParams mParams = new PreviewItemDrawingParams(0.0f, 0.0f, 0.0f, 0.0f);
    ImageView mPreviewBackground;
    private int mPreviewOffsetX;
    private int mPreviewOffsetY;
    private float mSlop;
    private StylusEventHelper mStylusEventHelper;
    private int mTotalWidth = -1;

    /* compiled from: PG */
    public final class FolderRingAnimator {
        public static int sPreviewPadding = -1;
        public static int sPreviewSize = -1;
        public static Drawable sSharedInnerRingDrawable;
        public static Drawable sSharedOuterRingDrawable;
        private ValueAnimator mAcceptAnimator;
        CellLayout mCellLayout;
        public int mCellX;
        public int mCellY;
        public final FolderIcon mFolderIcon;
        public float mInnerRingSize;
        private ValueAnimator mNeutralAnimator;
        public float mOuterRingSize;

        public FolderRingAnimator(Launcher launcher, FolderIcon folderIcon) {
            this.mFolderIcon = folderIcon;
            Resources resources = launcher.getResources();
            if (!FolderIcon.sStaticValuesDirty) {
                return;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                sPreviewSize = launcher.mDeviceProfile.folderIconSizePx;
                sPreviewPadding = resources.getDimensionPixelSize(R.dimen.folder_preview_padding);
                sSharedOuterRingDrawable = resources.getDrawable(R.drawable.portal_ring_outer);
                sSharedInnerRingDrawable = resources.getDrawable(R.drawable.portal_ring_inner_nolip);
                FolderIcon.sSharedFolderLeaveBehind = resources.getDrawable(R.drawable.portal_ring_rest);
                FolderIcon.sStaticValuesDirty = false;
                return;
            }
            throw new RuntimeException("FolderRingAnimator loading drawables on non-UI thread ".concat(String.valueOf(String.valueOf(Thread.currentThread()))));
        }

        public final void animateToAcceptState() {
            ValueAnimator valueAnimator = this.mNeutralAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat$ar$ds = LauncherAnimUtils.ofFloat$ar$ds(0.0f, 1.0f);
            this.mAcceptAnimator = ofFloat$ar$ds;
            ofFloat$ar$ds.setDuration(100);
            final int i = sPreviewSize;
            this.mAcceptAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    FolderRingAnimator folderRingAnimator = FolderRingAnimator.this;
                    float f = (float) i;
                    folderRingAnimator.mOuterRingSize = ((0.3f * floatValue) + 1.0f) * f;
                    folderRingAnimator.mInnerRingSize = ((floatValue * 0.15f) + 1.0f) * f;
                    CellLayout cellLayout = folderRingAnimator.mCellLayout;
                    if (cellLayout != null) {
                        cellLayout.invalidate();
                    }
                }
            });
            this.mAcceptAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    FolderIcon folderIcon = FolderRingAnimator.this.mFolderIcon;
                    if (folderIcon != null) {
                        folderIcon.mPreviewBackground.setVisibility(4);
                    }
                }
            });
            this.mAcceptAnimator.start();
        }

        public final void animateToNaturalState() {
            ValueAnimator valueAnimator = this.mAcceptAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat$ar$ds = LauncherAnimUtils.ofFloat$ar$ds(0.0f, 1.0f);
            this.mNeutralAnimator = ofFloat$ar$ds;
            ofFloat$ar$ds.setDuration(100);
            final int i = sPreviewSize;
            this.mNeutralAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    FolderRingAnimator folderRingAnimator = FolderRingAnimator.this;
                    float f = 1.0f - floatValue;
                    float f2 = (float) i;
                    folderRingAnimator.mOuterRingSize = ((0.3f * f) + 1.0f) * f2;
                    folderRingAnimator.mInnerRingSize = ((f * 0.15f) + 1.0f) * f2;
                    CellLayout cellLayout = folderRingAnimator.mCellLayout;
                    if (cellLayout != null) {
                        cellLayout.invalidate();
                    }
                }
            });
            this.mNeutralAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    FolderRingAnimator folderRingAnimator = FolderRingAnimator.this;
                    CellLayout cellLayout = folderRingAnimator.mCellLayout;
                    if (cellLayout != null) {
                        if (cellLayout.mFolderOuterRings.contains(folderRingAnimator)) {
                            cellLayout.mFolderOuterRings.remove(folderRingAnimator);
                        }
                        cellLayout.invalidate();
                    }
                    FolderIcon folderIcon = FolderRingAnimator.this.mFolderIcon;
                    if (folderIcon != null) {
                        folderIcon.mPreviewBackground.setVisibility(0);
                    }
                }
            });
            this.mNeutralAnimator.start();
        }
    }

    /* compiled from: PG */
    final class PreviewItemDrawingParams {
        Drawable drawable;
        float overlayAlpha;
        float scale;
        float transX;
        float transY;

        public PreviewItemDrawingParams(float f, float f2, float f3, float f4) {
            this.transX = f;
            this.transY = f2;
            this.scale = f3;
            this.overlayAlpha = f4;
        }
    }

    public FolderIcon(Context context) {
        super(context);
        init();
    }

    private final PreviewItemDrawingParams computePreviewItemDrawingParams(int i, PreviewItemDrawingParams previewItemDrawingParams) {
        float f = 1.0f - (((float) ((3 - i) - 1)) / 2.0f);
        float f2 = 1.0f - (0.35f * f);
        float f3 = this.mMaxPerspectiveShift;
        float f4 = (float) this.mBaselineIconSize;
        float f5 = f2 * f4;
        float paddingTop = (((float) this.mAvailableSpaceInPreview) - (((f3 * f) + f5) + ((1.0f - f2) * f4))) + ((float) getPaddingTop());
        float f6 = (((float) this.mAvailableSpaceInPreview) - f5) / 2.0f;
        float f7 = this.mBaselineIconScale * f2;
        float f8 = (f * 80.0f) / 255.0f;
        if (previewItemDrawingParams == null) {
            return new PreviewItemDrawingParams(f6, paddingTop, f7, f8);
        }
        previewItemDrawingParams.transX = f6;
        previewItemDrawingParams.transY = paddingTop;
        previewItemDrawingParams.scale = f7;
        previewItemDrawingParams.overlayAlpha = f8;
        return previewItemDrawingParams;
    }

    private final void drawPreviewItem(Canvas canvas, PreviewItemDrawingParams previewItemDrawingParams) {
        canvas.save();
        canvas.translate(previewItemDrawingParams.transX + ((float) this.mPreviewOffsetX), previewItemDrawingParams.transY + ((float) this.mPreviewOffsetY));
        float f = previewItemDrawingParams.scale;
        canvas.scale(f, f);
        Drawable drawable = previewItemDrawingParams.drawable;
        if (drawable != null) {
            this.mOldBounds.set(drawable.getBounds());
            int i = this.mIntrinsicIconSize;
            drawable.setBounds(0, 0, i, i);
            if (drawable instanceof FastBitmapDrawable) {
                FastBitmapDrawable fastBitmapDrawable = (FastBitmapDrawable) drawable;
                float brightness = fastBitmapDrawable.getBrightness();
                fastBitmapDrawable.setBrightness(previewItemDrawingParams.overlayAlpha);
                drawable.draw(canvas);
                fastBitmapDrawable.setBrightness(brightness);
            } else {
                drawable.setColorFilter(Color.argb((int) (previewItemDrawingParams.overlayAlpha * 255.0f), PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID), PorterDuff.Mode.SRC_ATOP);
                drawable.draw(canvas);
                drawable.clearColorFilter();
            }
            drawable.setBounds(this.mOldBounds);
        }
        canvas.restore();
    }

    static FolderIcon fromXml$ar$ds(Launcher launcher, ViewGroup viewGroup, FolderInfo folderInfo) {
        DeviceProfile deviceProfile = launcher.mDeviceProfile;
        FolderIcon folderIcon = (FolderIcon) LayoutInflater.from(launcher).inflate(R.layout.folder_icon, viewGroup, false);
        folderIcon.setClipToPadding(false);
        BubbleTextView bubbleTextView = (BubbleTextView) folderIcon.findViewById(R.id.folder_icon_name);
        folderIcon.mFolderName = bubbleTextView;
        bubbleTextView.setText(folderInfo.title);
        folderIcon.mFolderName.setCompoundDrawablePadding(0);
        ((FrameLayout.LayoutParams) folderIcon.mFolderName.getLayoutParams()).topMargin = deviceProfile.iconSizePx + deviceProfile.iconDrawablePaddingPx;
        ImageView imageView = (ImageView) folderIcon.findViewById(R.id.preview_background);
        folderIcon.mPreviewBackground = imageView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.topMargin = deviceProfile.folderBackgroundOffset;
        layoutParams.width = deviceProfile.folderIconSizePx;
        layoutParams.height = deviceProfile.folderIconSizePx;
        folderIcon.setTag(folderInfo);
        folderIcon.setOnClickListener(launcher);
        folderIcon.mInfo = folderInfo;
        folderIcon.mLauncher = launcher;
        folderIcon.setContentDescription(String.format(launcher.getString(R.string.folder_name_format), new Object[]{folderInfo.title}));
        Folder fromXml = Folder.fromXml(launcher);
        fromXml.mDragController = launcher.mDragController;
        fromXml.mFolderIcon = folderIcon;
        fromXml.mInfo = folderInfo;
        ArrayList arrayList = folderInfo.contents;
        Collections.sort(arrayList, Folder.ITEM_POS_COMPARATOR);
        FolderPagedView folderPagedView = fromXml.mContent;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(folderPagedView.createNewView((ShortcutInfo) arrayList.get(i)));
        }
        folderPagedView.arrangeChildren(arrayList2, arrayList2.size(), false);
        int size2 = arrayList3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) arrayList3.get(i2);
            fromXml.mInfo.remove(shortcutInfo);
            LauncherModel.deleteItemFromDatabase(fromXml.mLauncher, shortcutInfo);
        }
        if (((DragLayer.LayoutParams) fromXml.getLayoutParams()) == null) {
            DragLayer.LayoutParams layoutParams2 = new DragLayer.LayoutParams(0, 0);
            layoutParams2.customPosition = true;
            fromXml.setLayoutParams(layoutParams2);
        }
        fromXml.centerAboutIcon();
        fromXml.mItemsInvalidated = true;
        fromXml.updateTextViewFocus();
        fromXml.mInfo.listeners.add(fromXml);
        if (!Folder.sDefaultFolderName.contentEquals(fromXml.mInfo.title)) {
            fromXml.mFolderName.setText(fromXml.mInfo.title);
        } else {
            fromXml.mFolderName.setText(BuildConfig.FLAVOR);
        }
        fromXml.mFolderIcon.post(new Runnable() {
            public final void run() {
                if (Folder.this.mContent.getItemCount() <= 1) {
                    Folder.this.replaceFolderWithFinalItem();
                }
            }
        });
        folderIcon.mFolder = fromXml;
        folderIcon.mFolderRingAnimator = new FolderRingAnimator(launcher, folderIcon);
        folderInfo.listeners.add(folderIcon);
        folderIcon.setOnFocusChangeListener(launcher.mFocusHandler);
        return folderIcon;
    }

    public static final Drawable getTopDrawable$ar$ds(TextView textView) {
        Drawable drawable = textView.getCompoundDrawables()[1];
        return drawable instanceof PreloadIconDrawable ? ((PreloadIconDrawable) drawable).mIcon : drawable;
    }

    private final void init() {
        this.mLongPressHelper = new CheckLongPressHelper(this);
        this.mStylusEventHelper = new StylusEventHelper(this);
        setAccessibilityDelegate(LauncherAppState.getInstance().mAccessibilityDelegate);
    }

    public final boolean acceptDrop(Object obj) {
        return !this.mFolder.mDestroyed && willAcceptItem((ItemInfo) obj);
    }

    public final void animateFirstItem(Drawable drawable, int i, boolean z, final Runnable runnable) {
        final PreviewItemDrawingParams computePreviewItemDrawingParams = computePreviewItemDrawingParams(0, (PreviewItemDrawingParams) null);
        float f = (float) this.mLauncher.mDeviceProfile.iconSizePx;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        final float f2 = (((float) this.mAvailableSpaceInPreview) - f) / 2.0f;
        int paddingTop = getPaddingTop();
        this.mAnimParams.drawable = drawable;
        ValueAnimator ofFloat$ar$ds = LauncherAnimUtils.ofFloat$ar$ds(0.0f, 1.0f);
        final float f3 = f2 + ((float) paddingTop);
        final float f4 = f / ((float) intrinsicWidth);
        final boolean z2 = z;
        ofFloat$ar$ds.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (z2) {
                    floatValue = 1.0f - floatValue;
                    FolderIcon.this.mPreviewBackground.setAlpha(floatValue);
                }
                FolderIcon folderIcon = FolderIcon.this;
                PreviewItemDrawingParams previewItemDrawingParams = folderIcon.mAnimParams;
                float f = f2;
                PreviewItemDrawingParams previewItemDrawingParams2 = computePreviewItemDrawingParams;
                previewItemDrawingParams.transX = f + ((previewItemDrawingParams2.transX - f) * floatValue);
                float f2 = f3;
                previewItemDrawingParams.transY = f2 + ((previewItemDrawingParams2.transY - f2) * floatValue);
                float f3 = f4;
                previewItemDrawingParams.scale = f3 + (floatValue * (previewItemDrawingParams2.scale - f3));
                folderIcon.invalidate();
            }
        });
        ofFloat$ar$ds.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                FolderIcon.this.mAnimating = false;
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public final void onAnimationStart(Animator animator) {
                FolderIcon.this.mAnimating = true;
            }
        });
        ofFloat$ar$ds.setDuration((long) i);
        ofFloat$ar$ds.start();
    }

    public final void cancelLongPress() {
        super.cancelLongPress();
        this.mLongPressHelper.cancelLongPress();
    }

    public final void computePreviewDrawingParams(int i, int i2) {
        if (this.mIntrinsicIconSize != i || this.mTotalWidth != i2) {
            DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
            this.mIntrinsicIconSize = i;
            this.mTotalWidth = i2;
            int i3 = this.mPreviewBackground.getLayoutParams().height;
            int i4 = FolderRingAnimator.sPreviewPadding;
            int i5 = i3 - (i4 + i4);
            this.mAvailableSpaceInPreview = i5;
            float f = (float) this.mIntrinsicIconSize;
            float f2 = ((float) ((int) (((float) (i5 / 2)) * 1.8f))) / ((float) ((int) (1.1800001f * f)));
            this.mBaselineIconScale = f2;
            int i6 = (int) (f * f2);
            this.mBaselineIconSize = i6;
            this.mMaxPerspectiveShift = ((float) i6) * 0.18f;
            this.mPreviewOffsetX = (this.mTotalWidth - i5) / 2;
            this.mPreviewOffsetY = i4 + deviceProfile.folderBackgroundOffset;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Folder folder = this.mFolder;
        if (folder != null) {
            if (folder.mContent.getItemCount() != 0 || this.mAnimating) {
                ArrayList itemsInReadingOrder = this.mFolder.getItemsInReadingOrder();
                if (this.mAnimating) {
                    computePreviewDrawingParams(this.mAnimParams.drawable);
                } else {
                    computePreviewDrawingParams(getTopDrawable$ar$ds((TextView) itemsInReadingOrder.get(0)));
                }
                int min = Math.min(itemsInReadingOrder.size(), 3);
                if (!this.mAnimating) {
                    while (true) {
                        min--;
                        if (min >= 0) {
                            TextView textView = (TextView) itemsInReadingOrder.get(min);
                            if (!this.mHiddenItems.contains(textView.getTag())) {
                                Drawable topDrawable$ar$ds = getTopDrawable$ar$ds(textView);
                                PreviewItemDrawingParams computePreviewItemDrawingParams = computePreviewItemDrawingParams(min, this.mParams);
                                this.mParams = computePreviewItemDrawingParams;
                                computePreviewItemDrawingParams.drawable = topDrawable$ar$ds;
                                drawPreviewItem(canvas, computePreviewItemDrawingParams);
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    drawPreviewItem(canvas, this.mAnimParams);
                }
            }
        }
    }

    public final void onAdd(ShortcutInfo shortcutInfo) {
        invalidate();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final void onDrop(DropTarget.DragObject dragObject) {
        ShortcutInfo shortcutInfo;
        Object obj = dragObject.dragInfo;
        if (obj instanceof AppInfo) {
            shortcutInfo = new ShortcutInfo((AppInfo) obj);
        } else {
            shortcutInfo = (ShortcutInfo) obj;
        }
        ShortcutInfo shortcutInfo2 = shortcutInfo;
        Folder folder = this.mFolder;
        if (folder.mDragInProgress) {
            folder.mItemAddedBackToSelfViaIcon = true;
        }
        onDrop$ar$ds(shortcutInfo2, dragObject.dragView, (Rect) null, 1.0f, this.mInfo.contents.size(), dragObject.postAnimationRunnable);
    }

    public final void onDrop$ar$ds(ShortcutInfo shortcutInfo, DragView dragView, Rect rect, float f, int i, Runnable runnable) {
        float f2;
        Rect rect2;
        final ShortcutInfo shortcutInfo2 = shortcutInfo;
        DragView dragView2 = dragView;
        int i2 = i;
        shortcutInfo2.cellX = -1;
        shortcutInfo2.cellY = -1;
        if (dragView2 != null) {
            DragLayer dragLayer = this.mLauncher.mDragLayer;
            Rect rect3 = new Rect();
            dragLayer.getViewRectRelativeToSelf(dragView2, rect3);
            if (rect == null) {
                rect2 = new Rect();
                Workspace workspace = this.mLauncher.mWorkspace;
                CellLayout cellLayout = (CellLayout) getParent().getParent();
                workspace.setFinalTransitionTransform$ar$ds();
                float scaleX = getScaleX();
                float scaleY = getScaleY();
                setScaleX(1.0f);
                setScaleY(1.0f);
                f2 = dragLayer.getDescendantRectRelativeToSelf(this, rect2);
                setScaleX(scaleX);
                setScaleY(scaleY);
                CellLayout cellLayout2 = (CellLayout) getParent().getParent();
                workspace.resetTransitionTransform$ar$ds();
            } else {
                rect2 = rect;
                f2 = f;
            }
            PreviewItemDrawingParams computePreviewItemDrawingParams = computePreviewItemDrawingParams(Math.min(3, i2), this.mParams);
            this.mParams = computePreviewItemDrawingParams;
            float f3 = computePreviewItemDrawingParams.transX + ((float) this.mPreviewOffsetX);
            computePreviewItemDrawingParams.transX = f3;
            float f4 = computePreviewItemDrawingParams.transY + ((float) this.mPreviewOffsetY);
            computePreviewItemDrawingParams.transY = f4;
            float f5 = (computePreviewItemDrawingParams.scale * ((float) this.mIntrinsicIconSize)) / 2.0f;
            int[] iArr = {Math.round(f3 + f5), Math.round(f4 + f5)};
            float f6 = this.mParams.scale;
            iArr[0] = Math.round(((float) iArr[0]) * f2);
            iArr[1] = Math.round(((float) iArr[1]) * f2);
            rect2.offset(iArr[0] - (dragView.getMeasuredWidth() / 2), iArr[1] - (dragView.getMeasuredHeight() / 2));
            float f7 = f6 * f2;
            dragLayer.animateView$ar$ds(dragView, rect3, rect2, i2 < 3 ? 0.5f : 0.0f, f7, f7, 400, new DecelerateInterpolator(2.0f), new AccelerateInterpolator(2.0f), runnable, 0, (View) null);
            this.mInfo.add(shortcutInfo2);
            this.mHiddenItems.add(shortcutInfo2);
            this.mFolder.getViewForInfo(shortcutInfo2).setVisibility(4);
            postDelayed(new Runnable() {
                public final void run() {
                    FolderIcon.this.mHiddenItems.remove(shortcutInfo2);
                    FolderIcon.this.mFolder.getViewForInfo(shortcutInfo2).setVisibility(0);
                    FolderIcon.this.invalidate();
                }
            }, 400);
            return;
        }
        this.mInfo.add(shortcutInfo2);
    }

    public final void onItemsChanged() {
        invalidate();
        requestLayout();
    }

    public final void onRemove(ShortcutInfo shortcutInfo) {
        invalidate();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        sStaticValuesDirty = true;
        return super.onSaveInstanceState();
    }

    public final void onTitleChanged(CharSequence charSequence) {
        this.mFolderName.setText(charSequence);
        setContentDescription(String.format(getContext().getString(R.string.folder_name_format), new Object[]{charSequence}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r1 != 3) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            boolean r0 = super.onTouchEvent(r4)
            com.android.launcher3.StylusEventHelper r1 = r3.mStylusEventHelper
            boolean r1 = r1.checkAndPerformStylusEvent(r4)
            r2 = 1
            if (r1 == 0) goto L_0x0013
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            return r2
        L_0x0013:
            int r1 = r4.getAction()
            if (r1 == 0) goto L_0x003e
            if (r1 == r2) goto L_0x0038
            r2 = 2
            if (r1 == r2) goto L_0x0022
            r4 = 3
            if (r1 == r4) goto L_0x0038
            goto L_0x0043
        L_0x0022:
            float r1 = r4.getX()
            float r4 = r4.getY()
            float r2 = r3.mSlop
            boolean r4 = com.android.launcher3.Utilities.pointInView(r3, r1, r4, r2)
            if (r4 != 0) goto L_0x0043
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            goto L_0x0043
        L_0x0038:
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            goto L_0x0043
        L_0x003e:
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.postCheckForLongPress()
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.FolderIcon.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setTextVisible(boolean z) {
        if (z) {
            this.mFolderName.setVisibility(0);
        } else {
            this.mFolderName.setVisibility(4);
        }
    }

    public final boolean willAcceptItem(ItemInfo itemInfo) {
        int i = itemInfo.itemType;
        if (i != 0 && i != 1 && i != 6) {
            return false;
        }
        FolderPagedView folderPagedView = this.mFolder.mContent;
        FolderInfo folderInfo = this.mInfo;
        if (itemInfo == folderInfo || folderInfo.opened) {
            return false;
        }
        return true;
    }

    private final void computePreviewDrawingParams(Drawable drawable) {
        computePreviewDrawingParams(drawable.getIntrinsicWidth(), getMeasuredWidth());
    }

    public FolderIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
