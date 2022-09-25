package com.google.android.libraries.onegoogle.p2378b.p2379a;

import android.content.Context;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.google.android.libraries.onegoogle.owners.C30968c;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.common.base.C58838bb;
import java.util.Collections;

/* renamed from: com.google.android.libraries.onegoogle.b.a.m */
/* compiled from: PG */
final class C30824m implements C5764ap {

    /* renamed from: a */
    public final C31012n f83159a;

    /* renamed from: b */
    private final Context f83160b;

    public C30824m(Context context, C31012n nVar) {
        this.f83160b = context;
        this.f83159a = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        int i3;
        C30821j jVar = (C30821j) obj;
        C58838bb.m90869d(i == i2, "Width and height must be the same");
        if (i == Integer.MIN_VALUE) {
            i3 = 120;
        } else {
            i3 = C30968c.m57809b(this.f83160b, i);
        }
        return new C5763ao(jVar, Collections.emptyList(), new C30823l(this, jVar, i3));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11929b(Object obj) {
        C30821j jVar = (C30821j) obj;
        return jVar.mo36519b().mo36525e() && jVar.mo36519b().mo36523c() != null;
    }
}
