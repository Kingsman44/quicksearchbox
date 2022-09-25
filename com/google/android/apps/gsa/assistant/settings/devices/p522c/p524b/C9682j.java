package com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.b.j */
/* compiled from: PG */
final class C9682j implements C22868d {

    /* renamed from: a */
    final /* synthetic */ boolean f33465a;

    /* renamed from: b */
    final /* synthetic */ Boolean f33466b;

    /* renamed from: c */
    final /* synthetic */ Account f33467c;

    /* renamed from: d */
    final /* synthetic */ C9684l f33468d;

    public C9682j(C9684l lVar, boolean z, Boolean bool, Account account) {
        this.f33468d = lVar;
        this.f33465a = z;
        this.f33466b = bool;
        this.f33467c = account;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C9684l.f33469a.mo56225c()).mo56382g(th)).mo56372aa(474)).mo56389s("PR status %s write failed", Boolean.valueOf(this.f33465a));
        C9684l lVar = this.f33468d;
        String str = this.f33467c.name;
        Boolean bool = this.f33466b;
        if (bool == null) {
            lVar.f33473c.remove(str);
        } else {
            lVar.f33473c.put(str, bool);
        }
        lVar.mo17955d(str, bool == null ? lVar.mo17958g() : bool.booleanValue());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        boolean z;
        Void voidR = (Void) obj;
        ((C58970a) ((C58970a) C9684l.f33469a.mo56224b()).mo56372aa(475)).mo56389s("PR status %s write complete", Boolean.valueOf(this.f33465a));
        Boolean bool = this.f33466b;
        if (bool == null) {
            z = this.f33468d.mo17958g();
        } else {
            z = bool.booleanValue();
        }
        if (this.f33465a != z) {
            this.f33468d.mo17955d(this.f33467c.name, this.f33465a);
        }
        this.f33468d.f33474d.ifPresent(new C9675c(this.f33467c.name, this.f33465a));
    }
}
