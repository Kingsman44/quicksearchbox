package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89004ab;
import com.google.android.apps.gsa.shared.p6968aa.C89040bk;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.android.libraries.gsa.c.a.p */
/* compiled from: PG */
public final class C22264p extends C89004ab {

    /* renamed from: a */
    public final Object f61520a = new Object();

    /* renamed from: b */
    public final C89040bk f61521b;

    /* renamed from: c */
    public final C89052h f61522c;

    /* renamed from: d */
    public boolean f61523d;

    /* renamed from: e */
    public boolean f61524e;

    /* renamed from: f */
    public boolean f61525f;

    /* renamed from: g */
    private final C22243bo f61526g;

    public C22264p(C89052h hVar, C22243bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f61521b = new C89040bk(hVar);
        this.f61522c = hVar;
        this.f61526g = boVar;
    }

    /* renamed from: a */
    public final int mo27471a() {
        return -1;
    }

    /* renamed from: b */
    public final C60870cx mo27472b() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx b = this.f61521b.mo27472b();
        mo27520c();
        return b;
    }

    /* renamed from: c */
    public final void mo27520c() {
        boolean z;
        int size;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f61520a) {
            if (!this.f61524e && !this.f61525f && this.f61523d) {
                C89040bk bkVar = this.f61521b;
                synchronized (bkVar.f241311a) {
                    if (!bkVar.f241312b.isEmpty()) {
                        if (bkVar.mo83010h()) {
                            z = false;
                            C58838bb.m90883r(z);
                            size = bkVar.f241313c.size() - bkVar.f241312b.size();
                            ByteBuffer byteBuffer = bkVar.f241314d;
                            if (byteBuffer != null && byteBuffer.position() > 0) {
                                size++;
                            }
                        }
                    }
                    z = true;
                    C58838bb.m90883r(z);
                    size = bkVar.f241313c.size() - bkVar.f241312b.size();
                    ByteBuffer byteBuffer2 = bkVar.f241314d;
                    size++;
                }
                if (size <= 0) {
                    C22243bo boVar = this.f61526g;
                    ByteBuffer b = this.f61522c.mo83029b();
                    int i = boVar.f61430b.get();
                    if (i == 2) {
                        C22250bv bvVar = boVar.f61437i;
                        bvVar.f61454c.mo82968l();
                        bvVar.f61462k = true;
                        boVar.f61440l = b;
                        UrlRequest urlRequest = boVar.f61439k;
                        urlRequest.getClass();
                        urlRequest.read(b);
                    } else {
                        ((C59052c) ((C59052c) C22243bo.f61429a.mo56226d()).mo56372aa(48498)).mo56387q("Did not request read due to an unexpected state: %d", i);
                        boVar.f61433e.mo83031e(b);
                    }
                    this.f61523d = false;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo27475d() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f61520a) {
            if (!this.f61524e) {
                this.f61521b.mo27475d();
                this.f61524e = true;
                this.f61526g.mo27503b(C89885b.HTTP_DATA_SOURCE_ABORTED_VALUE, (Throwable) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo27521g(C89051g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90868c(gVar.f241330b != 1);
        synchronized (this.f61520a) {
            if (!this.f61524e) {
                C58838bb.m90883r(!this.f61525f);
                this.f61525f = true;
                this.f61521b.mo83008c(gVar);
            }
        }
    }
}
