package com.google.android.apps.gsa.search.core.p6877t;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.t.a */
/* compiled from: PG */
public final class C87173a {

    /* renamed from: b */
    private static final C59071e f235573b = C59071e.m91332i("com.google.android.apps.gsa.search.core.t.a");

    /* renamed from: a */
    public final long f235574a;

    public C87173a(C86338r rVar) {
        try {
            long j = rVar.getLong("PersistenceBackedCounter", 0) + 1;
            this.f235574a = j;
            C86337q b = rVar.mo80076b();
            b.mo80072g("PersistenceBackedCounter", j);
            b.apply();
        } catch (ClassCastException e) {
            Object obj = rVar.getAll().get("PersistenceBackedCounter");
            obj.getClass();
            C59104x d = f235573b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PersistenceBackedCounte");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8230)).mo56354G("Unexpected type of %s startup preference, expected Long, actual %s", "PersistenceBackedCounter", obj.getClass().getName());
            C86337q b2 = rVar.mo80076b();
            b2.mo80075j("PersistenceBackedCounter");
            b2.apply();
            this.f235574a = 0;
        }
    }
}
