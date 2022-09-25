package com.google.android.libraries.storage.protostore;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.storage.protostore.e */
/* compiled from: PG */
public final /* synthetic */ class C42991e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C43006i f112434a;

    /* renamed from: b */
    public final /* synthetic */ String f112435b;

    public /* synthetic */ C42991e(C43006i iVar, String str) {
        this.f112434a = iVar;
        this.f112435b = str;
    }

    public final C60870cx apply(Object obj) {
        C43006i iVar = this.f112434a;
        String str = this.f112435b;
        Intent intent = new Intent();
        intent.setAction("com.google.android.libraries.storage.protostore.SIGNAL_ACTION");
        intent.setData((Uri) obj);
        intent.setPackage(iVar.f112466c);
        intent.setFlags(268435456);
        if (str != null) {
            intent.putExtra("sender_id", str);
        }
        C43005h hVar = new C43005h();
        iVar.f112465b.sendOrderedBroadcast(intent, (String) null, hVar, iVar.f112468e, -1, (String) null, (Bundle) null);
        return C60856cj.m92908q(hVar.f112463a, 10, C43006i.f112464a, iVar.f112469f);
    }
}
