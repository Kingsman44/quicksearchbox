package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.mdi.download.C28703ai;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.p */
/* compiled from: PG */
public final /* synthetic */ class C104119p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f289638a;

    public /* synthetic */ C104119p(C58495hd hdVar) {
        this.f289638a = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58495hd hdVar = this.f289638a;
        C28706al alVar = (C28706al) obj;
        C58974d dVar = C104123t.f289645a;
        C28703ai aiVar = (C28703ai) alVar.toBuilder();
        String str = alVar.f77979b;
        String str2 = (String) hdVar.getOrDefault(str, str);
        aiVar.copyOnWrite();
        C28706al alVar2 = (C28706al) aiVar.instance;
        str2.getClass();
        alVar2.f77978a |= 1;
        alVar2.f77979b = str2;
        return (C28706al) aiVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
