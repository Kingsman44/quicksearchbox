package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66678l;
import java.util.concurrent.Future;

@ProguardMustNotDelete
/* renamed from: com.google.android.apps.gsa.s3.producers.MutatableS3HeaderProducer */
/* compiled from: PG */
public class MutatableS3HeaderProducer extends C84305d {

    /* renamed from: a */
    private final C84310i f229412a;

    public MutatableS3HeaderProducer(Future future, Future future2, C66550ag agVar, long j, String str, C84310i iVar, C86124t tVar) {
        super((Future) null, future, future2, (C66678l) null, agVar, j, str, tVar);
        this.f229412a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C66606cd mo77837a() {
        C66606cd a = super.mo77837a();
        this.f229412a.mo77853a(a);
        return a;
    }
}
