package com.google.android.gms.cast.framework.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.mediarouter.p175a.C3665aa;
import androidx.mediarouter.p175a.C3679ao;
import androidx.mediarouter.p175a.C3685au;
import androidx.mediarouter.p175a.C3687aw;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143584j;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.android.gms.tasks.C146013ai;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.internal.y */
/* compiled from: PG */
public final class C143461y extends C143444h {

    /* renamed from: a */
    public static final C143566ae f389011a = new C143566ae("MediaRouterProxy");

    /* renamed from: b */
    public final C3687aw f389012b;

    /* renamed from: c */
    public final CastOptions f389013c;

    /* renamed from: d */
    public final Map f389014d = new HashMap();

    /* renamed from: e */
    public C143437ac f389015e;

    public C143461y(C3687aw awVar, CastOptions castOptions, C143584j jVar) {
        this.f389012b = awVar;
        this.f389013c = castOptions;
        if (Build.VERSION.SDK_INT <= 32) {
            f389011a.mo118888f("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]);
            return;
        }
        f389011a.mo118888f("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.f389015e = new C143437ac();
        jVar.mo118913a(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).mo122493l(C146013ai.f394700a, new C143458v(this, castOptions));
    }

    /* renamed from: a */
    public final int mo118671a() {
        return 223810000;
    }

    /* renamed from: b */
    public final Bundle mo118672b(String str) {
        for (C3685au auVar : this.f389012b.mo7772g()) {
            if (auVar.f11863c.equals(str)) {
                return auVar.f11876p;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String mo118673c() {
        return this.f389012b.mo7770d().f11863c;
    }

    /* renamed from: d */
    public final void mo118674d(Bundle bundle, int i) {
        C3753z a = C3753z.m10882a(bundle);
        if (a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo118701n(a, i);
            } else {
                new C144861c(Looper.getMainLooper()).post(new C143459w(this, a, i));
            }
        }
    }

    /* renamed from: e */
    public final void mo118675e(Bundle bundle, C143447k kVar) {
        C3753z a = C3753z.m10882a(bundle);
        if (a != null) {
            if (!this.f389014d.containsKey(a)) {
                this.f389014d.put(a, new HashSet());
            }
            ((Set) this.f389014d.get(a)).add(new C143448l(kVar));
        }
    }

    /* renamed from: f */
    public final void mo118676f() {
        for (Set<C3665aa> it : this.f389014d.values()) {
            for (C3665aa j : it) {
                this.f389012b.mo7774j(j);
            }
        }
        this.f389014d.clear();
    }

    /* renamed from: g */
    public final void mo118677g(Bundle bundle) {
        C3753z a = C3753z.m10882a(bundle);
        if (a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo118702o(a);
            } else {
                new C144861c(Looper.getMainLooper()).post(new C143460x(this, a));
            }
        }
    }

    /* renamed from: h */
    public final void mo118678h() {
        C3687aw awVar = this.f389012b;
        awVar.mo7775k(awVar.mo7769c());
    }

    /* renamed from: i */
    public final void mo118679i(String str) {
        f389011a.mo118884b("select route with routeId = %s", str);
        for (C3685au auVar : this.f389012b.mo7772g()) {
            if (auVar.f11863c.equals(str)) {
                f389011a.mo118884b("media route is found and selected", new Object[0]);
                this.f389012b.mo7775k(auVar);
                return;
            }
        }
    }

    /* renamed from: j */
    public final void mo118680j(int i) {
        this.f389012b.mo7777m(i);
    }

    /* renamed from: k */
    public final boolean mo118681k() {
        C3685au auVar;
        C3687aw.m10684i();
        C3679ao b = C3687aw.m10682b();
        if (b == null) {
            auVar = null;
        } else {
            auVar = b.f11835q;
        }
        return auVar != null && this.f389012b.mo7770d().f11863c.equals(auVar.f11863c);
    }

    /* renamed from: l */
    public final boolean mo118682l() {
        return this.f389012b.mo7770d().f11863c.equals(this.f389012b.mo7769c().f11863c);
    }

    /* renamed from: m */
    public final boolean mo118683m(Bundle bundle, int i) {
        C3753z a = C3753z.m10882a(bundle);
        if (a == null) {
            return false;
        }
        return this.f389012b.mo7778p(a, i);
    }

    /* renamed from: n */
    public final void mo118701n(C3753z zVar, int i) {
        Set<C3665aa> set = (Set) this.f389014d.get(zVar);
        if (set != null) {
            for (C3665aa h : set) {
                this.f389012b.mo7773h(zVar, h, i);
            }
        }
    }

    /* renamed from: o */
    public final void mo118702o(C3753z zVar) {
        Set<C3665aa> set = (Set) this.f389014d.get(zVar);
        if (set != null) {
            for (C3665aa j : set) {
                this.f389012b.mo7774j(j);
            }
        }
    }
}
