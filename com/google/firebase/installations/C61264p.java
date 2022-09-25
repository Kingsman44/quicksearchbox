package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p4616b.C61239f;
import com.google.firebase.installations.p4618d.C61252a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.installations.p */
/* compiled from: PG */
public final class C61264p {

    /* renamed from: a */
    public static final long f165704a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    public static final Pattern f165705b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c */
    private static C61264p f165706c;

    private C61264p() {
    }

    /* renamed from: b */
    public static C61264p m93745b() {
        if (C61252a.f165681a == null) {
            C61252a.f165681a = new C61252a();
        }
        if (f165706c == null) {
            f165706c = new C61264p();
        }
        return f165706c;
    }

    /* renamed from: d */
    static boolean m93746d(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public final long mo57875a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: c */
    public final boolean mo57876c(C61239f fVar) {
        if (!TextUtils.isEmpty(fVar.mo57823d()) && fVar.mo57821b() + fVar.mo57820a() >= mo57875a() + f165704a) {
            return false;
        }
        return true;
    }
}
