package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d;

import android.graphics.Bitmap;
import com.google.assistant.p3886c.C50843o;
import com.google.assistant.p3886c.C50844p;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.d.c */
/* compiled from: PG */
public final /* synthetic */ class C131653c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C50843o f359710a;

    public /* synthetic */ C131653c(C50843o oVar) {
        this.f359710a = oVar;
    }

    public final Object apply(Object obj) {
        C50843o oVar = this.f359710a;
        C63087y v = C63088z.m96150v();
        ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, v);
        C63088z b = v.mo59165b();
        oVar.copyOnWrite();
        C50844p pVar = (C50844p) oVar.instance;
        C50844p pVar2 = C50844p.f132387m;
        b.getClass();
        pVar.f132389a |= 4;
        pVar.f132392d = b;
        return (C50844p) oVar.build();
    }
}
