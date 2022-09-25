package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.q */
/* compiled from: PG */
public final class C23272q implements C23274s {
    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28733b(String str, C23120p pVar) {
        String string = pVar.f63472a.getString(str);
        string.getClass();
        return string;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putString(str, (String) obj);
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((String) obj).equals((String) obj2);
    }
}
