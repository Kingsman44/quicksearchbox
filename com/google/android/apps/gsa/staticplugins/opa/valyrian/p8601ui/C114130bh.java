package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.view.View;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bh */
/* compiled from: PG */
final class C114130bh implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C114127be beVar = (C114127be) ((View) obj).getLayoutParams();
        C114127be beVar2 = (C114127be) ((View) obj2).getLayoutParams();
        boolean z = beVar.f316329a;
        if (z != beVar2.f316329a) {
            return !z ? -1 : 1;
        }
        return beVar.f316333e - beVar2.f316333e;
    }
}
