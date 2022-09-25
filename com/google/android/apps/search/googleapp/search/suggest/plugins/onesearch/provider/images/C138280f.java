package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138260k;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138261l;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59315ac;
import com.google.protobuf.C63088z;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.f */
/* compiled from: PG */
public final /* synthetic */ class C138280f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138282h f376228a;

    /* renamed from: b */
    public final /* synthetic */ C138213bu f376229b;

    public /* synthetic */ C138280f(C138282h hVar, C138213bu buVar) {
        this.f376228a = hVar;
        this.f376229b = buVar;
    }

    public final Object apply(Object obj) {
        C138282h hVar = this.f376228a;
        C138213bu buVar = this.f376229b;
        File file = (File) obj;
        try {
            C138260k kVar = (C138260k) C138261l.f376163e.createBuilder();
            C63088z A = C63088z.m96139A(new C59315ac(file).mo56803a());
            kVar.copyOnWrite();
            C138261l lVar = (C138261l) kVar.instance;
            lVar.f376165a |= 1;
            lVar.f376166b = A;
            long c = hVar.f376232b.mo26871c();
            buVar.copyOnWrite();
            C138214bv bvVar = (C138214bv) buVar.instance;
            C138214bv bvVar2 = C138214bv.f376051f;
            bvVar.f376053a |= 8;
            bvVar.f376057e = c;
            C138214bv bvVar3 = (C138214bv) buVar.build();
            kVar.copyOnWrite();
            C138261l lVar2 = (C138261l) kVar.instance;
            bvVar3.getClass();
            lVar2.f376168d = bvVar3;
            lVar2.f376165a |= 4;
            return (C138261l) kVar.build();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C138282h.f376231a.mo56226d()).mo56382g(e)).mo56372aa(41147)).mo56386p("Glide failed to load image.");
            return C138261l.f376163e;
        }
    }
}
