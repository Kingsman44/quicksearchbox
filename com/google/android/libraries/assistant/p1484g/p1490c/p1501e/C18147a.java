package com.google.android.libraries.assistant.p1484g.p1490c.p1501e;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.p4525e.C58967o;

/* renamed from: com.google.android.libraries.assistant.g.c.e.a */
/* compiled from: PG */
public final class C18147a {
    /* renamed from: a */
    public static String m35343a(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle(");
        boolean z = true;
        for (String str : bundle.keySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(m35344b(str));
            sb.append(": ");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                sb.append(m35343a((Bundle) obj));
            } else if (obj instanceof CharSequence) {
                sb.append(m35344b((CharSequence) obj));
            } else {
                sb.append(obj);
            }
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m35344b(CharSequence charSequence) {
        String a = C58967o.f156821b.mo56216a(charSequence.toString());
        return "\"" + a + "\"";
    }

    /* renamed from: c */
    public static byte[] m35345c(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
