package com.google.android.libraries.elements.p1714d;

import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68099u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.bt */
/* compiled from: PG */
public final /* synthetic */ class C20836bt implements C20871cv {

    /* renamed from: a */
    public static final /* synthetic */ C20836bt f58395a = new C20836bt();

    private /* synthetic */ C20836bt() {
    }

    /* renamed from: a */
    public final C7492e mo25827a(ByteBuffer byteBuffer) {
        C68099u uVar = new C68099u();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        uVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return uVar;
    }
}
