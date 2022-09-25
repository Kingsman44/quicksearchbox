package com.google.android.apps.gsa.nga.engine.recognition.p6119h.p6120a;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6301a.C80545c;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b;
import com.google.android.apps.gsa.shared.proto.p7126io.LargeProtoParcelable;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.h.a.a */
/* compiled from: PG */
public final class C77652a {

    /* renamed from: a */
    public static final C58974d f213878a = C58974d.m91136j();

    /* renamed from: b */
    public final C79853ak f213879b;

    /* renamed from: c */
    public final AtomicReference f213880c = new AtomicReference();

    public C77652a(C79853ak akVar) {
        this.f213879b = akVar;
    }

    /* renamed from: a */
    public static void m124625a(C80545c cVar, C80547b bVar) {
        try {
            cVar.mo74347e(new LargeProtoParcelable((MessageLite) bVar));
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f213878a.mo56225c()).mo56382g(e)).mo56372aa(4343)).mo56386p("Failed to send recording to remote callback.");
        }
    }
}
