package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2384o;
import androidx.p060c.C0977g;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C5634j;
import com.bumptech.glide.C5996o;
import com.bumptech.glide.load.p299c.p300a.C5826ae;
import com.bumptech.glide.p291h.C5632s;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.manager.r */
/* compiled from: PG */
public final class C5986r implements Handler.Callback {

    /* renamed from: d */
    private static final C5985q f17650d = new C5984p();

    /* renamed from: a */
    final Map f17651a = new HashMap();

    /* renamed from: b */
    final Map f17652b = new HashMap();

    /* renamed from: c */
    public final C5980l f17653c;

    /* renamed from: e */
    private volatile C5514ad f17654e;

    /* renamed from: f */
    private final Handler f17655f;

    /* renamed from: g */
    private final C5985q f17656g;

    /* renamed from: h */
    private final C5996o f17657h;

    public C5986r(C5985q qVar, C5996o oVar) {
        new C0977g();
        new C0977g();
        new Bundle();
        qVar = qVar == null ? f17650d : qVar;
        this.f17656g = qVar;
        this.f17657h = oVar;
        this.f17655f = new Handler(Looper.getMainLooper(), this);
        this.f17653c = new C5980l(qVar);
        int i = C5826ae.f17408a;
    }

    /* renamed from: h */
    private static Activity m15417h(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m15417h(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: i */
    private static void m15418i(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: j */
    private static boolean m15419j(Context context) {
        Activity h = m15417h(context);
        return h == null || !h.isFinishing();
    }

    @Deprecated
    /* renamed from: a */
    public final C5514ad mo12422a(Activity activity) {
        if (C5632s.m14620m()) {
            return mo12423b(activity.getApplicationContext());
        }
        if (activity instanceof C0167am) {
            return mo12424c((C0167am) activity);
        }
        m15418i(activity);
        FragmentManager fragmentManager = activity.getFragmentManager();
        boolean j = m15419j(activity);
        C5983o g = mo12428g(fragmentManager);
        C5514ad adVar = g.f17647c;
        if (adVar == null) {
            adVar = this.f17656g.mo11839a(C5543d.m14321a(activity), g.f17645a, g.f17646b, activity);
            if (j) {
                adVar.mo11882q();
            }
            g.f17647c = adVar;
        }
        return adVar;
    }

    /* renamed from: c */
    public final C5514ad mo12424c(C0167am amVar) {
        if (C5632s.m14620m()) {
            return mo12423b(amVar.getApplicationContext());
        }
        m15418i(amVar);
        android.support.p031v4.app.FragmentManager jw = amVar.mo545jw();
        boolean j = m15419j(amVar);
        if (!mo12427f()) {
            return mo12425d(amVar, jw, (Fragment) null, j);
        }
        Context applicationContext = amVar.getApplicationContext();
        C5543d a = C5543d.m14321a(applicationContext);
        C5980l lVar = this.f17653c;
        C2384o lifecycle = amVar.getLifecycle();
        amVar.mo545jw();
        return lVar.mo12414a(applicationContext, a, lifecycle, j);
    }

    /* renamed from: d */
    public final C5514ad mo12425d(Context context, android.support.p031v4.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C5968ab e = mo12426e(fragmentManager, fragment);
        C5514ad adVar = e.f17633c;
        if (adVar == null) {
            adVar = this.f17656g.mo11839a(C5543d.m14321a(context), e.f17631a, e.f17632b, context);
            if (z) {
                adVar.mo11882q();
            }
            e.f17633c = adVar;
        }
        return adVar;
    }

    /* renamed from: e */
    public final C5968ab mo12426e(android.support.p031v4.app.FragmentManager fragmentManager, Fragment fragment) {
        android.support.p031v4.app.FragmentManager a;
        C5968ab abVar = (C5968ab) this.f17652b.get(fragmentManager);
        if (abVar == null && (abVar = (C5968ab) fragmentManager.f634a.mo671c("com.bumptech.glide.manager")) == null) {
            abVar = new C5968ab();
            abVar.f17634d = fragment;
            if (!(fragment == null || fragment.getContext() == null || (a = C5968ab.m15390a(fragment)) == null)) {
                abVar.mo12413b(fragment.getContext(), a);
            }
            this.f17652b.put(fragmentManager, abVar);
            C0154a aVar = new C0154a(fragmentManager);
            aVar.mo685r(abVar, "com.bumptech.glide.manager");
            aVar.mo505b(true);
            this.f17655f.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return abVar;
    }

    /* renamed from: f */
    public final boolean mo12427f() {
        return this.f17657h.mo12437a(C5634j.class);
    }

    /* renamed from: g */
    public final C5983o mo12428g(FragmentManager fragmentManager) {
        C5983o oVar = (C5983o) this.f17651a.get(fragmentManager);
        if (oVar != null) {
            return oVar;
        }
        C5983o oVar2 = (C5983o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar2 != null) {
            return oVar2;
        }
        C5983o oVar3 = new C5983o();
        this.f17651a.put(fragmentManager, oVar3);
        fragmentManager.beginTransaction().add(oVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f17655f.obtainMessage(1, fragmentManager).sendToTarget();
        return oVar3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: android.app.FragmentManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.arg1
            int r3 = r1.what
            java.lang.String r4 = "We failed to add our Fragment the first time around, trying again..."
            r5 = 3
            java.lang.String r6 = " New: "
            java.lang.String r7 = "We've added two fragments with requests! Old: "
            r8 = 5
            java.lang.String r9 = "com.bumptech.glide.manager"
            r10 = 0
            java.lang.String r12 = "RMRetriever"
            r13 = 1
            if (r3 == r13) goto L_0x00b4
            r14 = 2
            if (r3 == r14) goto L_0x0021
            r11 = 0
            r13 = 0
        L_0x001d:
            r16 = 0
            goto L_0x0144
        L_0x0021:
            java.lang.Object r1 = r1.obj
            android.support.v4.app.FragmentManager r1 = (android.support.p031v4.app.FragmentManager) r1
            java.util.Map r3 = r0.f17652b
            java.lang.Object r3 = r3.get(r1)
            com.bumptech.glide.manager.ab r3 = (com.bumptech.glide.manager.C5968ab) r3
            android.support.v4.app.cc r15 = r1.f634a
            android.support.v4.app.Fragment r15 = r15.mo671c(r9)
            com.bumptech.glide.manager.ab r15 = (com.bumptech.glide.manager.C5968ab) r15
            if (r15 != r3) goto L_0x0039
            goto L_0x00ac
        L_0x0039:
            if (r15 == 0) goto L_0x0060
            com.bumptech.glide.ad r11 = r15.f17633c
            if (r11 != 0) goto L_0x0040
            goto L_0x0060
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r15.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            r4.append(r2)
            r4.append(r6)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0060:
            if (r2 == r13) goto L_0x008b
            boolean r2 = r1.f659z
            if (r2 == 0) goto L_0x0067
            goto L_0x008b
        L_0x0067:
            android.support.v4.app.a r2 = new android.support.v4.app.a
            r2.<init>((android.support.p031v4.app.FragmentManager) r1)
            r2.mo685r(r3, r9)
            if (r15 == 0) goto L_0x0074
            r2.mo516m(r15)
        L_0x0074:
            r2.mo510g()
            android.os.Handler r2 = r0.f17655f
            android.os.Message r1 = r2.obtainMessage(r14, r13, r10, r1)
            r1.sendToTarget()
            boolean r1 = android.util.Log.isLoggable(r12, r5)
            if (r1 == 0) goto L_0x011c
            android.util.Log.d(r12, r4)
            goto L_0x011c
        L_0x008b:
            boolean r2 = r1.f659z
            if (r2 == 0) goto L_0x009b
            boolean r2 = android.util.Log.isLoggable(r12, r8)
            if (r2 == 0) goto L_0x00a7
            java.lang.String r2 = "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled"
            android.util.Log.w(r12, r2)
            goto L_0x00a7
        L_0x009b:
            r2 = 6
            boolean r2 = android.util.Log.isLoggable(r12, r2)
            if (r2 == 0) goto L_0x00a7
            java.lang.String r2 = "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup"
            android.util.Log.e(r12, r2)
        L_0x00a7:
            com.bumptech.glide.manager.a r2 = r3.f17631a
            r2.mo12409b()
        L_0x00ac:
            java.util.Map r2 = r0.f17652b
            java.lang.Object r11 = r2.remove(r1)
            goto L_0x0141
        L_0x00b4:
            java.lang.Object r1 = r1.obj
            android.app.FragmentManager r1 = (android.app.FragmentManager) r1
            java.util.Map r3 = r0.f17651a
            java.lang.Object r3 = r3.get(r1)
            com.bumptech.glide.manager.o r3 = (com.bumptech.glide.manager.C5983o) r3
            android.app.Fragment r11 = r1.findFragmentByTag(r9)
            com.bumptech.glide.manager.o r11 = (com.bumptech.glide.manager.C5983o) r11
            if (r11 != r3) goto L_0x00ca
            goto L_0x013b
        L_0x00ca:
            if (r11 == 0) goto L_0x00f1
            com.bumptech.glide.ad r14 = r11.f17647c
            if (r14 != 0) goto L_0x00d1
            goto L_0x00f1
        L_0x00d1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r11.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            r4.append(r2)
            r4.append(r6)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x00f1:
            if (r2 == r13) goto L_0x011f
            boolean r2 = r1.isDestroyed()
            if (r2 == 0) goto L_0x00fa
            goto L_0x011f
        L_0x00fa:
            android.app.FragmentTransaction r2 = r1.beginTransaction()
            android.app.FragmentTransaction r2 = r2.add(r3, r9)
            if (r11 == 0) goto L_0x0107
            r2.remove(r11)
        L_0x0107:
            r2.commitAllowingStateLoss()
            android.os.Handler r2 = r0.f17655f
            android.os.Message r1 = r2.obtainMessage(r13, r13, r10, r1)
            r1.sendToTarget()
            boolean r1 = android.util.Log.isLoggable(r12, r5)
            if (r1 == 0) goto L_0x011c
            android.util.Log.d(r12, r4)
        L_0x011c:
            r11 = 0
            goto L_0x001d
        L_0x011f:
            boolean r2 = android.util.Log.isLoggable(r12, r8)
            if (r2 == 0) goto L_0x0136
            boolean r2 = r1.isDestroyed()
            if (r2 == 0) goto L_0x0131
            java.lang.String r2 = "Parent was destroyed before our Fragment could be added"
            android.util.Log.w(r12, r2)
            goto L_0x0136
        L_0x0131:
            java.lang.String r2 = "Tried adding Fragment twice and failed twice, giving up!"
            android.util.Log.w(r12, r2)
        L_0x0136:
            com.bumptech.glide.manager.a r2 = r3.f17645a
            r2.mo12409b()
        L_0x013b:
            java.util.Map r2 = r0.f17651a
            java.lang.Object r11 = r2.remove(r1)
        L_0x0141:
            r16 = r1
            r10 = 1
        L_0x0144:
            boolean r1 = android.util.Log.isLoggable(r12, r8)
            if (r1 == 0) goto L_0x015f
            if (r10 == 0) goto L_0x015f
            if (r11 != 0) goto L_0x015f
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Failed to remove expected request manager fragment, manager: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.w(r12, r1)
        L_0x015f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.C5986r.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: b */
    public final C5514ad mo12423b(Context context) {
        if (context != null) {
            if (C5632s.m14621n() && !(context instanceof Application)) {
                if (context instanceof C0167am) {
                    return mo12424c((C0167am) context);
                }
                if (context instanceof Activity) {
                    return mo12422a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo12423b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f17654e == null) {
                synchronized (this) {
                    if (this.f17654e == null) {
                        this.f17654e = this.f17656g.mo11839a(C5543d.m14321a(context.getApplicationContext()), new C5970b(), new C5975g(), context.getApplicationContext());
                    }
                }
            }
            return this.f17654e;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }
}
