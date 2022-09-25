package com.google.android.libraries.elements.p1714d;

import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68042ae;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.bs */
/* compiled from: PG */
public final /* synthetic */ class C20835bs implements C20871cv {

    /* renamed from: a */
    public static final /* synthetic */ C20835bs f58394a = new C20835bs();

    private /* synthetic */ C20835bs() {
    }

    /* renamed from: a */
    public final C7492e mo25827a(ByteBuffer byteBuffer) {
        C68042ae aeVar = new C68042ae();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aeVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return aeVar;
    }
}
