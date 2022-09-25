package com.bumptech.glide.load.p297b;

import android.net.Uri;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.p290g.C5602e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.bq */
/* compiled from: PG */
public final class C5792bq implements C5764ap {

    /* renamed from: a */
    private static final Set f17384a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: b */
    private final C5790bo f17385b;

    public C5792bq(C5790bo boVar) {
        this.f17385b = boVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        Uri uri = (Uri) obj;
        return new C5763ao(new C5602e(uri), Collections.emptyList(), this.f17385b.mo12286a(uri));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11929b(Object obj) {
        return f17384a.contains(((Uri) obj).getScheme());
    }
}
