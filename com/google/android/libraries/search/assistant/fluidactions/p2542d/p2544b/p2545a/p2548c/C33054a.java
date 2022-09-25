package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2548c;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33110f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52483tk;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.c.a */
/* compiled from: PG */
public final class C33054a implements C33110f {
    /* renamed from: a */
    public final C60870cx mo38501a(Context context, C51953ff ffVar, C52507uh uhVar, Optional optional, C33108d dVar) {
        C52483tk tkVar;
        if (uhVar.f137840a.size() != 1) {
            dVar.mo38533b().mo38549b(18);
            return C60856cj.m92900i(Optional.empty());
        }
        ArrayList arrayList = new ArrayList();
        C52490tr trVar = (C52490tr) C58557jl.m90133n(uhVar.f137840a);
        if (trVar.f137798b == 17) {
            tkVar = (C52483tk) trVar.f137799c;
        } else {
            tkVar = C52483tk.f137766c;
        }
        C52115fu fuVar = tkVar.f137769b;
        if (fuVar == null) {
            fuVar = C52115fu.f136753n;
        }
        arrayList.add(C33116d.m61446e("device.MODIFY_SETTING", fuVar, "modify_setting_args", "assistant.api.client_op.ModifySettingArgs"));
        dVar.mo38533b().mo38549b(18);
        return C60856cj.m92900i(Optional.m71637of(C33118f.m61461b(arrayList, C58733pz.f156496a, dVar.mo38534c())));
    }
}
