package com.google.android.apps.gsa.staticplugins.p7406ar.p7407a;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54118q;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.a.m */
/* compiled from: PG */
public final class C94084m extends C68247h {

    /* renamed from: a */
    private final C68283d f262883a;

    public C94084m(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C94084m.class), aVar);
        this.f262883a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C85981c cVar = new C85981c();
        cVar.mo79637c(cVar.f232497e, "X-Protobuffer-Request-Payload", new String(Base64.encode(((C54118q) obj).toByteArray(), 10), "UTF-8"));
        return C60856cj.m92900i(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f262883a.mo60297gq();
    }
}
