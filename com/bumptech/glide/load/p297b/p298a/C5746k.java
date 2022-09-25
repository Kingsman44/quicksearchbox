package com.bumptech.glide.load.p297b.p298a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.data.p306a.C5921a;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.bumptech.glide.p290g.C5602e;
import java.util.Collections;

/* renamed from: com.bumptech.glide.load.b.a.k */
/* compiled from: PG */
public final class C5746k implements C5764ap {

    /* renamed from: a */
    private final Context f17314a;

    /* renamed from: b */
    private final C5764ap f17315b;

    /* renamed from: c */
    private final C5764ap f17316c;

    /* renamed from: d */
    private final Class f17317d;

    public C5746k(Context context, C5764ap apVar, C5764ap apVar2, Class cls) {
        this.f17314a = context.getApplicationContext();
        this.f17315b = apVar;
        this.f17316c = apVar2;
        this.f17317d = cls;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        Uri uri = (Uri) obj;
        return new C5763ao(new C5602e(uri), Collections.emptyList(), new C5745j(this.f17314a, this.f17315b, this.f17316c, uri, i, i2, sVar, this.f17317d));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11929b(Object obj) {
        return C5921a.m15287a((Uri) obj);
    }
}
