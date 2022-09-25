package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dr */
/* compiled from: PG */
public final class C94266dr extends C83870ad {

    /* renamed from: a */
    public static final C59071e f263423a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.dr");

    /* renamed from: b */
    public int f263424b = 0;

    /* renamed from: c */
    int f263425c = 1;

    /* renamed from: d */
    private final C94324k f263426d;

    /* renamed from: e */
    private final C90021c f263427e;

    /* renamed from: f */
    private final C94263do f263428f;

    /* renamed from: g */
    private final C94175as f263429g;

    /* renamed from: h */
    private final C94299ex f263430h;

    /* renamed from: i */
    private final ai f263431i;

    /* renamed from: j */
    private final Bundle f263432j;

    /* renamed from: k */
    private C94323j f263433k;

    public C94266dr(Bundle bundle, C94324k kVar, C94263do doVar, C94175as asVar, C94299ex exVar, C90021c cVar, ai aiVar) {
        this.f263432j = bundle;
        this.f263426d = kVar;
        this.f263430h = exVar;
        this.f263427e = cVar;
        this.f263428f = doVar;
        this.f263429g = asVar;
        this.f263431i = aiVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        C59071e eVar = f263423a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AvocadoUnicornRetrain");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(14365);
        int i = this.f263425c;
        int i2 = i - 1;
        if (i != 0) {
            cVar.mo56387q("#getNextDelegate currentState %d", i2);
            int i3 = this.f263425c;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        this.f263425c = 4;
                        this.f263430h.f263508a = this.f263433k.f263584a;
                        C59104x b2 = eVar.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "AvocadoUnicornRetrain");
                        ((C59052c) ((C59052c) b2).mo56372aa(14366)).mo56387q("enrollResult is %d", this.f263433k.f263584a);
                        return C58833ax.m90834k(C83875ai.m133541f(this.f263429g, new Bundle(), C94265dq.f263422a));
                    } else if (i4 == 3) {
                        return C58836b.f156633a;
                    } else {
                        throw new IllegalArgumentException("Unknown State.");
                    }
                } else if (this.f263424b == 0) {
                    this.f263430h.f263508a = 3;
                    return C58836b.f156633a;
                } else {
                    this.f263425c = 3;
                    C83923j jVar = (C83923j) ProtoParsers.m95522e(this.f263432j, "AvocadoRetrainDevices", C83923j.f228570d, C62921ba.m95368a());
                    C59104x b3 = eVar.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "AvocadoUnicornRetrain");
                    ((C59052c) ((C59052c) b3).mo56372aa(14364)).mo56387q("Retrain for %d device(s)", jVar.f228573b.size());
                    C94323j a = this.f263426d.mo88460a(jVar, this.f263427e.mo79746e(C90082eg.f249909aY));
                    this.f263433k = a;
                    return C58833ax.m90834k(a);
                }
            } else if (!this.f263431i.e()) {
                return C58836b.f156633a;
            } else {
                this.f263425c = 2;
                return C58833ax.m90834k(C83875ai.m133541f(this.f263428f, new Bundle(), new C94264dp(this)));
            }
        } else {
            throw null;
        }
    }
}
