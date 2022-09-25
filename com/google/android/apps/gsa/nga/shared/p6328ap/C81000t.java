package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.C74685af;
import com.google.android.apps.gsa.nga.api.C74721by;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.t */
/* compiled from: PG */
public final class C81000t implements C74721by {

    /* renamed from: a */
    private static final C58974d f222022a = C58974d.m91136j();

    /* renamed from: b */
    private final C74685af f222023b;

    public C81000t(C74685af afVar) {
        this.f222023b = afVar;
    }

    /* renamed from: a */
    public final void mo71092a(Bundle bundle, int i) {
        try {
            this.f222023b.mo71049e(bundle, i);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222022a.mo56225c()).mo56382g(e)).mo56372aa(6554)).mo56384n();
        }
    }
}
