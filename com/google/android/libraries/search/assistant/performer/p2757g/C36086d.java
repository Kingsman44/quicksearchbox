package com.google.android.libraries.search.assistant.performer.p2757g;

import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.d */
/* compiled from: PG */
public final /* synthetic */ class C36086d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36087e f94398a;

    /* renamed from: b */
    public final /* synthetic */ Intent f94399b;

    public /* synthetic */ C36086d(C36087e eVar, Intent intent) {
        this.f94398a = eVar;
        this.f94399b = intent;
    }

    public final Object apply(Object obj) {
        boolean z;
        C36087e eVar = this.f94398a;
        Intent intent = this.f94399b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            z = C144354b.m234631a(eVar.f94400a, intent, AccountData.m234630a((String) optional.get()));
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
