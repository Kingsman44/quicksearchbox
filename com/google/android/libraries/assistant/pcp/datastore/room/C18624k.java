package com.google.android.libraries.assistant.pcp.datastore.room;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.k */
/* compiled from: PG */
final class C18624k implements Callable {

    /* renamed from: a */
    final /* synthetic */ C18628o f52644a;

    /* renamed from: b */
    final /* synthetic */ C18627n f52645b;

    public C18624k(C18627n nVar, C18628o oVar) {
        this.f52645b = nVar;
        this.f52644a = oVar;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        this.f52645b.f52652a.mo8181p();
        try {
            this.f52645b.f52653b.mo8308c(this.f52644a);
            this.f52645b.f52652a.mo8188w();
            this.f52645b.f52652a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f52645b.f52652a.mo8183r();
            throw th;
        }
    }
}
