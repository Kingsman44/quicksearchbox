package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.d */
/* compiled from: PG */
public final class C23259d implements C23260e {

    /* renamed from: a */
    public final Enum[] f63738a;

    public C23259d(Enum[] enumArr) {
        this.f63738a = enumArr;
    }

    /* renamed from: a */
    public static final boolean m43605a(Enum enumR, Enum enumR2) {
        return enumR == enumR2;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        return this.f63738a[pVar.f63472a.getInt(str)];
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putInt(str, ((Enum) obj).ordinal());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return m43605a((Enum) obj, (Enum) obj2);
    }
}
