package com.google.android.apps.gsa.nga.engine.recognition;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.b.g.r;
import com.google.android.apps.gsa.nga.engine.p5978b.p5989g.C75250af;
import com.google.android.apps.gsa.nga.engine.p5978b.p5989g.C75284q;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.aj */
/* compiled from: PG */
public abstract class C77557aj {
    /* renamed from: w */
    public static C77557aj m124417w(C77889u uVar, String str, C77551ad adVar, C77556ai aiVar, j jVar, Instant instant) {
        C77830m mVar = new C77830m();
        mVar.mo72625c(uVar);
        if (jVar != null) {
            mVar.f214385d = jVar;
            mVar.mo72630h(instant);
            C77731k kVar = new C77731k();
            kVar.mo72610h(str);
            kVar.mo72608f(adVar);
            kVar.mo72607e(Optional.empty());
            mVar.f214382a = C58485gu.m89842j(C58485gu.m89846n(kVar.mo72603a()));
            mVar.mo72629g(true);
            mVar.mo72636n();
            mVar.mo72626d(aiVar);
            C77561an e = C77563ap.m124450e();
            ((C77875o) e).f214526a = Optional.m71637of(uVar);
            mVar.mo72633k(e.mo72663a());
            return mVar.mo72623a();
        }
        throw new NullPointerException("Null candidateIdentifier");
    }

    /* renamed from: A */
    public final boolean mo72637A() {
        if (mo72643f().isEmpty() || ((C77552ae) mo72643f().get(0)).mo72612b() != C77551ad.SODA_PREDICTION) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public abstract j mo72638a();

    /* renamed from: b */
    public abstract C77889u mo72639b();

    /* renamed from: c */
    public abstract C77555ah mo72640c();

    /* renamed from: d */
    public abstract C77556ai mo72641d();

    /* renamed from: e */
    public abstract C77563ap mo72642e();

    /* renamed from: f */
    public abstract C58485gu mo72643f();

    /* renamed from: g */
    public abstract Instant mo72644g();

    /* renamed from: h */
    public abstract Optional mo72645h();

    /* renamed from: i */
    public abstract Optional mo72646i();

    /* renamed from: j */
    public abstract Optional mo72647j();

    /* renamed from: k */
    public abstract Optional mo72648k();

    /* renamed from: l */
    public abstract Optional mo72649l();

    /* renamed from: m */
    public abstract Optional mo72650m();

    /* renamed from: n */
    public abstract Optional mo72651n();

    /* renamed from: o */
    public abstract Optional mo72652o();

    /* renamed from: p */
    public abstract Optional mo72653p();

    /* renamed from: q */
    public abstract Optional mo72654q();

    /* renamed from: r */
    public abstract Optional mo72655r();

    /* renamed from: s */
    public abstract Optional mo72656s();

    /* renamed from: t */
    public abstract boolean mo72657t();

    /* renamed from: u */
    public abstract boolean mo72658u();

    /* renamed from: v */
    public final C75250af mo72659v() {
        C75284q qVar = new C75284q();
        ac b = mo72638a().b();
        if (b != null) {
            qVar.f209749a = b;
            mo72649l().ifPresent(new C77554ag(qVar));
            ac acVar = qVar.f209749a;
            if (acVar != null) {
                return new r(acVar, qVar.f209750b);
            }
            throw new IllegalStateException("Missing required properties: utteranceIdentifier");
        }
        throw new NullPointerException("Null utteranceIdentifier");
    }

    /* renamed from: x */
    public final String mo72660x() {
        return mo72643f().isEmpty() ? BuildConfig.FLAVOR : ((C77552ae) mo72643f().get(0)).mo72618h();
    }

    /* renamed from: y */
    public final String mo72661y() {
        return (String) mo72656s().orElse(mo72660x());
    }

    /* renamed from: z */
    public final boolean mo72662z() {
        return mo72641d().equals(C77556ai.FINAL);
    }
}
