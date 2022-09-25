package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.r */
/* compiled from: PG */
public final class C23273r implements C23274s {

    /* renamed from: a */
    private final Enum f63744a;

    /* renamed from: b */
    private final C23259d f63745b;

    public C23273r(Enum[] enumArr, Enum enumR) {
        this.f63744a = enumR;
        this.f63745b = new C23259d(enumArr);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return this.f63744a;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        C23259d dVar = this.f63745b;
        return dVar.f63738a[pVar.f63472a.getInt(str)];
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putInt(str, ((Enum) obj).ordinal());
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return C23259d.m43605a((Enum) obj, (Enum) obj2);
    }
}
