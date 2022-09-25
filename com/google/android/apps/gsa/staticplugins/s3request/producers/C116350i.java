package com.google.android.apps.gsa.staticplugins.s3request.producers;

import com.google.android.apps.gsa.p6487s3.producers.C84305d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66567ax;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66678l;
import com.google.speech.p5224k.p5225a.C67248z;
import java.io.IOException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.i */
/* compiled from: PG */
public final class C116350i extends C84305d {

    /* renamed from: a */
    private final Future f322603a;

    /* renamed from: c */
    private final Future f322604c;

    /* renamed from: d */
    private final C89994f f322605d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116350i(Future future, Future future2, Future future3, Future future4, Future future5, C66678l lVar, long j, String str, C89994f fVar, C86124t tVar) {
        super(future, future2, future3, lVar, (C66550ag) null, j, str, tVar);
        this.f322603a = future4;
        this.f322604c = future5;
        this.f322605d = fVar;
    }

    /* renamed from: a */
    public final C66606cd mo77837a() {
        C66606cd a = super.mo77837a();
        try {
            a.mo58885m(C67248z.f182796k, (C67248z) this.f229431b.mo77841a(this.f322603a));
            boolean aN = this.f322605d.mo83877aN();
            a.copyOnWrite();
            C66607ce ceVar = (C66607ce) a.instance;
            C66607ce ceVar2 = C66607ce.f181191f;
            ceVar.f181193a |= 4;
            ceVar.f181196d = aN;
            mo77851c(a, C66567ax.f181070g, this.f322604c, C89885b.S3REQUEST_BUILD_PINHOLE_PARAMS_FAILED_VALUE);
            return a;
        } catch (IOException e) {
            throw new C90523o((Throwable) e, (int) C89885b.S3REQUEST_BUILD_SOUND_SEARCH_INFO_FAILED_VALUE);
        }
    }
}
