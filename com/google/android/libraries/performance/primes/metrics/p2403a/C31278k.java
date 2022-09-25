package com.google.android.libraries.performance.primes.metrics.p2403a;

import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.p5271x.p5272a.p5273a.C67963a;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71192ab;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71193ac;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71323r;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71324s;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.k */
/* compiled from: PG */
final class C31278k {

    /* renamed from: b */
    private static final C58869cf f84246b = C58869cf.m90936b(new C58903m('/'));

    /* renamed from: c */
    private static final Pattern f84247c = Pattern.compile("^(\\*[a-z]+\\*).*");

    /* renamed from: a */
    final ConcurrentHashMap f84248a = new ConcurrentHashMap();

    /* renamed from: a */
    static String m58297a(String str) {
        List i = f84246b.mo56155i(str);
        if (i.size() != 3) {
            return "MALFORMED";
        }
        return (String) i.get(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C71193ac mo36991b(C71193ac acVar) {
        C71324s sVar = acVar.f189958d;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        if ((sVar.f190490a & 1) == 0) {
            return acVar;
        }
        C71324s sVar2 = acVar.f189958d;
        if (sVar2 == null) {
            sVar2 = C71324s.f190488d;
        }
        C71323r rVar = (C71323r) sVar2.toBuilder();
        Long l = (Long) this.f84248a.get(Long.valueOf(((C71324s) rVar.instance).f190491b));
        l.getClass();
        C71192ab abVar = (C71192ab) acVar.toBuilder();
        long longValue = l.longValue();
        rVar.copyOnWrite();
        C71324s sVar3 = (C71324s) rVar.instance;
        sVar3.f190490a |= 1;
        sVar3.f190491b = longValue;
        abVar.copyOnWrite();
        C71193ac acVar2 = (C71193ac) abVar.instance;
        C71324s sVar4 = (C71324s) rVar.build();
        sVar4.getClass();
        acVar2.f189958d = sVar4;
        acVar2.f189955a |= 4;
        return (C71193ac) abVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C71193ac mo36992c(int i, C71193ac acVar) {
        C71324s sVar = acVar.f189958d;
        if (sVar == null) {
            sVar = C71324s.f190488d;
        }
        if ((sVar.f190490a & 2) == 0) {
            return acVar;
        }
        C71324s sVar2 = acVar.f189958d;
        if (sVar2 == null) {
            sVar2 = C71324s.f190488d;
        }
        C71323r rVar = (C71323r) sVar2.toBuilder();
        C71192ab abVar = (C71192ab) acVar.toBuilder();
        String str = ((C71324s) rVar.instance).f190492c;
        Long a = C67963a.m98221a(str);
        a.getClass();
        long longValue = a.longValue();
        ConcurrentHashMap concurrentHashMap = this.f84248a;
        Long valueOf = Long.valueOf(longValue);
        if (!concurrentHashMap.containsKey(valueOf)) {
            int i2 = i - 1;
            if (i2 == 0) {
                Matcher matcher = f84247c.matcher(str);
                if (matcher.matches()) {
                    str = str.startsWith("*sync*/") ? "*sync*/".concat(String.valueOf(m58297a(str.substring(7)))) : matcher.group(1);
                }
            } else if (i2 == 1) {
                str = m58297a(str);
            } else if (i2 == 2) {
                str = "--";
            }
            Long a2 = C67963a.m98221a(str);
            if (a2 != null) {
                this.f84248a.putIfAbsent(valueOf, a2);
            }
        }
        rVar.copyOnWrite();
        C71324s sVar3 = (C71324s) rVar.instance;
        sVar3.f190490a |= 1;
        sVar3.f190491b = longValue;
        rVar.copyOnWrite();
        C71324s sVar4 = (C71324s) rVar.instance;
        sVar4.f190490a &= -3;
        sVar4.f190492c = C71324s.f190488d.f190492c;
        abVar.copyOnWrite();
        C71193ac acVar2 = (C71193ac) abVar.instance;
        C71324s sVar5 = (C71324s) rVar.build();
        sVar5.getClass();
        acVar2.f189958d = sVar5;
        acVar2.f189955a |= 4;
        return (C71193ac) abVar.build();
    }
}
