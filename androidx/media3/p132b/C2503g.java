package androidx.media3.p132b;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.base.C58913w;
import p3186j$.net.URLDecoder;

/* renamed from: androidx.media3.b.g */
/* compiled from: PG */
public final class C2503g extends C2499c {

    /* renamed from: a */
    private C2510n f6880a;

    /* renamed from: b */
    private byte[] f6881b;

    /* renamed from: c */
    private int f6882c;

    /* renamed from: d */
    private int f6883d;

    public C2503g() {
        super(false);
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f6883d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(C2612ak.m6927J(this.f6881b), this.f6882c, bArr, i, min);
        this.f6882c += min;
        this.f6883d -= min;
        mo5927g(min);
        return min;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        mo5929i(nVar);
        this.f6880a = nVar;
        Uri uri = nVar.f6891a;
        String scheme = uri.getScheme();
        C2601a.m6831c("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] aq = C2612ak.m6967aq(uri.getSchemeSpecificPart(), ",");
        if (aq.length == 2) {
            String str = aq[1];
            if (aq[0].contains(";base64")) {
                try {
                    this.f6881b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw C2599az.m6820b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.f6881b = C2612ak.m6961ak(URLDecoder.decode(str, C58913w.f156752a.name()));
            }
            long j = nVar.f6896f;
            int length = this.f6881b.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.f6882c = i;
                int i2 = length - i;
                this.f6883d = i2;
                long j2 = nVar.f6897g;
                if (j2 != -1) {
                    this.f6883d = (int) Math.min((long) i2, j2);
                }
                mo5930j(nVar);
                long j3 = nVar.f6897g;
                return j3 != -1 ? j3 : (long) this.f6883d;
            }
            this.f6881b = null;
            throw new C2506j(2008);
        }
        throw C2599az.m6820b("Unexpected URI format: ".concat(String.valueOf(String.valueOf(uri))), (Throwable) null);
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        C2510n nVar = this.f6880a;
        if (nVar != null) {
            return nVar.f6891a;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo5882d() {
        if (this.f6881b != null) {
            this.f6881b = null;
            mo5928h();
        }
        this.f6880a = null;
    }
}
