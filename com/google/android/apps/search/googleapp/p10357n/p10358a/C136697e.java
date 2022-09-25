package com.google.android.apps.search.googleapp.p10357n.p10358a;

import android.net.Uri;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46681b;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54112k;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54118q;

/* renamed from: com.google.android.apps.search.googleapp.n.a.e */
/* compiled from: PG */
public final class C136697e {

    /* renamed from: a */
    public final C136702j f372094a;

    /* renamed from: b */
    public final C136693a f372095b;

    /* renamed from: c */
    private final C46723bg f372096c;

    /* renamed from: d */
    private final C46407v f372097d;

    public C136697e(C46407v vVar, C136702j jVar, C136693a aVar, C46723bg bgVar) {
        this.f372097d = vVar;
        this.f372094a = jVar;
        this.f372095b = aVar;
        this.f372096c = bgVar;
    }

    /* renamed from: a */
    public final C60870cx mo113331a(C136707o oVar) {
        C46723bg bgVar = this.f372096c;
        C136693a aVar = this.f372095b;
        Uri parse = Uri.parse(oVar.f372121b);
        long j = oVar.f372122c;
        int a = C54112k.m87142a(oVar.f372123d);
        if (a == 0) {
            a = 1;
        }
        int a2 = C136709q.m222285a(oVar.f372124e);
        if (a2 == 0) {
            a2 = 1;
        }
        C54118q a3 = aVar.mo113330a(parse, j, a, a2);
        int a4 = C136709q.m222285a(oVar.f372124e);
        if (a4 == 0) {
            a4 = 1;
        }
        C136704l lVar = (C136704l) C136705m.f372112d.createBuilder();
        lVar.copyOnWrite();
        C136705m mVar = (C136705m) lVar.instance;
        a3.getClass();
        mVar.f372115b = a3;
        mVar.f372114a |= 1;
        lVar.copyOnWrite();
        C136705m mVar2 = (C136705m) lVar.instance;
        mVar2.f372116c = a4 - 1;
        mVar2.f372114a |= 2;
        return bgVar.mo50750c(new C46681b("GoogleOnContentGwsDataService", this.f372097d, (C136705m) lVar.build(), new C136696d(this, a3, a4)), C46788de.FEW_HOURS);
    }
}
