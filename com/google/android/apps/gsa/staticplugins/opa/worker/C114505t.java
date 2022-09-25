package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.conversation.p1852f.C22574a;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.t */
/* compiled from: PG */
public final /* synthetic */ class C114505t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114507v f317483a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f317484b;

    /* renamed from: c */
    public final /* synthetic */ C86251f f317485c;

    /* renamed from: d */
    public final /* synthetic */ Query f317486d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f317487e;

    public /* synthetic */ C114505t(C114507v vVar, C58833ax axVar, C86251f fVar, Query query, C60870cx cxVar) {
        this.f317483a = vVar;
        this.f317484b = axVar;
        this.f317485c = fVar;
        this.f317486d = query;
        this.f317487e = cxVar;
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C114507v vVar = this.f317483a;
        C58833ax axVar = this.f317484b;
        C86251f fVar = this.f317485c;
        Query query = this.f317486d;
        C60870cx cxVar2 = this.f317487e;
        C84370p pVar = (C84370p) obj;
        C58833ax axVar2 = C58836b.f156633a;
        C58847bk bkVar = (C58847bk) axVar;
        C51195j jVar = (C51195j) bkVar.f156646a;
        if ((jVar.f133266a & 16) != 0) {
            String str = jVar.f133271f;
            C22574a aVar = new C22574a();
            aVar.mo27666b(str);
            axVar2 = C58833ax.m90834k(aVar.mo27665a());
        }
        C58833ax axVar3 = axVar2;
        C51195j jVar2 = (C51195j) bkVar.f156646a;
        if ((jVar2.f133266a & 128) != 0) {
            C52081en enVar = jVar2.f133275j;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            cxVar = C60856cj.m92900i(C58833ax.m90834k(enVar));
        } else {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        }
        pVar.mo77923e(cxVar, vVar.f317523i.mo78369a(fVar.f233151j), C58833ax.m90834k(new C84349ah(query)), axVar3, C60922j.m93044g(cxVar2, C114365k.f317100a, C60826bg.f164896a), C60856cj.m92900i(fVar.mo79945a()));
        return C118826c.f331422a;
    }
}
