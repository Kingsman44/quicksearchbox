package com.google.android.libraries.assistant.p1467d;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.apps.search.assistant.platform.appintegration.p8990b.C119515a;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.assistant.p1467d.p1468a.p1469a.p1470a.C17813b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17846i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.d.p */
/* compiled from: PG */
public final class C17938p implements C119515a {

    /* renamed from: a */
    public static final C59071e f51384a = C59071e.m91332i("com.google.android.libraries.assistant.d.p");

    /* renamed from: b */
    public final Context f51385b;

    /* renamed from: c */
    protected final C17813b f51386c;

    /* renamed from: d */
    public final C17934l f51387d;

    /* renamed from: e */
    public C17846i f51388e;

    /* renamed from: f */
    public final C143701ac f51389f;

    /* renamed from: g */
    private final C17937o f51390g = new C17937o(this);

    public C17938p(Context context, C17813b bVar, C17934l lVar, C143701ac acVar) {
        this.f51385b = context;
        this.f51387d = lVar;
        this.f51389f = acVar;
        this.f51386c = bVar;
    }

    /* renamed from: a */
    public final void mo23492a(C17881ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f51390g.f51382a != 3 || !mo23493b()) {
            throw new RemoteException("Maestro service not connected yet");
        }
        this.f51388e.mo23480a(akVar.toByteArray());
    }

    /* renamed from: b */
    public final boolean mo23493b() {
        return this.f51388e != null;
    }
}
