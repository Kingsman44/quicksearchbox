package com.google.android.apps.gsa.sidekick.main.entry;

import android.content.Context;
import android.content.Intent;
import android.database.Observable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91737g;
import com.google.android.apps.gsa.sidekick.shared.util.C92001t;
import com.google.android.apps.gsa.sidekick.shared.util.C92005x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.as */
/* compiled from: PG */
public final class C91314as extends Observable implements C90991b, C90997f {

    /* renamed from: a */
    private final Context f254836a;

    /* renamed from: b */
    private final C90998g f254837b;

    /* renamed from: c */
    private final C22871g f254838c;

    public C91314as(Context context, C90998g gVar, C22871g gVar2) {
        this.f254836a = context;
        this.f254837b = gVar;
        this.f254838c = gVar2;
    }

    /* renamed from: e */
    private static void m149272e(C91006f fVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C92001t.m151015h(fVar, str, (C92005x) it.next());
        }
    }

    /* renamed from: a */
    public final void mo84666a(C91006f fVar, C91000i iVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C91316au.f254840p);
        iVar.mo58887l(r0);
        Object l = iVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C91316au auVar = (C91316au) obj;
        if (auVar != null) {
            if (auVar.f254843b) {
                fVar.mo85279c("initialized").mo85276a(C90752i.m148228b(Boolean.valueOf(auVar.f254843b)));
            }
            if (auVar.f254844c) {
                fVar.mo85279c("invalidated").mo85276a(C90752i.m148228b(Boolean.valueOf(auVar.f254844c)));
            }
            if (auVar.f254845d) {
                fVar.mo85279c("refreshed").mo85276a(C90752i.m148228b(Boolean.valueOf(auVar.f254845d)));
            }
            if (auVar.f254846e) {
                fVar.mo85279c("implicitRefreshed").mo85276a(C90752i.m148228b(Boolean.valueOf(auVar.f254846e)));
            }
            if (auVar.f254855n) {
                fVar.mo85279c("failed").mo85276a(C90752i.m148228b(Boolean.valueOf(auVar.f254855n)));
            }
            if (auVar.f254847f.size() + auVar.f254848g.size() + auVar.f254849h.size() + auVar.f254853l.size() <= 0) {
                if (auVar.f254850i > 0) {
                    fVar.mo85279c("added").mo85276a(C90752i.m148230d(Integer.valueOf(auVar.f254850i)));
                }
                if (auVar.f254851j > 0) {
                    fVar.mo85279c("updated").mo85276a(C90752i.m148230d(Integer.valueOf(auVar.f254851j)));
                }
                if (auVar.f254852k > 0) {
                    fVar.mo85279c("removed").mo85276a(C90752i.m148230d(Integer.valueOf(auVar.f254852k)));
                }
                if (auVar.f254854m > 0) {
                    fVar.mo85279c("swapped").mo85276a(C90752i.m148230d(Integer.valueOf(auVar.f254854m)));
                    return;
                }
                return;
            }
            m149272e(fVar, "added", auVar.f254847f);
            m149272e(fVar, "updated", auVar.f254848g);
            m149272e(fVar, "removed", auVar.f254849h);
            m149272e(fVar, "swapped", auVar.f254853l);
        }
    }

    /* renamed from: b */
    public final C60870cx mo85607b(C91307al alVar) {
        return this.f254838c.mo28201a("flush", new C91313ar(this, alVar));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("EntryProviderObservable");
        this.f254837b.mo85271g(fVar, "changeEvents", this, false);
    }

    /* renamed from: c */
    public final synchronized void mo85608c(C91307al alVar) {
        C58485gu guVar;
        C91732b bVar;
        ArrayList<C91737g> arrayList;
        synchronized (alVar.f254819a) {
            ArrayList arrayList2 = alVar.f254820b;
            if (arrayList2 == null) {
                guVar = null;
            } else {
                C58485gu j = C58485gu.m89842j(arrayList2);
                guVar = j;
            }
        }
        if (!alVar.mo85606g() && guVar == null) {
            if (!alVar.mo85605f()) {
                C118826c cVar = C118826c.f331422a;
                return;
            }
        }
        if (alVar.mo85606g()) {
            synchronized (alVar.f254819a) {
                bVar = (C91732b) alVar.f254821c.build();
            }
            C91315at atVar = (C91315at) C91316au.f254839o.createBuilder();
            boolean z = bVar.f255836b;
            atVar.copyOnWrite();
            C91316au auVar = (C91316au) atVar.instance;
            auVar.f254842a |= 1;
            auVar.f254843b = z;
            boolean z2 = bVar.f255837c;
            atVar.copyOnWrite();
            C91316au auVar2 = (C91316au) atVar.instance;
            auVar2.f254842a |= 2;
            auVar2.f254844c = z2;
            boolean z3 = bVar.f255838d;
            atVar.copyOnWrite();
            C91316au auVar3 = (C91316au) atVar.instance;
            auVar3.f254842a |= 4;
            auVar3.f254845d = z3;
            boolean z4 = bVar.f255839e;
            atVar.copyOnWrite();
            C91316au auVar4 = (C91316au) atVar.instance;
            auVar4.f254842a |= 8;
            auVar4.f254846e = z4;
            int size = bVar.f255840f.size();
            atVar.copyOnWrite();
            C91316au auVar5 = (C91316au) atVar.instance;
            auVar5.f254842a |= 16;
            auVar5.f254850i = size;
            int size2 = bVar.f255841g.size();
            atVar.copyOnWrite();
            C91316au auVar6 = (C91316au) atVar.instance;
            auVar6.f254842a |= 32;
            auVar6.f254851j = size2;
            int size3 = bVar.f255842h.size();
            atVar.copyOnWrite();
            C91316au auVar7 = (C91316au) atVar.instance;
            auVar7.f254842a |= 64;
            auVar7.f254852k = size3;
            int size4 = bVar.f255844j.size();
            atVar.copyOnWrite();
            C91316au auVar8 = (C91316au) atVar.instance;
            auVar8.f254842a |= 128;
            auVar8.f254854m = size4;
            boolean z5 = bVar.f255845k;
            atVar.copyOnWrite();
            C91316au auVar9 = (C91316au) atVar.instance;
            auVar9.f254842a |= 256;
            auVar9.f254855n = z5;
            if (auVar9.f254850i + auVar9.f254851j + auVar9.f254852k + auVar9.f254854m <= 5) {
                List g = C92001t.m151014g(bVar.f255840f, C91308am.f254829a);
                atVar.copyOnWrite();
                C91316au auVar10 = (C91316au) atVar.instance;
                C62971cq cqVar = auVar10.f254847f;
                if (!cqVar.mo58948c()) {
                    auVar10.f254847f = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) g, (List) auVar10.f254847f);
                List g2 = C92001t.m151014g(bVar.f255841g, C91309an.f254830a);
                atVar.copyOnWrite();
                C91316au auVar11 = (C91316au) atVar.instance;
                C62971cq cqVar2 = auVar11.f254848g;
                if (!cqVar2.mo58948c()) {
                    auVar11.f254848g = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) g2, (List) auVar11.f254848g);
                List g3 = C92001t.m151014g(bVar.f255842h, C91310ao.f254831a);
                atVar.copyOnWrite();
                C91316au auVar12 = (C91316au) atVar.instance;
                C62971cq cqVar3 = auVar12.f254849h;
                if (!cqVar3.mo58948c()) {
                    auVar12.f254849h = C62942bv.mutableCopy(cqVar3);
                }
                C62947c.addAll((Iterable) g3, (List) auVar12.f254849h);
                List g4 = C92001t.m151014g(bVar.f255844j, C91311ap.f254832a);
                atVar.copyOnWrite();
                C91316au auVar13 = (C91316au) atVar.instance;
                C62971cq cqVar4 = auVar13.f254853l;
                if (!cqVar4.mo58948c()) {
                    auVar13.f254853l = C62942bv.mutableCopy(cqVar4);
                }
                C62947c.addAll((Iterable) g4, (List) auVar13.f254853l);
            }
            this.f254837b.mo85270f(BuildConfig.FLAVOR, new C91312aq(atVar));
            synchronized (this.mObservers) {
                arrayList = new ArrayList<>(this.mObservers);
            }
            if (arrayList.isEmpty()) {
                C118826c cVar2 = C118826c.f331422a;
                return;
            }
            for (C91737g i : arrayList) {
                i.mo85844i(bVar);
            }
        }
        if (guVar != null) {
            int size5 = guVar.size();
            for (int i2 = 0; i2 < size5; i2++) {
                this.f254836a.sendBroadcast((Intent) guVar.get(i2));
            }
        }
        if (alVar.mo85605f()) {
            this.f254836a.sendBroadcast(new Intent("com.google.android.apps.now.cards_remote_broadcast"));
        }
        C118826c cVar3 = C118826c.f331422a;
    }
}
