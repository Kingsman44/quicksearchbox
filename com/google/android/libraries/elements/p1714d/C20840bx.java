package com.google.android.libraries.elements.p1714d;

import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68098t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.bx */
/* compiled from: PG */
public final /* synthetic */ class C20840bx implements C20871cv {

    /* renamed from: a */
    public static final /* synthetic */ C20840bx f58399a = new C20840bx();

    private /* synthetic */ C20840bx() {
    }

    /* renamed from: a */
    public final C7492e mo25827a(ByteBuffer byteBuffer) {
        C68098t tVar = new C68098t();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        tVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return tVar;
    }
}
