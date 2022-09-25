package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.assistant.p4008y.p4009a.C53568ba;
import com.google.assistant.p4008y.p4009a.C53569bb;
import com.google.assistant.p4008y.p4009a.C53592by;
import com.google.assistant.p4008y.p4009a.C53593bz;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.c */
/* compiled from: PG */
public final /* synthetic */ class C109404c implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ String[] f304699a;

    /* renamed from: b */
    public final /* synthetic */ String[] f304700b;

    /* renamed from: c */
    public final /* synthetic */ String[] f304701c;

    public /* synthetic */ C109404c(String[] strArr, String[] strArr2, String[] strArr3) {
        this.f304699a = strArr;
        this.f304700b = strArr2;
        this.f304701c = strArr3;
    }

    public final Object apply(int i) {
        String[] strArr = this.f304699a;
        String[] strArr2 = this.f304700b;
        String[] strArr3 = this.f304701c;
        C53592by byVar = (C53592by) C53593bz.f140658j.createBuilder();
        String str = strArr[i];
        byVar.copyOnWrite();
        C53593bz bzVar = (C53593bz) byVar.instance;
        str.getClass();
        bzVar.f140660a |= 2;
        bzVar.f140662c = str;
        String str2 = strArr2[i];
        byVar.copyOnWrite();
        C53593bz bzVar2 = (C53593bz) byVar.instance;
        str2.getClass();
        bzVar2.f140660a |= 1;
        bzVar2.f140661b = str2;
        C53568ba baVar = (C53568ba) C53569bb.f140594i.createBuilder();
        String str3 = strArr2[i];
        baVar.copyOnWrite();
        C53569bb bbVar = (C53569bb) baVar.instance;
        str3.getClass();
        bbVar.f140596a |= 1;
        bbVar.f140597b = str3;
        baVar.copyOnWrite();
        C53569bb bbVar2 = (C53569bb) baVar.instance;
        bbVar2.f140599d = 5;
        bbVar2.f140596a |= 4;
        String str4 = strArr3[i];
        baVar.copyOnWrite();
        C53569bb bbVar3 = (C53569bb) baVar.instance;
        str4.getClass();
        bbVar3.f140596a |= 2;
        bbVar3.f140598c = str4;
        C53569bb bbVar4 = (C53569bb) baVar.build();
        byVar.copyOnWrite();
        C53593bz bzVar3 = (C53593bz) byVar.instance;
        bbVar4.getClass();
        bzVar3.f140667h = bbVar4;
        bzVar3.f140660a |= 64;
        return (C53593bz) byVar.build();
    }
}
