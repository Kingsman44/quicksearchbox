package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.a */
/* compiled from: PG */
public final /* synthetic */ class C16305a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16307c f47990a;

    /* renamed from: b */
    public final /* synthetic */ String f47991b;

    public /* synthetic */ C16305a(C16307c cVar, String str) {
        this.f47990a = cVar;
        this.f47991b = str;
    }

    public final C60870cx apply(Object obj) {
        C16307c cVar = this.f47990a;
        String str = this.f47991b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C16330ad adVar = (C16330ad) axVar.mo56107c();
            int i = adVar.f48068b;
            if (i == 4) {
                return cVar.mo22881a((String) adVar.f48069c);
            }
            if (i == 7) {
                cVar.f47995c.mo24211f((C52560wg) adVar.f48069c, Optional.empty(), Optional.empty());
                return C60866ct.f164955a;
            }
        }
        return C60856cj.m92899h(new IllegalArgumentException(String.format("Suggestion with id: %s can not be direct fulfilled", new Object[]{str})));
    }
}
