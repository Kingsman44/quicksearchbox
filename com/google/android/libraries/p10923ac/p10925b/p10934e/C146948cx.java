package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.common.base.C58838bb;
import com.google.protos.p4895aw.p4902b.C64066dv;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.b.e.cx */
/* compiled from: PG */
public final class C146948cx implements C146850at {

    /* renamed from: a */
    private final Account f396678a;

    /* renamed from: b */
    private final C64098p f396679b;

    /* renamed from: c */
    private final C147116m f396680c;

    public C146948cx(Account account, C64098p pVar, C147116m mVar) {
        this.f396678a = account;
        this.f396679b = pVar;
        this.f396680c = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo123762a(String str) {
        C64066dv dvVar;
        C147112i a = this.f396680c.mo123933a(str, this.f396678a, this.f396679b);
        if (a == null) {
            return C146821r.f396380a;
        }
        C64095m e = a.mo123926e();
        C58838bb.m90868c(e.f173285a == 2);
        if (e.f173285a == 2) {
            dvVar = (C64066dv) e.f173286b;
        } else {
            dvVar = C64066dv.f173213e;
        }
        return C146854ax.m239333c(dvVar);
    }
}
