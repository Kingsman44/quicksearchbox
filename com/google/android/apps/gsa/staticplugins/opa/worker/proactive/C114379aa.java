package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.search.assistant.proactive.surveys.C36348i;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.aa */
/* compiled from: PG */
public final /* synthetic */ class C114379aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114384af f317120a;

    /* renamed from: b */
    public final /* synthetic */ String f317121b;

    /* renamed from: c */
    public final /* synthetic */ String f317122c;

    /* renamed from: d */
    public final /* synthetic */ Intent f317123d;

    public /* synthetic */ C114379aa(C114384af afVar, String str, String str2, Intent intent) {
        this.f317120a = afVar;
        this.f317121b = str;
        this.f317122c = str2;
        this.f317123d = intent;
    }

    public final Object apply(Object obj) {
        C114384af afVar = this.f317120a;
        String str = this.f317121b;
        String str2 = this.f317122c;
        Intent intent = this.f317123d;
        Context context = afVar.f317142d;
        String stringExtra = intent.getStringExtra("ved");
        byte[] byteArrayExtra = intent.getByteArrayExtra("notification-logging-metadata");
        afVar.f317146h.mo28212l("OPA Notification NotUseful Tap", new C114380ab(afVar, ((C36348i) ((C58833ax) afVar.f317150l.mo27525b()).mo56107c()).mo40129a(context, (AccountId) obj, str, str2, stringExtra, byteArrayExtra)));
        return C118826c.f331422a;
    }
}
