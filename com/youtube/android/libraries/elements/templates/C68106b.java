package com.youtube.android.libraries.elements.templates;

import com.google.android.libraries.elements.C20697c;
import com.google.android.libraries.elements.interfaces.PbToFb;
import com.youtube.android.libraries.elements.StatusOr;
import com.youtube.p5283a.p5284a.C68039ab;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.youtube.android.libraries.elements.templates.b */
/* compiled from: PG */
public final class C68106b {

    /* renamed from: a */
    public static final AtomicBoolean f184340a = new AtomicBoolean(false);

    static {
        C20697c.m38871a();
    }

    /* renamed from: a */
    public static int m98451a(byte[] bArr, C68039ab abVar, boolean z, boolean z2) {
        StatusOr convert = PbToFb.convert(ByteBuffer.wrap(bArr), f184340a.get(), z, z2);
        if (convert.hasValue) {
            C68039ab.m98254o(ByteBuffer.wrap((byte[]) convert.value), abVar);
            return convert.status.getCode().value();
        }
        throw new IllegalStateException("status: ".concat(String.valueOf(String.valueOf(convert.status))));
    }
}
