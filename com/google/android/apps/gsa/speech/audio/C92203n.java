package com.google.android.apps.gsa.speech.audio;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59337t;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.speech.audio.n */
/* compiled from: PG */
public final class C92203n extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private final InputStream f257058a;

    /* renamed from: b */
    private final int f257059b;

    /* renamed from: c */
    private int f257060c;

    /* renamed from: d */
    private byte[] f257061d;

    /* renamed from: e */
    private volatile boolean f257062e;

    public C92203n(InputStream inputStream, int i) {
        C58976aa aaVar = C58975e.f156826a;
        inputStream.getClass();
        boolean z = true;
        C58838bb.m90869d(i > 0, "channelCount must be larger than 0.");
        C58838bb.m90869d(i <= 0 ? false : z, "selectedChannel must be between 0 and channelCount - 1");
        this.f257058a = inputStream;
        this.f257059b = i;
    }

    public final void close() {
        C58976aa aaVar = C58975e.f156826a;
        this.f257061d = null;
        C59337t.m92221a(this.f257058a);
        this.f257062e = true;
    }

    public final int read() {
        throw new UnsupportedOperationException("Single byte read not supported");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f257062e) {
            int i3 = i2 * this.f257059b;
            byte[] bArr2 = this.f257061d;
            if (bArr2 == null || bArr2.length < i3) {
                this.f257061d = new byte[i3];
            }
            int read = this.f257058a.read(this.f257061d, 0, i3);
            if (read == -1) {
                return -1;
            }
            if (read % 2 == 0) {
                int i4 = i;
                int i5 = 0;
                while (i5 < read) {
                    int i6 = this.f257060c;
                    if (i6 == 0) {
                        int i7 = i4 + 1;
                        byte[] bArr3 = this.f257061d;
                        int i8 = i5 + 1;
                        bArr[i4] = bArr3[i5];
                        i4 = i7 + 1;
                        i5 = i8 + 1;
                        bArr[i7] = bArr3[i8];
                    } else {
                        i5 += 2;
                    }
                    int i9 = i6 + 1;
                    this.f257060c = i9;
                    if (i9 >= this.f257059b) {
                        this.f257060c = 0;
                    }
                }
                C58976aa aaVar = C58975e.f156826a;
                return i4 - i;
            }
            throw new IOException("Wrapped input stream returned a partial sample.");
        }
        throw new IOException("Stream is closed");
    }
}
