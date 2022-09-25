package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.az */
/* compiled from: PG */
public final /* synthetic */ class C146236az implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f395092a;

    /* renamed from: b */
    public final /* synthetic */ int f395093b;

    /* renamed from: c */
    public final /* synthetic */ C143784ce f395094c;

    /* renamed from: d */
    public final /* synthetic */ int f395095d;

    public /* synthetic */ C146236az(String str, int i, int i2, C143784ce ceVar) {
        this.f395092a = str;
        this.f395093b = i;
        this.f395095d = i2;
        this.f395094c = ceVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f395092a;
        int i = this.f395093b;
        int i2 = this.f395095d;
        C143784ce ceVar = this.f395094c;
        int i3 = C146250bm.f395108a;
        RegisterServiceParams registerServiceParams = new RegisterServiceParams();
        registerServiceParams.f395040a = str;
        registerServiceParams.f395041b = i;
        registerServiceParams.f395042c = i2 - 1;
        registerServiceParams.f395043d = new C146242be(ceVar, (C146010af) obj2);
        ((C146156b) ((C146269e) obj).mo119451G()).mo122715l(registerServiceParams);
    }
}
