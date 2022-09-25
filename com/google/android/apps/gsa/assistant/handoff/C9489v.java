package com.google.android.apps.gsa.assistant.handoff;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3862au.C50520d;
import com.google.assistant.p3862au.C50522f;
import com.google.assistant.p3897e.p3921j.C51699b;
import com.google.assistant.p3897e.p3921j.C51729c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.v */
/* compiled from: PG */
public final class C9489v extends C9444aa {

    /* renamed from: a */
    private static final C59071e f32930a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.v");

    /* renamed from: b */
    private static final C9493z f32931b = C9493z.GDI_ACTIVITY;

    /* renamed from: e */
    private final C90021c f32932e;

    /* renamed from: f */
    private String f32933f;

    public C9489v(C90021c cVar) {
        super(f32931b);
        this.f32932e = cVar;
    }

    /* renamed from: a */
    public final C9448ae mo17685a(int i, Intent intent) {
        if (this.f32932e.mo79746e(C90014bt.f247538iz)) {
            C58833ax axVar = f32931b.f32952k;
            C50520d dVar = (C50520d) C50522f.f131501d.createBuilder();
            dVar.copyOnWrite();
            ((C50522f) dVar.instance).f131504b = (String) ((C58847bk) axVar).f156646a;
            C51699b bVar = (C51699b) C51729c.f135713c.createBuilder();
            if (i == -1) {
                if (intent == null || !intent.hasExtra("extra_has_access_token")) {
                    ((C59052c) ((C59052c) f32930a.mo56225c()).mo56372aa(268)).mo56386p("Invalid gdi response, result status is OK, but no valid access token.");
                    bVar.copyOnWrite();
                    C51729c cVar = (C51729c) bVar.instance;
                    cVar.f135716b = 3;
                    cVar.f135715a |= 1;
                } else {
                    bVar.copyOnWrite();
                    C51729c cVar2 = (C51729c) bVar.instance;
                    cVar2.f135716b = 1;
                    cVar2.f135715a |= 1;
                }
            } else if (i != 0) {
                ((C59052c) ((C59052c) f32930a.mo56225c()).mo56372aa(265)).mo56386p("Invalid gdi response, unknown result code.");
                bVar.copyOnWrite();
                C51729c cVar3 = (C51729c) bVar.instance;
                cVar3.f135716b = 3;
                cVar3.f135715a |= 1;
            } else if (intent == null || !intent.hasExtra("extra_error_type")) {
                ((C59052c) ((C59052c) f32930a.mo56225c()).mo56372aa(266)).mo56386p("Invalid gdi response, result status: cancelled, but missing result data/status code.");
                bVar.copyOnWrite();
                C51729c cVar4 = (C51729c) bVar.instance;
                cVar4.f135716b = 3;
                cVar4.f135715a |= 1;
            } else if (intent.getIntExtra("extra_error_type", 0) == 4 || intent.getIntExtra("extra_error_type", 0) == 3) {
                bVar.copyOnWrite();
                C51729c cVar5 = (C51729c) bVar.instance;
                cVar5.f135716b = 2;
                cVar5.f135715a |= 1;
            } else {
                ((C59052c) ((C59052c) f32930a.mo56225c()).mo56372aa(267)).mo56387q("Invalid gdi response, result status: cancelled, error type: %d", intent.getIntExtra("extra_error_type", 0));
                bVar.copyOnWrite();
                C51729c cVar6 = (C51729c) bVar.instance;
                cVar6.f135716b = 3;
                cVar6.f135715a |= 1;
            }
            C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
            gVar.copyOnWrite();
            ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.api.client_input.AccountLinkingParam";
            C63088z byteString = ((C51729c) bVar.build()).toByteString();
            gVar.copyOnWrite();
            byteString.getClass();
            ((C63070h) gVar.instance).f170218b = byteString;
            dVar.mo53403a(C58495hd.m89900n("account_linking_input_params", (C63070h) gVar.build()));
            C58833ax axVar2 = C58836b.f156633a;
            if (i == -1) {
                axVar2 = C58833ax.m90834k(new Intent().putExtra("assistant_handoff_result_message", this.f32933f));
                i = -1;
            }
            return new C9477j(i, axVar2, C58833ax.m90834k((C50522f) dVar.build()));
        } else if (i == -1) {
            return new C9477j(-1, C58833ax.m90834k(new Intent().putExtra("assistant_handoff_result_message", this.f32933f)), C58836b.f156633a);
        } else {
            C58836b bVar2 = C58836b.f156633a;
            return new C9477j(0, bVar2, bVar2);
        }
    }

    /* renamed from: b */
    public final C58833ax mo17686b(Context context, C9447ad adVar) {
        if (!"assistant-identity".equals(adVar.f32864a.getScheme())) {
            return C58836b.f156633a;
        }
        C58833ax a = adVar.mo17687a();
        if (!a.mo56113h()) {
            ((C59052c) ((C59052c) f32930a.mo56225c()).mo56372aa(264)).mo56386p("Missing account");
            return C58836b.f156633a;
        }
        C58833ax b = adVar.mo17688b("provider", "provider");
        if (!b.mo56113h()) {
            ((C59052c) ((C59052c) f32930a.mo56225c()).mo56372aa(263)).mo56389s("Missing parameter: %s", "provider");
            return C58836b.f156633a;
        }
        String[] split = ((String) adVar.mo17688b("scopes", "scopes").mo56109e(BuildConfig.FLAVOR)).split("\\s");
        if (split.length == 0 || split[0].isEmpty()) {
            split = new String[0];
        }
        Boolean valueOf = Boolean.valueOf(adVar.mo17690d("support_app_flip"));
        int intValue = adVar.mo17689c("session_id").intValue();
        this.f32933f = context.getResources().getString(R.string.assistant_handoff_linking_success);
        return C58833ax.m90834k(new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.gdi.GdiControlActivity").putExtra("extra_service_id", (String) b.mo56107c()).putExtra("extra_account", (Parcelable) a.mo56107c()).putExtra("extra_scopes", split).putExtra("extra_supports_app_flip", valueOf).putExtra("session_id", intValue));
    }
}
