package com.google.ads.interactivemedia.p367v3.internal;

import com.evernote.android.state.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.re */
/* compiled from: PG */
public final class C7249re {

    /* renamed from: a */
    private final ByteArrayOutputStream f23688a;

    /* renamed from: b */
    private final DataOutputStream f23689b;

    public C7249re() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f23688a = byteArrayOutputStream;
        this.f23689b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m21692b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: c */
    private static void m21693c(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & PrivateKeyType.INVALID);
        dataOutputStream.writeByte(((int) (j >>> 16)) & PrivateKeyType.INVALID);
        dataOutputStream.writeByte(((int) (j >>> 8)) & PrivateKeyType.INVALID);
        dataOutputStream.writeByte(((int) j) & PrivateKeyType.INVALID);
    }

    /* renamed from: a */
    public final byte[] mo16365a(C7247rc rcVar) {
        this.f23688a.reset();
        try {
            m21692b(this.f23689b, rcVar.f23682a);
            String str = rcVar.f23683b;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            m21692b(this.f23689b, str);
            m21693c(this.f23689b, rcVar.f23684c);
            m21693c(this.f23689b, rcVar.f23685d);
            this.f23689b.write(rcVar.f23686e);
            this.f23689b.flush();
            return this.f23688a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
