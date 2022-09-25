package com.google.assistant.p3838ao.p3839a.p3849i;

import com.google.assistant.p3838ao.p3839a.C49693s;
import com.google.assistant.p3838ao.p3839a.p3845e.C49531ao;
import com.google.assistant.p3838ao.p3839a.p3845e.C49534ar;
import com.google.assistant.p3838ao.p3839a.p3845e.C49539aw;
import com.google.assistant.p3838ao.p3839a.p3845e.C49542az;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.i.l */
/* compiled from: PG */
public final class C49681l {
    /* renamed from: a */
    public static C49693s m85668a(String str, C49542az azVar, double d) {
        C49693s sVar = new C49693s();
        sVar.f128265a = Optional.ofNullable(str);
        sVar.f128267k = Optional.ofNullable(azVar);
        sVar.f127723d = d;
        return sVar;
    }

    /* renamed from: b */
    public static C49693s m85669b(String str, String str2, double d, Optional optional) {
        C49693s sVar = new C49693s();
        sVar.f128265a = Optional.ofNullable(str);
        sVar.f128266j = Optional.ofNullable(str2);
        Objects.requireNonNull(sVar);
        optional.ifPresent(new C49680k(sVar));
        sVar.f127723d = d;
        return sVar;
    }

    /* renamed from: c */
    public static C49693s m85670c(String str, String str2, double d) {
        C49531ao aoVar = (C49531ao) C49534ar.f127808c.createBuilder();
        aoVar.copyOnWrite();
        C49534ar arVar = (C49534ar) aoVar.instance;
        arVar.f127811b = 1;
        arVar.f127810a = 3;
        return m85669b(str, str2, d, Optional.m71637of((C49534ar) aoVar.build()));
    }

    /* renamed from: d */
    public static C58485gu m85671d(String... strArr) {
        C58480gp e = C58485gu.m89837e();
        for (String str : strArr) {
            e.mo55395g(m85669b(str, str, 1.0E-10d, Optional.empty()));
        }
        return e.mo55394f();
    }

    /* renamed from: e */
    public static C49693s m85672e(String str, String str2) {
        C49693s sVar = new C49693s();
        sVar.f128265a = Optional.ofNullable(str2);
        C49539aw awVar = (C49539aw) C49542az.f127827e.createBuilder();
        awVar.copyOnWrite();
        C49542az azVar = (C49542az) awVar.instance;
        str.getClass();
        azVar.f127829a |= 2;
        azVar.f127831c = str;
        awVar.copyOnWrite();
        C49542az azVar2 = (C49542az) awVar.instance;
        azVar2.f127832d = 1;
        azVar2.f127829a |= 4;
        sVar.f128267k = Optional.ofNullable((C49542az) awVar.build());
        C49531ao aoVar = (C49531ao) C49534ar.f127808c.createBuilder();
        aoVar.copyOnWrite();
        C49534ar arVar = (C49534ar) aoVar.instance;
        arVar.f127811b = 2;
        arVar.f127810a = 3;
        sVar.f128268l = Optional.ofNullable((C49534ar) aoVar.build());
        sVar.f127723d = 1.0d;
        return sVar;
    }
}
