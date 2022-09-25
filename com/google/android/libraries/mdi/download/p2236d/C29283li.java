package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.li */
/* compiled from: PG */
public final /* synthetic */ class C29283li implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79353a;

    /* renamed from: b */
    public final /* synthetic */ long f79354b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f79355c;

    public /* synthetic */ C29283li(C29290lp lpVar, long j, C29398ev evVar) {
        this.f79353a = lpVar;
        this.f79354b = j;
        this.f79355c = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79353a;
        long j = this.f79354b;
        C29398ev evVar = this.f79355c;
        C29402ez ezVar = (C29402ez) obj;
        if (j <= ezVar.f79717e) {
            return C60856cj.m92900i(true);
        }
        C29401ey eyVar = (C29401ey) ezVar.toBuilder();
        eyVar.copyOnWrite();
        C29402ez ezVar2 = (C29402ez) eyVar.instance;
        ezVar2.f79713a |= 8;
        ezVar2.f79717e = j;
        return lpVar.f79387c.mo34622g(evVar, (C29402ez) eyVar.build());
    }
}
