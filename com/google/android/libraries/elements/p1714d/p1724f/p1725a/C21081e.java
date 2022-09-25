package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import p5488io.p5490b.C70120l;

/* renamed from: com.google.android.libraries.elements.d.f.a.e */
/* compiled from: PG */
public final class C21081e implements C21232ab {

    /* renamed from: a */
    private final C58881cr f59090a = C58886cw.m90973a(C21078b.f59086a);

    /* renamed from: a */
    public final ByteStore mo26138a() {
        return (ByteStore) this.f59090a.mo6453a();
    }

    /* renamed from: b */
    public final C70120l mo26139b(String str) {
        return C70120l.m102047f(new C21077a(str, (ByteStore) this.f59090a.mo6453a()));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo26140c(String str, byte[] bArr) {
        mo26142e(str, bArr);
    }

    /* renamed from: d */
    public final void mo26141d(String str) {
        ((ByteStore) this.f59090a.mo6453a()).set(str, (byte[]) null);
    }

    /* renamed from: e */
    public final void mo26142e(String str, byte[] bArr) {
        ((ByteStore) this.f59090a.mo6453a()).set(str, bArr);
    }
}
