package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.C74704bd;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80963a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.r */
/* compiled from: PG */
public final class C80998r implements Consumer {

    /* renamed from: a */
    private static final C58974d f222020a = C58974d.m91136j();

    /* renamed from: b */
    private final C74704bd f222021b;

    public C80998r(C74704bd bdVar) {
        this.f222021b = bdVar;
    }

    /* renamed from: a */
    public final void accept(C80963a aVar) {
        try {
            this.f222021b.mo71059e(new C80989i(aVar));
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222020a.mo56226d()).mo56382g(e)).mo56372aa(6553)).mo56389s("Unable to create remote delegate %s", e);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
