package com.google.android.libraries.onegoogle.accountmenu.features.education;

import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.EducationDatabase;
import com.google.common.p4522b.C58480gp;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.e */
/* compiled from: PG */
public final /* synthetic */ class C30587e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82620a;

    /* renamed from: b */
    public final /* synthetic */ EducationDatabase f82621b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f82622c;

    /* renamed from: d */
    public final /* synthetic */ C58480gp f82623d;

    public /* synthetic */ C30587e(C30601s sVar, EducationDatabase educationDatabase, C58480gp gpVar, C58480gp gpVar2) {
        this.f82620a = sVar;
        this.f82621b = educationDatabase;
        this.f82622c = gpVar;
        this.f82623d = gpVar2;
    }

    public final void run() {
        this.f82621b.mo8187v(new C30591i(this.f82620a, this.f82622c, this.f82623d));
    }
}
