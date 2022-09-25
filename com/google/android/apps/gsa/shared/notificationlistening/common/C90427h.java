package com.google.android.apps.gsa.shared.notificationlistening.common;

import com.google.common.base.C58832aw;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.h */
/* compiled from: PG */
public final class C90427h {

    /* renamed from: a */
    public static final String f252607a = Pattern.quote("||");

    /* renamed from: b */
    private final String f252608b;

    /* renamed from: c */
    private final String f252609c;

    /* renamed from: d */
    private final String f252610d;

    /* renamed from: e */
    private final boolean f252611e;

    public C90427h(String str, String str2, boolean z, String str3) {
        this.f252608b = str;
        this.f252609c = str2;
        this.f252610d = str3;
        this.f252611e = z;
    }

    /* renamed from: a */
    public final String mo84153a() {
        String str = this.f252608b + "||" + this.f252609c + "||" + this.f252611e;
        String str2 = this.f252610d;
        if (str2 == null) {
            return str;
        }
        return str + "||" + str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C90427h hVar = (C90427h) obj;
            return C58832aw.m90831a(this.f252608b, hVar.f252608b) && C58832aw.m90831a(this.f252609c, hVar.f252609c) && C58832aw.m90831a(this.f252610d, hVar.f252610d) && this.f252611e == hVar.f252611e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f252608b, this.f252609c, this.f252610d, Boolean.valueOf(this.f252611e)});
    }

    public final String toString() {
        String str = this.f252608b;
        String str2 = this.f252609c;
        boolean z = this.f252611e;
        boolean z2 = this.f252610d != null;
        return "packageName=" + str + ", appName=" + str2 + ", isGroupMessage=" + z + ", has person or group name: " + z2;
    }
}
