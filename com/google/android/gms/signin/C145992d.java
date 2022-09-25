package com.google.android.gms.signin;

import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.Scope;

/* renamed from: com.google.android.gms.signin.d */
/* compiled from: PG */
public final class C145992d {

    /* renamed from: a */
    public static final C143840l f394665a;

    /* renamed from: b */
    public static final C143840l f394666b;

    /* renamed from: c */
    public static final C143707a f394667c;

    /* renamed from: d */
    static final C143707a f394668d;

    /* renamed from: e */
    public static final C143841m f394669e;

    static {
        C143840l lVar = new C143840l();
        f394665a = lVar;
        C143840l lVar2 = new C143840l();
        f394666b = lVar2;
        C145989a aVar = new C145989a();
        f394667c = aVar;
        C145990b bVar = new C145990b();
        f394668d = bVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f394669e = new C143841m("SignIn.API", aVar, lVar);
        new C143841m("SignIn.INTERNAL_API", bVar, lVar2);
    }
}
