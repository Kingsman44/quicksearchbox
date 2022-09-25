package com.bumptech.glide.load.p297b;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.data.p306a.C5921a;
import com.bumptech.glide.p290g.C5602e;
import java.util.Collections;

/* renamed from: com.bumptech.glide.load.b.aj */
/* compiled from: PG */
public final class C5758aj implements C5764ap {

    /* renamed from: a */
    private final Context f17340a;

    public C5758aj(Context context) {
        this.f17340a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        Uri uri = (Uri) obj;
        return new C5763ao(new C5602e(uri), Collections.emptyList(), new C5757ai(this.f17340a, uri));
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo11929b(Object obj) {
        return C5921a.m15287a((Uri) obj);
    }
}
