package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

import com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a.C131829n;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9925d.p9926a.C130801d;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9925d.p9926a.C130802e;
import com.google.android.apps.search.assistant.verticals.ambient.p9963r.p9964a.C131254a;
import com.google.android.apps.search.assistant.verticals.ambient.p9963r.p9964a.C131255b;
import com.google.android.apps.search.assistant.verticals.ambient.p9963r.p9964a.C131256c;
import com.google.android.apps.search.assistant.verticals.ambient.p9963r.p9964a.C131257d;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46676n;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p4016z.C53691ap;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4528b.p4529a.C58994k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.aa */
/* compiled from: PG */
public final class C130620aa {

    /* renamed from: a */
    public final ExecutorService f357740a;

    /* renamed from: b */
    public final C131829n f357741b;

    /* renamed from: c */
    private final C47477n f357742c;

    /* renamed from: d */
    private final String f357743d;

    /* renamed from: e */
    private final Map f357744e;

    /* renamed from: f */
    private final C131257d f357745f;

    /* renamed from: g */
    private final C130802e f357746g;

    public C130620aa(C47477n nVar, C131257d dVar, C131829n nVar2, C130802e eVar, String str, Map map, ExecutorService executorService) {
        this.f357742c = nVar;
        this.f357745f = dVar;
        this.f357741b = nVar2;
        this.f357746g = eVar;
        this.f357743d = str;
        this.f357744e = map;
        this.f357740a = executorService;
    }

    /* renamed from: a */
    public static C46669g m213006a(C63088z zVar) {
        C46663a aVar = new C46663a();
        aVar.mo50684b(true);
        aVar.mo50686d(C46667e.TEXT);
        aVar.f121916a = zVar;
        return aVar.mo50683a();
    }

    /* renamed from: c */
    private static C46669g m213007c(C63088z zVar) {
        C46663a aVar = new C46663a();
        aVar.mo50684b(false);
        aVar.mo50686d(C46667e.TEXT);
        aVar.f121916a = zVar;
        return aVar.mo50683a();
    }

    /* renamed from: b */
    public final void mo109765b(String str, Map map, Optional optional, boolean z, boolean z2) {
        C47474k g = C47475l.m84477g();
        C47465c cVar = (C47465c) g;
        cVar.f123249a = "com.google.android.googlequicksearchbox.AA_FEEDBACK_CATEGORY";
        g.mo51310d(z2);
        cVar.f123250b = C58833ax.m90834k(str);
        g.mo51333f("Smartspace feedback", m213007c(C63088z.m96143E(Boolean.toString(true))));
        if (!C58837ba.m90859h(this.f357743d)) {
            g.mo51333f("Smartspace population", m213007c(C63088z.m96143E(this.f357743d)));
        }
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            g.mo51333f("Smartspace ".concat(String.valueOf((String) entry.getKey())), m213007c(C63088z.m96143E((String) entry.getValue())));
        }
        C130644x xVar = C130644x.f357785a;
        g.mo51308b().mo55429h("Smartspace TNG logs", C60922j.m93044g((C60870cx) Optional.ofNullable((C58994k) this.f357744e.get("AATngFileLoggerReader")).map(C130643w.f357784a).orElse(C60856cj.m92900i("Ambient TNG logs are absent.".getBytes(StandardCharsets.UTF_8))), C47810es.m84963c(xVar), this.f357740a));
        C130646z zVar = C130646z.f357788a;
        g.mo51308b().mo55429h("Smartspace logs", C60922j.m93044g((C60870cx) Optional.ofNullable((C58994k) this.f357744e.get("AAClassicFileLoggerReader")).map(C130643w.f357784a).orElse(C60856cj.m92900i("Ambient classic logs are absent.".getBytes(StandardCharsets.UTF_8))), C47810es.m84963c(zVar), this.f357740a));
        C131257d dVar = this.f357745f;
        C46676n e = C46677o.m83168e();
        e.mo50694b(C58485gu.m89848p(C46667e.KEY_VALUE, C46667e.BINARY, C46667e.TEXT));
        e.mo50695c(true);
        for (Map.Entry entry2 : ((C58495hd) Collection.EL.stream(((Map) dVar.f358907a.mo17428b()).entrySet()).collect(C58370cn.m89403c(C131254a.f358904a, new C131255b(e.mo50693a()), C131256c.f358906a))).entrySet()) {
            g.mo51308b().mo55429h((String) entry2.getKey(), (C60870cx) entry2.getValue());
        }
        optional.ifPresent(new C130645y(this, g));
        if (z) {
            C130802e eVar = this.f357746g;
            C60870cx a = eVar.f358044a.mo109798a();
            C60870cx c = eVar.f358046c.mo109801c();
            C60870cx a2 = eVar.f358045b.mo109805a(C53691ap.STORE);
            C60870cx b = C47638k.m84751b(a, c, a2).mo51521b(new C130801d(a, c, a2), eVar.f358047d);
            C130641u uVar = C130641u.f357782a;
            g.mo51308b().mo55429h("Smartspace encrypted personalization data", C60922j.m93044g(b, C47810es.m84963c(uVar), this.f357740a));
        }
        this.f357742c.mo51336a(g.mo51332e());
    }
}
