package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29338dv;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.kq */
/* compiled from: PG */
public final /* synthetic */ class C29264kq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79284a;

    /* renamed from: b */
    public final /* synthetic */ C29401ey f79285b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f79286c;

    /* renamed from: d */
    public final /* synthetic */ String f79287d;

    /* renamed from: e */
    public final /* synthetic */ C29392ep f79288e;

    /* renamed from: f */
    public final /* synthetic */ C29328dl f79289f;

    /* renamed from: g */
    public final /* synthetic */ C29338dv f79290g;

    /* renamed from: h */
    public final /* synthetic */ C29380ed f79291h;

    /* renamed from: i */
    public final /* synthetic */ int f79292i;

    /* renamed from: j */
    public final /* synthetic */ List f79293j;

    public /* synthetic */ C29264kq(C29290lp lpVar, C29401ey eyVar, C29398ev evVar, String str, C29392ep epVar, C29328dl dlVar, C29338dv dvVar, C29380ed edVar, int i, List list) {
        this.f79284a = lpVar;
        this.f79285b = eyVar;
        this.f79286c = evVar;
        this.f79287d = str;
        this.f79288e = epVar;
        this.f79289f = dlVar;
        this.f79290g = dvVar;
        this.f79291h = edVar;
        this.f79292i = i;
        this.f79293j = list;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79284a;
        C29401ey eyVar = this.f79285b;
        C29398ev evVar = this.f79286c;
        String str = this.f79287d;
        C29392ep epVar = this.f79288e;
        C29328dl dlVar = this.f79289f;
        C29338dv dvVar = this.f79290g;
        C29380ed edVar = this.f79291h;
        int i = this.f79292i;
        List list = this.f79293j;
        C29334dr drVar = (C29334dr) obj;
        int i2 = drVar.f79503e;
        long j = drVar.f79516r;
        String str2 = drVar.f79517s;
        int a = C29332dp.m54217a(evVar.f79704e);
        if (a == 0) {
            a = 1;
        }
        C60870cx j2 = lpVar.mo34646j(a, str, dlVar.f79477f);
        C29670b i3 = C29670b.m54719g(j2).mo34822i(new C29285lk(lpVar, eyVar, evVar), lpVar.f79395k);
        C29286ll llVar = r1;
        C29286ll llVar2 = new C29286ll(lpVar, j2, dvVar, dlVar, evVar, epVar, i2, j, str2, edVar, i, list);
        return i3.mo34822i(llVar, lpVar.f79395k);
    }
}
