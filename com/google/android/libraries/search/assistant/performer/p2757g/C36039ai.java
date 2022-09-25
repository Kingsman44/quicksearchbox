package com.google.android.libraries.search.assistant.performer.p2757g;

import android.os.Bundle;
import android.support.p031v4.media.session.C0320v;
import android.text.TextUtils;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36019b;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36081e;
import com.google.assistant.p3897e.p3921j.C52161hm;
import com.google.assistant.p3897e.p3921j.C52162hn;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52173hy;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.ai */
/* compiled from: PG */
public final /* synthetic */ class C36039ai implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36052av f94265a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f94266b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f94267c;

    /* renamed from: d */
    public final /* synthetic */ C52174hz f94268d;

    /* renamed from: e */
    public final /* synthetic */ String f94269e;

    /* renamed from: f */
    public final /* synthetic */ C52176ia f94270f;

    /* renamed from: g */
    public final /* synthetic */ C36019b f94271g;

    public /* synthetic */ C36039ai(C36052av avVar, C60870cx cxVar, C60870cx cxVar2, C52174hz hzVar, String str, C52176ia iaVar, C36019b bVar) {
        this.f94265a = avVar;
        this.f94266b = cxVar;
        this.f94267c = cxVar2;
        this.f94268d = hzVar;
        this.f94269e = str;
        this.f94270f = iaVar;
        this.f94271g = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C36047aq aqVar;
        C36081e eVar;
        C36052av avVar = this.f94265a;
        C60870cx cxVar = this.f94266b;
        C60870cx cxVar2 = this.f94267c;
        C52174hz hzVar = this.f94268d;
        String str = this.f94269e;
        C52176ia iaVar = this.f94270f;
        C36019b bVar = this.f94271g;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Bundle bundle = (Bundle) C60856cj.m92909r(cxVar2);
        if (optional.isEmpty()) {
            return avVar.mo39950f(hzVar, bundle, 1, str, (C0320v) null, iaVar, bVar.mo39938c());
        }
        C0320v vVar = (C0320v) optional.get();
        C59104x b = C36052av.f94290a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) b).mo56372aa(52121)).mo56386p("Executing media.PLAY_MEDIA with the active controller.");
        if (C18434a.m35906b((C0320v) optional.get())) {
            C59104x d = C36052av.f94290a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(52126)).mo56386p("Failed to execute play command because authentication is expired.");
            return C60856cj.m92900i(C36089g.m64501d(str, C52179id.AUTHENTICATION_EXPIRED, vVar.mo1038f().f1000g));
        }
        boolean z = false;
        C36081e c = C36052av.m64449c(false, hzVar, bundle);
        if (c == null || !C18434a.m35907c(vVar, 8192)) {
            String str2 = hzVar.f136902i;
            if (TextUtils.isEmpty(str2)) {
                C59104x d2 = C36052av.f94290a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                ((C59052c) ((C59052c) d2).mo56372aa(52113)).mo56386p("Unable to perform playFromMediaId because the mediaId is missing from the MediaItem.");
                aqVar = null;
            } else {
                aqVar = new C36047aq(str2, bundle);
            }
            if (aqVar == null || !C18434a.m35907c(vVar, 1024)) {
                String str3 = hzVar.f136901h;
                if (TextUtils.isEmpty(str3)) {
                    eVar = new C36042al(bundle);
                } else {
                    eVar = new C36043am(str3, bundle);
                }
                if (C18434a.m35907c(vVar, 2048)) {
                    C59104x b2 = C36052av.f94290a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                    ((C59052c) ((C59052c) b2).mo56372aa(52123)).mo56386p("Fallback to play from search because playFromUri and playFromMediaId are unavailable.");
                    vVar.getClass();
                    int a = C52173hy.m86533a(hzVar.f136903j);
                    if (a == 0 || a != 2) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    C52162hn hnVar = (C52162hn) C52163ho.f136875d.createBuilder();
                    boolean c2 = bVar.mo39938c();
                    hnVar.copyOnWrite();
                    C52163ho hoVar = (C52163ho) hnVar.instance;
                    hoVar.f136877a |= 2;
                    hoVar.f136879c = c2;
                    C52161hm hmVar = C52161hm.PLAY_FROM_SEARCH;
                    hnVar.copyOnWrite();
                    C52163ho hoVar2 = (C52163ho) hnVar.instance;
                    hoVar2.f136878b = hmVar.f136874g;
                    hoVar2.f136877a |= 1;
                    return avVar.mo39949d(eVar, vVar, iaVar, valueOf, (C52163ho) hnVar.build());
                }
                C59104x d3 = C36052av.f94290a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                ((C59052c) ((C59052c) d3).mo56372aa(52122)).mo56386p("Could not execute playFromUri, playFromMediaId, or playFromSearch");
                return avVar.mo39950f(hzVar, bundle, 2, str, vVar, iaVar, bVar.mo39938c());
            }
            C59104x b3 = C36052av.f94290a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) b3).mo56372aa(52124)).mo56386p("Executing playFromMediaId operation.");
            vVar.getClass();
            int a2 = C52173hy.m86533a(hzVar.f136903j);
            if (a2 == 0 || a2 != 2) {
                z = true;
            }
            Boolean valueOf2 = Boolean.valueOf(z);
            C52162hn hnVar2 = (C52162hn) C52163ho.f136875d.createBuilder();
            boolean c3 = bVar.mo39938c();
            hnVar2.copyOnWrite();
            C52163ho hoVar3 = (C52163ho) hnVar2.instance;
            hoVar3.f136877a |= 2;
            hoVar3.f136879c = c3;
            C52161hm hmVar2 = C52161hm.PLAY_FROM_MEDIA_ID;
            hnVar2.copyOnWrite();
            C52163ho hoVar4 = (C52163ho) hnVar2.instance;
            hoVar4.f136878b = hmVar2.f136874g;
            hoVar4.f136877a |= 1;
            return avVar.mo39949d(aqVar, vVar, iaVar, valueOf2, (C52163ho) hnVar2.build());
        }
        C59104x b4 = C36052av.f94290a.mo56224b();
        b4.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) b4).mo56372aa(52125)).mo56386p("Executing play from uri operation.");
        vVar.getClass();
        int a3 = C52173hy.m86533a(hzVar.f136903j);
        if (a3 == 0 || a3 != 2) {
            z = true;
        }
        Boolean valueOf3 = Boolean.valueOf(z);
        C52162hn hnVar3 = (C52162hn) C52163ho.f136875d.createBuilder();
        boolean c4 = bVar.mo39938c();
        hnVar3.copyOnWrite();
        C52163ho hoVar5 = (C52163ho) hnVar3.instance;
        hoVar5.f136877a |= 2;
        hoVar5.f136879c = c4;
        C52161hm hmVar3 = C52161hm.PLAY_FROM_URI;
        hnVar3.copyOnWrite();
        C52163ho hoVar6 = (C52163ho) hnVar3.instance;
        hoVar6.f136878b = hmVar3.f136874g;
        hoVar6.f136877a |= 1;
        return avVar.mo39949d(c, vVar, iaVar, valueOf3, (C52163ho) hnVar3.build());
    }
}
