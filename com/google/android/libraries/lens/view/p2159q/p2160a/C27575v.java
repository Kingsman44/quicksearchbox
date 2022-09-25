package com.google.android.libraries.lens.view.p2159q.p2160a;

import com.google.android.libraries.mdi.download.p2248h.p2250b.C29554bg;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29561h;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29562i;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.q.a.v */
/* compiled from: PG */
public final class C27575v {

    /* renamed from: a */
    private final Executor f75371a;

    /* renamed from: b */
    private final C29554bg f75372b;

    /* renamed from: c */
    private final C27579z f75373c;

    public C27575v(Executor executor, C29554bg bgVar, C27579z zVar) {
        this.f75371a = executor;
        this.f75372b = bgVar;
        this.f75373c = zVar;
    }

    /* renamed from: a */
    public final C29562i mo33120a(String str) {
        C27579z zVar = this.f75373c;
        C42876ab abVar = (C42876ab) zVar.f75379a.mo17428b();
        abVar.getClass();
        C60888db dbVar = (C60888db) zVar.f75380b.mo17428b();
        dbVar.getClass();
        C27578y yVar = new C27578y(abVar, dbVar, str);
        C29561h hVar = new C29561h();
        hVar.f80100c = this.f75371a;
        hVar.f80098a = this.f75372b;
        hVar.f80099b = yVar;
        return hVar.mo34769a();
    }
}
