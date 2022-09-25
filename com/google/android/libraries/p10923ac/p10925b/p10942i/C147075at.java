package com.google.android.libraries.p10923ac.p10925b.p10942i;

import java.io.IOException;

/* renamed from: com.google.android.libraries.ac.b.i.at */
/* compiled from: PG */
public final class C147075at extends IOException {
    public C147075at(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C147075at m239771a(IOException iOException) {
        if (iOException instanceof C147075at) {
            throw ((C147075at) iOException);
        }
        throw new C147075at("Generic IOException encountered", iOException);
    }

    public C147075at(String str, Throwable th) {
        super(str, th);
    }
}
