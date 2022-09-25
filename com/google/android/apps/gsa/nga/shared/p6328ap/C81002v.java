package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.C74688ai;
import com.google.android.apps.gsa.nga.api.C74721by;
import com.google.android.apps.gsa.nga.api.C74722bz;
import com.google.android.apps.gsa.nga.api.C74726cf;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.v */
/* compiled from: PG */
public final class C81002v implements C74722bz {

    /* renamed from: a */
    private static final C58974d f222025a = C58974d.m91136j();

    /* renamed from: b */
    private final C74688ai f222026b;

    public C81002v(C74688ai aiVar) {
        this.f222026b = aiVar;
    }

    /* renamed from: a */
    public final C74721by mo71093a(Context context, C74726cf cfVar) {
        try {
            return new C81000t(this.f222026b.mo71050e(new C80995o(cfVar)));
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222025a.mo56225c()).mo56382g(e)).mo56372aa(6555)).mo56384n();
            return C81001u.f222024a;
        }
    }
}
