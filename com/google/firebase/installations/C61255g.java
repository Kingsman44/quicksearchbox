package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146021aq;
import com.google.firebase.C61204g;
import com.google.firebase.installations.p4615a.C61232a;
import com.google.firebase.installations.p4616b.C61236c;
import com.google.firebase.installations.p4616b.C61237d;
import com.google.firebase.installations.p4616b.C61238e;
import com.google.firebase.installations.p4616b.C61239f;
import com.google.firebase.installations.p4617c.C61245e;
import com.google.firebase.p4611d.C61174a;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.installations.g */
/* compiled from: PG */
public final class C61255g implements C61256h {

    /* renamed from: a */
    public static final Object f165684a = new Object();

    /* renamed from: g */
    private static final ThreadFactory f165685g = new C61254f();

    /* renamed from: b */
    public final C61204g f165686b;

    /* renamed from: c */
    public final C61245e f165687c;

    /* renamed from: d */
    public final C61237d f165688d;

    /* renamed from: e */
    public final C61264p f165689e;

    /* renamed from: f */
    public final C61236c f165690f;

    /* renamed from: h */
    private final Object f165691h = new Object();

    /* renamed from: i */
    private final ExecutorService f165692i;

    /* renamed from: j */
    private final ExecutorService f165693j;

    /* renamed from: k */
    private String f165694k;

    /* renamed from: l */
    private final Set f165695l = new HashSet();

    /* renamed from: m */
    private final List f165696m = new ArrayList();

    public C61255g(C61204g gVar, C61174a aVar) {
        C61204g gVar2 = gVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = f165685g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        gVar.mo57770f();
        C61245e eVar = new C61245e(gVar2.f165555c, aVar);
        C61237d dVar = new C61237d(gVar2);
        C61264p b = C61264p.m93745b();
        C61236c cVar = new C61236c(gVar2);
        int i = C61262n.f165701a;
        this.f165686b = gVar2;
        this.f165687c = eVar;
        this.f165688d = dVar;
        this.f165689e = b;
        this.f165690f = cVar;
        this.f165692i = threadPoolExecutor;
        this.f165693j = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    /* renamed from: b */
    public static C61255g m93718b() {
        return (C61255g) C61204g.m93577a().mo57767d(C61256h.class);
    }

    /* renamed from: l */
    private final synchronized String m93719l() {
        return this.f165694k;
    }

    /* renamed from: m */
    private final void m93720m(C61263o oVar) {
        synchronized (this.f165691h) {
            this.f165696m.add(oVar);
        }
    }

    /* renamed from: n */
    private final void m93721n() {
        C143919bh.m233970m(mo57865d(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C143919bh.m233970m(mo57866e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C143919bh.m233970m(mo57864c(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C143919bh.m233960c(C61264p.m93746d(mo57865d()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C143919bh.m233960c(C61264p.f165705b.matcher(mo57864c()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: a */
    public final C146006ab mo57863a() {
        m93721n();
        String l = m93719l();
        if (l != null) {
            return C146021aq.m237850d(l);
        }
        C146010af afVar = new C146010af();
        m93720m(new C61260l(afVar));
        C146014aj ajVar = afVar.f394698a;
        this.f165692i.execute(new C61253e(this));
        return ajVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo57864c() {
        C61204g gVar = this.f165686b;
        gVar.mo57770f();
        return gVar.f165557e.f165713a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo57865d() {
        C61204g gVar = this.f165686b;
        gVar.mo57770f();
        return gVar.f165557e.f165714b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo57866e() {
        C61204g gVar = this.f165686b;
        gVar.mo57770f();
        return gVar.f165557e.f165716d;
    }

    /* renamed from: f */
    public final void mo57867f(Exception exc) {
        synchronized (this.f165691h) {
            Iterator it = this.f165696m.iterator();
            while (it.hasNext()) {
                if (((C61263o) it.next()).mo57873a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo57868g(C61239f fVar) {
        synchronized (this.f165691h) {
            Iterator it = this.f165696m.iterator();
            while (it.hasNext()) {
                if (((C61263o) it.next()).mo57874b(fVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: h */
    public final synchronized void mo57869h(String str) {
        this.f165694k = str;
    }

    /* renamed from: i */
    public final synchronized void mo57870i(C61239f fVar, C61239f fVar2) {
        if (this.f165695l.size() != 0 && !fVar.mo57824e().equals(fVar2.mo57824e())) {
            for (C61232a a : this.f165695l) {
                fVar2.mo57824e();
                a.mo57810a();
            }
        }
    }

    /* renamed from: j */
    public final void mo57871j() {
        C61239f a;
        String str;
        String str2;
        synchronized (f165684a) {
            C61204g gVar = this.f165686b;
            gVar.mo57770f();
            C61233b b = C61233b.m93636b(gVar.f165555c);
            try {
                a = this.f165688d.mo57831a();
                if (a.mo57834k()) {
                    C61204g gVar2 = this.f165686b;
                    gVar2.mo57770f();
                    if ((gVar2.f165556d.equals("CHIME_ANDROID_SDK") || this.f165686b.mo57772h()) && a.mo57828h() == 1) {
                        C61236c cVar = this.f165690f;
                        synchronized (cVar.f165649b) {
                            synchronized (cVar.f165649b) {
                                str2 = null;
                                str = cVar.f165649b.getString("|S|id", (String) null);
                            }
                            if (str == null) {
                                synchronized (cVar.f165649b) {
                                    String string = cVar.f165649b.getString("|S||P|", (String) null);
                                    if (string != null) {
                                        PublicKey b2 = C61236c.m93655b(string);
                                        if (b2 != null) {
                                            str2 = C61236c.m93654a(b2);
                                        }
                                    }
                                }
                                str = str2;
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = C61262n.m93742a();
                        }
                    } else {
                        str = C61262n.m93742a();
                    }
                    C61237d dVar = this.f165688d;
                    C61238e c = a.mo57822c();
                    c.mo57815d(str);
                    c.mo57817f(3);
                    a = c.mo57812a();
                    dVar.mo57832b(a);
                }
            } finally {
                if (b != null) {
                    b.mo57811a();
                }
            }
        }
        mo57868g(a);
        this.f165693j.execute(new C61240c(this));
    }

    /* renamed from: k */
    public final C146006ab mo57872k() {
        m93721n();
        C146010af afVar = new C146010af();
        m93720m(new C61259k(this.f165689e, afVar));
        C146014aj ajVar = afVar.f394698a;
        this.f165692i.execute(new C61251d(this));
        return ajVar;
    }
}
