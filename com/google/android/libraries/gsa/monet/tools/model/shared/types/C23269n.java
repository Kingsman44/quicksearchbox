package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.n */
/* compiled from: PG */
public final class C23269n implements C23260e {
    /* renamed from: a */
    public final Parcelable mo28733b(String str, C23120p pVar) {
        LazyParcelable lazyParcelable = (LazyParcelable) pVar.f63472a.getParcelable(str);
        lazyParcelable.getClass();
        ClassLoader classLoader = getClass().getClassLoader();
        classLoader.getClass();
        return lazyParcelable.mo28508a(classLoader);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putParcelable(str, new LazyParcelable((Parcelable) obj));
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((Parcelable) obj).equals((Parcelable) obj2);
    }
}
