package com.google.android.libraries.elements.p1714d;

import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68093o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.bu */
/* compiled from: PG */
public final /* synthetic */ class C20837bu implements C20871cv {

    /* renamed from: a */
    public static final /* synthetic */ C20837bu f58396a = new C20837bu();

    private /* synthetic */ C20837bu() {
    }

    /* renamed from: a */
    public final C7492e mo25827a(ByteBuffer byteBuffer) {
        C68093o oVar = new C68093o();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        oVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return oVar;
    }
}
