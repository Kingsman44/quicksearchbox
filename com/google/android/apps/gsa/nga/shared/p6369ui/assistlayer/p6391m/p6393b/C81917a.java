package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6393b;

import android.graphics.RectF;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80708cj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80710cl;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81822o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a.C81874ab;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a.C81889aq;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a.C81909t;
import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.b.a */
/* compiled from: PG */
public final /* synthetic */ class C81917a implements C81822o {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223987a;

    public /* synthetic */ C81917a(C81889aq aqVar) {
        this.f223987a = aqVar;
    }

    /* renamed from: a */
    public final RectF mo75196a() {
        C81889aq aqVar = this.f223987a;
        if (((C80710cl) ((C83352b) aqVar.f223924i).mo76654b()).mo74471b().equals(C80708cj.GONE)) {
            return new RectF();
        }
        return (RectF) ((Optional) ((C83361k) aqVar.f223922g.f224173g).f227199b.get()).map(C81909t.f223980a).map(C81874ab.f223891a).orElse(new RectF());
    }
}
