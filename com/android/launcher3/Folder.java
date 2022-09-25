package com.android.launcher3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DragController;
import com.android.launcher3.DragLayer;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ExtendedEditText;
import com.android.launcher3.FocusHelper;
import com.android.launcher3.FolderInfo;
import com.android.launcher3.FolderPagedView;
import com.android.launcher3.Stats;
import com.android.launcher3.UninstallDropTarget;
import com.android.launcher3.Workspace;
import com.android.launcher3.accessibility.LauncherAccessibilityDelegate;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
public class Folder extends LinearLayout implements DragSource, View.OnClickListener, View.OnLongClickListener, DropTarget, FolderInfo.FolderListener, TextView.OnEditorActionListener, View.OnFocusChangeListener, DragController.DragListener, UninstallDropTarget.UninstallSource, LauncherAccessibilityDelegate.AccessibilityDragSource, Stats.LaunchSourceProvider {
    public static final Comparator ITEM_POS_COMPARATOR = new Comparator() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            ItemInfo itemInfo = (ItemInfo) obj;
            ItemInfo itemInfo2 = (ItemInfo) obj2;
            int i = itemInfo.rank;
            int i2 = itemInfo2.rank;
            if (i == i2 && (i = itemInfo.cellY) == (i2 = itemInfo2.cellY)) {
                return itemInfo.cellX - itemInfo2.cellX;
            }
            return i - i2;
        }
    };
    public static String sDefaultFolderName;
    private static String sHintText;
    private static final Rect sTempRect = new Rect();
    FolderPagedView mContent;
    View mContentWrapper;
    public ShortcutInfo mCurrentDragInfo;
    private View mCurrentDragView;
    int mCurrentScrollDir = -1;
    private boolean mDeferDropAfterUninstall;
    Runnable mDeferredAction;
    public boolean mDeleteFolderOnDropCompleted = false;
    public boolean mDestroyed;
    protected DragController mDragController;
    public boolean mDragInProgress = false;
    int mEmptyCellRank;
    public final int mExpandDuration;
    FolderIcon mFolderIcon;
    float mFolderIconPivotX;
    float mFolderIconPivotY;
    ExtendedEditText mFolderName;
    public View mFooter;
    private int mFooterHeight;
    public FolderInfo mInfo;
    private final InputMethodManager mInputMethodManager;
    public boolean mIsEditingName = false;
    public boolean mIsExternalDrag;
    public boolean mItemAddedBackToSelfViaIcon = false;
    final ArrayList mItemsInReadingOrder = new ArrayList();
    boolean mItemsInvalidated = false;
    protected final Launcher mLauncher;
    public final int mMaterialExpandDuration;
    public final int mMaterialExpandStagger;
    private final Alarm mOnExitAlarm = new Alarm();
    OnAlarmListener mOnExitAlarmListener = new OnAlarmListener() {
        public final void onAlarm$ar$ds() {
            Folder.this.completeDragExit();
        }
    };
    private final Alarm mOnScrollHintAlarm = new Alarm();
    int mPrevTargetRank;
    private boolean mRearrangeOnClose = false;
    private final Alarm mReorderAlarm = new Alarm();
    OnAlarmListener mReorderAlarmListener = new OnAlarmListener() {
        public final void onAlarm$ar$ds() {
            int i;
            int i2;
            Folder folder = Folder.this;
            FolderPagedView folderPagedView = folder.mContent;
            int i3 = folder.mEmptyCellRank;
            int i4 = folder.mTargetRank;
            folderPagedView.completePendingPageChanges();
            int nextPage = folderPagedView.getNextPage();
            int i5 = folderPagedView.mMaxItemsPerPage;
            int i6 = i4 / i5;
            int i7 = i4 % i5;
            if (i6 != nextPage) {
                Log.e("FolderPagedView", "Cannot animate when the target cell is invisible");
            }
            int i8 = folderPagedView.mMaxItemsPerPage;
            int i9 = i3 % i8;
            int i10 = i3 / i8;
            if (i4 != i3) {
                int i11 = 0;
                int i12 = -1;
                if (i4 > i3) {
                    if (i10 < nextPage) {
                        i12 = nextPage * i8;
                        i9 = 0;
                    } else {
                        i3 = -1;
                    }
                    i = 1;
                } else {
                    if (i10 > nextPage) {
                        i2 = ((nextPage + 1) * i8) - 1;
                        i9 = i8 - 1;
                    } else {
                        i2 = -1;
                        i3 = -1;
                    }
                    i12 = i2;
                    i = -1;
                }
                while (i3 != i12) {
                    int i13 = i3 + i;
                    int i14 = folderPagedView.mMaxItemsPerPage;
                    int i15 = i13 / i14;
                    int i16 = i13 % i14;
                    int i17 = folderPagedView.mGridCountX;
                    int i18 = i16 % i17;
                    int i19 = i16 / i17;
                    CellLayout cellLayout = (CellLayout) folderPagedView.getChildAt(i15);
                    View childAt = cellLayout.mShortcutsAndWidgets.getChildAt(i18, i19);
                    if (childAt != null) {
                        if (nextPage != i15) {
                            cellLayout.removeView(childAt);
                            folderPagedView.addViewForRank(childAt, (ShortcutInfo) childAt.getTag(), i3);
                        } else {
                            FolderPagedView.C52661 r13 = new Runnable(childAt, childAt.getTranslationX(), i3) {
                                final /* synthetic */ int val$newRank;
                                final /* synthetic */ float val$oldTranslateX;
                                final /* synthetic */ View val$v;

                                {
                                    this.val$v = r2;
                                    this.val$oldTranslateX = r3;
                                    this.val$newRank = r4;
                                }

                                public final void run() {
                                    FolderPagedView.this.mPendingAnimations.remove(this.val$v);
                                    this.val$v.setTranslationX(this.val$oldTranslateX);
                                    ((CellLayout) this.val$v.getParent().getParent()).removeView(this.val$v);
                                    FolderPagedView folderPagedView = FolderPagedView.this;
                                    View view = this.val$v;
                                    folderPagedView.addViewForRank(view, (ShortcutInfo) view.getTag(), this.val$newRank);
                                }
                            };
                            childAt.animate().translationXBy((float) ((i > 0) ^ folderPagedView.mIsRtl ? -childAt.getWidth() : childAt.getWidth())).setDuration(230).setStartDelay(0).withEndAction(r13);
                            folderPagedView.mPendingAnimations.put(childAt, r13);
                        }
                    }
                    i3 = i13;
                }
                if ((i7 - i9) * i > 0) {
                    CellLayout cellLayout2 = (CellLayout) folderPagedView.getChildAt(nextPage);
                    float f = 30.0f;
                    while (i9 != i7) {
                        int i20 = i9 + i;
                        int i21 = folderPagedView.mGridCountX;
                        View childAt2 = cellLayout2.mShortcutsAndWidgets.getChildAt(i20 % i21, i20 / i21);
                        if (childAt2 != null) {
                            ((ItemInfo) childAt2.getTag()).rank -= i;
                        }
                        int i22 = folderPagedView.mGridCountX;
                        if (cellLayout2.animateChildToPosition(childAt2, i9 % i22, i9 / i22, 230, i11, true, true)) {
                            f *= 0.9f;
                            i11 = (int) (((float) i11) + f);
                        }
                        i9 = i20;
                    }
                }
            }
            Folder folder2 = Folder.this;
            folder2.mEmptyCellRank = folder2.mTargetRank;
        }
    };
    private int mScrollAreaOffset;
    int mScrollHintDir = -1;
    final Alarm mScrollPauseAlarm = new Alarm();
    int mState = -1;
    private boolean mSuppressFolderDeletion = false;
    boolean mSuppressOnAdd = false;
    int mTargetRank;
    private boolean mUninstallSuccessful;

    /* compiled from: PG */
    final class OnScrollFinishedListener implements OnAlarmListener {
        private final DropTarget.DragObject mDragObject;

        public OnScrollFinishedListener(DropTarget.DragObject dragObject) {
            this.mDragObject = dragObject;
        }

        public final void onAlarm$ar$ds() {
            Folder.this.onDragOver$ar$ds(this.mDragObject);
        }
    }

    /* compiled from: PG */
    final class OnScrollHintListener implements OnAlarmListener {
        private final DropTarget.DragObject mDragObject;

        public OnScrollHintListener(DropTarget.DragObject dragObject) {
            this.mDragObject = dragObject;
        }

        public final void onAlarm$ar$ds() {
            Folder folder = Folder.this;
            int i = folder.mCurrentScrollDir;
            if (i == 0) {
                folder.mContent.scrollLeft();
                Folder.this.mScrollHintDir = -1;
            } else if (i == 1) {
                folder.mContent.scrollRight();
                Folder.this.mScrollHintDir = -1;
            } else {
                return;
            }
            Folder folder2 = Folder.this;
            folder2.mCurrentScrollDir = -1;
            Alarm alarm = folder2.mScrollPauseAlarm;
            alarm.mAlarmListener = new OnScrollFinishedListener(this.mDragObject);
            alarm.setAlarm(900);
        }
    }

    public Folder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAlwaysDrawnWithCacheEnabled(false);
        this.mInputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        Resources resources = getResources();
        this.mExpandDuration = resources.getInteger(R.integer.config_folderExpandDuration);
        this.mMaterialExpandDuration = resources.getInteger(R.integer.config_materialFolderExpandDuration);
        this.mMaterialExpandStagger = resources.getInteger(R.integer.config_materialFolderExpandStagger);
        if (sDefaultFolderName == null) {
            sDefaultFolderName = resources.getString(R.string.folder_name);
        }
        if (sHintText == null) {
            sHintText = resources.getString(R.string.folder_hint_text);
        }
        this.mLauncher = Launcher.getLauncher(context);
        setFocusableInTouchMode(true);
    }

    private final boolean beginDrag(View view, boolean z) {
        Object tag = view.getTag();
        if (tag instanceof ShortcutInfo) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) tag;
            if (!view.isInTouchMode()) {
                return false;
            }
            this.mLauncher.mWorkspace.beginDragShared(view, this, z);
            this.mCurrentDragInfo = shortcutInfo;
            this.mEmptyCellRank = shortcutInfo.rank;
            this.mCurrentDragView = view;
            this.mContent.removeItem(view);
            this.mInfo.remove(this.mCurrentDragInfo);
            this.mDragInProgress = true;
            this.mItemAddedBackToSelfViaIcon = false;
        }
        return true;
    }

    private final void clearDragInfo() {
        this.mCurrentDragInfo = null;
        this.mCurrentDragView = null;
        this.mSuppressOnAdd = false;
        this.mIsExternalDrag = false;
    }

    static Folder fromXml(Launcher launcher) {
        return (Folder) launcher.getLayoutInflater().inflate(R.layout.user_folder, (ViewGroup) null);
    }

    private final int getTargetRank(DropTarget.DragObject dragObject, float[] fArr) {
        float[] visualCenter = dragObject.getVisualCenter(fArr);
        FolderPagedView folderPagedView = this.mContent;
        float f = visualCenter[0];
        int paddingLeft = getPaddingLeft();
        float f2 = visualCenter[1];
        int paddingTop = getPaddingTop();
        int nextPage = folderPagedView.getNextPage();
        CellLayout cellLayout = (CellLayout) folderPagedView.getChildAt(nextPage);
        cellLayout.findNearestArea(((int) f) - paddingLeft, ((int) f2) - paddingTop, 1, 1, 1, 1, false, FolderPagedView.sTempPosArray, (int[]) null);
        if (folderPagedView.mFolder.getLayoutDirection() == 1) {
            int[] iArr = FolderPagedView.sTempPosArray;
            iArr[0] = (cellLayout.mCountX - iArr[0]) - 1;
        }
        int i = folderPagedView.mAllocatedContentSize;
        int i2 = folderPagedView.mMaxItemsPerPage;
        int[] iArr2 = FolderPagedView.sTempPosArray;
        return Math.min(i - 1, (nextPage * i2) + (iArr2[1] * folderPagedView.mGridCountX) + iArr2[0]);
    }

    private final void showScrollHint(int i, DropTarget.DragObject dragObject) {
        if (this.mScrollHintDir != i) {
            FolderPagedView folderPagedView = this.mContent;
            int scrollForPage = (folderPagedView.getScrollForPage(folderPagedView.getNextPage()) + ((int) ((true != ((i ^ true) ^ folderPagedView.mIsRtl) ? 0.07f : -0.07f) * ((float) folderPagedView.getWidth())))) - folderPagedView.getScrollX();
            if (scrollForPage != 0) {
                folderPagedView.mScroller.mInterpolator = new DecelerateInterpolator();
                folderPagedView.mScroller.startScroll$ar$ds(folderPagedView.getScrollX(), scrollForPage, 500);
                folderPagedView.invalidate();
            }
            this.mScrollHintDir = i;
        }
        Alarm alarm = this.mOnScrollHintAlarm;
        if (!alarm.mAlarmPending || this.mCurrentScrollDir != i) {
            this.mCurrentScrollDir = i;
            alarm.cancelAlarm();
            Alarm alarm2 = this.mOnScrollHintAlarm;
            alarm2.mAlarmListener = new OnScrollHintListener(dragObject);
            alarm2.setAlarm(500);
            this.mReorderAlarm.cancelAlarm();
            this.mTargetRank = this.mEmptyCellRank;
        }
    }

    private final void updateItemLocationsInDatabaseBatch() {
        ArrayList itemsInReadingOrder = getItemsInReadingOrder();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < itemsInReadingOrder.size(); i++) {
            ItemInfo itemInfo = (ItemInfo) ((View) itemsInReadingOrder.get(i)).getTag();
            itemInfo.rank = i;
            arrayList.add(itemInfo);
        }
        LauncherModel.moveItemsInDatabase$ar$ds(this.mLauncher, arrayList, this.mInfo.f16556id);
    }

    public final boolean acceptDrop(DropTarget.DragObject dragObject) {
        int i = ((ItemInfo) dragObject.dragInfo).itemType;
        return i == 0 || i == 1 || i == 6;
    }

    public final void centerAboutIcon() {
        DragLayer.LayoutParams layoutParams;
        int i;
        DragLayer.LayoutParams layoutParams2 = (DragLayer.LayoutParams) getLayoutParams();
        int paddingLeft = getPaddingLeft() + getPaddingRight() + this.mContent.getDesiredWidth();
        int folderHeight = getFolderHeight(getContentAreaHeight());
        FolderIcon folderIcon = this.mFolderIcon;
        Rect rect = sTempRect;
        float descendantRectRelativeToSelf = ((DragLayer) this.mLauncher.mLauncherView.findViewById(R.id.drag_layer)).getDescendantRectRelativeToSelf(folderIcon, rect);
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        int i2 = paddingLeft / 2;
        int width = ((int) (((float) rect.left) + ((((float) rect.width()) * descendantRectRelativeToSelf) / 2.0f))) - i2;
        int i3 = folderHeight / 2;
        int height = ((int) (((float) rect.top) + ((((float) rect.height()) * descendantRectRelativeToSelf) / 2.0f))) - i3;
        Workspace workspace = this.mLauncher.mWorkspace;
        CellLayout cellLayout = (CellLayout) workspace.getChildAt(workspace.getNextPage());
        if (cellLayout != null) {
            ShortcutAndWidgetContainer shortcutAndWidgetContainer = cellLayout.mShortcutsAndWidgets;
            workspace.mTempXY[0] = workspace.getViewportOffsetX() + workspace.getPaddingLeft() + shortcutAndWidgetContainer.getLeft();
            workspace.mTempXY[1] = cellLayout.getTop() + shortcutAndWidgetContainer.getTop();
            float descendantCoordRelativeToParent = Utilities.getDescendantCoordRelativeToParent(workspace, workspace.mLauncher.mDragLayer, workspace.mTempXY, false);
            int[] iArr = workspace.mTempXY;
            int i4 = iArr[0];
            layoutParams = layoutParams2;
            rect.set(i4, iArr[1], (int) (((float) i4) + (((float) shortcutAndWidgetContainer.getMeasuredWidth()) * descendantCoordRelativeToParent)), (int) (((float) workspace.mTempXY[1]) + (descendantCoordRelativeToParent * ((float) shortcutAndWidgetContainer.getMeasuredHeight()))));
        } else {
            layoutParams = layoutParams2;
        }
        int min = Math.min(Math.max(rect.left, width), (rect.left + rect.width()) - paddingLeft);
        int min2 = Math.min(Math.max(rect.top, height), (rect.top + rect.height()) - folderHeight);
        if (deviceProfile.isPhone && (i = deviceProfile.availableWidthPx - paddingLeft) < deviceProfile.iconSizePx) {
            min = i / 2;
        } else if (paddingLeft >= rect.width()) {
            min = rect.left + ((rect.width() - paddingLeft) / 2);
        }
        if (folderHeight >= rect.height()) {
            min2 = rect.top + ((rect.height() - folderHeight) / 2);
        }
        float f = (float) (i2 + (width - min));
        setPivotX(f);
        float f2 = (float) (i3 + (height - min2));
        setPivotY(f2);
        this.mFolderIconPivotX = (float) ((int) (((float) this.mFolderIcon.getMeasuredWidth()) * (f / ((float) paddingLeft))));
        this.mFolderIconPivotY = (float) ((int) (((float) this.mFolderIcon.getMeasuredHeight()) * (f2 / ((float) folderHeight))));
        DragLayer.LayoutParams layoutParams3 = layoutParams;
        layoutParams3.width = paddingLeft;
        layoutParams3.height = folderHeight;
        layoutParams3.f16550x = min;
        layoutParams3.f16551y = min2;
    }

    public final void close(boolean z) {
        DragLayer dragLayer = (DragLayer) getParent();
        if (dragLayer != null) {
            dragLayer.removeView(this);
        }
        this.mDragController.mDropTargets.remove(this);
        clearFocus();
        if (z) {
            this.mFolderIcon.requestFocus();
        }
        if (this.mRearrangeOnClose) {
            rearrangeChildren$ar$ds();
            this.mRearrangeOnClose = false;
        }
        if (this.mContent.getItemCount() <= 1) {
            if (this.mDragInProgress) {
                this.mDeleteFolderOnDropCompleted = true;
            } else if (!this.mSuppressFolderDeletion) {
                replaceFolderWithFinalItem();
            }
        }
        this.mSuppressFolderDeletion = false;
        clearDragInfo();
        this.mState = 0;
    }

    public final void completeDragExit() {
        if (this.mInfo.opened) {
            this.mLauncher.closeFolder(true);
            this.mRearrangeOnClose = true;
        } else if (this.mState == 1) {
            this.mRearrangeOnClose = true;
        } else {
            rearrangeChildren$ar$ds();
            clearDragInfo();
        }
    }

    public final void deferCompleteDropAfterUninstallActivity() {
        this.mDeferDropAfterUninstall = true;
    }

    public final void dismissEditingName() {
        this.mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        doneEditingFolderName$ar$ds();
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void doneEditingFolderName$ar$ds() {
        this.mFolderName.setHint(sHintText);
        String obj = this.mFolderName.getText().toString();
        FolderInfo folderInfo = this.mInfo;
        folderInfo.title = obj;
        for (int i = 0; i < folderInfo.listeners.size(); i++) {
            ((FolderInfo.FolderListener) folderInfo.listeners.get(i)).onTitleChanged(obj);
        }
        LauncherModel.updateItemInDatabase(this.mLauncher, this.mInfo);
        Utilities.sendCustomAccessibilityEvent(this, 32, getContext().getString(R.string.folder_renamed, new Object[]{obj}));
        this.mFolderName.clearFocus();
        Selection.setSelection(this.mFolderName.getText(), 0, 0);
        this.mIsEditingName = false;
    }

    public final void enableAccessibleDrag(boolean z) {
        this.mLauncher.mSearchDropTargetBar.enableAccessibleDrag(z);
        int i = 0;
        for (int i2 = 0; i2 < this.mContent.getChildCount(); i2++) {
            ((CellLayout) this.mContent.getChildAt(i2)).enableAccessibleDrag(z, 1);
        }
        View view = this.mFooter;
        if (true == z) {
            i = 4;
        }
        view.setImportantForAccessibility(i);
        this.mLauncher.mWorkspace.mAddNewPageOnDrag = !z;
    }

    public final void fillInLaunchSourceData(View view, Bundle bundle) {
        Stats.LaunchSourceUtils.populateSourceDataFromAncestorProvider(this.mFolderIcon, bundle);
        bundle.putString("sub_container", "folder");
        bundle.putInt("sub_container_page", this.mContent.mCurrentPage);
    }

    public final int getContentAreaHeight() {
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        Rect workspacePadding = deviceProfile.getWorkspacePadding(this.mContent.mIsRtl);
        int i = ((deviceProfile.availableHeightPx - workspacePadding.top) - workspacePadding.bottom) - this.mFooterHeight;
        FolderPagedView folderPagedView = this.mContent;
        int i2 = 0;
        if (folderPagedView.getChildCount() > 0) {
            CellLayout cellLayout = (CellLayout) folderPagedView.getChildAt(0);
            int paddingTop = cellLayout.getPaddingTop();
            int paddingBottom = cellLayout.getPaddingBottom();
            int i3 = cellLayout.mCountY;
            int i4 = cellLayout.mCellHeight;
            Math.max(i3 - 1, 0);
            int i5 = cellLayout.mHeightGap;
            i2 = paddingTop + paddingBottom + (i3 * i4) + folderPagedView.getPaddingTop() + folderPagedView.getPaddingBottom();
        }
        return Math.max(Math.min(i, i2), 5);
    }

    public final int getFolderHeight(int i) {
        return getPaddingTop() + getPaddingBottom() + i + this.mFooterHeight;
    }

    public final void getHitRectRelativeToDragLayer(Rect rect) {
        getHitRect(rect);
        rect.left -= this.mScrollAreaOffset;
        rect.right += this.mScrollAreaOffset;
    }

    public final float getIntrinsicIconScaleFactor() {
        return 1.0f;
    }

    public final ArrayList getItemsInReadingOrder() {
        if (this.mItemsInvalidated) {
            this.mItemsInReadingOrder.clear();
            this.mContent.iterateOverItems(new Workspace.ItemOperator() {
                public final boolean evaluate(ItemInfo itemInfo, View view, View view2) {
                    Folder.this.mItemsInReadingOrder.add(view);
                    return false;
                }
            });
            this.mItemsInvalidated = false;
        }
        return this.mItemsInReadingOrder;
    }

    public final View getViewForInfo(final ShortcutInfo shortcutInfo) {
        return this.mContent.iterateOverItems(new Workspace.ItemOperator() {
            public final boolean evaluate(ItemInfo itemInfo, View view, View view2) {
                return itemInfo == ShortcutInfo.this;
            }
        });
    }

    public final boolean isDropEnabled() {
        return true;
    }

    public final void onAdd(ShortcutInfo shortcutInfo) {
        if (!this.mSuppressOnAdd) {
            FolderPagedView folderPagedView = this.mContent;
            folderPagedView.addViewForRank(folderPagedView.createNewView(shortcutInfo), shortcutInfo, folderPagedView.allocateRankForNewItem$ar$ds());
            this.mItemsInvalidated = true;
            LauncherModel.addOrMoveItemInDatabase(this.mLauncher, shortcutInfo, this.mInfo.f16556id, 0, shortcutInfo.cellX, shortcutInfo.cellY);
        }
    }

    public final void onClick(View view) {
        if (view.getTag() instanceof ShortcutInfo) {
            this.mLauncher.onClick(view);
        }
    }

    public final void onDragEnd() {
        if (this.mIsExternalDrag && this.mDragInProgress) {
            completeDragExit();
        }
        this.mDragController.mListeners.remove(this);
    }

    public final void onDragEnter(DropTarget.DragObject dragObject) {
        this.mPrevTargetRank = -1;
        this.mOnExitAlarm.cancelAlarm();
        this.mScrollAreaOffset = (dragObject.dragView.mDragRegion.width() / 2) - dragObject.xOffset;
    }

    public final void onDragExit(DropTarget.DragObject dragObject) {
        if (!dragObject.dragComplete) {
            Alarm alarm = this.mOnExitAlarm;
            alarm.mAlarmListener = this.mOnExitAlarmListener;
            alarm.setAlarm(400);
        }
        this.mReorderAlarm.cancelAlarm();
        this.mOnScrollHintAlarm.cancelAlarm();
        this.mScrollPauseAlarm.cancelAlarm();
        if (this.mScrollHintDir != -1) {
            this.mContent.clearScrollHint();
            this.mScrollHintDir = -1;
        }
    }

    public final void onDragOver(DropTarget.DragObject dragObject) {
        onDragOver$ar$ds(dragObject);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        if (r0 == false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDragOver$ar$ds(com.android.launcher3.DropTarget.DragObject r8) {
        /*
            r7 = this;
            com.android.launcher3.Alarm r0 = r7.mScrollPauseAlarm
            boolean r0 = r0.mAlarmPending
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 2
            float[] r0 = new float[r0]
            int r1 = r7.getTargetRank(r8, r0)
            r7.mTargetRank = r1
            int r2 = r7.mPrevTargetRank
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x0047
            com.android.launcher3.Alarm r1 = r7.mReorderAlarm
            r1.cancelAlarm()
            com.android.launcher3.Alarm r1 = r7.mReorderAlarm
            com.android.launcher3.OnAlarmListener r2 = r7.mReorderAlarmListener
            r1.mAlarmListener = r2
            r5 = 250(0xfa, double:1.235E-321)
            r1.setAlarm(r5)
            int r1 = r7.mTargetRank
            r7.mPrevTargetRank = r1
            com.android.launcher3.accessibility.DragViewStateAnnouncer r1 = r8.stateAnnouncer
            if (r1 == 0) goto L_0x0047
            android.content.Context r2 = r7.getContext()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            int r6 = r7.mTargetRank
            int r6 = r6 + r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r4] = r6
            r6 = 2132089479(0x7f151a87, float:1.981927E38)
            java.lang.String r2 = r2.getString(r6, r5)
            r1.announce(r2)
        L_0x0047:
            r0 = r0[r4]
            com.android.launcher3.FolderPagedView r1 = r7.mContent
            int r1 = r1.getNextPage()
            com.android.launcher3.FolderPagedView r2 = r7.mContent
            int r5 = r2.getNextPage()
            android.view.View r2 = r2.getChildAt(r5)
            com.android.launcher3.CellLayout r2 = (com.android.launcher3.CellLayout) r2
            int r2 = r2.mCellWidth
            float r2 = (float) r2
            r5 = 1055286886(0x3ee66666, float:0.45)
            float r2 = r2 * r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0069
            r5 = 1
            goto L_0x006a
        L_0x0069:
            r5 = 0
        L_0x006a:
            int r6 = r7.getWidth()
            float r6 = (float) r6
            float r6 = r6 - r2
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            if (r1 <= 0) goto L_0x008b
            com.android.launcher3.FolderPagedView r2 = r7.mContent
            boolean r2 = r2.mIsRtl
            if (r2 == 0) goto L_0x0082
            if (r0 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0082:
            if (r5 != 0) goto L_0x0087
            r4 = r0
            r5 = 0
            goto L_0x008c
        L_0x0087:
            r7.showScrollHint(r4, r8)
            return
        L_0x008b:
            r4 = r0
        L_0x008c:
            com.android.launcher3.FolderPagedView r0 = r7.mContent
            int r0 = r0.getChildCount()
            r2 = -1
            int r0 = r0 + r2
            if (r1 >= r0) goto L_0x00a5
            com.android.launcher3.FolderPagedView r0 = r7.mContent
            boolean r0 = r0.mIsRtl
            if (r0 == 0) goto L_0x009f
            if (r5 != 0) goto L_0x00a1
            goto L_0x00a5
        L_0x009f:
            if (r4 == 0) goto L_0x00a5
        L_0x00a1:
            r7.showScrollHint(r3, r8)
            return
        L_0x00a5:
            com.android.launcher3.Alarm r8 = r7.mOnScrollHintAlarm
            r8.cancelAlarm()
            int r8 = r7.mScrollHintDir
            if (r8 == r2) goto L_0x00b5
            com.android.launcher3.FolderPagedView r8 = r7.mContent
            r8.clearScrollHint()
            r7.mScrollHintDir = r2
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Folder.onDragOver$ar$ds(com.android.launcher3.DropTarget$DragObject):void");
    }

    public final void onDragStart$ar$ds(DragSource dragSource, Object obj) {
    }

    public final void onDrop(DropTarget.DragObject dragObject) {
        View view;
        boolean z;
        DropTarget.DragObject dragObject2 = dragObject;
        DragSource dragSource = dragObject2.dragSource;
        C524614 r9 = (dragSource == this.mLauncher.mWorkspace || (dragSource instanceof Folder)) ? null : new Runnable() {
            public final void run() {
                Folder.this.mLauncher.exitSpringLoadedDragModeDelayed$ar$ds(true, 300);
            }
        };
        FolderPagedView folderPagedView = this.mContent;
        if (this.mEmptyCellRank / folderPagedView.mMaxItemsPerPage != folderPagedView.getNextPage()) {
            this.mTargetRank = getTargetRank(dragObject2, (float[]) null);
            this.mReorderAlarmListener.onAlarm$ar$ds();
            this.mOnScrollHintAlarm.cancelAlarm();
            this.mScrollPauseAlarm.cancelAlarm();
        }
        this.mContent.completePendingPageChanges();
        ShortcutInfo shortcutInfo = this.mCurrentDragInfo;
        if (this.mIsExternalDrag) {
            FolderPagedView folderPagedView2 = this.mContent;
            int i = this.mEmptyCellRank;
            View createNewView = folderPagedView2.createNewView(shortcutInfo);
            folderPagedView2.addViewForRank(createNewView, shortcutInfo, i);
            LauncherModel.addOrMoveItemInDatabase(this.mLauncher, shortcutInfo, this.mInfo.f16556id, 0, shortcutInfo.cellX, shortcutInfo.cellY);
            if (dragObject2.dragSource != this) {
                updateItemLocationsInDatabaseBatch();
            }
            this.mIsExternalDrag = false;
            view = createNewView;
        } else {
            View view2 = this.mCurrentDragView;
            this.mContent.addViewForRank(view2, shortcutInfo, this.mEmptyCellRank);
            view = view2;
        }
        if (dragObject2.dragView.mHasDrawn) {
            float scaleX = getScaleX();
            float scaleY = getScaleY();
            setScaleX(1.0f);
            setScaleY(1.0f);
            z = false;
            this.mLauncher.mDragLayer.animateViewIntoPosition(dragObject2.dragView, view, -1, r9, (View) null);
            setScaleX(scaleX);
            setScaleY(scaleY);
        } else {
            z = false;
            dragObject2.deferDragViewCleanupPostAnimation = false;
            view.setVisibility(0);
        }
        this.mItemsInvalidated = true;
        rearrangeChildren$ar$ds();
        this.mSuppressOnAdd = true;
        this.mInfo.add(shortcutInfo);
        this.mSuppressOnAdd = z;
        this.mCurrentDragInfo = null;
        this.mDragInProgress = z;
        if (this.mContent.getChildCount() > 1) {
            this.mInfo.setOption(4, true, this.mLauncher);
        }
    }

    public final void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z, boolean z2) {
        View view2;
        if (this.mDeferDropAfterUninstall) {
            Log.d("Launcher.Folder", "Deferred handling drop because waiting for uninstall.");
            final View view3 = view;
            final DropTarget.DragObject dragObject2 = dragObject;
            final boolean z3 = z;
            final boolean z4 = z2;
            this.mDeferredAction = new Runnable() {
                public final void run() {
                    Folder.this.onDropCompleted(view3, dragObject2, z3, z4);
                    Folder.this.mDeferredAction = null;
                }
            };
            return;
        }
        boolean z5 = z2 && (this.mDeferredAction == null || this.mUninstallSuccessful);
        if (!z5) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) dragObject.dragInfo;
            View view4 = this.mCurrentDragView;
            if (view4 == null || view4.getTag() != shortcutInfo) {
                view2 = this.mContent.createNewView(shortcutInfo);
            } else {
                view2 = this.mCurrentDragView;
            }
            ArrayList itemsInReadingOrder = getItemsInReadingOrder();
            itemsInReadingOrder.add(shortcutInfo.rank, view2);
            this.mContent.arrangeChildren(itemsInReadingOrder, itemsInReadingOrder.size(), true);
            this.mItemsInvalidated = true;
            this.mSuppressOnAdd = true;
            this.mFolderIcon.onDrop(dragObject);
            this.mSuppressOnAdd = false;
        } else if (this.mDeleteFolderOnDropCompleted && !this.mItemAddedBackToSelfViaIcon && view != this) {
            replaceFolderWithFinalItem();
        }
        if (view != this) {
            Alarm alarm = this.mOnExitAlarm;
            if (alarm.mAlarmPending) {
                alarm.cancelAlarm();
                if (!z5) {
                    this.mSuppressFolderDeletion = true;
                }
                this.mScrollPauseAlarm.cancelAlarm();
                completeDragExit();
            }
        }
        this.mDeleteFolderOnDropCompleted = false;
        this.mDragInProgress = false;
        this.mItemAddedBackToSelfViaIcon = false;
        this.mCurrentDragInfo = null;
        this.mCurrentDragView = null;
        this.mSuppressOnAdd = false;
        updateItemLocationsInDatabaseBatch();
        if (this.mContent.getItemCount() <= this.mContent.mMaxItemsPerPage) {
            this.mInfo.setOption(4, false, this.mLauncher);
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        dismissEditingName();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.mContentWrapper = findViewById(R.id.folder_content_wrapper);
        FolderPagedView folderPagedView = (FolderPagedView) findViewById(R.id.folder_content);
        this.mContent = folderPagedView;
        folderPagedView.mFolder = this;
        folderPagedView.mFocusIndicatorView = (FocusIndicatorView) findViewById(R.id.focus_indicator);
        folderPagedView.mKeyListener = new FocusHelper.PagedFolderKeyEventListener(this);
        folderPagedView.mPageIndicator = (PageIndicator) findViewById(R.id.folder_page_indicator);
        ExtendedEditText extendedEditText = (ExtendedEditText) findViewById(R.id.folder_name);
        this.mFolderName = extendedEditText;
        extendedEditText.mBackKeyListener = new ExtendedEditText.OnBackKeyListener() {
            public final boolean onBackKey() {
                Folder.this.doneEditingFolderName$ar$ds();
                return false;
            }
        };
        extendedEditText.setOnFocusChangeListener(this);
        if (!Utilities.ATLEAST_MARSHMALLOW) {
            this.mFolderName.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
                public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                public final void onDestroyActionMode(ActionMode actionMode) {
                }

                public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            });
        }
        this.mFolderName.setOnEditorActionListener(this);
        this.mFolderName.setSelectAllOnFocus(true);
        ExtendedEditText extendedEditText2 = this.mFolderName;
        extendedEditText2.setInputType(extendedEditText2.getInputType() | 532480);
        View findViewById = findViewById(R.id.folder_footer);
        this.mFooter = findViewById;
        findViewById.measure(0, 0);
        this.mFooterHeight = this.mFooter.getMeasuredHeight();
    }

    public final void onFlingToDelete(DropTarget.DragObject dragObject, PointF pointF) {
    }

    public final void onFlingToDeleteCompleted() {
    }

    public final void onFocusChange(View view, boolean z) {
        ExtendedEditText extendedEditText = this.mFolderName;
        if (view != extendedEditText) {
            return;
        }
        if (z) {
            extendedEditText.setHint(BuildConfig.FLAVOR);
            this.mIsEditingName = true;
            return;
        }
        dismissEditingName();
    }

    public final void onItemsChanged() {
        updateTextViewFocus();
    }

    public final boolean onLongClick(View view) {
        if (!this.mLauncher.isDraggingEnabled()) {
            return true;
        }
        return beginDrag(view, false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int max = Math.max(this.mContent.getDesiredWidth(), 5);
        int contentAreaHeight = getContentAreaHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(contentAreaHeight, 1073741824);
        FolderPagedView folderPagedView = this.mContent;
        int paddingLeft = max - (folderPagedView.getPaddingLeft() + folderPagedView.getPaddingRight());
        int paddingTop = contentAreaHeight - (folderPagedView.getPaddingTop() + folderPagedView.getPaddingBottom());
        int childCount = folderPagedView.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            CellLayout cellLayout = (CellLayout) folderPagedView.getChildAt(childCount);
            cellLayout.mFixedWidth = paddingLeft;
            cellLayout.mFixedHeight = paddingTop;
        }
        this.mContentWrapper.measure(makeMeasureSpec, makeMeasureSpec2);
        if (this.mContent.getChildCount() > 0) {
            int i3 = (((CellLayout) this.mContent.getChildAt(0)).mCellWidth - this.mLauncher.mDeviceProfile.iconSizePx) / 2;
            this.mFooter.setPadding(this.mContent.getPaddingLeft() + i3, this.mFooter.getPaddingTop(), this.mContent.getPaddingRight() + i3, this.mFooter.getPaddingBottom());
        }
        this.mFooter.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.mFooterHeight, 1073741824));
        setMeasuredDimension(getPaddingLeft() + getPaddingRight() + max, getFolderHeight(contentAreaHeight));
    }

    public final void onRemove(ShortcutInfo shortcutInfo) {
        this.mItemsInvalidated = true;
        if (shortcutInfo != this.mCurrentDragInfo) {
            this.mContent.removeItem(getViewForInfo(shortcutInfo));
            if (this.mState == 1) {
                this.mRearrangeOnClose = true;
            } else {
                rearrangeChildren$ar$ds();
            }
            if (this.mContent.getItemCount() > 1) {
                return;
            }
            if (this.mInfo.opened) {
                this.mLauncher.closeFolder(this, true);
            } else {
                replaceFolderWithFinalItem();
            }
        }
    }

    public final void onTitleChanged(CharSequence charSequence) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onUninstallActivityReturned(boolean z) {
        this.mDeferDropAfterUninstall = false;
        this.mUninstallSuccessful = z;
        Runnable runnable = this.mDeferredAction;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void prepareAccessibilityDrop() {
        Alarm alarm = this.mReorderAlarm;
        if (alarm.mAlarmPending) {
            alarm.cancelAlarm();
            this.mReorderAlarmListener.onAlarm$ar$ds();
        }
    }

    public final void rearrangeChildren$ar$ds() {
        ArrayList itemsInReadingOrder = getItemsInReadingOrder();
        this.mContent.arrangeChildren(itemsInReadingOrder, Math.max(-1, itemsInReadingOrder.size()), true);
        this.mItemsInvalidated = true;
    }

    /* access modifiers changed from: package-private */
    public final void replaceFolderWithFinalItem() {
        C524412 r0 = new Runnable() {
            public final void run() {
                View view;
                int size = Folder.this.mInfo.contents.size();
                if (size <= 1) {
                    if (size == 1) {
                        Folder folder = Folder.this;
                        Launcher launcher = folder.mLauncher;
                        FolderInfo folderInfo = folder.mInfo;
                        CellLayout cellLayout = launcher.getCellLayout(folderInfo.container, folderInfo.screenId);
                        ShortcutInfo shortcutInfo = (ShortcutInfo) Folder.this.mInfo.contents.remove(0);
                        view = Folder.this.mLauncher.createShortcut(cellLayout, shortcutInfo);
                        Folder folder2 = Folder.this;
                        Launcher launcher2 = folder2.mLauncher;
                        FolderInfo folderInfo2 = folder2.mInfo;
                        LauncherModel.addOrMoveItemInDatabase(launcher2, shortcutInfo, folderInfo2.container, folderInfo2.screenId, folderInfo2.cellX, folderInfo2.cellY);
                    } else {
                        view = null;
                    }
                    Folder folder3 = Folder.this;
                    folder3.mLauncher.removeItem$ar$ds(folder3.mFolderIcon, folder3.mInfo, true);
                    Folder folder4 = Folder.this;
                    FolderIcon folderIcon = folder4.mFolderIcon;
                    if (folderIcon instanceof DropTarget) {
                        folder4.mDragController.mDropTargets.remove((DropTarget) folderIcon);
                    }
                    if (view != null) {
                        Folder folder5 = Folder.this;
                        Workspace workspace = folder5.mLauncher.mWorkspace;
                        FolderInfo folderInfo3 = folder5.mInfo;
                        workspace.addInScreenFromBind(view, folderInfo3.container, folderInfo3.screenId, folderInfo3.cellX, folderInfo3.cellY, folderInfo3.spanX, folderInfo3.spanY);
                        view.requestFocus();
                    }
                }
            }
        };
        View lastItem = this.mContent.getLastItem();
        if (lastItem != null) {
            FolderIcon folderIcon = this.mFolderIcon;
            Drawable topDrawable$ar$ds = FolderIcon.getTopDrawable$ar$ds((TextView) lastItem);
            folderIcon.computePreviewDrawingParams(topDrawable$ar$ds.getIntrinsicWidth(), lastItem.getMeasuredWidth());
            folderIcon.animateFirstItem(topDrawable$ar$ds, 200, true, r0);
        } else {
            r0.run();
        }
        this.mDestroyed = true;
    }

    public final void startDrag(CellLayout.CellInfo cellInfo, boolean z) {
        beginDrag(cellInfo.cell, true);
    }

    public final boolean supportsAppInfoDropTarget() {
        return false;
    }

    public final boolean supportsDeleteDropTarget() {
        return true;
    }

    public final boolean supportsFlingToDelete() {
        return true;
    }

    public final void updateTextViewFocus() {
        View view;
        FolderPagedView folderPagedView = this.mContent;
        if (folderPagedView.getChildCount() <= 0) {
            view = null;
        } else {
            ShortcutAndWidgetContainer shortcutAndWidgetContainer = ((CellLayout) folderPagedView.getChildAt(folderPagedView.getNextPage())).mShortcutsAndWidgets;
            if (folderPagedView.mGridCountX > 0) {
                view = shortcutAndWidgetContainer.getChildAt(0, 0);
            } else {
                view = shortcutAndWidgetContainer.getChildAt(0);
            }
        }
        final View lastItem = this.mContent.getLastItem();
        if (view != null && lastItem != null) {
            this.mFolderName.setNextFocusDownId(lastItem.getId());
            this.mFolderName.setNextFocusRightId(lastItem.getId());
            this.mFolderName.setNextFocusLeftId(lastItem.getId());
            this.mFolderName.setNextFocusUpId(lastItem.getId());
            this.mFolderName.setNextFocusForwardId(view.getId());
            setNextFocusDownId(view.getId());
            setNextFocusRightId(view.getId());
            setNextFocusLeftId(view.getId());
            setNextFocusUpId(view.getId());
            setOnKeyListener(new View.OnKeyListener() {
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (i != 61 || !keyEvent.hasModifiers(1) || !Folder.this.isFocused()) {
                        return false;
                    }
                    return lastItem.requestFocus();
                }
            });
        }
    }
}
