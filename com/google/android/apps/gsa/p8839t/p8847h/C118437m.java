package com.google.android.apps.gsa.p8839t.p8847h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.t.h.m */
/* compiled from: PG */
public final /* synthetic */ class C118437m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C51011db f328740a;

    public /* synthetic */ C118437m(C51011db dbVar) {
        this.f328740a = dbVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C51011db dbVar = this.f328740a;
        Drawable drawable = (Drawable) obj;
        int i = C118443s.f328767a;
        if (drawable instanceof BitmapDrawable) {
            C58976aa aaVar = C58975e.f156826a;
            C63087y v = C63088z.m96150v();
            ((BitmapDrawable) drawable).getBitmap().compress(Bitmap.CompressFormat.PNG, 100, v);
            C63088z b = v.mo59165b();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            C51012dc dcVar2 = C51012dc.f132813k;
            b.getClass();
            dcVar.f132815a |= 8;
            dcVar.f132819e = b;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        return (C51012dc) dbVar.build();
    }
}
