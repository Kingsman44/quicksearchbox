package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83954r;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fm */
/* compiled from: PG */
public final class C96217fm extends C83954r {

    /* renamed from: a */
    private final C95299e f269336a;

    /* renamed from: b */
    private final Bundle f269337b;

    public C96217fm(C95299e eVar, Bundle bundle) {
        this.f269336a = eVar;
        this.f269337b = bundle;
    }

    /* renamed from: c */
    private final Intent m159518c(int i) {
        String string;
        Bundle bundle = this.f269337b;
        if (bundle == null || (string = bundle.getString("source_return_url")) == null) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(string).buildUpon().appendQueryParameter("status", String.valueOf(i));
        String string2 = this.f269337b.getString("assistant_device_id");
        if (string2 != null) {
            appendQueryParameter.appendQueryParameter("assistant_device_id", string2);
        }
        String string3 = this.f269337b.getString("gacs_nonce");
        if (string3 != null) {
            appendQueryParameter.appendQueryParameter("jti", string3);
        }
        Intent data = new Intent().setFlags(268435456).setAction("android.intent.action.VIEW").setData(appendQueryParameter.build());
        String string4 = this.f269337b.getString("source_return_package");
        if (string4 != null) {
            data.setPackage(string4);
        }
        return data;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        return C83903bi.m133649e(C83903bi.m133649e(-1, (Intent) null).mo77308b(), m159518c(0));
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return C83903bi.m133649e(C83903bi.m133649e(1, (Intent) null).mo77308b(), m159518c(this.f269336a.f266650e));
    }
}
