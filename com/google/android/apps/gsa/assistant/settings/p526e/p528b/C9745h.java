package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import android.accounts.Account;
import android.content.Intent;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.p526e.C9751c;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.assistant.p3957l.p3974e.p3975a.p3976a.C52990b;
import com.google.assistant.p3957l.p3974e.p3975a.p3976a.C52993e;
import com.google.common.p4522b.C58495hd;
import com.google.net.p4726a.p4728b.C62723a;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.h */
/* compiled from: PG */
public final class C9745h implements C73740a {

    /* renamed from: a */
    private static final C58495hd f33646a = C58495hd.m89901o(C52990b.NOTICE_CAPABILITY_CONSENT, "extra_enable_data_usage_consent", C52990b.NOTICE_LINKING_INFO, "extra_enable_data_usage_info");

    /* renamed from: b */
    private final h f33647b;

    /* renamed from: c */
    private final C91097g f33648c;

    /* renamed from: d */
    private final C9751c f33649d;

    public C9745h(h hVar, C91097g gVar, C9751c cVar) {
        this.f33647b = hVar;
        this.f33648c = gVar;
        this.f33649d = cVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "galNativeInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    /* renamed from: c */
    public final void mo18009c(C62724b bVar) {
        C9751c cVar = this.f33649d;
        String encodeToString = Base64.encodeToString(bVar.toByteArray(), 2);
        cVar.mo18014a("galNativeInterface.onTokenResponse('" + encodeToString + "')");
    }

    @JavascriptInterface
    public void requestTokenForService(String str) {
        try {
            C52993e eVar = (C52993e) C62942bv.parseFrom((C62942bv) C52993e.f138912i, Base64.decode(str, 0), C62921ba.m95368a());
            Account a = this.f33647b.a();
            if (a == null) {
                C62723a aVar = (C62723a) C62724b.f169416g.createBuilder();
                aVar.copyOnWrite();
                C62724b bVar = (C62724b) aVar.instance;
                bVar.f169418a = 1 | bVar.f169418a;
                bVar.f169419b = 16;
                aVar.copyOnWrite();
                C62724b bVar2 = (C62724b) aVar.instance;
                bVar2.f169418a |= 4;
                bVar2.f169421d = "AssistantSettingsHelper did not provide an account to use";
                mo18009c((C62724b) aVar.build());
                return;
            }
            Intent putExtra = new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.gdi.GdiControlActivity").putExtra("extra_service_id", eVar.f138914a).putExtra("extra_account", a).putExtra("extra_scopes", (String[]) eVar.f138915b.toArray(new String[0])).putExtra("extra_action_mode", eVar.f138917d ? 1 : 0).putExtra("extra_google_scopes", (String[]) eVar.f138918e.toArray(new String[0])).putExtra("extra_supports_app_flip", eVar.f138919f).putExtra("extra_enable_relink", eVar.f138916c);
            for (C52990b bVar3 : new C62963cj(eVar.f138920g, C52993e.f138911h)) {
                C58495hd hdVar = f33646a;
                if (hdVar.containsKey(bVar3)) {
                    putExtra.putExtra((String) hdVar.get(bVar3), true);
                }
            }
            this.f33648c.mo65090b(putExtra, new C9744g(this));
        } catch (C62974ct unused) {
            C62723a aVar2 = (C62723a) C62724b.f169416g.createBuilder();
            aVar2.copyOnWrite();
            C62724b bVar4 = (C62724b) aVar2.instance;
            bVar4.f169418a = 1 | bVar4.f169418a;
            bVar4.f169419b = 3;
            aVar2.copyOnWrite();
            C62724b bVar5 = (C62724b) aVar2.instance;
            bVar5.f169418a |= 4;
            bVar5.f169421d = "Could not decode TokenRequest";
            mo18009c((C62724b) aVar2.build());
        }
    }
}
