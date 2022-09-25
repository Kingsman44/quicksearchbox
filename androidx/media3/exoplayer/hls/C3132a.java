package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2507k;
import androidx.media3.p132b.C2510n;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: androidx.media3.exoplayer.hls.a */
/* compiled from: PG */
final class C3132a implements C2505i {

    /* renamed from: a */
    private final C2505i f9220a;

    /* renamed from: b */
    private final byte[] f9221b;

    /* renamed from: c */
    private final byte[] f9222c;

    /* renamed from: d */
    private CipherInputStream f9223d;

    public C3132a(C2505i iVar, byte[] bArr, byte[] bArr2) {
        this.f9220a = iVar;
        this.f9221b = bArr;
        this.f9222c = bArr2;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        CipherInputStream cipherInputStream = this.f9223d;
        cipherInputStream.getClass();
        int read = cipherInputStream.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f9221b, "AES"), new IvParameterSpec(this.f9222c));
                C2507k kVar = new C2507k(this.f9220a, nVar);
                this.f9223d = new CipherInputStream(kVar, instance);
                kVar.mo5931a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f9220a.mo5881c();
    }

    /* renamed from: d */
    public final void mo5882d() {
        if (this.f9223d != null) {
            this.f9223d = null;
            this.f9220a.mo5882d();
        }
    }

    /* renamed from: e */
    public final Map mo5883e() {
        return this.f9220a.mo5883e();
    }

    /* renamed from: f */
    public final void mo5884f(C2495an anVar) {
        anVar.getClass();
        this.f9220a.mo5884f(anVar);
    }
}
