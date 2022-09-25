package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.be */
/* compiled from: PG */
public final class C110346be {
    /* renamed from: a */
    public static final Intent m183748a(Context context, String str) {
        Intent intent = new Intent("com.google.android.apps.photos.CREATE_LA").setPackage("com.google.android.apps.photos");
        if (!TextUtils.isEmpty(str)) {
            C144354b.m234631a(context, intent, C21601a.m40714a(str).f59976a);
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
        return intent;
    }
}
