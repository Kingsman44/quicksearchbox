package com.google.android.apps.gsa.shared.util.p7158b;

import java.util.regex.Matcher;

/* renamed from: com.google.android.apps.gsa.shared.util.b.f */
/* compiled from: PG */
final class C90749f extends C90752i {

    /* renamed from: a */
    final /* synthetic */ CharSequence f253823a;

    public C90749f(CharSequence charSequence) {
        this.f253823a = charSequence;
    }

    /* renamed from: a */
    public final Object mo85092a(boolean z) {
        CharSequence charSequence = this.f253823a;
        if (charSequence == null) {
            return "null";
        }
        if (z) {
            return charSequence;
        }
        Matcher matcher = C90752i.f253827b.matcher(charSequence);
        if (matcher.matches()) {
            return String.valueOf(m148237k(matcher.group(1))).concat("@google.com");
        }
        return m148237k(this.f253823a);
    }
}
