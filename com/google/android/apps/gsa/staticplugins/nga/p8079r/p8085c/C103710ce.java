package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80131bi;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ce */
/* compiled from: PG */
public final class C103710ce implements C103651a {

    /* renamed from: b */
    private static final C59071e f288839b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.r.c.ce");

    /* renamed from: a */
    public final C85005h f288840a;

    /* renamed from: c */
    private final C22871g f288841c;

    public C103710ce(C85005h hVar, C22871g gVar) {
        this.f288840a = hVar;
        this.f288841c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80131bi biVar;
        ((C59052c) ((C59052c) f288839b.mo56224b()).mo56372aa(21651)).mo56386p("#handleRequest.");
        if (bnVar.f219917a == 35) {
            biVar = (C80131bi) bnVar.f219918b;
        } else {
            biVar = C80131bi.f219906c;
        }
        if ((biVar.f219908a & 1) != 0) {
            return this.f288841c.mo28201a("[NGA] handleRequest", new C103709cd(this, bnVar));
        }
        return C60856cj.m92899h(new IllegalArgumentException("OneOffRequest does not contain valid Sheldon notification Request"));
    }
}
