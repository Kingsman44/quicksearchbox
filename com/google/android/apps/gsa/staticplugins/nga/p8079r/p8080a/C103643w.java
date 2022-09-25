package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.speech.p5208h.C66629d;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.w */
/* compiled from: PG */
public final class C103643w extends C68247h {

    /* renamed from: a */
    private final C68283d f288703a;

    public C103643w(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C103643w.class), aVar);
        this.f288703a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C68282c cVar = (C68282c) obj;
        C58833ax b = C57940c.m88575b(cVar);
        if (!b.mo56113h()) {
            return C60856cj.m92900i(new C118928k((C58833ax) C57940c.m88577d(cVar), C66629d.f181274a));
        }
        Throwable th = (Throwable) b.mo56107c();
        if (th.getCause() != null) {
            th = th.getCause();
        }
        throw new C90523o(th, (int) C89885b.S3REQUEST_BUILD_ASSISTANT_REQUEST_FAILED_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f288703a.mo60297gq());
    }
}
