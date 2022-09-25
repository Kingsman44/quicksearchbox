package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cy */
/* compiled from: PG */
public final /* synthetic */ class C113354cy implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C113367dh f313880a;

    /* renamed from: b */
    public final /* synthetic */ String f313881b;

    public /* synthetic */ C113354cy(C113367dh dhVar, String str) {
        this.f313880a = dhVar;
        this.f313881b = str;
    }

    public final Object apply(Object obj) {
        C113367dh dhVar = this.f313880a;
        String str = this.f313881b;
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            dhVar.f313910d.f314084a.put(str, drawable);
            return drawable;
        }
        throw new Resources.NotFoundException("imageLoader#load returned null drawable");
    }
}
