package com.google.android.libraries.lens.view.p2093d;

import androidx.lifecycle.C2333ah;

/* renamed from: com.google.android.libraries.lens.view.d.c */
/* compiled from: PG */
public final /* synthetic */ class C25754c implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C25752a f70015a;

    /* renamed from: b */
    public final /* synthetic */ C25758g f70016b;

    public /* synthetic */ C25754c(C25752a aVar, C25758g gVar) {
        this.f70015a = aVar;
        this.f70016b = gVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C25752a aVar = this.f70015a;
        C25758g gVar = this.f70016b;
        Boolean bool = (Boolean) obj;
        boolean z = false;
        if (((Boolean) aVar.mo3842a()).booleanValue() && bool.booleanValue()) {
            z = true;
        }
        if (z != ((Boolean) gVar.mo3842a()).booleanValue()) {
            gVar.mo5708l(Boolean.valueOf(z));
        }
    }
}
