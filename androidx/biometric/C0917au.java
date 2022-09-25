package androidx.biometric;

import android.content.Context;

/* renamed from: androidx.biometric.au */
/* compiled from: PG */
public final class C0917au {
    /* renamed from: a */
    public static boolean m2838a(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : context.getResources().getStringArray(i)) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
