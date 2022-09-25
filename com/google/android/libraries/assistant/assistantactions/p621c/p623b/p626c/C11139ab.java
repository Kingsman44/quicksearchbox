package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.android.libraries.assistant.assistantactions.p636e.C11278h;
import com.google.assistant.p3897e.p3902c.p3907c.C50951aw;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C50959bd;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4580v.C60950i;
import com.google.protos.p4850an.p4853b.C63358b;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4853b.C63378v;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ab */
/* compiled from: PG */
public final class C11139ab {

    /* renamed from: a */
    public final C60950i f36503a;

    /* renamed from: b */
    public final Optional f36504b;

    /* renamed from: c */
    public final Optional f36505c;

    /* renamed from: d */
    public final Optional f36506d;

    /* renamed from: e */
    public final Optional f36507e;

    public C11139ab(C51953ff ffVar, Optional optional, C60950i iVar) {
        Optional optional2;
        this.f36503a = iVar;
        if (!optional.isPresent()) {
            optional2 = Optional.empty();
        } else {
            optional2 = Optional.m71637of((C52490tr) C58557jl.m90130k(((C52507uh) optional.get()).f137840a, C52490tr.f137795g));
        }
        Optional b = m26440b(ffVar, optional2, "datetime.date", C11198v.f36614a, C11199w.f36615a);
        this.f36504b = b;
        Optional b2 = m26440b(ffVar, optional2, "datetime.time", C11200x.f36616a, C11201y.f36617a);
        this.f36505c = b2;
        Optional b3 = m26440b(ffVar, optional2, "recurrence", C11202z.f36618a, C11138aa.f36502a);
        this.f36506d = b3;
        this.f36507e = Optional.m71637of(C11278h.m26776f(b, b2, b3));
    }

    /* renamed from: b */
    private static Optional m26440b(C51953ff ffVar, Optional optional, String str, Function function, Function function2) {
        C50959bd bdVar;
        C52477te teVar;
        C50959bd bdVar2;
        C52477te teVar2;
        Optional ofNullable = Optional.ofNullable((C51941eu) C11222q.m26610g(str, ffVar).mo56111f());
        if (!ofNullable.isPresent()) {
            return Optional.empty();
        }
        if (!optional.isPresent() || !((C52490tr) optional.get()).f137800d.equals(str)) {
            C51941eu euVar = (C51941eu) ofNullable.get();
            if (euVar.f136277e == 33) {
                bdVar = (C50959bd) euVar.f136278f;
            } else {
                bdVar = C50959bd.f132657e;
            }
            for (C50954az azVar : bdVar.f132660b) {
                C50951aw a = C50951aw.m85988a(azVar.f132649i);
                if (a == null) {
                    a = C50951aw.DEFAULT_STATUS;
                }
                if (a != C50951aw.HIGHLIGHT) {
                    C50951aw a2 = C50951aw.m85988a(azVar.f132649i);
                    if (a2 == null) {
                        a2 = C50951aw.DEFAULT_STATUS;
                    }
                    if (a2 == C50951aw.ERROR) {
                    }
                }
                return Optional.ofNullable(function2.apply(azVar));
            }
            return Optional.empty();
        }
        C52490tr trVar = (C52490tr) optional.get();
        if (trVar.f137798b == 16) {
            teVar = (C52477te) trVar.f137799c;
        } else {
            teVar = C52477te.f137748h;
        }
        Optional optional2 = (Optional) function.apply(teVar);
        if (optional2.isPresent()) {
            return optional2;
        }
        C51941eu euVar2 = (C51941eu) ofNullable.get();
        if (euVar2.f136277e == 33) {
            bdVar2 = (C50959bd) euVar2.f136278f;
        } else {
            bdVar2 = C50959bd.f132657e;
        }
        C52490tr trVar2 = (C52490tr) optional.get();
        if (trVar2.f137798b == 16) {
            teVar2 = (C52477te) trVar2.f137799c;
        } else {
            teVar2 = C52477te.f137748h;
        }
        C50954az azVar2 = (C50954az) bdVar2.f132660b.get((int) teVar2.f137753d);
        C50951aw a3 = C50951aw.m85988a(azVar2.f132649i);
        if (a3 == null) {
            a3 = C50951aw.DEFAULT_STATUS;
        }
        if (a3 != C50951aw.HIGHLIGHT) {
            C50951aw a4 = C50951aw.m85988a(azVar2.f132649i);
            if (a4 == null) {
                a4 = C50951aw.DEFAULT_STATUS;
            }
            if (a4 != C50951aw.ERROR) {
                return Optional.ofNullable(function2.apply(azVar2));
            }
        }
        return Optional.empty();
    }

    /* renamed from: a */
    public final boolean mo19612a() {
        if (!this.f36507e.isPresent() || ((C63360d) this.f36507e.get()).f171234c.size() == 0) {
            return false;
        }
        C63358b bVar = (C63358b) ((C63360d) this.f36507e.get()).f171234c.get(0);
        int i = bVar.f171218a;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 16) == 0) {
            return false;
        }
        int i2 = bVar.f171219b;
        int a = C63378v.m96231a(bVar.f171220c);
        if (a == 0) {
            a = 1;
        }
        return LocalDateTime.m71184of(i2, a - 1, bVar.f171221d, bVar.f171222e, bVar.f171223f, bVar.f171224g).atZone(ZoneId.systemDefault()).toInstant().isAfter(this.f36503a.mo57444a());
    }
}
