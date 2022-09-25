package com.google.android.apps.gsa.searchbox.p6960ui.p6961a;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4552o.C59586amp;
import com.google.common.p4552o.amq;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.a.b */
/* compiled from: PG */
public final class C88693b extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    public C89205j f239809a;

    /* renamed from: a */
    public final void mo82395a(int i) {
        C89205j jVar = this.f239809a;
        if (jVar != null) {
            jVar.mo83173m("ACTION_AGGREGATED_RENDERING_TIME_MSEC", ((long) i) + jVar.mo83162b("ACTION_AGGREGATED_RENDERING_TIME_MSEC"));
            this.f239809a.mo83169i("ACTION_RENDERED_COUNT");
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: f */
    public final void mo44231f(amt amt) {
        if (this.f239809a != null) {
            amq amq = ((apd) amt.instance).f159591ah;
            if (amq == null) {
                amq = amq.f159235g;
            }
            C59586amp amp = (C59586amp) amq.toBuilder();
            int a = this.f239809a.mo83161a("ACTION_RESULT_NOT_RENDERED_COUNT");
            if (a > 0) {
                amp.copyOnWrite();
                amq amq2 = (amq) amp.instance;
                amq2.f159237a |= 4;
                amq2.f159240d = a;
            }
            int a2 = this.f239809a.mo83161a("ACTION_RENDERED_COUNT");
            if (a2 > 0) {
                int b = ((int) this.f239809a.mo83162b("ACTION_AGGREGATED_RENDERING_TIME_MSEC")) / a2;
                amp.copyOnWrite();
                amq amq3 = (amq) amp.instance;
                amq3.f159237a |= 16;
                amq3.f159242f = b;
            }
            amt.copyOnWrite();
            apd apd = (apd) amt.instance;
            amq amq4 = (amq) amp.build();
            amq4.getClass();
            apd.f159591ah = amq4;
            apd.f159611c |= 32;
        }
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239809a = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        C89205j jVar = this.f239809a;
        if (jVar != null) {
            jVar.mo83171k("ACTION_RENDERED_COUNT", 0);
            this.f239809a.mo83171k("ACTION_RESULT_NOT_RENDERED_COUNT", 0);
            this.f239809a.mo83173m("ACTION_AGGREGATED_RENDERING_TIME_MSEC", 0);
        }
    }
}
