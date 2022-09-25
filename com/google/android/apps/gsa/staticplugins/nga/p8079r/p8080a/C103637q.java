package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.base.C58817ah;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.q */
/* compiled from: PG */
public final /* synthetic */ class C103637q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C69464a f288694a;

    public /* synthetic */ C103637q(C69464a aVar) {
        this.f288694a = aVar;
    }

    public final Object apply(Object obj) {
        C51303cs csVar = (C51303cs) ((C51334dw) obj).toBuilder();
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        int i = 3;
        dwVar.f133683Y = 3;
        dwVar.f133689c |= 64;
        if (true != ((C90021c) this.f288694a.mo17428b()).mo79746e(C90014bt.f247778na)) {
            i = 2;
        }
        csVar.copyOnWrite();
        C51334dw dwVar2 = (C51334dw) csVar.instance;
        dwVar2.f133684Z = i - 1;
        dwVar2.f133689c |= 128;
        return (C51334dw) csVar.build();
    }
}
