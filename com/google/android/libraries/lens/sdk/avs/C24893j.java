package com.google.android.libraries.lens.sdk.avs;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.p2014e.C24181a;
import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24202ae;
import com.google.android.libraries.lens.p2014e.C24203af;
import com.google.android.libraries.lens.p2014e.C24205ah;
import com.google.android.libraries.lens.p2014e.C24225q;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.android.libraries.lens.sdk.avs.data.C24871f;
import com.google.android.libraries.lens.sdk.avs.data.C24875j;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.view.p2070an.p2072b.C25396af;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C63088z;
import com.google.protos.p4963bf.p4964a.p4965a.C64573av;

/* renamed from: com.google.android.libraries.lens.sdk.avs.j */
/* compiled from: PG */
public final /* synthetic */ class C24893j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24896m f67991a;

    /* renamed from: b */
    public final /* synthetic */ C24876k f67992b;

    /* renamed from: c */
    public final /* synthetic */ C24901r f67993c;

    public /* synthetic */ C24893j(C24896m mVar, C24876k kVar, C24901r rVar) {
        this.f67991a = mVar;
        this.f67992b = kVar;
        this.f67993c = rVar;
    }

    public final void run() {
        C24896m mVar = this.f67991a;
        C24876k kVar = this.f67992b;
        C24901r rVar = this.f67993c;
        C24225q o = C24227s.m45178o();
        C24875j b = kVar.mo30088b();
        b.getClass();
        C24871f a = b.mo30085a();
        a.getClass();
        Bitmap a2 = a.mo30075a();
        a2.getClass();
        C24181a aVar = (C24181a) o;
        aVar.f66090a = a2;
        aVar.f66097h = 3;
        o.mo29652e(C24226r.CAMERA);
        o.mo29653f(mVar.f68000d.mo26870b() * 1000);
        C24227s a3 = o.mo29648a();
        ((C25396af) mVar.f67999c.mo6453a()).mo30436d(C24201ad.m45035f(C24203af.m45046b(), C24202ae.m45042d(C28130s.m52411b(C56306df.AUTO_FILTER), C64573av.f175078c, C56220aa.f149748b), C24205ah.m45050c(C63088z.f170246b).mo29689a(), a3), new C24895l(kVar, rVar));
    }
}
