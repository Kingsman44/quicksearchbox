package com.google.android.libraries.search.assistant.notification.p2711b;

import androidx.core.app.C1788ae;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.c */
/* compiled from: PG */
public final /* synthetic */ class C34855c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C34860h f92437a;

    /* renamed from: b */
    public final /* synthetic */ C1788ae f92438b;

    public /* synthetic */ C34855c(C34860h hVar, C1788ae aeVar) {
        this.f92437a = hVar;
        this.f92438b = aeVar;
    }

    public final C60870cx apply(Object obj) {
        CharSequence charSequence;
        C34860h hVar = this.f92437a;
        C1788ae aeVar = this.f92438b;
        Optional optional = (Optional) obj;
        if ((optional.isPresent() && !C58837ba.m90859h((String) optional.get())) || (charSequence = aeVar.f5575b.f5630a) == null || aeVar.f5576c == null) {
            return C60856cj.m92900i(optional);
        }
        return hVar.f92451c.mo39536c(charSequence.toString(), hVar.f92454f);
    }
}
