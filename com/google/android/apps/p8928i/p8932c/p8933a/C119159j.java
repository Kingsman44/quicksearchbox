package com.google.android.apps.p8928i.p8932c.p8933a;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.p8928i.p8932c.p8935c.C119164b;

/* renamed from: com.google.android.apps.i.c.a.j */
/* compiled from: PG */
public final class C119159j {

    /* renamed from: a */
    public static final String f332328a;

    /* renamed from: b */
    public static final String f332329b = C119164b.m197875a("extra.SETTINGS_SECTION");

    /* renamed from: c */
    public static final String f332330c = C119164b.m197875a("BLOCKED_CONTACTS");

    /* renamed from: d */
    public static final String f332331d = C119164b.m197875a("extra.SETTINGS_ACCOUNT_ID");

    /* renamed from: e */
    private static final ComponentName f332332e;

    static {
        String a = C119164b.m197875a("ExternalCallActivity");
        f332328a = a;
        f332332e = new ComponentName("com.google.android.apps.tachyon", a);
    }

    /* renamed from: a */
    public static Intent m197873a(String str) {
        Intent intent = new Intent("com.google.android.apps.tachyon.action.OPEN_SETTINGS");
        intent.setComponent(f332332e);
        intent.putExtra(f332331d, str);
        return intent;
    }
}
