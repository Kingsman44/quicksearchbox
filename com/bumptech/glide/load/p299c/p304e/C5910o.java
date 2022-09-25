package com.bumptech.glide.load.p299c.p304e;

import android.util.Log;
import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.e.o */
/* compiled from: PG */
public final class C5910o implements C5962u {

    /* renamed from: a */
    private final List f17552a;

    /* renamed from: b */
    private final C5962u f17553b;

    /* renamed from: c */
    private final C5640b f17554c;

    public C5910o(List list, C5962u uVar, C5640b bVar) {
        this.f17552a = list;
        this.f17553b = uVar;
        this.f17554c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return ((C5897b) this.f17553b).mo12293a(ByteBuffer.wrap(bArr), i, i2, sVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        return !((Boolean) sVar.mo12401b(C5909n.f17551b)).booleanValue() && C5954m.m15367d(this.f17552a, (InputStream) obj, this.f17554c) == ImageHeaderParser.ImageType.GIF;
    }
}
