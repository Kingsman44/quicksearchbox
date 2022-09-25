package com.google.android.libraries.search.assistant.proactive.p2776h;

import android.app.Application;
import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3803ag.p3809c.C48949aw;
import com.google.assistant.p3803ag.p3809c.C48951ay;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48966bm;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.common.base.C58827ar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4985f.p5036r.C65316b;
import com.google.protos.p4985f.p5036r.C65330p;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.assistant.proactive.h.g */
/* compiled from: PG */
public final class C36314g {

    /* renamed from: a */
    public final C36313f f94826a;

    /* renamed from: b */
    public final C21370a f94827b;

    public C36314g(Context context, ScheduledExecutorService scheduledExecutorService, C21370a aVar) {
        this.f94826a = new C36313f(scheduledExecutorService, new C19566c(new C143658k(context, "STREAMZ_OPA_PROACTIVE", (String) null), "STREAMZ_OPA_PROACTIVE"), (Application) context);
        this.f94827b = aVar;
    }

    /* renamed from: a */
    public static String m64795a(C48952az azVar) {
        String d = new C58827ar("_").mo56097d(m64796e(azVar));
        return d.isEmpty() ? "EMPTY" : d;
    }

    /* renamed from: e */
    private static Set m64796e(C48952az azVar) {
        C48971br brVar;
        C48951ay ayVar;
        C48951ay ayVar2;
        C48952az azVar2;
        TreeSet treeSet = new TreeSet();
        int i = azVar.f126659a;
        int b = C48949aw.m85320b(i);
        int i2 = b - 1;
        if (b != 0) {
            if (i2 == 0) {
                if (i == 1) {
                    brVar = (C48971br) azVar.f126660b;
                } else {
                    brVar = C48971br.f126689d;
                }
                int a = C48966bm.m85328a(brVar.f126691a);
                int i3 = a - 1;
                if (a != 0) {
                    treeSet.add((i3 == 0 || i3 == 1) ? "Time" : i3 != 2 ? i3 != 7 ? i3 != 8 ? i3 != 10 ? i3 != 12 ? "UNSUPPORTED" : "Media" : "Headphones" : "PhoneLock" : "Screen" : "Location");
                } else {
                    throw null;
                }
            } else if (i2 == 1) {
                if (i == 2) {
                    ayVar = (C48951ay) azVar.f126660b;
                } else {
                    ayVar = C48951ay.f126654b;
                }
                for (C48952az e : ayVar.f126656a) {
                    treeSet.addAll(m64796e(e));
                }
            } else if (i2 == 2) {
                if (i == 3) {
                    ayVar2 = (C48951ay) azVar.f126660b;
                } else {
                    ayVar2 = C48951ay.f126654b;
                }
                for (C48952az e2 : ayVar2.f126656a) {
                    treeSet.addAll(m64796e(e2));
                }
            } else if (i2 == 3) {
                if (i == 4) {
                    azVar2 = (C48952az) azVar.f126660b;
                } else {
                    azVar2 = C48952az.f126657c;
                }
                treeSet.addAll(m64796e(azVar2));
            }
            return treeSet;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo40100b(String str, String str2, String str3, int i) {
        ((C19567d) this.f94826a.f94824e.mo6453a()).mo24822a(1, str, str2, str3, i != 1 ? i != 2 ? i != 3 ? "TRIGGER" : "SCHEDULE" : "REMOVE" : "EXPIRE");
    }

    /* renamed from: c */
    public final void mo40101c(aap aap, int i) {
        int b = C65330p.m96670b(aap.f134653b);
        int c = C65316b.m96666c(aap.f134655d);
        String str = BuildConfig.FLAVOR;
        String a = b == 0 ? str : C65330p.m96669a(b);
        if (c != 0) {
            str = C65316b.m96664a(c);
        }
        mo40102d(a, str, i);
    }

    /* renamed from: d */
    public final void mo40102d(String str, String str2, int i) {
        C58976aa aaVar = C58975e.f156826a;
        ((C19567d) this.f94826a.f94822c.mo6453a()).mo24822a(1, str, str2, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "WITH_EXPIRY" : "ACTION_AFTER_EXPIRY" : "CLIENT_GENERATED" : "IMPRESSION" : "DELAYED_SCHEDULING_FAILED" : "DELAYED_NOTIFICATION");
    }
}
