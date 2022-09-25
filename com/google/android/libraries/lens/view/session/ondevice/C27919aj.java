package com.google.android.libraries.lens.view.session.ondevice;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2069am.C25323bd;
import com.google.android.libraries.lens.view.p2069am.C25324be;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27942p;
import com.google.android.libraries.lens.view.session.ondevice.p2169d.C27946b;
import com.google.android.libraries.lens.view.session.ondevice.p2169d.C27966v;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58894dd;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.aj */
/* compiled from: PG */
public final /* synthetic */ class C27919aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C27920ak f76040a;

    /* renamed from: b */
    public final /* synthetic */ C27966v f76041b;

    public /* synthetic */ C27919aj(C27920ak akVar, C27966v vVar) {
        this.f76040a = akVar;
        this.f76041b = vVar;
    }

    public final Object apply(Object obj) {
        C25043ao aoVar;
        C27920ak akVar = this.f76040a;
        C27966v vVar = this.f76041b;
        List list = (List) obj;
        if (list != null) {
            C58480gp gpVar = new C58480gp(4);
            for (int i = 0; i < list.size(); i++) {
                C25324be beVar = (C25324be) list.get(i);
                int a = C25323bd.m46662a(beVar.f68900c);
                if (a != 0 && a == 3) {
                    C27946b bVar = (C27946b) vVar;
                    gpVar.mo55395g(akVar.f76045d.mo33412a(((C27942p) bVar.f76102b.get(i)).mo33402d(), beVar.f68898a, (String) akVar.f76056o.mo56109e(BuildConfig.FLAVOR), (String) akVar.f76054m.mo56109e(BuildConfig.FLAVOR), ((C27942p) bVar.f76102b.get(i)).mo33400b(), C58485gu.m89845m()));
                }
            }
            C58485gu f = gpVar.mo55394f();
            if (f.isEmpty()) {
                akVar.f76047f.mo19974a(C37194a.f98591cv.mo40815i(C62722b.INVALID_ARGUMENT));
                Stream sorted = Collection.EL.stream(((HashMap) Collection.EL.stream(list).collect(Collectors.groupingBy(C27913ad.f76034a, C27914ae.f76035a, Collectors.counting()))).entrySet()).sorted(C27915af.f76036a);
                if (akVar.f76050i) {
                    sorted.findFirst().ifPresent(new C27916ag(akVar));
                }
                ((C58970a) ((C58970a) C27920ak.f76042a.mo56226d()).mo56372aa(50000)).mo56351D("All translations for payload %d failed with statuses: %s", ((C27946b) vVar).f76101a.f149807d, (String) sorted.map(C27917ah.f76038a).collect(Collectors.joining(", ")));
                return C58485gu.m89845m();
            }
            akVar.f76047f.mo19974a(C37194a.f98591cv.mo40815i(C62722b.OK));
            if (!akVar.f76050i || (aoVar = akVar.f76051j) == null) {
                return f;
            }
            ((C19567d) aoVar.f68266r.mo6453a()).mo24822a(1, Boolean.valueOf(akVar.f76043b.mo33428f()));
            return f;
        }
        throw new C58894dd(String.format("All translations for payload %d failed.", new Object[]{Long.valueOf(((C27946b) vVar).f76101a.f149807d)}));
    }
}
