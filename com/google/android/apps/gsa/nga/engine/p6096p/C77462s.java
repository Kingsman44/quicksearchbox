package com.google.android.apps.gsa.nga.engine.p6096p;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.p.s */
/* compiled from: PG */
public final /* synthetic */ class C77462s implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C77467x f213488a;

    /* renamed from: b */
    public final /* synthetic */ Optional f213489b;

    /* renamed from: c */
    public final /* synthetic */ boolean f213490c;

    public /* synthetic */ C77462s(C77467x xVar, Optional optional, boolean z) {
        this.f213488a = xVar;
        this.f213489b = optional;
        this.f213490c = z;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C77467x xVar = this.f213488a;
        Optional optional = this.f213489b;
        boolean z = this.f213490c;
        for (C77443aj a : xVar.f213496c) {
            try {
                a.mo72574a((String) optional.get());
            } catch (IOException e) {
                if (z) {
                    ((C58970a) ((C58970a) ((C58970a) C77467x.f213494a.mo56225c()).mo56382g(e)).mo56372aa(3883)).mo56386p("Failed to update new PKG Slice.");
                }
            }
        }
        return C118826c.f331422a;
    }
}
