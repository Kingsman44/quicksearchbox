package com.google.android.apps.gsa.staticplugins.p8163o;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.p10890h.p10891a.p10893b.C146582m;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.al */
/* compiled from: PG */
final class C105801al implements C146582m {

    /* renamed from: a */
    final /* synthetic */ String f295155a;

    /* renamed from: b */
    final /* synthetic */ Uri[] f295156b;

    /* renamed from: c */
    final /* synthetic */ int f295157c;

    /* renamed from: d */
    final /* synthetic */ C86124t f295158d;

    /* renamed from: e */
    final /* synthetic */ Uri f295159e;

    public C105801al(String str, Uri[] uriArr, int i, C86124t tVar, Uri uri) {
        this.f295155a = str;
        this.f295156b = uriArr;
        this.f295157c = i;
        this.f295158d = tVar;
        this.f295159e = uri;
    }

    /* renamed from: a */
    public final String mo95063a() {
        return this.f295156b[this.f295157c].toString();
    }

    /* renamed from: b */
    public final String mo95064b() {
        return this.f295155a;
    }

    /* renamed from: c */
    public final List mo95065c() {
        C58480gp e = C58485gu.m89837e();
        for (Integer longValue : this.f295158d.mo79759y()) {
            e.mo55395g(Long.valueOf(longValue.longValue()));
        }
        return e.mo55394f();
    }

    /* renamed from: d */
    public final boolean mo95066d() {
        return "file".equals(this.f295156b[this.f295157c].getScheme()) || C58832aw.m90831a(this.f295156b[this.f295157c], this.f295159e);
    }
}
