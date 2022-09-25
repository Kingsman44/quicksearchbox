package com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.c.h.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C17601k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17602l f50709a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f50710b;

    public /* synthetic */ C17601k(C17602l lVar, Throwable th) {
        this.f50709a = lVar;
        this.f50710b = th;
    }

    public final void run() {
        C17602l lVar = this.f50709a;
        Throwable th = this.f50710b;
        if (!lVar.f50713c) {
            lVar.f50713c = true;
            try {
                lVar.f50712b.mo20122b(th);
            } catch (Throwable th2) {
                ((C59052c) ((C59052c) ((C59052c) C17602l.f50711a.mo56225c()).mo56382g(th2)).mo56372aa(42825)).mo56389s("%s", th2.getMessage());
            }
        } else {
            ((C59052c) ((C59052c) C17602l.f50711a.mo56226d()).mo56372aa(42824)).mo56386p("Received onError after the stream has ended.");
        }
    }
}
