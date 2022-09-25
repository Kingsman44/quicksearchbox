package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.f */
/* compiled from: PG */
public final class C23261f implements C23274s {
    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return Float.valueOf(0.0f);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        return Float.valueOf(pVar.f63472a.getFloat(str));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putFloat(str, ((Float) obj).floatValue());
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((Float) obj).equals((Float) obj2);
    }
}
