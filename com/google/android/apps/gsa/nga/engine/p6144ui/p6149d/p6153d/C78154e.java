package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3897e.p3921j.p3926e.C51981gg;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.assistant.p3897e.p3921j.p3926e.C51987gm;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.assistant.p3897e.p3921j.p3926e.C51994gt;
import com.google.common.p4520a.C58206am;
import com.google.common.p4526f.C59052c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.d.e */
/* compiled from: PG */
public final /* synthetic */ class C78154e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78156g f215195a;

    /* renamed from: b */
    public final /* synthetic */ C51986gl f215196b;

    public /* synthetic */ C78154e(C78156g gVar, C51986gl glVar) {
        this.f215195a = gVar;
        this.f215196b = glVar;
    }

    public final void run() {
        C78156g gVar = this.f215195a;
        C51986gl glVar = this.f215196b;
        if (gVar.f215202d.isPresent()) {
            C83320io b = ((ac) gVar.f215202d.get()).b();
            C51133hp a = C51133hp.m86035a(glVar.f136425c);
            if (a == null) {
                a = C51133hp.DEFAULT;
            }
            if (!a.equals(C51133hp.NGA_INPUT_PLATE)) {
                glVar = C51986gl.f136421f;
            } else if (glVar.f136424b.size() == 0) {
                glVar = C51986gl.f136421f;
            }
            C51981gg ggVar = (C51981gg) glVar.toBuilder();
            List unmodifiableList = Collections.unmodifiableList(((C51986gl) ggVar.instance).f136424b);
            for (int i = 0; i < unmodifiableList.size(); i++) {
                C51992gr grVar = (C51992gr) unmodifiableList.get(i);
                C51994gt gtVar = grVar.f136454h;
                if (gtVar == null) {
                    gtVar = C51994gt.f136465g;
                }
                if (gtVar.f136471e) {
                    C51987gm gmVar = (C51987gm) grVar.toBuilder();
                    gmVar.copyOnWrite();
                    C51992gr grVar2 = (C51992gr) gmVar.instance;
                    grVar2.f136447a |= 4;
                    grVar2.f136450d = 99961;
                    C51992gr grVar3 = (C51992gr) gmVar.build();
                    ggVar.copyOnWrite();
                    C51986gl glVar2 = (C51986gl) ggVar.instance;
                    grVar3.getClass();
                    glVar2.mo53773a();
                    glVar2.f136424b.set(i, grVar3);
                }
            }
            C51986gl glVar3 = (C51986gl) ggVar.build();
            ((C58206am) gVar.f215201c).f155647a.put(b, glVar3);
            C78156g.m125469d(gVar.mo73106c(b), glVar3);
            return;
        }
        ((C59052c) ((C59052c) C78156g.f215199a.mo56226d()).mo56372aa(5048)).mo56386p("Dropping args due to no utterance to associate the showSuggestionsArgs.");
    }
}
