package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.filters.translation.C26119db;
import com.google.android.libraries.lens.view.session.C27768bd;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.lens.view.main.at */
/* compiled from: PG */
public final /* synthetic */ class C27303at implements C26119db {

    /* renamed from: a */
    public final /* synthetic */ C27327bq f74716a;

    public /* synthetic */ C27303at(C27327bq bqVar) {
        this.f74716a = bqVar;
    }

    /* renamed from: a */
    public final void mo31311a(boolean z) {
        C27327bq bqVar = this.f74716a;
        if (!bqVar.f74765K) {
            ((C59052c) ((C59052c) C27327bq.f74753a.mo56225c()).mo56372aa(49738)).mo56386p("Ignoring toggling partial translate while inactive");
        } else if (bqVar.f74770P.mo30525b()) {
            bqVar.f74816u.mo32843t(C27768bd.m51651a(true, C24231w.FILTER_SWITCH), C58836b.f156633a);
        }
    }
}
