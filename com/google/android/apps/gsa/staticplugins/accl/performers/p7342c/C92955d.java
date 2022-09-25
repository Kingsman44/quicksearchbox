package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52123gb;
import com.google.assistant.p3897e.p3921j.C52124gc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.d */
/* compiled from: PG */
public final class C92955d extends C22538o {

    /* renamed from: a */
    public static final C59071e f259305a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.c.d");

    /* renamed from: b */
    public final C92934ai f259306b;

    /* renamed from: c */
    private final C22871g f259307c;

    public C92955d(C92934ai aiVar, C22871g gVar) {
        this.f259306b = aiVar;
        this.f259307c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C59071e eVar2 = f259305a;
        ((C59052c) ((C59052c) eVar2.mo56224b()).mo56372aa(13228)).mo56386p("enter devicePower performer.");
        int i = 1;
        if (dyVar.f135936b.equals("device.POWER")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52124gc gcVar = (C52124gc) m41992m(dwVar, "device_setting_params", C52124gc.f136780c.getParserForType());
            if ((gcVar.f136782a & 1) != 0) {
                int a = C52123gb.m86512a(gcVar.f136783b);
                if (a != 0) {
                    i = a;
                }
                if (i == 2 || i == 3) {
                    C22871g gVar = this.f259307c;
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "show_global_actions");
                    return gVar.mo28210j(C2169h.m6027a(new C92952b(this, bundle)), "Check if setUiHints is succeed", C92954c.f259304a);
                }
                ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(13229)).mo56386p("Unable to do power control, only support power off or restart state.");
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unable to do power control: only support power off state."));
            }
            ((C59052c) ((C59052c) eVar2.mo56226d()).mo56372aa(13230)).mo56386p("Unable to do power control: no state fund.");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unable to do power control: no state fund."));
        }
        return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.POWER", dyVar.f135936b})));
    }
}
