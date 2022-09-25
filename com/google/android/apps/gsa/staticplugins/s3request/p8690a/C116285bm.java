package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67242t;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.bm */
/* compiled from: PG */
public final class C116285bm extends C68247h {

    /* renamed from: a */
    private final C68283d f322405a;

    /* renamed from: c */
    private final C68283d f322406c;

    /* renamed from: d */
    private final C68283d f322407d;

    /* renamed from: e */
    private final C68283d f322408e;

    public C116285bm(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C116285bm.class), aVar);
        this.f322405a = C68236af.m98549d(dVar);
        this.f322406c = C68236af.m98549d(dVar2);
        this.f322407d = C68236af.m98549d(dVar3);
        this.f322408e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C92473f fVar = (C92473f) list.get(0);
        C92460b bVar = (C92460b) list.get(1);
        C68282c cVar = (C68282c) list.get(2);
        try {
            return C60856cj.m92900i(C116249ad.m192804c(fVar, bVar, (C67242t) cVar.mo60292a(), (Query) list.get(3)));
        } catch (Exception e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            throw new C90523o(th, (int) C89885b.S3REQUEST_BUILD_S3_RECOGNIZER_INFO_FAILED_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322405a.mo60297gq(), this.f322406c.mo60297gq(), C68236af.m98546a(this.f322407d.mo60297gq()), this.f322408e.mo60297gq());
    }
}
