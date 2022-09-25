package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a.p2563a.p2564a;

import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p299c.C5882c;
import com.google.common.base.C58913w;
import com.p232a.p233a.C4734bp;
import com.p232a.p233a.C4748cc;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.a.a.b */
/* compiled from: PG */
public final class C33238b implements C5962u {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        try {
            C4734bp d = C4734bp.m13118d((InputStream) obj);
            d.mo9622g((float) i);
            d.mo9621f((float) i2);
            return new C5882c(d);
        } catch (C4748cc e) {
            throw new IOException("Unable to decode SVG from stream.", e);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        byte[] bArr = new byte[256];
        int read = ((InputStream) obj).read(bArr);
        if (read < 4 || !new String(bArr, 0, read, C58913w.f156754c).contains("<svg")) {
            return false;
        }
        return true;
    }
}
