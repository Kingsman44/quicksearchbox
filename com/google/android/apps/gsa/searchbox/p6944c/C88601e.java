package com.google.android.apps.gsa.searchbox.p6944c;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.c.e */
/* compiled from: PG */
public final /* synthetic */ class C88601e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C88607k f239441a;

    /* renamed from: b */
    public final /* synthetic */ C41642a f239442b;

    /* renamed from: c */
    public final /* synthetic */ List f239443c;

    /* renamed from: d */
    public final /* synthetic */ int f239444d;

    public /* synthetic */ C88601e(C88607k kVar, C41642a aVar, List list, int i) {
        this.f239441a = kVar;
        this.f239442b = aVar;
        this.f239443c = list;
        this.f239444d = i;
    }

    public final void run() {
        int i;
        int i2;
        C88607k kVar = this.f239441a;
        C41642a aVar = this.f239442b;
        List list = this.f239443c;
        int i3 = this.f239444d;
        C58976aa aaVar = C58975e.f156826a;
        if (C88607k.m143219n(list)) {
            boolean z = ((C88616t) aVar).f239556a.mo84352bk().length() < kVar.f239478j;
            if (z) {
                i = kVar.f239479k;
            } else {
                i = kVar.f239480l;
            }
            if (i3 == i) {
                kVar.f239473e.mo82191k(aVar);
                return;
            }
            if (z) {
                i2 = kVar.f239483o;
            } else {
                i2 = kVar.f239484p;
            }
            if (i3 == i2) {
                kVar.f239473e.mo82190j(aVar);
            } else {
                kVar.f239473e.mo82189i(aVar);
            }
        }
    }
}
