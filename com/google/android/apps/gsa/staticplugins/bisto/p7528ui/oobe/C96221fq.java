package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fq */
/* compiled from: PG */
public final class C96221fq extends C84036z {

    /* renamed from: a */
    public static final C59071e f269340a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fq");

    /* renamed from: b */
    public final AtomicBoolean f269341b;

    /* renamed from: c */
    private final C84026u f269342c;

    /* renamed from: d */
    private final C69464a f269343d;

    /* renamed from: e */
    private final C83893b f269344e;

    /* renamed from: f */
    private final cb f269345f;

    public C96221fq(C83893b bVar, cb cbVar, AtomicBoolean atomicBoolean, C84026u uVar, C69464a aVar) {
        this.f269344e = bVar;
        this.f269345f = cbVar;
        this.f269341b = atomicBoolean;
        this.f269342c = uVar;
        this.f269343d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C60870cx cxVar;
        C58833ax a = this.f269344e.mo77278a();
        if (a.mo56113h()) {
            cxVar = this.f269345f.c((Account) a.mo56107c(), new int[]{0, 1});
        } else {
            cxVar = C60856cj.m92900i(true);
        }
        return C58485gu.m89847o(this.f269342c.mo77487a(cxVar, this.f269343d), C83875ai.m133536a(cxVar, new C96219fo(this), new C96220fp(this)));
    }
}
