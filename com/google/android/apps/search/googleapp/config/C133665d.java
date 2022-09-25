package com.google.android.apps.search.googleapp.config;

import android.content.Context;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.config.d */
/* compiled from: PG */
public final class C133665d {

    /* renamed from: a */
    public final Object f364078a = new Object();

    /* renamed from: b */
    public final Context f364079b;

    /* renamed from: c */
    public final C42876ab f364080c;

    /* renamed from: d */
    public C60870cx f364081d;

    /* renamed from: e */
    private final String f364082e;

    /* renamed from: f */
    private final Executor f364083f;

    /* renamed from: g */
    private final String f364084g;

    public C133665d(String str, Context context, C42876ab abVar, Executor executor, String str2) {
        this.f364082e = str;
        this.f364079b = context;
        this.f364080c = abVar;
        this.f364083f = executor;
        this.f364084g = str2;
    }

    /* renamed from: a */
    public final C60870cx mo111320a() {
        C60870cx j;
        synchronized (this.f364078a) {
            if (this.f364081d == null) {
                C60870cx d = this.f364080c.mo46042d();
                C133663b bVar = new C133663b(this);
                this.f364081d = C60922j.m93044g(d, C47810es.m84963c(bVar), this.f364083f);
            }
            j = C60856cj.m92901j(this.f364081d);
        }
        return j;
    }

    /* renamed from: b */
    public final String mo111321b(String str) {
        String c = mo111322c();
        return str + " " + c;
    }

    /* renamed from: c */
    public final String mo111322c() {
        String format = String.format(Locale.US, "GoogleApp/%s", new Object[]{this.f364082e});
        if (this.f364084g.isEmpty()) {
            return format;
        }
        String str = this.f364084g;
        return format + " " + str;
    }
}
