package com.google.android.gms.p10799g;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.gms.g.c */
/* compiled from: PG */
public final class C144224c {

    /* renamed from: a */
    private static final ComponentName f390653a = new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.create.FamilyCreationActivity");

    static {
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.DeleteMemberActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.invites.SendInvitationsActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.FamilyManagementActivity");
    }

    /* renamed from: a */
    public static Intent m234459a(C144222a aVar) {
        return new Intent().setComponent(f390653a).putExtras(new Bundle(((C144223b) aVar).f390652b));
    }

    /* renamed from: b */
    public static String m234460b(String str) {
        return "com.google.android.gms.family.".concat(str);
    }
}
