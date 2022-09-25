package com.android.launcher3.allapps;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.android.launcher3.BaseContainerView;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DeleteDropTarget;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.DragSource;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ExtendedEditText;
import com.android.launcher3.Folder;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherTransitionable;
import com.android.launcher3.Utilities;
import com.android.launcher3.Workspace;
import com.android.launcher3.allapps.AllAppsSearchBarController;
import com.android.launcher3.allapps.AlphabeticalAppsList;
import com.android.launcher3.allapps.HeaderElevationController;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public class AllAppsContainerView extends BaseContainerView implements DragSource, LauncherTransitionable, View.OnLongClickListener, AllAppsSearchBarController.Callbacks {
    private final AllAppsGridAdapter mAdapter;
    public final AlphabeticalAppsList mApps;
    public AllAppsRecyclerView mAppsRecyclerView;
    private final Point mBoundsCheckLastTouchDownPos;
    private final Rect mContentBounds;
    private HeaderElevationController mElevationController;
    private final C0648fj mItemDecoration;
    private final Launcher mLauncher;
    private final C0653fo mLayoutManager;
    private int mNumAppsPerRow;
    private int mNumPredictedAppsPerRow;
    private int mRecyclerViewTopBottomPadding;
    public AllAppsSearchBarController mSearchBarController;
    private View mSearchContainer;
    private ExtendedEditText mSearchInput;
    private SpannableStringBuilder mSearchQueryBuilder;
    private int mSectionNamesMargin;

    public AllAppsContainerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r3 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean handleTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            com.android.launcher3.Launcher r0 = r8.mLauncher
            com.android.launcher3.DeviceProfile r0 = r0.mDeviceProfile
            float r1 = r9.getX()
            int r1 = (int) r1
            float r2 = r9.getY()
            int r2 = (int) r2
            int r3 = r9.getAction()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0064
            r0 = -1
            if (r3 == r5) goto L_0x001e
            r9 = 3
            if (r3 == r9) goto L_0x005e
            goto L_0x00b7
        L_0x001e:
            android.graphics.Point r1 = r8.mBoundsCheckLastTouchDownPos
            int r1 = r1.x
            if (r1 < 0) goto L_0x005e
            android.content.Context r1 = r8.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            float r2 = r9.getX()
            android.graphics.Point r3 = r8.mBoundsCheckLastTouchDownPos
            int r3 = r3.x
            float r3 = (float) r3
            float r2 = r2 - r3
            double r2 = (double) r2
            float r9 = r9.getY()
            android.graphics.Point r6 = r8.mBoundsCheckLastTouchDownPos
            int r6 = r6.y
            float r6 = (float) r6
            float r9 = r9 - r6
            double r6 = (double) r9
            double r2 = java.lang.Math.hypot(r2, r6)
            float r9 = (float) r2
            int r1 = r1.getScaledTouchSlop()
            float r1 = (float) r1
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0051
            goto L_0x005e
        L_0x0051:
            android.content.Context r9 = r8.getContext()
            com.android.launcher3.Launcher r9 = com.android.launcher3.Launcher.getLauncher(r9)
            r1 = 0
            r9.showWorkspace(r0, r5, r1)
            return r5
        L_0x005e:
            android.graphics.Point r9 = r8.mBoundsCheckLastTouchDownPos
            r9.set(r0, r0)
            goto L_0x00b7
        L_0x0064:
            android.graphics.Rect r3 = r8.mContentBounds
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0097
            android.graphics.Rect r3 = new android.graphics.Rect
            android.graphics.Rect r6 = r8.mContentBounds
            r3.<init>(r6)
            int r0 = r0.allAppsIconSizePx
            int r0 = -r0
            int r0 = r0 / 2
            r3.inset(r0, r4)
            float r0 = r9.getX()
            int r6 = r3.left
            float r6 = (float) r6
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0091
            float r9 = r9.getX()
            int r0 = r3.right
            float r0 = (float) r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00b7
        L_0x0091:
            android.graphics.Point r9 = r8.mBoundsCheckLastTouchDownPos
            r9.set(r1, r2)
            return r5
        L_0x0097:
            float r0 = r9.getX()
            int r3 = r8.getPaddingLeft()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            float r9 = r9.getX()
            int r0 = r8.getWidth()
            int r3 = r8.getPaddingRight()
            int r0 = r0 - r3
            float r0 = (float) r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            return r4
        L_0x00b8:
            android.graphics.Point r9 = r8.mBoundsCheckLastTouchDownPos
            r9.set(r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.allapps.AllAppsContainerView.handleTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void clearSearchResult() {
        if (this.mApps.setOrderedFilter((ArrayList) null)) {
            this.mAppsRecyclerView.onSearchResultsChanged();
        }
        this.mSearchQueryBuilder.clear();
        this.mSearchQueryBuilder.clearSpans();
        Selection.setSelection(this.mSearchQueryBuilder, 0);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int unicodeChar;
        if (!this.mSearchBarController.mInput.isFocused() && keyEvent.getAction() == 0 && (unicodeChar = keyEvent.getUnicodeChar()) > 0 && !Character.isWhitespace(unicodeChar) && !Character.isSpaceChar(unicodeChar) && TextKeyListener.getInstance().onKeyDown(this, this.mSearchQueryBuilder, keyEvent.getKeyCode(), keyEvent) && this.mSearchQueryBuilder.length() > 0) {
            this.mSearchBarController.focusSearchField();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final float getIntrinsicIconScaleFactor() {
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        return ((float) deviceProfile.allAppsIconSizePx) / ((float) deviceProfile.iconSizePx);
    }

    public final void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z, boolean z2) {
        if (z || !z2 || (view != this.mLauncher.mWorkspace && !(view instanceof DeleteDropTarget) && !(view instanceof Folder))) {
            this.mLauncher.exitSpringLoadedDragModeDelayed$ar$ds(true, 300);
        }
        this.mLauncher.unlockScreenOrientation(false);
        if (!z2) {
            if (view instanceof Workspace) {
                CellLayout cellLayout = (CellLayout) ((Workspace) view).getChildAt(this.mLauncher.getCurrentWorkspaceScreen());
                Object obj = dragObject.dragInfo;
                if (cellLayout != null) {
                    ItemInfo itemInfo = (ItemInfo) obj;
                    if (!cellLayout.findCellForSpan((int[]) null, itemInfo.spanX, itemInfo.spanY)) {
                        this.mLauncher.showOutOfSpaceMessage(false);
                    }
                }
            }
            dragObject.deferDragViewCleanupPostAnimation = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        HeaderElevationController headerElevationController;
        super.onFinishInflate();
        this.mContent.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    AllAppsContainerView.this.mAppsRecyclerView.requestFocus();
                }
            }
        });
        this.mSearchContainer = findViewById(R.id.search_container);
        this.mSearchInput = (ExtendedEditText) findViewById(R.id.search_box_input);
        if (Utilities.ATLEAST_LOLLIPOP) {
            headerElevationController = new HeaderElevationController.ControllerVL(this.mSearchContainer);
        } else {
            headerElevationController = new HeaderElevationController.ControllerV16(this.mSearchContainer);
        }
        this.mElevationController = headerElevationController;
        AllAppsRecyclerView allAppsRecyclerView = (AllAppsRecyclerView) findViewById(R.id.apps_list_view);
        this.mAppsRecyclerView = allAppsRecyclerView;
        AlphabeticalAppsList alphabeticalAppsList = this.mApps;
        allAppsRecyclerView.mApps = alphabeticalAppsList;
        allAppsRecyclerView.mFastScrollHelper = new AllAppsFastScrollHelper(allAppsRecyclerView, alphabeticalAppsList);
        this.mAppsRecyclerView.setLayoutManager(this.mLayoutManager);
        this.mAppsRecyclerView.setAdapter(this.mAdapter);
        AllAppsRecyclerView allAppsRecyclerView2 = this.mAppsRecyclerView;
        allAppsRecyclerView2.mHasFixedSize = true;
        allAppsRecyclerView2.addOnScrollListener(this.mElevationController);
        AllAppsRecyclerView allAppsRecyclerView3 = this.mAppsRecyclerView;
        allAppsRecyclerView3.mElevationController = this.mElevationController;
        C0648fj fjVar = this.mItemDecoration;
        if (fjVar != null) {
            allAppsRecyclerView3.addItemDecoration$ar$ds(fjVar);
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, LinearLayoutManager.INVALID_OFFSET);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, LinearLayoutManager.INVALID_OFFSET);
        BubbleTextView bubbleTextView = (BubbleTextView) from.inflate(R.layout.all_apps_icon, this, false);
        bubbleTextView.applyDummyInfo();
        bubbleTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        BubbleTextView bubbleTextView2 = (BubbleTextView) from.inflate(R.layout.all_apps_prediction_bar_icon, this, false);
        bubbleTextView2.applyDummyInfo();
        bubbleTextView2.measure(makeMeasureSpec, makeMeasureSpec2);
        AllAppsRecyclerView allAppsRecyclerView4 = this.mAppsRecyclerView;
        int measuredHeight = bubbleTextView2.getMeasuredHeight();
        int measuredHeight2 = bubbleTextView.getMeasuredHeight();
        allAppsRecyclerView4.mPredictionIconHeight = measuredHeight;
        allAppsRecyclerView4.mIconHeight = measuredHeight2;
        updateBackgroundAndPaddings();
    }

    public final void onFlingToDeleteCompleted() {
        this.mLauncher.exitSpringLoadedDragModeDelayed$ar$ds(true, 300);
        this.mLauncher.unlockScreenOrientation(false);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return handleTouchEvent(motionEvent);
    }

    public final void onLauncherTransitionEnd$ar$ds(boolean z) {
        if (z) {
            reset();
        }
    }

    public final void onLauncherTransitionPrepare$ar$ds() {
    }

    public final void onLauncherTransitionStart$ar$ds() {
    }

    public final void onLauncherTransitionStep$ar$ds(float f) {
    }

    public final boolean onLongClick(View view) {
        if (view.isInTouchMode() && this.mLauncher.isAppsViewVisible()) {
            Launcher launcher = this.mLauncher;
            if (launcher.mWorkspace.mIsSwitchingState || !launcher.isDraggingEnabled()) {
                return false;
            }
            this.mLauncher.mWorkspace.beginDragShared(view, this, false);
            this.mLauncher.enterSpringLoadedDragMode();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        AlphabeticalAppsList.MergeAlgorithm mergeAlgorithm;
        this.mContentBounds.set(this.mContentPadding.left, this.mContentPadding.top, View.MeasureSpec.getSize(i) - this.mContentPadding.right, View.MeasureSpec.getSize(i2) - this.mContentPadding.bottom);
        if (!this.mContentBounds.isEmpty()) {
            i3 = this.mContentBounds.width();
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int i5 = this.mAppsRecyclerView.mScrollbar.mThumbMaxWidth;
        int i6 = i3 - (i5 + i5);
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.all_apps_grid_view_start_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.all_apps_icon_width_gap);
        if (i6 > 0) {
            i4 = i6;
        } else {
            i4 = deviceProfile.availableWidthPx;
        }
        int i7 = ((i4 + dimensionPixelSize2) - dimensionPixelSize) / (deviceProfile.allAppsIconSizePx + dimensionPixelSize2);
        int max = Math.max(deviceProfile.inv.minAllAppsPredictionColumns, i7);
        deviceProfile.allAppsNumCols = i7;
        deviceProfile.allAppsNumPredictiveCols = max;
        if (!(this.mNumAppsPerRow == i7 && this.mNumPredictedAppsPerRow == max)) {
            this.mNumAppsPerRow = i7;
            this.mNumPredictedAppsPerRow = max;
            if (this.mSectionNamesMargin == 0 || !deviceProfile.isPhone) {
                mergeAlgorithm = new FullMergeAlgorithm();
            } else {
                mergeAlgorithm = new SimpleSectionMergeAlgorithm((int) Math.ceil((double) (((float) i7) / 2.0f)));
            }
            AllAppsRecyclerView allAppsRecyclerView = this.mAppsRecyclerView;
            allAppsRecyclerView.mNumAppsPerRow = this.mNumAppsPerRow;
            C0660fv b = allAppsRecyclerView.mRecycler.mo3025b();
            int ceil = (int) Math.ceil((double) (deviceProfile.availableHeightPx / deviceProfile.allAppsIconSizePx));
            b.mo3023h(3, 1);
            b.mo3023h(4, 1);
            b.mo3023h(5, 1);
            b.mo3023h(1, allAppsRecyclerView.mNumAppsPerRow * ceil);
            b.mo3023h(2, allAppsRecyclerView.mNumAppsPerRow);
            b.mo3023h(0, ceil);
            AllAppsGridAdapter allAppsGridAdapter = this.mAdapter;
            int i8 = this.mNumAppsPerRow;
            allAppsGridAdapter.mAppsPerRow = i8;
            allAppsGridAdapter.mGridLayoutMgr.setSpanCount(i8);
            AlphabeticalAppsList alphabeticalAppsList = this.mApps;
            int i9 = this.mNumAppsPerRow;
            int i10 = this.mNumPredictedAppsPerRow;
            alphabeticalAppsList.mNumAppsPerRow = i9;
            alphabeticalAppsList.mNumPredictedAppsPerRow = i10;
            alphabeticalAppsList.mMergeAlgorithm = mergeAlgorithm;
            alphabeticalAppsList.updateAdapterItems();
            int i11 = this.mNumAppsPerRow;
            if (i11 > 0) {
                int i12 = ((i6 / i11) - deviceProfile.allAppsIconSizePx) / 2;
                this.mSearchInput.setPaddingRelative(i12, 0, i12, 0);
            }
        }
        super.onMeasure(i, i2);
    }

    public final void onSearchResult(String str, ArrayList arrayList) {
        if (this.mApps.setOrderedFilter(arrayList)) {
            this.mAppsRecyclerView.onSearchResultsChanged();
        }
        AllAppsGridAdapter allAppsGridAdapter = this.mAdapter;
        Resources resources = allAppsGridAdapter.mLauncher.getResources();
        allAppsGridAdapter.mEmptySearchMessage = String.format(resources.getString(R.string.all_apps_no_search_results), new Object[]{str});
        if (allAppsGridAdapter.mMarketAppName != null) {
            allAppsGridAdapter.mMarketSearchMessage = String.format(resources.getString(R.string.all_apps_search_market_message), new Object[]{allAppsGridAdapter.mMarketAppName});
            AllAppsSearchBarController allAppsSearchBarController = allAppsGridAdapter.mSearchController;
            allAppsGridAdapter.mMarketSearchIntent = AllAppsSearchBarController.createMarketSearchIntent$ar$ds(str);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return handleTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onUpdateBgPadding(Rect rect, Rect rect2) {
        this.mAppsRecyclerView.mBackgroundPadding.set(rect2);
        this.mAdapter.mBackgroundPadding.set(rect2);
        this.mElevationController.updateBackgroundPadding(rect2);
        int i = this.mAppsRecyclerView.mScrollbar.mThumbMaxWidth;
        int max = Math.max(this.mSectionNamesMargin, i);
        int i2 = this.mRecyclerViewTopBottomPadding;
        if (Utilities.isRtl(getResources())) {
            this.mAppsRecyclerView.setPadding(rect.left + i, i2, rect.right + max, i2);
        } else {
            this.mAppsRecyclerView.setPadding(rect.left + max, i2, rect.right + i, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mSearchContainer.getLayoutParams();
        marginLayoutParams.leftMargin = rect.left;
        marginLayoutParams.rightMargin = rect.right;
        this.mSearchContainer.setLayoutParams(marginLayoutParams);
    }

    public final void reset() {
        this.mSearchBarController.reset();
        this.mAppsRecyclerView.mScrollbar.mIsThumbDetached = false;
    }

    public final void setSearchBarController(AllAppsSearchBarController allAppsSearchBarController) {
        if (this.mSearchBarController == null) {
            this.mSearchBarController = allAppsSearchBarController;
            AlphabeticalAppsList alphabeticalAppsList = this.mApps;
            ExtendedEditText extendedEditText = this.mSearchInput;
            Launcher launcher = this.mLauncher;
            allAppsSearchBarController.mApps = alphabeticalAppsList;
            allAppsSearchBarController.mCb = this;
            allAppsSearchBarController.mLauncher = launcher;
            allAppsSearchBarController.mInput = extendedEditText;
            allAppsSearchBarController.mInput.addTextChangedListener(allAppsSearchBarController);
            allAppsSearchBarController.mInput.setOnEditorActionListener(allAppsSearchBarController);
            ExtendedEditText extendedEditText2 = allAppsSearchBarController.mInput;
            extendedEditText2.mBackKeyListener = allAppsSearchBarController;
            allAppsSearchBarController.mInputMethodManager = (InputMethodManager) extendedEditText2.getContext().getSystemService("input_method");
            allAppsSearchBarController.mSearchAlgorithm = new DefaultAppSearchAlgorithm(((DefaultAppSearchController) allAppsSearchBarController).mApps.mApps);
            AllAppsGridAdapter allAppsGridAdapter = this.mAdapter;
            allAppsGridAdapter.mSearchController = this.mSearchBarController;
            PackageManager packageManager = allAppsGridAdapter.mLauncher.getPackageManager();
            AllAppsSearchBarController allAppsSearchBarController2 = allAppsGridAdapter.mSearchController;
            ResolveInfo resolveActivity = packageManager.resolveActivity(AllAppsSearchBarController.createMarketSearchIntent$ar$ds(BuildConfig.FLAVOR), 65536);
            if (resolveActivity != null) {
                allAppsGridAdapter.mMarketAppName = resolveActivity.loadLabel(packageManager).toString();
            }
            updateBackgroundAndPaddings();
            return;
        }
        throw new RuntimeException("Expected search bar controller to only be set once");
    }

    public final boolean supportsAppInfoDropTarget() {
        return true;
    }

    public final boolean supportsDeleteDropTarget() {
        return false;
    }

    public final boolean supportsFlingToDelete() {
        return true;
    }

    public AllAppsContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AllAppsContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContentBounds = new Rect();
        this.mSearchQueryBuilder = null;
        this.mBoundsCheckLastTouchDownPos = new Point(-1, -1);
        Resources resources = context.getResources();
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        this.mSectionNamesMargin = resources.getDimensionPixelSize(R.dimen.all_apps_grid_view_start_margin);
        AlphabeticalAppsList alphabeticalAppsList = new AlphabeticalAppsList(context);
        this.mApps = alphabeticalAppsList;
        AllAppsGridAdapter allAppsGridAdapter = new AllAppsGridAdapter(launcher, alphabeticalAppsList, launcher, this);
        this.mAdapter = allAppsGridAdapter;
        alphabeticalAppsList.mAdapter = allAppsGridAdapter;
        this.mLayoutManager = allAppsGridAdapter.mGridLayoutMgr;
        this.mItemDecoration = allAppsGridAdapter.mItemDecoration;
        this.mRecyclerViewTopBottomPadding = resources.getDimensionPixelSize(R.dimen.all_apps_list_top_bottom_padding);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.mSearchQueryBuilder = spannableStringBuilder;
        Selection.setSelection(spannableStringBuilder, 0);
    }
}
