package com.google.android.gms.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.internal.C143641i;
import com.google.android.gms.clearcut.internal.C143654v;
import com.google.android.gms.common.internal.C143919bh;
import com.google.common.base.C58881cr;
import java.util.EnumSet;

/* renamed from: com.google.android.gms.clearcut.h */
/* compiled from: PG */
public final class C143631h {

    /* renamed from: a */
    private final Context f389422a;

    /* renamed from: b */
    private final String f389423b;

    /* renamed from: c */
    private final C58881cr f389424c = C143630g.f389421a;

    /* renamed from: d */
    private EnumSet f389425d = C143624ae.f389411e;

    public C143631h(Context context, String str) {
        C143919bh.m233958a(context);
        this.f389422a = context;
        C143919bh.m233969l(str);
        this.f389423b = str;
    }

    /* renamed from: a */
    public final C143658k mo118952a() {
        C143658k.m233378j(this.f389425d, (String) null);
        Context context = this.f389422a;
        return new C143658k(context, this.f389423b, (String) null, this.f389425d, new C143641i(context, this.f389424c), new C143654v(this.f389422a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo118953b(EnumSet enumSet) {
        C143919bh.m233958a(enumSet);
        this.f389425d = enumSet;
        C143658k.m233377i(enumSet);
    }
}
