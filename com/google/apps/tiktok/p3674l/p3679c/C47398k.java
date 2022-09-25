package com.google.apps.tiktok.p3674l.p3679c;

import android.view.View;
import com.google.apps.tiktok.tracing.C47525ak;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47562bm;

/* renamed from: com.google.apps.tiktok.l.c.k */
/* compiled from: PG */
public final /* synthetic */ class C47398k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C47400m f123124a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f123125b;

    public /* synthetic */ C47398k(C47400m mVar, View.OnClickListener onClickListener) {
        this.f123124a = mVar;
        this.f123125b = onClickListener;
    }

    public final void onClick(View view) {
        C47400m mVar = this.f123124a;
        View.OnClickListener onClickListener = this.f123125b;
        if (C47525ak.m84586a(view.getContext())) {
            C47538ax e = mVar.f123127a.mo51615e(C47400m.m84244c("Clicked", view), C47562bm.f123426a);
            try {
                onClickListener.onClick(view);
                if (e != null) {
                    e.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47394g.m84242a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
