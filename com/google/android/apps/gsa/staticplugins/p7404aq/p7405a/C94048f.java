package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import com.evernote.android.state.BuildConfig;
import java.util.Collection;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.f */
/* compiled from: PG */
public abstract class C94048f {

    /* renamed from: a */
    private static final Pattern f262698a = Pattern.compile("[\\Q/|*+?=;[]()<>${}\"\\\\E]");

    /* renamed from: b */
    static String m155250b(String str) {
        return f262698a.matcher(str).replaceAll(BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public abstract Collection mo88313a();
}
