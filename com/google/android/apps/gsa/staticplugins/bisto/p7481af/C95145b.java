package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Intent;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.b */
/* compiled from: PG */
public final /* synthetic */ class C95145b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266217a;

    /* renamed from: b */
    public final /* synthetic */ Intent f266218b;

    /* renamed from: c */
    public final /* synthetic */ boolean f266219c;

    public /* synthetic */ C95145b(C95144aj ajVar, Intent intent, boolean z) {
        this.f266217a = ajVar;
        this.f266218b = intent;
        this.f266219c = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C95144aj ajVar = this.f266217a;
        Intent intent = this.f266218b;
        boolean z = this.f266219c;
        String action = intent.getAction();
        if ("local_conn".equals(action)) {
            ajVar.mo89070v(intent);
            return C118826c.f331423b;
        } else if (!C89681t.m146043i(ajVar.f266197c, ajVar.f266198f, z)) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        } else if (!ajVar.mo89062C()) {
            return C2169h.m6027a(new C95151h(ajVar, action, intent));
        } else {
            ajVar.mo89070v(intent);
            return C118826c.f331423b;
        }
    }
}
