package com.google.android.libraries.micore.learning.base;

import android.util.Log;
import java.util.logging.Level;

/* renamed from: com.google.android.libraries.micore.learning.base.d */
/* compiled from: PG */
public final class C29712d extends C29719k {

    /* renamed from: b */
    private final String f80480b = "brella";

    public C29712d(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C29719k m54801a(String str) {
        return new C29712d(str);
    }

    /* renamed from: b */
    public static C29719k m54802b(String str, String str2) {
        return new C29712d(str2);
    }

    /* renamed from: c */
    public final void mo34855c(Level level, String str, Throwable th, String str2, Object... objArr) {
        int i;
        if (level.equals(Level.SEVERE)) {
            i = 6;
        } else {
            if (!level.equals(Level.WARNING)) {
                if (level.equals(Level.INFO)) {
                    i = 4;
                } else if (level.equals(Level.FINE)) {
                    i = 3;
                }
            }
            i = 5;
        }
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (th != null) {
            str2 = str2 + "\n" + Log.getStackTraceString(th);
        }
        Log.println(i, this.f80480b + "." + str, str2);
    }

    /* renamed from: d */
    public final void mo34856d() {
    }
}
