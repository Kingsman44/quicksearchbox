package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.p6968aa.C89058n;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.android.libraries.gsa.c.a.bo */
/* compiled from: PG */
public final class C22243bo implements C22249bu {

    /* renamed from: a */
    public static final C59071e f61429a = C59071e.m91332i("com.google.android.libraries.gsa.c.a.bo");

    /* renamed from: b */
    public final AtomicInteger f61430b = new AtomicInteger(1);

    /* renamed from: c */
    final C89020ar f61431c;

    /* renamed from: d */
    final C22219ar f61432d;

    /* renamed from: e */
    public final C89052h f61433e;

    /* renamed from: f */
    public final C89058n f61434f;

    /* renamed from: g */
    public final SettableFuture f61435g;

    /* renamed from: h */
    public final UrlRequest.Callback f61436h;

    /* renamed from: i */
    public final C22250bv f61437i;

    /* renamed from: j */
    public C22264p f61438j;

    /* renamed from: k */
    public UrlRequest f61439k;

    /* renamed from: l */
    public ByteBuffer f61440l;

    public C22243bo(C89020ar arVar, C22219ar arVar2, C89052h hVar, C89058n nVar, C22250bv bvVar) {
        this.f61431c = arVar;
        this.f61432d = arVar2;
        this.f61433e = hVar;
        this.f61434f = nVar;
        this.f61435g = new SettableFuture();
        this.f61436h = new C22242bn(this);
        this.f61437i = bvVar;
    }

    /* renamed from: a */
    public static C89022at m41599a(UrlResponseInfo urlResponseInfo) {
        return new C89022at(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getNegotiatedProtocol(), C89022at.m144767b(urlResponseInfo.getAllHeaders()), (List) null);
    }

    /* renamed from: b */
    public final void mo27503b(int i, Throwable th) {
        int andSet = this.f61430b.getAndSet(3);
        if (andSet != 3) {
            C90457d dVar = th != null ? new C90457d(th, i) : new C90457d(i);
            if (andSet == 1) {
                mo27504c(this.f61435g.mo57357o(dVar), "Unexpectedly unable to set the response data future.");
            }
            this.f61432d.mo27475d();
            this.f61438j.mo27521g(new C89051g(dVar));
            this.f61437i.f61463l = true;
            UrlRequest urlRequest = this.f61439k;
            urlRequest.getClass();
            urlRequest.cancel();
            this.f61434f.mo82966j(dVar);
        }
    }

    /* renamed from: c */
    public final void mo27504c(boolean z, String str) {
        if (!z) {
            IllegalStateException illegalStateException = new IllegalStateException(str);
            mo27503b(C89885b.CRONET_LISTENER_UNEXPECTED_STATE_VALUE, illegalStateException);
            ((C59052c) ((C59052c) ((C59052c) f61429a.mo56225c()).mo56382g(illegalStateException)).mo56372aa(48503)).mo56386p("Unexpected state");
        }
    }
}
