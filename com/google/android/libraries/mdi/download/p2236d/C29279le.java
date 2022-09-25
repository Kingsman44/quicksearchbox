package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28786ca;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2230c.C28771f;
import com.google.android.libraries.mdi.download.p2230c.C28773h;
import com.google.android.libraries.mdi.download.p2230c.C28780o;
import com.google.android.libraries.mdi.download.p2230c.C28781p;
import com.google.android.libraries.mdi.download.p2230c.C28782q;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28925m;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28933u;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.le */
/* compiled from: PG */
public final /* synthetic */ class C29279le implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79340a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f79341b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f79342c;

    /* renamed from: d */
    public final /* synthetic */ C29398ev f79343d;

    /* renamed from: e */
    public final /* synthetic */ C29392ep f79344e;

    /* renamed from: f */
    public final /* synthetic */ int f79345f;

    /* renamed from: g */
    public final /* synthetic */ long f79346g;

    /* renamed from: h */
    public final /* synthetic */ String f79347h;

    /* renamed from: i */
    public final /* synthetic */ C29380ed f79348i;

    /* renamed from: j */
    public final /* synthetic */ C28786ca f79349j;

    public /* synthetic */ C29279le(C29290lp lpVar, C60870cx cxVar, C29328dl dlVar, C29398ev evVar, C29392ep epVar, int i, long j, String str, C29380ed edVar, C28786ca caVar) {
        this.f79340a = lpVar;
        this.f79341b = cxVar;
        this.f79342c = dlVar;
        this.f79343d = evVar;
        this.f79344e = epVar;
        this.f79345f = i;
        this.f79346g = j;
        this.f79347h = str;
        this.f79348i = edVar;
        this.f79349j = caVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C29290lp lpVar = this.f79340a;
        C60870cx cxVar2 = this.f79341b;
        C29328dl dlVar = this.f79342c;
        C29398ev evVar = this.f79343d;
        C29392ep epVar = this.f79344e;
        int i = this.f79345f;
        long j = this.f79346g;
        String str = this.f79347h;
        C29380ed edVar = this.f79348i;
        C28786ca caVar = this.f79349j;
        Boolean bool = (Boolean) obj;
        Uri uri = (Uri) C60856cj.m92909r(cxVar2);
        C29293ls lsVar = lpVar.f79387c;
        C42813k kVar = lpVar.f79389e;
        int a = C29332dp.m54217a(evVar.f79704e);
        int i2 = a == 0 ? 1 : a;
        C28925m mVar = r3;
        C28786ca caVar2 = caVar;
        C29380ed edVar2 = edVar;
        Uri uri2 = uri;
        C29328dl dlVar2 = dlVar;
        C28925m mVar2 = new C28925m(lsVar, kVar, dlVar, i2, lpVar.f79392h, epVar, i, j, str, lpVar.f79393i, lpVar.f79395k);
        C28933u uVar = lpVar.f79388d;
        String str2 = dlVar2.f79474c;
        int i3 = dlVar2.f79475d;
        Uri uri3 = uri2;
        if (uVar.f78593e.containsKey(uri3)) {
            return (C60870cx) uVar.f78593e.get(uri3);
        }
        try {
            C28933u.m53852c(uVar.f78589a, (long) i3, edVar2, uVar.f78592d);
            C28780o g = C28781p.m53690g();
            g.mo34395h(str2);
            g.mo34393f(uri3);
            ((C28771f) g).f78214a = C58833ax.m90834k(new C28773h(caVar2));
            cxVar = ((C28782q) uVar.f78590b.mo6453a()).mo34371b(g.mo34409i());
        } catch (C28738bp e) {
            C29045l.m53936h("%s: Not enough space to download file %s", "MddFileDownloader", str2);
            cxVar = C60856cj.m92899h(e);
        }
        return uVar.mo34509a(uri3, mVar, cxVar);
    }
}
