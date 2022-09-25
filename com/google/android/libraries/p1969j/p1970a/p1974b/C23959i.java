package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1973b.C23940a;
import com.google.common.base.C58838bb;
import com.google.common.base.C58851bo;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import p5304e.p5305a.p5306a.p5388m.p5389a.C68820a;

/* renamed from: com.google.android.libraries.j.a.b.i */
/* compiled from: PG */
public final class C23959i {

    /* renamed from: a */
    public static final C59071e f65515a = C59071e.m91332i("com.google.android.libraries.j.a.b.i");

    /* renamed from: b */
    public static C23957g f65516b;

    /* renamed from: c */
    public static C147488c f65517c;

    /* renamed from: d */
    private final C23948af f65518d = new C23948af();

    /* renamed from: a */
    public final void mo29370a(Context context, Account account, C55912b bVar, C55960bg bgVar, C23958h hVar) {
        C23953c a = C23952b.m44541a(context, Integer.valueOf(C58851bo.f156649a.nextInt()), bgVar, account, bVar);
        a.mo29366b(2);
        C58838bb.m90866a(f65516b, "You should use ConsentFlow.setGrpcChannelFactory to set the desired network stack");
        if (C68820a.m99375e() || C68820a.m99374d()) {
            C58838bb.m90866a(f65517c, "Did you call ConsentFlow.setGmsCoreFacsCacheFactory?");
        }
        C60856cj.m92911t(this.f65518d.mo29362b(context, account, bVar, C23940a.m44522a(context).toLanguageTag(), bgVar, true), new C23956f(a, hVar), C60826bg.f164896a);
    }
}
