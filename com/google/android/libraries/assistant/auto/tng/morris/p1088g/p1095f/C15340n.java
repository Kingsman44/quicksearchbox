package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.content.ContentResolver;
import android.content.Context;
import android.widget.ImageView;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.n */
/* compiled from: PG */
public final class C15340n {

    /* renamed from: a */
    public static final C59071e f46034a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.f.n");

    /* renamed from: b */
    public final ContentResolver f46035b;

    /* renamed from: c */
    private final Executor f46036c;

    /* renamed from: d */
    private final Executor f46037d;

    public C15340n(Context context, C60887da daVar, Executor executor) {
        this.f46035b = context.getContentResolver();
        this.f46036c = daVar;
        this.f46037d = executor;
    }

    /* renamed from: a */
    public final void mo22210a(long j, ImageView imageView) {
        C15337k kVar = new C15337k(this, j);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(kVar), this.f46036c);
        Objects.requireNonNull(imageView);
        C15339m mVar = new C15339m(new C15338l(imageView));
        C60922j.m93044g(m, C47810es.m84963c(mVar), this.f46037d);
    }
}
