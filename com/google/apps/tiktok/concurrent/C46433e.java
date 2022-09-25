package com.google.apps.tiktok.concurrent;

import android.content.Intent;
import com.google.android.libraries.p11012aj.C147596b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.concurrent.e */
/* compiled from: PG */
public final /* synthetic */ class C46433e implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C46459k f121508a;

    public /* synthetic */ C46433e(C46459k kVar) {
        this.f121508a = kVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        String str;
        C46459k kVar = this.f121508a;
        String b = C147596b.m240671b();
        if (kVar.f121569f.mo124374a()) {
            str = "main_process_service_key";
        } else {
            str = b.substring(b.lastIndexOf(":") + 1);
        }
        C58838bb.m90866a(str, "Couldn't get the current process name.");
        C58838bb.m90887v(kVar.f121567d.containsKey(str), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", str);
        return new Intent(kVar.f121566c, (Class) ((C69464a) kVar.f121567d.get(str)).mo17428b());
    }
}
