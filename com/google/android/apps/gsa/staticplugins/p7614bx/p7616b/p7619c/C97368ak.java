package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.graphics.Paint;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.ak */
/* compiled from: PG */
public final class C97368ak {
    /* renamed from: a */
    public static int m161133a(String str, Paint paint) {
        int length = str.length();
        do {
            length--;
            if (length < 0 || !Character.isSpaceChar(str.charAt(length))) {
            }
            length--;
            break;
        } while (!Character.isSpaceChar(str.charAt(length)));
        return (int) Math.ceil((double) paint.measureText(str.substring(0, length + 1)));
    }
}
