package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.c */
/* compiled from: PG */
public final class C23258c implements C23274s {
    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return Double.valueOf(C59203do.f157270a);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        return Double.valueOf(pVar.f63472a.getDouble(str));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putDouble(str, ((Double) obj).doubleValue());
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((Double) obj).equals((Double) obj2);
    }
}
