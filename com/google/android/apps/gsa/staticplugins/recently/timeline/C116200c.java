package com.google.android.apps.gsa.staticplugins.recently.timeline;

import com.google.android.libraries.gsa.p1875j.C22845p;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.timeline.c */
/* compiled from: PG */
public final /* synthetic */ class C116200c implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C116200c f322181a = new C116200c();

    private /* synthetic */ C116200c() {
    }

    public final int compare(Object obj, Object obj2) {
        C22845p pVar = (C22845p) obj2;
        int i = ((C22845p) obj).f62892a & 64;
        if ((i != 0) == ((pVar.f62892a & 64) != 0)) {
            return 0;
        }
        return i != 0 ? 1 : -1;
    }
}
