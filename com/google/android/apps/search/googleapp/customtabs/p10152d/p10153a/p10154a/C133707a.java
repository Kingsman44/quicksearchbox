package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.p10154a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139788a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60483ro;
import com.google.common.p4552o.C60489ru;
import com.google.common.p4552o.C60497sb;
import com.google.common.p4552o.C60499sd;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.a.a */
/* compiled from: PG */
public final class C133707a {

    /* renamed from: a */
    public final C21370a f364184a;

    /* renamed from: b */
    public final C89859i f364185b;

    /* renamed from: c */
    public final C60497sb f364186c;

    /* renamed from: d */
    public final C139787a f364187d;

    /* renamed from: e */
    public final boolean f364188e;

    /* renamed from: f */
    public boolean f364189f = false;

    /* renamed from: g */
    public boolean f364190g = false;

    /* renamed from: h */
    public volatile boolean f364191h = false;

    /* renamed from: i */
    public volatile boolean f364192i = false;

    /* renamed from: j */
    public Long f364193j;

    /* renamed from: k */
    private final C38750am f364194k;

    /* renamed from: l */
    private volatile C133771b f364195l;

    /* renamed from: m */
    private volatile Integer f364196m;

    public C133707a(C21370a aVar, C89859i iVar, C38750am amVar, C139787a aVar2, boolean z) {
        this.f364184a = aVar;
        this.f364185b = iVar;
        this.f364194k = amVar;
        this.f364186c = (C60497sb) C60499sd.f163777j.createBuilder();
        this.f364187d = aVar2;
        this.f364188e = z;
    }

    /* renamed from: a */
    public final int mo111341a() {
        return mo111342b(this.f364184a.mo26874f());
    }

    /* renamed from: b */
    public final int mo111342b(long j) {
        Long l = this.f364193j;
        C58838bb.m90866a(l, "The intent started time must be set");
        return (int) (j - l.longValue());
    }

    /* renamed from: c */
    public final C89856f mo111343c(C89849ae aeVar, Long l) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        if (l != null) {
            fVar.f246204d = Duration.ofMillis(l.longValue()).plus(Duration.ofNanos(this.f364184a.mo26872d()).minusMillis(this.f364184a.mo26874f())).toNanos();
        }
        return fVar;
    }

    /* renamed from: d */
    public final C139789b mo111344d() {
        C133771b bVar = this.f364195l;
        C58838bb.m90866a(bVar, "Session must be prepared before logging");
        C139788a aVar = (C139788a) C139789b.f379928d.createBuilder();
        long j = bVar.f364372c;
        aVar.copyOnWrite();
        C139789b bVar2 = (C139789b) aVar.instance;
        bVar2.f379930a |= 1;
        bVar2.f379931b = j;
        aVar.copyOnWrite();
        C139789b bVar3 = (C139789b) aVar.instance;
        bVar3.f379930a |= 2;
        bVar3.f379932c = true;
        return (C139789b) aVar.build();
    }

    /* renamed from: e */
    public final void mo111345e(C89849ae aeVar, Long l) {
        C89856f c = mo111343c(aeVar, l);
        C133771b bVar = this.f364195l;
        C58838bb.m90866a(bVar, "Session must be prepared before logging");
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        long j = bVar.f364372c;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160123d |= 65536;
        cbVar.f160085aW = j;
        c.f246203c = (C59687cb) ajVar.build();
        this.f364185b.mo74236a(c.mo83699a());
    }

    /* renamed from: f */
    public final void mo111346f(C60489ru ruVar) {
        if (((C60499sd) this.f364186c.instance).f163787i.size() < 100) {
            C60497sb sbVar = this.f364186c;
            sbVar.copyOnWrite();
            C60499sd sdVar = (C60499sd) sbVar.instance;
            ruVar.getClass();
            sdVar.mo57101a();
            sdVar.f163787i.add(ruVar);
        }
    }

    /* renamed from: g */
    public final void mo111347g(C59743a aVar) {
        C133771b bVar = this.f364195l;
        C58838bb.m90866a(bVar, "Session must be prepared before logging");
        Integer num = this.f364196m;
        if (num != null) {
            C60497sb sbVar = this.f364186c;
            int intValue = num.intValue();
            sbVar.copyOnWrite();
            C60499sd sdVar = (C60499sd) sbVar.instance;
            C60499sd sdVar2 = C60499sd.f163777j;
            sdVar.f163779a |= 1;
            sdVar.f163780b = intValue;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        int i = aVar.f161421ts;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C60497sb sbVar2 = this.f364186c;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60499sd sdVar3 = (C60499sd) sbVar2.build();
        sdVar3.getClass();
        ufVar2.f164104aK = sdVar3;
        ufVar2.f164250e |= 67108864;
        long j = bVar.f364373d;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164093a |= 16;
        ufVar3.f164261p = j;
        long j2 = bVar.f364372c;
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        ufVar4.f164252g |= 268435456;
        ufVar4.f164192bt = j2;
        this.f364194k.mo41599k(aVar, tzVar);
    }

    /* renamed from: h */
    public final void mo111348h(C133771b bVar, boolean z, Integer num) {
        this.f364191h = true;
        this.f364192i = z;
        this.f364195l = bVar;
        this.f364196m = num;
    }

    /* renamed from: i */
    public final C60489ru mo111349i(int i, Long l) {
        int a = mo111341a();
        C60483ro roVar = (C60483ro) C60489ru.f163711h.createBuilder();
        roVar.copyOnWrite();
        C60489ru ruVar = (C60489ru) roVar.instance;
        ruVar.f163713a |= 2;
        ruVar.f163715c = a;
        roVar.copyOnWrite();
        C60489ru ruVar2 = (C60489ru) roVar.instance;
        ruVar2.f163714b = i - 1;
        ruVar2.f163713a |= 1;
        if (l != null) {
            int b = mo111342b(l.longValue());
            roVar.copyOnWrite();
            C60489ru ruVar3 = (C60489ru) roVar.instance;
            ruVar3.f163713a |= 4;
            ruVar3.f163716d = b;
        }
        return (C60489ru) roVar.build();
    }

    /* renamed from: j */
    public final void mo111350j(int i, int i2) {
        C60497sb sbVar = this.f364186c;
        int i3 = ((C60499sd) sbVar.instance).f163779a;
        if ((i3 & 32) == 0 && (i3 & 4) != 0 && (i3 & 2) != 0) {
            sbVar.copyOnWrite();
            C60499sd sdVar = (C60499sd) sbVar.instance;
            sdVar.f163779a |= 16;
            sdVar.f163784f = i2;
            C60497sb sbVar2 = this.f364186c;
            sbVar2.copyOnWrite();
            C60499sd sdVar2 = (C60499sd) sbVar2.instance;
            sdVar2.f163785g = i - 1;
            sdVar2.f163779a |= 32;
            mo111347g(C59743a.USER_EVENT_CUSTOM_TABS_NAVIGATION_ENDED);
        }
    }
}
