package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.core.m */
/* compiled from: PG */
public final class C42352m {

    /* renamed from: a */
    public final String f111089a;

    /* renamed from: b */
    public final String f111090b;

    /* renamed from: c */
    public final C42351l f111091c;

    /* renamed from: d */
    public final String f111092d;

    public C42352m(String str, String str2, C42351l lVar, String str3) {
        this.f111089a = str;
        this.f111090b = str2;
        this.f111091c = lVar;
        this.f111092d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42352m) {
            C42352m mVar = (C42352m) obj;
            return C58832aw.m90831a(this.f111089a, mVar.f111089a) && C58832aw.m90831a(this.f111090b, mVar.f111090b) && C58832aw.m90831a(this.f111091c, mVar.f111091c) && C58832aw.m90831a(this.f111092d, mVar.f111092d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111089a, this.f111090b, this.f111091c, this.f111092d});
    }
}
