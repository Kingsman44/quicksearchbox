package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2059ah.p2060a.C25115a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4707j.C62470ct;
import com.google.lens.p4707j.C62471cu;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.aw */
/* compiled from: PG */
final class C26058aw implements C25115a {

    /* renamed from: a */
    final /* synthetic */ C26059ax f70782a;

    public C26058aw(C26059ax axVar) {
        this.f70782a = axVar;
    }

    /* renamed from: a */
    public final void mo30267a(C58833ax axVar, Map map) {
        C62470ct ctVar;
        ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49383)).mo56389s("onSettingsSyncEvent with target %s:", axVar);
        if (axVar.mo56113h()) {
            C62471cu v = this.f70782a.f70821k.mo32717v();
            if (v.f168678a == 2) {
                ctVar = (C62470ct) v.f168679b;
            } else {
                ctVar = C62470ct.f168670e;
            }
            if ((ctVar.f168672a & 1) == 0) {
                if (Objects.equals(axVar.mo56107c(), Locale.CHINESE) || Objects.equals(axVar.mo56107c(), Locale.TRADITIONAL_CHINESE)) {
                    C26059ax axVar2 = this.f70782a;
                    axVar2.mo31258m(axVar2.mo31248c(), Locale.SIMPLIFIED_CHINESE, false);
                } else {
                    C26059ax axVar3 = this.f70782a;
                    axVar3.mo31258m(axVar3.mo31248c(), (Locale) axVar.mo56107c(), false);
                }
            }
        }
        C58495hd b = C26059ax.m48090b(C58495hd.m89898l(map));
        C58495hd hdVar = (C58495hd) this.f70782a.f70830t.mo3842a();
        if (hdVar == null) {
            ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49385)).mo56386p("modelDownloadStates is null. Will retrieve model states async.");
            C60870cx k = this.f70782a.f70819i.mo33438k();
            C26057av avVar = new C26057av(this, b);
            C60856cj.m92911t(k, C47810es.m84974n(avVar), this.f70782a.f70817g);
            return;
        }
        ((C58970a) ((C58970a) C26059ax.f70786c.mo56224b()).mo56372aa(49384)).mo56386p("modelDownloadStates is present. Will reconcile.");
        this.f70782a.mo31259n(b, hdVar);
    }
}
