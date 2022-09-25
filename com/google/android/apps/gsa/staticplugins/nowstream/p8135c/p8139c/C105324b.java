package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8139c;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.apps.gsa.sidekick.main.p7226r.C91602c;
import com.google.android.apps.gsa.sidekick.shared.util.WrappedExecutedUserAction;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C8142xb;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.c.b */
/* compiled from: PG */
public final class C105324b {

    /* renamed from: a */
    public boolean f293859a;

    /* renamed from: b */
    public boolean f293860b;

    /* renamed from: c */
    private final C21370a f293861c;

    /* renamed from: d */
    private final C91602c f293862d;

    /* renamed from: e */
    private final C8142xb f293863e;

    /* renamed from: f */
    private final String f293864f;

    /* renamed from: g */
    private final C105323a f293865g;

    /* renamed from: h */
    private C7708h f293866h;

    /* renamed from: i */
    private C7708h f293867i;

    /* renamed from: j */
    private boolean f293868j;

    /* renamed from: k */
    private final C105419b f293869k;

    public C105324b(C21370a aVar, C91602c cVar, C105419b bVar, C8142xb xbVar, String str) {
        this.f293861c = aVar;
        this.f293862d = cVar;
        this.f293869k = bVar;
        this.f293863e = xbVar;
        this.f293864f = str;
        C105323a aVar2 = new C105323a(this);
        this.f293865g = aVar2;
        bVar.mo94779a(aVar2);
    }

    /* renamed from: f */
    private final void m174964f(C7708h hVar, String str) {
        C7751ip ipVar = (C7751ip) C7752iq.f27124E.createBuilder();
        ipVar.copyOnWrite();
        C7752iq iqVar = (C7752iq) ipVar.instance;
        iqVar.f27133c = hVar;
        iqVar.f27132b = 1;
        long b = this.f293861c.mo26870b();
        ipVar.copyOnWrite();
        C7752iq iqVar2 = (C7752iq) ipVar.instance;
        iqVar2.f27131a |= 16;
        iqVar2.f27140j = b / 1000;
        int offset = TimeZone.getDefault().getOffset(b);
        ipVar.copyOnWrite();
        C7752iq iqVar3 = (C7752iq) ipVar.instance;
        iqVar3.f27131a |= 32;
        iqVar3.f27141k = (int) (((long) offset) / 1000);
        if (str != null) {
            ipVar.copyOnWrite();
            C7752iq iqVar4 = (C7752iq) ipVar.instance;
            iqVar4.f27131a |= 4194304;
            iqVar4.f27156z = str;
        }
        C8142xb xbVar = this.f293863e;
        ipVar.copyOnWrite();
        C7752iq iqVar5 = (C7752iq) ipVar.instance;
        iqVar5.f27127B = xbVar.f28649u;
        iqVar5.f27131a |= 1073741824;
        this.f293862d.mo85965a(C58485gu.m89846n(new WrappedExecutedUserAction((C7752iq) ipVar.build(), (C7709ha) null, false)));
    }

    /* renamed from: g */
    private final boolean m174965g() {
        return this.f293859a && !this.f293860b;
    }

    /* renamed from: a */
    public final void mo94718a() {
        if (this.f293868j && !m174965g()) {
            C7708h hVar = this.f293867i;
            if (hVar != null) {
                m174964f(hVar, (String) null);
            }
            this.f293868j = false;
        }
    }

    /* renamed from: b */
    public final void mo94719b() {
        C7708h hVar;
        if (m174965g() && !this.f293868j && (hVar = this.f293866h) != null) {
            m174964f(hVar, this.f293864f);
            this.f293868j = true;
        }
    }

    /* renamed from: c */
    public final void mo94720c() {
        this.f293869k.mo94781c(this.f293865g);
    }

    /* renamed from: d */
    public final void mo94721d(C91396h hVar) {
        if (hVar != null) {
            mo94722e(hVar.mo85711a().mo85719b());
        }
    }

    /* renamed from: e */
    public final void mo94722e(List list) {
        this.f293867i = null;
        this.f293866h = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7708h hVar = (C7708h) it.next();
            C7681g a = C7681g.m22802a(hVar.f26897b);
            if (a == null) {
                a = C7681g.INVALID;
            }
            if (a == C7681g.FOREGROUND_END) {
                this.f293867i = hVar;
            } else {
                C7681g a2 = C7681g.m22802a(hVar.f26897b);
                if (a2 == null) {
                    a2 = C7681g.INVALID;
                }
                if (a2 == C7681g.FOREGROUND_START) {
                    this.f293866h = hVar;
                }
            }
        }
        mo94719b();
    }
}
