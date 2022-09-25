package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.opa.C83583an;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.b */
/* compiled from: PG */
public final /* synthetic */ class C100598b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C86124t f281280a;

    /* renamed from: b */
    public final /* synthetic */ Query f281281b;

    /* renamed from: c */
    public final /* synthetic */ C89061q f281282c;

    /* renamed from: d */
    public final /* synthetic */ C22871g f281283d;

    /* renamed from: e */
    public final /* synthetic */ String f281284e;

    /* renamed from: f */
    public final /* synthetic */ C68214a f281285f;

    /* renamed from: g */
    public final /* synthetic */ b f281286g;

    public /* synthetic */ C100598b(C86124t tVar, Query query, C89061q qVar, C22871g gVar, String str, C68214a aVar, b bVar) {
        this.f281280a = tVar;
        this.f281281b = query;
        this.f281282c = qVar;
        this.f281283d = gVar;
        this.f281284e = str;
        this.f281285f = aVar;
        this.f281286g = bVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i;
        C86124t tVar = this.f281280a;
        Query query = this.f281281b;
        C89061q qVar = this.f281282c;
        C22871g gVar = this.f281283d;
        String str = this.f281284e;
        C68214a aVar = this.f281285f;
        b bVar = this.f281286g;
        if (!C83583an.m133149d(tVar, (C89062r) obj)) {
            return C100607d.m166733c(qVar, gVar, tVar, str, true, query, aVar, bVar);
        }
        if (tVar.mo79746e(C90014bt.f247239dR)) {
            i = 11;
        } else {
            i = C100607d.m166731a(query, tVar);
        }
        ((C59052c) ((C59052c) C100607d.f281319a.mo56224b()).mo56372aa(33667)).mo56387q("Use SpeechieMode %d for on-device ASR and online fulfillment experiment", i);
        return C60856cj.m92900i(Integer.valueOf(i));
    }
}
