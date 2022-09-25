package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.x */
/* compiled from: PG */
public final class C108769x extends C84036z {

    /* renamed from: a */
    public final C108556ar f302489a;

    /* renamed from: b */
    private final C83893b f302490b;

    /* renamed from: c */
    private final cb f302491c;

    /* renamed from: d */
    private final C84026u f302492d;

    public C108769x(C108556ar arVar, C83893b bVar, cb cbVar, C84026u uVar) {
        this.f302489a = arVar;
        this.f302490b = bVar;
        this.f302491c = cbVar;
        this.f302492d = uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C58833ax a = this.f302490b.mo77278a();
        if (!a.mo56113h()) {
            return C58485gu.m89845m();
        }
        C60870cx c = this.f302491c.c((Account) a.mo56107c(), new int[]{0, 1});
        return C58485gu.m89847o(this.f302492d.mo77487a(c, C108753u.f302436a), C83875ai.m133536a(c, new C108767v(this), C108768w.f302488a));
    }
}
