package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.libraries.search.p3055n.C39364bm;
import com.google.android.libraries.search.p3055n.C39365bn;
import com.google.android.libraries.search.p3055n.C39669cw;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.au */
/* compiled from: PG */
public final /* synthetic */ class C120854au implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f336051a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f336052b;

    /* renamed from: c */
    public final /* synthetic */ String f336053c;

    /* renamed from: d */
    public final /* synthetic */ String f336054d;

    public /* synthetic */ C120854au(C60870cx cxVar, C60870cx cxVar2, String str, String str2) {
        this.f336051a = cxVar;
        this.f336052b = cxVar2;
        this.f336053c = str;
        this.f336054d = str2;
    }

    public final Object call() {
        C60870cx cxVar = this.f336051a;
        C60870cx cxVar2 = this.f336052b;
        String str = this.f336053c;
        String str2 = this.f336054d;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        C39669cw cwVar = (C39669cw) C39670cx.f104424a.createBuilder();
        C62940bt btVar = C39365bn.f103661n;
        C39364bm bmVar = (C39364bm) C39365bn.f103660m.createBuilder();
        bmVar.copyOnWrite();
        C39365bn bnVar = (C39365bn) bmVar.instance;
        str.getClass();
        bnVar.f103663a |= 1;
        bnVar.f103666d = str;
        bmVar.copyOnWrite();
        C39365bn bnVar2 = (C39365bn) bmVar.instance;
        bnVar2.f103663a |= 128;
        bnVar2.f103671i = booleanValue;
        bmVar.copyOnWrite();
        C39365bn bnVar3 = (C39365bn) bmVar.instance;
        bnVar3.f103663a |= 256;
        bnVar3.f103672j = booleanValue2;
        bmVar.copyOnWrite();
        C39365bn bnVar4 = (C39365bn) bmVar.instance;
        str2.getClass();
        bnVar4.f103663a |= 64;
        bnVar4.f103670h = str2;
        bmVar.copyOnWrite();
        C39365bn bnVar5 = (C39365bn) bmVar.instance;
        bnVar5.f103673k = 1;
        bnVar5.f103663a |= 512;
        cwVar.mo58885m(btVar, (C39365bn) bmVar.build());
        return (C39670cx) cwVar.build();
    }
}
