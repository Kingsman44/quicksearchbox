package com.bumptech.glide.load.p297b.p298a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.data.p306a.C5921a;
import com.bumptech.glide.load.data.p306a.C5922b;
import com.bumptech.glide.load.data.p306a.C5924d;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.bumptech.glide.p290g.C5602e;
import java.util.Collections;

/* renamed from: com.bumptech.glide.load.b.a.d */
/* compiled from: PG */
public final class C5739d implements C5764ap {

    /* renamed from: a */
    private final Context f17298a;

    public C5739d(Context context) {
        this.f17298a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        Uri uri = (Uri) obj;
        if (!C5921a.m15288b(i, i2)) {
            return null;
        }
        C5602e eVar = new C5602e(uri);
        Context context = this.f17298a;
        return new C5763ao(eVar, Collections.emptyList(), C5924d.m15292f(context, uri, new C5922b(context.getContentResolver())));
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo11929b(Object obj) {
        Uri uri = (Uri) obj;
        return C5921a.m15287a(uri) && !C5921a.m15289c(uri);
    }
}
