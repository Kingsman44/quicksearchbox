package com.google.android.libraries.onegoogle.p2378b.p2379a;

import android.content.Context;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.p297b.C5763ao;
import com.bumptech.glide.load.p297b.C5764ap;
import com.google.android.libraries.onegoogle.p2378b.C30832i;
import com.google.common.base.C58838bb;
import java.util.Collections;

/* renamed from: com.google.android.libraries.onegoogle.b.a.h */
/* compiled from: PG */
final class C30819h implements C5764ap {

    /* renamed from: a */
    private final Context f83150a;

    public C30819h(Context context) {
        this.f83150a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        C30821j jVar = (C30821j) obj;
        C58838bb.m90869d(i == i2, "Width and height must be the same");
        if (i == Integer.MIN_VALUE) {
            i = 120;
        }
        return new C5763ao(jVar, Collections.emptyList(), new C30820i(new C30832i(this.f83150a), jVar, i));
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo11929b(Object obj) {
        return C30832i.m57582b(((C30821j) obj).mo36519b());
    }
}
