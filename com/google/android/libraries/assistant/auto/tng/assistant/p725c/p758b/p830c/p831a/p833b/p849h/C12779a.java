package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p849h;

import com.google.android.libraries.assistant.auto.tng.media.p1051c.C13987a;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52169hu;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.h.a */
/* compiled from: PG */
public final class C12779a extends C22538o {

    /* renamed from: a */
    private static final C59071e f39946a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.h.a");

    /* renamed from: b */
    private final C58833ax f39947b;

    public C12779a(C58833ax axVar) {
        this.f39947b = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C52169hu huVar;
        if (dyVar.f135936b.equals("media.ON_DEVICE_LOOKUP")) {
            try {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                huVar = (C52169hu) m41992m(dwVar, "physical_media_browser_args", C52169hu.f136889a.getParserForType());
            } catch (C22371a | C62974ct e) {
                C59104x c = f39946a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CarAsstOnDevLookupPerf");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(44454)).mo56386p("No valid physical media args available.");
                huVar = null;
            }
            if (huVar != null && this.f39947b.mo56113h()) {
                return ((C13987a) this.f39947b.mo56107c()).mo21379a();
            }
        }
        throw new C22428d(dyVar);
    }
}
