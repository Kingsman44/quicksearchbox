package com.android.launcher3.shortcuts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.android.launcher3.AppInfo;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.DragController;
import com.android.launcher3.DragLayer;
import com.android.launcher3.DragSource;
import com.android.launcher3.DragView;
import com.android.launcher3.DropTarget;
import com.android.launcher3.IconCache;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAnimUtils;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.LauncherViewPropertyAnimator;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.accessibility.ShortcutMenuAccessibilityDelegate;
import com.android.launcher3.compat.DeepShortcutManagerCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.graphics.TriangleShape;
import com.android.launcher3.shortcuts.DeepShortcutView;
import com.android.launcher3.util.PillWidthRevealOutlineProvider;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class DeepShortcutsContainer extends LinearLayout implements View.OnLongClickListener, View.OnTouchListener, DragSource, DragController.DragListener {
    private final ShortcutMenuAccessibilityDelegate mAccessibilityDelegate;
    public int mActivePointerId;
    private View mArrow;
    private int mArrowHorizontalOffset;
    public final DeepShortcutManagerCompat mDeepShortcutsManager;
    public boolean mDeferContainerRemoval;
    public BubbleTextView mDeferredDragIcon;
    private float mDistanceDragged;
    private final int mDragDeadzone;
    private DragView mDragView;
    private Point mIconLastTouchPos;
    private final Point mIconShift;
    public boolean mIsAboveIcon;
    private boolean mIsLeftAligned;
    public boolean mIsOpen;
    private boolean mIsRtl;
    private float mLastX;
    private float mLastY;
    public final Launcher mLauncher;
    public Animator mOpenCloseAnimator;
    private boolean mSrcIconDragStarted;
    private final int mStartDragThreshold;
    private final Rect mTempRect;
    private final int[] mTempXY;
    public int[] mTouchDown;

    /* compiled from: PG */
    final class UnbadgedShortcutInfo extends ShortcutInfo {
        public final ShortcutInfoCompat mDetail;

        public UnbadgedShortcutInfo(ShortcutInfoCompat shortcutInfoCompat, Context context) {
            super(shortcutInfoCompat, context);
            this.mDetail = shortcutInfoCompat;
        }

        /* access modifiers changed from: protected */
        public final Bitmap getBadgedIcon(Bitmap bitmap, ShortcutInfoCompat shortcutInfoCompat, IconCache iconCache, Context context) {
            return bitmap;
        }
    }

    /* compiled from: PG */
    final class UpdateShortcutChild implements Runnable {
        private final int mShortcutChildIndex;
        private final UnbadgedShortcutInfo mShortcutChildInfo;

        public UpdateShortcutChild(int i, UnbadgedShortcutInfo unbadgedShortcutInfo) {
            this.mShortcutChildIndex = i;
            this.mShortcutChildInfo = unbadgedShortcutInfo;
        }

        public final void run() {
            DeepShortcutView shortcutAt = DeepShortcutsContainer.this.getShortcutAt(this.mShortcutChildIndex);
            UnbadgedShortcutInfo unbadgedShortcutInfo = this.mShortcutChildInfo;
            DeepShortcutsContainer deepShortcutsContainer = DeepShortcutsContainer.this;
            shortcutAt.mInfo = unbadgedShortcutInfo;
            boolean z = false;
            shortcutAt.mBubbleText.applyFromShortcutInfo(unbadgedShortcutInfo, LauncherAppState.getInstance().mIconCache, false);
            shortcutAt.mIconView.setBackground(shortcutAt.mBubbleText.mIcon);
            CharSequence longLabel = unbadgedShortcutInfo.mDetail.getLongLabel();
            int width = (shortcutAt.mBubbleText.getWidth() - shortcutAt.mBubbleText.getTotalPaddingLeft()) - shortcutAt.mBubbleText.getTotalPaddingRight();
            if (!TextUtils.isEmpty(longLabel) && shortcutAt.mBubbleText.getPaint().measureText(longLabel.toString()) <= ((float) width)) {
                z = true;
            }
            DeepShortcutTextView deepShortcutTextView = shortcutAt.mBubbleText;
            if (!z) {
                longLabel = unbadgedShortcutInfo.mDetail.getShortLabel();
            }
            deepShortcutTextView.setText(longLabel);
            shortcutAt.mBubbleText.setOnClickListener(Launcher.getLauncher(shortcutAt.getContext()));
            shortcutAt.mBubbleText.setOnLongClickListener(deepShortcutsContainer);
            shortcutAt.mBubbleText.setOnTouchListener(deepShortcutsContainer);
        }
    }

    public DeepShortcutsContainer(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private final void cleanupDeferredDrag(boolean z) {
        DragView dragView = this.mDragView;
        if (dragView != null) {
            dragView.remove();
        }
        if (z) {
            this.mDeferredDragIcon.setVisibility(0);
        }
    }

    public static DeepShortcutsContainer showForIcon(BubbleTextView bubbleTextView) {
        int i;
        int i2;
        int i3;
        BubbleTextView bubbleTextView2 = bubbleTextView;
        Launcher launcher = Launcher.getLauncher(bubbleTextView.getContext());
        if (launcher.getOpenShortcutsContainer() != null) {
            bubbleTextView.clearFocus();
            return null;
        }
        List shortcutIdsForItem = launcher.getShortcutIdsForItem((ItemInfo) bubbleTextView.getTag());
        if (shortcutIdsForItem.isEmpty()) {
            return null;
        }
        DeepShortcutsContainer deepShortcutsContainer = (DeepShortcutsContainer) launcher.getLayoutInflater().inflate(R.layout.deep_shortcuts_container, launcher.mDragLayer, false);
        deepShortcutsContainer.setVisibility(4);
        launcher.mDragLayer.addView(deepShortcutsContainer);
        Resources resources = deepShortcutsContainer.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.deep_shortcuts_arrow_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.deep_shortcuts_arrow_height);
        deepShortcutsContainer.mArrowHorizontalOffset = resources.getDimensionPixelSize(R.dimen.deep_shortcuts_arrow_horizontal_offset);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.deep_shortcuts_arrow_vertical_offset);
        int dimensionPixelSize4 = deepShortcutsContainer.getResources().getDimensionPixelSize(R.dimen.deep_shortcuts_spacing);
        LayoutInflater layoutInflater = deepShortcutsContainer.mLauncher.getLayoutInflater();
        int min = Math.min(shortcutIdsForItem.size(), 4);
        for (int i4 = 0; i4 < min; i4++) {
            DeepShortcutView deepShortcutView = (DeepShortcutView) layoutInflater.inflate(R.layout.deep_shortcut, deepShortcutsContainer, false);
            if (i4 < min - 1) {
                ((LinearLayout.LayoutParams) deepShortcutView.getLayoutParams()).bottomMargin = dimensionPixelSize4;
            }
            deepShortcutView.mBubbleText.setAccessibilityDelegate(deepShortcutsContainer.mAccessibilityDelegate);
            deepShortcutsContainer.addView(deepShortcutView);
        }
        deepShortcutsContainer.setContentDescription(deepShortcutsContainer.getContext().getString(R.string.shortcuts_menu_description, new Object[]{Integer.valueOf(min), bubbleTextView.getContentDescription().toString()}));
        deepShortcutsContainer.measure(0, 0);
        int measuredWidth = deepShortcutsContainer.getMeasuredWidth();
        int measuredHeight = deepShortcutsContainer.getMeasuredHeight() + dimensionPixelSize2 + dimensionPixelSize3;
        DragLayer dragLayer = deepShortcutsContainer.mLauncher.mDragLayer;
        dragLayer.getDescendantRectRelativeToSelf(bubbleTextView2, deepShortcutsContainer.mTempRect);
        Rect rect = dragLayer.mInsets;
        int paddingLeft = deepShortcutsContainer.mTempRect.left + bubbleTextView.getPaddingLeft();
        int paddingRight = (deepShortcutsContainer.mTempRect.right - measuredWidth) - bubbleTextView.getPaddingRight();
        int right = dragLayer.getRight();
        int i5 = rect.right;
        int left = dragLayer.getLeft() + rect.left;
        if (paddingLeft + measuredWidth < right - i5 && (!deepShortcutsContainer.mIsRtl || paddingRight <= left)) {
            paddingRight = paddingLeft;
        }
        deepShortcutsContainer.mIsLeftAligned = paddingRight == paddingLeft;
        if (deepShortcutsContainer.mIsRtl) {
            paddingRight -= dragLayer.getWidth() - measuredWidth;
        }
        int width = (int) (((float) ((bubbleTextView.getWidth() - bubbleTextView.getTotalPaddingLeft()) - bubbleTextView.getTotalPaddingRight())) * bubbleTextView.getScaleX());
        Resources resources2 = deepShortcutsContainer.getResources();
        if (!deepShortcutsContainer.mIsLeftAligned ? !deepShortcutsContainer.mIsRtl : deepShortcutsContainer.mIsRtl) {
            i2 = (width / 2) - (resources2.getDimensionPixelSize(R.dimen.deep_shortcut_drag_handle_size) / 2);
            i = resources2.getDimensionPixelSize(R.dimen.deep_shortcut_padding_end);
        } else {
            i2 = (width / 2) - (resources2.getDimensionPixelSize(R.dimen.deep_shortcut_icon_size) / 2);
            i = resources2.getDimensionPixelSize(R.dimen.deep_shortcut_padding_start);
        }
        int i6 = i2 - i;
        if (!deepShortcutsContainer.mIsLeftAligned) {
            i6 = -i6;
        }
        int i7 = paddingRight + i6;
        int height = bubbleTextView2.mIcon.getBounds().height();
        int paddingTop = (deepShortcutsContainer.mTempRect.top + bubbleTextView.getPaddingTop()) - measuredHeight;
        boolean z = paddingTop > dragLayer.getTop() + rect.top;
        deepShortcutsContainer.mIsAboveIcon = z;
        if (!z) {
            paddingTop = deepShortcutsContainer.mTempRect.top + bubbleTextView.getPaddingTop() + height;
            bubbleTextView2.setTextVisibility(false);
        }
        int i8 = rect.top;
        deepShortcutsContainer.setX((float) i7);
        deepShortcutsContainer.setY((float) (paddingTop - i8));
        int i9 = deepShortcutsContainer.mArrowHorizontalOffset;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
        if (deepShortcutsContainer.mIsLeftAligned) {
            layoutParams.gravity = 3;
            layoutParams.leftMargin = i9;
        } else {
            layoutParams.gravity = 5;
            layoutParams.rightMargin = i9;
        }
        if (deepShortcutsContainer.mIsAboveIcon) {
            layoutParams.topMargin = dimensionPixelSize3;
        } else {
            layoutParams.bottomMargin = dimensionPixelSize3;
        }
        View view = new View(deepShortcutsContainer.getContext());
        float f = (float) dimensionPixelSize;
        float f2 = (float) dimensionPixelSize2;
        boolean z2 = deepShortcutsContainer.mIsAboveIcon;
        Path path = new Path();
        if (!z2) {
            path.moveTo(0.0f, f2);
            path.lineTo(f, f2);
            path.lineTo(f / 2.0f, 0.0f);
            path.close();
        } else {
            path.moveTo(0.0f, 0.0f);
            path.lineTo(f / 2.0f, f2);
            path.lineTo(f, 0.0f);
            path.close();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new TriangleShape(path, f, f2));
        shapeDrawable.getPaint().setColor(-1);
        view.setBackground(shapeDrawable);
        view.setElevation(deepShortcutsContainer.getElevation());
        if (deepShortcutsContainer.mIsAboveIcon) {
            i3 = deepShortcutsContainer.getChildCount();
        } else {
            i3 = 0;
        }
        deepShortcutsContainer.addView(view, i3, layoutParams);
        deepShortcutsContainer.mArrow = view;
        view.setPivotX((float) (dimensionPixelSize / 2));
        View view2 = deepShortcutsContainer.mArrow;
        if (true == deepShortcutsContainer.mIsAboveIcon) {
            f2 = 0.0f;
        }
        view2.setPivotY(f2);
        deepShortcutsContainer.setVisibility(0);
        deepShortcutsContainer.mIsOpen = true;
        AnimatorSet createAnimatorSet = LauncherAnimUtils.createAnimatorSet();
        int childCount = deepShortcutsContainer.getChildCount() - 1;
        long integer = (long) deepShortcutsContainer.getResources().getInteger(R.integer.config_deepShortcutOpenDuration);
        long integer2 = (long) deepShortcutsContainer.getResources().getInteger(R.integer.config_deepShortcutOpenStagger);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        int i10 = 0;
        while (i10 < childCount) {
            final DeepShortcutView shortcutAt = deepShortcutsContainer.getShortcutAt(i10);
            shortcutAt.setVisibility(4);
            boolean z3 = deepShortcutsContainer.mIsAboveIcon;
            boolean z4 = deepShortcutsContainer.mIsLeftAligned;
            Point iconCenter = shortcutAt.getIconCenter();
            List list = shortcutIdsForItem;
            AnimatorSet animatorSet = createAnimatorSet;
            ValueAnimator createRevealAnimator = new DeepShortcutView.ZoomRevealOutlineProvider(iconCenter.x, iconCenter.y, shortcutAt.mPillRect, shortcutAt, shortcutAt.mIconView, z3, z4).createRevealAnimator(shortcutAt, false);
            shortcutAt.mOpenAnimationProgress = 0.0f;
            createRevealAnimator.addUpdateListener(shortcutAt);
            createRevealAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    DeepShortcutView.this.setVisibility(0);
                }
            });
            createRevealAnimator.setDuration(integer);
            createRevealAnimator.setStartDelay(((long) (deepShortcutsContainer.mIsAboveIcon ? (childCount - i10) - 1 : i10)) * integer2);
            createRevealAnimator.setInterpolator(decelerateInterpolator);
            AnimatorSet animatorSet2 = animatorSet;
            animatorSet2.play(createRevealAnimator);
            i10++;
            createAnimatorSet = animatorSet2;
            shortcutIdsForItem = list;
            BubbleTextView bubbleTextView3 = bubbleTextView;
        }
        AnimatorSet animatorSet3 = createAnimatorSet;
        List list2 = shortcutIdsForItem;
        animatorSet3.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DeepShortcutsContainer deepShortcutsContainer = DeepShortcutsContainer.this;
                deepShortcutsContainer.mOpenCloseAnimator = null;
                Utilities.sendCustomAccessibilityEvent(deepShortcutsContainer, 32, deepShortcutsContainer.getContext().getString(R.string.action_deep_shortcut));
            }
        });
        deepShortcutsContainer.mArrow.setScaleX(0.0f);
        deepShortcutsContainer.mArrow.setScaleY(0.0f);
        long j = integer / 6;
        LauncherViewPropertyAnimator launcherViewPropertyAnimator = new LauncherViewPropertyAnimator(deepShortcutsContainer.mArrow);
        launcherViewPropertyAnimator.scaleX$ar$ds(1.0f);
        launcherViewPropertyAnimator.scaleY$ar$ds(1.0f);
        launcherViewPropertyAnimator.setStartDelay(j);
        launcherViewPropertyAnimator.setDuration(integer - j);
        animatorSet3.play(launcherViewPropertyAnimator);
        deepShortcutsContainer.mOpenCloseAnimator = animatorSet3;
        animatorSet3.start();
        BubbleTextView bubbleTextView4 = bubbleTextView;
        deepShortcutsContainer.mDeferredDragIcon = bubbleTextView4;
        Bitmap createIconBitmap = Utilities.createIconBitmap(bubbleTextView4.mIcon, (Context) deepShortcutsContainer.mLauncher, 1.0f);
        float locationInDragLayer = deepShortcutsContainer.mLauncher.mDragLayer.getLocationInDragLayer(bubbleTextView4, deepShortcutsContainer.mTempXY);
        int round = Math.round(((float) deepShortcutsContainer.mTempXY[0]) - ((((float) createIconBitmap.getWidth()) - (((float) bubbleTextView.getWidth()) * locationInDragLayer)) / 2.0f));
        int round2 = Math.round((((float) deepShortcutsContainer.mTempXY[1]) - ((((float) createIconBitmap.getHeight()) - (locationInDragLayer * ((float) createIconBitmap.getHeight()))) / 2.0f)) - 4.0f);
        int paddingTop2 = bubbleTextView.getPaddingTop();
        int i11 = deepShortcutsContainer.mLauncher.mDragController.getMotionDown().x;
        int i12 = deepShortcutsContainer.mLauncher.mDragController.getMotionDown().y;
        DragView dragView = new DragView(deepShortcutsContainer.mLauncher, createIconBitmap, i11 - round, i12 - (round2 + paddingTop2), 1.0f, (float) deepShortcutsContainer.getResources().getDimensionPixelSize(R.dimen.deep_shortcuts_drag_view_scale));
        deepShortcutsContainer.mDragView = dragView;
        deepShortcutsContainer.mDistanceDragged = 0.0f;
        deepShortcutsContainer.mLastY = 0.0f;
        deepShortcutsContainer.mLastX = 0.0f;
        dragView.show(i11, i12);
        deepShortcutsContainer.mLauncher.mDragController.mListeners.add(deepShortcutsContainer);
        Looper looper = LauncherModel.sWorkerThread.getLooper();
        final Handler handler = new Handler(Looper.getMainLooper());
        ItemInfo itemInfo = (ItemInfo) bubbleTextView.getTag();
        final UserHandleCompat userHandleCompat = itemInfo.user;
        final String packageName = itemInfo.getTargetComponent().getPackageName();
        final List list3 = list2;
        new Handler(looper).postAtFrontOfQueue(new Runnable() {
            public final void run() {
                List queryForShortcutsContainer = DeepShortcutsContainer.this.mDeepShortcutsManager.queryForShortcutsContainer(packageName, list3, userHandleCompat);
                Collections.sort(queryForShortcutsContainer, ShortcutFilter.RANK_COMPARATOR);
                if (queryForShortcutsContainer.size() > 4) {
                    ArrayList arrayList = new ArrayList(4);
                    int size = queryForShortcutsContainer.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) queryForShortcutsContainer.get(i2);
                        int size2 = arrayList.size();
                        if (size2 < 4) {
                            arrayList.add(shortcutInfoCompat);
                            if (shortcutInfoCompat.isDynamic()) {
                                i++;
                            }
                        } else if (shortcutInfoCompat.isDynamic() && i < 2) {
                            i++;
                            arrayList.remove(size2 - i);
                            arrayList.add(shortcutInfoCompat);
                        }
                    }
                    queryForShortcutsContainer = arrayList;
                }
                if (DeepShortcutsContainer.this.mIsAboveIcon) {
                    Collections.reverse(queryForShortcutsContainer);
                }
                for (int i3 = 0; i3 < queryForShortcutsContainer.size(); i3++) {
                    Handler handler = handler;
                    DeepShortcutsContainer deepShortcutsContainer = DeepShortcutsContainer.this;
                    handler.post(new UpdateShortcutChild(i3, new UnbadgedShortcutInfo((ShortcutInfoCompat) queryForShortcutsContainer.get(i3), deepShortcutsContainer.mLauncher)));
                }
            }
        });
        bubbleTextView4.performHapticFeedback(0, 1);
        return deepShortcutsContainer;
    }

    public final void animateClose() {
        int i;
        ValueAnimator valueAnimator;
        if (this.mIsOpen) {
            Animator animator = this.mOpenCloseAnimator;
            if (animator != null) {
                animator.cancel();
            }
            int i2 = 0;
            this.mIsOpen = false;
            AnimatorSet createAnimatorSet = LauncherAnimUtils.createAnimatorSet();
            int childCount = getChildCount() - 1;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getShortcutAt(i4).mOpenAnimationProgress > 0.0f) {
                    i3++;
                }
            }
            long integer = (long) getResources().getInteger(R.integer.config_deepShortcutCloseDuration);
            long integer2 = (long) getResources().getInteger(R.integer.config_deepShortcutCloseStagger);
            int i5 = i3 - 1;
            long j = (((long) i5) * integer2) + ((4 * integer) / 6);
            boolean z = this.mIsAboveIcon;
            int i6 = z ? childCount - i3 : 0;
            if (z) {
                i2 = i5;
            }
            int i7 = i6;
            while (i7 < i6 + i3) {
                final DeepShortcutView shortcutAt = getShortcutAt(i7);
                if (shortcutAt.mIconView.getVisibility() == 0) {
                    boolean z2 = this.mIsAboveIcon;
                    boolean z3 = this.mIsLeftAligned;
                    Point iconCenter = shortcutAt.getIconCenter();
                    long j2 = j;
                    int i8 = i2;
                    AnimatorSet animatorSet = createAnimatorSet;
                    valueAnimator = new DeepShortcutView.ZoomRevealOutlineProvider(iconCenter.x, iconCenter.y, shortcutAt.mPillRect, shortcutAt, shortcutAt.mIconView, z2, z3).createRevealAnimator(shortcutAt, true);
                    valueAnimator.setDuration((long) (((float) integer) * shortcutAt.mOpenAnimationProgress));
                    valueAnimator.setInterpolator(new DeepShortcutView.CloseInterpolator(shortcutAt.mOpenAnimationProgress));
                    valueAnimator.setStartDelay(((long) (this.mIsAboveIcon ? i7 - i6 : (i3 - i7) - 1)) * integer2);
                    j = j2;
                    i = i8;
                    createAnimatorSet = animatorSet;
                } else {
                    int i9 = i2;
                    AnimatorSet animatorSet2 = createAnimatorSet;
                    long j3 = j;
                    int measuredHeight = shortcutAt.getMeasuredHeight() / 2;
                    int i10 = shortcutAt.getIconCenter().x;
                    valueAnimator = new PillWidthRevealOutlineProvider(shortcutAt.mPillRect, i10 - measuredHeight, i10 + measuredHeight).createRevealAnimator(shortcutAt, true);
                    valueAnimator.setDuration(150);
                    Point iconCenter2 = shortcutAt.getIconCenter();
                    shortcutAt.setPivotX((float) iconCenter2.x);
                    shortcutAt.setPivotY((float) iconCenter2.y);
                    float height = ((float) this.mLauncher.mDeviceProfile.iconSizePx) / ((float) shortcutAt.getHeight());
                    LauncherViewPropertyAnimator launcherViewPropertyAnimator = new LauncherViewPropertyAnimator(shortcutAt);
                    launcherViewPropertyAnimator.scaleX$ar$ds(height);
                    launcherViewPropertyAnimator.scaleY$ar$ds(height);
                    int i11 = this.mIconShift.x;
                    launcherViewPropertyAnimator.mPropertiesToSet.add(LauncherViewPropertyAnimator.Properties.TRANSLATION_X);
                    launcherViewPropertyAnimator.mTranslationX = (float) i11;
                    launcherViewPropertyAnimator.translationY$ar$ds$a88e89b9_0((float) this.mIconShift.y);
                    launcherViewPropertyAnimator.setDuration(150);
                    createAnimatorSet = animatorSet2;
                    createAnimatorSet.play(launcherViewPropertyAnimator);
                    i = i9;
                    j = i7 == i ? 0 : j3;
                }
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        DeepShortcutView.this.setVisibility(4);
                    }
                });
                createAnimatorSet.play(valueAnimator);
                i7++;
                i2 = i;
            }
            long j4 = j;
            LauncherViewPropertyAnimator launcherViewPropertyAnimator2 = new LauncherViewPropertyAnimator(this.mArrow);
            launcherViewPropertyAnimator2.scaleX$ar$ds(0.0f);
            launcherViewPropertyAnimator2.scaleY$ar$ds(0.0f);
            launcherViewPropertyAnimator2.setDuration(integer / 6);
            launcherViewPropertyAnimator2.setStartDelay(j);
            createAnimatorSet.play(launcherViewPropertyAnimator2);
            createAnimatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    DeepShortcutsContainer deepShortcutsContainer = DeepShortcutsContainer.this;
                    deepShortcutsContainer.mOpenCloseAnimator = null;
                    if (deepShortcutsContainer.mDeferContainerRemoval) {
                        deepShortcutsContainer.setVisibility(4);
                    } else {
                        deepShortcutsContainer.close();
                    }
                }
            });
            this.mOpenCloseAnimator = createAnimatorSet;
            createAnimatorSet.start();
        }
    }

    public final void close() {
        Animator animator = this.mOpenCloseAnimator;
        if (animator != null) {
            animator.cancel();
            this.mOpenCloseAnimator = null;
        }
        boolean z = false;
        this.mIsOpen = false;
        this.mDeferContainerRemoval = false;
        cleanupDeferredDrag(this.mDeferredDragIcon.getTag() instanceof AppInfo);
        long j = ((ItemInfo) this.mDeferredDragIcon.getTag()).container;
        BubbleTextView bubbleTextView = this.mDeferredDragIcon;
        if (j != -101) {
            z = true;
        }
        bubbleTextView.setTextVisibility(z);
        this.mLauncher.mDragController.mListeners.remove(this);
        this.mLauncher.mDragLayer.removeView(this);
    }

    public final float getIntrinsicIconScaleFactor() {
        return 1.0f;
    }

    public final DeepShortcutView getShortcutAt(int i) {
        if (!this.mIsAboveIcon) {
            i++;
        }
        return (DeepShortcutView) getChildAt(i);
    }

    public final void onDragEnd() {
        if (this.mIsOpen) {
            animateClose();
        } else if (this.mOpenCloseAnimator != null) {
            this.mDeferContainerRemoval = false;
        } else if (this.mDeferContainerRemoval) {
            close();
        }
    }

    public final void onDragStart$ar$ds(DragSource dragSource, Object obj) {
        animateClose();
    }

    public final void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z, boolean z2) {
        if (!z2) {
            dragObject.dragView.remove();
            this.mLauncher.showWorkspace(-1, true, (Runnable) null);
            this.mLauncher.mSearchDropTargetBar.onDragEnd();
        }
    }

    public final void onFlingToDeleteCompleted() {
    }

    public final boolean onLongClick(View view) {
        if (!view.isInTouchMode() || !(view.getParent() instanceof DeepShortcutView) || !this.mLauncher.isDraggingEnabled() || this.mLauncher.mDragController.mDragging) {
            return false;
        }
        this.mDeferContainerRemoval = true;
        DeepShortcutView deepShortcutView = (DeepShortcutView) view.getParent();
        deepShortcutView.mIconView.setVisibility(4);
        this.mIconShift.x = this.mIconLastTouchPos.x - deepShortcutView.getIconCenter().x;
        this.mIconShift.y = this.mIconLastTouchPos.y - this.mLauncher.mDeviceProfile.iconSizePx;
        DragView beginDragShared = this.mLauncher.mWorkspace.beginDragShared(deepShortcutView.mBubbleText, this, false, deepShortcutView.getFinalInfo(), new ShortcutDragPreviewProvider(deepShortcutView.mIconView, this.mIconShift));
        int i = -this.mIconShift.x;
        int i2 = -this.mIconShift.y;
        if (!beginDragShared.mAnim.isStarted()) {
            beginDragShared.mAnimatedShiftX = i;
            beginDragShared.mAnimatedShiftY = i2;
            beginDragShared.applyTranslation();
            beginDragShared.mAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(i, i2) {
                final /* synthetic */ int val$shiftX;
                final /* synthetic */ int val$shiftY;

                public final void onAnimationUpdate(
/*
Method generation error in method: com.android.launcher3.DragView.5.onAnimationUpdate(android.animation.ValueAnimator):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.android.launcher3.DragView.5.onAnimationUpdate(android.animation.ValueAnimator):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
        if (this.mDeferredDragIcon.getTag() instanceof AppInfo) {
            this.mLauncher.enterSpringLoadedDragMode();
        }
        this.mLauncher.closeFolder(true);
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && action != 2) {
            return false;
        }
        this.mIconLastTouchPos.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.mDeferredDragIcon == null || (findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId)) < 0) {
            return false;
        }
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        int action = motionEvent.getAction();
        DragLayer dragLayer = this.mLauncher.mDragLayer;
        Utilities.toGlobalMotionEvent(this, motionEvent);
        Utilities.toLocalMotionEvent(dragLayer, motionEvent);
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (action == 2) {
            float f = this.mLastX;
            if (!(f == 0.0f && this.mLastY == 0.0f)) {
                double d = (double) this.mDistanceDragged;
                double hypot = Math.hypot((double) (f - x), (double) (this.mLastY - y));
                Double.isNaN(d);
                this.mDistanceDragged = (float) (d + hypot);
            }
            this.mLastX = x;
            this.mLastY = y;
            int[] iArr = this.mTouchDown;
            if (Math.hypot((double) (((int) x) - iArr[0]), (double) (((int) y) - iArr[1])) > ((double) this.mStartDragThreshold)) {
                this.mSrcIconDragStarted = true;
                cleanupDeferredDrag(true);
                this.mDeferredDragIcon.getParent().requestDisallowInterceptTouchEvent(false);
                BubbleTextView bubbleTextView = this.mDeferredDragIcon;
                bubbleTextView.mOnLongClickListener.onLongClick(bubbleTextView);
                this.mLauncher.mDragController.onTouchEvent(motionEvent);
                return true;
            } else if (this.mDistanceDragged > ((float) this.mDragDeadzone)) {
                this.mDragView.setVisibility(0);
                this.mDragView.move(x2, y2);
                this.mDeferredDragIcon.setVisibility(4);
            }
        } else if (action == 1) {
            cleanupDeferredDrag(true);
        } else if (action == 3) {
            cleanupDeferredDrag(!this.mSrcIconDragStarted);
        }
        return true;
    }

    public final boolean supportsAppInfoDropTarget() {
        return true;
    }

    public final boolean supportsDeleteDropTarget() {
        return true;
    }

    public final boolean supportsFlingToDelete() {
        return true;
    }

    public DeepShortcutsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DeepShortcutsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIconShift = new Point();
        this.mTouchDown = null;
        this.mDistanceDragged = 0.0f;
        this.mTempRect = new Rect();
        this.mTempXY = new int[2];
        this.mIconLastTouchPos = new Point();
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        this.mDeepShortcutsManager = LauncherAppState.getInstance().mDeepShortcutManager;
        this.mDragDeadzone = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mStartDragThreshold = getResources().getDimensionPixelSize(R.dimen.deep_shortcuts_start_drag_threshold);
        this.mAccessibilityDelegate = new ShortcutMenuAccessibilityDelegate(launcher);
        this.mIsRtl = Utilities.isRtl(getResources());
    }
}
