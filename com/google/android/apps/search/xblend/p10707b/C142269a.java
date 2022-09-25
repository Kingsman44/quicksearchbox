package com.google.android.apps.search.xblend.p10707b;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.xblend.p10708c.C142272b;
import com.google.android.libraries.search.p3025k.C38561o;
import com.google.apps.tiktok.account.AccountId;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.xblend.b.a */
/* compiled from: PG */
public final class C142269a extends C38561o {

    /* renamed from: a */
    private final AccountId f385975a;

    /* renamed from: b */
    private final Context f385976b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C142269a(Optional optional, Fragment fragment, AccountId accountId, Context context) {
        super(optional, fragment, 3);
        C69664n.m101061g(optional, "fragmentIncognitoCheckerOptional");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(context, "context");
        this.f385975a = accountId;
        this.f385976b = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo41488a(Object obj) {
        C142272b bVar = (C142272b) obj;
        C69664n.m101061g(bVar, "xPaneParams");
        return C142270b.m230999a(this.f385976b, this.f385975a, bVar);
    }
}
