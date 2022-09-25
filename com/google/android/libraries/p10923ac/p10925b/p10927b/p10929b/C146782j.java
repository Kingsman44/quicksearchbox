package com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b;

import com.google.android.libraries.p10923ac.p10925b.p10933d.C146822a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.base.C58885cv;
import com.google.common.p4552o.p4566l.C60156bu;
import com.google.common.p4552o.p4566l.C60157bv;
import com.google.common.p4552o.p4566l.C60190da;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.ac.b.b.b.j */
/* compiled from: PG */
public final /* synthetic */ class C146782j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C146783k f396324a;

    /* renamed from: b */
    public final /* synthetic */ C60156bu f396325b;

    /* renamed from: c */
    public final /* synthetic */ String f396326c;

    public /* synthetic */ C146782j(C146783k kVar, C60156bu buVar, String str) {
        this.f396324a = kVar;
        this.f396325b = buVar;
        this.f396326c = str;
    }

    public final C60870cx apply(Object obj) {
        C146783k kVar = this.f396324a;
        C60156bu buVar = this.f396325b;
        String str = this.f396326c;
        Exception exc = (Exception) obj;
        C60190da a = C146784l.m239159a(exc);
        buVar.copyOnWrite();
        C60157bv bvVar = (C60157bv) buVar.instance;
        C60157bv bvVar2 = C60157bv.f162741c;
        bvVar.f162744b = a.getNumber();
        bvVar.f162743a |= 8;
        ((C146822a) kVar.f396328b.mo27525b()).mo123715a((C60157bv) buVar.build());
        ((C147256m) kVar.f396327a.mo27525b()).mo124063f("[Auth] Failed to get token with scope [%s]", exc, str);
        if (((Boolean) new C58885cv(true).f156729a).booleanValue()) {
            boolean booleanValue = ((Boolean) new C58885cv(false).f156729a).booleanValue();
            C60190da a2 = C146784l.m239159a(exc);
            if (!C146784l.f396331a.contains(a2) || (!booleanValue && a2.equals(C60190da.AUTH_INTERNAL_ERROR))) {
                throw exc;
            }
            throw new C146776d(exc);
        }
        throw exc;
    }
}
