package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28786ca;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.kt */
/* compiled from: PG */
public final /* synthetic */ class C29267kt implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79304a;

    /* renamed from: b */
    public final /* synthetic */ C29401ey f79305b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f79306c;

    /* renamed from: d */
    public final /* synthetic */ String f79307d;

    /* renamed from: e */
    public final /* synthetic */ C29392ep f79308e;

    /* renamed from: f */
    public final /* synthetic */ C29328dl f79309f;

    /* renamed from: g */
    public final /* synthetic */ C29380ed f79310g;

    /* renamed from: h */
    public final /* synthetic */ C28786ca f79311h;

    public /* synthetic */ C29267kt(C29290lp lpVar, C29401ey eyVar, C29398ev evVar, String str, C29392ep epVar, C29328dl dlVar, C29380ed edVar, C28786ca caVar) {
        this.f79304a = lpVar;
        this.f79305b = eyVar;
        this.f79306c = evVar;
        this.f79307d = str;
        this.f79308e = epVar;
        this.f79309f = dlVar;
        this.f79310g = edVar;
        this.f79311h = caVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79304a;
        C29401ey eyVar = this.f79305b;
        C29398ev evVar = this.f79306c;
        String str = this.f79307d;
        C29392ep epVar = this.f79308e;
        C29328dl dlVar = this.f79309f;
        C29380ed edVar = this.f79310g;
        C28786ca caVar = this.f79311h;
        C29334dr drVar = (C29334dr) obj;
        int i = drVar.f79503e;
        long j = drVar.f79516r;
        String str2 = drVar.f79517s;
        int a = C29332dp.m54217a(evVar.f79704e);
        if (a == 0) {
            a = 1;
        }
        C60870cx j2 = lpVar.mo34646j(a, str, dlVar.f79477f);
        return C29670b.m54719g(j2).mo34822i(new C29278ld(lpVar, eyVar, evVar), lpVar.f79395k).mo34822i(new C29279le(lpVar, j2, dlVar, evVar, epVar, i, j, str2, edVar, caVar), lpVar.f79395k);
    }
}
