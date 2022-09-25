package com.google.android.libraries.elements.p1714d.p1718d;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68104z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.d.f */
/* compiled from: PG */
public final class C20884f implements C20887i {

    /* renamed from: a */
    private final C21313t f58574a;

    /* renamed from: b */
    private final C21359t f58575b;

    public C20884f(C21313t tVar, C21359t tVar2) {
        this.f58574a = tVar;
        this.f58575b = tVar2;
    }

    /* renamed from: a */
    public final int mo26014a() {
        return 336816453;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C20886h mo26015b(C7492e eVar, C21311r rVar) {
        return new C20883e((C68104z) eVar, this.f58574a, rVar, this.f58575b);
    }

    /* renamed from: c */
    public final /* synthetic */ C7492e mo26016c(C68044ag agVar) {
        ByteBuffer f = agVar.mo16918f(6);
        C68104z zVar = new C68104z();
        f.order(ByteOrder.LITTLE_ENDIAN);
        zVar.mo16917e(f.getInt(f.position()) + f.position(), f);
        return zVar;
    }
}
