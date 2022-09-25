package com.google.android.apps.gsa.assist.p507f.p508a;

import android.content.Intent;
import com.google.android.apps.gsa.assist.p503c.C9389b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90016bv;

/* renamed from: com.google.android.apps.gsa.assist.f.a.c */
/* compiled from: PG */
public final class C9414c {

    /* renamed from: a */
    private final C9413b f32712a;

    /* renamed from: b */
    private final C86124t f32713b;

    public C9414c(C9413b bVar, C86124t tVar) {
        this.f32712a = bVar;
        this.f32713b = tVar;
    }

    /* renamed from: a */
    public final Intent mo17671a() {
        Intent intent;
        this.f32712a.f32704b = true;
        if (this.f32713b.mo79746e(C90016bv.f247858e)) {
            intent = C9389b.f32554b.mo83277a(new Intent());
        } else {
            intent = C9389b.f32553a.mo83277a(new Intent());
        }
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 1).setAction("android.intent.action.VIEW").setPackage("com.google.android.googlequicksearchbox");
        return intent;
    }
}
