package androidx.core.p085a.p086a;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: androidx.core.a.a.b */
/* compiled from: PG */
public final class C1781b {

    /* renamed from: a */
    public final Signature f5552a;

    /* renamed from: b */
    public final Cipher f5553b;

    /* renamed from: c */
    public final Mac f5554c;

    public C1781b(Signature signature) {
        this.f5552a = signature;
        this.f5553b = null;
        this.f5554c = null;
    }

    public C1781b(Cipher cipher) {
        this.f5553b = cipher;
        this.f5552a = null;
        this.f5554c = null;
    }

    public C1781b(Mac mac) {
        this.f5554c = mac;
        this.f5553b = null;
        this.f5552a = null;
    }
}
