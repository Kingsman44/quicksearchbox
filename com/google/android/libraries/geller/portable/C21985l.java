package com.google.android.libraries.geller.portable;

import android.text.TextUtils;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.libraries.geller.portable.l */
/* compiled from: PG */
public final /* synthetic */ class C21985l implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ Geller f60641a;

    /* renamed from: b */
    public final /* synthetic */ String f60642b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60643c;

    /* renamed from: d */
    public final /* synthetic */ C65768az f60644d;

    public /* synthetic */ C21985l(Geller geller, String str, C65753ak akVar, C65768az azVar) {
        this.f60641a = geller;
        this.f60642b = str;
        this.f60643c = akVar;
        this.f60644d = azVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Geller geller = this.f60641a;
        String str = this.f60642b;
        C65753ak akVar = this.f60643c;
        C65768az azVar = this.f60644d;
        if (TextUtils.isEmpty(str)) {
            return C60856cj.m92899h(new GellerException(C62722b.INVALID_ARGUMENT, "Invalid user."));
        }
        long j = geller.f60381c;
        long a = geller.mo27174a(str);
        String name = akVar.name();
        String[] strArr = {azVar.f178798d};
        C65139d dVar = azVar.f178796b;
        if (dVar == null) {
            dVar = C65139d.f176307e;
        }
        geller.nativeWrite(j, a, name, strArr, dVar.f176310b, azVar.toByteArray());
        return C60866ct.f164955a;
    }
}
