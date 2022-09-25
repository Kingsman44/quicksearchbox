package com.google.android.apps.search.weather.p10689h;

import android.content.DialogInterface;
import com.google.android.apps.search.weather.p10689h.p10690a.C142095a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.weather.h.g */
/* compiled from: PG */
public final /* synthetic */ class C142101g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C142102h f385519a;

    public /* synthetic */ C142101g(C142102h hVar) {
        this.f385519a = hVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C142102h hVar = this.f385519a;
        boolean z = hVar.f385523d;
        if (z != hVar.f385522c) {
            C47393f.m84235f(new C142095a(z), hVar.f385520a);
        }
        hVar.f385520a.dismiss();
    }
}
