package com.google.android.libraries.storage.protostore.p3317b;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.storage.protostore.b.b */
/* compiled from: PG */
public final /* synthetic */ class C42903b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ IOException f112244a;

    public /* synthetic */ C42903b(IOException iOException) {
        this.f112244a = iOException;
    }

    public final C60870cx apply(Object obj) {
        IOException iOException = this.f112244a;
        IOException iOException2 = (IOException) obj;
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(iOException, new Object[]{iOException2});
        } catch (Exception unused) {
        }
        throw iOException;
    }
}
