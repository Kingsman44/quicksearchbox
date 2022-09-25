package com.google.apps.tiktok.dataservice.local;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46785db;
import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.local.av */
/* compiled from: PG */
final class C46847av {

    /* renamed from: a */
    public final C46785db f122273a;

    /* renamed from: b */
    public C46846au f122274b;

    /* renamed from: c */
    public C46854h f122275c;

    /* renamed from: d */
    public boolean f122276d = false;

    /* renamed from: e */
    public boolean f122277e = false;

    /* renamed from: f */
    private final Executor f122278f;

    public C46847av(C46785db dbVar, Executor executor) {
        this.f122273a = dbVar;
        this.f122278f = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50856a(C46851e eVar) {
        C19559g.m37304c();
        C58838bb.m90883r(!this.f122277e);
        C46846au auVar = this.f122274b;
        if (auVar != null) {
            auVar.close();
            this.f122273a.mo50791e(this.f122274b.f122267a.mo20330a(), this.f122274b);
        }
        C46846au auVar2 = new C46846au(this, eVar, this.f122278f);
        this.f122274b = auVar2;
        this.f122273a.mo50790d(auVar2.f122267a.mo20330a(), this.f122274b);
    }
}
