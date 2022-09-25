package com.google.android.apps.search.googleapp.recents;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.recents.p10382a.C137162d;
import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22843n;
import com.google.android.libraries.gsa.p1875j.C22844o;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.recents.f */
/* compiled from: PG */
public final /* synthetic */ class C137172f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137177k f373248a;

    /* renamed from: b */
    public final /* synthetic */ Uri f373249b;

    /* renamed from: c */
    public final /* synthetic */ String f373250c;

    /* renamed from: d */
    public final /* synthetic */ String f373251d;

    /* renamed from: e */
    public final /* synthetic */ C60494rz f373252e;

    /* renamed from: f */
    public final /* synthetic */ long f373253f;

    public /* synthetic */ C137172f(C137177k kVar, Uri uri, String str, String str2, C60494rz rzVar, long j) {
        this.f373248a = kVar;
        this.f373249b = uri;
        this.f373250c = str;
        this.f373251d = str2;
        this.f373252e = rzVar;
        this.f373253f = j;
    }

    public final C60870cx apply(Object obj) {
        C22832c cVar;
        C137177k kVar = this.f373248a;
        Uri uri = this.f373249b;
        String str = this.f373250c;
        String str2 = this.f373251d;
        C60494rz rzVar = this.f373252e;
        long j = this.f373253f;
        Boolean bool = (Boolean) obj;
        C137162d dVar = kVar.f373268b;
        if (!dVar.f373227d) {
            return C60866ct.f164955a;
        }
        String replaceFirst = str2.replaceFirst("^www\\.", BuildConfig.FLAVOR);
        C22843n nVar = (C22843n) C22844o.f62884e.createBuilder();
        String uri2 = uri.toString();
        nVar.copyOnWrite();
        C22844o oVar = (C22844o) nVar.instance;
        uri2.getClass();
        oVar.f62886a |= 1;
        oVar.f62887b = uri2;
        nVar.copyOnWrite();
        C22844o oVar2 = (C22844o) nVar.instance;
        replaceFirst.getClass();
        oVar2.f62886a |= 2;
        oVar2.f62888c = replaceFirst;
        nVar.copyOnWrite();
        C22844o oVar3 = (C22844o) nVar.instance;
        str.getClass();
        oVar3.f62886a |= 4;
        oVar3.f62889d = str;
        C22844o oVar4 = (C22844o) nVar.build();
        if (rzVar.equals(C60494rz.NOW)) {
            cVar = dVar.mo113576a(BuildConfig.FLAVOR, j);
        } else {
            cVar = dVar.mo113576a(str, j);
        }
        cVar.copyOnWrite();
        C22845p pVar = (C22845p) cVar.instance;
        C22845p pVar2 = C22845p.f62890o;
        pVar.f62894c = 1;
        pVar.f62892a |= 2;
        int i = rzVar.f163762v;
        cVar.copyOnWrite();
        C22845p pVar3 = (C22845p) cVar.instance;
        pVar3.f62892a |= 256;
        pVar3.f62900i = i;
        cVar.copyOnWrite();
        C22845p pVar4 = (C22845p) cVar.instance;
        oVar4.getClass();
        pVar4.f62897f = oVar4;
        pVar4.f62892a |= 32;
        cVar.copyOnWrite();
        C22845p pVar5 = (C22845p) cVar.instance;
        pVar5.f62892a |= 128;
        pVar5.f62899h = j;
        return dVar.mo113577b((C22845p) cVar.build());
    }
}
