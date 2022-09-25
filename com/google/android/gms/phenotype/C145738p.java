package com.google.android.gms.phenotype;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: com.google.android.gms.phenotype.p */
/* compiled from: PG */
public final class C145738p {
    @Deprecated

    /* renamed from: a */
    public static final C143841m f394058a;

    /* renamed from: b */
    private static final C143840l f394059b;

    /* renamed from: c */
    private static final C143707a f394060c;

    static {
        C143840l lVar = new C143840l();
        f394059b = lVar;
        C145737o oVar = new C145737o();
        f394060c = oVar;
        f394058a = new C143841m("Phenotype.API", oVar, lVar);
    }

    /* renamed from: a */
    public static Uri m237002a(String str) {
        return C31676o.m59019a(str);
    }

    /* renamed from: b */
    public static C145748z m237003b(Context context) {
        return new C145748z(context);
    }
}
