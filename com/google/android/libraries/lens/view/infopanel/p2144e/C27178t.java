package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.net.Uri;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4056g.p4057a.p4058a.C53970ae;
import com.google.p4017at.p4056g.p4057a.p4058a.C53992b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54045cz;
import com.google.p4017at.p4056g.p4057a.p4058a.C54056h;
import com.google.p4017at.p4056g.p4057a.p4058a.C54057i;
import com.google.p4017at.p4056g.p4057a.p4058a.C54058j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.t */
/* compiled from: PG */
public final class C27178t {

    /* renamed from: a */
    public static final C58974d f74291a = C58974d.m91135i("InfoPanelChipItem");

    /* renamed from: b */
    public final C54058j f74292b;

    /* renamed from: c */
    protected int f74293c;

    /* renamed from: d */
    public final C58495hd f74294d;

    /* renamed from: e */
    public int f74295e;

    /* renamed from: f */
    public final C58495hd f74296f;

    /* renamed from: g */
    public final List f74297g;

    /* renamed from: h */
    public C58833ax f74298h = C58836b.f156633a;

    /* renamed from: i */
    public int f74299i = 1;

    /* renamed from: j */
    private final C58833ax f74300j;

    public C27178t(C54058j jVar, C47449e eVar, C27181w wVar) {
        this.f74292b = jVar;
        C54045cz czVar = jVar.f141834e;
        this.f74293c = czVar != null ? czVar.f141803a : 58043;
        HashMap hashMap = new HashMap();
        C58490gz gzVar = new C58490gz(4);
        if (jVar.f141837h.size() > 0) {
            for (C54057i iVar : jVar.f141837h) {
                gzVar.mo55429h(Integer.valueOf(iVar.f141821a), iVar);
            }
            this.f74295e = jVar.f141838i;
        } else {
            C54056h hVar = (C54056h) C54057i.f141819g.createBuilder();
            String str = jVar.f141831b;
            hVar.copyOnWrite();
            str.getClass();
            ((C54057i) hVar.instance).f141822b = str;
            String str2 = jVar.f141836g;
            hVar.copyOnWrite();
            str2.getClass();
            ((C54057i) hVar.instance).f141826f = str2;
            C53992b bVar = jVar.f141833d;
            if (bVar != null) {
                hVar.copyOnWrite();
                ((C54057i) hVar.instance).f141825e = bVar;
            }
            C53970ae aeVar = jVar.f141832c;
            if (aeVar != null) {
                hVar.copyOnWrite();
                ((C54057i) hVar.instance).f141824d = aeVar;
            }
            gzVar.mo55429h(0, (C54057i) hVar.build());
            this.f74295e = 0;
        }
        C58495hd f = gzVar.mo55427f(false);
        this.f74296f = f;
        if (!f.containsKey(Integer.valueOf(this.f74295e))) {
            ((C58970a) ((C58970a) f74291a.mo56226d()).mo56372aa(49580)).mo56386p("Unknown default chip state.");
        }
        this.f74300j = wVar.mo32583a();
        this.f74297g = new ArrayList();
        if (wVar.mo32584b().mo56113h()) {
            this.f74298h = C58833ax.m90834k(m50390e(eVar, (String) wVar.mo32584b().mo56107c()));
        } else if (wVar.mo32585c().size() >= 2) {
            C58485gu c = wVar.mo32585c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                this.f74297g.add(m50390e(eVar, (String) c.get(i)));
            }
        } else {
            C58800sl lA = f.values().iterator();
            while (lA.hasNext()) {
                C54057i iVar2 = (C54057i) lA.next();
                C53970ae aeVar2 = iVar2.f141824d;
                if (!(aeVar2 == null ? C53970ae.f141610b : aeVar2).f141612a.isEmpty()) {
                    C53970ae aeVar3 = iVar2.f141824d;
                    String str3 = (aeVar3 == null ? C53970ae.f141610b : aeVar3).f141612a;
                    if (!hashMap.containsKey(str3)) {
                        hashMap.put(str3, m50390e(eVar, str3));
                    } else {
                        ((C58970a) ((C58970a) f74291a.mo56226d()).mo56372aa(49579)).mo56386p("Two or more states have the same icons. On old clients this will crash the app. ");
                    }
                }
            }
        }
        this.f74294d = C58495hd.m89898l(hashMap);
    }

    /* renamed from: e */
    private static C60870cx m50390e(C47449e eVar, String str) {
        return C5528f.m14300b(C5528f.m14299a(eVar.mo51286a().mo11870h(Uri.parse(str))));
    }

    /* renamed from: a */
    public final C54057i mo32610a() {
        return (C54057i) this.f74296f.getOrDefault(Integer.valueOf(this.f74295e), C54057i.f141819g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo32611b() {
        if (mo32613d()) {
            return mo32610a().f141823c;
        }
        if (mo32610a().f141826f.length() > 0) {
            return mo32610a().f141826f;
        }
        return mo32610a().f141822b;
    }

    /* renamed from: c */
    public final String mo32612c() {
        if (this.f74300j.mo56113h()) {
            return (String) this.f74300j.mo56107c();
        }
        if (mo32613d()) {
            return mo32610a().f141823c;
        }
        return mo32610a().f141822b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo32613d() {
        return this.f74299i == 2;
    }
}
