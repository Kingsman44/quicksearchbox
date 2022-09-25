package com.google.android.libraries.notifications.platform.p2313e;

import android.content.Context;
import com.google.android.apps.common.p469a.C9017a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.libraries.notifications.platform.e.a */
/* compiled from: PG */
public final class C30090a {

    /* renamed from: a */
    private static volatile C30097b f81421a;

    /* renamed from: a */
    public static C30097b m55914a(Context context) {
        Context applicationContext = context.getApplicationContext();
        try {
            C31760t.m59102i(context);
        } catch (IllegalStateException e) {
            C30058b.m55790b("Gnp", e, "PhenotypeContext.setContext was called more than once", new Object[0]);
        }
        if (applicationContext instanceof C9017a) {
            return (C30097b) ((C9017a) applicationContext).mo17311a();
        }
        try {
            return (C30097b) C47266f.m84076a(context, C30097b.class);
        } catch (IllegalStateException e2) {
            C30058b.m55795g("Gnp", e2, "Couldn't fetch TikTok entry point, ignore if not a TikTok app", new Object[0]);
            throw new NullPointerException("Unable to get GnpComponent from host app: ".concat(String.valueOf(context.getPackageName())));
        }
    }
}
