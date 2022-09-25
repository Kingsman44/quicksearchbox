package com.google.android.apps.gsa.search.core.p6841s;

import android.accounts.Account;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.s.b */
/* compiled from: PG */
final class C86583b extends C86586e {

    /* renamed from: a */
    final /* synthetic */ C86589h f233906a;

    /* renamed from: b */
    final /* synthetic */ Account f233907b;

    /* renamed from: c */
    final /* synthetic */ C86590i f233908c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86583b(C86590i iVar, C86589h hVar, Account account) {
        super(iVar);
        this.f233908c = iVar;
        this.f233906a = hVar;
        this.f233907b = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        C58976aa aaVar = C58975e.f156826a;
        C86590i iVar = this.f233908c;
        return iVar.f233929g.mo80201a(this.f233907b, new C86585d(iVar, this.f233906a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            this.f233908c.mo80205a(this.f233907b, this.f233906a, bool.booleanValue());
        }
    }
}
