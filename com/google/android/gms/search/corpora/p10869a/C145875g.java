package com.google.android.gms.search.corpora.p10869a;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.search.corpora.C145885i;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.search.corpora.a.g */
/* compiled from: PG */
public final class C145875g extends C143847s implements C145885i {

    /* renamed from: a */
    private static final C143840l f394424a;

    /* renamed from: b */
    private static final C143707a f394425b;

    /* renamed from: c */
    private static final C143841m f394426c;

    static {
        C143840l lVar = new C143840l();
        f394424a = lVar;
        C145874f fVar = new C145874f();
        f394425b = fVar;
        f394426c = new C143841m("SearchIndex.CORPORA_API", fVar, lVar);
    }

    public C145875g(Context context) {
        super(context, (Activity) null, f394426c, (C143724i) null, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo122258a() {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145873e();
        dcVar.f389863d = 8109;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo122259b(String str) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145872d(str);
        dcVar.f389863d = 8112;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
