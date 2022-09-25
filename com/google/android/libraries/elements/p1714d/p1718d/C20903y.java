package com.google.android.libraries.elements.p1714d.p1718d;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68066bb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.d.y */
/* compiled from: PG */
public final class C20903y implements C20887i {

    /* renamed from: a */
    private final C21313t f58609a;

    /* renamed from: b */
    private final C21359t f58610b;

    public C20903y(C21313t tVar, C21359t tVar2) {
        this.f58609a = tVar;
        this.f58610b = tVar2;
    }

    /* renamed from: a */
    public final int mo26014a() {
        return 408993103;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C20886h mo26015b(C7492e eVar, C21311r rVar) {
        return new C20902x((C68066bb) eVar, this.f58609a, rVar, this.f58610b);
    }

    /* renamed from: c */
    public final /* synthetic */ C7492e mo26016c(C68044ag agVar) {
        ByteBuffer f = agVar.mo16918f(6);
        C68066bb bbVar = new C68066bb();
        f.order(ByteOrder.LITTLE_ENDIAN);
        bbVar.mo16917e(f.getInt(f.position()) + f.position(), f);
        return bbVar;
    }
}
