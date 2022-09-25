package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.j */
/* compiled from: PG */
public final class C23265j implements C23274s {
    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        return Integer.valueOf(pVar.f63472a.getInt(str));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putInt(str, ((Integer) obj).intValue());
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((Integer) obj).equals((Integer) obj2);
    }
}
