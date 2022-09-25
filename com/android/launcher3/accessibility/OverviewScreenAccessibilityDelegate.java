package com.android.launcher3.accessibility;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.Workspace;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class OverviewScreenAccessibilityDelegate extends View.AccessibilityDelegate {
    private final SparseArray mActions;
    private final Workspace mWorkspace;

    public OverviewScreenAccessibilityDelegate(Workspace workspace) {
        SparseArray sparseArray = new SparseArray();
        this.mActions = sparseArray;
        this.mWorkspace = workspace;
        Context context = workspace.getContext();
        boolean isRtl = Utilities.isRtl(context.getResources());
        int i = R.string.action_move_screen_right;
        sparseArray.put(R.id.action_move_screen_backwards, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_move_screen_backwards, context.getText(isRtl ? R.string.action_move_screen_right : R.string.action_move_screen_left)));
        sparseArray.put(R.id.action_move_screen_forwards, new AccessibilityNodeInfo.AccessibilityAction(R.id.action_move_screen_forwards, context.getText(true == isRtl ? R.string.action_move_screen_left : i)));
    }

    private final void movePage(int i, View view) {
        this.mWorkspace.onStartReordering();
        this.mWorkspace.removeView(view);
        this.mWorkspace.addView(view, i);
        this.mWorkspace.onEndReordering();
        Workspace workspace = this.mWorkspace;
        workspace.announceForAccessibility(workspace.getContext().getText(R.string.screen_moved));
        this.mWorkspace.updateAccessibilityFlags();
        view.performAccessibilityAction(64, (Bundle) null);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int indexOfChild = this.mWorkspace.indexOfChild(view);
        if (indexOfChild < this.mWorkspace.getChildCount() - 1) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_move_screen_forwards));
        }
        if (indexOfChild > this.mWorkspace.numCustomPages()) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_move_screen_backwards));
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (view != null) {
            if (i == 64) {
                this.mWorkspace.setCurrentPage(this.mWorkspace.indexOfChild(view));
            } else if (i == R.id.action_move_screen_forwards) {
                movePage(this.mWorkspace.indexOfChild(view) + 1, view);
                return true;
            } else if (i == R.id.action_move_screen_backwards) {
                movePage(this.mWorkspace.indexOfChild(view) - 1, view);
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
