package com.google.android.libraries.elements.p1714d;

import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68069be;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.bw */
/* compiled from: PG */
public final /* synthetic */ class C20839bw implements C20871cv {

    /* renamed from: a */
    public static final /* synthetic */ C20839bw f58398a = new C20839bw();

    private /* synthetic */ C20839bw() {
    }

    /* renamed from: a */
    public final C7492e mo25827a(ByteBuffer byteBuffer) {
        C68069be beVar = new C68069be();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        beVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return beVar;
    }
}
