package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.k */
/* compiled from: PG */
public final class C23266k implements C23274s {
    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return 0L;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        return Long.valueOf(pVar.f63472a.getLong(str));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putLong(str, ((Long) obj).longValue());
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((Long) obj).equals((Long) obj2);
    }
}
