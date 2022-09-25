package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66684r;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.aa */
/* compiled from: PG */
public final class C116246aa extends C68247h {

    /* renamed from: a */
    private final C68283d f322336a;

    public C116246aa(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C116246aa.class), aVar);
        this.f322336a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        try {
            return C60856cj.m92900i(new C118928k((C58833ax) ((C68282c) obj).mo60292a(), C66684r.f181406d));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            throw new C90523o(th, (int) C89885b.S3REQUEST_BUILD_CLOCKWORK_PARAMS_FAILED_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f322336a.mo60297gq());
    }
}
