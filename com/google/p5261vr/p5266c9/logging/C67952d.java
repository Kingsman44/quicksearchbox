package com.google.p5261vr.p5266c9.logging;

import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import java.util.regex.Pattern;

/* renamed from: com.google.vr.c9.logging.d */
/* compiled from: PG */
public final class C67952d {

    /* renamed from: a */
    static final Pattern f184158a = Pattern.compile("(\\p{Alnum}+)\\.client_frame_log");

    /* renamed from: b */
    public volatile boolean f184159b = false;

    /* renamed from: c */
    public final ClearcutEventLogger f184160c;

    public C67952d(Context context, C143658k kVar) {
        this.f184160c = new ClearcutEventLogger(context, kVar);
    }
}
