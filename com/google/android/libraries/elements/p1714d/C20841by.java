package com.google.android.libraries.elements.p1714d;

import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68038aa;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.by */
/* compiled from: PG */
public final /* synthetic */ class C20841by implements C20871cv {

    /* renamed from: a */
    public static final /* synthetic */ C20841by f58400a = new C20841by();

    private /* synthetic */ C20841by() {
    }

    /* renamed from: a */
    public final C7492e mo25827a(ByteBuffer byteBuffer) {
        C68038aa aaVar = new C68038aa();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aaVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return aaVar;
    }
}
