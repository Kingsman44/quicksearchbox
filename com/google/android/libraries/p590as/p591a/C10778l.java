package com.google.android.libraries.p590as.p591a;

import android.content.Context;
import com.google.audio.hearing.common.C54600a;
import com.google.audio.hearing.common.C54601b;
import com.google.audio.hearing.common.OggOpusEncoder;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.p278b.p279a.C5496e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.as.a.l */
/* compiled from: PG */
public final class C10778l extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public static final C59071e f35778a = C59071e.m91332i("com.google.android.libraries.as.a.l");

    /* renamed from: b */
    private static boolean f35779b = false;

    /* renamed from: c */
    private final InputStream f35780c;

    /* renamed from: d */
    private final int f35781d;

    /* renamed from: e */
    private boolean f35782e = false;

    /* renamed from: f */
    private long f35783f;

    /* renamed from: g */
    private final OggOpusEncoder f35784g;

    /* renamed from: h */
    private final C54601b f35785h;

    /* renamed from: i */
    private final C54600a f35786i;

    public C10778l(InputStream inputStream, int i, int i2, int i3, int i4) {
        C54600a aVar;
        this.f35780c = inputStream;
        this.f35781d = i2;
        if (!f35779b) {
            m25803b();
        }
        OggOpusEncoder oggOpusEncoder = new OggOpusEncoder();
        this.f35784g = oggOpusEncoder;
        oggOpusEncoder.mo54137b(i4, i3, i);
        C54601b bVar = new C54601b(i3 * 8);
        this.f35785h = bVar;
        synchronized (bVar.f143358e) {
            aVar = new C54600a(bVar);
            bVar.f143358e.add(aVar);
        }
        this.f35786i = aVar;
    }

    /* renamed from: a */
    public static void m25802a(Context context) {
        C5496e.m14212a(C10777k.f35777a).mo11833d(context, "ogg_opus_encoder");
        f35779b = true;
    }

    /* renamed from: b */
    private static void m25803b() {
        ((C59052c) ((C59052c) f35778a.mo56226d()).mo56372aa(53945)).mo56386p("Native lib ogg_opus_encoder has not been explicitly loaded! Relying on System.loadLibrary() is unsafe on Android: attempts to use encoder may crash. Please call #initNativeOggOpusLib in the process before instantiating OggOpusInputStream.");
        try {
            System.loadLibrary("ogg_opus_encoder");
        } catch (UnsatisfiedLinkError e) {
            ((C59052c) ((C59052c) ((C59052c) f35778a.mo56225c()).mo56382g(e)).mo56372aa(53946)).mo56386p("Implicit load of libogg_opus_encoder.so failed and OggOpusInputStream will crash! Please call #maybeInitNativeOggOpusLib() before instantiating OggOpusInputStream.");
        }
    }

    /* renamed from: c */
    private final void m25804c(byte[] bArr) {
        C54601b bVar = this.f35785h;
        int length = bArr.length;
        if (!bVar.mo54143b(bArr, length)) {
            ((C59052c) ((C59052c) f35778a.mo56225c()).mo56372aa(53947)).mo56387q("OggOpus-encoded bytes are not being read quickly enough! Up to %s encoded bytes may be discarded.", length);
        }
    }

    public final void close() {
        this.f35780c.close();
    }

    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[this.f35781d]);
        if (!this.f35782e) {
            try {
                int read = this.f35780c.read(wrap.array());
                if (read == -1) {
                    this.f35782e = true;
                    m25804c(this.f35784g.mo54136a());
                } else {
                    this.f35783f += (long) read;
                    m25804c(this.f35784g.mo54138c(wrap.array(), wrap.array().length));
                }
            } catch (IOException e) {
                m25804c(this.f35784g.mo54136a());
                throw e;
            }
        }
        int min = Math.min(i2, this.f35786i.mo54140a());
        if (this.f35782e && min == 0) {
            return -1;
        }
        C54600a aVar = this.f35786i;
        C54601b bVar = aVar.f143351a;
        long j = bVar.f143357d - aVar.f143353c;
        long j2 = (long) bVar.f143356c;
        if (j > j2) {
            long j3 = j - ((long) min);
            aVar.mo54141b((int) (j3 % j2));
            aVar.f143353c += j3;
            ((C59052c) ((C59052c) C54601b.f143354a.mo56225c()).mo56372aa(54868)).mo56386p("We lost data before this read!");
        }
        if (min != 0) {
            if (min >= 0 && min <= aVar.mo54140a()) {
                int i3 = aVar.f143352b;
                int i4 = bVar.f143356c;
                int i5 = (i3 + min) % i4;
                if (i3 < i5) {
                    System.arraycopy(bVar.f143355b, i3, bArr, i, i5 - i3);
                } else {
                    System.arraycopy(bVar.f143355b, i3, bArr, i, i4 - i3);
                    int i6 = bVar.f143356c;
                    int i7 = aVar.f143352b;
                    System.arraycopy(bVar.f143355b, 0, bArr, (i + i6) - i7, min - (i6 - i7));
                }
            }
            return min;
        }
        aVar.mo54141b(min);
        aVar.f143353c += (long) min;
        return min;
    }
}
