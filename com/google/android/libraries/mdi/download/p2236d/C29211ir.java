package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29325di;
import com.google.android.libraries.mdi.download.C29327dk;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28927o;
import com.google.android.libraries.mdi.download.p2236d.p2240d.C28963a;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29034aw;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29042i;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29046m;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29059z;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.ir */
/* compiled from: PG */
public final class C29211ir {

    /* renamed from: a */
    public static volatile boolean f79191a = false;

    /* renamed from: b */
    public final Context f79192b;

    /* renamed from: c */
    public final C29037d f79193c;

    /* renamed from: d */
    public final C29117fe f79194d;

    /* renamed from: e */
    public final C29118ff f79195e;

    /* renamed from: f */
    public final C29290lp f79196f;

    /* renamed from: g */
    public final C29293ls f79197g;

    /* renamed from: h */
    public final C29314z f79198h;

    /* renamed from: i */
    public final C29658ia f79199i;

    /* renamed from: j */
    public final C29034aw f79200j;

    /* renamed from: k */
    public final C29042i f79201k;

    /* renamed from: l */
    public final C29059z f79202l;

    /* renamed from: m */
    public final C58833ax f79203m;

    /* renamed from: n */
    public final Executor f79204n;

    /* renamed from: o */
    public final C58833ax f79205o;

    /* renamed from: p */
    public final C28787cb f79206p;

    /* renamed from: q */
    public final C29046m f79207q;

    /* renamed from: r */
    public final C28963a f79208r;

    public C29211ir(Context context, C29037d dVar, C29290lp lpVar, C29293ls lsVar, C29117fe feVar, C29118ff ffVar, C29314z zVar, C29658ia iaVar, C29034aw awVar, C29042i iVar, C29059z zVar2, C58833ax axVar, Executor executor, C58833ax axVar2, C28787cb cbVar, C29046m mVar, C28963a aVar) {
        this.f79192b = context;
        this.f79193c = dVar;
        this.f79196f = lpVar;
        this.f79197g = lsVar;
        this.f79194d = feVar;
        this.f79195e = ffVar;
        this.f79198h = zVar;
        this.f79199i = iaVar;
        this.f79200j = awVar;
        this.f79201k = iVar;
        this.f79202l = zVar2;
        this.f79203m = axVar;
        this.f79204n = executor;
        this.f79205o = axVar2;
        this.f79206p = cbVar;
        this.f79207q = mVar;
        this.f79208r = aVar;
    }

    /* renamed from: a */
    public static C58485gu m54132a(List list) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a = C29327dk.m54216a(((C29328dl) it.next()).f79476e);
            if (a != 0 && a == 2) {
                C58480gp f = C58485gu.m89838f(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C29328dl dlVar = (C29328dl) it2.next();
                    int a2 = C29327dk.m54216a(dlVar.f79476e);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 - 1 != 0) {
                        C29325di diVar = (C29325di) dlVar.toBuilder();
                        String str2 = dlVar.f79474c;
                        MessageDigest d = C28927o.m53849d();
                        if (d == null) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            byte[] bytes = str2.getBytes();
                            d.update(bytes, 0, bytes.length);
                            str = C28927o.m53846a(d.digest());
                        }
                        if (C29099m.m54011g(dlVar)) {
                            diVar.copyOnWrite();
                            C29328dl dlVar2 = (C29328dl) diVar.instance;
                            dlVar2.f79472a |= 64;
                            dlVar2.f79479h = str;
                        } else {
                            diVar.copyOnWrite();
                            C29328dl dlVar3 = (C29328dl) diVar.instance;
                            dlVar3.f79472a |= 16;
                            dlVar3.f79477f = str;
                        }
                        C29328dl dlVar4 = (C29328dl) diVar.instance;
                        C29045l.m53931c("FileId %s does not have checksum. Generated checksum from url %s", dlVar4.f79473b, dlVar4.f79477f);
                        f.mo55395g((C29328dl) diVar.build());
                    } else {
                        f.mo55395g(dlVar);
                    }
                }
                return f.mo55394f();
            }
        }
        return C58485gu.m89842j(list);
    }

    /* renamed from: b */
    public final C60870cx mo34626b() {
        C29290lp lpVar = this.f79196f;
        C60870cx c = lpVar.f79387c.mo34618c();
        C29270kw kwVar = new C29270kw(lpVar);
        C60870cx h = C60922j.m93045h(c, C47810es.m84966f(kwVar), lpVar.f79395k);
        C29200ig igVar = new C29200ig(this);
        return C60922j.m93045h(h, C47810es.m84966f(igVar), this.f79204n);
    }

    /* renamed from: c */
    public final C60870cx mo34627c() {
        C60870cx b = this.f79196f.mo34638b();
        C29198ie ieVar = new C29198ie(this);
        return C60922j.m93045h(b, C47810es.m84966f(ieVar), this.f79204n);
    }

    /* renamed from: d */
    public final C60870cx mo34628d(boolean z, C60931s sVar) {
        C29045l.m53931c("%s downloadAllPendingGroups on wifi = %s", "MDDManager", Boolean.valueOf(z));
        C60870cx h = mo34632h();
        C29203ij ijVar = new C29203ij(this, z, sVar);
        return C60922j.m93045h(h, C47810es.m84966f(ijVar), this.f79204n);
    }

    /* renamed from: e */
    public final C60870cx mo34629e(C29392ep epVar, C58833ax axVar, C60931s sVar) {
        C29045l.m53932d("%s downloadFileGroup %s %s", "MDDManager", epVar.f79682b, epVar.f79683c);
        C60870cx h = mo34632h();
        C29206im imVar = new C29206im(this, epVar, axVar, sVar);
        return C60922j.m93045h(h, C47810es.m84966f(imVar), this.f79204n);
    }

    /* renamed from: f */
    public final C60870cx mo34630f() {
        C29045l.m53930b("%s getAllFreshGroups", "MDDManager");
        C60870cx h = mo34632h();
        C29187hu huVar = new C29187hu(this);
        return C60922j.m93045h(h, C47810es.m84966f(huVar), this.f79204n);
    }

    /* renamed from: g */
    public final C60870cx mo34631g(C29392ep epVar, boolean z) {
        C29045l.m53932d("%s getFileGroup %s %s", "MDDManager", epVar.f79682b, epVar.f79683c);
        C60870cx h = mo34632h();
        C29179hm hmVar = new C29179hm(this, epVar, z);
        return C60922j.m93045h(h, C47810es.m84966f(hmVar), this.f79204n);
    }

    /* renamed from: h */
    public final C60870cx mo34632h() {
        if (f79191a) {
            return C60866ct.f164955a;
        }
        return C29670b.m54719g(C60866ct.f164955a).mo34822i(new C29174hh(this), this.f79204n).mo34822i(new C29184hr(this), this.f79204n).mo34822i(new C29196ic(this), this.f79204n).mo34822i(new C29204ik(this), this.f79204n).mo34821h(C29205il.f79181a, this.f79204n);
    }
}
