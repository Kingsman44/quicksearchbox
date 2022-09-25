package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1837a.C22315af;
import com.google.android.libraries.gsa.conversation.p1837a.C22329j;
import com.google.android.libraries.gsa.conversation.p1837a.C22333n;
import com.google.android.libraries.gsa.conversation.p1837a.C22334o;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.conversation.p1855h.C22692ae;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5205f.p5206a.C66502c;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5224k.p5225a.C67215bf;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.r */
/* compiled from: PG */
public final class C22452r extends C22538o {

    /* renamed from: a */
    public final C22720x f62006a;

    /* renamed from: b */
    private final C22329j f62007b;

    /* renamed from: c */
    private final C22315af f62008c;

    /* renamed from: d */
    private final ScheduledExecutorService f62009d;

    /* renamed from: e */
    private final C22692ae f62010e;

    public C22452r(C22329j jVar, C22720x xVar, C22315af afVar, ScheduledExecutorService scheduledExecutorService, C22692ae aeVar) {
        this.f62007b = jVar;
        this.f62006a = xVar;
        this.f62008c = afVar;
        this.f62009d = scheduledExecutorService;
        this.f62010e = aeVar;
    }

    /* renamed from: b */
    private final C60870cx m41896b(C22334o oVar, boolean z) {
        SettableFuture settableFuture = new SettableFuture();
        this.f62007b.mo27560b(oVar, new C22451q(this.f62006a, settableFuture, z));
        return settableFuture;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C60870cx cxVar;
        String str = dyVar.f135936b;
        if ("tts.OUTPUT".equals(str)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            aos aos = (aos) m41992m(dwVar, "speech_output_args", aos.f135519e.getParserForType());
            if ((aos.f135521a & 2) != 0) {
                C52230ka kaVar = aos.f135523c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("speech.s3.TtsServiceRequest".equals(kaVar.f137060b)) {
                    try {
                        C62921ba baVar = new C62921ba();
                        if (this.f62010e.mo27805f()) {
                            baVar.mo58832e(C66502c.f180870a);
                            baVar.mo58832e(C67215bf.f182681c);
                        }
                        cxVar = m41896b(this.f62008c.mo27550b((C67190ah) C62942bv.parseFrom((C62942bv) C67190ah.f182619q, kaVar.f137061c, baVar), ((C22407c) eVar).f61902d.mo56113h() ? (C84349ah) ((C22585l) ((C22407c) eVar).f61902d.mo56107c()).f62228b.mo56111f() : null, this.f62010e.mo27805f()), aos.f135524d);
                    } catch (C62974ct unused) {
                        cxVar = C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Cannot parse TtsServiceRequest data"));
                    }
                } else {
                    cxVar = C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "SpeechOutpurArgs has StructuredTts, but it's not TtsServiceRequest"));
                }
            } else {
                C22407c cVar = (C22407c) eVar;
                cxVar = cVar.f61902d.mo56113h() ? m41896b(this.f62008c.mo27565a(C60856cj.m92908q(((C22585l) cVar.f61902d.mo56107c()).f62230d, 10, TimeUnit.SECONDS, this.f62009d), (C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56111f()), aos.f135524d) : C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "No TTS data"));
            }
            cxVar.mo4106b(new C22450p(this), C60826bg.f164896a);
            return cxVar;
        } else if ("tts.STOP".equals(str)) {
            C22329j jVar = this.f62007b;
            C58976aa aaVar = C58975e.f156826a;
            jVar.mo27561c(C22333n.OUTPUT);
            return C60856cj.m92900i(C22402a.f61894b);
        } else {
            throw new C22428d(dyVar);
        }
    }
}
