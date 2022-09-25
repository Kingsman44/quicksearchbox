package com.google.android.gms.cast.framework.media;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.cast.framework.media.y */
/* compiled from: PG */
public final class C143541y {
    /* renamed from: a */
    public static int m233104a(String str) {
        try {
            Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }
}
