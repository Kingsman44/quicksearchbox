package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89058n;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: com.google.android.libraries.gsa.c.a.o */
/* compiled from: PG */
final class C22263o extends UploadDataProvider {

    /* renamed from: a */
    C22219ar f61515a;

    /* renamed from: b */
    public final C22250bv f61516b;

    /* renamed from: c */
    public final C89058n f61517c;

    /* renamed from: d */
    private final boolean f61518d;

    /* renamed from: e */
    private final C22871g f61519e;

    public C22263o(C22219ar arVar, C22250bv bvVar, C89058n nVar, boolean z, C22871g gVar) {
        this.f61515a = arVar;
        this.f61516b = bvVar;
        this.f61517c = nVar;
        this.f61518d = z;
        this.f61519e = gVar;
    }

    public final long getLength() {
        return (long) this.f61515a.mo27471a();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        C22250bv bvVar = this.f61516b;
        bvVar.f61462k = false;
        bvVar.f61454c.mo82968l();
        C60870cx b = this.f61515a.mo27472b();
        if (!b.isDone()) {
            b = C90877ak.m148471e(b, 60, TimeUnit.SECONDS, this.f61519e);
        }
        this.f61519e.mo28211k(b, "Process upload chunk", new C22262n(this, byteBuffer, uploadDataSink));
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        if (!this.f61518d || !this.f61515a.mo27477f()) {
            uploadDataSink.onRewindError(new C90457d(C89885b.CRONET_CHUNKED_UPLOAD_REWIND_NOT_SUPPORTED_VALUE));
            return;
        }
        this.f61515a.mo27475d();
        this.f61515a = this.f61515a.mo27476e();
        uploadDataSink.onRewindSucceeded();
        C58976aa aaVar = C58975e.f156826a;
    }
}
