package com.google.android.libraries.search.silk.p3162a.p3170h;

import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0809b;
import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.googleapp.compliance.p10146c.C133623a;
import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;

/* renamed from: com.google.android.libraries.search.silk.a.h.l */
/* compiled from: PG */
public final class C40586l {

    /* renamed from: a */
    public final C46440f f106516a = new C40588b();

    /* renamed from: b */
    public final C46440f f106517b = new C40587a();

    /* renamed from: c */
    public final C0809b f106518c = new C40585k(this);

    /* renamed from: d */
    public final C46439e f106519d;

    /* renamed from: e */
    public final C38586af f106520e;

    /* renamed from: f */
    public final C40582h f106521f;

    /* renamed from: g */
    public final AccountId f106522g;

    /* renamed from: h */
    public final C133623a f106523h;

    /* renamed from: i */
    public C0816c f106524i;

    /* renamed from: com.google.android.libraries.search.silk.a.h.l$a */
    /* compiled from: PG */
    final class C40587a implements C46440f {
        public C40587a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C40586l.this.mo42534a().mo42536a(th);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            if (((Boolean) obj2).booleanValue()) {
                C40586l lVar = C40586l.this;
                lVar.mo42534a().mo42537b(C40594r.CAN_ACCESS_LOCATION);
                return;
            }
            C40586l lVar2 = C40586l.this;
            lVar2.mo42534a().mo42537b(C40594r.CANNOT_ACCESS_LOCATION);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.libraries.search.silk.a.h.l$b */
    /* compiled from: PG */
    final class C40588b implements C46440f {
        public C40588b() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C40586l.this.mo42534a().mo42536a(th);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            if (((Boolean) obj2).booleanValue()) {
                C0816c cVar = C40586l.this.f106524i;
                cVar.getClass();
                cVar.mo526b((Object) null);
                return;
            }
            C40586l lVar = C40586l.this;
            lVar.f106519d.mo50445g(new C46438d(lVar.f106520e.mo41508d()), new C46436b((Object) null), lVar.f106517b);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C40586l(C46439e eVar, C38586af afVar, C40582h hVar, AccountId accountId, C133623a aVar) {
        this.f106519d = eVar;
        this.f106520e = afVar;
        this.f106521f = hVar;
        this.f106522g = accountId;
        this.f106523h = aVar;
    }

    /* renamed from: a */
    public final C40597u mo42534a() {
        return (C40597u) new C2368bp(this.f106521f).mo5770a(C40597u.class);
    }
}
