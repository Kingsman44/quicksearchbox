package com.google.android.apps.gsa.shared.util.p7158b;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.util.b.i */
/* compiled from: PG */
public abstract class C90752i {

    /* renamed from: b */
    public static final Pattern f253827b = Pattern.compile("(.*)@google\\.com");

    /* renamed from: b */
    public static C90752i m148228b(Boolean bool) {
        return new C90751h(bool, false);
    }

    /* renamed from: c */
    public static C90752i m148229c(CharSequence charSequence) {
        return new C90751h(charSequence, false);
    }

    /* renamed from: d */
    public static C90752i m148230d(Number number) {
        return new C90751h(number, false);
    }

    /* renamed from: e */
    public static C90752i m148231e(Object obj) {
        return new C90751h(obj, false);
    }

    /* renamed from: f */
    public static C90752i m148232f(Date date) {
        return new C90751h(new C90750g(date.getTime(), date), false);
    }

    /* renamed from: g */
    public static C90752i m148233g(CharSequence charSequence) {
        return new C90751h(charSequence, !TextUtils.isEmpty(charSequence));
    }

    /* renamed from: h */
    public static C90752i m148234h(Object obj) {
        return new C90751h(obj, obj != null);
    }

    /* renamed from: i */
    public static C90752i m148235i(Account account) {
        return new C90749f(account == null ? null : account.name);
    }

    /* renamed from: j */
    public static C90752i m148236j(CharSequence charSequence) {
        return new C90749f(charSequence);
    }

    /* renamed from: k */
    protected static String m148237k(CharSequence charSequence) {
        if (charSequence == null) {
            return "[null]";
        }
        return String.format(Locale.US, "[REDACTED-%d]", new Object[]{Integer.valueOf(charSequence.length())});
    }

    /* renamed from: a */
    public abstract Object mo85092a(boolean z);
}
