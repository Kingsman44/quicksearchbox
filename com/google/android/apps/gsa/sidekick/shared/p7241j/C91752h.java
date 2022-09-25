package com.google.android.apps.gsa.sidekick.shared.p7241j;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87563f;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.search.C90506n;
import com.google.android.apps.gsa.shared.search.p7138b.C90486b;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137413b;
import com.google.android.apps.search.googleapp.search.p10409e.C137415d;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import java.util.Collections;
import java.util.HashMap;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5535j.p5536a.p5545c.p5548c.p5550b.C71142b;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.j.h */
/* compiled from: PG */
public final class C91752h {
    /* renamed from: a */
    public static Intent m150310a(Context context, String str, C90491g gVar, boolean z) {
        String str2;
        if (gVar != null) {
            if (context != null && (gVar.f252886a & 128) != 0 && gVar.f252893h) {
                C87565h hVar = new C87565h(C87563f.m142220b(str));
                hVar.f236512P = 335544320;
                Bundle a = hVar.mo81685a();
                Intent intent = new Intent();
                intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity");
                intent.addFlags(268468224);
                intent.putExtras(a);
                return intent;
            } else if ((gVar.f252886a & 4194304) != 0) {
                C90486b bVar = gVar.f252908w;
                if (bVar == null) {
                    bVar = C90486b.f252864g;
                }
                if (bVar.f252867b) {
                    Intent intent2 = new Intent("android.intent.action.MAIN");
                    C90486b bVar2 = gVar.f252908w;
                    if (bVar2 == null) {
                        bVar2 = C90486b.f252864g;
                    }
                    C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                    HashMap hashMap = new HashMap();
                    if (!gVar.f252888c.isEmpty()) {
                        hashMap.put("stick", gVar.f252888c);
                    }
                    if (!gVar.f252899n.isEmpty()) {
                        hashMap.put("ved", gVar.f252899n);
                    }
                    if (!gVar.f252894i.isEmpty()) {
                        hashMap.put("ludocid", gVar.f252894i);
                    }
                    if (!gVar.f252895j.isEmpty()) {
                        hashMap.put("ibp", gVar.f252895j);
                    }
                    if (gVar.f252902q) {
                        hashMap.put("gsas", "1");
                    }
                    if (gVar.f252910y.size() > 0) {
                        Collection.EL.forEach(Collections.unmodifiableMap(gVar.f252910y).entrySet(), new C91751g(hashMap));
                    }
                    eVar.mo113713a(hashMap);
                    if (!gVar.f252892g.isEmpty()) {
                        if (gVar.f252892g.startsWith("web.")) {
                            str2 = gVar.f252892g.substring(4);
                        } else {
                            str2 = gVar.f252892g;
                        }
                        if (!str2.equals("web")) {
                            eVar.copyOnWrite();
                            C137418g gVar2 = (C137418g) eVar.instance;
                            str2.getClass();
                            gVar2.f373769a |= 2;
                            gVar2.f373771c = str2;
                        }
                    }
                    if (!gVar.f252889d.isEmpty()) {
                        String str3 = gVar.f252889d;
                        eVar.copyOnWrite();
                        C137418g gVar3 = (C137418g) eVar.instance;
                        str3.getClass();
                        gVar3.f373769a |= 2048;
                        gVar3.f373781m = str3;
                    }
                    if ((bVar2.f252866a & 16) != 0) {
                        long j = bVar2.f252869d;
                        eVar.copyOnWrite();
                        C137418g gVar4 = (C137418g) eVar.instance;
                        gVar4.f373769a = 4 | gVar4.f373769a;
                        gVar4.f373772d = j;
                    }
                    if ((bVar2.f252866a & 32) != 0) {
                        int a2 = C137413b.m223275a(bVar2.f252870e);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        eVar.copyOnWrite();
                        C137418g gVar5 = (C137418g) eVar.instance;
                        gVar5.f373779k = a2 - 1;
                        gVar5.f373769a |= 512;
                    }
                    if ((bVar2.f252866a & 128) != 0) {
                        C71142b bVar3 = bVar2.f252871f;
                        if (bVar3 == null) {
                            bVar3 = C71142b.f189780d;
                        }
                        eVar.copyOnWrite();
                        C137418g gVar6 = (C137418g) eVar.instance;
                        bVar3.getClass();
                        gVar6.f373780l = bVar3;
                        gVar6.f373769a |= 1024;
                    }
                    if (!gVar.f252903r.isEmpty() && TextUtils.isEmpty(str)) {
                        String str4 = gVar.f252903r;
                        eVar.copyOnWrite();
                        C137418g gVar7 = (C137418g) eVar.instance;
                        str4.getClass();
                        gVar7.f373769a |= 16;
                        gVar7.f373775g = str4;
                    }
                    C136128i l = C136129j.m221208l();
                    l.mo112776k(C139779t.SEARCH);
                    l.mo112769d(z);
                    eVar.copyOnWrite();
                    C137418g gVar8 = (C137418g) eVar.instance;
                    str.getClass();
                    gVar8.f373769a |= 1;
                    gVar8.f373770b = str;
                    int a3 = C137415d.m223276a(gVar.f252900o);
                    eVar.copyOnWrite();
                    C137418g gVar9 = (C137418g) eVar.instance;
                    int i = a3 - 1;
                    if (a3 != 0) {
                        gVar9.f373774f = i;
                        gVar9.f373769a |= 8;
                        l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
                        C136127h.m221196a(intent2, l.mo112766a());
                        if ((gVar.f252886a & 4096) != 0) {
                            intent2.putExtra("source", gVar.f252898m);
                        } else {
                            intent2.putExtra("source", "and.gsa.now.widget");
                        }
                        return intent2;
                    }
                    throw null;
                }
            }
        }
        Intent intent3 = new Intent("com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH");
        intent3.setClassName("com.google.android.googlequicksearchbox", e.b());
        intent3.addFlags(268435456);
        intent3.addFlags(67108864);
        intent3.putExtra("query", str);
        if (gVar != null) {
            intent3.putExtra("search-options-proto", C90506n.m147606a(gVar));
            if (gVar.f252891f) {
                intent3.putExtra("android.intent.extra.REFERRER", C90721ae.f253801j);
            }
            if ((gVar.f252886a & 4096) != 0) {
                intent3.putExtra("source", gVar.f252898m);
            } else {
                intent3.putExtra("source", "and.gsa.now.widget");
            }
            if ((gVar.f252886a & 8192) != 0) {
                intent3.putExtra("ved", gVar.f252899n);
            }
            C90486b bVar4 = gVar.f252908w;
            if (bVar4 == null) {
                bVar4 = C90486b.f252864g;
            }
            if ((bVar4.f252866a & 16) != 0) {
                C90486b bVar5 = gVar.f252908w;
                if (bVar5 == null) {
                    bVar5 = C90486b.f252864g;
                }
                intent3.putExtra("googleapp_qsubts_override", bVar5.f252869d);
            }
        }
        return intent3;
    }
}
