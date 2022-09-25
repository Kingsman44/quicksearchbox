package com.google.android.apps.gsa.searchbox.p6944c.p6945a;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4552o.C59586amp;
import com.google.common.p4552o.amq;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.gsa.searchbox.c.a.a */
/* compiled from: PG */
public final class C88541a extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    private C89205j f239299a;

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: f */
    public final void mo44231f(amt amt) {
        C59586amp amp;
        if (this.f239299a != null) {
            apd apd = (apd) amt.instance;
            if ((apd.f159611c & 32) != 0) {
                amq amq = apd.f159591ah;
                if (amq == null) {
                    amq = amq.f159235g;
                }
                amp = (C59586amp) amq.toBuilder();
            } else {
                amp = (C59586amp) amq.f159235g.createBuilder();
            }
            int a = this.f239299a.mo83161a("ACTION_REQUEST_FAILED_COUNT");
            if (a > 0) {
                amp.copyOnWrite();
                amq amq2 = (amq) amp.instance;
                amq2.f159237a |= 1;
                amq2.f159238b = a;
            }
            int a2 = this.f239299a.mo83161a("ACTION_RESULT_NOT_RELEVANT_COUNT");
            if (a2 > 0) {
                amp.copyOnWrite();
                amq amq3 = (amq) amp.instance;
                amq3.f159237a |= 2;
                amq3.f159239c = a2;
            }
            int a3 = this.f239299a.mo83161a("ACTION_REQUEST_COUNT");
            if (a3 != 0) {
                int b = ((int) this.f239299a.mo83162b("ACTION_AGGREGATED_REQUEST_TIME_MSEC")) / a3;
                amp.copyOnWrite();
                amq amq4 = (amq) amp.instance;
                amq4.f159237a |= 8;
                amq4.f159241e = b;
            }
            amt.copyOnWrite();
            apd apd2 = (apd) amt.instance;
            amq amq5 = (amq) amp.build();
            amq5.getClass();
            apd2.f159591ah = amq5;
            apd2.f159611c |= 32;
        }
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239299a = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        C89205j jVar = this.f239299a;
        if (jVar != null) {
            jVar.mo83171k("ACTION_REQUEST_COUNT", 0);
            this.f239299a.mo83171k("ACTION_REQUEST_FAILED_COUNT", 0);
            this.f239299a.mo83171k("ACTION_RESULT_NOT_RELEVANT_COUNT", 0);
            this.f239299a.mo83173m("ACTION_AGGREGATED_REQUEST_TIME_MSEC", 0);
        }
    }
}
