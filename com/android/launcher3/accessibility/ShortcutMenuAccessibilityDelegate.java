package com.android.launcher3.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.shortcuts.DeepShortcutView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public final class ShortcutMenuAccessibilityDelegate extends LauncherAccessibilityDelegate {
    public ShortcutMenuAccessibilityDelegate(Launcher launcher) {
        super(launcher);
    }

    /* access modifiers changed from: protected */
    public final void addActions(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) this.mActions.get(R.id.action_add_to_workspace));
    }

    public final boolean performAction(View view, ItemInfo itemInfo, int i) {
        if (i != R.id.action_add_to_workspace || !(view.getParent() instanceof DeepShortcutView)) {
            return false;
        }
        final ShortcutInfo finalInfo = ((DeepShortcutView) view.getParent()).getFinalInfo();
        final int[] iArr = new int[2];
        final long findSpaceOnWorkspace = findSpaceOnWorkspace(itemInfo, iArr);
        C54461 r0 = new Runnable() {
            public final void run() {
                Launcher launcher = ShortcutMenuAccessibilityDelegate.this.mLauncher;
                ShortcutInfo shortcutInfo = finalInfo;
                long j = findSpaceOnWorkspace;
                int[] iArr = iArr;
                LauncherModel.addItemToDatabase(launcher, shortcutInfo, -100, j, iArr[0], iArr[1]);
                ArrayList arrayList = new ArrayList();
                arrayList.add(finalInfo);
                ShortcutMenuAccessibilityDelegate.this.mLauncher.bindItems(arrayList, 0, arrayList.size(), true);
                ShortcutMenuAccessibilityDelegate.this.mLauncher.closeShortcutsContainer(true);
                ShortcutMenuAccessibilityDelegate.this.announceConfirmation((int) R.string.item_added_to_workspace);
            }
        };
        if (this.mLauncher.showWorkspace$ar$ds(r0)) {
            return true;
        }
        r0.run();
        return true;
    }
}
