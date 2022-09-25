package com.google.p5238v.p5239a.p5259m;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.v.a.m.ba */
/* compiled from: PG */
final class C67855ba extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ C67856bb f183974a;

    public C67855ba(C67856bb bbVar) {
        this.f183974a = bbVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) C67838ak.f183949b.mo59993a(this.f183974a.f183975a);
            mac.init(this.f183974a.f183976b);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
