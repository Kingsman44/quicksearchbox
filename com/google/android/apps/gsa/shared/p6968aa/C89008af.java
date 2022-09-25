package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.apps.gsa.shared.aa.af */
/* compiled from: PG */
public final class C89008af implements C60845bz {

    /* renamed from: a */
    private final SettableFuture f241203a;

    /* renamed from: b */
    private final C89068x f241204b;

    /* renamed from: c */
    private final FileChannel f241205c;

    public C89008af(SettableFuture settableFuture, C89068x xVar, FileChannel fileChannel) {
        this.f241203a = settableFuture;
        this.f241204b = xVar;
        this.f241205c = fileChannel;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        try {
            this.f241205c.close();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C89009ag.f241206a.mo56225c()).mo56382g(e)).mo56372aa(10635)).mo56386p("Could not close file channel.");
        }
        this.f241203a.mo57357o(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C89051g gVar = (C89051g) obj;
        while (true) {
            int i = gVar.f241330b;
            if (i == 1) {
                try {
                    gVar.mo83025f(this.f241205c);
                    gVar.mo83024e();
                    C60870cx b = this.f241204b.mo27472b();
                    C89051g gVar2 = (C89051g) C90877ak.m148475i(b, (Object) null);
                    if (gVar2 != null) {
                        gVar = gVar2;
                    } else {
                        C60856cj.m92911t(b, this, C60826bg.f164896a);
                        return;
                    }
                } catch (IOException e) {
                    this.f241204b.mo27475d();
                    mo17910gl(e);
                    gVar.mo83024e();
                    return;
                } catch (Throwable th) {
                    gVar.mo83024e();
                    throw th;
                }
            } else if (i == 2) {
                mo17910gl(gVar.mo83023d());
                return;
            } else if (i == 3) {
                try {
                    this.f241205c.close();
                    this.f241203a.mo57356n((Object) null);
                    return;
                } catch (IOException e2) {
                    this.f241203a.mo57357o(e2);
                    return;
                }
            } else {
                throw new AssertionError("Unexpected chunk type: " + i);
            }
        }
    }
}
