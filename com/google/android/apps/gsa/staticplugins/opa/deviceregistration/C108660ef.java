package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87250s;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ef */
/* compiled from: PG */
public final class C108660ef extends C83870ad {

    /* renamed from: a */
    public static final C59071e f302215a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ef");

    /* renamed from: b */
    public final C108556ar f302216b;

    /* renamed from: c */
    public final C108617cq f302217c;

    /* renamed from: d */
    public final C84026u f302218d;

    /* renamed from: e */
    public final C87250s f302219e;

    /* renamed from: f */
    public final C89052h f302220f;

    /* renamed from: g */
    public final C108680ez f302221g;

    /* renamed from: h */
    int f302222h = 1;

    /* renamed from: i */
    public final C84466a f302223i;

    public C108660ef(C108556ar arVar, C108617cq cqVar, C84026u uVar, C84466a aVar, C87250s sVar, C89052h hVar, C108680ez ezVar) {
        this.f302216b = arVar;
        this.f302217c = cqVar;
        this.f302218d = uVar;
        this.f302223i = aVar;
        this.f302219e = sVar;
        this.f302220f = hVar;
        this.f302221g = ezVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        int i = this.f302222h;
        if (i != 0) {
            if (i == 4) {
                this.f302222h = 2;
                i = 2;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                this.f302222h = 2;
                this.f302221g.mo97062f();
                C60870cx c = this.f302217c.mo97028c();
                return C58833ax.m90834k(C83875ai.m133539d(this.f302218d.mo77487a(c, C108650dw.f302196a), new C108651dx(c)));
            } else if (i2 != 1) {
                return C58836b.f156633a;
            } else {
                this.f302222h = 3;
                return C58833ax.m90834k(new C108653dz(this));
            }
        } else {
            throw null;
        }
    }
}
