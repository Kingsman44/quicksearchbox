package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.common.p4526f.C59052c;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.android.libraries.gsa.c.a.bm */
/* compiled from: PG */
final class C22241bm extends UrlRequest.StatusListener {

    /* renamed from: a */
    final /* synthetic */ C22243bo f61427a;

    public C22241bm(C22243bo boVar) {
        this.f61427a = boVar;
    }

    public final void onStatus(int i) {
        C22250bv bvVar = this.f61427a.f61437i;
        if (i == -1) {
            ((C59052c) ((C59052c) C22250bv.f61452a.mo56226d()).mo56372aa(48508)).mo56386p("Status returned is INVALID. Request (most likely) already terminated.");
        } else if (bvVar.f61467p != i) {
            bvVar.f61467p = i;
            if (bvVar.f61468q < i) {
                if (bvVar.f61468q != -1) {
                    bvVar.f61454c.mo82968l();
                }
                bvVar.f61468q = i;
            }
            bvVar.f61454c.mo82970n(bvVar.f61467p, bvVar.f61468q);
        }
    }
}
