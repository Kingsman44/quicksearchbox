package com.google.android.gms.p10799g;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.g.b */
/* compiled from: PG */
public final class C144223b implements C144222a {

    /* renamed from: a */
    public static final String f390651a = C144224c.m234460b("FamilyApiMessage");

    /* renamed from: b */
    public final Bundle f390652b;

    static {
        C144224c.m234460b("isDirectAddInvitations");
    }

    public C144223b(String str) {
        Bundle bundle = new Bundle(12);
        this.f390652b = bundle;
        C143919bh.m233969l(str);
        C143919bh.m233969l("agsa");
        bundle.putString(f390651a, "CreateFamilyV2");
        bundle.putString("accountName", str);
        bundle.putString("appId", "agsa");
    }
}
