package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gcoreclient.p1788q.p1791b.C21627a;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21745b;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21747d;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21749f;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21750g;
import com.google.android.libraries.gcoreclient.p1811z.p1812a.C21751h;
import com.google.assistant.p3861at.adx;
import com.google.assistant.p3861at.adz;
import com.google.assistant.p3861at.aea;
import com.google.assistant.p3861at.aec;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.j */
/* compiled from: PG */
public final class C109814j {

    /* renamed from: a */
    public static final C59071e f306019a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.omniconsent.j");

    /* renamed from: b */
    public static final int[] f306020b = {9, 10};

    /* renamed from: c */
    public final C83893b f306021c;

    /* renamed from: d */
    public final C109815k f306022d;

    /* renamed from: e */
    public final C21627a f306023e;

    /* renamed from: f */
    public final C86124t f306024f;

    /* renamed from: g */
    public final C21745b f306025g = new C21750g();

    /* renamed from: h */
    public final C21747d f306026h;

    public C109814j(C83893b bVar, C109815k kVar, C21627a aVar, C21747d dVar, C86124t tVar) {
        this.f306021c = bVar;
        this.f306022d = kVar;
        this.f306023e = aVar;
        this.f306026h = dVar;
        this.f306024f = tVar;
    }

    /* renamed from: b */
    public static C58833ax m182893b(C21749f fVar, C56116b bVar) {
        return C58557jl.m90122c(fVar.mo27085a().mo27084a(), new C109812h(bVar));
    }

    /* renamed from: c */
    public static aec m182894c(int i) {
        aea aea = (aea) aec.f129093c.createBuilder();
        aea.copyOnWrite();
        aec aec = (aec) aea.instance;
        aec.f129096b = i - 1;
        aec.f129095a |= 1;
        return (aec) aea.build();
    }

    /* renamed from: d */
    private static adz m182895d(int i) {
        adx adx = (adx) adz.f129082c.createBuilder();
        adx.copyOnWrite();
        adz adz = (adz) adx.instance;
        adz.f129085b = i - 1;
        adz.f129084a |= 1;
        return (adz) adx.build();
    }

    /* renamed from: a */
    public final adz mo98169a(C21751h hVar) {
        int i = hVar.f60052a.f394775b;
        if (i == 2) {
            return m182895d(2);
        }
        if (i == 3) {
            return m182895d(3);
        }
        ((C59052c) ((C59052c) f306019a.mo56226d()).mo56372aa(25242)).mo56387q("unknown UDC setting value %d", i);
        return m182895d(1);
    }
}
