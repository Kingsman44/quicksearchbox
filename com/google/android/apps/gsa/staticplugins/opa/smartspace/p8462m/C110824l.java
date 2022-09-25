package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110764bi;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.l */
/* compiled from: PG */
public final /* synthetic */ class C110824l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110835w f308769a;

    /* renamed from: b */
    public final /* synthetic */ C83800p f308770b;

    /* renamed from: c */
    public final /* synthetic */ Optional f308771c;

    public /* synthetic */ C110824l(C110835w wVar, C83800p pVar, Optional optional) {
        this.f308769a = wVar;
        this.f308770b = pVar;
        this.f308771c = optional;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110835w wVar = this.f308769a;
        C83800p pVar = this.f308770b;
        Optional optional = this.f308771c;
        Bitmap bitmap = ((BitmapDrawable) ((Drawable) obj)).getBitmap();
        C110764bi biVar = wVar.f308790f;
        C83798n a = pVar.mo77055a();
        a.mo77043b((C83741am) optional.get());
        a.mo77044c(C58485gu.m89846n(bitmap));
        return biVar.mo98871i(C60856cj.m92900i(a.mo77042a()));
    }
}
