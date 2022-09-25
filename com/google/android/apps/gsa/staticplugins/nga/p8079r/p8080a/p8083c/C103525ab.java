package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80496d;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90508a;
import com.google.android.apps.gsa.shared.speech.C90576g;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.speech.p7141c.C90534b;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92449f;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92451h;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5224k.p5225a.C67239q;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.p5224k.p5225a.C67244v;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C103525ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C90021c f288440a;

    /* renamed from: b */
    public final /* synthetic */ Query f288441b;

    /* renamed from: c */
    public final /* synthetic */ C89994f f288442c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f288443d;

    public /* synthetic */ C103525ab(C90021c cVar, Query query, C89994f fVar, C58833ax axVar) {
        this.f288440a = cVar;
        this.f288441b = query;
        this.f288442c = fVar;
        this.f288443d = axVar;
    }

    public final Object apply(Object obj) {
        C90021c cVar = this.f288440a;
        Query query = this.f288441b;
        C89994f fVar = this.f288442c;
        C58833ax axVar = this.f288443d;
        C103560v vVar = (C103560v) obj;
        C92449f fVar2 = r6;
        C92449f fVar3 = new C92449f(C66422b.f180605k, true, true, cVar.mo79746e(C90082eg.f249935ay), query.mo84386cS(), fVar.mo83876aM(), (String) null, vVar.f288522a.mo87204p(), false, (int) cVar.mo79743a(C90082eg.f250018cb));
        fVar2.f257854c = !vVar.f288522a.mo87204p().equals(C67242t.NO_PREAMBLE);
        if (axVar.mo56113h() && ((C80496d) axVar.mo56107c()).f220973d != null) {
            C90534b bVar = ((C80496d) axVar.mo56107c()).f220973d;
            if (bVar == null) {
                bVar = C90534b.f253087r;
            }
            C90576g q = HotwordResultMetadata.m147623q();
            q.mo84634e(bVar.f253091c);
            q.mo84635f(bVar.f253092d);
            q.mo84632c(bVar.f253090b);
            q.mo84643n(bVar.f253093e);
            q.mo84644o(bVar.f253096h);
            q.mo84673p(bVar.f253097i);
            q.mo84642m(bVar.f253094f);
            q.mo84633d(bVar.f253095g);
            q.mo84639j(bVar.f253101m);
            q.mo84641l(bVar.f253100l);
            q.mo84636g(bVar.f253102n);
            q.mo84638i(bVar.f253103o);
            q.mo84637h(bVar.f253104p);
            q.mo84640k(bVar.f253105q);
            if ((bVar.f253089a & 256) != 0) {
                ((C90508a) q).f253063a = C58833ax.m90834k(bVar.f253098j);
            }
            if ((bVar.f253089a & 512) != 0) {
                ((C90508a) q).f253064b = C58833ax.m90834k(bVar.f253099k);
            }
            C92451h.m151927a(fVar2, q.mo84630a());
        }
        C67239q qVar = (C67239q) fVar2.mo87150b().toBuilder();
        qVar.copyOnWrite();
        C67244v vVar2 = (C67244v) qVar.instance;
        vVar2.f182774a |= 64;
        vVar2.f182781h = true;
        return (C67244v) qVar.build();
    }
}
