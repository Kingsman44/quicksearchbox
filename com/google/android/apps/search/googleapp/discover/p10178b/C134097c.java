package com.google.android.apps.search.googleapp.discover.p10178b;

import android.content.Context;
import com.google.android.gms.p10725a.p10726a.p10728b.C142668a;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.googleapp.discover.b.c */
/* compiled from: PG */
public final class C134097c {

    /* renamed from: a */
    public final C60887da f365282a;

    /* renamed from: b */
    public final Context f365283b;

    /* renamed from: c */
    private final String f365284c;

    /* renamed from: d */
    private C142668a f365285d;

    public C134097c(C60887da daVar, Context context, String str) {
        this.f365282a = daVar;
        this.f365283b = context;
        this.f365284c = "googleapp.a.".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public final synchronized C142668a mo111558a() {
        if (this.f365285d == null) {
            this.f365285d = new C142668a(this.f365284c, this.f365283b);
        }
        return this.f365285d;
    }
}
