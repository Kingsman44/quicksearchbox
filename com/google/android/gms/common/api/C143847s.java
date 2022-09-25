package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.p060c.C0979i;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.C143767bo;
import com.google.android.gms.common.api.internal.C143779c;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143790ck;
import com.google.android.gms.common.api.internal.C143797cr;
import com.google.android.gms.common.api.internal.C143810dd;
import com.google.android.gms.common.api.internal.C143816e;
import com.google.android.gms.common.api.internal.C143817f;
import com.google.android.gms.common.api.internal.C143820i;
import com.google.android.gms.common.api.internal.C143824m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143942q;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.s */
/* compiled from: PG */
public class C143847s {

    /* renamed from: A */
    public final C143820i f389926A;

    /* renamed from: B */
    public final Looper f389927B;

    /* renamed from: C */
    public final int f389928C;

    /* renamed from: D */
    public final C143851w f389929D;

    /* renamed from: E */
    public final C143767bo f389930E;

    /* renamed from: w */
    public final Context f389931w;

    /* renamed from: x */
    public final String f389932x;

    /* renamed from: y */
    public final C143841m f389933y;

    /* renamed from: z */
    public final C143724i f389934z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: com.google.android.gms.common.api.internal.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: com.google.android.gms.common.api.internal.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: com.google.android.gms.common.api.internal.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: com.google.android.gms.common.api.internal.ca} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: com.google.android.gms.common.api.internal.da} */
    /* JADX WARNING: type inference failed for: r11v28, types: [android.support.v4.app.Fragment, com.google.android.gms.common.api.internal.da] */
    /* JADX WARNING: type inference failed for: r11v30, types: [android.support.v4.app.Fragment, com.google.android.gms.common.api.internal.da] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        if (r11 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a9, code lost:
        if (r12 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        if (r11 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
        if (r12 != false) goto L_0x00fb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143847s(android.content.Context r8, android.app.Activity r9, com.google.android.gms.common.api.C143841m r10, com.google.android.gms.common.api.C143724i r11, com.google.android.gms.common.api.C143846r r12) {
        /*
            r7 = this;
            java.lang.String r0 = "LifecycleFragmentImpl"
            java.lang.String r1 = "SupportLifecycleFragmentImpl"
            r7.<init>()
            java.lang.String r2 = "Null context is not permitted."
            com.google.android.gms.common.internal.C143919bh.m233971n(r8, r2)
            java.lang.String r2 = "Api must not be null."
            com.google.android.gms.common.internal.C143919bh.m233971n(r10, r2)
            java.lang.String r2 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            com.google.android.gms.common.internal.C143919bh.m233971n(r12, r2)
            android.content.Context r2 = r8.getApplicationContext()
            java.lang.String r3 = "The provided context did not have an application context."
            com.google.android.gms.common.internal.C143919bh.m233971n(r2, r3)
            r7.f389931w = r2
            boolean r2 = com.google.android.gms.common.util.C144013m.m234192a()
            r3 = 0
            if (r2 == 0) goto L_0x003e
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.String r4 = "getAttributionTag"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003d }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003d }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003d }
            java.lang.Object r8 = r2.invoke(r8, r4)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003d }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003d }
            r3 = r8
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            r7.f389932x = r3
            r7.f389933y = r10
            r7.f389934z = r11
            android.os.Looper r8 = r12.f389924b
            r7.f389927B = r8
            com.google.android.gms.common.api.internal.i r8 = new com.google.android.gms.common.api.internal.i
            r8.<init>(r10, r11, r3)
            r7.f389926A = r8
            com.google.android.gms.common.api.internal.bp r10 = new com.google.android.gms.common.api.internal.bp
            r10.<init>(r7)
            r7.f389929D = r10
            android.content.Context r10 = r7.f389931w
            com.google.android.gms.common.api.internal.bo r10 = com.google.android.gms.common.api.internal.C143767bo.m233633c(r10)
            r7.f389930E = r10
            java.util.concurrent.atomic.AtomicInteger r11 = r10.f389779i
            int r11 = r11.getAndIncrement()
            r7.f389928C = r11
            com.google.android.gms.common.api.internal.h r11 = r12.f389925c
            if (r9 == 0) goto L_0x013f
            boolean r11 = r9 instanceof com.google.android.gms.common.api.GoogleApiActivity
            if (r11 != 0) goto L_0x013f
            android.os.Looper r11 = android.os.Looper.myLooper()
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            if (r11 != r12) goto L_0x013f
            com.google.android.gms.common.api.internal.bx r11 = new com.google.android.gms.common.api.internal.bx
            r11.<init>(r9)
            java.lang.Object r9 = r11.f389792a
            boolean r11 = r9 instanceof android.support.p031v4.app.C0167am
            if (r11 == 0) goto L_0x00d4
            android.support.v4.app.am r9 = (android.support.p031v4.app.C0167am) r9
            java.util.WeakHashMap r11 = com.google.android.gms.common.api.internal.C143807da.f389855a
            java.lang.Object r11 = r11.get(r9)
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11
            if (r11 == 0) goto L_0x0097
            java.lang.Object r11 = r11.get()
            com.google.android.gms.common.api.internal.da r11 = (com.google.android.gms.common.api.internal.C143807da) r11
            if (r11 != 0) goto L_0x011c
        L_0x0097:
            android.support.v4.app.FragmentManager r11 = r9.mo545jw()     // Catch:{ ClassCastException -> 0x00cb }
            android.support.v4.app.cc r11 = r11.f634a     // Catch:{ ClassCastException -> 0x00cb }
            android.support.v4.app.Fragment r11 = r11.mo671c(r1)     // Catch:{ ClassCastException -> 0x00cb }
            com.google.android.gms.common.api.internal.da r11 = (com.google.android.gms.common.api.internal.C143807da) r11     // Catch:{ ClassCastException -> 0x00cb }
            if (r11 == 0) goto L_0x00ab
            boolean r12 = r11.isRemoving()
            if (r12 == 0) goto L_0x00c0
        L_0x00ab:
            com.google.android.gms.common.api.internal.da r11 = new com.google.android.gms.common.api.internal.da
            r11.<init>()
            android.support.v4.app.FragmentManager r12 = r9.mo545jw()
            android.support.v4.app.a r0 = new android.support.v4.app.a
            r0.<init>((android.support.p031v4.app.FragmentManager) r12)
            r0.mo685r(r11, r1)
            r12 = 1
            r0.mo505b(r12)
        L_0x00c0:
            java.util.WeakHashMap r12 = com.google.android.gms.common.api.internal.C143807da.f389855a
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r11)
            r12.put(r9, r0)
            goto L_0x011c
        L_0x00cb:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r9.<init>(r10, r8)
            throw r9
        L_0x00d4:
            java.util.WeakHashMap r11 = com.google.android.gms.common.api.internal.C143780ca.f389797a
            java.lang.Object r11 = r11.get(r9)
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11
            if (r11 == 0) goto L_0x00e6
            java.lang.Object r11 = r11.get()
            com.google.android.gms.common.api.internal.ca r11 = (com.google.android.gms.common.api.internal.C143780ca) r11
            if (r11 != 0) goto L_0x011c
        L_0x00e6:
            r11 = r9
            android.app.Activity r11 = (android.app.Activity) r11     // Catch:{ ClassCastException -> 0x0136 }
            android.app.FragmentManager r11 = r11.getFragmentManager()     // Catch:{ ClassCastException -> 0x0136 }
            android.app.Fragment r11 = r11.findFragmentByTag(r0)     // Catch:{ ClassCastException -> 0x0136 }
            com.google.android.gms.common.api.internal.ca r11 = (com.google.android.gms.common.api.internal.C143780ca) r11     // Catch:{ ClassCastException -> 0x0136 }
            if (r11 == 0) goto L_0x00fb
            boolean r12 = r11.isRemoving()
            if (r12 == 0) goto L_0x0112
        L_0x00fb:
            com.google.android.gms.common.api.internal.ca r11 = new com.google.android.gms.common.api.internal.ca
            r11.<init>()
            r12 = r9
            android.app.Activity r12 = (android.app.Activity) r12
            android.app.FragmentManager r12 = r12.getFragmentManager()
            android.app.FragmentTransaction r12 = r12.beginTransaction()
            android.app.FragmentTransaction r12 = r12.add(r11, r0)
            r12.commitAllowingStateLoss()
        L_0x0112:
            java.util.WeakHashMap r12 = com.google.android.gms.common.api.internal.C143780ca.f389797a
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r11)
            r12.put(r9, r0)
        L_0x011c:
            java.lang.Class<com.google.android.gms.common.api.internal.ae> r9 = com.google.android.gms.common.api.internal.C143730ae.class
            com.google.android.gms.common.api.internal.LifecycleCallback r9 = r11.mo119220c(r9)
            com.google.android.gms.common.api.internal.ae r9 = (com.google.android.gms.common.api.internal.C143730ae) r9
            if (r9 != 0) goto L_0x012d
            com.google.android.gms.common.api.internal.ae r9 = new com.google.android.gms.common.api.internal.ae
            com.google.android.gms.common.g r12 = com.google.android.gms.common.C143875g.f389987a
            r9.<init>(r11, r10, r12)
        L_0x012d:
            androidx.c.i r11 = r9.f389652e
            r11.add(r8)
            r10.mo119212h(r9)
            goto L_0x013f
        L_0x0136:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            r9.<init>(r10, r8)
            throw r9
        L_0x013f:
            android.os.Handler r8 = r10.f389784n
            r9 = 7
            android.os.Message r9 = r8.obtainMessage(r9, r7)
            r8.sendMessage(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C143847s.<init>(android.content.Context, android.app.Activity, com.google.android.gms.common.api.m, com.google.android.gms.common.api.i, com.google.android.gms.common.api.r):void");
    }

    /* renamed from: t */
    public final C143942q mo119289t() {
        Set set;
        GoogleSignInAccount a;
        C143942q qVar = new C143942q();
        C143724i iVar = this.f389934z;
        Account account = null;
        if (!(iVar instanceof C143720e) || (a = ((C143720e) iVar).mo119109a()) == null) {
            C143724i iVar2 = this.f389934z;
            if (iVar2 instanceof C143719d) {
                account = ((C143719d) iVar2).mo119108a();
            }
        } else {
            String str = a.f387689d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        qVar.f390163a = account;
        C143724i iVar3 = this.f389934z;
        if (iVar3 instanceof C143720e) {
            GoogleSignInAccount a2 = ((C143720e) iVar3).mo119109a();
            if (a2 == null) {
                set = Collections.emptySet();
            } else {
                set = a2.mo117797a();
            }
        } else {
            set = Collections.emptySet();
        }
        if (qVar.f390164b == null) {
            qVar.f390164b = new C0979i(0);
        }
        qVar.f390164b.addAll(set);
        qVar.f390166d = this.f389931w.getClass().getName();
        qVar.f390165c = this.f389931w.getPackageName();
        return qVar;
    }

    /* renamed from: u */
    public final C146006ab mo119290u(int i, C143810dd ddVar) {
        C146010af afVar = new C146010af();
        C143767bo boVar = this.f389930E;
        boVar.mo119209e(afVar, ddVar.f389866d, this);
        C143816e eVar = new C143816e(i, ddVar, afVar);
        Handler handler = boVar.f389784n;
        handler.sendMessage(handler.obtainMessage(4, new C143790ck(eVar, boVar.f389780j.get(), this)));
        return afVar.f394698a;
    }

    /* renamed from: v */
    public final C146006ab mo119291v(C143797cr crVar) {
        C143919bh.m233971n(crVar.f389838a.f389821a.f389806b, "Listener has already been released.");
        return this.f389930E.mo119208d(this, crVar.f389838a, crVar.f389839b, crVar.f389840c);
    }

    /* renamed from: w */
    public final C146006ab mo119292w(C143782cc ccVar, int i) {
        C143767bo boVar = this.f389930E;
        C146010af afVar = new C146010af();
        boVar.mo119209e(afVar, i, this);
        C143817f fVar = new C143817f(ccVar, afVar);
        Handler handler = boVar.f389784n;
        handler.sendMessage(handler.obtainMessage(13, new C143790ck(fVar, boVar.f389780j.get(), this)));
        return afVar.f394698a;
    }

    /* renamed from: x */
    public final void mo119293x(int i, C143824m mVar) {
        mVar.mo119111n();
        C143767bo boVar = this.f389930E;
        C143779c cVar = new C143779c(i, mVar);
        Handler handler = boVar.f389784n;
        handler.sendMessage(handler.obtainMessage(4, new C143790ck(cVar, boVar.f389780j.get(), this)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143847s(android.content.Context r8, com.google.android.gms.common.api.C143841m r9, com.google.android.gms.common.api.C143724i r10, com.google.android.gms.common.api.internal.C143819h r11) {
        /*
            r7 = this;
            com.google.android.gms.common.api.q r0 = new com.google.android.gms.common.api.q
            r0.<init>()
            r0.f389921a = r11
            r3 = 0
            com.google.android.gms.common.api.r r6 = r0.mo119288a()
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C143847s.<init>(android.content.Context, com.google.android.gms.common.api.m, com.google.android.gms.common.api.i, com.google.android.gms.common.api.internal.h):void");
    }
}
