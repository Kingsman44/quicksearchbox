package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.search.assistant.platform.p9141h.p9146b.C121010i;
import com.google.android.apps.search.assistant.platform.p9141h.p9146b.p9147a.C121001c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.cq */
/* compiled from: PG */
public final class C108887cq {

    /* renamed from: a */
    public static final C59071e f302744a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.cq");

    /* renamed from: b */
    private final C68214a f302745b;

    /* renamed from: c */
    private final C68214a f302746c;

    /* renamed from: d */
    private final C86124t f302747d;

    /* renamed from: e */
    private final SharedPreferences f302748e;

    /* renamed from: f */
    private final C121010i f302749f;

    public C108887cq(C68214a aVar, C68214a aVar2, C86124t tVar, SharedPreferences sharedPreferences, C121010i iVar) {
        this.f302745b = aVar;
        this.f302746c = aVar2;
        this.f302747d = tVar;
        this.f302748e = sharedPreferences;
        this.f302749f = iVar;
    }

    /* renamed from: d */
    private static void m181106d(C60870cx cxVar) {
        C60856cj.m92911t(cxVar, new C108886cp(), C60826bg.f164896a);
    }

    /* renamed from: e */
    private final void m181107e(boolean z) {
        this.f302748e.edit().putBoolean("continued_conversation_setting", z).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo97253a() {
        m181107e(true);
        m181106d(this.f302749f.mo103942a(C121001c.ON));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo97254b() {
        m181107e(false);
        m181106d(this.f302749f.mo103942a(C121001c.OFF));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo97255c() {
        C90048d[] dVarArr = {C90126fx.f251094cN, C90126fx.f251097cQ};
        if (((C58833ax) this.f302745b.mo27525b()).mo56113h() && ((C74720bx) ((C58833ax) this.f302745b.mo27525b()).mo56107c()).mo71089f().b() && !this.f302748e.contains("continued_conversation_setting")) {
            int i = 0;
            while (true) {
                if (i < 2) {
                    if (!this.f302747d.mo79746e(dVarArr[i])) {
                        break;
                    }
                    i++;
                } else {
                    return ((C58833ax) this.f302746c.mo27525b()).mo56113h() && ((C74713bn) ((C58833ax) this.f302746c.mo27525b()).mo56107c()).mo71076a();
                }
            }
        }
    }
}
