package com.google.android.libraries.lens.sdk.p2045c;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.libraries.lens.sdk.p2047d.C24936f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.sdk.c.a */
/* compiled from: PG */
public final class C24914a {

    /* renamed from: e */
    private static final C59071e f68025e = C59071e.m91332i("com.google.android.libraries.lens.sdk.c.a");

    /* renamed from: a */
    public final int f68026a;

    /* renamed from: b */
    public final String f68027b;

    /* renamed from: c */
    public final List f68028c = new ArrayList();

    /* renamed from: d */
    public final List f68029d = new ArrayList();

    /* renamed from: f */
    private final C24936f f68030f;

    public C24914a(int i, String str, C24936f fVar) {
        this.f68026a = i;
        this.f68027b = str;
        this.f68030f = fVar;
    }

    /* renamed from: a */
    public final void mo30134a(Bundle bundle) {
        if (this.f68030f == null) {
            C59104x d = f68025e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AttachedClient");
            ((C59052c) ((C59052c) d).mo56372aa(48946)).mo56389s("No callback, failed to send reply to %s", this.f68027b);
            return;
        }
        try {
            C59104x b = f68025e.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AttachedClient");
            ((C59052c) ((C59052c) b).mo56372aa(48944)).mo56389s("Send reply to %s", this.f68027b);
            this.f68030f.mo30040c(bundle);
        } catch (RemoteException e) {
            C59104x d2 = f68025e.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AttachedClient");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(48945)).mo56389s("Failed to send reply to %s", this.f68027b);
        }
    }

    /* renamed from: b */
    public final boolean mo30135b(String str) {
        return this.f68028c.contains(str);
    }
}
