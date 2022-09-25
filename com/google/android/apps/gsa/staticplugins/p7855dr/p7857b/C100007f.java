package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.p7074a.C90179d;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.f */
/* compiled from: PG */
final class C100007f {

    /* renamed from: a */
    private static final C59071e f279706a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dr.b.f");

    /* renamed from: b */
    private final Map f279707b;

    public C100007f(C100002aj... ajVarArr) {
        this.f279707b = C58662ni.m90345d(Arrays.asList(ajVarArr), C100006e.f279705a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91713a(C90179d dVar, boolean z) {
        if (z) {
            C100002aj ajVar = (C100002aj) this.f279707b.get(dVar);
            if (ajVar == null) {
                ((C59052c) ((C59052c) f279706a.mo56226d()).mo56372aa(33160)).mo56389s("Feature of type %s has not been added.", dVar);
                return;
            }
            for (Map.Entry entry : ((C58495hd) this.f279707b).entrySet()) {
                if (entry.getKey() != dVar) {
                    ((C100002aj) entry.getValue()).mo91700d();
                }
            }
            ajVar.mo91692c().mo28730f(true, false);
            C100001ai b = ajVar.mo91691b();
            if (b != null) {
                b.mo91699a(1);
                return;
            }
            return;
        }
        C100002aj ajVar2 = (C100002aj) this.f279707b.get(dVar);
        if (ajVar2 == null) {
            ((C59052c) ((C59052c) f279706a.mo56226d()).mo56372aa(33159)).mo56389s("Feature of type %s has not been added.", dVar);
        } else {
            ajVar2.mo91700d();
        }
    }
}
