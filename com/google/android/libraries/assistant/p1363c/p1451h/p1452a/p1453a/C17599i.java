package com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.c.h.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C17599i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17602l f50706a;

    public /* synthetic */ C17599i(C17602l lVar) {
        this.f50706a = lVar;
    }

    public final void run() {
        C17602l lVar = this.f50706a;
        if (!lVar.f50713c) {
            lVar.f50713c = true;
            try {
                lVar.f50712b.mo20121a();
                return;
            } catch (Throwable th) {
                C17598h.m34901a(th, th);
            }
        } else {
            ((C59052c) ((C59052c) C17602l.f50711a.mo56226d()).mo56372aa(42822)).mo56386p("Received onCompleted after the stream has ended.");
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) C17602l.f50711a.mo56225c()).mo56382g(th)).mo56372aa(42823)).mo56389s("%s", th.getMessage());
    }
}
