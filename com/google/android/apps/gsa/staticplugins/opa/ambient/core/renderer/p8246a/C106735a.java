package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8246a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.smartspace.C92125t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.a.a */
/* compiled from: PG */
public final /* synthetic */ class C106735a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f297454a;

    /* renamed from: b */
    public final /* synthetic */ Intent f297455b;

    /* renamed from: c */
    public final /* synthetic */ C92125t f297456c;

    /* renamed from: d */
    public final /* synthetic */ TextView f297457d;

    public /* synthetic */ C106735a(Context context, Intent intent, C92125t tVar, TextView textView) {
        this.f297454a = context;
        this.f297455b = intent;
        this.f297456c = tVar;
        this.f297457d = textView;
    }

    public final void onClick(View view) {
        Context context = this.f297454a;
        Intent intent = this.f297455b;
        C92125t tVar = this.f297456c;
        TextView textView = this.f297457d;
        context.startActivity(intent);
        tVar.mo86710o(textView);
    }
}
