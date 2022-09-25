package com.google.android.libraries.onegoogle.p2378b;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.libraries.p1638aw.p1639a.p1640a.C19582a;
import com.google.android.libraries.p1638aw.p1639a.p1640a.C19583b;
import com.google.android.libraries.p1638aw.p1639a.p1640a.C19584c;
import com.google.android.libraries.p1638aw.p1639a.p1640a.C19589h;
import com.google.android.libraries.p1638aw.p1639a.p1640a.C19590i;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60890dd;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.onegoogle.b.i */
/* compiled from: PG */
public final class C30832i {

    /* renamed from: a */
    private final Context f83170a;

    public C30832i(Context context) {
        this.f83170a = context;
    }

    /* renamed from: b */
    public static boolean m57582b(C30833j jVar) {
        return jVar.mo36525e() && jVar.mo36527f();
    }

    /* renamed from: a */
    public final Bitmap mo36530a(C30833j jVar, int i) {
        C58838bb.m90869d(i >= 0, "Size must be bigger or equal to 0");
        C58838bb.m90869d(m57582b(jVar), "handles(key) must be true");
        if (i == 0) {
            i = 120;
        }
        ArrayList arrayList = new ArrayList();
        if (jVar.mo36524d() != null) {
            arrayList.add(jVar.mo36524d());
        }
        arrayList.add(jVar.mo36522b());
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        C19590i iVar = new C19590i(new C19584c(new C19582a(new C19589h(this.f83170a.getApplicationContext(), new C60890dd())), new C19583b()));
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        iVar.f54525a = C19584c.m37342b(jVar.mo36522b());
        iVar.mo24850c(new C30831h(strArr));
        iVar.mo24848a(createBitmap);
        return createBitmap;
    }
}
