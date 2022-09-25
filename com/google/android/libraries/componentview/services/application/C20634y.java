package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.services.application.y */
/* compiled from: PG */
public final class C20634y extends C20579bf {

    /* renamed from: a */
    public static final Charset f57872a = Charset.forName("ISO-8859-1");

    /* renamed from: b */
    public static final C20577bd f57873b = C20577bd.m38612b("Location");

    /* renamed from: c */
    public final Context f57874c;

    /* renamed from: d */
    private final C60887da f57875d;

    public C20634y(Context context, ExecutorService executorService) {
        this.f57874c = context.getApplicationContext();
        this.f57875d = C60895di.m92995a(executorService);
    }

    /* renamed from: c */
    public final C60870cx mo25518c(Uri uri, Map map, boolean z) {
        return C60846c.m92879h(this.f57875d.mo19399b(new C20632w(this, uri, map, z)), Throwable.class, new C20633x(), this.f57875d);
    }
}
