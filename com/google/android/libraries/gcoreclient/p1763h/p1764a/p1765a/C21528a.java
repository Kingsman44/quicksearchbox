package com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143848t;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21527a;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21532b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21548e;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21549f;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21533a;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21536d;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21537e;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.gcoreclient.h.a.a.a */
/* compiled from: PG */
public abstract class C21528a implements C21547d {

    /* renamed from: a */
    public final C143848t f59930a;

    /* renamed from: b */
    final C21544l f59931b;

    public C21528a(Context context) {
        C21544l lVar = new C21544l();
        this.f59930a = new C143848t(context);
        this.f59931b = lVar;
    }

    /* renamed from: a */
    public final void mo26980a(C21532b bVar) {
        this.f59930a.mo119296c(C21544l.m40654a(bVar));
    }

    /* renamed from: b */
    public final void mo26981b(C21532b bVar, C21527a aVar) {
        C143848t tVar = this.f59930a;
        C143841m a = C21544l.m40654a(bVar);
        C143721f a2 = aVar instanceof C21533a ? ((C21533a) aVar).mo26938a() : null;
        C143919bh.m233971n(a, "Api must not be null");
        C143919bh.m233971n(a2, "Null options are not permitted for this Api");
        tVar.f389938d.put(a, a2);
        C143919bh.m233971n(a.f389916a, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        tVar.f389937c.addAll(emptyList);
        tVar.f389936b.addAll(emptyList);
    }

    /* renamed from: c */
    public final void mo26982c(C21548e eVar) {
        C143849u uVar;
        C143848t tVar = this.f59930a;
        C21544l lVar = this.f59931b;
        synchronized (lVar.f59936a) {
            if (lVar.f59937b.containsKey(eVar)) {
                uVar = (C143849u) lVar.f59937b.get(eVar);
            } else {
                C21536d dVar = new C21536d(eVar);
                lVar.f59937b.put(eVar, dVar);
                uVar = dVar;
            }
        }
        tVar.mo119297d(uVar);
    }

    /* renamed from: d */
    public final void mo26983d(C21549f fVar) {
        C143850v vVar;
        C143848t tVar = this.f59930a;
        C21544l lVar = this.f59931b;
        synchronized (lVar.f59936a) {
            if (lVar.f59938c.containsKey(fVar)) {
                vVar = (C143850v) lVar.f59938c.get(fVar);
            } else {
                C21537e eVar = new C21537e(fVar);
                lVar.f59938c.put(fVar, eVar);
                vVar = eVar;
            }
        }
        tVar.mo119298e(vVar);
    }

    /* renamed from: e */
    public void mo26984e(Account account) {
        throw null;
    }

    /* renamed from: f */
    public final void mo26985f(String str) {
        this.f59930a.mo119299f(str);
    }

    /* renamed from: g */
    public final void mo26986g(Handler handler) {
        this.f59930a.f389939e = handler.getLooper();
    }
}
