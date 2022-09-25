package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.app.AppOpsManager;
import android.os.Build;
import android.os.Process;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.ay */
/* compiled from: PG */
final class C95088ay extends C95095be {

    /* renamed from: a */
    final /* synthetic */ C95097bg f266002a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95088ay(C95097bg bgVar) {
        super(bgVar, "LISTENING");
        this.f266002a = bgVar;
    }

    /* renamed from: a */
    public final void mo89003a() {
        AppOpsManager appOpsManager;
        super.mo89003a();
        this.f266002a.f266044p.mo89277r(5);
        C95097bg bgVar = this.f266002a;
        C95458i iVar = bgVar.f266046r;
        String k = bgVar.f266044p.mo89270k();
        C58976aa aaVar = C58975e.f156826a;
        iVar.f267119j = k;
        C95097bg bgVar2 = this.f266002a;
        if (Build.VERSION.SDK_INT >= 31 && (appOpsManager = bgVar2.f266049u) != null && !bgVar2.f266028L) {
            bgVar2.f266028L = true;
            appOpsManager.startOp("android:record_audio", Process.myUid(), bgVar2.f266031c.getPackageName(), C39227c.m68658b(C39226b.TAG_CLASSIC_ASSISTANT_BISTO), (String) null);
        }
    }

    /* renamed from: e */
    public final void mo89007e() {
        C59071e eVar = C95097bg.f266015a;
        C58976aa aaVar = C58975e.f156826a;
        this.f266002a.mo89018e("FETCHING");
    }

    /* renamed from: is */
    public final void mo89004is() {
        super.mo89004is();
        C95097bg bgVar = this.f266002a;
        if (bgVar.f266053y) {
            C95127t tVar = bgVar.f266026J;
            if (tVar != null) {
                tVar.mo89050d();
            }
            this.f266002a.f266053y = false;
        }
        C95097bg bgVar2 = this.f266002a;
        bgVar2.f266046r.mo89373B(bgVar2.f266044p.mo89270k());
        this.f266002a.mo89019f();
    }

    /* renamed from: it */
    public final void mo89005it(ServiceEventData serviceEventData) {
        C89885b bVar = C89885b.UNKNOWN;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal != 55) {
            if (ordinal == 66) {
                C59104x d = C95097bg.f266015a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) d).mo56372aa(18005)).mo56386p("Unexpected event: NO_SPEECH_DETECTED.");
            } else if (ordinal == 154) {
                C59104x c = C95097bg.f266015a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) c).mo56372aa(18007)).mo56386p("handleGenericEvent: BISTO_FORCE_CLOSE. Response rendering failed.");
                C95127t tVar = this.f266002a.f266026J;
                if (tVar != null) {
                    tVar.mo89047a();
                }
                if (serviceEventData.mo81913d(ParcelableVoiceAction.class)) {
                    this.f266002a.f266023G = (SearchError) ((ParcelableVoiceAction) serviceEventData.mo81912b(ParcelableVoiceAction.class)).f236008a;
                }
                this.f266002a.mo89018e("QUERY_FAILED");
                return;
            } else if (ordinal != 159) {
                C59104x c2 = C95097bg.f266015a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "QueryHandler");
                C59052c cVar = (C59052c) ((C59052c) c2).mo56372aa(18004);
                String str = this.f266012d;
                C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
                if (a2 == null) {
                    a2 = C88244um.ATTACH_WEBVIEW;
                }
                cVar.mo56354G("In state: %s unknown event: %s", str, a2);
                return;
            }
            C59071e eVar = C95097bg.f266015a;
            C58976aa aaVar = C58975e.f156826a;
            C95127t tVar2 = this.f266002a.f266026J;
            if (tVar2 != null) {
                tVar2.mo89047a();
            }
            this.f266002a.mo89018e("NO_SPEECH_DETECTED");
            return;
        }
        C59071e eVar2 = C95097bg.f266015a;
        C58976aa aaVar2 = C58975e.f156826a;
        this.f266002a.mo89018e("IDLE");
    }
}
