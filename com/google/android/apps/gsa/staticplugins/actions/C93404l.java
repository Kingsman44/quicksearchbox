package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.contacts.cl;
import com.google.android.apps.gsa.contacts.m;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87756ck;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.l */
/* compiled from: PG */
final class C93404l extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C87456t f260508a;

    /* renamed from: b */
    final /* synthetic */ C87756ck f260509b;

    /* renamed from: c */
    final /* synthetic */ C93421q f260510c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93404l(C93421q qVar, C87456t tVar, C87756ck ckVar) {
        super("Select person from contact picker", 1, 16);
        this.f260510c = qVar;
        this.f260508a = tVar;
        this.f260509b = ckVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        long j = this.f260509b.f237516b;
        C87456t tVar = this.f260508a;
        C58495hd hdVar = tVar.f236223d;
        return ((m) this.f260510c.f260579g.mo27525b()).a(j, cl.d(hdVar), tVar.f236222c);
    }
}
