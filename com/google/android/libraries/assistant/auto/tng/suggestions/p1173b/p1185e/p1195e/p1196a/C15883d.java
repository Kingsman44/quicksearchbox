package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1195e.p1196a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16358be;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.e.a.d */
/* compiled from: PG */
public final /* synthetic */ class C15883d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f47161a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f47162b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f47163c;

    public /* synthetic */ C15883d(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f47161a = cxVar;
        this.f47162b = cxVar2;
        this.f47163c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f47161a;
        C60870cx cxVar2 = this.f47162b;
        C60870cx cxVar3 = this.f47163c;
        C16358be beVar = (C16358be) C16359bf.f48152f.createBuilder();
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        beVar.copyOnWrite();
        C16359bf bfVar = (C16359bf) beVar.instance;
        bfVar.f48154a |= 1;
        bfVar.f48155b = booleanValue;
        String str = (String) C60856cj.m92909r(cxVar2);
        beVar.copyOnWrite();
        C16359bf bfVar2 = (C16359bf) beVar.instance;
        str.getClass();
        bfVar2.f48154a |= 2;
        bfVar2.f48156c = str;
        boolean booleanValue2 = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        beVar.copyOnWrite();
        C16359bf bfVar3 = (C16359bf) beVar.instance;
        bfVar3.f48154a |= 16;
        bfVar3.f48158e = booleanValue2;
        C16359bf bfVar4 = (C16359bf) beVar.build();
        C59104x b = C15885f.f47166a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SettingsPublisher");
        ((C59052c) ((C59052c) b).mo56372aa(46485)).mo56389s("Settings context is %s.", bfVar4);
        return bfVar4;
    }
}
