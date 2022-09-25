package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57937b;
import com.google.p4449cd.C57954d;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.bl */
/* compiled from: PG */
public final class C93753bl extends C68247h {

    /* renamed from: a */
    private final C68283d f261645a;

    public C93753bl(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C93753bl.class), aVar);
        this.f261645a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        try {
            C57954d dVar = (C57954d) ((C68282c) obj).mo60292a();
            return C118826c.f331423b;
        } catch (Exception e) {
            C58833ax b = C57937b.m88572b(e, ExecutionException.class);
            if (b.mo56113h() && (b.mo56107c() instanceof CancellationException)) {
                return C118826c.f331423b;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f261645a.mo60297gq());
    }
}
