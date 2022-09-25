package com.google.android.libraries.gsa.monet.internal.service;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23091e;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.y */
/* compiled from: PG */
public final class C23029y {

    /* renamed from: a */
    public final C23091e f63353a;

    /* renamed from: b */
    public final C23129y f63354b;

    /* renamed from: c */
    public final Bundle f63355c;

    /* renamed from: d */
    public final ProtoParcelable f63356d;

    public C23029y(C23129y yVar, Bundle bundle, C23091e eVar, ProtoParcelable protoParcelable) {
        this.f63354b = yVar;
        this.f63355c = bundle;
        this.f63353a = eVar;
        this.f63356d = protoParcelable;
    }

    /* renamed from: a */
    public final C23029y mo28450a(String str) {
        return (C23029y) this.f63353a.get(str);
    }
}
