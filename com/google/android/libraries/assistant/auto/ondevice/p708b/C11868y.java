package com.google.android.libraries.assistant.auto.ondevice.p708b;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15671c;
import com.google.android.libraries.gsa.conversation.clientop.C22535l;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.acz;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63775d;
import com.google.speech.grammar.pumpkin.C66525q;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.y */
/* compiled from: PG */
public final class C11868y implements a {

    /* renamed from: a */
    private final C68214a f38209a;

    /* renamed from: b */
    private final C68214a f38210b;

    /* renamed from: c */
    private final C86124t f38211c;

    /* renamed from: d */
    private final C9309a f38212d;

    public C11868y(C68214a aVar, C68214a aVar2, C9309a aVar3, C86124t tVar) {
        this.f38209a = aVar;
        this.f38210b = aVar2;
        this.f38212d = aVar3;
        this.f38211c = tVar;
    }

    /* renamed from: a */
    public final C58833ax mo20253a(C61752n nVar, Query query) {
        C63624h hVar;
        C58833ax e = new C15671c(nVar).mo22500e("app");
        if (!e.mo56113h()) {
            return C58836b.f156633a;
        }
        C58833ax b = new C15671c(nVar).mo22497b("app");
        if (b.mo56113h()) {
            C61748j jVar = ((C61746h) b.mo56107c()).f166797e;
            if (jVar == null) {
                jVar = C61748j.f166800d;
            }
            if (jVar.f166802a == 15) {
                hVar = (C63624h) jVar.f166803b;
            } else {
                hVar = C63624h.f172070b;
            }
            for (C63775d dVar : hVar.f172072a) {
                if ((dVar.f172520a & 4) != 0) {
                    return mo20256d((String) e.mo56107c(), dVar.f172523d);
                }
            }
        }
        return mo20256d((String) e.mo56107c(), (String) null);
    }

    /* renamed from: b */
    public final C60870cx mo20254b(C66525q qVar, Query query) {
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: c */
    public final C60870cx mo20255c(C52081en enVar) {
        C52078ek ekVar;
        C52070ec ecVar;
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 3) {
                ekVar = (C52078ek) epVar.f136693c;
            } else {
                ekVar = C52078ek.f136671f;
            }
            if (ekVar.f136674b == 3) {
                ecVar = (C52070ec) ekVar.f136675c;
            } else {
                ecVar = C52070ec.f136651d;
            }
            C52236kg kgVar = ecVar.f136654b;
            if (kgVar == null) {
                kgVar = C52236kg.f137089d;
            }
            C52235kf a = C52235kf.m86549a(kgVar.f137092b);
            if (a == null) {
                a = C52235kf.OK;
            }
            if (a != C52235kf.OK) {
                C9309a aVar = this.f38212d;
                return C60856cj.m92900i(C58833ax.m90834k(C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.open_app_punt))), Arrays.asList(new Integer[]{23202}))));
            }
        }
        return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
    }

    /* renamed from: d */
    public final C58833ax mo20256d(String str, String str2) {
        C58833ax axVar;
        C51058ev evVar;
        C58528ij<String> F = C58528ij.m90006F(this.f38211c.mo79745c(C90086ek.f250338bJ));
        if (!F.isEmpty()) {
            if (str2 == null || !F.contains(C58890d.m90988c(str2))) {
                for (String contains : F) {
                    if (contains.contains(C58890d.m90988c(str))) {
                        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
                        C9309a aVar = this.f38212d;
                        C52081en b = C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.open_unsafe_for_drving_app_punt))), Arrays.asList(new Integer[]{23202}));
                        eVar.copyOnWrite();
                        C51195j jVar = (C51195j) eVar.instance;
                        b.getClass();
                        jVar.f133275j = b;
                        jVar.f133266a |= 128;
                        return C58833ax.m90834k((C51195j) eVar.build());
                    }
                }
            } else {
                C51190e eVar2 = (C51190e) C51195j.f133264n.createBuilder();
                C9309a aVar2 = this.f38212d;
                C52081en b2 = C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar2.mo17491a(aVar2.f32300b).getString(R.string.open_unsafe_for_drving_app_punt))), Arrays.asList(new Integer[]{23202}));
                eVar2.copyOnWrite();
                C51195j jVar2 = (C51195j) eVar2.instance;
                b2.getClass();
                jVar2.f133275j = b2;
                jVar2.f133266a |= 128;
                return C58833ax.m90834k((C51195j) eVar2.build());
            }
        }
        if (str2 == null) {
            Intent action = new Intent().setAction("android.intent.action.MAIN");
            action.addCategory("android.intent.category.LAUNCHER");
            PackageManager packageManager = (PackageManager) this.f38210b.mo27525b();
            List a = C22535l.m41989a(C22535l.m41990b(action, packageManager), packageManager);
            if (((C91123v) this.f38209a.mo27525b()).mo85390b()) {
                a.addAll(C22535l.m41991c(new Intent().setAction("android.media.browse.MediaBrowserService"), (PackageManager) this.f38210b.mo27525b()));
            }
            String c = C58890d.m90988c(str);
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    axVar = C58836b.f156633a;
                    break;
                }
                C51098gh ghVar = (C51098gh) it.next();
                if (ghVar.f133012b == 1) {
                    evVar = (C51058ev) ghVar.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                if (C58890d.m90988c(evVar.f132948f).equals(c)) {
                    axVar = C58833ax.m90834k(ghVar);
                    break;
                }
            }
        } else {
            C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            evVar2.f132943a |= 1;
            evVar2.f132944b = str2;
            esVar.copyOnWrite();
            C51058ev evVar3 = (C51058ev) esVar.instance;
            str.getClass();
            evVar3.f132943a |= 16;
            evVar3.f132948f = str;
            ggVar.copyOnWrite();
            C51098gh ghVar2 = (C51098gh) ggVar.instance;
            C51058ev evVar4 = (C51058ev) esVar.build();
            evVar4.getClass();
            ghVar2.f133013c = evVar4;
            ghVar2.f133012b = 1;
            axVar = C58833ax.m90834k((C51098gh) ggVar.build());
        }
        if (axVar.mo56113h()) {
            acz acz = (acz) ada.f134865f.createBuilder();
            C51098gh ghVar3 = (C51098gh) axVar.mo56107c();
            acz.copyOnWrite();
            ada ada = (ada) acz.instance;
            ghVar3.getClass();
            ada.f134868b = ghVar3;
            ada.f134867a |= 1;
            ArrayList arrayList = new ArrayList(Arrays.asList(new C51809dy[]{C15670b.m32466a("provider.OPEN", "open_provider_args", "assistant.api.client_op.OpenProviderArgs", acz.build())}));
            C9309a aVar3 = this.f38212d;
            C51809dy a2 = C15669a.m32462a(aVar3.mo17491a(aVar3.f32300b).getString(R.string.open_app, new Object[]{str}));
            if (a2 != null) {
                arrayList.add(a2);
            }
            C51190e eVar3 = (C51190e) C51195j.f133264n.createBuilder();
            C52081en b3 = C15669a.m32463b(arrayList, Arrays.asList(new Integer[]{23176}));
            eVar3.copyOnWrite();
            C51195j jVar3 = (C51195j) eVar3.instance;
            b3.getClass();
            jVar3.f133275j = b3;
            jVar3.f133266a |= 128;
            return C58833ax.m90834k((C51195j) eVar3.build());
        }
        C51190e eVar4 = (C51190e) C51195j.f133264n.createBuilder();
        C9309a aVar4 = this.f38212d;
        C52081en b4 = C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar4.mo17491a(aVar4.f32300b).getString(R.string.open_app_punt))), Arrays.asList(new Integer[]{23202}));
        eVar4.copyOnWrite();
        C51195j jVar4 = (C51195j) eVar4.instance;
        b4.getClass();
        jVar4.f133275j = b4;
        jVar4.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar4.build());
    }
}
