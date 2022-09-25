package com.android.launcher3.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import com.android.launcher3.BaseContainerView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DeleteDropTarget;
import com.android.launcher3.DragController;
import com.android.launcher3.DragSource;
import com.android.launcher3.DropTarget;
import com.android.launcher3.Folder;
import com.android.launcher3.IconCache;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.Utilities;
import com.android.launcher3.WidgetPreviewLoader;
import com.android.launcher3.Workspace;
import com.android.launcher3.util.TransformingTouchDelegate;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class WidgetsContainerView extends BaseContainerView implements View.OnLongClickListener, View.OnClickListener, DragSource {
    public WidgetsListAdapter mAdapter;
    private DragController mDragController;
    private IconCache mIconCache;
    Launcher mLauncher;
    public WidgetsRecyclerView mRecyclerView;
    private TransformingTouchDelegate mRecyclerViewTouchDelegate;
    private final Rect mTmpBgPaddingRect;
    private Toast mWidgetInstructionToast;
    private WidgetPreviewLoader mWidgetPreviewLoader;

    public WidgetsContainerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final float getIntrinsicIconScaleFactor() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((View) this.mRecyclerView.getParent()).setTouchDelegate(this.mRecyclerViewTouchDelegate);
    }

    public final void onClick(View view) {
        if (this.mLauncher.isWidgetsViewVisible() && !this.mLauncher.mWorkspace.mIsSwitchingState && (view instanceof WidgetCell)) {
            Toast toast = this.mWidgetInstructionToast;
            if (toast != null) {
                toast.cancel();
            }
            CharSequence text = getContext().getText(R.string.long_press_widget_to_add);
            String string = getContext().getString(R.string.long_accessible_way_to_add);
            if (Utilities.ATLEAST_LOLLIPOP) {
                SpannableString spannableString = new SpannableString(text);
                spannableString.setSpan(new TtsSpan.TextBuilder(string).build(), 0, spannableString.length(), 18);
                text = spannableString;
            }
            Toast makeText = Toast.makeText(getContext(), text, 0);
            this.mWidgetInstructionToast = makeText;
            makeText.show();
        }
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
        super.onFinishInflate();
        WidgetsRecyclerView widgetsRecyclerView = (WidgetsRecyclerView) this.mContent.findViewById(R.id.widgets_list_view);
        this.mRecyclerView = widgetsRecyclerView;
        widgetsRecyclerView.setAdapter(this.mAdapter);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mRecyclerViewTouchDelegate = new TransformingTouchDelegate(this.mRecyclerView);
    }

    public final void onFlingToDeleteCompleted() {
        this.mLauncher.exitSpringLoadedDragModeDelayed$ar$ds(true, 300);
        this.mLauncher.unlockScreenOrientation(false);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mRevealView.getBackground().getPadding(this.mTmpBgPaddingRect);
        TransformingTouchDelegate transformingTouchDelegate = this.mRecyclerViewTouchDelegate;
        transformingTouchDelegate.mBounds.set((float) (this.mRecyclerView.getLeft() - this.mTmpBgPaddingRect.left), (float) (this.mRecyclerView.getTop() - this.mTmpBgPaddingRect.top), (float) (this.mRecyclerView.getRight() + this.mTmpBgPaddingRect.right), (float) (this.mRecyclerView.getBottom() + this.mTmpBgPaddingRect.bottom));
        transformingTouchDelegate.mTouchCheckBounds.set(transformingTouchDelegate.mBounds);
        transformingTouchDelegate.mTouchCheckBounds.inset(0.0f, 0.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r21) {
        /*
            r20 = this;
            r10 = r20
            r11 = r21
            boolean r0 = r21.isInTouchMode()
            r1 = 0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            com.android.launcher3.Launcher r0 = r10.mLauncher
            boolean r0 = r0.isWidgetsViewVisible()
            if (r0 == 0) goto L_0x022a
            com.android.launcher3.Launcher r0 = r10.mLauncher
            com.android.launcher3.Workspace r2 = r0.mWorkspace
            boolean r2 = r2.mIsSwitchingState
            if (r2 == 0) goto L_0x001e
            goto L_0x022a
        L_0x001e:
            boolean r0 = r0.isDraggingEnabled()
            if (r0 == 0) goto L_0x022a
            boolean r0 = r11 instanceof com.android.launcher3.widget.WidgetCell
            r12 = 1
            if (r0 == 0) goto L_0x01c5
            r0 = r11
            com.android.launcher3.widget.WidgetCell r0 = (com.android.launcher3.widget.WidgetCell) r0
            r2 = 2131437212(0x7f0b269c, float:1.8496316E38)
            android.view.View r2 = r0.findViewById(r2)
            com.android.launcher3.widget.WidgetImageView r2 = (com.android.launcher3.widget.WidgetImageView) r2
            java.lang.Object r3 = r0.getTag()
            r5 = r3
            com.android.launcher3.PendingAddItemInfo r5 = (com.android.launcher3.PendingAddItemInfo) r5
            android.graphics.Bitmap r3 = r2.mBitmap
            if (r3 != 0) goto L_0x0042
            goto L_0x01e4
        L_0x0042:
            r2.updateDstRectF()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.RectF r4 = r2.mDstRectF
            r4.round(r3)
            boolean r4 = r5 instanceof com.android.launcher3.widget.PendingAddWidgetInfo
            if (r4 == 0) goto L_0x00c6
            r0 = r5
            com.android.launcher3.widget.PendingAddWidgetInfo r0 = (com.android.launcher3.widget.PendingAddWidgetInfo) r0
            com.android.launcher3.Launcher r6 = r10.mLauncher
            com.android.launcher3.Workspace r6 = r6.mWorkspace
            int[] r6 = r6.estimateItemSize(r0, r12, r1)
            android.graphics.Bitmap r7 = r2.mBitmap
            int r8 = r7.getWidth()
            float r8 = (float) r8
            r9 = 1067450368(0x3fa00000, float:1.25)
            float r8 = r8 * r9
            int r8 = (int) r8
            r6 = r6[r1]
            int r16 = java.lang.Math.min(r8, r6)
            int[] r6 = new int[r12]
            com.android.launcher3.WidgetPreviewLoader r8 = r10.mWidgetPreviewLoader
            if (r8 != 0) goto L_0x007e
            com.android.launcher3.LauncherAppState r8 = com.android.launcher3.LauncherAppState.getInstance()
            com.android.launcher3.WidgetPreviewLoader r8 = r8.mWidgetCache
            r10.mWidgetPreviewLoader = r8
        L_0x007e:
            com.android.launcher3.WidgetPreviewLoader r13 = r10.mWidgetPreviewLoader
            com.android.launcher3.Launcher r14 = r10.mLauncher
            com.android.launcher3.LauncherAppWidgetProviderInfo r15 = r0.info
            r17 = 0
            r18 = r6
            android.graphics.Bitmap r0 = r13.generateWidgetPreview(r14, r15, r16, r17, r18)
            r8 = r6[r1]
            int r9 = r7.getWidth()
            if (r8 >= r9) goto L_0x00bc
            int r8 = r7.getWidth()
            r6 = r6[r1]
            int r8 = r8 - r6
            int r8 = r8 / 2
            int r6 = r7.getWidth()
            int r9 = r2.getWidth()
            if (r6 <= r9) goto L_0x00b2
            int r6 = r2.getWidth()
            int r8 = r8 * r6
            int r6 = r7.getWidth()
            int r8 = r8 / r6
        L_0x00b2:
            int r6 = r3.left
            int r6 = r6 + r8
            r3.left = r6
            int r6 = r3.right
            int r6 = r6 - r8
            r3.right = r6
        L_0x00bc:
            int r6 = r3.width()
            float r6 = (float) r6
            int r7 = r0.getWidth()
            goto L_0x00eb
        L_0x00c6:
            java.lang.Object r0 = r0.getTag()
            com.android.launcher3.widget.PendingAddShortcutInfo r0 = (com.android.launcher3.widget.PendingAddShortcutInfo) r0
            com.android.launcher3.compat.ShortcutConfigActivityInfo r6 = r0.activityInfo
            com.android.launcher3.IconCache r7 = r10.mIconCache
            android.graphics.drawable.Drawable r6 = r6.getFullResIcon(r7)
            com.android.launcher3.compat.UserHandleCompat r0 = r0.user
            com.android.launcher3.Launcher r7 = r10.mLauncher
            android.graphics.Bitmap r0 = com.android.launcher3.Utilities.createBadgedIconBitmap(r6, r0, r7)
            r5.spanY = r12
            r5.spanX = r12
            com.android.launcher3.Launcher r6 = r10.mLauncher
            com.android.launcher3.DeviceProfile r6 = r6.mDeviceProfile
            int r6 = r6.iconSizePx
            float r6 = (float) r6
            int r7 = r0.getWidth()
        L_0x00eb:
            float r7 = (float) r7
            float r6 = r6 / r7
            r13 = r0
            r8 = r6
            if (r4 == 0) goto L_0x00fc
            r0 = r5
            com.android.launcher3.widget.PendingAddWidgetInfo r0 = (com.android.launcher3.widget.PendingAddWidgetInfo) r0
            int r0 = r0.previewImage
            if (r0 == 0) goto L_0x00f9
            goto L_0x00fc
        L_0x00f9:
            r19 = 0
            goto L_0x00fe
        L_0x00fc:
            r19 = 1
        L_0x00fe:
            com.android.launcher3.Launcher r0 = r10.mLauncher
            r0.lockScreenOrientation()
            com.android.launcher3.Launcher r0 = r10.mLauncher
            com.android.launcher3.Workspace r0 = r0.mWorkspace
            int[] r4 = r0.estimateItemSize(r5, r1, r1)
            r6 = r4[r1]
            r4 = r4[r12]
            android.content.res.Resources r7 = r0.getResources()
            r9 = 2131103302(0x7f060e46, float:1.7819066E38)
            int r18 = r7.getColor(r9)
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r6, r4, r7)
            android.graphics.Canvas r9 = r0.mCanvas
            r9.setBitmap(r7)
            android.graphics.Rect r9 = new android.graphics.Rect
            int r14 = r13.getWidth()
            int r15 = r13.getHeight()
            r9.<init>(r1, r1, r14, r15)
            int r14 = r6 + -2
            float r14 = (float) r14
            int r15 = r13.getWidth()
            float r15 = (float) r15
            float r14 = r14 / r15
            int r15 = r4 + -2
            float r15 = (float) r15
            int r12 = r13.getHeight()
            float r12 = (float) r12
            float r15 = r15 / r12
            float r12 = java.lang.Math.min(r14, r15)
            int r14 = r13.getWidth()
            float r14 = (float) r14
            float r14 = r14 * r12
            int r14 = (int) r14
            int r15 = r13.getHeight()
            float r15 = (float) r15
            float r12 = r12 * r15
            int r12 = (int) r12
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r1, r1, r14, r12)
            int r6 = r6 - r14
            int r6 = r6 / 2
            int r4 = r4 - r12
            int r4 = r4 / 2
            r15.offset(r6, r4)
            android.graphics.Canvas r4 = r0.mCanvas
            r6 = 0
            r4.drawBitmap(r13, r9, r15, r6)
            com.android.launcher3.HolographicOutlineHelper r14 = r0.mOutlineHelper
            android.graphics.Canvas r4 = r0.mCanvas
            r15 = r7
            r16 = r4
            r17 = r18
            r14.applyExpensiveOutlineWithBlur(r15, r16, r17, r18, r19)
            android.graphics.Canvas r4 = r0.mCanvas
            r4.setBitmap(r6)
            r0.mDragOutline = r7
            com.android.launcher3.DragController r0 = r10.mDragController
            int[] r4 = r0.mCoordinatesTemp
            com.android.launcher3.Launcher r6 = r0.mLauncher
            com.android.launcher3.DragLayer r6 = r6.mDragLayer
            r6.getLocationInDragLayer(r2, r4)
            r1 = r4[r1]
            int r2 = r3.left
            int r1 = r1 + r2
            int r2 = r13.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r8
            int r6 = r13.getWidth()
            float r6 = (float) r6
            float r2 = r2 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r6
            int r2 = (int) r2
            int r2 = r2 + r1
            r1 = 1
            r4 = r4[r1]
            int r1 = r3.top
            int r4 = r4 + r1
            int r1 = r13.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r8
            int r3 = r13.getHeight()
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = r1 / r6
            int r1 = (int) r1
            int r3 = r4 + r1
            r6 = 0
            r7 = 0
            r9 = 0
            r1 = r13
            r4 = r20
            r0.startDrag$ar$ds(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.recycle()
            goto L_0x01d8
        L_0x01c5:
            java.lang.String r0 = java.lang.String.valueOf(r21)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unexpected dragging view: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "WidgetsContainerView"
            android.util.Log.e(r1, r0)
        L_0x01d8:
            com.android.launcher3.Launcher r0 = r10.mLauncher
            com.android.launcher3.DragController r1 = r0.mDragController
            boolean r1 = r1.mDragging
            if (r1 == 0) goto L_0x01e3
            r0.enterSpringLoadedDragMode()
        L_0x01e3:
            r1 = 1
        L_0x01e4:
            if (r1 == 0) goto L_0x022a
            java.lang.Object r0 = r21.getTag()
            boolean r0 = r0 instanceof com.android.launcher3.widget.PendingAddWidgetInfo
            if (r0 == 0) goto L_0x022a
            com.android.launcher3.widget.WidgetHostViewLoader r0 = new com.android.launcher3.widget.WidgetHostViewLoader
            com.android.launcher3.Launcher r1 = r10.mLauncher
            r0.<init>(r1, r11)
            com.android.launcher3.widget.PendingAddWidgetInfo r1 = r0.mInfo
            com.android.launcher3.LauncherAppWidgetProviderInfo r2 = r1.info
            boolean r3 = r2.isCustomWidget
            com.android.launcher3.Launcher r3 = r0.mLauncher
            android.os.Bundle r1 = com.android.launcher3.widget.WidgetHostViewLoader.getDefaultOptionsForWidget(r3, r1)
            android.content.ComponentName r3 = r2.configure
            if (r3 == 0) goto L_0x020a
            com.android.launcher3.widget.PendingAddWidgetInfo r2 = r0.mInfo
            r2.bindOptions = r1
            goto L_0x021f
        L_0x020a:
            com.android.launcher3.widget.WidgetHostViewLoader$1 r3 = new com.android.launcher3.widget.WidgetHostViewLoader$1
            r3.<init>(r2, r1)
            r0.mBindWidgetRunnable = r3
            com.android.launcher3.widget.WidgetHostViewLoader$2 r1 = new com.android.launcher3.widget.WidgetHostViewLoader$2
            r1.<init>(r2)
            r0.mInflateWidgetRunnable = r1
            android.os.Handler r1 = r0.mHandler
            java.lang.Runnable r2 = r0.mBindWidgetRunnable
            r1.post(r2)
        L_0x021f:
            com.android.launcher3.Launcher r1 = r10.mLauncher
            com.android.launcher3.DragController r1 = r1.mDragController
            java.util.ArrayList r1 = r1.mListeners
            r1.add(r0)
            r0 = 1
            return r0
        L_0x022a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.widget.WidgetsContainerView.onLongClick(android.view.View):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onUpdateBgPadding(Rect rect, Rect rect2) {
        if (Utilities.isRtl(getResources())) {
            this.mContent.setPadding(0, rect2.top, rect2.right, rect2.bottom);
            WidgetsRecyclerView widgetsRecyclerView = this.mRecyclerView;
            widgetsRecyclerView.mBackgroundPadding.set(new Rect(rect2.left, 0, 0, 0));
            return;
        }
        this.mContent.setPadding(rect2.left, rect2.top, 0, rect2.bottom);
        WidgetsRecyclerView widgetsRecyclerView2 = this.mRecyclerView;
        widgetsRecyclerView2.mBackgroundPadding.set(new Rect(0, 0, rect2.right, 0));
    }

    public final void scrollToTop() {
        this.mRecyclerView.scrollToPosition(0);
    }

    public final boolean supportsAppInfoDropTarget() {
        return true;
    }

    public final boolean supportsDeleteDropTarget() {
        return false;
    }

    public final boolean supportsFlingToDelete() {
        return false;
    }

    public WidgetsContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetsContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTmpBgPaddingRect = new Rect();
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        this.mDragController = launcher.mDragController;
        this.mAdapter = new WidgetsListAdapter(context, this, this, launcher);
        this.mIconCache = LauncherAppState.getInstance().mIconCache;
    }
}
