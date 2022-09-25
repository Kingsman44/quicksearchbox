package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b.C36684d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.e */
/* compiled from: PG */
public final class C36755e {

    /* renamed from: a */
    public static final C59071e f95768a = C59071e.m91332i("com.google.android.libraries.search.assistant.u.b.c.b.e");

    /* renamed from: b */
    public final Context f95769b;

    /* renamed from: c */
    public final C47770dh f95770c;

    /* renamed from: d */
    public final C36752b f95771d;

    /* renamed from: e */
    public final String f95772e;

    /* renamed from: f */
    public final C46439e f95773f;

    /* renamed from: g */
    public final C28306ab f95774g;

    /* renamed from: h */
    public final C28310af f95775h;

    /* renamed from: i */
    public final C46801dp f95776i;

    /* renamed from: j */
    public final C37215b f95777j;

    /* renamed from: k */
    public final C28443m f95778k;

    /* renamed from: l */
    public final C46175b f95779l;

    /* renamed from: m */
    public final C0816c f95780m;

    /* renamed from: n */
    public final C36757a f95781n = new C36757a();

    /* renamed from: o */
    public String f95782o = null;

    /* renamed from: p */
    public final List f95783p = new ArrayList();

    /* renamed from: q */
    public final C46792di f95784q = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C36755e.f95768a.mo56225c()).mo56382g(th)).mo56372aa(51532)).mo56386p("Unable to load accounts");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            String str;
            List<C46108a> list = (List) obj;
            C36755e.this.f95783p.addAll(list);
            C36755e eVar = C36755e.this;
            String str2 = eVar.f95782o;
            if (str2 != null && (str = (String) Objects.requireNonNull(str2)) != null) {
                for (C46108a aVar : list) {
                    if (!aVar.mo50210b().f121163h && "google".equals(aVar.mo50210b().f121165j) && str.equals(aVar.mo50210b().f121161f)) {
                        int c = aVar.mo50211c();
                        if (c == 0) {
                            throw null;
                        } else if (c == 1) {
                            eVar.mo40370a(aVar.mo50209a());
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: r */
    private final C46325t f95785r;

    /* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.e$a */
    /* compiled from: PG */
    final class C36757a implements C46440f {
        public C36757a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C36755e.f95768a.mo56225c()).mo56382g(th)).mo56372aa(51534)).mo56389s("Failed to get account id: %s", (AccountId) obj);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj2;
            C47393f.m84236g(C36684d.m65278c((String) Objects.requireNonNull(C36755e.this.f95772e), (AccountId) Objects.requireNonNull((AccountId) obj)), (Fragment) Objects.requireNonNull(C36755e.this.f95771d));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C36755e(C36752b bVar, String str, C47770dh dhVar, C46439e eVar, C46801dp dpVar, C46325t tVar, C37215b bVar2, C46175b bVar3, C28306ab abVar, C28310af afVar, C28443m mVar) {
        this.f95771d = bVar;
        this.f95772e = str;
        this.f95769b = bVar.getContext();
        this.f95770c = dhVar;
        this.f95777j = bVar2;
        this.f95779l = bVar3;
        this.f95773f = eVar;
        this.f95776i = dpVar;
        this.f95785r = tVar;
        this.f95774g = abVar;
        this.f95775h = afVar;
        this.f95778k = mVar;
        this.f95780m = bVar.registerForActivityResult(new C0813f(), new C36753c(this));
    }

    /* renamed from: a */
    public final void mo40370a(AccountId accountId) {
        this.f95773f.mo50445g(C46438d.m82810b(this.f95785r.mo50282b(accountId)), new C46436b(accountId), this.f95781n);
    }
}
