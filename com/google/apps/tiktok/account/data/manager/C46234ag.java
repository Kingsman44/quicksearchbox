package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Collection;

/* renamed from: com.google.apps.tiktok.account.data.manager.ag */
/* compiled from: PG */
final class C46234ag extends C46325t {

    /* renamed from: a */
    public final C46302j f121206a;

    /* renamed from: b */
    private final C46301i f121207b;

    public C46234ag(C46301i iVar, C46302j jVar) {
        this.f121207b = iVar;
        this.f121206a = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo50281a(AccountId accountId) {
        return this.f121206a.mo50273b(accountId);
    }

    /* renamed from: b */
    public final C60870cx mo50282b(AccountId accountId) {
        return this.f121206a.mo50274c(accountId);
    }

    /* renamed from: c */
    public final C60870cx mo50283c(String str, String str2) {
        C46301i iVar = this.f121207b;
        return C60922j.m93044g(iVar.f121286a.mo46042d(), new C46300h(str, str2), iVar.f121287b);
    }

    /* renamed from: d */
    public final C60870cx mo50284d(AccountId accountId) {
        return C60922j.m93044g(this.f121207b.f121286a.mo46042d(), new C46296d(accountId), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo50285e() {
        C46301i iVar = this.f121207b;
        return C60922j.m93044g(iVar.f121286a.mo46042d(), C46281c.f121265a, iVar.f121287b);
    }

    /* renamed from: f */
    public final C60870cx mo50286f() {
        C46301i iVar = this.f121207b;
        return C60922j.m93044g(iVar.f121286a.mo46042d(), C46297e.f121281a, iVar.f121287b);
    }

    /* renamed from: g */
    public final C60870cx mo50287g() {
        C46301i iVar = this.f121207b;
        return C60922j.m93044g(iVar.f121286a.mo46042d(), C46219a.f121171a, iVar.f121287b);
    }

    /* renamed from: h */
    public final C60870cx mo50288h() {
        C46301i iVar = this.f121207b;
        return C60922j.m93044g(iVar.f121286a.mo46042d(), C46299g.f121283a, iVar.f121287b);
    }

    /* renamed from: i */
    public final C60870cx mo50289i(AccountId accountId) {
        return C60922j.m93044g(this.f121207b.f121286a.mo46042d(), new C46298f(accountId), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final C60870cx mo50290j() {
        return C60922j.m93044g(this.f121207b.f121286a.mo46042d(), C46254b.f121237a, C60826bg.f164896a);
    }

    /* renamed from: k */
    public final C60870cx mo50291k(Collection collection) {
        return this.f121206a.mo50276e(collection);
    }

    /* renamed from: l */
    public final C60870cx mo50292l(Collection collection, C58528ij ijVar) {
        return this.f121206a.mo50277f(collection, ijVar);
    }
}
