package com.google.research.p5181a.p5182a;

import com.google.research.p5181a.C66298ac;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.Calendar;
import p3186j$.util.DesugarTimeZone;
import p3186j$.util.Objects;

/* renamed from: com.google.research.a.a.q */
/* compiled from: PG */
public final class C66294q {
    /* renamed from: a */
    public static long m96858a(C66376a aVar, C66376a aVar2) {
        long c = (aVar2.mo59467j().mo59503c() - aVar.mo59467j().mo59503c()) - aVar.mo59458a();
        if (aVar.mo59467j().mo59501a() <= 0 || aVar2.mo59467j().mo59501a() <= 0) {
            if (c < 0) {
                return Long.MAX_VALUE;
            }
            return c;
        } else if (Objects.equals(Long.valueOf(aVar.mo59467j().mo59501a()), Long.valueOf(aVar2.mo59467j().mo59501a()))) {
            return (aVar2.mo59467j().mo59502b() - aVar.mo59467j().mo59502b()) - aVar.mo59458a();
        } else {
            long a = ((aVar2.mo59467j().mo59501a() + aVar2.mo59467j().mo59502b()) - (aVar.mo59467j().mo59501a() + aVar.mo59467j().mo59502b())) - aVar.mo59458a();
            if (c >= 0 && a >= 0) {
                return Math.min(c, a);
            }
            if (c < 0 && a >= 0) {
                return a;
            }
            if (c >= 0) {
                return c;
            }
            return Long.MAX_VALUE;
        }
    }

    /* renamed from: b */
    public static Calendar m96859b(C66376a aVar) {
        if (aVar.mo59467j().mo59504d() == null || aVar.mo59467j().mo59504d().isEmpty()) {
            Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            instance.setTimeInMillis(aVar.mo59467j().mo59503c() + ((C66298ac) aVar.mo59467j().f180317a.instance).f180302f);
            return instance;
        }
        Calendar instance2 = Calendar.getInstance(DesugarTimeZone.getTimeZone(aVar.mo59467j().mo59504d()));
        instance2.setTimeInMillis(aVar.mo59467j().mo59503c());
        return instance2;
    }
}
