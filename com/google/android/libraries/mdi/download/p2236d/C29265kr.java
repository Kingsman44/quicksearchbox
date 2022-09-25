package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29338dv;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28926n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.kr */
/* compiled from: PG */
public final /* synthetic */ class C29265kr implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79294a;

    /* renamed from: b */
    public final /* synthetic */ C29402ez f79295b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f79296c;

    /* renamed from: d */
    public final /* synthetic */ C29392ep f79297d;

    /* renamed from: e */
    public final /* synthetic */ C29398ev f79298e;

    /* renamed from: f */
    public final /* synthetic */ C29380ed f79299f;

    /* renamed from: g */
    public final /* synthetic */ int f79300g;

    /* renamed from: h */
    public final /* synthetic */ List f79301h;

    public /* synthetic */ C29265kr(C29290lp lpVar, C29402ez ezVar, C29328dl dlVar, C29392ep epVar, C29398ev evVar, C29380ed edVar, int i, List list) {
        this.f79294a = lpVar;
        this.f79295b = ezVar;
        this.f79296c = dlVar;
        this.f79297d = epVar;
        this.f79298e = evVar;
        this.f79299f = edVar;
        this.f79300g = i;
        this.f79301h = list;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79294a;
        C29402ez ezVar = this.f79295b;
        C29328dl dlVar = this.f79296c;
        C29392ep epVar = this.f79297d;
        C29398ev evVar = this.f79298e;
        C29380ed edVar = this.f79299f;
        int i = this.f79300g;
        List list = this.f79301h;
        C29338dv dvVar = (C29338dv) obj;
        C29401ey eyVar = (C29401ey) ezVar.toBuilder();
        String str = ezVar.f79714b;
        if (dvVar != null) {
            str = C28926n.m53845b(str, dvVar.f79527d);
        } else if ((dlVar.f79472a & 32) != 0) {
            str = C28926n.m53845b(str, dlVar.f79479h);
        }
        String str2 = str;
        C60870cx c = lpVar.mo34639c(epVar);
        C29264kq kqVar = new C29264kq(lpVar, eyVar, evVar, str2, epVar, dlVar, dvVar, edVar, i, list);
        return C60922j.m93045h(c, C47810es.m84966f(kqVar), lpVar.f79395k);
    }
}
