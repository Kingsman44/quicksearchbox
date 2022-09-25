package com.google.android.apps.gsa.staticplugins.nga.p8061f.p8062a;

import android.os.Build;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.C74729i;
import com.google.android.apps.gsa.nga.api.ForegroundSignalType;
import com.google.android.apps.gsa.nga.api.h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82350by;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82353ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82580kl;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82581km;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82582kn;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82583ko;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.f.a.e */
/* compiled from: PG */
public final class C103193e implements C74729i {

    /* renamed from: a */
    public final C103335ap f287940a;

    /* renamed from: b */
    public final C83305i f287941b;

    /* renamed from: c */
    private final C22871g f287942c;

    /* renamed from: d */
    private final C22871g f287943d;

    /* renamed from: e */
    private final C68214a f287944e;

    public C103193e(C103335ap apVar, C68214a aVar, C22871g gVar, C22871g gVar2, C83305i iVar) {
        this.f287942c = gVar;
        this.f287943d = gVar2;
        this.f287940a = apVar;
        this.f287944e = aVar;
        this.f287941b = iVar;
    }

    /* renamed from: d */
    public static C82580kl m171083d() {
        C82580kl i = C82581km.m131600i();
        C82350by byVar = (C82350by) i;
        byVar.f224963d = "ForegroundActivityAgent";
        i.mo75819b(Build.VERSION.SDK_INT);
        byVar.f224961b = "NA";
        return i;
    }

    /* renamed from: e */
    public static C82582kn m171084e() {
        C82582kn g = C82583ko.m131611g();
        ((C82353ca) g).f224975c = "ForegroundActivityAgent";
        return g;
    }

    /* renamed from: g */
    private final C60870cx m171085g(ForegroundSignalType foregroundSignalType) {
        if (((C74720bx) this.f287944e.mo27525b()).mo71089f().a()) {
            return C90877ak.m148471e(C2169h.m6027a(new C103190b(this, foregroundSignalType)), 5, TimeUnit.SECONDS, this.f287943d);
        }
        mo93701f(foregroundSignalType, "Nga is not active.");
        return C60856cj.m92899h(new h("nga is not active"));
    }

    /* renamed from: h */
    private final C60870cx m171086h(ForegroundSignalType foregroundSignalType) {
        C22871g gVar = this.f287942c;
        C60870cx g = m171085g(foregroundSignalType);
        String name = foregroundSignalType.name();
        return gVar.mo28209i(g, "[NGA] ForegroundActivityAgentImpl.getStringSignals on ".concat(String.valueOf(name)), new C103191c(foregroundSignalType));
    }

    /* renamed from: a */
    public final C60870cx mo71111a() {
        return this.f287943d.mo28209i(m171085g(ForegroundSignalType.d), "[NGA] ForegroundActivityAgentImpl.getFullAssistDataFuture", C103189a.f287933a);
    }

    /* renamed from: b */
    public final C60870cx mo71112b() {
        return m171086h(ForegroundSignalType.b);
    }

    /* renamed from: c */
    public final C60870cx mo71113c() {
        return m171086h(ForegroundSignalType.c);
    }

    /* renamed from: f */
    public final void mo93701f(ForegroundSignalType foregroundSignalType, String str) {
        if (foregroundSignalType.equals(ForegroundSignalType.d) || foregroundSignalType.equals(ForegroundSignalType.c)) {
            C83305i iVar = this.f287941b;
            C82582kn e = m171084e();
            e.mo75833b(false);
            ((C82353ca) e).f224974b = str;
            iVar.mo75579d(e.mo75832a());
            return;
        }
        C83305i iVar2 = this.f287941b;
        C82580kl d = m171083d();
        d.mo75820c(false);
        ((C82350by) d).f224962c = str;
        iVar2.mo75579d(d.mo75818a());
    }
}
