package androidx.biometric;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: androidx.biometric.af */
/* compiled from: PG */
public final class C0902af {

    /* renamed from: a */
    public final Signature f2983a;

    /* renamed from: b */
    public final Cipher f2984b;

    /* renamed from: c */
    public final Mac f2985c;

    /* renamed from: d */
    public final IdentityCredential f2986d;

    /* renamed from: e */
    public final PresentationSession f2987e;

    public C0902af(IdentityCredential identityCredential) {
        this.f2983a = null;
        this.f2984b = null;
        this.f2985c = null;
        this.f2986d = identityCredential;
        this.f2987e = null;
    }

    public C0902af(PresentationSession presentationSession) {
        this.f2983a = null;
        this.f2984b = null;
        this.f2985c = null;
        this.f2986d = null;
        this.f2987e = presentationSession;
    }

    public C0902af(Signature signature) {
        this.f2983a = signature;
        this.f2984b = null;
        this.f2985c = null;
        this.f2986d = null;
        this.f2987e = null;
    }

    public C0902af(Cipher cipher) {
        this.f2983a = null;
        this.f2984b = cipher;
        this.f2985c = null;
        this.f2986d = null;
        this.f2987e = null;
    }

    public C0902af(Mac mac) {
        this.f2983a = null;
        this.f2984b = null;
        this.f2985c = mac;
        this.f2986d = null;
        this.f2987e = null;
    }
}
