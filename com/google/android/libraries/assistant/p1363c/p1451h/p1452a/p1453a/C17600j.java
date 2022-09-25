package com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.c.h.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C17600j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17602l f50707a;

    /* renamed from: b */
    public final /* synthetic */ Object f50708b;

    public /* synthetic */ C17600j(C17602l lVar, Object obj) {
        this.f50707a = lVar;
        this.f50708b = obj;
    }

    public final void run() {
        C17602l lVar = this.f50707a;
        Object obj = this.f50708b;
        if (!lVar.f50713c) {
            try {
                lVar.f50712b.mo20123c(obj);
                return;
            } catch (Throwable th) {
                C17598h.m34901a(th, th);
            }
        } else {
            ((C59052c) ((C59052c) C17602l.f50711a.mo56226d()).mo56372aa(42826)).mo56386p("Received onNext after the stream has ended.");
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) C17602l.f50711a.mo56225c()).mo56382g(th)).mo56372aa(42827)).mo56389s("%s", th.getMessage());
    }
}
