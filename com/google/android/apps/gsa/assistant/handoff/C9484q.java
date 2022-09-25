package com.google.android.apps.gsa.assistant.handoff;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.gms.wallet.firstparty.p10887pm.C146362a;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21424b;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21428f;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c.C21438p;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1748d.p1749a.C21440b;
import com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1748d.p1749a.C21441c;
import com.google.assistant.p3862au.C50520d;
import com.google.assistant.p3862au.C50522f;
import com.google.assistant.p3897e.p3921j.aob;
import com.google.assistant.p3897e.p3921j.aoc;
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

/* renamed from: com.google.android.apps.gsa.assistant.handoff.q */
/* compiled from: PG */
public final class C9484q extends C9444aa {

    /* renamed from: a */
    private static final C59071e f32919a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.q");

    /* renamed from: b */
    private static final C9493z f32920b = C9493z.CVC_CHALLENGE;

    /* renamed from: e */
    private final C9488u f32921e;

    /* renamed from: f */
    private final C21424b f32922f;

    public C9484q(C21424b bVar, C9488u uVar) {
        super(f32920b);
        this.f32922f = bVar;
        this.f32921e = uVar;
    }

    /* renamed from: a */
    public final C9448ae mo17685a(int i, Intent intent) {
        C50520d dVar = (C50520d) C50522f.f131501d.createBuilder();
        dVar.copyOnWrite();
        ((C50522f) dVar.instance).f131504b = (String) ((C58847bk) f32920b.f32952k).f156646a;
        aob aob = (aob) aoc.f135482d.createBuilder();
        if (i == -1) {
            if (intent != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra(this.f32922f.mo26923a());
                if (byteArrayExtra == null || byteArrayExtra.length <= 0) {
                    ((C59052c) ((C59052c) f32919a.mo56226d()).mo56372aa(250)).mo56386p("Missing PurchaseManager EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
                    int i2 = C90755l.f253831a;
                    aoj aoj = (aoj) aom.f135503c.createBuilder();
                    aoj.copyOnWrite();
                    aom aom = (aom) aoj.instance;
                    aom.f135506b = 3;
                    aom.f135505a |= 1;
                    aob.copyOnWrite();
                    aoc aoc = (aoc) aob.instance;
                    aom aom2 = (aom) aoj.build();
                    aom2.getClass();
                    aoc.f135485b = aom2;
                    aoc.f135484a |= 1;
                } else {
                    C63088z A = C63088z.m96139A(byteArrayExtra);
                    aob.copyOnWrite();
                    aoc aoc2 = (aoc) aob.instance;
                    aoc2.f135484a |= 2;
                    aoc2.f135486c = A;
                }
            } else {
                ((C59052c) ((C59052c) f32919a.mo56226d()).mo56372aa(249)).mo56386p("Missing PurchaseManager result data");
                int i3 = C90755l.f253831a;
                aoj aoj2 = (aoj) aom.f135503c.createBuilder();
                aoj2.copyOnWrite();
                aom aom3 = (aom) aoj2.instance;
                aom3.f135506b = 3;
                aom3.f135505a |= 1;
                aob.copyOnWrite();
                aoc aoc3 = (aoc) aob.instance;
                aom aom4 = (aom) aoj2.build();
                aom4.getClass();
                aoc3.f135485b = aom4;
                aoc3.f135484a |= 1;
            }
            aoj aoj3 = (aoj) aom.f135503c.createBuilder();
            aoj3.copyOnWrite();
            aom aom5 = (aom) aoj3.instance;
            aom5.f135506b = 1;
            aom5.f135505a |= 1;
            aob.copyOnWrite();
            aoc aoc4 = (aoc) aob.instance;
            aom aom6 = (aom) aoj3.build();
            aom6.getClass();
            aoc4.f135485b = aom6;
            aoc4.f135484a |= 1;
        } else if (i == 0) {
            aoj aoj4 = (aoj) aom.f135503c.createBuilder();
            aoj4.copyOnWrite();
            aom aom7 = (aom) aoj4.instance;
            aom7.f135506b = 4;
            aom7.f135505a |= 1;
            aob.copyOnWrite();
            aoc aoc5 = (aoc) aob.instance;
            aom aom8 = (aom) aoj4.build();
            aom8.getClass();
            aoc5.f135485b = aom8;
            aoc5.f135484a |= 1;
        } else {
            ((C59052c) ((C59052c) f32919a.mo56225c()).mo56372aa(248)).mo56387q("Unknown activity result: %d", i);
            aoj aoj5 = (aoj) aom.f135503c.createBuilder();
            aoj5.copyOnWrite();
            aom aom9 = (aom) aoj5.instance;
            aom9.f135506b = 3;
            aom9.f135505a |= 1;
            aob.copyOnWrite();
            aoc aoc6 = (aoc) aob.instance;
            aom aom10 = (aom) aoj5.build();
            aom10.getClass();
            aoc6.f135485b = aom10;
            aoc6.f135484a |= 1;
        }
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.api.client_input.CvcChallengeInputParam";
        C63088z byteString = ((aoc) aob.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        dVar.mo53403a(C58495hd.m89900n("transactions_input_params", (C63070h) gVar.build()));
        return new C9477j(i, C58836b.f156633a, C58833ax.m90834k((C50522f) dVar.build()));
    }

    /* renamed from: b */
    public final C58833ax mo17686b(Context context, C9447ad adVar) {
        if (!adVar.mo17691e("assistant-transactions", "cvc-challenge")) {
            return C58836b.f156633a;
        }
        C58833ax a = adVar.mo17687a();
        if (!a.mo56113h()) {
            ((C59052c) ((C59052c) f32919a.mo56225c()).mo56372aa(247)).mo56386p("Invalid account name");
            return C58836b.f156633a;
        }
        C58833ax a2 = C90730an.m148188a(adVar.mo17688b("challenge_token", "challenge_token").mo56106b(C9483p.f32918a));
        if (!a2.mo56113h()) {
            ((C59052c) ((C59052c) f32919a.mo56225c()).mo56372aa(246)).mo56389s("Invalid token parameter: %s", "challenge_token");
            return C58836b.f156633a;
        }
        C21428f fVar = new C21428f(new C146362a(context));
        fVar.mo26931d(this.f32921e.mo17712a());
        fVar.mo26930c(new C21438p());
        fVar.mo26929b((Account) a.mo56107c());
        C21440b.m40558a(C21441c.m40559a((byte[]) a2.mo56107c()), fVar);
        return C58833ax.m90834k(fVar.mo26928a());
    }
}
