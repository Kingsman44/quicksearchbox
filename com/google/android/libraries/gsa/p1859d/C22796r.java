package com.google.android.libraries.gsa.p1859d;

import android.net.Uri;

/* renamed from: com.google.android.libraries.gsa.d.r */
/* compiled from: PG */
public final class C22796r {

    /* renamed from: a */
    public static final Uri f62756a;

    /* renamed from: b */
    public static final Uri f62757b;

    static {
        Uri parse = Uri.parse("content://com.google.android.googlequicksearchbox.GsaPublicContentProvider");
        f62756a = parse;
        f62757b = parse.buildUpon().appendPath("publicvalue").appendPath("qsb.superg.animation").build();
    }
}
