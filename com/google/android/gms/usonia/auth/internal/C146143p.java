package com.google.android.gms.usonia.auth.internal;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.gms.tasks.C146046z;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.gms.usonia.auth.internal.p */
/* compiled from: PG */
final class C146143p implements C146025e {

    /* renamed from: a */
    final /* synthetic */ C146145r f394887a;

    public C146143p(C146145r rVar) {
        this.f394887a = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo37294a(C146006ab abVar) {
        try {
            this.f394887a.f394893c.mo122677e((byte[]) abVar.mo122488g());
            this.f394887a.mo122693i();
            return null;
        } catch (C146046z e) {
            this.f394887a.f394893c.mo122676d();
            ((C59052c) ((C59052c) ((C59052c) C146145r.f394889a.mo56225c()).mo56382g(e)).mo56372aa(42055)).mo56386p("Failed to sign app certificate");
            throw e;
        }
    }
}
