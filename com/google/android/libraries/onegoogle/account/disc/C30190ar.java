package com.google.android.libraries.onegoogle.account.disc;

import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.ar */
/* compiled from: PG */
public final class C30190ar implements C30180ah {

    /* renamed from: a */
    public final C58485gu f81630a;

    /* renamed from: b */
    private final C30178af f81631b = new C30178af();

    /* renamed from: c */
    private boolean f81632c;

    /* renamed from: d */
    private Object f81633d;

    public C30190ar(C58485gu guVar, C2391v vVar) {
        this.f81630a = guVar;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C30176ad) guVar.get(i2)).f81607a.mo5704e(vVar, new C30189aq(this));
        }
        mo35644b();
    }

    /* renamed from: a */
    public final C30178af mo35633a(Object obj) {
        if (obj != this.f81633d) {
            C19559g.m37304c();
            this.f81633d = obj;
            this.f81632c = true;
            C58485gu guVar = this.f81630a;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                ((C30176ad) guVar.get(i2)).mo35628b(obj);
            }
            this.f81632c = false;
            mo35644b();
        }
        return this.f81631b;
    }

    /* renamed from: b */
    public final void mo35644b() {
        C19559g.m37304c();
        if (!this.f81632c) {
            C58833ax axVar = C58836b.f156633a;
            C58485gu guVar = this.f81630a;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C58833ax axVar2 = (C58833ax) ((C30176ad) guVar.get(i2)).f81607a.mo3842a();
                if (axVar2 != null && axVar2.mo56113h() && (!axVar.mo56113h() || ((C30175ac) axVar2.mo56107c()).compareTo((C30175ac) axVar.mo56107c()) > 0)) {
                    axVar = axVar2;
                }
            }
            if (axVar.mo56113h()) {
                this.f81631b.mo35629a((C30175ac) axVar.mo56107c());
                return;
            }
            this.f81631b.mo35629a((C30175ac) null);
        }
    }
}
