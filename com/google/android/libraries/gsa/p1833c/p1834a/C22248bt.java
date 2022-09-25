package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.android.libraries.gsa.c.a.bt */
/* compiled from: PG */
public final /* synthetic */ class C22248bt implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C22250bv f61451a;

    public /* synthetic */ C22248bt(C22250bv bvVar) {
        this.f61451a = bvVar;
    }

    public final void run() {
        long j;
        C22250bv bvVar = this.f61451a;
        C22249bu buVar = bvVar.f61461j;
        buVar.getClass();
        if (!bvVar.f61463l) {
            if (!bvVar.f61462k) {
                bvVar.mo27506a(1000);
                return;
            }
            boolean z = !bvVar.f61464m;
            long j2 = z ? bvVar.f61455d : bvVar.f61456e;
            if (bvVar.f61460i) {
                j = bvVar.f61454c.mo82959b();
            } else {
                j = bvVar.f61454c.mo82958a();
            }
            if (!bvVar.f61466o && j >= bvVar.f61458g) {
                bvVar.f61453b.mo27380f();
                bvVar.f61466o = true;
            }
            if (j >= j2) {
                ((C22243bo) buVar).mo27503b(true != z ? C89885b.CRONET_RESPONSE_TIMED_OUT_VALUE : C89885b.CRONET_CONNECTION_TIMED_OUT_VALUE, (Throwable) null);
                return;
            }
            if (bvVar.f61465n) {
                bvVar.mo27506a(Math.min(j2 - j, 1000));
            } else {
                long j3 = bvVar.f61457f;
                if (j >= j3) {
                    bvVar.f61459h.mo27441k();
                    bvVar.f61465n = true;
                    bvVar.mo27506a(Math.min(j2 - j, 1000));
                } else {
                    bvVar.mo27506a(Math.min(j3 - j, 1000));
                }
            }
            if (z) {
                C22243bo boVar = (C22243bo) buVar;
                int i = boVar.f61430b.get();
                if (i == 1) {
                    UrlRequest urlRequest = boVar.f61439k;
                    urlRequest.getClass();
                    urlRequest.getStatus(new C22241bm(boVar));
                    return;
                }
                ((C59052c) ((C59052c) C22243bo.f61429a.mo56226d()).mo56372aa(48500)).mo56387q("Did not request status due to an unexpected state: %d", i);
            }
        }
    }
}
