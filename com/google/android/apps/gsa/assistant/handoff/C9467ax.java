package com.google.android.apps.gsa.assistant.handoff;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.assistant.p3862au.C50520d;
import com.google.assistant.p3862au.C50522f;
import com.google.assistant.p3897e.p3921j.aog;
import com.google.assistant.p3897e.p3921j.aon;
import com.google.assistant.p3897e.p3921j.aop;
import com.google.assistant.p3897e.p3921j.aoq;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.ax */
/* compiled from: PG */
public final class C9467ax extends C9444aa {

    /* renamed from: a */
    private static final C59071e f32895a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.ax");

    /* renamed from: b */
    private static final C9493z f32896b = C9493z.PAYMENTS_AUTH_PIN_ACTIVITY;

    /* renamed from: e */
    private final C90021c f32897e;

    public C9467ax(C90021c cVar) {
        super(f32896b);
        this.f32897e = cVar;
    }

    /* renamed from: a */
    public final C9448ae mo17685a(int i, Intent intent) {
        if (intent == null) {
            ((C59052c) ((C59052c) f32895a.mo56225c()).mo56372aa(284)).mo56386p("No valid data to submit handoff results.");
            return C9448ae.m23970d(i);
        }
        C50520d dVar = (C50520d) C50522f.f131501d.createBuilder();
        C58833ax axVar = f32896b.f32952k;
        ProtoLiteParcelable protoLiteParcelable = (ProtoLiteParcelable) intent.getParcelableExtra("com.google.android.apps.gsa.staticplugins.collectpin.EXTRA_PROTO_PARCELABLE_TRANSACTIONS_PIN_AUTH_ARGS");
        C58833ax j = protoLiteParcelable != null ? C58833ax.m90833j((aog) protoLiteParcelable.mo84191d(aog.f135492d.getParserForType())) : C58836b.f156633a;
        if (!j.mo56113h()) {
            ((C59052c) ((C59052c) f32895a.mo56225c()).mo56372aa(283)).mo56386p("No valid PinAuthenticationInputParam to submit handoff results.");
            return C9448ae.m23970d(i);
        }
        dVar.copyOnWrite();
        ((C50522f) dVar.instance).f131504b = (String) ((C58847bk) axVar).f156646a;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.api.client_input.PinAuthenticationInputParam";
        C63088z byteString = ((aog) j.mo56107c()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        dVar.mo53404b("transactions_pin_input_params", (C63070h) gVar.build());
        return new C9477j(i, C58836b.f156633a, C58833ax.m90834k((C50522f) dVar.build()));
    }

    /* renamed from: b */
    public final C58833ax mo17686b(Context context, C9447ad adVar) {
        if (!this.f32897e.mo79746e(C90014bt.f247535iw)) {
            ((C59052c) ((C59052c) f32895a.mo56226d()).mo56372aa(286)).mo56386p("Handoff activity for payments pin auth is disabled with a flag");
            return C58836b.f156633a;
        } else if (!adVar.mo17691e("assistant-transactions", "pin-authentication")) {
            return C58836b.f156633a;
        } else {
            int intValue = adVar.mo17689c("pin_length").intValue();
            if (intValue < 4 || intValue > 8) {
                ((C59052c) ((C59052c) f32895a.mo56226d()).mo56372aa(285)).mo56386p("The pin length is invalid. Should be >= 4 and <= 8. ");
                return C58836b.f156633a;
            }
            C58833ax b = adVar.mo17688b("header", "header");
            C58833ax b2 = adVar.mo17688b("logo_url", "logo_url");
            C58833ax b3 = adVar.mo17688b("hint", "hint");
            int intValue2 = adVar.mo17689c("hint_type").intValue();
            C58833ax b4 = adVar.mo17688b("forgot_pin_url", "forgot_pin_url");
            C58833ax b5 = adVar.mo17688b("forgot_pin_message", "forgot_pin_message");
            C58833ax b6 = adVar.mo17688b("forgot_pin_html_message", "forgot_pin_html_message");
            aon aon = (aon) aoq.f135508j.createBuilder();
            aon.copyOnWrite();
            aoq aoq = (aoq) aon.instance;
            aoq.f135510a |= 1;
            aoq.f135511b = intValue;
            int a = aop.m86354a(intValue2);
            aon.copyOnWrite();
            aoq aoq2 = (aoq) aon.instance;
            int i = a - 1;
            if (a != 0) {
                aoq2.f135515f = i;
                aoq2.f135510a |= 16;
                Objects.requireNonNull(aon);
                C90730an.m148190c(b, new C9461ar(aon));
                Objects.requireNonNull(aon);
                C90730an.m148190c(b2, new C9462as(aon));
                Objects.requireNonNull(aon);
                C90730an.m148190c(b3, new C9463at(aon));
                Objects.requireNonNull(aon);
                C90730an.m148190c(b4, new C9464au(aon));
                Objects.requireNonNull(aon);
                C90730an.m148190c(b5, new C9465av(aon));
                Objects.requireNonNull(aon);
                C90730an.m148190c(b6, new C9466aw(aon));
                Intent intent = new Intent();
                intent.putExtra("com.google.android.apps.gsa.staticplugins.collectpin.EXTRA_PROTO_PARCELABLE_TRANSACTIONS_PIN_AUTH_ARGS", new ProtoLiteParcelable((MessageLite) (aoq) aon.build()));
                intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.collectpin.CollectPinActivity");
                return C58833ax.m90834k(intent);
            }
            throw null;
        }
    }
}
