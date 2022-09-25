package com.google.android.libraries.accountlinking.p10974a.p10978d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.libraries.accountlinking.a.d.c */
/* compiled from: PG */
public final class C147369c {

    /* renamed from: a */
    public static final /* synthetic */ int f397812a = 0;

    /* renamed from: b */
    private static final Intent f397813b = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    /* renamed from: a */
    public static C58833ax m240283a(Context context) {
        C58431eu f = C58431eu.m89654f(context.getPackageManager().queryIntentActivities(f397813b, 131136));
        return C58557jl.m90122c(f.mo55248h(), C147367a.f397810a).mo56106b(C147368b.f397811a);
    }
}
