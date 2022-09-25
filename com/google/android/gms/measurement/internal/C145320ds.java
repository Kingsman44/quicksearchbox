package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.ds */
/* compiled from: PG */
public final class C145320ds {

    /* renamed from: a */
    protected static final AtomicReference f392778a = new AtomicReference();

    /* renamed from: b */
    protected static final AtomicReference f392779b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f392780c = new AtomicReference();

    /* renamed from: d */
    public final C145388gf f392781d;

    public C145320ds(C145388gf gfVar) {
        this.f392781d = gfVar;
    }

    /* renamed from: f */
    private static final String m236102f(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C143919bh.m233958a(atomicReference);
        C143919bh.m233959b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo120888a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo120889b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo120889b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f392781d.mo121051a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo120891d(str2));
            sb.append("=");
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = mo120888a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo120888a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo120888a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo120890c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f392781d.mo121051a()) {
            return str;
        }
        return m236102f(str, C145385gc.f393046c, C145385gc.f393044a, f392778a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo120891d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f392781d.mo121051a()) {
            return str;
        }
        return m236102f(str, C145386gd.f393049b, C145386gd.f393048a, f392779b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo120892e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f392781d.mo121051a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m236102f(str, C145387ge.f393053b, C145387ge.f393052a, f392780c);
        }
        return "experiment_id(" + str + ")";
    }
}
