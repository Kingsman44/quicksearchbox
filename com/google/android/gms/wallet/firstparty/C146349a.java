package com.google.android.gms.wallet.firstparty;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.C146379a;
import com.google.android.gms.wallet.shared.C146381c;

/* renamed from: com.google.android.gms.wallet.firstparty.a */
/* compiled from: PG */
public class C146349a {

    /* renamed from: a */
    public final C146381c f395375a;

    /* renamed from: b */
    public final C146379a f395376b;

    /* renamed from: c */
    public final Intent f395377c;

    /* renamed from: d */
    protected final Bundle f395378d;

    public C146349a(Context context, String str, String str2) {
        Intent intent = new Intent();
        this.f395377c = intent;
        intent.setPackage("com.google.android.gms");
        intent.setAction(str);
        Bundle bundle = new Bundle();
        this.f395378d = bundle;
        C146379a aVar = new C146379a(new ApplicationParameters());
        aVar.f395412a.f395398c = bundle;
        this.f395376b = aVar;
        C146381c cVar = new C146381c(new BuyFlowConfig());
        String packageName = context.getPackageName();
        BuyFlowConfig buyFlowConfig = cVar.f395413a;
        buyFlowConfig.f395409c = packageName;
        buyFlowConfig.f395410d = str2;
        this.f395375a = cVar;
    }

    /* renamed from: a */
    public void mo122943a() {
        throw null;
    }
}
