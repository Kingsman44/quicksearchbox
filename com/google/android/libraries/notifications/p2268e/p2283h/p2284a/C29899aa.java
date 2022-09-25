package com.google.android.libraries.notifications.p2268e.p2283h.p2284a;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.notifications.C29992g;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.p2268e.p2281g.C29860a;
import com.google.android.libraries.notifications.p2268e.p2281g.C29892c;
import com.google.android.libraries.notifications.p2268e.p2283h.C29929b;
import com.google.android.libraries.notifications.p2298k.C30042b;
import com.google.android.libraries.notifications.p2298k.C30043c;
import com.google.android.libraries.notifications.p2298k.C30044d;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55542av;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.e.h.a.aa */
/* compiled from: PG */
public abstract class C29899aa implements C30044d {

    /* renamed from: a */
    public C29823n f81019a;

    /* renamed from: b */
    public Map f81020b;

    protected C29899aa() {
    }

    /* renamed from: i */
    protected static final C29892c m55364i() {
        C29860a g = C29892c.m55336g();
        g.f80954c = new IllegalStateException("chimeAccount should not be null.");
        g.mo35181b(false);
        return g.mo35180a();
    }

    /* renamed from: a */
    public final /* synthetic */ long mo35166a() {
        return 0;
    }

    /* renamed from: b */
    public final C29992g mo35167b(Bundle bundle) {
        C29820k kVar;
        String h = mo35218h();
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        int i = bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT");
        if (!TextUtils.isEmpty(string)) {
            try {
                kVar = this.f81019a.mo35088b(string);
            } catch (C29822m e) {
                return C29992g.m55627c(e);
            }
        } else {
            kVar = null;
        }
        C55542av avVar = (C55542av) C55543aw.f146565c.createBuilder();
        avVar.copyOnWrite();
        C55543aw awVar = (C55543aw) avVar.instance;
        awVar.f146567a |= 1;
        awVar.f146568b = i;
        C29892c g = mo35217g(bundle, (C55543aw) avVar.build(), kVar);
        if (g.mo35205f() && g.mo35201d()) {
            return C29992g.m55628d(g.mo35200c());
        }
        if (TextUtils.isEmpty(h) || !this.f81020b.containsKey(h)) {
            C30058b.m55789a("ScheduledRpcHandler", "Scheduled RPC callback not found. Callback key: [%s]", h);
        } else {
            C30058b.m55789a("ScheduledRpcHandler", "Calling scheduled RPC callback. Callback key: [%s]", h);
            C29929b bVar = (C29929b) this.f81020b.get(h);
            if (g.mo35205f()) {
                bVar.mo35219a(kVar, g.mo35198a(), g.mo35200c());
            } else {
                bVar.mo35220b(kVar, g.mo35198a(), g.mo35199b());
            }
        }
        return g.mo35205f() ? C29992g.m55627c(g.mo35200c()) : C29992g.f81202a;
    }

    /* renamed from: c */
    public final /* synthetic */ C30042b mo35168c() {
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ C30043c mo35169d() {
        return C30043c.ANY;
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo35171f() {
        return false;
    }

    /* renamed from: g */
    public abstract C29892c mo35217g(Bundle bundle, C55543aw awVar, C29820k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo35218h();
}
