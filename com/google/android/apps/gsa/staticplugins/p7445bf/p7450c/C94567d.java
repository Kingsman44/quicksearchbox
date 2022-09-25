package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6460b.C83894a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83916c;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83922i;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.avocado.C94212br;
import com.google.android.apps.gsa.staticplugins.avocado.C94213bs;
import com.google.android.apps.gsa.staticplugins.avocado.C94321h;
import com.google.android.apps.gsa.staticplugins.avocado.C94324k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.d */
/* compiled from: PG */
public final class C94567d extends C84036z {

    /* renamed from: a */
    public static final C59071e f264512a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bf.c.d");

    /* renamed from: b */
    public final C94568e f264513b;

    /* renamed from: c */
    public C83894a f264514c;

    /* renamed from: d */
    private final Bundle f264515d;

    /* renamed from: e */
    private final C86124t f264516e;

    /* renamed from: f */
    private final C94213bs f264517f;

    public C94567d(Bundle bundle, C94568e eVar, C94213bs bsVar, C86124t tVar) {
        this.f264513b = eVar;
        this.f264517f = bsVar;
        this.f264515d = bundle;
        this.f264516e = tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (this.f264513b.mo88509c()) {
            ((C59052c) ((C59052c) f264512a.mo56226d()).mo56372aa(20194)).mo56386p("Voice Match Skipped.");
            return C58485gu.m89845m();
        }
        ArrayList parcelableArrayList = this.f264515d.getParcelableArrayList("extra_device_infos");
        C83922i iVar = (C83922i) C83923j.f228570d.createBuilder();
        if (parcelableArrayList.isEmpty()) {
            ((C59052c) ((C59052c) f264512a.mo56225c()).mo56372aa(20193)).mo56386p("No device to enroll during OOBE.");
            return C58485gu.m89845m();
        }
        int size = parcelableArrayList.size();
        int i = 0;
        while (i < size) {
            Bundle bundle = (Bundle) parcelableArrayList.get(i);
            String string = bundle.getString("assistant_settings_device_info_device_id_extra");
            if (string == null) {
                ((C59052c) ((C59052c) f264512a.mo56225c()).mo56372aa(20192)).mo56386p("Missing deviceId");
                return C58485gu.m89845m();
            } else if (!this.f264516e.mo79746e(C90082eg.f249900aP) || bundle.getBoolean("assistant_settings_device_info_avocado_capability_extra", false)) {
                C83916c cVar = (C83916c) C83917d.f228552j.createBuilder();
                cVar.copyOnWrite();
                C83917d dVar = (C83917d) cVar.instance;
                dVar.f228554a |= 1;
                dVar.f228555b = string;
                iVar.mo77330a((C83917d) cVar.build());
                i++;
            } else {
                ((C59052c) ((C59052c) f264512a.mo56226d()).mo56372aa(20191)).mo56386p("Not avocado capable.");
                return C58485gu.m89845m();
            }
        }
        ((C59052c) ((C59052c) f264512a.mo56224b()).mo56372aa(20189)).mo56393w("passed in device infos size %d, and added device info size %d", parcelableArrayList.size(), ((C83923j) iVar.instance).f228573b.size());
        C94213bs bsVar = this.f264517f;
        C83923j jVar = (C83923j) iVar.build();
        jVar.getClass();
        C90021c cVar2 = (C90021c) bsVar.f263244a.mo17428b();
        cVar2.getClass();
        C94324k kVar = (C94324k) bsVar.f263245b.mo17428b();
        kVar.getClass();
        C94321h hVar = (C94321h) bsVar.f263246c.mo17428b();
        hVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) bsVar.f263247d).f184585a);
        a.getClass();
        C94212br brVar = new C94212br(jVar, cVar2, kVar, hVar, a);
        this.f264514c = brVar;
        return C58485gu.m89847o(brVar, new C94566c(this));
    }
}
