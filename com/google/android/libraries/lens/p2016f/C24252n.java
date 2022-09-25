package com.google.android.libraries.lens.p2016f;

import com.google.common.base.C58810aa;
import com.google.lens.p4707j.C62469cs;
import com.google.lens.p4707j.C62470ct;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56749ac;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56750ad;

/* renamed from: com.google.android.libraries.lens.f.n */
/* compiled from: PG */
class C24252n extends C58810aa {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17535b(Object obj) {
        C62470ct ctVar = (C62470ct) obj;
        C56749ac acVar = (C56749ac) C56750ad.f151449d.createBuilder();
        if ((ctVar.f168672a & 1) != 0) {
            String str = ctVar.f168673b;
            acVar.copyOnWrite();
            C56750ad adVar = (C56750ad) acVar.instance;
            str.getClass();
            adVar.f151451a |= 2;
            adVar.f151453c = str;
        }
        if ((ctVar.f168672a & 2) != 0) {
            String str2 = ctVar.f168674c;
            acVar.copyOnWrite();
            C56750ad adVar2 = (C56750ad) acVar.instance;
            str2.getClass();
            adVar2.f151451a |= 1;
            adVar2.f151452b = str2;
        }
        return (C56750ad) acVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17536c(Object obj) {
        C56750ad adVar = (C56750ad) obj;
        C62469cs csVar = (C62469cs) C62470ct.f168670e.createBuilder();
        if ((adVar.f151451a & 1) != 0) {
            String str = adVar.f151452b;
            csVar.copyOnWrite();
            C62470ct ctVar = (C62470ct) csVar.instance;
            str.getClass();
            ctVar.f168672a |= 2;
            ctVar.f168674c = str;
        }
        if ((adVar.f151451a & 2) != 0) {
            String str2 = adVar.f151453c;
            csVar.copyOnWrite();
            C62470ct ctVar2 = (C62470ct) csVar.instance;
            str2.getClass();
            ctVar2.f168672a |= 1;
            ctVar2.f168673b = str2;
        }
        return (C62470ct) csVar.build();
    }
}
