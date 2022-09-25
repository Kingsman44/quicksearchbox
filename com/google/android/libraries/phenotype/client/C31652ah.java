package com.google.android.libraries.phenotype.client;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.phenotype.client.ah */
/* compiled from: PG */
public final class C31652ah {

    /* renamed from: a */
    public final String f85137a;

    /* renamed from: b */
    public final Uri f85138b;

    /* renamed from: c */
    public final String f85139c;

    /* renamed from: d */
    public final String f85140d;

    /* renamed from: e */
    public final boolean f85141e;

    /* renamed from: f */
    public final boolean f85142f;

    /* renamed from: g */
    public final boolean f85143g;

    /* renamed from: h */
    public final boolean f85144h;

    /* renamed from: i */
    final C58817ah f85145i;

    public C31652ah(Uri uri) {
        this((String) null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false);
    }

    public C31652ah(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f85137a = str;
        this.f85138b = uri;
        this.f85139c = str2;
        this.f85140d = str3;
        this.f85141e = z;
        this.f85142f = z2;
        this.f85143g = z3;
        this.f85144h = z4;
        this.f85145i = null;
    }

    /* renamed from: a */
    public final C31652ah mo37296a() {
        return new C31652ah(this.f85137a, this.f85138b, this.f85139c, this.f85140d, this.f85141e, this.f85142f, true, this.f85144h);
    }

    /* renamed from: b */
    public final C31652ah mo37297b() {
        Uri uri = this.f85138b;
        if (uri != null) {
            return new C31652ah(this.f85137a, uri, this.f85139c, this.f85140d, this.f85141e, this.f85142f, this.f85143g, true);
        }
        throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
    }

    /* renamed from: c */
    public final C31652ah mo37298c() {
        if (this.f85139c.isEmpty()) {
            return new C31652ah(this.f85137a, this.f85138b, this.f85139c, this.f85140d, true, this.f85142f, this.f85143g, this.f85144h);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: d */
    public final C31652ah mo37299d(String str) {
        return new C31652ah(this.f85137a, this.f85138b, this.f85139c, str, this.f85141e, this.f85142f, this.f85143g, this.f85144h);
    }

    @Deprecated
    /* renamed from: e */
    public final C31654aj mo37300e(String str, boolean z) {
        return new C31647ac(this, str, Boolean.valueOf(z), false);
    }

    /* renamed from: f */
    public final C31654aj mo37301f(String str, long j) {
        return new C31645aa(this, str, Long.valueOf(j), true);
    }

    /* renamed from: g */
    public final C31654aj mo37302g(String str, boolean z) {
        return new C31647ac(this, str, Boolean.valueOf(z), true);
    }

    public C31652ah(String str) {
        this(str, (Uri) null, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false);
    }
}
