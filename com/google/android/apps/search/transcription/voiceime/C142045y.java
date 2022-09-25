package com.google.android.apps.search.transcription.voiceime;

import com.google.android.apps.search.transcription.C141741b;
import com.google.android.apps.search.transcription.p10670f.C141768a;
import com.google.android.apps.search.transcription.p10670f.C141803av;
import com.google.android.apps.search.transcription.p10670f.C141808b;
import com.google.android.apps.search.transcription.p10670f.C141850br;
import com.google.android.apps.search.transcription.p10670f.C141851bs;
import com.google.android.apps.search.transcription.p10670f.C141915i;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141832x;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10976c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.aqg;
import com.google.common.p4552o.aqh;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62940bt;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.transcription.voiceime.y */
/* compiled from: PG */
final class C142045y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C141741b f385393a;

    /* renamed from: b */
    final /* synthetic */ String f385394b;

    /* renamed from: c */
    final /* synthetic */ List f385395c;

    /* renamed from: d */
    final /* synthetic */ C141972ak f385396d;

    /* renamed from: e */
    final /* synthetic */ C141986ax f385397e;

    public C142045y(C141972ak akVar, C141986ax axVar, C141741b bVar, String str, List list) {
        this.f385396d = akVar;
        this.f385397e = axVar;
        this.f385393a = bVar;
        this.f385394b = str;
        this.f385395c = list;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141972ak.f385237b.mo56225c()).mo56382g(th)).mo56372aa(41973)).mo56386p("Failed to get settings");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C10976c cVar = (C10976c) obj;
        C141972ak akVar = this.f385396d;
        C141986ax axVar = this.f385397e;
        C141741b bVar = this.f385393a;
        String str2 = this.f385394b;
        List list = this.f385395c;
        long j = bVar.f384722b;
        if (!cVar.f36111c.isEmpty()) {
            str = cVar.f36111c;
        } else if (!list.isEmpty()) {
            str = ((Locale) list.get(0)).toLanguageTag();
        } else {
            str = Locale.getDefault().toLanguageTag();
        }
        C142040t tVar = akVar.f385240e;
        C142021r rVar = (C142021r) tVar.f385387c.get();
        if (rVar != null && !((C142022s) DesugarAtomicReference.updateAndGet(rVar.f385342b, C142020q.f385340a)).mo116974a()) {
            tVar.f385388d.put(Long.valueOf(j), rVar);
            C37215b bVar2 = tVar.f385385a;
            C37252a j2 = C37206a.f98801x.mo40816j("inputViewSessionId", rVar.f385341a);
            C37253b bVar3 = (C37253b) j2;
            bVar3.mo40795s("recognitionSessionId", Long.toString(j));
            C62940bt btVar = aqh.f159745g;
            aqg aqg = (aqg) aqh.f159744f.createBuilder();
            aqg.copyOnWrite();
            aqh aqh = (aqh) aqg.instance;
            str.getClass();
            aqh.f159747a |= 8;
            aqh.f159751e = str;
            bVar3.mo40792p(btVar, (aqh) aqg.build());
            bVar2.mo19974a(j2);
        }
        C141992bc bcVar = new C141992bc(axVar.f385274a, bVar);
        C141850br y = C141851bs.m230219y();
        y.mo116808m(str);
        y.mo116798c(C58485gu.m89842j(cVar.f36112d));
        y.mo116809n(1);
        C141915i iVar = (C141915i) y;
        iVar.f385049b = str2;
        iVar.f385053f = 4;
        y.mo116806k(true);
        y.mo116811p(true);
        y.mo116817v(5000);
        y.mo116815t(cVar.f36110b);
        C141768a b = C141808b.m230094b();
        b.mo116715b(C39226b.TAG_TRANSCRIPTION_VOICE_IME);
        y.mo116799d(Optional.m71637of(b.mo116714a()));
        y.mo116813r(true);
        C141803av a = akVar.f385238c.mo116758a(y.mo116818w(), new C141964ac(akVar, j), new C141967af(akVar, j, bcVar));
        akVar.f385246k.put(Long.valueOf(bVar.f384722b), new C141971aj(C141832x.m230155k().mo116762a(), a));
        C60856cj.m92911t(akVar.f385243h.mo46042d(), C47810es.m84974n(new C141970ai(akVar, j)), akVar.f385242g);
        a.mo116755b();
    }
}
