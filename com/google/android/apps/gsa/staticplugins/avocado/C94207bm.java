package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.p5809c.C73849a;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83898bd;
import com.google.android.apps.gsa.opaonboarding.C83899be;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83919f;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.opaonboarding.p8663g.C115896n;
import com.google.android.apps.gsa.staticplugins.p7388al.C93949w;
import com.google.android.apps.gsa.staticplugins.p7388al.C93950x;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import java.util.ArrayList;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.bm */
/* compiled from: PG */
public final class C94207bm extends C83870ad {

    /* renamed from: a */
    public static final C59071e f263208a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.bm");

    /* renamed from: b */
    public final C84026u f263209b;

    /* renamed from: c */
    public final C94256dh f263210c;

    /* renamed from: d */
    public final C69464a f263211d;

    /* renamed from: e */
    public final C68214a f263212e;

    /* renamed from: f */
    public int f263213f = 1;

    /* renamed from: g */
    public int f263214g = 0;

    /* renamed from: h */
    int f263215h = 1;

    /* renamed from: i */
    public C93949w f263216i;

    /* renamed from: j */
    private final Bundle f263217j;

    /* renamed from: k */
    private final C90021c f263218k;

    /* renamed from: l */
    private final C94324k f263219l;

    /* renamed from: m */
    private final C69464a f263220m;

    /* renamed from: n */
    private final C69464a f263221n;

    /* renamed from: o */
    private C94323j f263222o;

    public C94207bm(Bundle bundle, C90021c cVar, C94324k kVar, C84026u uVar, C94256dh dhVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C68214a aVar4) {
        this.f263217j = bundle;
        this.f263218k = cVar;
        this.f263219l = kVar;
        this.f263209b = uVar;
        this.f263210c = dhVar;
        this.f263211d = aVar;
        this.f263220m = aVar2;
        this.f263221n = aVar3;
        this.f263212e = aVar4;
    }

    /* renamed from: a */
    private final C58833ax m155487a() {
        this.f263215h = 4;
        return C58833ax.m90834k(new C94206bl(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        C83919f fVar;
        C59071e eVar = f263208a;
        C59052c cVar = (C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14246);
        int i = this.f263215h;
        int i2 = i - 1;
        if (i != 0) {
            cVar.mo56387q("#getNextDelegate currentState %d", i2);
            if (!C73849a.m108439a(this.f263218k)) {
                return C58836b.f156633a;
            }
            int i3 = this.f263215h;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == 0) {
                ((C89859i) this.f263212e.mo27525b()).mo83702b(C89849ae.FACE_MATCH_ENROLLMENT_START);
                this.f263215h = 2;
                if (!this.f263217j.containsKey("DeviceScanConfig")) {
                    fVar = C83919f.f228563e;
                } else {
                    fVar = (C83919f) ProtoParsers.m95522e(this.f263217j, "DeviceScanConfig", C83919f.f228563e, C62921ba.m95368a());
                }
                C93949w a = C93950x.m154994a(fVar);
                this.f263216i = a;
                return C58833ax.m90834k(a);
            } else if (i4 == 1) {
                this.f263215h = 3;
                Bundle bundle = new Bundle();
                bundle.putByteArray("device_id_list_key", this.f263216i.f262367a.f262354z.toByteArray());
                return C58833ax.m90834k(C83875ai.m133541f((C94321h) this.f263221n.mo17428b(), bundle, new C94201bg(this)));
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int i5 = this.f263213f;
                    if (i5 == 1) {
                        return C58836b.f156633a;
                    }
                    if (i5 == 0) {
                        return m155487a();
                    }
                    this.f263215h = 5;
                    C94323j a2 = this.f263219l.mo88460a(this.f263216i.f262367a.f262354z, this.f263218k.mo79746e(C90082eg.f249909aY));
                    this.f263222o = a2;
                    return C58833ax.m90834k(a2);
                } else if (i4 == 4) {
                    int i6 = this.f263222o.f263584a;
                    ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14254)).mo56387q("enrollResult is %d", i6);
                    if (i6 != 2) {
                        return C58836b.f156633a;
                    }
                    this.f263215h = 6;
                    C83898bd j = C83899be.m133634j();
                    j.mo77289f(true);
                    C83923j jVar = this.f263216i.f262367a.f262354z;
                    ArrayList arrayList = new ArrayList();
                    for (C83917d dVar : jVar.f228573b) {
                        arrayList.add(dVar.f228555b);
                    }
                    j.mo77286c(C58485gu.m89842j(arrayList));
                    j.mo77285b(AvocadoUtils.m155381e(this.f263216i.f262367a.f262354z.f228573b));
                    j.mo77288e(true);
                    C83899be a3 = j.mo77284a();
                    C115896n nVar = (C115896n) this.f263220m.mo17428b();
                    return C58833ax.m90834k(a3.getClass());
                } else if (i4 == 5) {
                    return C58836b.f156633a;
                } else {
                    throw new IllegalArgumentException("Unknown State.");
                }
            } else if (this.f263214g == 0) {
                return C58836b.f156633a;
            } else {
                return m155487a();
            }
        } else {
            throw null;
        }
    }
}
