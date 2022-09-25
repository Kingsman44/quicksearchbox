package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.view.p2078at.C25503ai;
import com.google.common.p4575r.C60745b;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.main.ci */
/* compiled from: PG */
public final /* synthetic */ class C27346ci implements C25503ai {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74838a;

    public /* synthetic */ C27346ci(C27384dt dtVar) {
        this.f74838a = dtVar;
    }

    /* renamed from: a */
    public final void mo30530a(boolean[] zArr) {
        C27384dt dtVar = this.f74838a;
        if (!C60745b.m92718c(zArr)) {
            Stream stream = DesugarArrays.stream((T[]) dtVar.f74997q.mo30538h());
            C27292ai aiVar = dtVar.f74987g;
            Objects.requireNonNull(aiVar);
            if (!stream.anyMatch(new C27332bv(aiVar))) {
                dtVar.f75003w.mo30360p();
            }
        }
    }
}
