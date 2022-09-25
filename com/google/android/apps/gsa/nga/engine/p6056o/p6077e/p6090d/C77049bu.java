package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bu */
/* compiled from: PG */
public final /* synthetic */ class C77049bu implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C77140u f212659a;

    /* renamed from: b */
    public final /* synthetic */ df f212660b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f212661c;

    public /* synthetic */ C77049bu(C77140u uVar, df dfVar, C58485gu guVar) {
        this.f212659a = uVar;
        this.f212660b = dfVar;
        this.f212661c = guVar;
    }

    public final void accept(Object obj) {
        ((C83216f) obj).mo76648a(this.f212659a.mo72412h(), C82835ce.MESSENGER_CANT_CONTACT_CONTACT_ID, new C77030bb(this.f212660b, this.f212661c));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
