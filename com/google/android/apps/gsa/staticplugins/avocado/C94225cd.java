package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.p5809c.C73849a;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83916c;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83922i;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cd */
/* compiled from: PG */
public final class C94225cd extends C84036z {

    /* renamed from: a */
    private static final C59071e f263284a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.cd");

    /* renamed from: b */
    private final C90021c f263285b;

    /* renamed from: c */
    private final Bundle f263286c;

    /* renamed from: d */
    private final C94195ba f263287d;

    /* renamed from: e */
    private final C94234cm f263288e;

    /* renamed from: f */
    private final C94299ex f263289f;

    public C94225cd(Bundle bundle, C90021c cVar, C94195ba baVar, C94234cm cmVar, C94299ex exVar) {
        this.f263285b = cVar;
        this.f263286c = bundle;
        this.f263287d = baVar;
        this.f263288e = cmVar;
        this.f263289f = exVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!C73849a.m108439a(this.f263285b)) {
            return C58485gu.m89845m();
        }
        HashMap hashMap = this.f263286c.containsKey("avocadoEnrollDeviceMap") ? (HashMap) this.f263286c.getSerializable("avocadoEnrollDeviceMap") : null;
        if (hashMap == null || hashMap.isEmpty()) {
            C59104x c = f263284a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AvocadoSequenceFromVM");
            ((C59052c) ((C59052c) c).mo56372aa(14274)).mo56386p("No device to enroll");
            return C58485gu.m89845m();
        }
        C83922i iVar = (C83922i) C83923j.f228570d.createBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            C58976aa aaVar = C58975e.f156826a;
            entry.getKey();
            entry.getValue();
            C83916c cVar = (C83916c) C83917d.f228552j.createBuilder();
            String str = (String) entry.getKey();
            cVar.copyOnWrite();
            C83917d dVar = (C83917d) cVar.instance;
            str.getClass();
            dVar.f228554a = 1 | dVar.f228554a;
            dVar.f228555b = str;
            int intValue = ((Integer) entry.getValue()).intValue();
            cVar.copyOnWrite();
            C83917d dVar2 = (C83917d) cVar.instance;
            dVar2.f228554a |= 256;
            dVar2.f228562i = intValue;
            iVar.mo77330a((C83917d) cVar.build());
        }
        C83923j jVar = (C83923j) iVar.build();
        C94299ex exVar = this.f263289f;
        exVar.f263511d = true;
        exVar.f263509b = -1;
        return C58485gu.m89847o(this.f263288e.mo88403a(new C94223cb(jVar)), this.f263287d.mo88397a(new C94224cc(jVar)));
    }
}
