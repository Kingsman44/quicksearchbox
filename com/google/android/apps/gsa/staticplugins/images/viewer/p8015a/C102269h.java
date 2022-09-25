package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.h */
/* compiled from: PG */
public final class C102269h implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C102270i f285353a;

    public C102269h(C102270i iVar) {
        this.f285353a = iVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        this.f285353a.mo93049f();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C65949b bVar = (C65949b) obj;
        if ((bVar.f179370a & 1) != 0) {
            C65926d dVar = bVar.f179371b;
            if (dVar == null) {
                dVar = C65926d.f179289b;
            }
            if (dVar.f179291a.size() > 0) {
                ((C102262a) this.f285353a.f285354a).f285332c.mo28730f(bVar, false);
                return;
            }
        }
        new Exception("Zero images in the RelatedImagesResponse");
        this.f285353a.mo93049f();
    }
}
