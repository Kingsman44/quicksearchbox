package com.bumptech.glide.load.p297b;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C5960s;
import java.io.File;

/* renamed from: com.bumptech.glide.load.b.bi */
/* compiled from: PG */
public final class C5784bi implements C5764ap {

    /* renamed from: a */
    private final C5764ap f17377a;

    public C5784bi(C5764ap apVar) {
        this.f17377a = apVar;
    }

    /* renamed from: c */
    private static Uri m14961c(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = m14961c(str);
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? m14961c(str) : parse;
        }
        if (uri == null || !this.f17377a.mo11929b(uri)) {
            return null;
        }
        return this.f17377a.mo11928a(uri, i, i2, sVar);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo11929b(Object obj) {
        String str = (String) obj;
        return true;
    }
}
