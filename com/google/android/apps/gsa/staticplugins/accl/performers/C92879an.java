package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89111e;
import com.google.android.apps.gsa.shared.p7066m.C90028cg;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52119fy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.an */
/* compiled from: PG */
public final class C92879an extends C22538o {

    /* renamed from: b */
    private static final C59071e f259127b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.an");

    /* renamed from: a */
    final C68214a f259128a;

    /* renamed from: c */
    private final C22695ah f259129c;

    public C92879an(C68214a aVar, C22695ah ahVar) {
        this.f259128a = aVar;
        this.f259129c = ahVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        ((C59052c) ((C59052c) f259127b.mo56224b()).mo56372aa(13100)).mo56386p("AGSA-C OpenDeviceSettingPerformer");
        if (dyVar.f135936b.equals("device.SPRINGBOARD_SETTING")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            try {
                Intent b = C89111e.m144951b(C63490p.m96249a(((C52119fy) m41992m(dwVar, "open_device_setting_args", C52119fy.f136769e.getParserForType())).f136774d));
                if (b == null) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.CANCELLED, "Failed to find intent."));
                }
                b.addFlags(268468224);
                if (!this.f259129c.mo27810d(b, C22695ah.f62473a)) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "Setting activity failed to start."));
                }
                if (((C86124t) this.f259128a.mo27525b()).mo79746e(C90028cg.f248173c)) {
                    return C60856cj.m92900i(C22402a.f61894b);
                }
                return C60856cj.m92900i(C22402a.f61893a);
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f259127b.mo56226d()).mo56382g(e)).mo56372aa(13101)).mo56386p("Failed to get setting id.");
                throw new C22534k();
            }
        } else {
            throw new C22428d(dyVar);
        }
    }
}
