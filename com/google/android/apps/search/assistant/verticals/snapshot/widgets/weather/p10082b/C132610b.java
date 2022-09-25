package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132641h;
import com.google.android.libraries.p10908a.p10911c.p10913b.C146635k;
import com.google.android.libraries.p10908a.p10911c.p10913b.C146641q;
import com.google.android.libraries.p10908a.p10911c.p10913b.C146642r;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3994s.p3995a.C53256hd;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.protos.p4816ai.p4820d.p4821a.C63213e;
import com.google.protos.p4816ai.p4820d.p4821a.C63216h;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.b.b */
/* compiled from: PG */
public final class C132610b {

    /* renamed from: a */
    public static final Duration f361907a = Duration.ofSeconds(2);

    /* renamed from: c */
    private static final C58495hd f361908c;

    /* renamed from: b */
    public final C39141kp f361909b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C53258hf.WIDGET_TYPE_SQUARE, C146642r.WEATHER.f396086N);
        gzVar.mo55429h(C53258hf.WIDGET_TYPE_FREEFORM, C146642r.WEATHER_FREEFORM.f396086N);
        f361908c = gzVar.mo55427f(false);
    }

    public C132610b(C39141kp kpVar) {
        this.f361909b = kpVar;
    }

    /* renamed from: a */
    public final void mo110834a(C53258hf hfVar) {
        C39141kp kpVar = this.f361909b;
        ((C19567d) kpVar.f103011dj.mo6453a()).mo24822a(1, hfVar.name());
    }

    /* renamed from: b */
    public final void mo110835b(int i, C53258hf hfVar) {
        C39141kp kpVar = this.f361909b;
        ((C19567d) kpVar.f103007df.mo6453a()).mo24822a((long) i, hfVar.name());
    }

    /* renamed from: c */
    public final void mo110836c(Context context, C53258hf hfVar, int i) {
        ((C19567d) this.f361909b.f103006de.mo6453a()).mo24822a(1, hfVar.name(), C132609a.m215586a(i));
        C146641q a = C146635k.f396028a.mo123421a(context);
        C63213e eVar = (C63213e) C63216h.f170786f.createBuilder();
        eVar.copyOnWrite();
        C63216h hVar = (C63216h) eVar.instance;
        hVar.f170789b = 1;
        hVar.f170788a = 1 | hVar.f170788a;
        eVar.copyOnWrite();
        C63216h hVar2 = (C63216h) eVar.instance;
        hVar2.f170788a |= 4;
        hVar2.f170791d = "bg";
        String str = (String) f361908c.getOrDefault(hfVar, "unknown");
        eVar.copyOnWrite();
        C63216h hVar3 = (C63216h) eVar.instance;
        str.getClass();
        hVar3.f170788a |= 2;
        hVar3.f170790c = str;
        a.mo123422a((C63216h) eVar.build());
    }

    /* renamed from: d */
    public final void mo110837d(int i) {
        ((C19567d) this.f361909b.f103010di.mo6453a()).mo24822a(1, C132641h.m215615a(i));
    }

    /* renamed from: e */
    public final void mo110838e(int i, int i2) {
        C39141kp kpVar = this.f361909b;
        String a = C53256hd.m86796a(i);
        if (i != 0) {
            ((C19567d) kpVar.f103008dg.mo6453a()).mo24822a(1, a, C132609a.m215586a(i2));
            return;
        }
        throw null;
    }
}
