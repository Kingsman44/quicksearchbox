package com.google.android.apps.search.assistant.verticals.familyshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63088z;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.f */
/* compiled from: PG */
public final class C132381f implements C45987ay {

    /* renamed from: b */
    private static final C59071e f361354b = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.familyshare.f");

    /* renamed from: a */
    public final FamilyShareFulfillmentActivity f361355a;

    /* renamed from: c */
    private C37215b f361356c = null;

    /* renamed from: d */
    private boolean f361357d = false;

    /* renamed from: com.google.android.apps.search.assistant.verticals.familyshare.f$a */
    /* compiled from: PG */
    public interface C132382a {
        /* renamed from: eQ */
        C37215b mo110678eQ();
    }

    public C132381f(FamilyShareFulfillmentActivity familyShareFulfillmentActivity, C45989b bVar, C32158h hVar) {
        this.f361355a = familyShareFulfillmentActivity;
        hVar.mo37971b(familyShareFulfillmentActivity, this, bVar);
    }

    /* renamed from: e */
    private final void m215165e(int i) {
        Toast.makeText(this.f361355a.getApplicationContext(), i, 0).show();
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        if (!this.f361357d) {
            C37215b eQ = ((C132382a) C47245e.m84045a(this.f361355a.getApplicationContext(), C132382a.class, awVar.f120815a.f120816a)).mo110678eQ();
            this.f361356c = eQ;
            eQ.getClass();
            eQ.mo19974a(C37176a.f96877av);
            this.f361357d = true;
            AccountId accountId = awVar.f120815a.f120816a;
            C132386j jVar = new C132386j();
            C68324h.m98669f(jVar);
            C47247a.m84047b(jVar, accountId);
            C0154a aVar = new C0154a(this.f361355a.f727a.f739a.f744e);
            aVar.mo691x(R.anim.assistant_family_share_slide_in_bottom_fade_in, 0, R.anim.assistant_family_share_slide_in_bottom_fade_in, 0);
            aVar.mo689v(R.id.assistant_family_share_fragment_container, jVar, "FamilyShareFulfillmentFragment");
            aVar.mo509f();
            Intent intent = this.f361355a.getIntent();
            String action = intent.getAction();
            String type = intent.getType();
            if (!"android.intent.action.SEND".equals(action) || !"text/plain".equals(type)) {
                m215165e(R.string.assistant_family_share_unsupported_shared_content_message);
                C37215b bVar = this.f361356c;
                bVar.getClass();
                bVar.mo19974a(C37176a.f96878aw.mo40805c(C62722b.UNIMPLEMENTED));
                C59104x d = f361354b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FamilyShareFulfillmentActivity");
                ((C59052c) ((C59052c) d).mo56372aa(39598)).mo56354G("Unsupported: Action %s for type %s", action, type);
                this.f361355a.finish();
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra == null || !URLUtil.isNetworkUrl(stringExtra)) {
                m215165e(R.string.assistant_family_share_unsupported_shared_content_message);
                C37215b bVar2 = this.f361356c;
                bVar2.getClass();
                bVar2.mo19974a(C37176a.f96878aw.mo40805c(C62722b.INVALID_ARGUMENT));
                C59104x d2 = f361354b.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "FamilyShareFulfillmentActivity");
                ((C59052c) ((C59052c) d2).mo56372aa(39596)).mo56389s("Invalid text: %s", stringExtra);
                this.f361355a.finish();
                return;
            }
            C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
            mVar.copyOnWrite();
            C61752n nVar = (C61752n) mVar.instance;
            nVar.f166810a |= 4;
            nVar.f166811b = "Tell_my_family";
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "custom_message";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            tVar.f166826a = 1;
            tVar.f166827b = stringExtra;
            C61758t tVar2 = (C61758t) sVar.build();
            iVar.copyOnWrite();
            C61748j jVar2 = (C61748j) iVar.instance;
            tVar2.getClass();
            jVar2.f166803b = tVar2;
            jVar2.f166802a = 3;
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            C61748j jVar3 = (C61748j) iVar.build();
            jVar3.getClass();
            hVar2.f166797e = jVar3;
            hVar2.f166793a |= 4;
            mVar.mo58184c(gVar);
            C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
            C63088z byteString = ((C61752n) mVar.build()).toByteString();
            hcVar.copyOnWrite();
            C52152hd hdVar = (C52152hd) hcVar.instance;
            byteString.getClass();
            hdVar.f136852a |= 1;
            hdVar.f136853b = byteString;
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar = (C51805du) dsVar.instance;
            duVar.f135926a |= 1;
            duVar.f135927b = "asst_input.INTENT";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a = 1 | kaVar.f137059a;
            kaVar.f137060b = "assistant.api.client_input.IntentInput";
            C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString2.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString2;
            dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
            Bundle bundle = new Bundle();
            bundle.putInt("requested_mic_state", 3);
            bundle.putByteArray("client_input", ((C51805du) dsVar.build()).toByteArray());
            Intent intent2 = new Intent();
            intent2.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.OpaActivity");
            intent2.setFlags(268468224);
            intent2.putExtras(bundle);
            this.f361355a.getApplicationContext().startActivity(intent2);
            C37215b bVar3 = this.f361356c;
            bVar3.getClass();
            bVar3.mo19974a(C37176a.f96879ax.mo40805c(C62722b.OK));
            this.f361355a.setResult(-1);
            this.f361355a.finish();
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        m215165e(R.string.assistant_family_share_account_error_message);
        this.f361355a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
