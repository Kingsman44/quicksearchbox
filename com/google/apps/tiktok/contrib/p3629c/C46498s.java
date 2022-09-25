package com.google.apps.tiktok.contrib.p3629c;

import android.os.Bundle;
import androidx.navigation.C3807af;
import androidx.navigation.C3823av;
import androidx.navigation.C3825ax;
import androidx.navigation.C3840bh;
import androidx.navigation.C3864ce;
import androidx.navigation.C3876f;
import androidx.navigation.C3892m;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.protobuf.MessageLite;
import dagger.p5294a.C68221g;
import java.util.Set;
import java.util.WeakHashMap;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69530n;

/* renamed from: com.google.apps.tiktok.contrib.c.s */
/* compiled from: PG */
public final class C46498s implements C46496q {

    /* renamed from: a */
    public final C58881cr f121646a;

    /* renamed from: b */
    private final C58833ax f121647b;

    /* renamed from: c */
    private final C69464a f121648c;

    public C46498s(C58833ax axVar, C58881cr crVar, C69464a aVar) {
        this.f121647b = axVar;
        this.f121646a = crVar;
        this.f121648c = aVar;
    }

    /* renamed from: a */
    public final C3807af mo50505a() {
        return (C3807af) this.f121646a.mo6453a();
    }

    /* renamed from: b */
    public final void mo50506b(int i) {
        mo50507c(C46504y.m82902f(i).mo50495a());
    }

    /* renamed from: c */
    public final void mo50507c(C46504y yVar) {
        C3825ax axVar;
        int i;
        int i2;
        WeakHashMap weakHashMap = C47831fm.f123851a;
        for (C46505z a : (Set) ((C68221g) this.f121648c).f184583a) {
            a.mo50516a();
        }
        Bundle b = yVar.mo50497b();
        if (b == null) {
            b = new Bundle();
        }
        C46493n.m82877b(this.f121647b, b);
        if (yVar.mo50500e() != null) {
            b.putAll(yVar.mo50500e().mo50504d());
        }
        C47573bx w = C47831fm.m85028w();
        try {
            C3807af afVar = (C3807af) this.f121646a.mo6453a();
            int a2 = yVar.mo50496a();
            C3840bh c = yVar.mo50498c();
            C3864ce d = yVar.mo50499d();
            C69530n nVar = afVar.f12292f;
            if (nVar.isEmpty()) {
                axVar = afVar.f12288b;
            } else {
                axVar = ((C3892m) nVar.mo61313e()).f12477b;
            }
            if (axVar != null) {
                C3876f d2 = axVar.mo8086d(a2);
                Bundle bundle = null;
                if (d2 != null) {
                    if (c == null) {
                        c = d2.f12447b;
                    }
                    i = d2.f12446a;
                    Bundle bundle2 = d2.f12448c;
                    if (bundle2 != null) {
                        bundle = new Bundle();
                        bundle.putAll(bundle2);
                    }
                } else {
                    i = a2;
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putAll(b);
                if (i == 0) {
                    i = 0;
                    if (!(c == null || (i2 = c.f12392c) == -1)) {
                        afVar.mo8062v(i2, c.f12393d, false);
                        w.close();
                        return;
                    }
                }
                if (i != 0) {
                    C3825ax e = afVar.mo8045e(i);
                    if (e == null) {
                        String b2 = C3823av.m11044b(afVar.f12287a, i);
                        if (d2 == null) {
                            throw new IllegalArgumentException("Navigation action/destination " + b2 + " cannot be found from the current destination " + axVar);
                        }
                        throw new IllegalArgumentException("Navigation destination " + b2 + " referenced from action " + C3823av.m11044b(afVar.f12287a, a2) + " cannot be found from the current destination " + axVar);
                    }
                    afVar.mo8052l(e, bundle, c, d);
                    w.close();
                    return;
                }
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
            throw new IllegalStateException("no current navigation node");
        } catch (Throwable th) {
            C46497r.m82889a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo50508d(int i, Bundle bundle) {
        C46503x f = C46504y.m82902f(i);
        ((C46491l) f).f121638b = bundle;
        mo50507c(f.mo50495a());
    }

    /* renamed from: e */
    public final void mo50509e(int i, MessageLite messageLite) {
        C46503x f = C46504y.m82902f(i);
        ((C46491l) f).f121639c = C46490k.m82868a(messageLite);
        mo50507c(f.mo50495a());
    }

    /* renamed from: f */
    public final void mo50510f() {
        C47573bx w = C47831fm.m85028w();
        try {
            ((C3807af) this.f121646a.mo6453a()).mo8040A();
            w.close();
            return;
        } catch (Throwable th) {
            C46497r.m82889a(th, th);
        }
        throw th;
    }
}
