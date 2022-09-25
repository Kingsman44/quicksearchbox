package com.google.android.apps.gsa.staticplugins.p7714cv.p7719c;

import com.google.android.apps.gsa.p6487s3.C84293k;
import com.google.android.apps.gsa.p6487s3.C84332u;
import com.google.android.apps.gsa.p6487s3.C84335x;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.c.j */
/* compiled from: PG */
public final /* synthetic */ class C98727j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98729l f275773a;

    /* renamed from: b */
    public final /* synthetic */ C98721d f275774b;

    /* renamed from: c */
    public final /* synthetic */ C89061q f275775c;

    /* renamed from: d */
    public final /* synthetic */ C92473f f275776d;

    public /* synthetic */ C98727j(C98729l lVar, C98721d dVar, C89061q qVar, C92473f fVar) {
        this.f275773a = lVar;
        this.f275774b = dVar;
        this.f275775c = qVar;
        this.f275776d = fVar;
    }

    public final C60870cx apply(Object obj) {
        C84332u uVar;
        C98729l lVar = this.f275773a;
        C98721d dVar = this.f275774b;
        C89061q qVar = this.f275775c;
        C92473f fVar = this.f275776d;
        C92439c cVar = (C92439c) obj;
        C85133a aVar = lVar.f275783f;
        if (fVar.f258009E.mo84324bI()) {
            C58976aa aaVar = C58975e.f156826a;
            uVar = new C84293k();
        } else if (fVar.f258014b == C90536a.VOICE_ACTIONS || fVar.f258014b == C90536a.ANDROID_TV_SEARCH) {
            uVar = new C84335x();
        } else {
            uVar = new C98722e(new C98728k(lVar), lVar.f275780c);
        }
        return aVar.mo78730d(dVar, qVar, cVar, uVar, !C92473f.m152085a(fVar.f258014b), lVar.f275782e);
    }
}
