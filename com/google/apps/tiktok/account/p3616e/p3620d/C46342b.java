package com.google.apps.tiktok.account.p3616e.p3620d;

import android.content.Context;
import com.google.apps.tiktok.account.data.manager.C46242ao;
import com.google.apps.tiktok.account.data.manager.C46243ap;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46339a;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46341c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.account.e.d.b */
/* compiled from: PG */
public final class C46342b implements C46242ao {

    /* renamed from: a */
    private final Context f121335a;

    public C46342b(Context context) {
        this.f121335a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo50295a(MessageLite messageLite, C46243ap apVar) {
        C46341c cVar = (C46341c) messageLite;
        String packageName = this.f121335a.getPackageName();
        apVar.f121219b.add(packageName);
        int i = apVar.f121218a.getInt("key.".concat(String.valueOf(packageName)), -1);
        if (i >= 0) {
            C46339a aVar = (C46339a) cVar.toBuilder();
            aVar.mo50321a(packageName, i);
            cVar = (C46341c) aVar.build();
        }
        return C60856cj.m92900i(cVar);
    }
}
