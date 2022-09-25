package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.binaries.satin.app.C74278sj;
import com.google.android.apps.gsa.binaries.satin.app.aoj;
import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.gsa.nga.api.a.m;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125470af;
import com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125476al;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125932u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125933v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126340q;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126345v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9482t.C126353d;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.cl */
/* compiled from: PG */
public final /* synthetic */ class C126252cl implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125065at f347876a;

    public /* synthetic */ C126252cl(C125065at atVar) {
        this.f347876a = atVar;
    }

    public final C60870cx apply(Object obj) {
        Throwable th;
        C60870cx cxVar;
        m a;
        C125065at atVar = this.f347876a;
        C126223bj bjVar = (C126223bj) obj;
        C47558bi a2 = C47831fm.m85006a("SD.OrationQueue.ProcessTranscription");
        try {
            if (bjVar.f347816p) {
                cxVar = C60866ct.f164955a;
            } else {
                if (bjVar.f347815o == null) {
                    C74278sj sjVar = bjVar.f347820t;
                    Locale locale = bjVar.f347807g;
                    bj bjVar2 = bjVar.f347804d;
                    C126181j jVar = bjVar.f347806f;
                    C126259cs csVar = bjVar.f347808h;
                    C69664n.m101061g(bjVar2, "orationContext");
                    af afVar = bjVar2.a;
                    if (afVar == null) {
                        afVar = af.w;
                    }
                    int i = afVar.d;
                    aoj aoj = csVar.f347903a;
                    C125934w wVar = C125934w.f347146a;
                    af afVar2 = bjVar2.a;
                    if (afVar2 == null) {
                        afVar2 = af.w;
                    }
                    C69664n.m101060f(afVar2, "orationContext.keyboardConfiguration");
                    boolean j = aoj.mo66633a(C125933v.m205976b(afVar2)).mo107191j();
                    m a3 = m.a(bjVar2.b);
                    if (a3 == null) {
                        a3 = m.h;
                    }
                    if (a3 == m.b) {
                        a = m.b;
                    } else {
                        if (j) {
                            if (C125932u.m205974f(i)) {
                                a = m.e;
                            } else if (C125932u.m205973e(i)) {
                                a = m.g;
                            }
                        }
                        a = m.a(bjVar2.b);
                        if (a == null) {
                            a = m.h;
                        }
                        C69664n.m101060f(a, "{\n      orationContext.desiredFormattingType\n    }");
                    }
                    C125470af afVar3 = r5;
                    C125470af afVar4 = new C125470af(locale, bjVar2, jVar, a, sjVar.f207992a.a.d.mo67852eT(), ((C46897i) sjVar.f207992a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45356986").mo50907f(), ((C46897i) sjVar.f207992a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45363399").mo50907f(), (C125476al) sjVar.f207992a.b.f198027a.f199629id.mo17428b(), (C126353d) sjVar.f207992a.b.f198027a.f199630ie.mo17428b(), (Executor) sjVar.f207992a.a.n.mo17428b());
                    bjVar.f347815o = afVar3;
                }
                if (Collection.EL.stream(atVar.f345042a).allMatch(C126340q.f348029a)) {
                    bjVar.f347814n.set(C126220bg.PROCESSING_FINAL);
                    String c = C126345v.m206601c(atVar);
                    cxVar = C47633f.m84733g(bjVar.f347812l.mo107101a(c, bjVar.mo107465a(), true)).mo51516i(new C126215bb(bjVar, c, C126223bj.m206415b(atVar)), bjVar.f347811k).mo51515h(new C126216bc(bjVar), bjVar.f347811k).mo51515h(new C126212az(bjVar), bjVar.f347811k);
                } else {
                    String c2 = C126345v.m206601c(atVar);
                    C58485gu b = C126223bj.m206415b(atVar);
                    bjVar.f347814n.set(C126220bg.PROCESSING_PARTIAL);
                    cxVar = C47633f.m84733g(bjVar.f347812l.mo107101a(c2, bjVar.mo107465a(), false)).mo51516i(new C126210ax(bjVar, c2, b), bjVar.f347811k).mo51515h(new C126212az(bjVar), bjVar.f347811k);
                }
            }
            a2.mo51417a(cxVar);
            a2.close();
            return cxVar;
        } catch (Throwable th2) {
            C126251ck.m206437a(th, th2);
        }
        throw th;
    }
}
