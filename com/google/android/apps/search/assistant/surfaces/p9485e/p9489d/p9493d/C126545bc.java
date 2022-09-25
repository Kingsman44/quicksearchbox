package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17467ac;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.io.Closeable;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5472e.C69598b;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.response.TTSHandler$handleByApaTtsApi$2", mo61344c = "TTSHandler.kt", mo61345d = "invokeSuspend", mo61346e = {66, 86})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.d.bc */
/* compiled from: PG */
final class C126545bc extends C69572j implements C69630p {

    /* renamed from: a */
    Object f348497a;

    /* renamed from: b */
    Object f348498b;

    /* renamed from: c */
    int f348499c;

    /* renamed from: d */
    final /* synthetic */ C71587n f348500d;

    /* renamed from: e */
    final /* synthetic */ C126436e f348501e;

    /* renamed from: f */
    final /* synthetic */ C126557bo f348502f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126545bc(C71587n nVar, C126436e eVar, C126557bo boVar, C69577g gVar) {
        super(2, gVar);
        this.f348500d = nVar;
        this.f348501e = eVar;
        this.f348502f = boVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126545bc) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Throwable th;
        C17360b bVar;
        C69648ae aeVar;
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f348499c;
        if (i == 0) {
            C69714l.m101134b(obj);
            aeVar = new C69648ae();
            C57987f fVar = new C57987f();
            obj3 = fVar;
            C71587n a = C71498bb.m104325a(new C126544bb(new C126540ay(this.f348500d)), new C126536au((C69577g) null));
            C126537av avVar = new C126537av(aeVar, this.f348501e, this.f348502f, fVar);
            this.f348497a = aeVar;
            this.f348498b = fVar;
            this.f348499c = 1;
            obj2 = fVar;
            if (a.mo38165mp(avVar, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            bVar = (Closeable) this.f348497a;
            try {
                C69714l.m101134b(obj);
                C17467ac acVar = (C17467ac) obj;
                C69598b.m101013a(bVar, (Throwable) null);
                return acVar;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Object obj4 = this.f348498b;
            aeVar = (C69648ae) this.f348497a;
            try {
                obj3 = obj4;
                C69714l.m101134b(obj);
                obj3 = obj4;
                obj2 = obj4;
            } catch (Throwable th3) {
                ((C57987f) obj3).f155056f.mo54590g(th3);
            }
        }
        ((C57987f) obj2).f155056f.mo54589f(true);
        C17360b bVar2 = (C17360b) aeVar.f186027a;
        if (bVar2 == null) {
            return null;
        }
        C126436e eVar = this.f348501e;
        try {
            bVar2.mo23303b();
            eVar.mo107612d();
            C60870cx a2 = bVar2.mo23302a().mo23275a();
            C69664n.m101060f(a2, "it.sessionStatus.playbackEndStatus");
            this.f348497a = bVar2;
            this.f348498b = null;
            this.f348499c = 2;
            Object c = C71663i.m104690c(a2, this);
            if (c == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj = c;
            C17467ac acVar2 = (C17467ac) obj;
            C69598b.m101013a(bVar, (Throwable) null);
            return acVar2;
        } catch (Throwable th4) {
            Throwable th5 = th4;
            bVar = bVar2;
            th = th5;
            try {
                throw th;
            } catch (Throwable th6) {
                C69598b.m101013a(bVar, th);
                throw th6;
            }
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126545bc(this.f348500d, this.f348501e, this.f348502f, gVar);
    }
}
