package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.google.android.gms.search.queries.Annotation;
import com.google.android.libraries.gcoreclient.p1805x.p1807b.p1808a.C21727a;
import com.google.android.libraries.gcoreclient.p1805x.p1807b.p1808a.C21729c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.o */
/* compiled from: PG */
public final /* synthetic */ class C84448o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229813a;

    /* renamed from: b */
    public final /* synthetic */ String f229814b;

    /* renamed from: c */
    public final /* synthetic */ int[] f229815c;

    /* renamed from: d */
    public final /* synthetic */ List f229816d;

    /* renamed from: e */
    public final /* synthetic */ ConditionVariable f229817e;

    public /* synthetic */ C84448o(C84425ag agVar, String str, int[] iArr, List list, ConditionVariable conditionVariable) {
        this.f229813a = agVar;
        this.f229814b = str;
        this.f229815c = iArr;
        this.f229816d = list;
        this.f229817e = conditionVariable;
    }

    public final void run() {
        C84425ag agVar = this.f229813a;
        String str = this.f229814b;
        int[] iArr = this.f229815c;
        List list = this.f229816d;
        ConditionVariable conditionVariable = this.f229817e;
        C84421ac acVar = agVar.f229720c;
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = null;
        if (acVar.f229708b && acVar.f229707a.f229713d.f59932a.mo119133h()) {
            C84424af afVar = acVar.f229707a;
            try {
                C21727a aVar = (C21727a) afVar.f229711b.mo27076a(afVar.f229713d, str, Locale.getDefault().getLanguage(), iArr).mo26994a();
                arrayList = new ArrayList();
                List<Annotation> list2 = aVar.f60035a.f394485b;
                if (list2 != null) {
                    for (Annotation cVar : list2) {
                        arrayList.add(new C21729c(cVar));
                    }
                }
            } catch (RuntimeException unused) {
                C59104x c = C84425ag.f229718a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                ((C59052c) ((C59052c) c).mo56372aa(9287)).mo56386p("Exception when calling annotate");
            }
        }
        if (arrayList != null) {
            list.addAll(arrayList);
        }
        conditionVariable.open();
    }
}
