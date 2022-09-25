package com.google.android.gms.cast.framework.internal;

import android.content.Context;
import android.os.Looper;
import androidx.mediarouter.p175a.C3665aa;
import androidx.mediarouter.p175a.C3685au;
import androidx.mediarouter.p175a.C3752y;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.gms.cast.C143606o;
import com.google.android.gms.cast.framework.C143407ao;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.gms.cast.framework.internal.r */
/* compiled from: PG */
public final class C143454r extends C3665aa {

    /* renamed from: a */
    public static final C143566ae f388988a = new C143566ae("MRDiscoveryCallback");

    /* renamed from: b */
    public final C143452p f388989b = new C143452p(this);

    /* renamed from: c */
    public final Map f388990c = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: d */
    public final LinkedHashSet f388991d = new LinkedHashSet();

    /* renamed from: e */
    public final C143453q f388992e;

    /* renamed from: f */
    private final Set f388993f = Collections.synchronizedSet(new LinkedHashSet());

    public C143454r(Context context) {
        this.f388992e = new C143453q(context);
    }

    /* renamed from: d */
    public final void mo7712d(C3685au auVar) {
        f388988a.mo118884b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        mo118697o(auVar, true);
    }

    /* renamed from: e */
    public final void mo7713e(C3685au auVar) {
        f388988a.mo118884b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        mo118697o(auVar, true);
    }

    /* renamed from: f */
    public final void mo7714f(C3685au auVar) {
        f388988a.mo118884b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        mo118697o(auVar, false);
    }

    /* renamed from: m */
    public final void mo118695m() {
        C143566ae aeVar = f388988a;
        int size = this.f388991d.size();
        aeVar.mo118884b("Starting RouteDiscovery with " + size + " IDs", new Object[0]);
        aeVar.mo118884b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(String.valueOf(this.f388990c.keySet()))), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo118696n();
        } else {
            new C144861c(Looper.getMainLooper()).post(new C143450n(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo118696n() {
        this.f388992e.mo118694b(this);
        synchronized (this.f388991d) {
            Iterator it = this.f388991d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C3752y yVar = new C3752y();
                yVar.mo7923c(C143606o.m233298a(str));
                C3753z a = yVar.mo7921a();
                if (((C143451o) this.f388990c.get(str)) == null) {
                    this.f388990c.put(str, new C143451o(a));
                }
                C143566ae aeVar = f388988a;
                String a2 = C143606o.m233298a(str);
                aeVar.mo118884b("Adding mediaRouter callback for control category " + a2, new Object[0]);
                this.f388992e.mo118693a().mo7773h(a, this, 4);
            }
        }
        f388988a.mo118884b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(String.valueOf(this.f388990c.keySet()))), new Object[0]);
    }

    /* renamed from: o */
    public final void mo118697o(C3685au auVar, boolean z) {
        boolean z2;
        Set set;
        boolean z3;
        C143566ae aeVar = f388988a;
        aeVar.mo118884b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), auVar);
        synchronized (this.f388990c) {
            String valueOf = String.valueOf(this.f388990c.keySet());
            aeVar.mo118884b("appIdToRouteInfo has these appId route keys: " + valueOf, new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.f388990c.entrySet()) {
                String str = (String) entry.getKey();
                C143451o oVar = (C143451o) entry.getValue();
                if (auVar.mo7765l(oVar.f388984b)) {
                    if (z) {
                        C143566ae aeVar2 = f388988a;
                        aeVar2.mo118884b("Adding/updating route for appId " + str, new Object[0]);
                        z3 = oVar.f388983a.add(auVar);
                        if (!z3) {
                            String obj = auVar.toString();
                            aeVar2.mo118889g("Route " + obj + " already exists for appId " + str, new Object[0]);
                        }
                    } else {
                        C143566ae aeVar3 = f388988a;
                        aeVar3.mo118884b("Removing route for appId " + str, new Object[0]);
                        z3 = oVar.f388983a.remove(auVar);
                        if (!z3) {
                            String obj2 = auVar.toString();
                            aeVar3.mo118889g("Route " + obj2 + " already removed from appId " + str, new Object[0]);
                        }
                    }
                    z2 = z3;
                }
            }
        }
        if (z2) {
            f388988a.mo118884b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.f388993f) {
                HashMap hashMap = new HashMap();
                synchronized (this.f388990c) {
                    for (String str2 : this.f388990c.keySet()) {
                        C143451o oVar2 = (C143451o) this.f388990c.get(C58890d.m90989d(str2));
                        if (oVar2 == null) {
                            set = C58733pz.f156496a;
                        } else {
                            set = C58528ij.m90006F(oVar2.f388983a);
                        }
                        if (!set.isEmpty()) {
                            hashMap.put(str2, set);
                        }
                    }
                }
                C58495hd.m89898l(hashMap);
                for (C143407ao a : this.f388993f) {
                    a.mo118610a();
                }
            }
        }
    }
}
