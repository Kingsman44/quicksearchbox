package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.android.libraries.gsa.c.a.bn */
/* compiled from: PG */
final class C22242bn extends UrlRequest.Callback {

    /* renamed from: a */
    final /* synthetic */ C22243bo f61428a;

    public C22242bn(C22243bo boVar) {
        this.f61428a = boVar;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        C22243bo boVar = this.f61428a;
        boVar.mo27504c(boVar.f61430b.get() == 3, "Unexpected onCancelled() call.");
        C22243bo boVar2 = this.f61428a;
        ByteBuffer byteBuffer = boVar2.f61440l;
        if (byteBuffer != null) {
            boVar2.f61433e.mo83030c(byteBuffer);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFailed(org.chromium.net.UrlRequest r5, org.chromium.net.UrlResponseInfo r6, org.chromium.net.CronetException r7) {
        /*
            r4 = this;
            com.google.android.libraries.gsa.c.a.bo r5 = r4.f61428a
            if (r7 == 0) goto L_0x0006
            r6 = 1
            goto L_0x0007
        L_0x0006:
            r6 = 0
        L_0x0007:
            java.lang.String r0 = "Failure without an exception."
            r5.mo27504c(r6, r0)
            boolean r5 = r7 instanceof org.chromium.net.NetworkException
            if (r5 == 0) goto L_0x0071
            r5 = r7
            org.chromium.net.NetworkException r5 = (org.chromium.net.NetworkException) r5
            int r6 = r5.getCronetInternalErrorCode()
            if (r6 == 0) goto L_0x0071
            int r5 = r5.getCronetInternalErrorCode()
            int r5 = com.google.android.libraries.gsa.p1833c.p1834a.C22265q.m41638a(r5)
            boolean r6 = r7 instanceof org.chromium.net.QuicException
            if (r6 == 0) goto L_0x0084
            r6 = r7
            org.chromium.net.QuicException r6 = (org.chromium.net.QuicException) r6
            int r6 = r6.getQuicDetailedErrorCode()
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d
            java.lang.String r1 = "CronetEngineProvider"
            if (r6 != 0) goto L_0x0049
            com.google.common.f.e r6 = com.google.android.libraries.gsa.p1833c.p1834a.C22266r.f61527a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r2, r1)
            java.lang.String r1 = "Error code for a QUIC protocol, no error provided."
            r2 = 48449(0xbd41, float:6.7892E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r2)).mo56386p(r1)
            r6 = 656398(0xa040e, float:9.1981E-40)
            goto L_0x006c
        L_0x0049:
            r2 = 670000(0xa3930, float:9.3887E-40)
            int r6 = r6 + r2
            if (r6 <= r2) goto L_0x0054
            r2 = 672000(0xa4100, float:9.41673E-40)
            if (r6 < r2) goto L_0x006c
        L_0x0054:
            com.google.common.f.e r2 = com.google.android.libraries.gsa.p1833c.p1834a.C22266r.f61527a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r1)
            java.lang.String r1 = "Error code for a QUIC protocol error out of range: %d"
            r3 = 48448(0xbd40, float:6.789E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r3)).mo56387q(r1, r6)
            int r6 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            r6 = 656397(0xa040d, float:9.19808E-40)
        L_0x006c:
            r0.<init>((java.lang.Throwable) r7, (int) r6)
            r7 = r0
            goto L_0x0084
        L_0x0071:
            java.lang.Throwable r5 = r7.getCause()
            boolean r5 = r5 instanceof com.google.android.apps.gsa.shared.p7127q.C90457d
            if (r5 == 0) goto L_0x0081
            java.lang.Throwable r7 = r7.getCause()
            r5 = 656391(0xa0407, float:9.198E-40)
            goto L_0x0084
        L_0x0081:
            r5 = 656392(0xa0408, float:9.19801E-40)
        L_0x0084:
            com.google.android.libraries.gsa.c.a.bo r6 = r4.f61428a
            r6.mo27503b(r5, r7)
            com.google.android.libraries.gsa.c.a.bo r5 = r4.f61428a
            java.nio.ByteBuffer r6 = r5.f61440l
            if (r6 == 0) goto L_0x0094
            com.google.android.apps.gsa.shared.aa.h r5 = r5.f61433e
            r5.mo83030c(r6)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1833c.p1834a.C22242bn.onFailed(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo, org.chromium.net.CronetException):void");
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f61428a.f61434f.mo82965i((long) byteBuffer.position());
        C22243bo boVar = this.f61428a;
        boVar.f61440l = null;
        if (boVar.f61430b.get() == 2) {
            C22250bv bvVar = this.f61428a.f61437i;
            bvVar.f61462k = false;
            bvVar.f61454c.mo82968l();
            C22243bo boVar2 = this.f61428a;
            boVar2.mo27504c(boVar2.f61435g.isDone(), "Data received before headers");
            C22264p pVar = this.f61428a.f61438j;
            C58976aa aaVar = C58975e.f156826a;
            synchronized (pVar.f61520a) {
                if (pVar.f61524e) {
                    pVar.f61522c.mo83031e(byteBuffer);
                    return;
                }
                C58838bb.m90883r(!pVar.f61523d);
                C58838bb.m90883r(!pVar.f61525f);
                pVar.f61521b.mo83008c(pVar.f61522c.mo83028a(byteBuffer));
                pVar.f61523d = true;
                pVar.mo27520c();
                return;
            }
        }
        this.f61428a.f61433e.mo83031e(byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        C22243bo boVar = this.f61428a;
        if (boVar.f61431c.f241262k) {
            if (boVar.f61430b.get() == 1) {
                C22250bv bvVar = this.f61428a.f61437i;
                C58838bb.m90883r(!bvVar.f61464m);
                bvVar.f61461j.getClass();
                bvVar.f61454c.mo82968l();
                bvVar.f61462k = true;
                urlRequest.followRedirect();
                return;
            }
            ((C59052c) ((C59052c) C22243bo.f61429a.mo56224b()).mo56372aa(48494)).mo56386p("Redirect ignored. Request likely already cancelled or timed out.");
        } else if (boVar.f61430b.compareAndSet(1, 3)) {
            this.f61428a.f61437i.f61463l = true;
            C89022at a = C22243bo.m41599a(urlResponseInfo);
            C58838bb.m90883r(a.mo83002d());
            C22243bo boVar2 = this.f61428a;
            boVar2.mo27504c(boVar2.f61435g.mo57356n(a), "Could not set future.");
            this.f61428a.f61434f.mo82971o(a);
            this.f61428a.f61438j.mo27521g(C89051g.f241328a);
            this.f61428a.f61434f.mo82964h();
            urlRequest.cancel();
        } else {
            ((C59052c) ((C59052c) C22243bo.f61429a.mo56224b()).mo56372aa(48493)).mo56386p("Redirect ignored. Request likely already cancelled or timed out.");
        }
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.f61428a.f61430b.compareAndSet(1, 2)) {
            C22250bv bvVar = this.f61428a.f61437i;
            bvVar.f61462k = false;
            bvVar.f61454c.mo82968l();
            bvVar.f61464m = true;
            C89022at a = C22243bo.m41599a(urlResponseInfo);
            C22243bo boVar = this.f61428a;
            boVar.mo27504c(boVar.f61435g.mo57356n(a), "Could not set future.");
            this.f61428a.f61434f.mo82971o(a);
            C22264p pVar = this.f61428a.f61438j;
            C58976aa aaVar = C58975e.f156826a;
            synchronized (pVar.f61520a) {
                if (!pVar.f61524e) {
                    C58838bb.m90883r(!pVar.f61523d);
                    C58838bb.m90883r(!pVar.f61525f);
                    pVar.f61523d = true;
                    pVar.mo27520c();
                }
            }
        }
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.f61428a.f61430b.compareAndSet(2, 3)) {
            this.f61428a.f61437i.f61463l = true;
            C22243bo boVar = this.f61428a;
            boVar.mo27504c(boVar.f61435g.isDone(), "Success before receiving headers");
            this.f61428a.f61438j.mo27521g(C89051g.f241328a);
            this.f61428a.f61434f.mo82964h();
        }
        C22243bo boVar2 = this.f61428a;
        ByteBuffer byteBuffer = boVar2.f61440l;
        if (byteBuffer != null) {
            boVar2.f61433e.mo83030c(byteBuffer);
        }
    }
}
