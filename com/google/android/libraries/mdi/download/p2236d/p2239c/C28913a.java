package com.google.android.libraries.mdi.download.p2236d.p2239c;

import com.google.android.libraries.mdi.download.C28738bp;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.c.a */
/* compiled from: PG */
public final /* synthetic */ class C28913a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28738bp f78533a;

    public /* synthetic */ C28913a(C28738bp bpVar) {
        this.f78533a = bpVar;
    }

    public final C60870cx apply(Object obj) {
        C28738bp bpVar = this.f78533a;
        IOException iOException = (IOException) obj;
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(bpVar, new Object[]{iOException});
        } catch (Exception unused) {
        }
        return C60866ct.f164955a;
    }
}
