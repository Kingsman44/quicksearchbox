package com.google.android.apps.gsa.staticplugins.save.p8694a;

import android.net.Uri;
import com.google.android.apps.gsa.p5855h.p5859o.C74539a;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1880l.C22873a;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.android.libraries.gsa.p1880l.C22881i;
import com.google.android.libraries.gsa.p1880l.C22884l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.as */
/* compiled from: PG */
public final class C116388as extends C86734a implements C85142a {

    /* renamed from: a */
    public static final C59071e f322750a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.save.a.as");

    /* renamed from: i */
    private static final Map f322751i = new HashMap();

    /* renamed from: j */
    private static long f322752j = 0;

    /* renamed from: b */
    public final C86054o f322753b;

    /* renamed from: c */
    public final C21370a f322754c;

    /* renamed from: f */
    public final C116372ac f322755f;

    /* renamed from: g */
    public final C22871g f322756g;

    /* renamed from: h */
    public final C68214a f322757h;

    /* renamed from: k */
    private final C91097g f322758k;

    /* renamed from: l */
    private final C116360a f322759l;

    public C116388as(C86054o oVar, C21370a aVar, C91097g gVar, C116372ac acVar, C90821bm bmVar, C116360a aVar2, C68214a aVar3) {
        super(C118575h.WORKER_SAVE, "save");
        this.f322753b = oVar;
        this.f322754c = aVar;
        this.f322758k = gVar;
        this.f322755f = acVar;
        this.f322757h = aVar3;
        this.f322759l = aVar2;
        this.f322756g = bmVar.mo85163a(C116387ar.class);
    }

    /* renamed from: a */
    public final C60870cx mo78732a(Uri uri) {
        return this.f322756g.mo28201a("isSaved", new C116385ap(this, uri));
    }

    /* renamed from: b */
    public final C60870cx mo78733b(C22876d dVar) {
        long j = f322752j + 1;
        f322752j = j;
        SettableFuture settableFuture = new SettableFuture();
        f322751i.put(Long.valueOf(j), settableFuture);
        C22873a aVar = (C22873a) dVar.toBuilder();
        aVar.copyOnWrite();
        C22876d dVar2 = (C22876d) aVar.instance;
        dVar2.f62946a |= 8388608;
        dVar2.f62968w = j;
        this.f322758k.mo65089a(C74539a.m120513a((C22876d) aVar.build()));
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo78734c(C57578av avVar) {
        return this.f322759l.mo102651a(avVar);
    }

    /* renamed from: d */
    public final void mo78735d(String str) {
        this.f322756g.mo28212l("Add to cache", new C116384ao(this, str));
    }

    /* renamed from: e */
    public final void mo78736e(C22876d dVar) {
        SettableFuture settableFuture;
        if (dVar != null && (settableFuture = (SettableFuture) f322751i.remove(Long.valueOf(dVar.f62968w))) != null) {
            C22881i iVar = (C22881i) C22884l.f62985g.createBuilder();
            iVar.copyOnWrite();
            C22884l lVar = (C22884l) iVar.instance;
            lVar.f62990d = 3;
            lVar.f62987a |= 1;
            long j = dVar.f62968w;
            iVar.copyOnWrite();
            C22884l lVar2 = (C22884l) iVar.instance;
            lVar2.f62987a |= 16;
            lVar2.f62992f = j;
            C22875c cVar = C22875c.IMAGE;
            C22875c a = C22875c.m42745a(dVar.f62951f);
            if (a == null) {
                a = C22875c.IMAGE;
            }
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                C65930h hVar = dVar.f62950e;
                if (hVar == null) {
                    hVar = C65930h.f179300i;
                }
                String str = hVar.f179303b;
                iVar.copyOnWrite();
                C22884l lVar3 = (C22884l) iVar.instance;
                str.getClass();
                lVar3.f62988b = 5;
                lVar3.f62989c = str;
            } else if (ordinal == 1) {
                String str2 = dVar.f62948c;
                iVar.copyOnWrite();
                C22884l lVar4 = (C22884l) iVar.instance;
                str2.getClass();
                lVar4.f62988b = 4;
                lVar4.f62989c = str2;
            } else if (ordinal == 3) {
                String str3 = dVar.f62961p;
                iVar.copyOnWrite();
                C22884l lVar5 = (C22884l) iVar.instance;
                str3.getClass();
                lVar5.f62988b = 7;
                lVar5.f62989c = str3;
            }
            settableFuture.mo57356n((C22884l) iVar.build());
        }
    }

    /* renamed from: f */
    public final void mo78737f(C22876d dVar, Throwable th) {
        SettableFuture settableFuture;
        if ((dVar.f62946a & 8388608) != 0 && (settableFuture = (SettableFuture) f322751i.remove(Long.valueOf(dVar.f62968w))) != null) {
            settableFuture.mo57357o(th);
        }
    }

    /* renamed from: g */
    public final void mo78738g(C22884l lVar) {
        SettableFuture settableFuture;
        if ((lVar.f62987a & 16) != 0 && (settableFuture = (SettableFuture) f322751i.remove(Long.valueOf(lVar.f62992f))) != null) {
            settableFuture.mo57356n(lVar);
        }
    }

    /* renamed from: h */
    public final void mo78739h(String str) {
        this.f322756g.mo28212l("Remove from cache", new C116383an(this, str));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
