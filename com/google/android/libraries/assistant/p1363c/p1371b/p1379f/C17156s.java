package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.b.f.s */
/* compiled from: PG */
public final class C17156s implements C70862aj {

    /* renamed from: a */
    public final C60870cx f49861a = C2169h.m6027a(new C17155r(this));

    /* renamed from: b */
    public C2164c f49862b;

    /* renamed from: c */
    private final List f49863c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo20121a() {
        C2164c cVar = this.f49862b;
        if (cVar != null) {
            cVar.mo5437b(this.f49863c);
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C2164c cVar = this.f49862b;
        if (cVar != null) {
            cVar.mo5439d(th);
        }
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        this.f49863c.add(obj);
    }
}
