package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.h */
/* compiled from: PG */
final class C93862h extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C93863i f262141a;

    public C93862h(C93863i iVar) {
        this.f262141a = iVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), this.f262141a.f262143b.getString(R.string.corpora_dialog_corpus_suffix_action)));
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_FOCUS);
        view.setSelected(false);
        view.setClickable(true);
        view.setFocusable(true);
    }
}
