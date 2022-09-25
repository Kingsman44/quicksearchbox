package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6007z;

/* renamed from: com.google.android.libraries.componentview.services.application.bg */
/* compiled from: PG */
public final /* synthetic */ class C20580bg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C20582bi f57763a;

    /* renamed from: b */
    public final /* synthetic */ C6007z f57764b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f57765c;

    public /* synthetic */ C20580bg(C20582bi biVar, C6007z zVar, ImageView imageView) {
        this.f57763a = biVar;
        this.f57764b = zVar;
        this.f57765c = imageView;
    }

    public final void run() {
        C20582bi biVar = this.f57763a;
        C6007z zVar = this.f57764b;
        ImageView imageView = this.f57765c;
        Context context = biVar.f57769a;
        C5543d.m14323c(context).mo12423b(context).mo11887u();
        zVar.mo12454r(imageView);
    }
}
