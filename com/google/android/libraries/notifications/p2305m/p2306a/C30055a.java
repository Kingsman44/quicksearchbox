package com.google.android.libraries.notifications.p2305m.p2306a;

import android.text.TextUtils;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29793g;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29822m;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.data.impl.C29810o;
import com.google.android.libraries.notifications.p2265b.C29777a;
import com.google.android.libraries.notifications.p2265b.C29779c;
import com.google.android.libraries.notifications.p2265b.C29780d;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2279f.C29851a;
import com.google.android.libraries.notifications.p2268e.p2287j.C29959j;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.android.libraries.notifications.p2305m.C30054a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.common.p4522b.C58485gu;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55563bp;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C63070h;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.m.a.a */
/* compiled from: PG */
final class C30055a implements C30054a {

    /* renamed from: a */
    private final C29959j f81318a;

    /* renamed from: b */
    private final C29823n f81319b;

    /* renamed from: c */
    private final C29851a f81320c;

    /* renamed from: d */
    private final C29810o f81321d;

    /* renamed from: e */
    private final C29835a f81322e;

    public C30055a(C29959j jVar, C29810o oVar, C29823n nVar, C29851a aVar, C29835a aVar2) {
        this.f81318a = jVar;
        this.f81321d = oVar;
        this.f81319b = nVar;
        this.f81320c = aVar;
        this.f81322e = aVar2;
    }

    /* renamed from: a */
    public final List mo35392a(String str) {
        C29820k kVar;
        if (!TextUtils.isEmpty(str)) {
            try {
                kVar = this.f81319b.mo35088b(str);
            } catch (C29822m e) {
                C30058b.m55792d("ChimeTrayManagerApi", e, "Account not found on accounts storage", new Object[0]);
                return C58485gu.m89845m();
            }
        } else {
            kVar = null;
        }
        return this.f81321d.mo35111a(kVar);
    }

    /* renamed from: b */
    public final void mo35393b(C30007h hVar) {
        int i;
        Iterator it = this.f81319b.mo35089c().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C29820k kVar = (C29820k) it.next();
            C58485gu a = this.f81321d.mo35111a(kVar);
            int size = a.size();
            while (i < size) {
                this.f81318a.mo35246a(kVar, (C29827r) a.get(i), true, true, hVar, (C30004l) null, (C29839c) null);
                i++;
            }
        }
        C58485gu a2 = this.f81321d.mo35111a((C29820k) null);
        int size2 = a2.size();
        while (i < size2) {
            this.f81318a.mo35246a((C29820k) null, (C29827r) a2.get(i), true, true, hVar, (C30004l) null, (C29839c) null);
            i++;
        }
    }

    /* renamed from: c */
    public final void mo35394c(C29820k kVar, String str, C30007h hVar, C63070h hVar2) {
        C58485gu c = this.f81321d.mo35113c(kVar, str);
        if (!c.isEmpty()) {
            C29827r rVar = (C29827r) c.get(0);
            if (hVar2 != null) {
                C30058b.m55793e("ChimeTrayManagerApi", "Refreshing thread with app provided Payload (instead of server Payload).", new Object[0]);
                C29793g t = rVar.mo35073t();
                t.f80768f = hVar2;
                rVar = t.mo35042a();
            }
            this.f81318a.mo35246a(kVar, rVar, true, true, hVar, (C30004l) null, (C29839c) null);
        }
    }

    /* renamed from: d */
    public final void mo35395d() {
        for (C29820k g : this.f81319b.mo35089c()) {
            mo35398g(g);
        }
        mo35398g((C29820k) null);
    }

    /* renamed from: e */
    public final void mo35396e(C29820k kVar) {
        List c = this.f81318a.mo35248c(kVar, 9);
        if (!c.isEmpty()) {
            C29834a a = this.f81322e.mo35159a(C55489bz.DISMISSED_BY_API);
            a.mo35145j(kVar);
            a.mo35140e(c);
            a.mo35136a();
        }
    }

    /* renamed from: g */
    public final void mo35398g(C29820k kVar) {
        C58485gu a = this.f81321d.mo35111a(kVar);
        if (!a.isEmpty()) {
            C29851a aVar = this.f81320c;
            C29779c l = C29780d.m54925l();
            C29777a aVar2 = (C29777a) l;
            aVar2.f80685f = 3;
            l.mo34958f(1);
            aVar2.f80680a = "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED";
            aVar2.f80681b = kVar;
            l.mo34974h(a);
            C55563bp bpVar = (C55563bp) C55564bq.f146602f.createBuilder();
            bpVar.copyOnWrite();
            C55564bq bqVar = (C55564bq) bpVar.instance;
            bqVar.f146608e = 2;
            bqVar.f146604a |= 8;
            bpVar.copyOnWrite();
            C55564bq bqVar2 = (C55564bq) bpVar.instance;
            bqVar2.f146607d = 2;
            bqVar2.f146604a |= 4;
            l.mo34957e((C55564bq) bpVar.build());
            l.mo34959g(9);
            aVar.mo35177b(l.mo34953a());
            C29834a a2 = this.f81322e.mo35159a(C55489bz.DISMISSED_BY_API);
            a2.mo35145j(kVar);
            a2.mo35140e(a);
            a2.mo35136a();
        }
    }

    /* renamed from: f */
    public final void mo35397f(String str, List list) {
        C29820k kVar;
        if (str == null) {
            kVar = null;
        } else {
            kVar = this.f81319b.mo35088b(str);
        }
        List b = this.f81318a.mo35247b(kVar, list, (C29839c) null, 9);
        if (!b.isEmpty()) {
            C29834a a = this.f81322e.mo35159a(C55489bz.DISMISSED_BY_API);
            a.mo35145j(kVar);
            a.mo35140e(b);
            a.mo35136a();
        }
    }
}
