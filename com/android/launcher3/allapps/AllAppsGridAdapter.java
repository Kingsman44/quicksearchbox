package com.android.launcher3.allapps;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.p033v7.widget.C0593di;
import android.support.p033v7.widget.C0594dj;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1998r;
import com.android.launcher3.AppInfo;
import com.android.launcher3.BaseRecyclerViewFastScrollBar;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.Utilities;
import com.android.launcher3.allapps.AlphabeticalAppsList;
import com.android.launcher3.compat.DeepShortcutManagerCompat;
import com.android.launcher3.shortcuts.ShortcutsContainerListener;
import com.google.android.googlequicksearchbox.R;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
public final class AllAppsGridAdapter extends C0640fb {
    public final AlphabeticalAppsList mApps;
    public int mAppsPerRow;
    public final Rect mBackgroundPadding = new Rect();
    public AllAppsFastScrollHelper mBindViewCallback$ar$class_merging;
    public String mEmptySearchMessage;
    public final GridLayoutManager mGridLayoutMgr;
    private final GridSpanSizer mGridSizer;
    private final View.OnClickListener mIconClickListener;
    private final View.OnLongClickListener mIconLongClickListener;
    public final boolean mIsRtl;
    public final GridItemDecoration mItemDecoration;
    public final Launcher mLauncher;
    private final LayoutInflater mLayoutInflater;
    public String mMarketAppName;
    public Intent mMarketSearchIntent;
    public String mMarketSearchMessage;
    public final Paint mPredictedAppsDividerPaint;
    public final int mPredictionBarDividerOffset;
    public AllAppsSearchBarController mSearchController;
    public final int mSectionHeaderOffset;
    public final int mSectionNamesMargin;
    public final Paint mSectionTextPaint;

    /* compiled from: PG */
    public class AppsGridLayoutManager extends GridLayoutManager {
        public AppsGridLayoutManager(Context context) {
            super(context, 1, 1);
        }

        private final int getEmptyRowForAccessibility(int i) {
            if (!AllAppsGridAdapter.this.mApps.hasFilter() && AllAppsGridAdapter.this.mApps.mPredictedAppComponents.size() > 0 && i != 2 && i == 1) {
                return 2;
            }
            return 1;
        }

        public final int getRowCountForAccessibility(C0661fw fwVar, C0670ge geVar) {
            return super.getRowCountForAccessibility(fwVar, geVar) - getEmptyRowForAccessibility(-1);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            C1998r rVar = new C1998r(accessibilityEvent);
            int emptyRowForAccessibility = getEmptyRowForAccessibility(-1);
            rVar.f5926a.setFromIndex(accessibilityEvent.getFromIndex() - emptyRowForAccessibility);
            rVar.f5926a.setToIndex(accessibilityEvent.getToIndex() - emptyRowForAccessibility);
            rVar.f5926a.setItemCount(AllAppsGridAdapter.this.mApps.mFilteredApps.size());
        }

        public final void onInitializeAccessibilityNodeInfoForItem(C0661fw fwVar, C0670ge geVar, View view, C1991k kVar) {
            int itemViewType = getItemViewType(view);
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    itemViewType = 2;
                } else {
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfoForItem(fwVar, geVar, view, kVar);
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = kVar.f5921a.getCollectionItemInfo();
            C1990j jVar = collectionItemInfo != null ? new C1990j(collectionItemInfo) : null;
            if (jVar != null) {
                kVar.mo5155d(C1990j.m5333a(((AccessibilityNodeInfo.CollectionItemInfo) jVar.f5920a).getRowIndex() - getEmptyRowForAccessibility(itemViewType), ((AccessibilityNodeInfo.CollectionItemInfo) jVar.f5920a).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) jVar.f5920a).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) jVar.f5920a).getColumnSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) jVar.f5920a).isHeading(), ((AccessibilityNodeInfo.CollectionItemInfo) jVar.f5920a).isSelected()));
            }
        }
    }

    /* compiled from: PG */
    public final class GridItemDecoration extends C0648fj {
        private final HashMap mCachedSectionBounds = new HashMap();
        private final Rect mTmpBounds = new Rect();

        public GridItemDecoration() {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        }

        public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
            int i;
            boolean z;
            int i2;
            int i3;
            int i4;
            int position;
            int i5;
            View view;
            int i6;
            boolean z2;
            int i7;
            int i8;
            RecyclerView recyclerView2 = recyclerView;
            if (!AllAppsGridAdapter.this.mApps.hasFilter()) {
                AllAppsGridAdapter allAppsGridAdapter = AllAppsGridAdapter.this;
                if (allAppsGridAdapter.mAppsPerRow != 0) {
                    List list = allAppsGridAdapter.mApps.mAdapterItems;
                    int i9 = allAppsGridAdapter.mSectionNamesMargin;
                    int childCount = recyclerView.getChildCount();
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    boolean z3 = false;
                    while (i < childCount) {
                        View childAt = recyclerView2.getChildAt(i);
                        ViewHolder viewHolder = (ViewHolder) recyclerView2.getChildViewHolder(childAt);
                        if (!((C0593di) childAt.getLayoutParams()).f2420c.isRemoved() && viewHolder != null && (position = viewHolder.getPosition()) >= 0 && position < list.size()) {
                            if (((AlphabeticalAppsList.AdapterItem) list.get(viewHolder.getPosition())).viewType == 2 && !z3) {
                                int top = childAt.getTop();
                                int height = childAt.getHeight();
                                AllAppsGridAdapter allAppsGridAdapter2 = AllAppsGridAdapter.this;
                                float f = (float) (top + height + allAppsGridAdapter2.mPredictionBarDividerOffset);
                                canvas.drawLine((float) allAppsGridAdapter2.mBackgroundPadding.left, f, (float) (recyclerView.getWidth() - AllAppsGridAdapter.this.mBackgroundPadding.right), f, AllAppsGridAdapter.this.mPredictedAppsDividerPaint);
                                Canvas canvas2 = canvas;
                                i3 = i9;
                                i2 = childCount;
                                i4 = 1;
                                z = true;
                                i10 = i + i4;
                                recyclerView2 = recyclerView;
                                i9 = i3;
                                childCount = i2;
                                z3 = z;
                            } else if (i9 > 0) {
                                int position2 = viewHolder.getPosition();
                                if (((AlphabeticalAppsList.AdapterItem) list.get(position2)).viewType == 1 && (i == 0 || ((AlphabeticalAppsList.AdapterItem) list.get(position2 - 1)).viewType == 0)) {
                                    int paddingTop = childAt.getPaddingTop();
                                    int i13 = paddingTop + paddingTop;
                                    int position3 = viewHolder.getPosition();
                                    AlphabeticalAppsList.AdapterItem adapterItem = (AlphabeticalAppsList.AdapterItem) list.get(position3);
                                    AlphabeticalAppsList.SectionInfo sectionInfo = adapterItem.sectionInfo;
                                    String str = adapterItem.sectionName;
                                    int i14 = adapterItem.sectionAppIndex;
                                    while (true) {
                                        if (i14 >= sectionInfo.numApps) {
                                            i3 = i9;
                                            break;
                                        }
                                        AlphabeticalAppsList.AdapterItem adapterItem2 = (AlphabeticalAppsList.AdapterItem) list.get(position3);
                                        i3 = i9;
                                        String str2 = adapterItem2.sectionName;
                                        if (adapterItem2.sectionInfo != sectionInfo) {
                                            break;
                                        }
                                        if (i14 <= adapterItem.sectionAppIndex || !str2.equals(str)) {
                                            PointF pointF = (PointF) this.mCachedSectionBounds.get(str2);
                                            if (pointF == null) {
                                                i7 = childCount;
                                                z2 = z3;
                                                AllAppsGridAdapter.this.mSectionTextPaint.getTextBounds(str2, 0, str2.length(), this.mTmpBounds);
                                                pointF = new PointF(AllAppsGridAdapter.this.mSectionTextPaint.measureText(str2), (float) this.mTmpBounds.height());
                                                this.mCachedSectionBounds.put(str2, pointF);
                                            } else {
                                                i7 = childCount;
                                                z2 = z3;
                                            }
                                            int i15 = (int) (((float) i13) + pointF.y);
                                            AllAppsGridAdapter allAppsGridAdapter3 = AllAppsGridAdapter.this;
                                            if (allAppsGridAdapter3.mIsRtl) {
                                                i8 = (recyclerView.getWidth() - AllAppsGridAdapter.this.mBackgroundPadding.left) - AllAppsGridAdapter.this.mSectionNamesMargin;
                                            } else {
                                                i8 = allAppsGridAdapter3.mBackgroundPadding.left;
                                            }
                                            i6 = i13;
                                            int i16 = i8 + ((int) ((((float) AllAppsGridAdapter.this.mSectionNamesMargin) - pointF.x) / 2.0f));
                                            int top2 = childAt.getTop() + i15;
                                            int i17 = ((AlphabeticalAppsList.AdapterItem) list.get(position3)).sectionAppIndex;
                                            int size = list.size();
                                            view = childAt;
                                            int i18 = AllAppsGridAdapter.this.mAppsPerRow;
                                            i5 = i;
                                            if (str2.equals(((AlphabeticalAppsList.AdapterItem) list.get(Math.min(size - 1, (position3 + i18) - (i17 % i18)))).sectionName)) {
                                                top2 = Math.max(i15, top2);
                                            }
                                            if (i12 > 0 && top2 <= i11 + i12) {
                                                top2 += (i11 - top2) + i12;
                                            }
                                            i11 = top2;
                                            canvas.drawText(str2, (float) i16, (float) i11, AllAppsGridAdapter.this.mSectionTextPaint);
                                            i12 = (int) (pointF.y + ((float) AllAppsGridAdapter.this.mSectionHeaderOffset));
                                            str = str2;
                                        } else {
                                            i7 = childCount;
                                            i5 = i;
                                            z2 = z3;
                                            view = childAt;
                                            i6 = i13;
                                            Canvas canvas3 = canvas;
                                        }
                                        i14++;
                                        position3++;
                                        i9 = i3;
                                        childCount = i7;
                                        z3 = z2;
                                        i13 = i6;
                                        childAt = view;
                                        i = i5;
                                    }
                                    i2 = childCount;
                                    z = z3;
                                    Canvas canvas4 = canvas;
                                    i += sectionInfo.numApps - adapterItem.sectionAppIndex;
                                    i4 = 1;
                                    i10 = i + i4;
                                    recyclerView2 = recyclerView;
                                    i9 = i3;
                                    childCount = i2;
                                    z3 = z;
                                }
                            }
                        }
                        i3 = i9;
                        i2 = childCount;
                        z = z3;
                        Canvas canvas5 = canvas;
                        i = i;
                        i4 = 1;
                        i10 = i + i4;
                        recyclerView2 = recyclerView;
                        i9 = i3;
                        childCount = i2;
                        z3 = z;
                    }
                }
            }
        }
    }

    /* compiled from: PG */
    public final class GridSpanSizer extends C0594dj {
        public GridSpanSizer() {
            this.mCacheSpanIndices = true;
        }

        public final int getSpanSize(int i) {
            int i2 = ((AlphabeticalAppsList.AdapterItem) AllAppsGridAdapter.this.mApps.mAdapterItems.get(i)).viewType;
            if (i2 == 1 || i2 == 2) {
                return 1;
            }
            return AllAppsGridAdapter.this.mAppsPerRow;
        }
    }

    /* compiled from: PG */
    public final class ViewHolder extends C0673gh {
        public final View mContent;

        public ViewHolder(View view) {
            super(view);
            this.mContent = view;
        }
    }

    public AllAppsGridAdapter(Launcher launcher, AlphabeticalAppsList alphabeticalAppsList, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        Resources resources = launcher.getResources();
        this.mLauncher = launcher;
        this.mApps = alphabeticalAppsList;
        this.mEmptySearchMessage = resources.getString(R.string.all_apps_loading_message);
        GridSpanSizer gridSpanSizer = new GridSpanSizer();
        this.mGridSizer = gridSpanSizer;
        AppsGridLayoutManager appsGridLayoutManager = new AppsGridLayoutManager(launcher);
        this.mGridLayoutMgr = appsGridLayoutManager;
        appsGridLayoutManager.mSpanSizeLookup = gridSpanSizer;
        this.mItemDecoration = new GridItemDecoration();
        this.mLayoutInflater = LayoutInflater.from(launcher);
        this.mIconClickListener = onClickListener;
        this.mIconLongClickListener = onLongClickListener;
        this.mSectionNamesMargin = resources.getDimensionPixelSize(R.dimen.all_apps_grid_view_start_margin);
        this.mSectionHeaderOffset = resources.getDimensionPixelSize(R.dimen.all_apps_grid_section_y_offset);
        this.mIsRtl = Utilities.isRtl(resources);
        Paint paint = new Paint(1);
        this.mSectionTextPaint = paint;
        paint.setTextSize((float) resources.getDimensionPixelSize(R.dimen.all_apps_grid_section_text_size));
        paint.setColor(resources.getColor(R.color.all_apps_grid_section_text_color));
        Paint paint2 = new Paint(1);
        this.mPredictedAppsDividerPaint = paint2;
        paint2.setStrokeWidth((float) Utilities.pxFromDp(1.0f, resources.getDisplayMetrics()));
        paint2.setColor(503316480);
        this.mPredictionBarDividerOffset = ((-resources.getDimensionPixelSize(R.dimen.all_apps_prediction_icon_bottom_padding)) + resources.getDimensionPixelSize(R.dimen.all_apps_icon_top_bottom_padding)) / 2;
    }

    public final int getItemCount() {
        return this.mApps.mAdapterItems.size();
    }

    public final int getItemViewType(int i) {
        return ((AlphabeticalAppsList.AdapterItem) this.mApps.mAdapterItems.get(i)).viewType;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        ViewHolder viewHolder = (ViewHolder) ghVar;
        int i2 = viewHolder.mItemViewType;
        if (i2 == 1) {
            AppInfo appInfo = ((AlphabeticalAppsList.AdapterItem) this.mApps.mAdapterItems.get(i)).appInfo;
            BubbleTextView bubbleTextView = (BubbleTextView) viewHolder.mContent;
            bubbleTextView.applyFromApplicationInfo(appInfo);
            if (DeepShortcutManagerCompat.supportsShortcuts(appInfo)) {
                bubbleTextView.setOnTouchListener(new ShortcutsContainerListener(bubbleTextView));
            }
            bubbleTextView.setAccessibilityDelegate(LauncherAppState.getInstance().mAccessibilityDelegate);
        } else if (i2 != 2) {
            int i3 = 8388627;
            if (i2 == 3) {
                TextView textView = (TextView) viewHolder.mContent;
                textView.setText(this.mEmptySearchMessage);
                if (true == this.mApps.hasNoFilteredResults()) {
                    i3 = 17;
                }
                textView.setGravity(i3);
            } else if (i2 == 5) {
                TextView textView2 = (TextView) viewHolder.mContent;
                if (this.mMarketSearchIntent != null) {
                    textView2.setVisibility(0);
                    textView2.setContentDescription(this.mMarketSearchMessage);
                    if (true == this.mApps.hasNoFilteredResults()) {
                        i3 = 17;
                    }
                    textView2.setGravity(i3);
                    textView2.setText(this.mMarketSearchMessage);
                } else {
                    textView2.setVisibility(8);
                }
            }
        } else {
            AppInfo appInfo2 = ((AlphabeticalAppsList.AdapterItem) this.mApps.mAdapterItems.get(i)).appInfo;
            BubbleTextView bubbleTextView2 = (BubbleTextView) viewHolder.mContent;
            bubbleTextView2.applyFromApplicationInfo(appInfo2);
            if (DeepShortcutManagerCompat.supportsShortcuts(appInfo2)) {
                bubbleTextView2.setOnTouchListener(new ShortcutsContainerListener(bubbleTextView2));
            }
            bubbleTextView2.setAccessibilityDelegate(LauncherAppState.getInstance().mAccessibilityDelegate);
        }
        AllAppsFastScrollHelper allAppsFastScrollHelper = this.mBindViewCallback$ar$class_merging;
        if (allAppsFastScrollHelper == null) {
            return;
        }
        if (allAppsFastScrollHelper.mCurrentFastScrollSection != null || allAppsFastScrollHelper.mTargetFastScrollSection != null) {
            View view = viewHolder.mContent;
            if (view instanceof BaseRecyclerViewFastScrollBar.FastScrollFocusableView) {
                BaseRecyclerViewFastScrollBar.FastScrollFocusableView fastScrollFocusableView = (BaseRecyclerViewFastScrollBar.FastScrollFocusableView) view;
                allAppsFastScrollHelper.updateViewFastScrollFocusState(fastScrollFocusableView, viewHolder.getPosition(), false);
                allAppsFastScrollHelper.mTrackedFastScrollViews.add(fastScrollFocusableView);
            }
        }
    }

    public final /* synthetic */ boolean onFailedToRecycleView(C0673gh ghVar) {
        ViewHolder viewHolder = (ViewHolder) ghVar;
        return true;
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder viewHolder;
        if (i == 0) {
            return new ViewHolder(new View(viewGroup.getContext()));
        }
        if (i == 1) {
            BubbleTextView bubbleTextView = (BubbleTextView) this.mLayoutInflater.inflate(R.layout.all_apps_icon, viewGroup, false);
            bubbleTextView.setOnClickListener(this.mIconClickListener);
            bubbleTextView.setOnLongClickListener(this.mIconLongClickListener);
            ViewConfiguration.get(viewGroup.getContext());
            bubbleTextView.mLongPressHelper.mLongPressTimeout = ViewConfiguration.getLongPressTimeout();
            bubbleTextView.setFocusable(true);
            viewHolder = new ViewHolder(bubbleTextView);
        } else if (i == 2) {
            BubbleTextView bubbleTextView2 = (BubbleTextView) this.mLayoutInflater.inflate(R.layout.all_apps_prediction_bar_icon, viewGroup, false);
            bubbleTextView2.setOnClickListener(this.mIconClickListener);
            bubbleTextView2.setOnLongClickListener(this.mIconLongClickListener);
            ViewConfiguration.get(viewGroup.getContext());
            bubbleTextView2.mLongPressHelper.mLongPressTimeout = ViewConfiguration.getLongPressTimeout();
            bubbleTextView2.setFocusable(true);
            viewHolder = new ViewHolder(bubbleTextView2);
        } else if (i == 3) {
            return new ViewHolder(this.mLayoutInflater.inflate(R.layout.all_apps_empty_search, viewGroup, false));
        } else {
            if (i == 4) {
                return new ViewHolder(this.mLayoutInflater.inflate(R.layout.all_apps_search_market_divider, viewGroup, false));
            }
            if (i == 5) {
                View inflate = this.mLayoutInflater.inflate(R.layout.all_apps_search_market, viewGroup, false);
                inflate.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        AllAppsGridAdapter allAppsGridAdapter = AllAppsGridAdapter.this;
                        allAppsGridAdapter.mLauncher.startActivitySafely(view, allAppsGridAdapter.mMarketSearchIntent, (Object) null);
                    }
                });
                return new ViewHolder(inflate);
            }
            throw new RuntimeException("Unexpected view type");
        }
        return viewHolder;
    }
}
