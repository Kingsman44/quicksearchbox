package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.telephony.PhoneNumberUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.e */
/* compiled from: PG */
public final /* synthetic */ class C14875e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C14878h f44762a;

    /* renamed from: b */
    public final /* synthetic */ String f44763b;

    public /* synthetic */ C14875e(C14878h hVar, String str) {
        this.f44762a = hVar;
        this.f44763b = str;
    }

    public final Object apply(Object obj) {
        C14878h hVar = this.f44762a;
        String str = this.f44763b;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            Optional c = hVar.f44774i.mo22277c();
            if (!c.isPresent() || !PhoneNumberUtils.compare(str, (String) c.get())) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                hVar.f44769d.put(str, hVar.f44773h.getResources().getString(R.string.voicemail_contact_name));
            }
            return C14782b.SUCCESS;
        }
        String str2 = ((C14636z) guVar.get(0)).f44232a;
        if (!str2.isEmpty()) {
            C58976aa aaVar2 = C58975e.f156826a;
            hVar.f44769d.put(str, str2);
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
        }
        return C14782b.SUCCESS;
    }
}
