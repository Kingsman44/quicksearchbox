package com.google.android.apps.gsa.searchbox.p6944c;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.c.g */
/* compiled from: PG */
public final /* synthetic */ class C88603g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C88607k f239449a;

    /* renamed from: b */
    public final /* synthetic */ C41642a f239450b;

    /* renamed from: c */
    public final /* synthetic */ List f239451c;

    /* renamed from: d */
    public final /* synthetic */ boolean f239452d;

    public /* synthetic */ C88603g(C88607k kVar, C41642a aVar, List list, boolean z) {
        this.f239449a = kVar;
        this.f239450b = aVar;
        this.f239451c = list;
        this.f239452d = z;
    }

    public final void run() {
        boolean z;
        int i;
        C88607k kVar = this.f239449a;
        C41642a aVar = this.f239450b;
        List list = this.f239451c;
        boolean z2 = this.f239452d;
        synchronized (kVar) {
            z = false;
            if (kVar.f239471c.containsKey(aVar)) {
                C88606j jVar = (C88606j) kVar.f239471c.get(aVar);
                jVar.getClass();
                if (jVar.f239462d <= 0) {
                    z = true;
                }
            }
        }
        if (z) {
            if (z2) {
                i = kVar.f239485q;
            } else {
                i = kVar.f239486r;
            }
            kVar.mo82264m(aVar, list, i);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (C88607k.m143219n(list)) {
            kVar.f239473e.mo82190j(aVar);
        }
    }
}
