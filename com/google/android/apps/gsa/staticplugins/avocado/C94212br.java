package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.p5809c.C73849a;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.p6460b.C83894a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.br */
/* compiled from: PG */
public final class C94212br extends C83870ad implements C83894a {

    /* renamed from: a */
    public static final C59071e f263234a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.br");

    /* renamed from: b */
    public int f263235b = 0;

    /* renamed from: c */
    public int f263236c = 0;

    /* renamed from: d */
    int f263237d = 1;

    /* renamed from: e */
    private final C90021c f263238e;

    /* renamed from: f */
    private final C94324k f263239f;

    /* renamed from: g */
    private final C83923j f263240g;

    /* renamed from: h */
    private final C94321h f263241h;

    /* renamed from: i */
    private final C68214a f263242i;

    /* renamed from: j */
    private C94323j f263243j;

    public C94212br(C83923j jVar, C90021c cVar, C94324k kVar, C94321h hVar, C68214a aVar) {
        this.f263238e = cVar;
        this.f263239f = kVar;
        this.f263240g = jVar;
        this.f263241h = hVar;
        this.f263242i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        C59071e eVar = f263234a;
        C59052c cVar = (C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14258);
        int i = this.f263237d;
        int i2 = i - 1;
        if (i != 0) {
            cVar.mo56387q("#getNextDelegate currentState %d", i2);
            if (!C73849a.m108439a(this.f263238e)) {
                return C58836b.f156633a;
            }
            int i3 = this.f263237d;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 != 0) {
                int i5 = 1;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i6 = this.f263243j.f263584a;
                        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14261)).mo56387q("enrollResult is %d", this.f263235b);
                        if (i6 == 1 || i6 == 2) {
                            if (i6 != 2) {
                                i5 = 0;
                            }
                            this.f263235b = i5;
                        } else {
                            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(14262)).mo56386p("This should never happen: core sequence should not finish if user keeps retrying.");
                        }
                        return C58836b.f156633a;
                    }
                    throw new IllegalArgumentException("Unknown State.");
                } else if (this.f263236c == 0) {
                    return C58836b.f156633a;
                } else {
                    this.f263237d = 3;
                    C94323j a = this.f263239f.mo88460a(this.f263240g, this.f263238e.mo79746e(C90082eg.f249972bi));
                    this.f263243j = a;
                    return C58833ax.m90834k(a);
                }
            } else {
                ((C89859i) this.f263242i.mo27525b()).mo83702b(C89849ae.FACE_MATCH_ENROLLMENT_START_OOBE);
                this.f263237d = 2;
                Bundle bundle = new Bundle();
                bundle.putByteArray("device_id_list_key", this.f263240g.toByteArray());
                return C58833ax.m90834k(C83875ai.m133541f(this.f263241h, bundle, new C94211bq(this)));
            }
        } else {
            throw null;
        }
    }
}
