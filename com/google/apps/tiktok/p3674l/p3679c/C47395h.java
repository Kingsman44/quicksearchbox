package com.google.apps.tiktok.p3674l.p3679c;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.widget.Button;
import com.google.apps.tiktok.tracing.C47525ak;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47562bm;

/* renamed from: com.google.apps.tiktok.l.c.h */
/* compiled from: PG */
public final /* synthetic */ class C47395h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C47400m f123118a;

    /* renamed from: b */
    public final /* synthetic */ C47388b f123119b;

    public /* synthetic */ C47395h(C47400m mVar, C47388b bVar) {
        this.f123118a = mVar;
        this.f123119b = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C47400m mVar = this.f123118a;
        C47388b bVar = this.f123119b;
        Button a = ((C0392m) dialogInterface).f1349a.mo1106a(i);
        if (C47525ak.m84586a(a.getContext())) {
            C47538ax e = mVar.f123127a.mo51615e(i != -3 ? i != -2 ? i != -1 ? "Clicked dialog button" : "Clicked positive dialog button" : "Clicked negative dialog button" : "Clicked neutral dialog button", C47562bm.f123426a);
            try {
                C47393f.m84237h(bVar, a);
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
