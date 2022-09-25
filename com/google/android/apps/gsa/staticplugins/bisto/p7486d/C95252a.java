package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89665h;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.a */
/* compiled from: PG */
public final /* synthetic */ class C95252a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C95258g f266495a;

    /* renamed from: b */
    public final /* synthetic */ int f266496b;

    /* renamed from: c */
    public final /* synthetic */ C89665h f266497c;

    /* renamed from: d */
    public final /* synthetic */ Map f266498d;

    /* renamed from: e */
    public final /* synthetic */ C95260i f266499e;

    public /* synthetic */ C95252a(C95258g gVar, int i, C89665h hVar, Map map, C95260i iVar) {
        this.f266495a = gVar;
        this.f266496b = i;
        this.f266497c = hVar;
        this.f266498d = map;
        this.f266499e = iVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C95258g gVar = this.f266495a;
        int i = this.f266496b;
        C89665h hVar = this.f266497c;
        Map map = this.f266498d;
        C95260i iVar = this.f266499e;
        Map map2 = (Map) obj;
        C22871g gVar2 = gVar.f266511b;
        C95261j jVar = gVar.f266514e;
        if (i == 1) {
            cxVar = jVar.f266543a.mo89138c();
        } else {
            cxVar = jVar.f266543a.mo89140d();
        }
        C60870cx j = gVar2.mo28210j(cxVar, "set audio path", new C95255d(hVar));
        return gVar.f266511b.mo28209i(j, String.format(Locale.US, "start testing profile=%d", new Object[]{Integer.valueOf(i)}), new C95256e(i, map, iVar));
    }
}
