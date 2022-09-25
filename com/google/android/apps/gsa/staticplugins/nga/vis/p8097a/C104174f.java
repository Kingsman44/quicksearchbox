package com.google.android.apps.gsa.staticplugins.nga.vis.p8097a;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.C74734n;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.a.f */
/* compiled from: PG */
public final /* synthetic */ class C104174f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C104176h f289777a;

    /* renamed from: b */
    public final /* synthetic */ C80833al f289778b;

    public /* synthetic */ C104174f(C104176h hVar, C80833al alVar) {
        this.f289777a = hVar;
        this.f289778b = alVar;
    }

    public final void run() {
        C104176h hVar = this.f289777a;
        C80833al alVar = this.f289778b;
        C74734n nVar = hVar.f289780b;
        if (nVar != null) {
            try {
                nVar.mo71116e(new ProtoLiteParcelable((MessageLite) alVar));
            } catch (RemoteException e) {
                hVar.f289780b = null;
                ((C58970a) ((C58970a) ((C58970a) C104176h.f289779a.mo56225c()).mo56382g(e)).mo56372aa(21902)).mo56386p("Failed to send message to remote callback.");
            }
        }
    }
}
