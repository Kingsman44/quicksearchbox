package com.google.android.apps.search.transcription.voiceime;

import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.android.apps.search.transcription.p10670f.C141806ay;
import com.google.android.apps.search.transcription.p10670f.C141848bp;
import com.google.android.apps.search.transcription.p10670f.C141921o;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.apps.search.transcription.voiceime.af */
/* compiled from: PG */
final class C141967af implements C141848bp {

    /* renamed from: a */
    final /* synthetic */ long f385227a;

    /* renamed from: b */
    final /* synthetic */ C141848bp f385228b;

    /* renamed from: c */
    final /* synthetic */ C141972ak f385229c;

    public C141967af(C141972ak akVar, long j, C141848bp bpVar) {
        this.f385229c = akVar;
        this.f385227a = j;
        this.f385228b = bpVar;
    }

    /* renamed from: a */
    public final void mo116727a() {
    }

    /* renamed from: b */
    public final void mo116728b(C141760s sVar) {
        ((C59052c) ((C59052c) ((C59052c) C141972ak.f385237b.mo56226d()).mo56382g(sVar)).mo56372aa(41974)).mo56386p("#onError");
        C142040t tVar = this.f385229c.f385240e;
        long j = this.f385227a;
        C142021r rVar = (C142021r) tVar.f385388d.get(Long.valueOf(j));
        if (rVar != null) {
            C37215b bVar = tVar.f385385a;
            C37252a j2 = C37206a.f98802y.mo40816j("inputViewSessionId", rVar.f385341a);
            ((C37253b) j2).mo40795s("recognitionSessionId", Long.toString(j));
            j2.mo40780d(sVar.f384731a.mo116703a(), sVar.f384731a.mo116704c());
            bVar.mo19974a(j2);
            if (rVar.mo116973a().mo116974a()) {
                tVar.f385385a.mo19974a(C37206a.f98800w.mo40808f("inputViewSessionId", rVar.f385341a).mo40781e(C62722b.OK));
            }
        }
        this.f385229c.mo116933c(this.f385227a, new C141966ae(sVar));
        this.f385228b.mo116728b(sVar);
    }

    /* renamed from: c */
    public final void mo116729c(C141760s sVar) {
        C142040t tVar = this.f385229c.f385240e;
        long j = this.f385227a;
        C142021r rVar = (C142021r) tVar.f385388d.get(Long.valueOf(j));
        if (rVar != null) {
            C37215b bVar = tVar.f385385a;
            C37252a j2 = C37206a.f98803z.mo40816j("inputViewSessionId", rVar.f385341a);
            ((C37253b) j2).mo40795s("recognitionSessionId", Long.toString(j));
            j2.mo40780d(sVar.f384731a.mo116703a(), sVar.f384731a.mo116704c());
            bVar.mo19974a(j2);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo116730d() {
    }

    /* renamed from: e */
    public final void mo116731e(C141806ay ayVar) {
        this.f385228b.mo116731e(ayVar);
    }

    /* renamed from: f */
    public final void mo116732f() {
        C142040t tVar = this.f385229c.f385240e;
        long j = this.f385227a;
        C142021r rVar = (C142021r) tVar.f385388d.get(Long.valueOf(j));
        if (rVar != null) {
            C37215b bVar = tVar.f385385a;
            C37252a j2 = C37206a.f98802y.mo40816j("inputViewSessionId", rVar.f385341a);
            ((C37253b) j2).mo40795s("recognitionSessionId", Long.toString(j));
            j2.mo40781e(C62722b.OK);
            bVar.mo19974a(j2);
            if (rVar.mo116973a().mo116974a()) {
                tVar.f385385a.mo19974a(C37206a.f98800w.mo40808f("inputViewSessionId", rVar.f385341a).mo40781e(C62722b.OK));
            }
        }
    }

    /* renamed from: g */
    public final void mo116733g(C141921o oVar) {
        this.f385228b.mo116733g(oVar);
    }

    /* renamed from: h */
    public final void mo116734h(C67087ko koVar) {
    }

    /* renamed from: i */
    public final void mo116735i() {
        this.f385229c.mo116933c(this.f385227a, C141965ad.f385225a);
    }
}
