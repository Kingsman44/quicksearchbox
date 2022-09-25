package com.google.frameworks.client.data.android.p4641h;

import com.google.common.util.concurrent.C60826bg;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.h.y */
/* compiled from: PG */
public final /* synthetic */ class C61504y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61505z f166273a;

    /* renamed from: b */
    public final /* synthetic */ Status f166274b;

    /* renamed from: c */
    public final /* synthetic */ C70334de f166275c;

    public /* synthetic */ C61504y(C61505z zVar, Status status, C70334de deVar) {
        this.f166273a = zVar;
        this.f166274b = status;
        this.f166275c = deVar;
    }

    public final void run() {
        C61505z zVar = this.f166273a;
        Status status = this.f166274b;
        C70334de deVar = this.f166275c;
        if (!zVar.f166277b) {
            try {
                zVar.f166276a.mo27484b(status, deVar);
            } finally {
                zVar.f166277b = true;
                zVar.f166278c.f166192h.f166179a = C60826bg.f164896a;
            }
        }
    }
}
