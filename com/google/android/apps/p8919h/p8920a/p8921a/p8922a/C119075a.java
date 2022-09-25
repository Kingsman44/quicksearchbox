package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119086k;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119111c;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8927e.C119122a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62948a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5285d.p5290b.p5291a.p5292a.C68169be;
import p5285d.p5290b.p5291a.p5292a.C68172bh;
import p5285d.p5290b.p5291a.p5292a.C68193f;
import p5285d.p5290b.p5291a.p5292a.C68201n;
import p5285d.p5290b.p5291a.p5292a.C68202o;

/* renamed from: com.google.android.apps.h.a.a.a.a */
/* compiled from: PG */
public abstract class C119075a implements C119096ae, C119093ab {

    /* renamed from: a */
    public final C119094ac f332166a;

    /* renamed from: b */
    protected final List f332167b = new ArrayList();

    /* renamed from: c */
    List f332168c;

    /* renamed from: d */
    boolean f332169d;

    /* renamed from: e */
    C63088z f332170e = null;

    /* renamed from: f */
    C119134p f332171f;

    /* renamed from: g */
    protected final ConcurrentHashMap f332172g = new ConcurrentHashMap();

    /* renamed from: h */
    C58833ax f332173h = C58836b.f156633a;

    /* renamed from: i */
    public C68202o f332174i;

    /* renamed from: j */
    String f332175j;

    public C119075a(C119094ac acVar) {
        C68201n nVar = (C68201n) C68202o.f184551c.createBuilder();
        int i = true != C119122a.f332260a ? 3 : 4;
        nVar.copyOnWrite();
        ((C68202o) nVar.instance).f184553a = i - 2;
        nVar.copyOnWrite();
        ((C68202o) nVar.instance).f184554b = 2;
        this.f332174i = (C68202o) nVar.build();
        this.f332175j = BuildConfig.FLAVOR;
        this.f332166a = acVar;
    }

    /* renamed from: a */
    public C60870cx mo104109a(C119103al alVar) {
        throw null;
    }

    /* renamed from: b */
    public final synchronized void mo104110b(C119095ad adVar) {
        this.f332166a.mo104174a(adVar);
        this.f332167b.add(adVar);
        mo104113e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo104111c(C119103al alVar, C68193f fVar) {
        Log.i("AbstractSpeakr", "Metadata arrived.");
        mo104119k(fVar.f184520f);
        String str = fVar.f184516b;
        this.f332170e = fVar.f184521g;
        this.f332173h = C58833ax.m90834k(fVar);
        C119094ac acVar = this.f332166a;
        acVar.f332210f.execute(new C119140v(acVar, alVar));
        for (C119095ad c : this.f332167b) {
            c.mo30715c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo104112d(Map map, int i) {
        C119094ac acVar = this.f332166a;
        acVar.f332210f.execute(new C119142x(acVar, map));
        this.f332172g.putAll(map);
        for (C119095ad j : this.f332167b) {
            ((C119086k) map.get(Integer.valueOf(i))).mo104140a().mo104130a().mo59031d();
            j.mo30722j();
        }
        if (this.f332171f != null) {
            for (Map.Entry entry : ((C58495hd) map).entrySet()) {
                C119134p pVar = this.f332171f;
                int intValue = ((Integer) entry.getKey()).intValue();
                long d = C62948a.m95453d(((C119086k) entry.getValue()).mo104140a().mo104131b());
                C58838bb.m90880o(intValue >= 0 && intValue < pVar.f332291a.length, "Paragraph index %s is outside range [%s-%s)", Integer.valueOf(intValue), 0, Integer.valueOf(pVar.f332291a.length));
                if (!pVar.f332295e.get(intValue)) {
                    double d2 = pVar.f332293c;
                    double d3 = (double) d;
                    Double.isNaN(d3);
                    pVar.f332293c = d2 + d3;
                    long j2 = pVar.f332294d;
                    C68169be beVar = ((C68172bh) pVar.f332292b.get(intValue)).f184476b;
                    if (beVar == null) {
                        beVar = C68169be.f184463c;
                    }
                    pVar.f332294d = j2 + ((long) beVar.f184466b);
                    pVar.f332291a[intValue] = (double) ((int) d);
                    pVar.f332295e.set(intValue);
                    for (int i2 = 0; i2 < pVar.f332291a.length; i2++) {
                        if (!pVar.f332295e.get(i2)) {
                            C68169be beVar2 = ((C68172bh) pVar.f332292b.get(i2)).f184476b;
                            if (beVar2 == null) {
                                beVar2 = C68169be.f184463c;
                            }
                            int i3 = beVar2.f184466b;
                            double[] dArr = pVar.f332291a;
                            double d4 = (double) ((long) i3);
                            double d5 = pVar.f332293c;
                            Double.isNaN(d4);
                            double d6 = d4 * d5;
                            double d7 = (double) pVar.f332294d;
                            Double.isNaN(d7);
                            dArr[i2] = d6 / d7;
                        }
                    }
                    continue;
                }
            }
        }
        int i4 = ((C58729pv) map).f156487c;
        Log.d("AbstractSpeakr", "onAudioUpdated: " + i4 + " audios");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo104113e() {
        if (mo104186r()) {
            for (C119095ad d : this.f332167b) {
                d.mo30716d();
            }
            this.f332166a.f332215k = this;
        }
    }

    /* renamed from: f */
    public final void mo104114f() {
        Log.d("AbstractSpeakr", "pause");
        C119094ac acVar = this.f332166a;
        acVar.f332210f.execute(new C119139u(acVar));
    }

    /* renamed from: g */
    public final synchronized void mo104115g(C119095ad adVar) {
        this.f332166a.mo104184k(adVar);
        this.f332167b.remove(adVar);
    }

    /* renamed from: h */
    public synchronized void mo104116h() {
        C119094ac acVar = this.f332166a;
        acVar.f332210f.execute(new C119092aa(acVar));
        this.f332171f = null;
        this.f332173h = C58836b.f156633a;
        this.f332172g.clear();
        this.f332168c = null;
    }

    /* renamed from: i */
    public final void mo104117i(boolean z) {
        Log.d("AbstractSpeakr", "resume");
        C119094ac acVar = this.f332166a;
        acVar.f332212h = z;
        acVar.f332210f.execute(new C119144z(acVar));
    }

    /* renamed from: j */
    public final void mo104118j(String str) {
        this.f332175j = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo104119k(List list) {
        List list2 = this.f332168c;
        if (list2 == null || !list2.equals(list)) {
            this.f332168c = list;
            synchronized (this) {
                this.f332171f = new C119134p(list);
                this.f332166a.f332210f.execute(new C119138t());
            }
            C119094ac acVar = this.f332166a;
            acVar.f332210f.execute(new C119143y(acVar, this.f332168c));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo104120l(C119111c cVar, int i) {
        for (C119095ad f : this.f332167b) {
            f.mo30718f(cVar, i);
        }
    }

    /* renamed from: m */
    public final void mo104121m() {
        C119094ac acVar = this.f332166a;
        acVar.f332210f.execute(new C119137s(acVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final synchronized void mo104122n() {
        Log.d("AbstractSpeakr", "notifyTextUpdated");
        for (C119095ad i : this.f332167b) {
            i.mo30721i();
        }
    }
}
