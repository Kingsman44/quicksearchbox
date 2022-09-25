package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.g */
/* compiled from: PG */
final class C41988g extends LinearLayoutManager {
    public C41988g(Context context) {
        super(context);
    }

    public final void onInitializeAccessibilityNodeInfoForItem(C0661fw fwVar, C0670ge geVar, View view, C1991k kVar) {
        kVar.mo5155d(new C1990j(AccessibilityNodeInfo.CollectionItemInfo.obtain(getPosition(view), 1, 0, 1, false)));
    }
}
