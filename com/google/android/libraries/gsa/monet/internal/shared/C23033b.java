package com.google.android.libraries.gsa.monet.internal.shared;

import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.b */
/* compiled from: PG */
public final class C23033b {

    /* renamed from: a */
    private static final Pattern f63366a = Pattern.compile("[a-zA-Z0-9_\\-]+");

    /* renamed from: a */
    public static String m43154a(String str, String str2) {
        C23067b.m43230c(f63366a.matcher(str2).matches(), "Invalid child name: %s", str2);
        return String.format("%s/%s", new Object[]{str, str2});
    }
}
