package com.google.android.apps.gsa.opa.p6434b;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.knowledge.p4671b.C61820m;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import java.util.Collections;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: com.google.android.apps.gsa.opa.b.a */
/* compiled from: PG */
public final class C83586a {
    /* renamed from: a */
    public static C53271hs m133156a(C85664bo boVar, SharedPreferences sharedPreferences, C86054o oVar, bm bmVar) {
        Set<String> stringSet = sharedPreferences.getStringSet(TextUtils.concat(new CharSequence[]{"opa_zero_state_dismissed_card_types_", oVar.mo79659F(), "_", bmVar.b()}).toString(), Collections.emptySet());
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        String id = TimeZone.getDefault().getID();
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        id.getClass();
        hsVar.f139652a = 1 | hsVar.f139652a;
        hsVar.f139653b = id;
        C61820m c = boVar.mo79191c();
        hpVar.copyOnWrite();
        C53271hs hsVar2 = (C53271hs) hpVar.instance;
        c.getClass();
        hsVar2.f139662k = c;
        hsVar2.f139652a |= 256;
        for (String parseLong : stringSet) {
            long parseLong2 = Long.parseLong(parseLong);
            hpVar.copyOnWrite();
            C53271hs hsVar3 = (C53271hs) hpVar.instance;
            C62964ck ckVar = hsVar3.f139660i;
            if (!ckVar.mo58948c()) {
                hsVar3.f139660i = C62942bv.mutableCopy(ckVar);
            }
            hsVar3.f139660i.mo58929f(parseLong2);
        }
        return (C53271hs) hpVar.build();
    }
}
