package com.google.android.libraries.assistant.soda.p1605d;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1975k.C24019l;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.common.base.C58881cr;
import com.google.speech.p5218j.C66919ei;

/* renamed from: com.google.android.libraries.assistant.soda.d.i */
/* compiled from: PG */
public final class C19271i {

    /* renamed from: a */
    private final Context f53984a;

    /* renamed from: b */
    private final C143658k f53985b;

    /* renamed from: c */
    private final C24019l f53986c = new C19269g();

    public C19271i(Context context) {
        C143658k a = C143658k.m233373b(context, "SODA_CLEARCUT").mo118952a();
        this.f53984a = context;
        this.f53985b = a;
    }

    /* renamed from: a */
    public final void mo24435a(C66919ei eiVar) {
        if (TextUtils.equals(eiVar.f181911a, "SODA_CLEARCUT")) {
            C143657j jVar = new C143657j(this.f53985b, eiVar.f181912b, (C58881cr) null);
            jVar.f389471m = eiVar.f181911a;
            jVar.f389472n = C24006d.m44596b(this.f53984a, this.f53986c);
            jVar.mo118992a();
        }
    }
}
