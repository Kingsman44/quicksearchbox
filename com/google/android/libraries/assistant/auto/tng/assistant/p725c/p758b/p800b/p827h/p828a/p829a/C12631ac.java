package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.C12316a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12692e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.ac */
/* compiled from: PG */
public final class C12631ac extends C68247h {

    /* renamed from: a */
    private final C68283d f39625a;

    /* renamed from: c */
    private final C68283d f39626c;

    /* renamed from: d */
    private final C68283d f39627d;

    public C12631ac(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12631ac.class), aVar);
        this.f39625a = C68236af.m98549d(dVar);
        this.f39626c = C68236af.m98549d(dVar2);
        this.f39627d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C12692e eVar = (C12692e) obj;
        C68283d dVar = this.f39626c;
        C68283d dVar2 = this.f39627d;
        C60870cx gq = dVar.mo60297gq();
        if (gq != null) {
            C60870cx gq2 = dVar2.mo60297gq();
            if (gq2 != null) {
                C12991i b = eVar.mo20721b();
                if (b != null) {
                    return C60856cj.m92900i(new C12316a(gq, gq2, b));
                }
                throw new NullPointerException("Null assistantRequestConfig");
            }
            throw new NullPointerException("Null conversationDelta");
        }
        throw new NullPointerException("Null audioInputData");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f39625a.mo60297gq();
    }
}
