package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89010ah;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.protobuf.MessageLite;
import java.util.List;
import org.chromium.net.NetworkException;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.gsa.c.a.av */
/* compiled from: PG */
final class C22223av extends C70897l {

    /* renamed from: a */
    private final C70897l f61354a;

    /* renamed from: b */
    private final C89010ah f61355b;

    public C22223av(C70897l lVar, C89010ah ahVar) {
        this.f61354a = lVar;
        this.f61355b = ahVar;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        int i;
        C90457d dVar;
        if (!status.mo61679g()) {
            Throwable th = status.f186920q;
            if (th instanceof NetworkException) {
                NetworkException networkException = (NetworkException) th;
                i = networkException.getCronetInternalErrorCode() != 0 ? C22265q.m41638a(networkException.getCronetInternalErrorCode()) : C89885b.CRONET_GRPC_ERROR_OTHER_VALUE;
            } else {
                i = C90454b.m147152b(status.getCode());
            }
            if (th != null) {
                dVar = new C90457d(th, i);
            } else {
                dVar = new C90457d(i);
            }
            this.f61354a.mo27484b(status.mo61678e(dVar), deVar);
            this.f61355b.mo82966j(dVar);
            return;
        }
        this.f61354a.mo27484b(status, deVar);
        this.f61355b.mo82964h();
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
        this.f61355b.mo82971o(new C89022at(200, "grpc+unknown", C89010ah.m144716q(deVar), (List) null));
        this.f61354a.mo27485c(deVar);
    }

    /* renamed from: d */
    public final void mo27486d() {
        this.f61354a.mo27486d();
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        if (obj instanceof MessageLite) {
            this.f61355b.f241180e += (long) ((MessageLite) obj).getSerializedSize();
        }
        this.f61354a.mo27487i(obj);
    }
}
