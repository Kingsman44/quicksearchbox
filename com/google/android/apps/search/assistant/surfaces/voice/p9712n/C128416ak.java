package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18438aa;
import com.google.android.libraries.assistant.p1533o.C18445ah;
import com.google.android.libraries.assistant.p1533o.C18449al;
import com.google.android.libraries.assistant.p1533o.C18465ba;
import com.google.android.libraries.assistant.p1533o.C18466bb;
import com.google.android.libraries.assistant.p1533o.C18483bs;
import com.google.android.libraries.assistant.p1533o.C18484bt;
import com.google.android.libraries.assistant.p1533o.C18487e;
import com.google.android.libraries.assistant.p1533o.C18502t;
import com.google.android.libraries.assistant.p1533o.C18503u;
import com.google.android.libraries.assistant.p1533o.C18508z;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34829c;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.ak */
/* compiled from: PG */
public final class C128416ak {

    /* renamed from: a */
    public static final C59071e f353175a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.n.ak");

    /* renamed from: b */
    public final C70862aj f353176b;

    /* renamed from: c */
    public final C128426a f353177c;

    /* renamed from: d */
    public final C18508z f353178d;

    /* renamed from: e */
    public C128415aj f353179e = C128415aj.WAITING_FOR_HTML_STREAM;

    public C128416ak(C70862aj ajVar, C128426a aVar) {
        C18508z zVar = (C18508z) C18438aa.f52334e.createBuilder();
        C18449al alVar = C18449al.f52359c;
        zVar.copyOnWrite();
        alVar.getClass();
        ((C18438aa) zVar.instance).f52337b = alVar;
        C18487e eVar = C18487e.f52425b;
        zVar.copyOnWrite();
        eVar.getClass();
        ((C18438aa) zVar.instance).f52338c = eVar;
        this.f353178d = zVar;
        this.f353176b = ajVar;
        this.f353177c = aVar;
    }

    /* renamed from: a */
    static Throwable m209548a(Status status, C18465ba baVar) {
        return new StatusException(status.withDescription(baVar.name()), C34829c.m63593b(C18466bb.f52404a, baVar));
    }

    /* renamed from: b */
    public final void mo108413b() {
        if (!this.f353179e.equals(C128415aj.COMPLETED)) {
            if (this.f353179e.equals(C128415aj.WAITING_FOR_HTML_STREAM)) {
                C18502t tVar = (C18502t) C18503u.f52450f.createBuilder();
                tVar.copyOnWrite();
                ((C18503u) tVar.instance).f52453b = 2;
                mo108415d((C18503u) tVar.build());
                C128426a aVar = this.f353177c;
                C37258g gVar = C37176a.f97095fA;
                C69664n.m101060f(gVar, "MAIN_ASSISTANT_SHOW_ASSISTANT");
                aVar.mo108429g(gVar);
            }
            this.f353176b.mo20121a();
            this.f353179e = C128415aj.COMPLETED;
        }
    }

    /* renamed from: c */
    public final void mo108414c(Throwable th) {
        if (!this.f353179e.equals(C128415aj.COMPLETED)) {
            ((C59052c) ((C59052c) ((C59052c) f353175a.mo56226d()).mo56382g(th)).mo56372aa(38848)).mo56386p("Notify error.");
            this.f353176b.mo20122b(th);
            this.f353179e = C128415aj.COMPLETED;
        }
    }

    /* renamed from: d */
    public final void mo108415d(C18503u uVar) {
        C70862aj ajVar = this.f353176b;
        C18483bs bsVar = (C18483bs) C18484bt.f52419c.createBuilder();
        bsVar.copyOnWrite();
        C18484bt btVar = (C18484bt) bsVar.instance;
        uVar.getClass();
        btVar.f52422b = uVar;
        btVar.f52421a = 1;
        ajVar.mo20123c((C18484bt) bsVar.build());
    }

    /* renamed from: e */
    public final void mo108416e() {
        C18502t tVar = (C18502t) C18503u.f52450f.createBuilder();
        C18508z zVar = this.f353178d;
        tVar.copyOnWrite();
        C18438aa aaVar = (C18438aa) zVar.build();
        aaVar.getClass();
        ((C18503u) tVar.instance).f52454c = aaVar;
        mo108415d((C18503u) tVar.build());
    }

    /* renamed from: f */
    public final void mo108417f() {
        if (this.f353179e.equals(C128415aj.WAITING_FOR_HTML_STREAM)) {
            C18502t tVar = (C18502t) C18503u.f52450f.createBuilder();
            tVar.copyOnWrite();
            ((C18503u) tVar.instance).f52453b = 1;
            mo108415d((C18503u) tVar.build());
            this.f353179e = C128415aj.HTML_STREAMING;
            C128426a aVar = this.f353177c;
            C37258g gVar = C37176a.f96824V;
            C69664n.m101060f(gVar, "MAIN_ASSISTANT_SEARCH_RESULT_STREAMING_FIRST_EVENT");
            aVar.mo108429g(gVar);
        }
    }

    /* renamed from: g */
    public final void mo108418g(String str) {
        C18508z zVar = this.f353178d;
        C18445ah ahVar = (C18445ah) C18449al.f52359c.createBuilder();
        ahVar.copyOnWrite();
        str.getClass();
        ((C18449al) ahVar.instance).f52361a = str;
        zVar.copyOnWrite();
        C18449al alVar = (C18449al) ahVar.build();
        C18438aa aaVar = C18438aa.f52334e;
        alVar.getClass();
        ((C18438aa) zVar.instance).f52337b = alVar;
        mo108416e();
    }
}
