package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110016c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.d */
/* compiled from: PG */
public final class C110093d {

    /* renamed from: a */
    public final Context f306732a;

    /* renamed from: b */
    public final C86124t f306733b;

    /* renamed from: c */
    public final C58833ax f306734c;

    /* renamed from: d */
    public final C110016c f306735d;

    /* renamed from: e */
    private final Activity f306736e;

    /* renamed from: f */
    private ImageView f306737f;

    public C110093d(Context context, Activity activity, C86124t tVar, C58833ax axVar, C110016c cVar) {
        this.f306732a = context;
        this.f306736e = activity;
        this.f306733b = tVar;
        this.f306734c = axVar;
        this.f306735d = cVar;
    }

    /* renamed from: a */
    public final ImageView mo98370a(e eVar, int i, int i2) {
        if (this.f306737f == null) {
            this.f306737f = (ImageView) LayoutInflater.from(this.f306736e).inflate(i, (ViewGroup) null);
            C28292j jVar = new C28292j(i2);
            jVar.mo33795i(5);
            ImageView imageView = this.f306737f;
            imageView.getClass();
            C28295m.m52919e(imageView, jVar);
            ImageView imageView2 = this.f306737f;
            imageView2.getClass();
            imageView2.setOnClickListener(new C89943l(new C110092c(this, eVar)));
        }
        ImageView imageView3 = this.f306737f;
        imageView3.getClass();
        return imageView3;
    }
}
