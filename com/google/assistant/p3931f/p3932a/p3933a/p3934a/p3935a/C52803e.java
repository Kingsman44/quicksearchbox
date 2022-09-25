package com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.assistant.f.a.a.a.a.e */
/* compiled from: PG */
public abstract class C52803e {

    /* renamed from: c */
    public static final C52803e f138528c = m86709c(1, (String) null);

    /* renamed from: d */
    public static final C52803e f138529d = m86709c(2, (String) null);

    /* renamed from: e */
    public static final C52803e f138530e = m86709c(6, (String) null);

    /* renamed from: c */
    public static C52803e m86709c(int i, String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return new C52799a(i, str);
    }

    /* renamed from: a */
    public abstract String mo53911a();

    /* renamed from: b */
    public abstract int mo53912b();

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        int b = mo53912b();
        switch (b) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "UNKNOWN_ERROR";
                break;
            case 3:
                str = "NOT_HANDLED";
                break;
            case 4:
                str = "INVALID_PARAMETERS";
                break;
            case 5:
                str = "CANCELLED";
                break;
            case 6:
                str = "NULL_RESPONSE";
                break;
            default:
                str = "null";
                break;
        }
        if (b != 0) {
            objArr[0] = str;
            objArr[1] = mo53911a();
            return String.format("%s, %s", objArr);
        }
        throw null;
    }
}
