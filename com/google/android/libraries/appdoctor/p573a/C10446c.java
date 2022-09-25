package com.google.android.libraries.appdoctor.p573a;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.appdoctor.a.c */
/* compiled from: PG */
public final class C10446c {
    /* renamed from: a */
    public static C60870cx m25414a(Callable callable) {
        C60871cy cyVar = new C60871cy(callable);
        new Thread(cyVar).start();
        return cyVar;
    }
}
