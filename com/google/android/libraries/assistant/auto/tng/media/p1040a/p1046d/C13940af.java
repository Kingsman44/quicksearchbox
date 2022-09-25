package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.media.session.C0320v;
import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36019b;
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
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5124m.p5125a.C65603f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.af */
/* compiled from: PG */
public final /* synthetic */ class C13940af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13946al f42428a;

    /* renamed from: b */
    public final /* synthetic */ Intent f42429b;

    /* renamed from: c */
    public final /* synthetic */ String f42430c;

    /* renamed from: d */
    public final /* synthetic */ C52176ia f42431d;

    /* renamed from: e */
    public final /* synthetic */ C36019b f42432e;

    /* renamed from: f */
    public final /* synthetic */ C52174hz f42433f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f42434g;

    public /* synthetic */ C13940af(C13946al alVar, Intent intent, String str, C52176ia iaVar, C36019b bVar, C52174hz hzVar, Bundle bundle) {
        this.f42428a = alVar;
        this.f42429b = intent;
        this.f42430c = str;
        this.f42431d = iaVar;
        this.f42432e = bVar;
        this.f42433f = hzVar;
        this.f42434g = bundle;
    }

    public final C60870cx apply(Object obj) {
        C13969w wVar;
        C13946al alVar = this.f42428a;
        Intent intent = this.f42429b;
        String str = this.f42430c;
        C52176ia iaVar = this.f42431d;
        C36019b bVar = this.f42432e;
        C52174hz hzVar = this.f42433f;
        Bundle bundle = this.f42434g;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return alVar.mo21371h(intent, 1, str, Optional.empty(), iaVar, bVar.mo39938c());
        }
        C0320v vVar = (C0320v) optional.get();
        C59104x b = C13946al.f42444a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) b).mo56372aa(45224)).mo56386p("Executing media.PLAY_MEDIA with the active controller.");
        if (C13983h.m30278e((C0320v) optional.get())) {
            C59104x d = C13946al.f42444a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(45230)).mo56386p("Failed to execute play command because authentication is expired.");
            str.getClass();
            return C60856cj.m92900i(C13976a.m30269d(str, C52179id.AUTHENTICATION_EXPIRED, vVar.mo1038f().f1000g));
        }
        boolean z = false;
        C13920d c = alVar.mo21367c(false, hzVar, bundle);
        boolean f = C13983h.m30279f(vVar, 8192);
        if (!f && vVar.mo1038f() != null && vVar.mo1038f().f998e == 0) {
            f = true;
        }
        if (c == null || !f) {
            String str2 = hzVar.f136902i;
            if (TextUtils.isEmpty(str2)) {
                C59104x d2 = C13946al.f42444a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                ((C59052c) ((C59052c) d2).mo56372aa(45213)).mo56386p("Unable to perform playFromMediaId because the mediaId is missing from the MediaItem.");
                wVar = null;
            } else {
                wVar = new C13969w(alVar, str2, bundle);
            }
            if (wVar == null || (!C13983h.m30279f(vVar, 1024) && !((C65603f) alVar.f42452g.mo17428b()).f178307a.contains(str))) {
                String str3 = hzVar.f136901h;
                C13920d agVar = TextUtils.isEmpty(str3) ? new C13941ag(alVar, bundle) : new C13970x(alVar, str3, bundle);
                if ((!((Boolean) alVar.f42451f.mo17428b()).booleanValue() || !alVar.f42454i.isPresent()) && C13983h.m30279f(vVar, 2048)) {
                    C59104x b2 = C13946al.f42444a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                    ((C59052c) ((C59052c) b2).mo56372aa(45226)).mo56386p("Fallback to play from search because playFromUri and playFromMediaId are unavailable.");
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
                    return alVar.mo21368d(agVar, vVar, iaVar, valueOf, (C52163ho) hnVar.build(), intent);
                }
                C59104x d3 = C13946al.f42444a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                ((C59052c) ((C59052c) d3).mo56372aa(45225)).mo56386p("Could not execute playFromUri, playFromMediaId or playFromSearch");
                return alVar.mo21371h(intent, 2, str, Optional.empty(), iaVar, bVar.mo39938c());
            }
            C59104x b3 = C13946al.f42444a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) b3).mo56372aa(45227)).mo56386p("Executing playFromMediaId operation.");
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
            return alVar.mo21368d(wVar, vVar, iaVar, valueOf2, (C52163ho) hnVar2.build(), intent);
        }
        C59104x b4 = C13946al.f42444a.mo56224b();
        b4.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) b4).mo56372aa(45228)).mo56386p("Executing play from uri operation.");
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
        return alVar.mo21368d(c, vVar, iaVar, valueOf3, (C52163ho) hnVar3.build(), intent);
    }
}
