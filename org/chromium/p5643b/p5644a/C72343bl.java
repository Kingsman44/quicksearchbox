package org.chromium.p5643b.p5644a;

import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: org.chromium.b.a.bl */
/* compiled from: PG */
public final class C72343bl {

    /* renamed from: a */
    private static final int f192470a;

    /* renamed from: b */
    private static final Field f192471b;

    static {
        Field declaredField;
        int b;
        Field field = null;
        int i = 0;
        try {
            declaredField = StrictMode.ThreadPolicy.class.getDeclaredField("mask");
            declaredField.setAccessible(true);
            b = m106992b(declaredField);
            m106993c(declaredField, 0);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("StrictModeWorkaround");
            obtain.setDataPosition(0);
            int readInt = obtain.readInt();
            obtain.recycle();
            m106993c(declaredField, b);
            field = declaredField;
            i = readInt;
        } catch (NoSuchFieldException | SecurityException e) {
            Log.w("StrictModeWorkaround", "StrictMode reflection exception", e);
        } catch (RuntimeException e2) {
            Log.w("StrictModeWorkaround", "StrictMode run time exception", e2);
        } catch (Throwable th) {
            m106993c(declaredField, b);
            throw th;
        }
        f192471b = field;
        f192470a = i;
    }

    /* renamed from: a */
    public static void m106991a() {
        Field field = f192471b;
        if (field != null) {
            try {
                int b = m106992b(field);
                int i = f192470a;
                if ((b & i) != 0) {
                    m106993c(field, b & (i ^ -1));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: b */
    private static int m106992b(Field field) {
        try {
            return field.getInt(StrictMode.getThreadPolicy());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m106993c(Field field, int i) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            field.setInt(threadPolicy, i);
            StrictMode.setThreadPolicy(threadPolicy);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
