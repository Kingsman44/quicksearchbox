package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import java.util.Locale;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.bg */
/* compiled from: PG */
public final class C83080bg {
    /* renamed from: a */
    public static String m132477a(String str) {
        return String.format(Locale.ENGLISH, "<redacted size=%d>", new Object[]{Integer.valueOf(str.length())});
    }

    /* renamed from: b */
    public static void m132478b(boolean z, Supplier supplier, Consumer consumer) {
        if (z) {
            consumer.accept(supplier.get());
        }
    }

    /* renamed from: c */
    public static void m132479c(boolean z, Supplier supplier, Consumer consumer, Function function) {
        m132478b(z, new C83079bf(function, supplier), consumer);
    }
}
