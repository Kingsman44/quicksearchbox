package com.google.android.libraries.p11024al.p11025a;

import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.MonthlyPattern;
import com.google.android.gms.reminders.model.Time;
import com.google.p381aj.p382a.p383a.p384a.C8241u;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.p4653i.p4654a.C61671al;
import com.google.p4653i.p4654a.C61672am;
import com.google.p4653i.p4654a.C61678as;
import com.google.p4653i.p4654a.C61703m;
import com.google.p4653i.p4654a.C61705o;
import com.google.p4653i.p4654a.C61707q;
import com.google.p4653i.p4654a.C61708r;
import com.google.p4653i.p4654a.C61709s;
import com.google.p4653i.p4654a.C61710t;
import com.google.protobuf.C62947c;
import java.util.List;

/* renamed from: com.google.android.libraries.al.a.m */
/* compiled from: PG */
public final class C147757m {
    /* renamed from: a */
    public static C61709s m240822a(Time time) {
        C61708r rVar = (C61708r) C61709s.f166701e.createBuilder();
        int i = 0;
        int intValue = time.mo122086h() != null ? time.mo122086h().intValue() : 0;
        rVar.copyOnWrite();
        C61709s sVar = (C61709s) rVar.instance;
        sVar.f166703a |= 1;
        sVar.f166704b = intValue;
        int intValue2 = time.mo122087i() != null ? time.mo122087i().intValue() : 0;
        rVar.copyOnWrite();
        C61709s sVar2 = (C61709s) rVar.instance;
        sVar2.f166703a |= 2;
        sVar2.f166705c = intValue2;
        if (time.mo122088j() != null) {
            i = time.mo122088j().intValue();
        }
        rVar.copyOnWrite();
        C61709s sVar3 = (C61709s) rVar.instance;
        sVar3.f166703a |= 4;
        sVar3.f166706d = i;
        return (C61709s) rVar.build();
    }

    /* renamed from: b */
    public static C61710t m240823b(DateTime dateTime) {
        int a;
        C61703m mVar = (C61703m) C61710t.f166708k.createBuilder();
        if (dateTime.mo121999o() != null) {
            int intValue = dateTime.mo121999o().intValue();
            mVar.copyOnWrite();
            C61710t tVar = (C61710t) mVar.instance;
            tVar.f166710a |= 1;
            tVar.f166711b = intValue;
        }
        if (dateTime.mo121997m() != null) {
            int intValue2 = dateTime.mo121997m().intValue();
            mVar.copyOnWrite();
            C61710t tVar2 = (C61710t) mVar.instance;
            tVar2.f166710a |= 2;
            tVar2.f166712c = intValue2;
        }
        if (dateTime.mo121996l() != null) {
            int intValue3 = dateTime.mo121996l().intValue();
            mVar.copyOnWrite();
            C61710t tVar3 = (C61710t) mVar.instance;
            tVar3.f166710a |= 4;
            tVar3.f166713d = intValue3;
        }
        if (!(dateTime.mo121998n() == null || (a = C61707q.m94435a(dateTime.mo121998n().intValue())) == 0)) {
            mVar.copyOnWrite();
            C61710t tVar4 = (C61710t) mVar.instance;
            tVar4.f166715f = a;
            tVar4.f166710a |= 16;
        }
        if (dateTime.mo122000p() != null) {
            long longValue = dateTime.mo122000p().longValue();
            mVar.copyOnWrite();
            C61710t tVar5 = (C61710t) mVar.instance;
            tVar5.f166710a |= 64;
            tVar5.f166717h = longValue;
        }
        if (dateTime.mo121992h() != null) {
            C61709s a2 = m240822a(dateTime.mo121992h());
            mVar.copyOnWrite();
            C61710t tVar6 = (C61710t) mVar.instance;
            a2.getClass();
            tVar6.f166714e = a2;
            tVar6.f166710a |= 8;
        }
        if (!(dateTime.mo121995k() == null || C61705o.m94434a(dateTime.mo121995k().intValue()) == 0)) {
            mVar.copyOnWrite();
            C61710t tVar7 = (C61710t) mVar.instance;
            tVar7.f166716g = 1;
            tVar7.f166710a |= 32;
        }
        if (dateTime.mo121994j() != null) {
            boolean booleanValue = dateTime.mo121994j().booleanValue();
            mVar.copyOnWrite();
            C61710t tVar8 = (C61710t) mVar.instance;
            tVar8.f166710a |= 128;
            tVar8.f166718i = booleanValue;
        }
        if (dateTime.mo121993i() != null) {
            boolean booleanValue2 = dateTime.mo121993i().booleanValue();
            mVar.copyOnWrite();
            C61710t tVar9 = (C61710t) mVar.instance;
            tVar9.f166710a |= 256;
            tVar9.f166719j = booleanValue2;
        }
        return (C61710t) mVar.build();
    }

    /* renamed from: c */
    public static C61672am m240824c(MonthlyPattern monthlyPattern) {
        int a;
        C61671al alVar = (C61671al) C61672am.f166603f.createBuilder();
        if (monthlyPattern.mo122030j() != null) {
            List j = monthlyPattern.mo122030j();
            alVar.copyOnWrite();
            C61672am amVar = (C61672am) alVar.instance;
            amVar.mo58168a();
            C62947c.addAll((Iterable) j, (List) amVar.f166606b);
        }
        if (!(monthlyPattern.mo122028h() == null || (a = C61678as.m94431a(monthlyPattern.mo122028h().intValue())) == 0)) {
            alVar.copyOnWrite();
            C61672am amVar2 = (C61672am) alVar.instance;
            amVar2.f166607c = a;
            amVar2.f166605a |= 4;
        }
        if (monthlyPattern.mo122029i() != null) {
            int intValue = monthlyPattern.mo122029i().intValue();
            alVar.copyOnWrite();
            C61672am amVar3 = (C61672am) alVar.instance;
            amVar3.f166605a |= 8;
            amVar3.f166608d = intValue;
        }
        return (C61672am) alVar.build();
    }

    /* renamed from: d */
    public static C8242v m240825d(FeatureIdProto featureIdProto) {
        if (featureIdProto == null || featureIdProto.mo122007h() == null || featureIdProto.mo122008i() == null) {
            return null;
        }
        C8241u uVar = (C8241u) C8242v.f28952d.createBuilder();
        long longValue = featureIdProto.mo122007h().longValue();
        uVar.copyOnWrite();
        C8242v vVar = (C8242v) uVar.instance;
        vVar.f28954a |= 1;
        vVar.f28955b = longValue;
        long longValue2 = featureIdProto.mo122008i().longValue();
        uVar.copyOnWrite();
        C8242v vVar2 = (C8242v) uVar.instance;
        vVar2.f28954a |= 2;
        vVar2.f28956c = longValue2;
        return (C8242v) uVar.build();
    }
}
