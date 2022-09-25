package com.google.android.apps.gsa.staticplugins.s3request.producers;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.p */
/* compiled from: PG */
final class C116357p implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C116358q f322645a;

    public C116357p(C116358q qVar) {
        this.f322645a = qVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (th instanceof C90456c) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            ajVar.mo57006c(C90454b.m147155e((C90456c) th));
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.S3_HEADER_REQUEST_CREATION_FAILED;
            fVar.f246203c = (C59687cb) ajVar.build();
            ((C89859i) this.f322645a.f322648b.mo27525b()).mo74236a(fVar.mo83699a());
            return;
        }
        this.f322645a.mo102650e(C89849ae.S3_HEADER_REQUEST_CREATION_FAILED);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C66607ce ceVar = (C66607ce) obj;
        this.f322645a.mo102650e(C89849ae.S3_HEADER_REQUEST_CREATION_SUCCESSFUL);
    }
}
