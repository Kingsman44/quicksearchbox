package com.google.android.libraries.web.base;

import android.webkit.WebResourceResponse;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import java.io.IOException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.base.g */
/* compiled from: PG */
public final class C43256g {

    /* renamed from: a */
    public final WebResourceResponse f113052a;

    /* renamed from: b */
    public String f113053b;

    /* renamed from: c */
    private final Function f113054c;

    public C43256g(C44082a aVar, WebResourceResponse webResourceResponse, Function function) {
        aVar.getClass();
        this.f113052a = webResourceResponse;
        this.f113054c = function;
    }

    /* renamed from: a */
    public final C43363h mo46366a(IOException iOException) {
        return (C43363h) this.f113054c.apply(iOException);
    }
}
