package com.google.android.gms.usagereporting;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;

/* renamed from: com.google.android.gms.usagereporting.p */
/* compiled from: PG */
public final class C146104p {
    @Deprecated

    /* renamed from: a */
    public static final C143841m f394826a;

    /* renamed from: b */
    private static final C143840l f394827b;

    /* renamed from: c */
    private static final C143707a f394828c;

    static {
        C143840l lVar = new C143840l();
        f394827b = lVar;
        C146100l lVar2 = new C146100l();
        f394828c = lVar2;
        f394826a = new C143841m("UsageReporting.API", lVar2, lVar);
    }

    /* renamed from: a */
    public static boolean m237970a(Context context) {
        if (!context.getPackageManager().queryIntentServices(new Intent("com.google.android.gms.usagereporting.service.START").setPackage("com.google.android.gms"), 0).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C146098j m237971b(Context context) {
        return new C146098j(context, new C146103o());
    }
}
