package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60483ro;
import com.google.common.p4552o.C60489ru;
import com.google.common.p4552o.C60497sb;
import com.google.common.p4552o.C60499sd;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.aa */
/* compiled from: PG */
public final class C98596aa {

    /* renamed from: a */
    public final C68214a f275372a;

    /* renamed from: b */
    public final long f275373b;

    /* renamed from: c */
    public final C60497sb f275374c;

    /* renamed from: d */
    public boolean f275375d;

    /* renamed from: e */
    public boolean f275376e;

    /* renamed from: f */
    private final C21370a f275377f;

    /* renamed from: g */
    private final C58833ax f275378g;

    /* renamed from: h */
    private final long f275379h;

    public C98596aa(C68214a aVar, C21370a aVar2, long j, C58833ax axVar, long j2, Integer num) {
        this.f275372a = aVar;
        this.f275377f = aVar2;
        this.f275373b = j;
        this.f275378g = axVar;
        this.f275379h = j2;
        C60497sb sbVar = (C60497sb) C60499sd.f163777j.createBuilder();
        this.f275374c = sbVar;
        if (num != null) {
            int intValue = num.intValue();
            sbVar.copyOnWrite();
            C60499sd sdVar = (C60499sd) sbVar.instance;
            sdVar.f163779a |= 1;
            sdVar.f163780b = intValue;
        }
    }

    /* renamed from: a */
    public final int mo91206a() {
        return (int) (this.f275377f.mo26874f() - this.f275373b);
    }

    /* renamed from: b */
    public final C89856f mo91207b(C89849ae aeVar, Long l) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        if (l != null) {
            long longValue = l.longValue();
            long f = this.f275377f.mo26874f();
            fVar.f246204d = TimeUnit.MILLISECONDS.toNanos((longValue - f) + this.f275377f.mo26871c());
        }
        return fVar;
    }

    /* renamed from: c */
    public final void mo91208c(C89849ae aeVar, Long l) {
        C89856f b = mo91207b(aeVar, l);
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C58833ax axVar = this.f275378g;
        if (axVar.mo56113h()) {
            long longValue = ((Long) axVar.mo56107c()).longValue();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160123d |= 65536;
            cbVar.f160085aW = longValue;
        }
        b.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f275372a.mo27525b()).mo74236a(b.mo83699a());
    }

    /* renamed from: d */
    public final void mo91209d(int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C60497sb sbVar = this.f275374c;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60499sd sdVar = (C60499sd) sbVar.build();
        sdVar.getClass();
        ufVar2.f164104aK = sdVar;
        ufVar2.f164250e |= 67108864;
        long j = this.f275379h;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164093a |= 16;
        ufVar3.f164261p = j;
        C58833ax axVar = this.f275378g;
        if (axVar.mo56113h()) {
            long longValue = ((Long) axVar.mo56107c()).longValue();
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164252g |= 268435456;
            ufVar4.f164192bt = longValue;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: e */
    public final void mo91210e(C60483ro roVar, int i) {
        if (((C60499sd) this.f275374c.instance).f163787i.size() < 100) {
            roVar.copyOnWrite();
            C60489ru ruVar = (C60489ru) roVar.instance;
            C60489ru ruVar2 = C60489ru.f163711h;
            ruVar.f163714b = i - 1;
            ruVar.f163713a |= 1;
            C60497sb sbVar = this.f275374c;
            sbVar.copyOnWrite();
            C60499sd sdVar = (C60499sd) sbVar.instance;
            C60489ru ruVar3 = (C60489ru) roVar.build();
            ruVar3.getClass();
            sdVar.mo57101a();
            sdVar.f163787i.add(ruVar3);
        }
    }

    /* renamed from: f */
    public final void mo91211f(int i, int i2) {
        C60497sb sbVar = this.f275374c;
        int i3 = ((C60499sd) sbVar.instance).f163779a;
        if ((i3 & 32) == 0 && (i3 & 4) != 0 && (i3 & 2) != 0) {
            sbVar.copyOnWrite();
            C60499sd sdVar = (C60499sd) sbVar.instance;
            sdVar.f163779a |= 16;
            sdVar.f163784f = i2;
            C60497sb sbVar2 = this.f275374c;
            sbVar2.copyOnWrite();
            C60499sd sdVar2 = (C60499sd) sbVar2.instance;
            sdVar2.f163785g = i - 1;
            sdVar2.f163779a |= 32;
            mo91209d(878);
        }
    }
}
