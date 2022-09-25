package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.content.res.Resources;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.p4522b.C58485gu;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.q */
/* compiled from: PG */
public final class C109821q extends C84036z {

    /* renamed from: a */
    public final C109818n f306038a;

    /* renamed from: b */
    public final C83893b f306039b;

    /* renamed from: c */
    public final C109790aj f306040c;

    /* renamed from: d */
    public final C69464a f306041d;

    /* renamed from: e */
    public final Resources f306042e;

    /* renamed from: f */
    public final C90021c f306043f;

    /* renamed from: g */
    public final C91123v f306044g;

    public C109821q(C109818n nVar, C83893b bVar, C109790aj ajVar, C69464a aVar, Resources resources, C91123v vVar, C90021c cVar) {
        this.f306038a = nVar;
        this.f306039b = bVar;
        this.f306040c = ajVar;
        this.f306041d = aVar;
        this.f306042e = resources;
        this.f306044g = vVar;
        this.f306043f = cVar;
    }

    /* renamed from: b */
    public final int mo98172b() {
        C109806b bVar = (C109806b) this.f306038a;
        int i = bVar.f305977e - 1;
        int i2 = 5;
        if (i != 5) {
            i2 = 6;
            if (!(i == 6 || i == 31)) {
                return bVar.f305976d;
            }
        }
        return i2;
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!((C109806b) this.f306038a).f305973a) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89847o(new C109819o(this), new C109820p(this));
    }
}
