package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;

/* renamed from: com.google.android.libraries.gsa.c.a.n */
/* compiled from: PG */
final class C22262n implements C22868d {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f61512a;

    /* renamed from: b */
    final /* synthetic */ UploadDataSink f61513b;

    /* renamed from: c */
    final /* synthetic */ C22263o f61514c;

    public C22262n(C22263o oVar, ByteBuffer byteBuffer, UploadDataSink uploadDataSink) {
        this.f61514c = oVar;
        this.f61512a = byteBuffer;
        this.f61513b = uploadDataSink;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        this.f61513b.onReadError(new C90457d(th, (int) C89885b.CRONET_UPLOAD_GET_CHUNK_FAILED_VALUE));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C89051g gVar = (C89051g) obj;
        int i = gVar.f241330b;
        boolean z = true;
        if (i == 1) {
            int c = gVar.mo83022c(this.f61512a);
            if (gVar.mo83020a() > 0) {
                C58976aa aaVar = C58975e.f156826a;
                C22219ar arVar = this.f61514c.f61515a;
                if (gVar.f241330b != 1) {
                    z = false;
                }
                C58838bb.m90868c(z);
                if (gVar.mo83020a() != 0) {
                    synchronized (arVar.f61344a) {
                        if (arVar.f61346c) {
                            gVar.mo83024e();
                        } else {
                            arVar.f61345b.addFirst(C60856cj.m92900i(gVar));
                        }
                    }
                }
            } else {
                gVar.mo83024e();
            }
            this.f61514c.f61516b.mo27507b();
            this.f61514c.f61517c.mo82969m((long) c);
            this.f61513b.onReadSucceeded(false);
        } else if (i == 2) {
            this.f61513b.onReadError(gVar.mo83023d());
        } else if (i == 3) {
            this.f61514c.f61516b.mo27507b();
            this.f61513b.onReadSucceeded(true);
        } else {
            throw new AssertionError("Unexpected chunk type " + i);
        }
    }
}
