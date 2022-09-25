package com.google.android.apps.gsa.staticplugins.bisto.opus;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;

/* compiled from: PG */
public class OpusDecoder {

    /* renamed from: a */
    private static final C59071e f268340a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.opus.OpusDecoder");

    /* renamed from: b */
    private static boolean f268341b;

    /* renamed from: c */
    private byte[] f268342c;
    private long nativeDecoder;

    private native int nativeDecode(long j, byte[] bArr, byte[] bArr2);

    private native int nativeDestroy(long j);

    private native long nativeInit(int i);

    /* renamed from: b */
    public final synchronized void mo89797b() {
        long j = this.nativeDecoder;
        if (j != 0) {
            nativeDestroy(j);
            this.nativeDecoder = 0;
            this.f268342c = null;
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: c */
    public final synchronized byte[] mo89798c(byte[] bArr) {
        byte[] bArr2;
        long j = this.nativeDecoder;
        if (j == 0 || (bArr2 = this.f268342c) == null) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        int nativeDecode = nativeDecode(j, bArr, bArr2);
        if (nativeDecode < 0) {
            C59104x c = f268340a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpusDecoder");
            ((C59052c) ((C59052c) c).mo56372aa(16537)).mo56387q("Failed to decode. error: %d", nativeDecode);
            return null;
        }
        return Arrays.copyOf(this.f268342c, nativeDecode + nativeDecode);
    }

    /* renamed from: a */
    public final synchronized void mo89796a(int i, int i2) {
        if (!f268341b) {
            synchronized (OpusDecoder.class) {
                if (!f268341b) {
                    System.loadLibrary("opuscodec");
                    f268341b = true;
                }
            }
        }
        if (this.nativeDecoder != 0) {
            C59104x d = f268340a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpusDecoder");
            ((C59052c) ((C59052c) d).mo56372aa(16534)).mo56386p("Decoder not previously released");
            mo89797b();
        }
        this.nativeDecoder = nativeInit(i);
        int i3 = ((i * 120) / 1000) * i2;
        this.f268342c = new byte[(i3 + i3)];
    }
}
