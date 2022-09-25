package com.google.android.apps.gsa.p8839t.p8847h;

import android.graphics.Bitmap;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.t.h.l */
/* compiled from: PG */
public final /* synthetic */ class C118436l implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f328738a;

    /* renamed from: b */
    public final /* synthetic */ C51011db f328739b;

    public /* synthetic */ C118436l(Bitmap bitmap, C51011db dbVar) {
        this.f328738a = bitmap;
        this.f328739b = dbVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Bitmap bitmap = this.f328738a;
        C51011db dbVar = this.f328739b;
        int i = C118443s.f328767a;
        C63087y v = C63088z.m96150v();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
        C63088z b = v.mo59165b();
        dbVar.copyOnWrite();
        C51012dc dcVar = (C51012dc) dbVar.instance;
        C51012dc dcVar2 = C51012dc.f132813k;
        b.getClass();
        dcVar.f132815a |= 8;
        dcVar.f132819e = b;
        return (C51012dc) dbVar.build();
    }
}
