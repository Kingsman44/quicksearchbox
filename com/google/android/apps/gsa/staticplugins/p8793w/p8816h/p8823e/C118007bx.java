package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.staticplugins.p8793w.p8794a.C117686ah;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.bx */
/* compiled from: PG */
public final /* synthetic */ class C118007bx implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C118024cn f327510a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f327511b;

    public /* synthetic */ C118007bx(C118024cn cnVar, C58833ax axVar) {
        this.f327510a = cnVar;
        this.f327511b = axVar;
    }

    public final C60870cx apply(Object obj) {
        C118024cn cnVar = this.f327510a;
        C58833ax axVar = this.f327511b;
        if (((Boolean) obj).booleanValue() || cnVar.f327545d.mo79746e(C90086ek.f250508f)) {
            return (C60870cx) ((C74458k) axVar.mo56107c()).mo70775b().mo56107c();
        }
        return C60856cj.m92899h(new C117686ah("No Test Drive audio recording is allowed at this time."));
    }
}
