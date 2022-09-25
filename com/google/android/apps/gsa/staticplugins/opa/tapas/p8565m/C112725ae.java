package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.widget.ImageView;
import android.widget.TextView;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ae */
/* compiled from: PG */
final class C112725ae extends C112923hn {

    /* renamed from: a */
    public TextView f312483a;

    /* renamed from: b */
    public ImageView f312484b;

    /* renamed from: c */
    public Optional f312485c = Optional.empty();

    /* renamed from: d */
    public Optional f312486d = Optional.empty();

    /* renamed from: e */
    private String f312487e;

    /* renamed from: a */
    public final C112924ho mo99701a() {
        ImageView imageView;
        String str;
        TextView textView = this.f312483a;
        if (textView != null && (imageView = this.f312484b) != null && (str = this.f312487e) != null) {
            return new C112726af(textView, imageView, str, this.f312485c, this.f312486d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f312483a == null) {
            sb.append(" textView");
        }
        if (this.f312484b == null) {
            sb.append(" iconView");
        }
        if (this.f312487e == null) {
            sb.append(" primaryText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo99702b(String str) {
        if (str != null) {
            this.f312487e = str;
            return;
        }
        throw new NullPointerException("Null primaryText");
    }
}
