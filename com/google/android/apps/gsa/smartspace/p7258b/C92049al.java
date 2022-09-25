package com.google.android.apps.gsa.smartspace.p7258b;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.smartspace.C92126u;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4552o.ali;
import com.google.common.p4552o.alj;
import com.google.common.p4552o.alk;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.smartspace.b.al */
/* compiled from: PG */
public final class C92049al implements C92126u {

    /* renamed from: a */
    public final C68214a f256634a;

    /* renamed from: b */
    public final C85881bd f256635b;

    /* renamed from: c */
    public final u f256636c;

    /* renamed from: d */
    public final C89994f f256637d;

    /* renamed from: e */
    public final C92122r f256638e;

    /* renamed from: f */
    private final C9684l f256639f;

    /* renamed from: g */
    private final l f256640g;

    /* renamed from: h */
    private final h f256641h;

    public C92049al(C9684l lVar, C68214a aVar, C85881bd bdVar, l lVar2, h hVar, u uVar, C89994f fVar, C92122r rVar) {
        this.f256639f = lVar;
        this.f256634a = aVar;
        this.f256635b = bdVar;
        this.f256640g = lVar2;
        this.f256641h = hVar;
        this.f256636c = uVar;
        this.f256637d = fVar;
        this.f256638e = rVar;
    }

    /* renamed from: d */
    public static void m151094d(List list, ali ali, boolean z) {
        alj alj = (alj) alk.f159060d.createBuilder();
        alj.copyOnWrite();
        alk alk = (alk) alj.instance;
        alk.f159063b = ali.f159059C;
        alk.f159062a |= 1;
        alj.copyOnWrite();
        alk alk2 = (alk) alj.instance;
        alk2.f159062a |= 2;
        alk2.f159064c = z;
        list.add((alk) alj.build());
    }

    /* renamed from: a */
    public final ali mo86718a(C92094j jVar) {
        C92094j jVar2 = C92094j.AT_A_GLANCE;
        C50794cr crVar = C50794cr.UNDEFINED;
        int ordinal = jVar.ordinal();
        if (ordinal == 9) {
            return ali.AT_TRANSIT_STATION;
        }
        if (ordinal == 10) {
            return ali.HEADPHONES;
        }
        if (ordinal == 22) {
            return ali.WEATHER;
        }
        if (ordinal == 24) {
            return ali.LOCATION;
        }
        if (ordinal == 38) {
            return ali.UPCOMING_BUNDLE;
        }
        switch (ordinal) {
            case 1:
                return ali.CALENDAR_EVENTS;
            case 2:
                return ali.UPCOMING_FLIGHTS;
            case 3:
                return ali.TRAFFIC_INFORMATION;
            case 4:
                return ali.REMINDERS;
            case 5:
                return ali.WORK_PROFILE;
            case 6:
                return ali.AT_HOME;
            case 7:
                return ali.AT_STORE;
            default:
                switch (ordinal) {
                    case 29:
                        return ali.SPORTS;
                    case 30:
                        return ali.STOCK;
                    case 31:
                        return ali.BIRTHDAY;
                    case 32:
                        return ali.WEATHER_ALERT;
                    default:
                        return ali.UNSPECIFIED;
                }
        }
    }

    /* renamed from: b */
    public final ali mo86719b(C50794cr crVar) {
        C92094j jVar = C92094j.AT_A_GLANCE;
        C50794cr crVar2 = C50794cr.UNDEFINED;
        int ordinal = crVar.ordinal();
        if (ordinal == 2) {
            return ali.CALENDAR_EVENTS;
        }
        if (ordinal == 3) {
            return ali.TRAFFIC_INFORMATION;
        }
        if (ordinal == 4) {
            return ali.UPCOMING_FLIGHTS;
        }
        if (ordinal == 5) {
            return ali.BIRTHDAY;
        }
        if (ordinal == 8) {
            return ali.REMINDERS;
        }
        if (ordinal == 10) {
            return ali.ALARM;
        }
        if (ordinal == 16) {
            return ali.STOCK;
        }
        if (ordinal == 13) {
            return ali.SPORTS;
        }
        if (ordinal != 14) {
            return ali.UNSPECIFIED;
        }
        return ali.WEATHER_ALERT;
    }

    /* renamed from: c */
    public final C60870cx mo86720c() {
        C60870cx cxVar;
        l lVar = this.f256640g;
        Account a = this.f256641h.a();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 128;
        acv.f128952h = true;
        C60870cx j = lVar.j(a, (acv) acu.build(), (C50144me) null, 5, TimeUnit.SECONDS, getClass().getSimpleName());
        C60870cx b = this.f256636c.b();
        Account a2 = this.f256641h.a();
        if (a2 != null) {
            cxVar = C60922j.m93044g(this.f256639f.mo17952a(a2), C92048ak.f256633a, C60826bg.f164896a);
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        return C60856cj.m92893b(j, b, cxVar).mo57334a(new C92047aj(this, j, b, cxVar), C60826bg.f164896a);
    }
}
