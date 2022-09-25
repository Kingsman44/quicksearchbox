package com.google.android.apps.gsa.assistant.handoff;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.assistant.p3862au.C50520d;
import com.google.assistant.p3862au.C50522f;
import com.google.assistant.p3897e.p3921j.ant;
import com.google.assistant.p3897e.p3921j.anu;
import com.google.assistant.p3897e.p3921j.aoj;
import com.google.assistant.p3897e.p3921j.aom;
import com.google.common.base.C58826aq;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.a */
/* compiled from: PG */
public final class C9442a extends C9444aa {

    /* renamed from: a */
    private static final C59071e f32855a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.a");

    /* renamed from: b */
    private static final C9493z f32856b = C9493z.ADD_ADDRESS;

    /* renamed from: e */
    private static final C58826aq f32857e = new C58826aq(C58827ar.m90818c('+'), ":");

    public C9442a() {
        super(f32856b);
    }

    /* renamed from: a */
    public final C9448ae mo17685a(int i, Intent intent) {
        C50520d dVar = (C50520d) C50522f.f131501d.createBuilder();
        dVar.copyOnWrite();
        ((C50522f) dVar.instance).f131504b = (String) ((C58847bk) f32856b.f32952k).f156646a;
        ant ant = (ant) anu.f135459d.createBuilder();
        if (i == -1) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("AddressIdKey");
                if (stringExtra != null) {
                    aoj aoj = (aoj) aom.f135503c.createBuilder();
                    aoj.copyOnWrite();
                    aom aom = (aom) aoj.instance;
                    aom.f135506b = 1;
                    aom.f135505a |= 1;
                    ant.copyOnWrite();
                    anu anu = (anu) ant.instance;
                    aom aom2 = (aom) aoj.build();
                    aom2.getClass();
                    anu.f135462b = aom2;
                    anu.f135461a |= 1;
                    ant.copyOnWrite();
                    anu anu2 = (anu) ant.instance;
                    anu2.f135461a |= 2;
                    anu2.f135463c = stringExtra;
                } else {
                    ((C59052c) ((C59052c) f32855a.mo56226d()).mo56372aa(215)).mo56386p("Missing addressId.");
                    int i2 = C90755l.f253831a;
                    aoj aoj2 = (aoj) aom.f135503c.createBuilder();
                    aoj2.copyOnWrite();
                    aom aom3 = (aom) aoj2.instance;
                    aom3.f135506b = 3;
                    aom3.f135505a |= 1;
                    ant.copyOnWrite();
                    anu anu3 = (anu) ant.instance;
                    aom aom4 = (aom) aoj2.build();
                    aom4.getClass();
                    anu3.f135462b = aom4;
                    anu3.f135461a |= 1;
                }
            } else {
                ((C59052c) ((C59052c) f32855a.mo56226d()).mo56372aa(214)).mo56386p("Missing AssistantSettingsActivity payments add_address result data");
                int i3 = C90755l.f253831a;
                aoj aoj3 = (aoj) aom.f135503c.createBuilder();
                aoj3.copyOnWrite();
                aom aom5 = (aom) aoj3.instance;
                aom5.f135506b = 3;
                aom5.f135505a |= 1;
                ant.copyOnWrite();
                anu anu4 = (anu) ant.instance;
                aom aom6 = (aom) aoj3.build();
                aom6.getClass();
                anu4.f135462b = aom6;
                anu4.f135461a |= 1;
            }
        } else if (i == 0) {
            aoj aoj4 = (aoj) aom.f135503c.createBuilder();
            aoj4.copyOnWrite();
            aom aom7 = (aom) aoj4.instance;
            aom7.f135506b = 4;
            aom7.f135505a |= 1;
            ant.copyOnWrite();
            anu anu5 = (anu) ant.instance;
            aom aom8 = (aom) aoj4.build();
            aom8.getClass();
            anu5.f135462b = aom8;
            anu5.f135461a |= 1;
        } else {
            ((C59052c) ((C59052c) f32855a.mo56225c()).mo56372aa(213)).mo56387q("Unknown activity result: %d", i);
            aoj aoj5 = (aoj) aom.f135503c.createBuilder();
            aoj5.copyOnWrite();
            aom aom9 = (aom) aoj5.instance;
            aom9.f135506b = 3;
            aom9.f135505a |= 1;
            ant.copyOnWrite();
            anu anu6 = (anu) ant.instance;
            aom aom10 = (aom) aoj5.build();
            aom10.getClass();
            anu6.f135462b = aom10;
            anu6.f135461a |= 1;
        }
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.api.client_input.AddAddressInputParam";
        C63088z byteString = ((anu) ant.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        dVar.mo53403a(C58495hd.m89900n("transactions_input_params", (C63070h) gVar.build()));
        return new C9477j(i, C58836b.f156633a, C58833ax.m90834k((C50522f) dVar.build()));
    }

    /* renamed from: b */
    public final C58833ax mo17686b(Context context, C9447ad adVar) {
        String str;
        if (!adVar.mo17691e("assistant-transactions", "add-address")) {
            return C58836b.f156633a;
        }
        C58833ax b = adVar.mo17688b("country_code", "country_code");
        C58833ax b2 = adVar.mo17688b("address_collection_parameters", "address_collection_parameters");
        HashMap hashMap = new HashMap();
        if (b.mo56113h()) {
            hashMap.put("country_code", (String) b.mo56107c());
        }
        if (b2.mo56113h()) {
            hashMap.put("address_collection_parameters", (String) b2.mo56107c());
        }
        if (hashMap.isEmpty()) {
            str = "add_address";
        } else {
            str = "add_address+".concat(f32857e.mo56095a(hashMap));
        }
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "payments";
        c.mo24025g(str);
        return C58833ax.m90834k(c.mo24020b().mo24031a());
    }
}
