package com.google.android.libraries.onegoogle.accountmenu.accountlayer;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2348d.C30171a;
import com.google.android.libraries.onegoogle.common.C30923j;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.accountlayer.d */
/* compiled from: PG */
public final class C30295d {

    /* renamed from: a */
    private static final String f81925a = "d";

    /* renamed from: b */
    private final C30158c f81926b;

    public C30295d(C30158c cVar) {
        this.f81926b = cVar;
    }

    /* renamed from: b */
    public static final void m56365b(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), AddAccountActivity.class));
    }

    /* renamed from: c */
    public static final void m56366c(View view) {
        Intent intent = new Intent("android.settings.SYNC_SETTINGS");
        intent.addFlags(32768);
        intent.addFlags(524288);
        view.getContext().startActivity(intent);
    }

    /* renamed from: a */
    public final void mo35820a(View view, Object obj) {
        if (obj == null) {
            Log.d(f81925a, "showMyAccount called with null account");
        } else {
            C30171a.m56062a(C30923j.m57715a(view.getContext()), this.f81926b, obj);
        }
    }
}
