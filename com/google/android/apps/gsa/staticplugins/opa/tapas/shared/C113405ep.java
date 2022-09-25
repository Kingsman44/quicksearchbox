package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112560o;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56339j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep */
/* compiled from: PG */
public abstract class C113405ep {

    /* renamed from: q */
    public static final C113405ep f314035q;

    static {
        C113404eo r = m187677r();
        ((C113272ay) r).f313662d = new C112560o((C112471ap) null, (C86124t) null);
        f314035q = r.mo100001a();
    }

    /* renamed from: r */
    public static C113404eo m187677r() {
        C113272ay ayVar = new C113272ay();
        ayVar.mo100011k(0);
        ayVar.f313659a = BuildConfig.FLAVOR;
        ayVar.mo100002b(C19167ba.f53673s);
        ayVar.mo100013m(0);
        ayVar.mo100014n(0);
        ayVar.f313660b = "com.whatsapp";
        ayVar.f313661c = C60866ct.f164955a;
        ayVar.mo100003c(C56339j.f150165b);
        ayVar.mo100015o(C51331dt.FULLY_TRUSTED);
        ayVar.mo100012l(C48674ai.ASSISTANT);
        return ayVar;
    }

    /* renamed from: a */
    public abstract long mo100016a();

    /* renamed from: b */
    public abstract long mo100017b();

    /* renamed from: c */
    public abstract long mo100018c();

    /* renamed from: d */
    public abstract C112560o mo100019d();

    /* renamed from: e */
    public abstract C113404eo mo100020e();

    /* renamed from: f */
    public abstract C19167ba mo100022f();

    /* renamed from: g */
    public abstract C51331dt mo100023g();

    /* renamed from: h */
    public abstract C48674ai mo100024h();

    /* renamed from: i */
    public abstract C60870cx mo100026i();

    /* renamed from: j */
    public abstract C56339j mo100027j();

    /* renamed from: k */
    public abstract Optional mo100028k();

    /* renamed from: l */
    public abstract Optional mo100029l();

    /* renamed from: m */
    public abstract Optional mo100030m();

    /* renamed from: n */
    public abstract Optional mo100031n();

    /* renamed from: o */
    public abstract Optional mo100032o();

    /* renamed from: p */
    public abstract String mo100033p();

    /* renamed from: q */
    public abstract String mo100034q();

    /* renamed from: s */
    public final String mo100186s() {
        return "_".concat(String.valueOf(mo100024h().name()));
    }
}
