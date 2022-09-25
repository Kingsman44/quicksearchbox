package com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent;

import android.accounts.Account;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.g */
/* compiled from: PG */
public final /* synthetic */ class C127832g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C127833h f351833a;

    /* renamed from: b */
    public final /* synthetic */ C45985aw f351834b;

    public /* synthetic */ C127832g(C127833h hVar, C45985aw awVar) {
        this.f351833a = hVar;
        this.f351834b = awVar;
    }

    public final Object apply(Object obj) {
        C127833h hVar = this.f351833a;
        Account account = (Account) obj;
        AccountId accountId = this.f351834b.f120815a.f120816a;
        try {
            C127834i iVar = hVar.f351835a;
            C127839n nVar = iVar.f351839d;
            C55912b bVar = iVar.f351840e;
            C58838bb.m90866a(bVar, "Expected non-null setting from bundle intent.");
            Bundle extras = hVar.f351835a.f351837b.getIntent().getExtras();
            C58838bb.m90866a(extras, "Expected non-null extras in bundle intent");
            C58838bb.m90869d(account != null, "Expected non-null Account and ActivityControlsSetting.");
            nVar.f351849b.mo29370a(nVar.f351848a, account, bVar, C55960bg.ASSISTANT_JUST_IN_TIME_OPTIN_TNG, C127838m.f351846a);
            C127826b bVar2 = new C127826b();
            C68324h.m98669f(bVar2);
            C47247a.m84047b(bVar2, accountId);
            bVar2.mo29376m(account, bVar, C55960bg.ASSISTANT_JUST_IN_TIME_OPTIN_TNG);
            byte[] byteArray = extras.getByteArray("CLIENT_INPUT");
            C58838bb.m90866a(byteArray, "Expected client input extra to be passed in bundle.");
            C51805du duVar = (C51805du) C62942bv.parseFrom((C62942bv) C51805du.f135924e, byteArray, C62921ba.m95368a());
            C58838bb.m90866a(duVar, "Parsed clientInput expected to be non-null.");
            C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(duVar.f135929d).get("text_input_params");
            C58838bb.m90866a(kaVar, "Expected non-null textInputParam in clientInput.");
            bVar2.f351844b = (C51682amp) C62942bv.parseFrom((C62942bv) C51682amp.f135384d, kaVar.f137061c, C62921ba.m95368a());
            bVar2.f351845c = extras.getString("REJECT_TEXT");
            C0154a aVar = new C0154a(hVar.f351835a.f351837b.f727a.f739a.f744e);
            aVar.mo511h(0, bVar2, "JitConsentFlowFragment", 1);
            aVar.mo509f();
            return null;
        } catch (Exception e) {
            C59104x c = C127834i.f351836a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JitConsentAct");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(37611)).mo56386p("Exception while attaching fragment.");
            hVar.f351835a.f351837b.finish();
            hVar.f351835a.f351837b.overridePendingTransition(0, 0);
            return null;
        }
    }
}
