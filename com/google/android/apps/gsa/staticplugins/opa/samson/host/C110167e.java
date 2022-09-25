package com.google.android.apps.gsa.staticplugins.opa.samson.host;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.assistant.p1356b.p1359b.p1360a.C16922c;
import com.google.android.libraries.assistant.p1356b.p1359b.p1360a.C16924e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.host.e */
/* compiled from: PG */
final class C110167e extends C110177o {

    /* renamed from: a */
    final byte[] f306983a;

    public C110167e(Context context, byte[] bArr, C110163a aVar) {
        super(context, aVar);
        this.f306983a = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C16924e mo98441a() {
        return new C110166d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo98442b(C16922c cVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("EXTRA_VE_IMPRESSION_PROTO", this.f306983a);
        cVar.mo23087b(bundle);
        mo98453c();
    }
}
