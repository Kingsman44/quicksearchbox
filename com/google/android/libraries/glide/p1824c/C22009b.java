package com.google.android.libraries.glide.p1824c;

import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.google.common.base.C58913w;
import com.p232a.p233a.C4734bp;
import com.p232a.p233a.C4748cc;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: com.google.android.libraries.glide.c.b */
/* compiled from: PG */
public final class C22009b implements C5962u {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        try {
            C4734bp d = C4734bp.m13118d((InputStream) obj);
            if (i != Integer.MIN_VALUE) {
                d.mo9622g((float) i);
            }
            if (i2 != Integer.MIN_VALUE) {
                d.mo9621f((float) i2);
            }
            return new C22008a(new PictureDrawable(d.mo9624i()));
        } catch (C4748cc e) {
            throw new IOException("Unable to decode SVG from stream.", e);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = new byte[256];
        int i = 0;
        while (i < 256) {
            int read = inputStream.read(bArr, i, 256 - i);
            if (read == -1) {
                break;
            }
            i += read;
        }
        String lowerCase = new String(bArr, 0, i, C58913w.f156754c).toLowerCase(Locale.getDefault());
        boolean z = i >= 4 && lowerCase.contains("<svg");
        boolean z2 = i >= 5 && lowerCase.contains(" svg ");
        if (z || z2) {
            return true;
        }
        return false;
    }
}
