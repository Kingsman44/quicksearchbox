package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.kv */
/* compiled from: PG */
public final class C96361kv extends C84036z {

    /* renamed from: a */
    private final C83893b f269597a;

    /* renamed from: b */
    private final C84026u f269598b;

    /* renamed from: c */
    private final C69464a f269599c;

    /* renamed from: d */
    private final boolean f269600d;

    /* renamed from: e */
    private final C89635f f269601e;

    /* renamed from: f */
    private final String f269602f;

    public C96361kv(C83893b bVar, C84026u uVar, C69464a aVar, boolean z, C89635f fVar, String str) {
        this.f269597a = bVar;
        this.f269598b = uVar;
        this.f269599c = aVar;
        this.f269600d = z;
        this.f269601e = fVar;
        str.getClass();
        this.f269602f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C60870cx cxVar;
        C84026u uVar = this.f269598b;
        if (this.f269600d) {
            C58833ax a = this.f269597a.mo77278a();
            if (a.mo56113h()) {
                cxVar = this.f269601e.mo83519c((Account) a.mo56107c(), this.f269602f);
                return C58485gu.m89846n(uVar.mo77487a(cxVar, this.f269599c));
            }
        }
        cxVar = C118826c.f331423b;
        return C58485gu.m89846n(uVar.mo77487a(cxVar, this.f269599c));
    }
}
