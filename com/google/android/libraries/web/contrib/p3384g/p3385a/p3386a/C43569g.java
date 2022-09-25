package com.google.android.libraries.web.contrib.p3384g.p3385a.p3386a;

import android.os.RemoteException;
import com.google.android.libraries.web.weblayer.p3464f.p3467b.C44268u;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72319ao;
import org.chromium.weblayer.C72587aw;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72621j;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.g.a.a.g */
/* compiled from: PG */
final class C43569g implements C72621j {

    /* renamed from: a */
    final /* synthetic */ C43572j f113749a;

    /* renamed from: b */
    final /* synthetic */ C69577g f113750b;

    public C43569g(C43572j jVar, C69577g gVar) {
        this.f113749a = jVar;
        this.f113750b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo46626a(Object obj) {
        C69664n.m101058d(obj);
        C72587aw a = C44268u.m78127a((C72611bt) obj, this.f113749a.f113755a);
        C72604bm.m107399a();
        try {
            C72319ao aoVar = a.f193125g;
            aoVar.mo17262he(12, aoVar.mo17260gA());
            this.f113750b.mo61338mb(C69788q.f186170a);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
