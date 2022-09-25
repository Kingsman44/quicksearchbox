package com.google.android.apps.gsa.sidekick.main.entry;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.sidekick.shared.cards.C91693h;
import com.google.common.p4522b.C58758qx;
import com.google.p375ai.p378b.C7713he;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7777jo;
import com.google.p375ai.p378b.C8110vx;
import com.google.p375ai.p378b.C8126wm;
import com.google.p375ai.p378b.C8131wr;
import com.google.p375ai.p378b.C8186ys;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bh */
/* compiled from: PG */
public class C91330bh extends C91693h {

    /* renamed from: a */
    static final Set f254878a;

    /* renamed from: b */
    private final Context f254879b;

    static {
        C8110vx[] vxVarArr = {C8110vx.BASEBALL, C8110vx.BASKETBALL, C8110vx.FOOTBALL, C8110vx.HOCKEY, C8110vx.SOCCER, C8110vx.RUGBY, C8110vx.CRICKET};
        HashSet g = C58758qx.m90649g(7);
        Collections.addAll(g, vxVarArr);
        f254878a = g;
    }

    public C91330bh(Context context) {
        this.f254879b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean mo85588l(C7718hj hjVar, Void voidR) {
        int a = C7713he.m22812a(hjVar.f26985z);
        boolean z = false;
        if (a != 0 && a == 4) {
            return false;
        }
        C7746ik ikVar = C7746ik.UNKNOWN;
        C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 2) {
            C8186ys ysVar = hjVar.f26976q;
            if (ysVar == null) {
                ysVar = C8186ys.f28759e;
            }
            if (ysVar.f28764d.size() > 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (ordinal == 4) {
            if ((hjVar.f26955a & 8192) != 0) {
                C7777jo joVar = hjVar.f26977r;
                if (joVar == null) {
                    joVar = C7777jo.f27217m;
                }
                if ("Wifi".equals(joVar.f27220b)) {
                    return Boolean.valueOf(!C90772bp.m148280G(this.f254879b));
                }
            }
            return true;
        } else if (ordinal != 6) {
            return true;
        } else {
            if ((hjVar.f26955a & 16384) != 0) {
                C8131wr wrVar = hjVar.f26978s;
                if (wrVar == null) {
                    wrVar = C8131wr.f28584p;
                }
                if (wrVar.f28592g.size() == 2) {
                    Set set = f254878a;
                    C8110vx a3 = C8110vx.m22949a(wrVar.f28587b);
                    if (a3 == null) {
                        a3 = C8110vx.BASKETBALL;
                    }
                    if (set.contains(a3)) {
                        int a4 = C8126wm.m22953a(wrVar.f28588c);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        if (a4 == 3 || a4 == 2 || a4 == 1) {
                            z = true;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Boolean mo85585d(C7718hj hjVar, List list, Void voidR) {
        int a = C7713he.m22812a(hjVar.f26985z);
        boolean z = false;
        if (a != 0 && a == 4) {
            return false;
        }
        C7746ik ikVar = C7746ik.UNKNOWN;
        C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 12) {
            return true;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (mo85586e((C7718hj) it.next())) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public boolean mo85586e(C7718hj hjVar) {
        Boolean bool = (Boolean) mo85588l(hjVar, (Object) null);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: f */
    public boolean mo85587f(C7718hj hjVar, List list) {
        Boolean bool = (Boolean) mo86201g(hjVar, list, (Object) null);
        return bool != null && bool.booleanValue();
    }
}
