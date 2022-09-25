package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.content.Context;
import android.text.TextUtils;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58882cs;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.ae */
/* compiled from: PG */
public final class C111396ae extends C113409et {

    /* renamed from: a */
    public static final C58869cf f309944a = C58869cf.m90936b(C58911u.f156751b).mo56151a();

    /* renamed from: b */
    public final UserManagerCompat f309945b;

    /* renamed from: c */
    public final LauncherAppsCompat f309946c;

    /* renamed from: d */
    public C58881cr f309947d;

    /* renamed from: e */
    public C58881cr f309948e;

    public C111396ae(Context context) {
        this.f309946c = LauncherAppsCompat.getInstance(context);
        this.f309945b = UserManagerCompat.getInstance(context);
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.WORK_APPS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo99134b(C113405ep epVar) {
        if (TextUtils.isEmpty(C113190cu.m187215c(epVar.mo100033p()))) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        Optional findFirst = Collection.EL.stream(this.f309945b.getUserProfiles()).filter(C111421y.f309992a).findFirst();
        if (findFirst.isEmpty()) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        C58480gp e = C58485gu.m89837e();
        ArrayList arrayList = new ArrayList();
        UserHandleCompat userHandleCompat = (UserHandleCompat) findFirst.get();
        if (this.f309947d == null) {
            this.f309947d = new C58882cs(new C111394ac(this, userHandleCompat), 1, TimeUnit.MINUTES);
            this.f309948e = new C58882cs(new C111395ad(this), 1, TimeUnit.MINUTES);
        }
        C58881cr crVar = this.f309947d;
        crVar.getClass();
        arrayList.addAll((List) crVar.mo6453a());
        if (arrayList.isEmpty()) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        C58976aa aaVar = C58975e.f156826a;
        arrayList.size();
        e.mo55396h((Iterable) Collection.EL.stream(arrayList).filter(new C111422z(this, epVar)).filter(C111392aa.f309938a).map(new C111393ab(this, findFirst)).collect(C58370cn.f155946a));
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(e.mo55394f())));
        return C60856cj.m92900i(p.mo100091a());
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        return mo99134b(epVar);
    }
}
