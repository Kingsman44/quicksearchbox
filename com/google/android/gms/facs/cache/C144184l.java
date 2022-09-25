package com.google.android.gms.facs.cache;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;
import com.google.p4184bj.p4193c.p4197c.C55964bk;

/* renamed from: com.google.android.gms.facs.cache.l */
/* compiled from: PG */
public final class C144184l extends C143847s {

    /* renamed from: a */
    private static final C143840l f390494a;

    /* renamed from: b */
    private static final C143707a f390495b;

    /* renamed from: c */
    private static final C143841m f390496c;

    static {
        C143840l lVar = new C143840l();
        f390494a = lVar;
        C144179g gVar = new C144179g();
        f390495b = gVar;
        f390496c = new C143841m("FacsCache.API", gVar, lVar);
    }

    public C144184l(Context context, C144174b bVar) {
        super(context, (Activity) null, f390496c, bVar, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo119716a(FacsCacheCallOptions facsCacheCallOptions) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144177e(facsCacheCallOptions);
        dcVar.f389863d = 1801;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo119717b(FacsCacheCallOptions facsCacheCallOptions) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144176d(facsCacheCallOptions);
        dcVar.f389863d = 1803;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo119718c(C55964bk bkVar, FacsCacheCallOptions facsCacheCallOptions) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144178f(bkVar, facsCacheCallOptions);
        dcVar.f389863d = 1802;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
