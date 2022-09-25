package com.google.android.apps.gsa.assistant.handoff;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.gms.wallet.firstparty.p10886b.C146352a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1745b.p1746a.C21420b;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21428f;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21438p;
import com.google.assistant.p3862au.C50520d;
import com.google.assistant.p3862au.C50522f;
import com.google.assistant.p3897e.p3921j.anv;
import com.google.assistant.p3897e.p3921j.anw;
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

/* renamed from: com.google.android.apps.gsa.assistant.handoff.c */
/* compiled from: PG */
public final class C9470c extends C9444aa {

    /* renamed from: a */
    private static final C59071e f32901a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.c");

    /* renamed from: b */
    private static final C9493z f32902b = C9493z.ADD_INSTRUMENT;

    /* renamed from: e */
    private final C9488u f32903e;

    public C9470c(C9488u uVar) {
        super(f32902b);
        this.f32903e = uVar;
    }

    /* renamed from: a */
    public final C9448ae mo17685a(int i, Intent intent) {
        C50520d dVar = (C50520d) C50522f.f131501d.createBuilder();
        dVar.copyOnWrite();
        ((C50522f) dVar.instance).f131504b = (String) ((C58847bk) f32902b.f32952k).f156646a;
        anv anv = (anv) anw.f135464d.createBuilder();
        if (i == -1) {
            if (intent != null) {
                long longExtra = intent.getLongExtra("com.google.android.gms.wallet.f1InstrumentId", 0);
                if (longExtra != 0) {
                    aoj aoj = (aoj) aom.f135503c.createBuilder();
                    aoj.copyOnWrite();
                    aom aom = (aom) aoj.instance;
                    aom.f135506b = 1;
                    aom.f135505a |= 1;
                    anv.copyOnWrite();
                    anw anw = (anw) anv.instance;
                    aom aom2 = (aom) aoj.build();
                    aom2.getClass();
                    anw.f135467b = aom2;
                    anw.f135466a |= 1;
                    anv.copyOnWrite();
                    anw anw2 = (anw) anv.instance;
                    anw2.f135466a |= 2;
                    anw2.f135468c = longExtra;
                } else {
                    ((C59052c) ((C59052c) f32901a.mo56226d()).mo56372aa(222)).mo56386p("Missing InstrumentManager f1InstrumentId");
                    int i2 = C90755l.f253831a;
                    aoj aoj2 = (aoj) aom.f135503c.createBuilder();
                    aoj2.copyOnWrite();
                    aom aom3 = (aom) aoj2.instance;
                    aom3.f135506b = 3;
                    aom3.f135505a |= 1;
                    anv.copyOnWrite();
                    anw anw3 = (anw) anv.instance;
                    aom aom4 = (aom) aoj2.build();
                    aom4.getClass();
                    anw3.f135467b = aom4;
                    anw3.f135466a |= 1;
                }
            } else {
                ((C59052c) ((C59052c) f32901a.mo56226d()).mo56372aa(221)).mo56386p("Missing InstrumentManager result data");
                int i3 = C90755l.f253831a;
                aoj aoj3 = (aoj) aom.f135503c.createBuilder();
                aoj3.copyOnWrite();
                aom aom5 = (aom) aoj3.instance;
                aom5.f135506b = 3;
                aom5.f135505a |= 1;
                anv.copyOnWrite();
                anw anw4 = (anw) anv.instance;
                aom aom6 = (aom) aoj3.build();
                aom6.getClass();
                anw4.f135467b = aom6;
                anw4.f135466a |= 1;
            }
        } else if (i == 0) {
            aoj aoj4 = (aoj) aom.f135503c.createBuilder();
            aoj4.copyOnWrite();
            aom aom7 = (aom) aoj4.instance;
            aom7.f135506b = 4;
            aom7.f135505a |= 1;
            anv.copyOnWrite();
            anw anw5 = (anw) anv.instance;
            aom aom8 = (aom) aoj4.build();
            aom8.getClass();
            anw5.f135467b = aom8;
            anw5.f135466a |= 1;
        } else {
            ((C59052c) ((C59052c) f32901a.mo56225c()).mo56372aa(220)).mo56387q("Unknown activity result: %d", i);
            aoj aoj5 = (aoj) aom.f135503c.createBuilder();
            aoj5.copyOnWrite();
            aom aom9 = (aom) aoj5.instance;
            aom9.f135506b = 3;
            aom9.f135505a |= 1;
            anv.copyOnWrite();
            anw anw6 = (anw) anv.instance;
            aom aom10 = (aom) aoj5.build();
            aom10.getClass();
            anw6.f135467b = aom10;
            anw6.f135466a |= 1;
        }
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.api.client_input.AddInstrumentInputParam";
        C63088z byteString = ((anw) anv.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        dVar.mo53403a(C58495hd.m89900n("transactions_input_params", (C63070h) gVar.build()));
        return new C9477j(i, C58836b.f156633a, C58833ax.m90834k((C50522f) dVar.build()));
    }

    /* renamed from: b */
    public final C58833ax mo17686b(Context context, C9447ad adVar) {
        if (!adVar.mo17691e("assistant-transactions", "add-instrument")) {
            return C58836b.f156633a;
        }
        C58833ax a = adVar.mo17687a();
        if (!a.mo56113h()) {
            ((C59052c) ((C59052c) f32901a.mo56225c()).mo56372aa(219)).mo56386p("Invalid account name");
            return C58836b.f156633a;
        }
        C58833ax a2 = C90730an.m148188a(adVar.mo17688b("add_token", "add_token").mo56106b(C9469b.f32900a));
        if (!a2.mo56113h()) {
            ((C59052c) ((C59052c) f32901a.mo56225c()).mo56372aa(218)).mo56389s("Invalid token parameter: %s", "add_token");
            return C58836b.f156633a;
        }
        C21428f fVar = new C21428f(new C146352a(context));
        fVar.mo26931d(this.f32903e.mo17712a());
        fVar.mo26930c(new C21438p());
        fVar.mo26929b((Account) a.mo56107c());
        C21420b.m40538a((byte[]) a2.mo56107c(), fVar);
        return C58833ax.m90834k(fVar.mo26928a());
    }
}
