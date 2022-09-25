package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66629d;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.g */
/* compiled from: PG */
public final class C116311g extends C68247h {

    /* renamed from: a */
    private final C68283d f322459a;

    /* renamed from: c */
    private final C68283d f322460c;

    public C116311g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C116311g.class), aVar);
        this.f322459a = C68236af.m98549d(dVar);
        this.f322460c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C89859i iVar = (C89859i) list.get(1);
        try {
            C58833ax axVar = (C58833ax) cVar.mo60292a();
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.S3_HEADER_REQUEST_ASSISTANT_REQUEST_COMPLETE;
            iVar.mo74236a(fVar.mo83699a());
            return C60856cj.m92900i(new C118928k(axVar, C66629d.f181274a));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            throw new C90523o(th, (int) C89885b.S3REQUEST_BUILD_ASSISTANT_REQUEST_FAILED_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f322459a.mo60297gq()), this.f322460c.mo60297gq());
    }
}
