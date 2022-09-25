package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.fq */
/* compiled from: PG */
final class C109047fq implements C91096f {

    /* renamed from: a */
    final /* synthetic */ C109065gb f303597a;

    public C109047fq(C109065gb gbVar) {
        this.f303597a = gbVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        ((C59052c) ((C59052c) C109065gb.f303614a.mo56224b()).mo56372aa(22715)).mo56387q("Result returned from onboarding sequence %d", i);
        if (i != -1) {
            return true;
        }
        this.f303597a.f303628b.finish();
        return true;
    }
}
