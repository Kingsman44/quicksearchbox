package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b;

import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.apps.search.googleapp.search.suggest.p10453e.C138079a;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138399au;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p395al.p417d.p418a.C8574bb;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.b.p */
/* compiled from: PG */
public final class C138421p implements C138399au {

    /* renamed from: a */
    public final C138413h f376524a;

    /* renamed from: b */
    public final boolean f376525b;

    /* renamed from: c */
    public final boolean f376526c;

    /* renamed from: d */
    public final long f376527d;

    /* renamed from: e */
    public final ExecutorService f376528e;

    /* renamed from: f */
    private final C138424s f376529f;

    /* renamed from: g */
    private final boolean f376530g;

    public C138421p(C138413h hVar, boolean z, C138424s sVar, boolean z2, boolean z3, long j, ExecutorService executorService) {
        this.f376524a = hVar;
        this.f376530g = z;
        this.f376529f = sVar;
        this.f376525b = z2;
        this.f376526c = z3;
        this.f376527d = j;
        this.f376528e = executorService;
    }

    /* renamed from: d */
    public static C138678v m224831d(C138133o oVar) {
        C138543u uVar = (C138543u) C138678v.f377195e.createBuilder();
        String str = oVar.f375825b;
        uVar.copyOnWrite();
        C138678v vVar = (C138678v) uVar.instance;
        str.getClass();
        vVar.f377197a |= 1;
        vVar.f377198b = str;
        C8575bc bcVar = oVar.f375831h;
        if (bcVar == null) {
            bcVar = C8575bc.f29690g;
        }
        for (C8574bb bbVar : bcVar.f29694c) {
            C138027as asVar = (C138027as) C138030av.f375536m.createBuilder();
            String str2 = bbVar.f29688b;
            asVar.copyOnWrite();
            C138030av avVar = (C138030av) asVar.instance;
            str2.getClass();
            avVar.f375538a |= 1;
            avVar.f375539b = str2;
            String a = C138079a.m224412a(oVar.f375825b, bbVar.f29688b);
            asVar.copyOnWrite();
            C138030av avVar2 = (C138030av) asVar.instance;
            avVar2.f375538a |= 2;
            avVar2.f375540c = a;
            C138029au auVar = C138029au.QUERY;
            asVar.copyOnWrite();
            C138030av avVar3 = (C138030av) asVar.instance;
            avVar3.f375541d = auVar.f375534n;
            avVar3.f375538a |= 4;
            asVar.mo114079a(C64369b.m96390a(bbVar.f29689c));
            C138032ax axVar = C138032ax.PRIMARY;
            asVar.copyOnWrite();
            C138030av avVar4 = (C138030av) asVar.instance;
            avVar4.f375547k = axVar.f375579B;
            avVar4.f375538a |= 128;
            C138034az azVar = C138034az.COMPLETE_SERVER;
            asVar.copyOnWrite();
            C138030av avVar5 = (C138030av) asVar.instance;
            avVar5.f375545i = azVar.f375590i;
            avVar5.f375538a |= 32;
            uVar.mo114311c((C138030av) asVar.build());
        }
        return (C138678v) uVar.build();
    }

    /* renamed from: e */
    public static boolean m224832e(C138030av avVar) {
        C138029au a = C138029au.m224331a(avVar.f375541d);
        if (a == null) {
            a = C138029au.QUERY;
        }
        return a == C138029au.PERSONALIZED_QUERY || new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_PERSONAL);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo114275b() {
    }

    /* renamed from: c */
    public final int mo114278c(List list, C138543u uVar, Set set, int i, boolean z) {
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C138030av avVar = (C138030av) it.next();
            if (((long) ((C138678v) uVar.instance).f377199c.size()) >= this.f376527d) {
                break;
            }
            if (set.contains(avVar.f375539b)) {
                C138029au a = C138029au.m224331a(avVar.f375541d);
                if (a == null) {
                    a = C138029au.QUERY;
                }
                if (a == C138029au.QUERY) {
                }
            }
            C138027as asVar = (C138027as) avVar.toBuilder();
            asVar.copyOnWrite();
            C138030av avVar2 = (C138030av) asVar.instance;
            avVar2.f375538a |= 64;
            avVar2.f375546j = i - i2;
            uVar.mo114311c((C138030av) asVar.build());
            if (z) {
                set.add(avVar.f375539b);
            }
            i2++;
        }
        return i2;
    }

    /* renamed from: a */
    public final C60870cx mo114274a(C138133o oVar) {
        if (!this.f376530g || !oVar.f375837n) {
            return C60856cj.m92900i(Optional.empty());
        }
        C138424s sVar = this.f376529f;
        C8575bc bcVar = oVar.f375831h;
        if (bcVar == null) {
            bcVar = C8575bc.f29690g;
        }
        if (bcVar.f29696e) {
            sVar.f376543a.set(true);
        }
        C138413h hVar = this.f376524a;
        C60870cx e = hVar.f376514a.mo50345e(C138408c.f376504c);
        C138410e eVar = C138410e.f376509a;
        C60870cx g = C60922j.m93044g(e, C47810es.m84963c(eVar), hVar.f376515b);
        C138417l lVar = new C138417l(this, oVar);
        return C60922j.m93045h(g, C47810es.m84966f(lVar), this.f376528e);
    }
}
