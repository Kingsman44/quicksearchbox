package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.ao */
/* compiled from: PG */
public final /* synthetic */ class C146225ao implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f395073a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f395074b;

    /* renamed from: c */
    public final /* synthetic */ C143784ce f395075c;

    /* renamed from: d */
    public final /* synthetic */ int f395076d;

    public /* synthetic */ C146225ao(String str, byte[] bArr, int i, C143784ce ceVar) {
        this.f395073a = str;
        this.f395074b = bArr;
        this.f395076d = i;
        this.f395075c = ceVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f395073a;
        byte[] bArr = this.f395074b;
        int i = this.f395076d;
        C143784ce ceVar = this.f395075c;
        int i2 = C146250bm.f395108a;
        SetStateParams setStateParams = new SetStateParams();
        setStateParams.f395051a = str;
        setStateParams.f395052b = bArr;
        setStateParams.f395053c = i - 1;
        setStateParams.f395054d = new C146242be(ceVar, (C146010af) obj2);
        ((C146156b) ((C146269e) obj).mo119451G()).mo122718o(setStateParams);
    }
}
