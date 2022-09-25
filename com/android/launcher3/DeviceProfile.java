package com.android.launcher3;

import android.appwidget.AppWidgetHostView;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class DeviceProfile {
    public final int allAppsButtonVisualSize;
    public final int allAppsIconSizePx;
    public final float allAppsIconTextSizeSp;
    public int allAppsNumCols;
    public int allAppsNumPredictiveCols;
    public final PointF appWidgetScale = new PointF(1.0f, 1.0f);
    public final int availableHeightPx;
    public final int availableWidthPx;
    public int cellHeightPx;
    public int cellWidthPx;
    public final int defaultPageSpacingPx;
    public final Rect defaultWidgetPadding;
    private final int desiredWorkspaceLeftRightMarginPx;
    private float dragViewScale;
    public final int edgeMarginPx;
    public int folderBackgroundOffset;
    public int folderCellHeightPx;
    public int folderCellWidthPx;
    public int folderChildDrawablePaddingPx;
    public int folderChildIconSizePx;
    public int folderChildTextSizePx;
    public int folderIconSizePx;
    public final int heightPx;
    public int hotseatBarHeightPx;
    public int hotseatCellHeightPx;
    public int hotseatIconSizePx;
    public final int iconDrawablePaddingOriginalPx;
    public int iconDrawablePaddingPx;
    public int iconSizePx;
    public int iconTextSizePx;
    public final InvariantDeviceProfile inv;
    public final boolean isLandscape;
    public final boolean isLargeTablet;
    public final boolean isPhone;
    public final boolean isTablet;
    public int normalHotseatBarHeightPx;
    private int normalSearchBarBottomPaddingPx;
    private int normalSearchBarSpaceHeightPx;
    private int normalSearchBarTopExtraPaddingPx;
    public final int overviewModeBarItemWidthPx;
    public final int overviewModeBarSpacerWidthPx;
    private final float overviewModeIconZoneRatio;
    private final int overviewModeMaxIconZoneHeightPx;
    private final int overviewModeMinIconZoneHeightPx;
    private final int pageIndicatorHeightPx;
    private int searchBarBottomPaddingPx;
    private int searchBarSpaceHeightPx;
    public int searchBarTopExtraPaddingPx;
    private int searchBarTopPaddingPx;
    private int searchBarWidgetInternalPaddingBottom;
    private int searchBarWidgetInternalPaddingTop;
    private int shortHotseatBarHeightPx;
    private int tallSearchBarBottomPaddingPx;
    private int tallSearchBarNegativeTopPaddingPx;
    private int tallSearchBarSpaceHeightPx;
    public final boolean transposeLayoutWithOrientation;
    public final int widthPx;

    public DeviceProfile(Context context, InvariantDeviceProfile invariantDeviceProfile, Point point, Point point2, int i, int i2, boolean z) {
        this.inv = invariantDeviceProfile;
        this.isLandscape = z;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        boolean z2 = resources.getBoolean(R.bool.is_tablet);
        this.isTablet = z2;
        boolean z3 = resources.getBoolean(R.bool.is_large_tablet);
        this.isLargeTablet = z3;
        boolean z4 = false;
        if (!z2 && !z3) {
            z4 = true;
        }
        this.isPhone = z4;
        this.transposeLayoutWithOrientation = resources.getBoolean(R.bool.hotseat_transpose_layout_with_orientation);
        this.defaultWidgetPadding = AppWidgetHostView.getDefaultPaddingForWidget(context, new ComponentName(context.getPackageName(), getClass().getName()), (Rect) null);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dynamic_grid_edge_margin);
        this.edgeMarginPx = dimensionPixelSize;
        this.desiredWorkspaceLeftRightMarginPx = dimensionPixelSize + dimensionPixelSize;
        this.pageIndicatorHeightPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_page_indicator_height);
        this.defaultPageSpacingPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_workspace_page_spacing);
        this.overviewModeMinIconZoneHeightPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_overview_min_icon_zone_height);
        this.overviewModeMaxIconZoneHeightPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_overview_max_icon_zone_height);
        this.overviewModeBarItemWidthPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_overview_bar_item_width);
        this.overviewModeBarSpacerWidthPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_overview_bar_spacer_width);
        this.overviewModeIconZoneRatio = ((float) resources.getInteger(R.integer.config_dynamic_grid_overview_icon_zone_percentage)) / 100.0f;
        this.iconDrawablePaddingOriginalPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_icon_drawable_padding);
        this.allAppsIconTextSizeSp = invariantDeviceProfile.iconTextSize;
        this.allAppsIconSizePx = Utilities.pxFromDp(invariantDeviceProfile.iconSize, displayMetrics);
        this.widthPx = i;
        this.heightPx = i2;
        if (z) {
            this.availableWidthPx = point2.x;
            this.availableHeightPx = point.y;
        } else {
            this.availableWidthPx = point.x;
            this.availableHeightPx = point2.y;
        }
        updateAvailableDimensions(displayMetrics, resources);
        this.allAppsButtonVisualSize = ((int) (((float) this.hotseatIconSizePx) * (1.0f - (((float) context.getResources().getInteger(R.integer.config_allAppsButtonPaddingPercent)) / 100.0f)))) - context.getResources().getDimensionPixelSize(R.dimen.all_apps_button_scale_down);
    }

    private final void updateFolderCellSize(float f, DisplayMetrics displayMetrics, Resources resources) {
        this.folderChildIconSizePx = (int) (((float) Utilities.pxFromDp(this.inv.iconSize, displayMetrics)) * f);
        int dimensionPixelSize = (int) (((float) resources.getDimensionPixelSize(R.dimen.folder_child_text_size)) * f);
        this.folderChildTextSizePx = dimensionPixelSize;
        int calculateTextHeight = Utilities.calculateTextHeight((float) dimensionPixelSize);
        int dimensionPixelSize2 = (int) (((float) resources.getDimensionPixelSize(R.dimen.folder_cell_x_padding)) * f);
        int dimensionPixelSize3 = (int) (((float) resources.getDimensionPixelSize(R.dimen.folder_cell_y_padding)) * f);
        int i = this.folderChildIconSizePx;
        this.folderCellWidthPx = dimensionPixelSize2 + dimensionPixelSize2 + i;
        this.folderCellHeightPx = i + dimensionPixelSize3 + dimensionPixelSize3 + calculateTextHeight;
    }

    private final void updateIconSize(float f, int i, Resources resources, DisplayMetrics displayMetrics) {
        this.iconSizePx = (int) (((float) Utilities.pxFromDp(this.inv.iconSize, displayMetrics)) * f);
        this.iconTextSizePx = (int) (((float) Utilities.pxFromSp(this.inv.iconTextSize, displayMetrics)) * f);
        this.iconDrawablePaddingPx = i;
        this.hotseatIconSizePx = (int) (((float) Utilities.pxFromDp(this.inv.hotseatIconSize, displayMetrics)) * f);
        this.normalSearchBarSpaceHeightPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_search_bar_height);
        this.tallSearchBarSpaceHeightPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_search_bar_height_tall);
        this.searchBarWidgetInternalPaddingTop = resources.getDimensionPixelSize(R.dimen.qsb_internal_padding_top);
        this.searchBarWidgetInternalPaddingBottom = resources.getDimensionPixelSize(R.dimen.qsb_internal_padding_bottom);
        this.normalSearchBarTopExtraPaddingPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_search_bar_extra_top_padding);
        this.tallSearchBarNegativeTopPaddingPx = resources.getDimensionPixelSize(R.dimen.dynamic_grid_search_bar_negative_top_padding_short);
        if (!this.isTablet || isVerticalBarLayout()) {
            this.searchBarTopPaddingPx = this.searchBarWidgetInternalPaddingTop;
            this.normalSearchBarBottomPaddingPx = this.searchBarWidgetInternalPaddingBottom + resources.getDimensionPixelSize(R.dimen.dynamic_grid_search_bar_bottom_padding);
            this.tallSearchBarBottomPaddingPx = this.searchBarWidgetInternalPaddingBottom + resources.getDimensionPixelSize(R.dimen.dynamic_grid_search_bar_bottom_negative_padding_short);
        } else {
            this.searchBarTopPaddingPx = this.searchBarWidgetInternalPaddingTop;
            int dimensionPixelSize = this.searchBarWidgetInternalPaddingBottom + resources.getDimensionPixelSize(R.dimen.dynamic_grid_search_bar_bottom_padding_tablet);
            this.normalSearchBarBottomPaddingPx = dimensionPixelSize;
            this.tallSearchBarBottomPaddingPx = dimensionPixelSize;
        }
        Paint paint = new Paint();
        paint.setTextSize((float) this.iconTextSizePx);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int i2 = this.iconSizePx;
        this.cellWidthPx = i2;
        this.cellHeightPx = i2 + this.iconDrawablePaddingPx + ((int) Math.ceil((double) (fontMetrics.bottom - fontMetrics.top)));
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.dragViewScale);
        int i3 = this.iconSizePx;
        float f2 = (float) i3;
        this.dragViewScale = (((float) dimensionPixelSize2) + f2) / f2;
        int i4 = this.edgeMarginPx;
        int i5 = i4 * 4;
        this.normalHotseatBarHeightPx = i3 + i5;
        this.shortHotseatBarHeightPx = i4 + i4 + i3;
        this.hotseatCellHeightPx = i3;
        this.folderCellWidthPx = Math.min(this.cellWidthPx + ((this.isTablet || this.isLandscape) ? i4 * 6 : i4 * 3), (this.availableWidthPx - i5) / this.inv.numFolderColumns);
        int i6 = this.edgeMarginPx;
        this.folderBackgroundOffset = -i6;
        this.folderIconSizePx = this.iconSizePx + i6 + i6;
    }

    public final Point getCellSize() {
        Point point = new Point();
        Point totalWorkspacePadding = getTotalWorkspacePadding();
        point.x = (this.availableWidthPx - totalWorkspacePadding.x) / this.inv.numColumns;
        point.y = (this.availableHeightPx - totalWorkspacePadding.y) / this.inv.numRows;
        return point;
    }

    public final int getCurrentWidth() {
        if (this.isLandscape) {
            return Math.max(this.widthPx, this.heightPx);
        }
        return Math.min(this.widthPx, this.heightPx);
    }

    /* access modifiers changed from: package-private */
    public final int getOverviewModeButtonBarHeight() {
        return Math.min(this.overviewModeMaxIconZoneHeightPx, Math.max(this.overviewModeMinIconZoneHeightPx, (int) (this.overviewModeIconZoneRatio * ((float) this.availableHeightPx))));
    }

    public final Rect getSearchBarBounds(boolean z) {
        Rect rect = new Rect();
        if (!isVerticalBarLayout()) {
            int i = this.searchBarSpaceHeightPx + this.searchBarTopPaddingPx + this.searchBarTopExtraPaddingPx + this.searchBarBottomPaddingPx;
            if (this.isTablet) {
                int currentWidth = getCurrentWidth();
                int i2 = this.edgeMarginPx;
                int i3 = this.inv.numColumns;
                int i4 = i3 + 1;
                int i5 = i2 + (((currentWidth - (i2 + i2)) - (i3 * this.cellWidthPx)) / (i4 + i4));
                rect.set(i5, 0, this.availableWidthPx - i5, i);
            } else {
                rect.set(this.desiredWorkspaceLeftRightMarginPx - this.defaultWidgetPadding.left, 0, this.availableWidthPx - (this.desiredWorkspaceLeftRightMarginPx - this.defaultWidgetPadding.right), i);
            }
        } else if (z) {
            int i6 = this.availableWidthPx;
            int i7 = this.normalSearchBarSpaceHeightPx;
            int i8 = this.edgeMarginPx;
            rect.set(i6 - i7, i8, i6, this.availableHeightPx - i8);
        } else {
            int i9 = this.edgeMarginPx;
            rect.set(0, i9, this.normalSearchBarSpaceHeightPx, this.availableHeightPx - i9);
        }
        return rect;
    }

    public final Point getSearchBarDimensForWidgetOpts(Resources resources) {
        Rect searchBarBounds = getSearchBarBounds(Utilities.isRtl(resources));
        if (isVerticalBarLayout()) {
            return new Point(searchBarBounds.width(), searchBarBounds.height());
        }
        return new Point(searchBarBounds.width(), this.searchBarSpaceHeightPx + this.searchBarWidgetInternalPaddingTop + this.searchBarWidgetInternalPaddingBottom);
    }

    public final Point getTotalWorkspacePadding() {
        Rect workspacePadding = getWorkspacePadding(false);
        return new Point(workspacePadding.left + workspacePadding.right, workspacePadding.top + workspacePadding.bottom);
    }

    /* access modifiers changed from: package-private */
    public final Rect getWorkspacePadding(boolean z) {
        int i;
        Rect searchBarBounds = getSearchBarBounds(z);
        Rect rect = new Rect();
        if (!isVerticalBarLayout()) {
            int i2 = searchBarBounds.bottom;
            int i3 = this.hotseatBarHeightPx + this.pageIndicatorHeightPx;
            if (this.isTablet) {
                float f = ((this.dragViewScale - 4.0f) / 2.0f) + 1.0f;
                int currentWidth = getCurrentWidth();
                if (this.isLandscape) {
                    i = Math.min(this.widthPx, this.heightPx);
                } else {
                    i = Math.max(this.widthPx, this.heightPx);
                }
                int i4 = this.inv.numColumns;
                int i5 = this.cellWidthPx;
                float min = Math.min((float) Math.max(0, currentWidth - ((int) (((float) (i4 * i5)) + ((((float) (i4 - 1)) * f) * ((float) i5))))), ((float) currentWidth) * 0.14f);
                int i6 = this.inv.numRows;
                int i7 = ((int) min) / 2;
                int max = Math.max(0, ((i - i2) - i3) - ((i6 + i6) * this.cellHeightPx)) / 2;
                rect.set(i7, i2 + max, i7, i3 + max);
            } else {
                rect.set(this.desiredWorkspaceLeftRightMarginPx - this.defaultWidgetPadding.left, i2, this.desiredWorkspaceLeftRightMarginPx - this.defaultWidgetPadding.right, i3);
            }
        } else if (z) {
            rect.set(this.normalHotseatBarHeightPx, this.edgeMarginPx, searchBarBounds.width(), this.edgeMarginPx);
        } else {
            int width = searchBarBounds.width();
            int i8 = this.edgeMarginPx;
            rect.set(width, i8, this.normalHotseatBarHeightPx, i8);
        }
        return rect;
    }

    public final boolean isVerticalBarLayout() {
        return this.isLandscape && this.transposeLayoutWithOrientation;
    }

    public final void setSearchBarHeight(int i) {
        if (i == 1) {
            this.hotseatBarHeightPx = this.shortHotseatBarHeightPx;
            this.searchBarSpaceHeightPx = this.tallSearchBarSpaceHeightPx;
            this.searchBarBottomPaddingPx = this.tallSearchBarBottomPaddingPx;
            this.searchBarTopExtraPaddingPx = this.isPhone ? this.tallSearchBarNegativeTopPaddingPx : this.normalSearchBarTopExtraPaddingPx;
            return;
        }
        this.hotseatBarHeightPx = this.normalHotseatBarHeightPx;
        this.searchBarSpaceHeightPx = this.normalSearchBarSpaceHeightPx;
        this.searchBarBottomPaddingPx = this.normalSearchBarBottomPaddingPx;
        this.searchBarTopExtraPaddingPx = this.normalSearchBarTopExtraPaddingPx;
    }

    /* access modifiers changed from: package-private */
    public final boolean shouldFadeAdjacentWorkspaceScreens() {
        return isVerticalBarLayout() || this.isLargeTablet;
    }

    public final void updateAvailableDimensions(DisplayMetrics displayMetrics, Resources resources) {
        float f;
        int i = this.iconDrawablePaddingOriginalPx;
        updateIconSize(1.0f, i, resources, displayMetrics);
        float f2 = (float) (this.cellHeightPx * this.inv.numRows);
        float f3 = (float) (this.availableHeightPx - getTotalWorkspacePadding().y);
        if (f2 > f3) {
            f = f3 / f2;
            i = 0;
        } else {
            f = 1.0f;
        }
        updateIconSize(f, i, resources, displayMetrics);
        updateFolderCellSize(1.0f, displayMetrics, resources);
        int i2 = (this.isTablet || this.isLandscape) ? this.edgeMarginPx * 6 : this.edgeMarginPx * 3;
        Point totalWorkspacePadding = getTotalWorkspacePadding();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.folder_label_padding_top);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.folder_label_padding_bottom);
        int calculateTextHeight = Utilities.calculateTextHeight(resources.getDimension(R.dimen.folder_label_text_size));
        int i3 = this.folderCellHeightPx;
        int i4 = this.inv.numFolderRows;
        float min = Math.min(((float) ((this.availableWidthPx - totalWorkspacePadding.x) - i2)) / ((float) (this.folderCellWidthPx * this.inv.numFolderColumns)), ((float) ((this.availableHeightPx - totalWorkspacePadding.y) - i2)) / ((float) ((i3 * i4) + ((dimensionPixelSize + dimensionPixelSize2) + calculateTextHeight))));
        if (min < 1.0f) {
            updateFolderCellSize(min, displayMetrics, resources);
        }
    }
}
