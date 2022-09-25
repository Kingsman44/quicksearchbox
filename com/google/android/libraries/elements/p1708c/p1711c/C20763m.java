package com.google.android.libraries.elements.p1708c.p1711c;

import com.google.android.libraries.elements.p1714d.C20871cv;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68082d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.c.c.m */
/* compiled from: PG */
public final /* synthetic */ class C20763m implements C20871cv {

    /* renamed from: a */
    public static final /* synthetic */ C20763m f58104a = new C20763m();

    private /* synthetic */ C20763m() {
    }

    /* renamed from: a */
    public final C7492e mo25827a(ByteBuffer byteBuffer) {
        C68082d dVar = new C68082d();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        dVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return dVar;
    }
}
