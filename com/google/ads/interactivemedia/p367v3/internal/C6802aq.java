package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aq */
/* compiled from: PG */
public final class C6802aq implements C7406x {

    /* renamed from: a */
    private static final C6802aq f21370a = new C6802aq();

    /* renamed from: b */
    private static final Handler f21371b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f21372c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f21373j = new C6794am();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f21374k = new C6796an();

    /* renamed from: d */
    private final List f21375d = new ArrayList();

    /* renamed from: e */
    private int f21376e;

    /* renamed from: f */
    private final C7460z f21377f = new C7460z();

    /* renamed from: g */
    private final C6791aj f21378g = new C6791aj();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6792ak f21379h = new C6792ak(new C6805at());

    /* renamed from: i */
    private long f21380i;

    /* renamed from: b */
    public static C6802aq m19255b() {
        return f21370a;
    }

    /* renamed from: g */
    static /* synthetic */ void m19257g(C6802aq aqVar) {
        aqVar.f21376e = 0;
        aqVar.f21380i = System.nanoTime();
        aqVar.f21378g.mo14860d();
        long nanoTime = System.nanoTime();
        C7433y a = aqVar.f21377f.mo16839a();
        if (aqVar.f21378g.mo14858b().size() > 0) {
            Iterator it = aqVar.f21378g.mo14858b().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a2 = a.mo14301a((View) null);
                View h = aqVar.f21378g.mo14864h(str);
                C7433y b = aqVar.f21377f.mo16840b();
                String c = aqVar.f21378g.mo14859c(str);
                if (c != null) {
                    JSONObject a3 = b.mo14301a(h);
                    C6789ah.m18703e(a3, str);
                    C6789ah.m18704f(a3, c);
                    C6789ah.m18706h(a2, a3);
                }
                C6789ah.m18707i(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                aqVar.f21379h.mo14876b(a2, hashSet, nanoTime);
            }
        }
        if (aqVar.f21378g.mo14857a().size() > 0) {
            JSONObject a4 = a.mo14301a((View) null);
            aqVar.m19261k((View) null, a, a4, 1);
            C6789ah.m18707i(a4);
            aqVar.f21379h.mo14875a(a4, aqVar.f21378g.mo14857a(), nanoTime);
        } else {
            aqVar.f21379h.mo14877c();
        }
        aqVar.f21378g.mo14861e();
        long nanoTime2 = System.nanoTime() - aqVar.f21380i;
        if (aqVar.f21375d.size() > 0) {
            for (C6798ap apVar : aqVar.f21375d) {
                int i = aqVar.f21376e;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                apVar.mo15135b();
                if (apVar instanceof C6797ao) {
                    int i2 = aqVar.f21376e;
                    ((C6797ao) apVar).mo15068a();
                }
            }
        }
    }

    /* renamed from: k */
    private final void m19261k(View view, C7433y yVar, JSONObject jSONObject, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        yVar.mo14302b(view, jSONObject, this, z);
    }

    /* renamed from: l */
    private static final void m19262l() {
        Handler handler = f21372c;
        if (handler != null) {
            handler.removeCallbacks(f21374k);
            f21372c = null;
        }
    }

    /* renamed from: a */
    public final void mo15162a(View view, C7433y yVar, JSONObject jSONObject) {
        int j;
        if (C6904ek.m20302c(view) == null && (j = this.f21378g.mo14866j(view)) != 3) {
            JSONObject a = yVar.mo14301a(view);
            C6789ah.m18706h(jSONObject, a);
            String g = this.f21378g.mo14863g(view);
            if (g != null) {
                C6789ah.m18703e(a, g);
                this.f21378g.mo14862f();
            } else {
                C6790ai i = this.f21378g.mo14865i(view);
                if (i != null) {
                    C6789ah.m18705g(a, i);
                }
                m19261k(view, yVar, a, j);
            }
            this.f21376e++;
        }
    }

    /* renamed from: c */
    public final void mo15163c() {
        if (f21372c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21372c = handler;
            handler.post(f21373j);
            f21372c.postDelayed(f21374k, 200);
        }
    }

    /* renamed from: d */
    public final void mo15164d() {
        m19262l();
        this.f21375d.clear();
        f21371b.post(new C6793al(this));
    }

    /* renamed from: e */
    public final void mo15165e() {
        m19262l();
    }
}
