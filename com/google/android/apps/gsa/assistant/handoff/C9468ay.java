package com.google.android.apps.gsa.assistant.handoff;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.assistant.p3862au.C50520d;
import com.google.assistant.p3862au.C50522f;
import com.google.assistant.p3897e.p3921j.aoh;
import com.google.assistant.p3897e.p3921j.aoi;
import com.google.assistant.p3897e.p3921j.aoj;
import com.google.assistant.p3897e.p3921j.aom;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.ay */
/* compiled from: PG */
public final class C9468ay extends C9444aa {

    /* renamed from: a */
    private static final C59071e f32898a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.ay");

    /* renamed from: b */
    private static final C9493z f32899b = C9493z.SETUP_PAYMENTS;

    public C9468ay() {
        super(f32899b);
    }

    /* renamed from: a */
    public final C9448ae mo17685a(int i, Intent intent) {
        C50520d dVar = (C50520d) C50522f.f131501d.createBuilder();
        dVar.copyOnWrite();
        ((C50522f) dVar.instance).f131504b = (String) ((C58847bk) f32899b.f32952k).f156646a;
        aoh aoh = (aoh) aoi.f135497d.createBuilder();
        if (i == -1) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("VersionInfoKey");
                if (stringExtra != null) {
                    aoj aoj = (aoj) aom.f135503c.createBuilder();
                    aoj.copyOnWrite();
                    aom aom = (aom) aoj.instance;
                    aom.f135506b = 1;
                    aom.f135505a |= 1;
                    aoh.copyOnWrite();
                    aoi aoi = (aoi) aoh.instance;
                    aom aom2 = (aom) aoj.build();
                    aom2.getClass();
                    aoi.f135500b = aom2;
                    aoi.f135499a |= 1;
                    aoh.copyOnWrite();
                    aoi aoi2 = (aoi) aoh.instance;
                    aoi2.f135499a |= 2;
                    aoi2.f135501c = stringExtra;
                } else {
                    ((C59052c) ((C59052c) f32898a.mo56225c()).mo56372aa(291)).mo56386p("Missing version info.");
                    aoj aoj2 = (aoj) aom.f135503c.createBuilder();
                    aoj2.copyOnWrite();
                    aom aom3 = (aom) aoj2.instance;
                    aom3.f135506b = 3;
                    aom3.f135505a |= 1;
                    aoh.copyOnWrite();
                    aoi aoi3 = (aoi) aoh.instance;
                    aom aom4 = (aom) aoj2.build();
                    aom4.getClass();
                    aoi3.f135500b = aom4;
                    aoi3.f135499a |= 1;
                }
            } else {
                ((C59052c) ((C59052c) f32898a.mo56225c()).mo56372aa(290)).mo56386p("Missing AssistantSettingsActivity payments setup result data");
                aoj aoj3 = (aoj) aom.f135503c.createBuilder();
                aoj3.copyOnWrite();
                aom aom5 = (aom) aoj3.instance;
                aom5.f135506b = 3;
                aom5.f135505a |= 1;
                aoh.copyOnWrite();
                aoi aoi4 = (aoi) aoh.instance;
                aom aom6 = (aom) aoj3.build();
                aom6.getClass();
                aoi4.f135500b = aom6;
                aoi4.f135499a |= 1;
            }
        } else if (i == 0) {
            aoj aoj4 = (aoj) aom.f135503c.createBuilder();
            aoj4.copyOnWrite();
            aom aom7 = (aom) aoj4.instance;
            aom7.f135506b = 4;
            aom7.f135505a |= 1;
            aoh.copyOnWrite();
            aoi aoi5 = (aoi) aoh.instance;
            aom aom8 = (aom) aoj4.build();
            aom8.getClass();
            aoi5.f135500b = aom8;
            aoi5.f135499a |= 1;
        } else {
            ((C59052c) ((C59052c) f32898a.mo56225c()).mo56372aa(289)).mo56387q("Unknown activity result: %d", i);
            aoj aoj5 = (aoj) aom.f135503c.createBuilder();
            aoj5.copyOnWrite();
            aom aom9 = (aom) aoj5.instance;
            aom9.f135506b = 3;
            aom9.f135505a |= 1;
            aoh.copyOnWrite();
            aoi aoi6 = (aoi) aoh.instance;
            aom aom10 = (aom) aoj5.build();
            aom10.getClass();
            aoi6.f135500b = aom10;
            aoi6.f135499a |= 1;
        }
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.api.client_input.SetupPaymentsInputParam";
        C63088z byteString = ((aoi) aoh.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        dVar.mo53403a(C58495hd.m89900n("transactions_input_params", (C63070h) gVar.build()));
        return new C9477j(i, C58836b.f156633a, C58833ax.m90834k((C50522f) dVar.build()));
    }

    /* renamed from: b */
    public final C58833ax mo17686b(Context context, C9447ad adVar) {
        if (!adVar.mo17691e("assistant-transactions", "setup-payments")) {
            return C58836b.f156633a;
        }
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "payments";
        c.mo24025g("setup_payments");
        return C58833ax.m90834k(c.mo24020b().mo24031a());
    }
}
