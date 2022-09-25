package com.google.android.libraries.social.populous.logging;

import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public abstract class LogEvent implements Parcelable {
    /* renamed from: a */
    public abstract long mo45594a();

    /* renamed from: b */
    public abstract long mo45595b();

    /* renamed from: c */
    public abstract C42587v mo45596c();

    /* renamed from: d */
    public abstract C58485gu mo45597d();

    /* renamed from: e */
    public abstract Integer mo45598e();

    /* renamed from: f */
    public abstract Long mo45600f();

    /* renamed from: g */
    public abstract Long mo45601g();

    /* renamed from: h */
    public abstract String mo45602h();

    /* renamed from: i */
    public abstract boolean mo45604i();

    /* renamed from: j */
    public abstract int mo45605j();

    /* renamed from: k */
    public final int mo45612k() {
        if (mo45602h() != null) {
            return mo45602h().length();
        }
        return 0;
    }
}
