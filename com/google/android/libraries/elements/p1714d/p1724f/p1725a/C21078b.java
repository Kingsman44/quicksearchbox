package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import com.google.android.libraries.elements.C20697c;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ByteStoreConfig;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.elements.d.f.a.b */
/* compiled from: PG */
public final /* synthetic */ class C21078b implements C58881cr {

    /* renamed from: a */
    public static final /* synthetic */ C21078b f59086a = new C21078b();

    private /* synthetic */ C21078b() {
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C20697c.m38871a();
        ByteStore create = ByteStore.create(new ByteStoreConfig());
        if (create != null) {
            return create;
        }
        throw new C21260bc("Error creating Elements ByteStore.");
    }
}
