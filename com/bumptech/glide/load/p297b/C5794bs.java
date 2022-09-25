package com.bumptech.glide.load.p297b;

import android.net.Uri;
import com.bumptech.glide.load.C5960s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.bs */
/* compiled from: PG */
public final class C5794bs implements C5764ap {

    /* renamed from: a */
    private static final Set f17386a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: b */
    private final C5764ap f17387b;

    public C5794bs(C5764ap apVar) {
        this.f17387b = apVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        return this.f17387b.mo11928a(new C5750ab(((Uri) obj).toString(), C5751ac.f17327a), i, i2, sVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11929b(Object obj) {
        return f17386a.contains(((Uri) obj).getScheme());
    }
}
