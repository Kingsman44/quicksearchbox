package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.gms.common.api.internal.C143750ay;
import com.google.android.gms.common.internal.C143889ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.p5633c.p5634a.p5639e.C72245b;
import org.p5633c.p5634a.p5639e.C72260q;
import org.p5633c.p5634a.p5639e.C72267x;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.am */
/* compiled from: PG */
public final class C111175am extends C112473ar {

    /* renamed from: a */
    public static final C59071e f309456a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.am");

    /* renamed from: b */
    public static final String[] f309457b = {"internal.3p:Alarm_cross_device", "internal.3p:Timer_cross_device", "internal.3p:Stopwatch_cross_device"};

    /* renamed from: c */
    public static final String[] f309458c = {"com.google.android.deskclock"};

    /* renamed from: d */
    public static final C72245b f309459d;

    /* renamed from: e */
    public final C111178ap f309460e;

    /* renamed from: f */
    public final C58881cr f309461f = C58886cw.m90973a(C111167ae.f309450a);

    /* renamed from: g */
    public final C21370a f309462g;

    /* renamed from: h */
    public final C86124t f309463h;

    /* renamed from: i */
    public final C113425ff f309464i;

    /* renamed from: j */
    private final C22871g f309465j;

    static {
        C72260q qVar = new C72260q();
        C72260q qVar2 = new C72260q();
        qVar2.mo63616h(C72267x.f192325f);
        qVar2.mo63621m('T');
        qVar2.mo63616h(C72267x.f192326g);
        qVar.mo63623o(qVar2.mo63611b());
        C72260q qVar3 = new C72260q();
        qVar3.mo63625q("+HHMM", "+0000", true, 1, 2);
        qVar.mo63623o(qVar3.mo63611b());
        C72260q qVar4 = new C72260q();
        qVar4.mo63625q("+HH", "Z", true, 1, 1);
        qVar.mo63623o(qVar4.mo63611b());
        C72260q qVar5 = new C72260q();
        qVar5.mo63625q("+HH:MM", "+00:00", true, 1, 2);
        qVar.mo63623o(qVar5.mo63611b());
        f309459d = qVar.mo63610a();
    }

    public C111175am(C22871g gVar, C21370a aVar, C111178ap apVar, C86124t tVar, C113425ff ffVar) {
        this.f309465j = gVar;
        this.f309462g = aVar;
        this.f309460e = apVar;
        this.f309463h = tVar;
        this.f309464i = ffVar;
    }

    /* renamed from: e */
    public static Optional m184929e(C58148f fVar, String str) {
        return m184930f(fVar, str).flatMap(C111203z.f309499a);
    }

    /* renamed from: f */
    public static Optional m184930f(C58148f fVar, String str) {
        List j = m184934j(fVar, str);
        if (j.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((String) j.get(0));
    }

    /* renamed from: g */
    public static Optional m184931g(C58148f fVar, String str) {
        List j = m184934j(fVar, str);
        if (j.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((String) j.get(0));
    }

    /* renamed from: h */
    public static Optional m184932h(C58148f fVar, String str) {
        return Optional.ofNullable((C58146d) C58557jl.m90144y(fVar.f155457d, new C111197t(str)));
    }

    /* renamed from: i */
    public static Optional m184933i(C58148f fVar, String str) {
        return m184930f(fVar, str).flatMap(C111166ad.f309449a);
    }

    /* renamed from: j */
    public static List m184934j(C58148f fVar, String str) {
        Optional h = m184932h(fVar, str);
        return h.isPresent() ? ((C58146d) h.get()).f155449e : C58485gu.m89845m();
    }

    /* renamed from: k */
    public static void m184935k(C58148f fVar, C51588ng ngVar) {
        Optional i = m184933i(fVar, "expireTime");
        Objects.requireNonNull(ngVar);
        i.ifPresent(new C111188k(ngVar));
        Optional map = m184929e(fVar, "remainingTime").flatMap(new C111189l(i)).map(C111190m.f309486a).map(C111192o.f309488a);
        Objects.requireNonNull(ngVar);
        map.ifPresent(new C111193p(ngVar));
    }

    /* renamed from: a */
    public final long mo99043a() {
        return TimeUnit.SECONDS.toMillis(this.f309463h.mo79743a(C90063do.f249264aJ));
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        boolean contains;
        C111178ap apVar = this.f309460e;
        C143889ae aeVar = ((C143750ay) apVar.f309470c).f389699c;
        synchronized (aeVar.f390072i) {
            contains = aeVar.f390065b.contains(apVar);
        }
        if (!contains) {
            ((C143750ay) apVar.f309470c).f389699c.mo119397b(apVar);
            ((C143750ay) apVar.f309470c).f389699c.mo119398c(apVar);
        }
        C22871g gVar = this.f309465j;
        return gVar.mo28209i(gVar.mo28209i(this.f309464i.mo100136b(), "userDataControlsStatus.isPersonalResponseAllowed()", new C111180c(this)), "FetchDeskclockSignal", new C111186i(this));
    }

    /* renamed from: m */
    public final long mo99046m() {
        return TimeUnit.SECONDS.toMillis(this.f309463h.mo79743a(C90063do.f249263aI));
    }
}
