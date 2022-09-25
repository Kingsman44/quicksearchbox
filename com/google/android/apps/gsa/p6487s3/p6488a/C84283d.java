package com.google.android.apps.gsa.p6487s3.p6488a;

import com.google.protobuf.C62921ba;
import com.google.speech.p5208h.C66608cf;
import com.google.speech.p5208h.C66611ci;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.s3.a.d */
/* compiled from: PG */
public final class C84283d implements Closeable {

    /* renamed from: a */
    private final DataInputStream f229361a;

    public C84283d(InputStream inputStream) {
        this.f229361a = new DataInputStream(inputStream);
    }

    /* renamed from: a */
    public final C66611ci mo77821a() {
        int readInt;
        do {
            readInt = this.f229361a.readInt();
        } while (readInt == 0);
        if (readInt <= 0 || readInt > 4194304) {
            throw new IndexOutOfBoundsException("Wrong len " + readInt);
        }
        byte[] bArr = new byte[readInt];
        this.f229361a.readFully(bArr);
        return (C66611ci) ((C66608cf) ((C66608cf) C66611ci.f181206g.createBuilder()).mergeFrom(bArr, C62921ba.m95368a())).build();
    }

    public final void close() {
        this.f229361a.close();
    }
}
