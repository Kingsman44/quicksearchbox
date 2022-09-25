package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7003av.C89295c;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.br */
/* compiled from: PG */
public final class C103696br implements C103651a {

    /* renamed from: a */
    public final SharedPreferences f288807a;

    /* renamed from: b */
    public final C86054o f288808b;

    /* renamed from: c */
    public final C68214a f288809c;

    /* renamed from: d */
    public final C89295c f288810d;

    /* renamed from: e */
    private final C22871g f288811e;

    public C103696br(SharedPreferences sharedPreferences, C86054o oVar, C68214a aVar, C22871g gVar, C89295c cVar) {
        this.f288807a = sharedPreferences;
        this.f288808b = oVar;
        this.f288809c = aVar;
        this.f288811e = gVar;
        this.f288810d = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (bnVar.f219917a == 23) {
            return this.f288811e.mo28201a("[NGA] QuerySnapshotStatusHandler.handleRequest", new C103695bq(this));
        }
        return C60856cj.m92900i(C80275dd.f220288c);
    }
}
