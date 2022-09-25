package com.google.android.apps.gsa.opa.p6447h;

import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;

/* renamed from: com.google.android.apps.gsa.opa.h.e */
/* compiled from: PG */
final class C83699e extends Presentation {

    /* renamed from: a */
    final /* synthetic */ C83700f f228142a;

    /* renamed from: b */
    private final int f228143b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83699e(C83700f fVar, Context context, Display display, int i) {
        super(context, display);
        this.f228142a = fVar;
        this.f228143b = i;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f228143b);
        LogoView logoView = (LogoView) findViewById(R.id.sed_opa_logo);
        logoView.mo28225e(14, true);
        float integer = (float) getResources().getInteger(R.integer.sed_opa_logo_size);
        logoView.mo28223c(integer, integer);
        findViewById(R.id.sed_display_root).setOnClickListener(new C83698d(this));
    }
}
