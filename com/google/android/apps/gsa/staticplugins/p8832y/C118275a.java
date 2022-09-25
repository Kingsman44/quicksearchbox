package com.google.android.apps.gsa.staticplugins.p8832y;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.y.a */
/* compiled from: PG */
public final /* synthetic */ class C118275a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C118289b f328341a;

    public /* synthetic */ C118275a(C118289b bVar) {
        this.f328341a = bVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118289b bVar = this.f328341a;
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) obj);
        intent.addCategory("android.intent.category.BROWSABLE");
        String b = bVar.f328363b.mo91202a().mo79779b();
        if (b != null) {
            intent.setPackage(b);
        }
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
        intent.putExtra("com.google.android.apps.gsa.customtabs.WITHOUT_CUSTOM_TABS", true);
        return Boolean.valueOf(bVar.f328362a.mo65089a(intent));
    }
}
