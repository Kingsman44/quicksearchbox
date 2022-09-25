package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.C143842n;
import com.google.android.libraries.mdi.p2213d.p2219c.C28622a;
import com.google.android.libraries.mdi.p2213d.p2219c.C28682k;
import com.google.android.libraries.mdi.p2213d.p2219c.p2220a.C28623a;
import com.google.android.libraries.onegoogle.owners.C30968c;
import com.google.android.libraries.onegoogle.p2344a.C30155a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.s */
/* compiled from: PG */
final class C31004s {

    /* renamed from: a */
    public final Context f83499a;

    /* renamed from: b */
    private final C28682k f83500b;

    public C31004s(C28682k kVar, Context context) {
        this.f83500b = kVar;
        this.f83499a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo36680a(C31003r rVar, String str, int i) {
        C47633f h = C47633f.m84733g(rVar.mo36676a(this.f83500b.mo34308a(new Account(str, "com.google")), new C28622a(((Boolean) C30155a.m56016a(this.f83499a, new C30997l(this), false)).booleanValue()), C30968c.m57808a(i))).mo51513e(C28623a.class, C30998m.f83495a, C60826bg.f164896a).mo51514f(C143842n.class, C30999n.f83496a, C60826bg.f164896a).mo51514f(IOException.class, C31000o.f83497a, C60826bg.f164896a).mo51515h(C31001p.f83498a, C60826bg.f164896a);
        C31002q qVar = new C31002q();
        C60856cj.m92911t(h, C47810es.m84974n(qVar), C60826bg.f164896a);
        return h;
    }
}
