package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.assistant.shared.C73848bu;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82498hk;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cf */
/* compiled from: PG */
public final class C113851cf {

    /* renamed from: a */
    public static final C59071e f315257a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.cf");

    /* renamed from: b */
    public static final long f315258b = Duration.ofHours(6).toMillis();

    /* renamed from: c */
    public final C113850ce f315259c = new C113850ce();

    /* renamed from: d */
    public final C21370a f315260d;

    /* renamed from: e */
    private final C73848bu f315261e;

    /* renamed from: f */
    private final C22871g f315262f;

    /* renamed from: g */
    private final C86124t f315263g;

    /* renamed from: h */
    private final C83305i f315264h;

    /* renamed from: i */
    private final C68214a f315265i;

    public C113851cf(C21370a aVar, C73848bu buVar, C22871g gVar, C86124t tVar, C83305i iVar, C68214a aVar2) {
        this.f315260d = aVar;
        this.f315261e = buVar;
        this.f315262f = gVar;
        this.f315263g = tVar;
        this.f315264h = iVar;
        this.f315265i = aVar2;
    }

    /* renamed from: b */
    private final void m188458b(C89849ae aeVar, long j) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("assistSessionId", Long.toString(j));
        ((C89859i) this.f315265i.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: c */
    private final void m188459c(long j, String str) {
        this.f315264h.mo75579d(new C82498hk("SPEEDBUMP_LATENCY", Double.valueOf((double) j), str));
    }

    /* renamed from: a */
    public final boolean mo100698a(e eVar, long j) {
        if (!this.f315263g.mo79749o(C90037cp.f248598dp).contains(Integer.valueOf(eVar.ca)) || !this.f315263g.mo79746e(C90040cs.f248684w)) {
            return false;
        }
        if (this.f315260d.mo26871c() - this.f315259c.mo100695a() >= f315258b || this.f315263g.mo79746e(C90037cp.f248409Q)) {
            long c = this.f315260d.mo26871c();
            C73848bu buVar = this.f315261e;
            C60870cx a = buVar.mo65334a(buVar.f195151a);
            try {
                if (((Boolean) a.get(20, TimeUnit.MILLISECONDS)).booleanValue()) {
                    m188459c(this.f315260d.mo26871c() - c, "SUCCESS");
                    if (this.f315263g.mo79746e(C90040cs.f248685x)) {
                        m188458b(C89849ae.OPA_ANDROID_STARTUP_MIC_SPEEDBUMP, j);
                        this.f315259c.mo100696b(true, this.f315260d.mo26871c());
                        return true;
                    }
                    m188458b(C89849ae.OPA_ANDROID_STARTUP_MIC_SPEEDBUMP_COUNTERFACTUAL, j);
                    this.f315259c.mo100696b(false, this.f315260d.mo26871c());
                    return false;
                }
                this.f315259c.mo100696b(false, this.f315260d.mo26871c());
                return false;
            } catch (InterruptedException | ExecutionException e) {
                m188459c(this.f315260d.mo26871c() - c, "FAILURE");
                C59104x d = f315257a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OpaSpeedBumpHelper");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(28445)).mo56386p("Speedbump status fetch failed.");
                C73848bu buVar2 = this.f315261e;
                this.f315262f.mo28209i(buVar2.mo65334a(buVar2.f195151a), "[OPA] setShouldEnableSpeedBump", new C113847cb(this));
                return false;
            } catch (TimeoutException e2) {
                m188459c(this.f315260d.mo26871c() - c, "FAILURE");
                C59104x d2 = f315257a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "OpaSpeedBumpHelper");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(28446)).mo56386p("Speedbump status fetch failed.");
                new C90873ag(a, this.f315262f, "[OPA] setShouldEnableSpeedBump", new C113848cc(this)).mo85223a(C113849cd.f315254a);
                return false;
            }
        } else {
            if (this.f315259c.mo100697c()) {
                m188458b(C89849ae.OPA_ANDROID_STARTUP_MIC_SPEEDBUMP, j);
            } else {
                m188458b(C89849ae.OPA_ANDROID_STARTUP_MIC_SPEEDBUMP_COUNTERFACTUAL, j);
            }
            m188459c(0, "CACHE_USED");
            return this.f315259c.mo100697c();
        }
    }
}
