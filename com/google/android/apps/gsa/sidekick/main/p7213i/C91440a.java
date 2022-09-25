package com.google.android.apps.gsa.sidekick.main.p7213i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.sidekick.shared.C91651c;
import com.google.android.apps.gsa.sidekick.shared.C91729f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7607dg;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7834lr;
import com.google.p375ai.p378b.C7838lv;
import com.google.p375ai.p378b.C7892nv;
import com.google.p375ai.p378b.C7893nw;
import com.google.p375ai.p378b.C7986rh;
import com.google.p375ai.p378b.C7994rp;
import com.google.p375ai.p378b.C8027sv;
import com.google.p375ai.p378b.C8052tt;
import com.google.p375ai.p378b.C8185yr;
import com.google.p375ai.p378b.C8186ys;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.i.a */
/* compiled from: PG */
public final class C91440a implements C91651c {

    /* renamed from: a */
    private final C91189au f255056a;

    /* renamed from: b */
    private final C91729f f255057b;

    /* renamed from: c */
    private final C91443d f255058c = new C91443d(this);

    /* renamed from: d */
    private final C22871g f255059d;

    public C91440a(C91189au auVar, C91729f fVar, C22871g gVar) {
        this.f255056a = auVar;
        this.f255057b = fVar;
        this.f255059d = gVar;
    }

    /* renamed from: e */
    private static void m149560e(C7718hj hjVar, C91442c cVar) {
        if (hjVar != null) {
            for (C7708h hVar : hjVar.f26935G) {
                if (hVar.f26905j && (hVar.f26896a & 64) != 0) {
                    C7799kj kjVar = hVar.f26903h;
                    if (kjVar == null) {
                        kjVar = C7799kj.f27263h;
                    }
                    cVar.f255062b.add(kjVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final C91442c mo85797j(C7718hj hjVar) {
        C7607dg dgVar;
        C8027sv svVar;
        C7986rh rhVar;
        C8052tt ttVar;
        C8052tt ttVar2;
        C7986rh rhVar2;
        C8027sv svVar2;
        C91442c cVar = new C91442c(this.f255059d, this.f255056a, this.f255057b, this.f255058c);
        m149560e(hjVar, cVar);
        int i = hjVar.f26955a;
        if ((131072 & i) != 0) {
            C7834lr lrVar = hjVar.f26981v;
            if (lrVar == null) {
                lrVar = C7834lr.f27467c;
            }
            for (C7994rp rpVar : lrVar.f27469a) {
                if (rpVar.f28073b == 1) {
                    svVar = (C8027sv) rpVar.f28074c;
                } else {
                    svVar = C8027sv.f28188l;
                }
                if ((svVar.f28190a & 8) != 0) {
                    if (rpVar.f28073b == 1) {
                        svVar2 = (C8027sv) rpVar.f28074c;
                    } else {
                        svVar2 = C8027sv.f28188l;
                    }
                    C7893nw nwVar = svVar2.f28195f;
                    if (nwVar == null) {
                        nwVar = C7893nw.f27731q;
                    }
                    cVar.mo85799a(nwVar);
                }
                if (rpVar.f28073b == 8) {
                    rhVar = (C7986rh) rpVar.f28074c;
                } else {
                    rhVar = C7986rh.f28046o;
                }
                if ((rhVar.f28048a & 8) != 0) {
                    C7892nv nvVar = (C7892nv) C7893nw.f27731q.createBuilder();
                    if (rpVar.f28073b == 8) {
                        rhVar2 = (C7986rh) rpVar.f28074c;
                    } else {
                        rhVar2 = C7986rh.f28046o;
                    }
                    String str = rhVar2.f28052e;
                    nvVar.copyOnWrite();
                    C7893nw nwVar2 = (C7893nw) nvVar.instance;
                    str.getClass();
                    nwVar2.f27733a |= 512;
                    nwVar2.f27743k = str;
                    cVar.mo85799a((C7893nw) nvVar.build());
                }
                if (rpVar.f28073b == 14) {
                    ttVar = (C8052tt) rpVar.f28074c;
                } else {
                    ttVar = C8052tt.f28314B;
                }
                C7838lv lvVar = ttVar.f28329l;
                if (lvVar == null) {
                    lvVar = C7838lv.f27474p;
                }
                if (lvVar.f27477b == 2) {
                    C7892nv nvVar2 = (C7892nv) C7893nw.f27731q.createBuilder();
                    if (rpVar.f28073b == 14) {
                        ttVar2 = (C8052tt) rpVar.f28074c;
                    } else {
                        ttVar2 = C8052tt.f28314B;
                    }
                    C7838lv lvVar2 = ttVar2.f28329l;
                    if (lvVar2 == null) {
                        lvVar2 = C7838lv.f27474p;
                    }
                    String str2 = lvVar2.f27477b == 2 ? (String) lvVar2.f27478c : BuildConfig.FLAVOR;
                    nvVar2.copyOnWrite();
                    C7893nw nwVar3 = (C7893nw) nvVar2.instance;
                    str2.getClass();
                    nwVar3.f27733a |= 512;
                    nwVar3.f27743k = str2;
                    cVar.mo85799a((C7893nw) nvVar2.build());
                }
            }
        } else if ((1048576 & i) != 0) {
            C7834lr lrVar2 = hjVar.f26984y;
            if (lrVar2 == null) {
                lrVar2 = C7834lr.f27467c;
            }
            for (C7994rp rpVar2 : lrVar2.f27469a) {
                C7536ax axVar = rpVar2.f28077f;
                if (axVar == null) {
                    axVar = C7536ax.f26084o;
                }
                if (axVar.f26088c == 5) {
                    dgVar = (C7607dg) axVar.f26089d;
                } else {
                    dgVar = C7607dg.f26290e;
                }
                for (C7893nw nwVar4 : dgVar.f26294c) {
                    if ((nwVar4.f27733a & 512) != 0) {
                        cVar.mo85799a(nwVar4);
                    }
                }
            }
        } else if ((i & 4096) != 0) {
            C8186ys ysVar = hjVar.f26976q;
            if (ysVar == null) {
                ysVar = C8186ys.f28759e;
            }
            C8185yr yrVar = ysVar.f28763c;
            if (yrVar == null) {
                yrVar = C8185yr.f28747k;
            }
            if ((yrVar.f28749a & 4) != 0) {
                C7892nv nvVar3 = (C7892nv) C7893nw.f27731q.createBuilder();
                C8185yr yrVar2 = ysVar.f28763c;
                if (yrVar2 == null) {
                    yrVar2 = C8185yr.f28747k;
                }
                String str3 = yrVar2.f28752d;
                nvVar3.copyOnWrite();
                C7893nw nwVar5 = (C7893nw) nvVar3.instance;
                str3.getClass();
                nwVar5.f27733a |= 512;
                nwVar5.f27743k = str3;
                cVar.mo85799a((C7893nw) nvVar3.build());
            }
            if (ysVar.f28764d.size() != 0) {
                for (C8185yr yrVar3 : ysVar.f28764d) {
                    if ((yrVar3.f28749a & 4) != 0) {
                        C7892nv nvVar4 = (C7892nv) C7893nw.f27731q.createBuilder();
                        String str4 = yrVar3.f28752d;
                        nvVar4.copyOnWrite();
                        C7893nw nwVar6 = (C7893nw) nvVar4.instance;
                        str4.getClass();
                        nwVar6.f27733a |= 512;
                        nwVar6.f27743k = str4;
                        cVar.mo85799a((C7893nw) nvVar4.build());
                    }
                }
            }
        }
        if (cVar.mo85801c()) {
            return cVar;
        }
        return null;
    }

    /* renamed from: d */
    public final C91442c mo85796d(C7718hj hjVar) {
        C91442c cVar = new C91442c(this.f255059d, this.f255056a, this.f255057b, this.f255058c);
        m149560e(hjVar, cVar);
        if (cVar.mo85801c()) {
            return cVar;
        }
        return null;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo85798k(C7718hj hjVar, List list) {
        return mo85796d(hjVar);
    }
}
