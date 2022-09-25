package com.google.android.apps.gsa.p8889z.p8893c.p8895b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.c.b.q */
/* compiled from: PG */
public final class C118869q extends C68247h {

    /* renamed from: a */
    private final C68283d f331526a;

    public C118869q(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C118869q.class), aVar);
        this.f331526a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C66610ch a = C66610ch.m97260a(((C66611ci) axVar.mo56107c()).f181209b);
            if (a == null) {
                a = C66610ch.IN_PROGRESS;
            }
            if (a == C66610ch.DONE_SUCCESS) {
                return C118826c.f331423b;
            }
        }
        return C60856cj.m92899h(new C90523o("Did not receive success status", (int) C89885b.S3_DOWN_FAILED_VALUE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f331526a.mo60297gq();
    }
}
