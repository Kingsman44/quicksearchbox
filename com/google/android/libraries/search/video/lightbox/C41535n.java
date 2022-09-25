package com.google.android.libraries.search.video.lightbox;

import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.video.p3191a.C41450i;
import com.google.android.libraries.search.video.p3191a.C41454m;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.video.lightbox.n */
/* compiled from: PG */
public final /* synthetic */ class C41535n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C41539r f108551a;

    /* renamed from: b */
    public final /* synthetic */ C41454m f108552b;

    /* renamed from: c */
    public final /* synthetic */ C41450i f108553c;

    public /* synthetic */ C41535n(C41539r rVar, C41454m mVar, C41450i iVar) {
        this.f108551a = rVar;
        this.f108552b = mVar;
        this.f108553c = iVar;
    }

    public final void accept(Object obj) {
        C41539r rVar = this.f108551a;
        C41454m mVar = this.f108552b;
        C54806z zVar = (C54806z) obj;
        C40027ah ahVar = (C40027ah) this.f108553c.mo43966b().get();
        C57696b bVar = rVar.f108559c.f152655i;
        if (bVar == null) {
            bVar = C57696b.f154137l;
        }
        mVar.mo43984c(ahVar, bVar, zVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
