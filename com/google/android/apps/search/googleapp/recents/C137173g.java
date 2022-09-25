package com.google.android.apps.search.googleapp.recents;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.recents.p10382a.C137162d;
import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22841l;
import com.google.android.libraries.gsa.p1875j.C22842m;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.recents.g */
/* compiled from: PG */
public final /* synthetic */ class C137173g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137177k f373254a;

    /* renamed from: b */
    public final /* synthetic */ String f373255b;

    /* renamed from: c */
    public final /* synthetic */ String f373256c;

    /* renamed from: d */
    public final /* synthetic */ String f373257d;

    /* renamed from: e */
    public final /* synthetic */ long f373258e;

    public /* synthetic */ C137173g(C137177k kVar, String str, String str2, String str3, long j) {
        this.f373254a = kVar;
        this.f373255b = str;
        this.f373256c = str2;
        this.f373257d = str3;
        this.f373258e = j;
    }

    public final C60870cx apply(Object obj) {
        C137177k kVar = this.f373254a;
        String str = this.f373255b;
        String str2 = this.f373256c;
        String str3 = this.f373257d;
        long j = this.f373258e;
        Boolean bool = (Boolean) obj;
        C137162d dVar = kVar.f373268b;
        if (!dVar.f373227d) {
            return C60866ct.f164955a;
        }
        C22832c a = dVar.mo113576a(str, j);
        a.copyOnWrite();
        C22845p pVar = (C22845p) a.instance;
        C22845p pVar2 = C22845p.f62890o;
        pVar.f62894c = 0;
        pVar.f62892a |= 2;
        C22841l lVar = (C22841l) C22842m.f62879d.createBuilder();
        lVar.copyOnWrite();
        C22842m mVar = (C22842m) lVar.instance;
        mVar.f62881a |= 1;
        mVar.f62882b = str2;
        String replaceFirst = str3.replaceFirst("^www\\.", BuildConfig.FLAVOR);
        lVar.copyOnWrite();
        C22842m mVar2 = (C22842m) lVar.instance;
        replaceFirst.getClass();
        mVar2.f62881a |= 2;
        mVar2.f62883c = replaceFirst;
        a.copyOnWrite();
        C22845p pVar3 = (C22845p) a.instance;
        C22842m mVar3 = (C22842m) lVar.build();
        mVar3.getClass();
        pVar3.f62898g = mVar3;
        pVar3.f62892a |= 64;
        a.copyOnWrite();
        C22845p pVar4 = (C22845p) a.instance;
        pVar4.f62892a |= 128;
        pVar4.f62899h = j;
        return dVar.mo113577b((C22845p) a.build());
    }
}
