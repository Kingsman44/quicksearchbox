package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83898bd;
import com.google.android.apps.gsa.opaonboarding.C83899be;
import com.google.android.apps.gsa.opaonboarding.C83946m;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.f */
/* compiled from: PG */
public final class C94569f extends C84036z {

    /* renamed from: a */
    private static final C59071e f264522a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bf.c.f");

    /* renamed from: b */
    private final C94568e f264523b;

    /* renamed from: c */
    private final C92371d f264524c;

    public C94569f(C94568e eVar, C92371d dVar) {
        this.f264523b = eVar;
        this.f264524c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        boolean z;
        boolean c = this.f264523b.mo88509c();
        boolean z2 = !c;
        C92371d dVar = this.f264524c;
        Iterator it = dVar.f257559d.iterator();
        while (true) {
            if (it.hasNext()) {
                if (dVar.mo87035p(((l) it.next()).a)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        C83898bd j = C83899be.m133634j();
        j.mo77292i(c);
        ArrayList arrayList = new ArrayList();
        for (l b : this.f264524c.f257559d) {
            arrayList.add(b.b());
        }
        j.mo77286c(C58485gu.m89842j(arrayList));
        j.mo77287d(this.f264524c.mo87034o() ? 1 : 0);
        C58490gz gzVar = new C58490gz(4);
        for (l lVar : this.f264524c.f257559d) {
            gzVar.mo55429h(lVar.b(), lVar.a());
        }
        ((C83946m) j).f228663a = gzVar.mo55427f(false);
        j.mo77288e(z);
        int i = this.f264523b.f264520b;
        C59104x b2 = f264522a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "HomePersonalSeq");
        boolean z3 = 1 == i;
        ((C59052c) ((C59052c) b2).mo56372aa(20198)).mo56389s("isAvocadoSucceeded %b", Boolean.valueOf(z3));
        j.mo77291h(z2);
        j.mo77289f(z3);
        return C58485gu.m89846n(C83875ai.m133539d(j.mo77284a().getClass()));
    }
}
