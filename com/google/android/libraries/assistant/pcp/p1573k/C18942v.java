package com.google.android.libraries.assistant.pcp.p1573k;

import android.graphics.Bitmap;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.pcp.k.v */
/* compiled from: PG */
public final /* synthetic */ class C18942v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f53245a;

    /* renamed from: b */
    public final /* synthetic */ C51011db f53246b;

    public /* synthetic */ C18942v(Bitmap bitmap, C51011db dbVar) {
        this.f53245a = bitmap;
        this.f53246b = dbVar;
    }

    public final Object call() {
        Bitmap bitmap = this.f53245a;
        C51011db dbVar = this.f53246b;
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
