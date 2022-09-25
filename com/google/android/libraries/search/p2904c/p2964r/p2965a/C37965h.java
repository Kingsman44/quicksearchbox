package com.google.android.libraries.search.p2904c.p2964r.p2965a;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37657hd;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58872ci;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.r.a.h */
/* compiled from: PG */
public final class C37965h implements C37966b {

    /* renamed from: a */
    public static final C58974d f100587a = C58974d.m91136j();

    /* renamed from: b */
    public final C68214a f100588b;

    /* renamed from: c */
    public final C58881cr f100589c;

    /* renamed from: d */
    private final Executor f100590d;

    /* renamed from: e */
    private final C58889cz f100591e;

    public C37965h(C68214a aVar, Executor executor, Context context, C58889cz czVar) {
        this.f100588b = aVar;
        this.f100590d = executor;
        this.f100591e = czVar;
        this.f100589c = C58886cw.m90973a(new C37958a(context));
    }

    /* renamed from: a */
    public final void mo41168a(C37384h hVar) {
        ((C19567d) ((C39141kp) this.f100588b.mo27525b()).f102847ae.mo6453a()).mo24822a(1, hVar.name());
    }

    /* renamed from: b */
    public final void mo41169b(C60870cx cxVar, C37467cp cpVar) {
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C37964g(this, C58872ci.m90947d(this.f100591e), cpVar)), this.f100590d);
    }

    /* renamed from: c */
    public final void mo41170c(int i) {
        ((C19569f) ((C39141kp) this.f100588b.mo27525b()).f102848af.mo6453a()).mo24824b((double) i, (String) this.f100589c.mo6453a(), Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: d */
    public final void mo41171d() {
        ((C19567d) ((C39141kp) this.f100588b.mo27525b()).f102849ag.mo6453a()).mo24822a(1, (String) this.f100589c.mo6453a(), Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: e */
    public final void mo41172e(C37659hf hfVar, C37773c cVar) {
        C60856cj.m92911t(hfVar.mo41060d(), C47810es.m84974n(new C37961d(this, cVar)), this.f100590d);
        C60856cj.m92911t(hfVar.mo41057a().mo41053a(), C47810es.m84974n(new C37962e(this, cVar)), this.f100590d);
    }

    /* renamed from: f */
    public final void mo41173f(C37773c cVar) {
        ((C19567d) ((C39141kp) this.f100588b.mo27525b()).f102855am.mo6453a()).mo24822a(1, C37772b.m66674a(cVar.f100245a).name());
    }

    /* renamed from: g */
    public final void mo41174g(C37402bg bgVar, C37773c cVar) {
        C60856cj.m92911t(bgVar.mo20357d(), C47810es.m84974n(new C37959b(this, cVar)), this.f100590d);
        C60856cj.m92911t(((C37401bf) bgVar.mo20358e()).mo20353a(), C47810es.m84974n(new C37960c(this, cVar)), this.f100590d);
    }

    /* renamed from: h */
    public final void mo41175h(C37773c cVar) {
        ((C19567d) ((C39141kp) this.f100588b.mo27525b()).f102858ap.mo6453a()).mo24822a(1, C37772b.m66674a(cVar.f100245a).name());
    }

    /* renamed from: i */
    public final void mo41176i(String str) {
        ((C19567d) ((C39141kp) this.f100588b.mo27525b()).f102859aq.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: j */
    public final void mo41177j(int i) {
        ((C19567d) ((C39141kp) this.f100588b.mo27525b()).f102860ar.mo6453a()).mo24822a(1, (String) this.f100589c.mo6453a(), Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i));
    }

    /* renamed from: k */
    public final void mo41178k(C37657hd hdVar, C37773c cVar) {
        C60856cj.m92911t(hdVar.mo41053a(), C47810es.m84974n(new C37963f(this, cVar)), this.f100590d);
    }

    /* renamed from: l */
    public final void mo41179l(C37773c cVar, String str) {
        if (cVar == null || C37772b.m66674a(cVar.f100245a) == C37772b.DETAILS_NOT_SET) {
            ((C19567d) ((C39141kp) this.f100588b.mo27525b()).f102854al.mo6453a()).mo24822a(1, str);
            ((C58970a) ((C58970a) f100587a.mo56226d()).mo56372aa(52877)).mo56389s("#audio# Please specify the correct client info for %s as it will lead to failure in the future.", str);
        }
    }
}
