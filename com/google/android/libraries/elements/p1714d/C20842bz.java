package com.google.android.libraries.elements.p1714d;

import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68089k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.bz */
/* compiled from: PG */
public final /* synthetic */ class C20842bz implements C20871cv {

    /* renamed from: a */
    public static final /* synthetic */ C20842bz f58401a = new C20842bz();

    private /* synthetic */ C20842bz() {
    }

    /* renamed from: a */
    public final C7492e mo25827a(ByteBuffer byteBuffer) {
        C68089k kVar = new C68089k();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        kVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return kVar;
    }
}
