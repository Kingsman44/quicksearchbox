package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19903ad;
import com.google.android.libraries.componentview.components.base.p1687a.C19904ae;
import com.google.android.libraries.componentview.components.base.p1687a.C19909aj;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19994q;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.p1685b.C19893b;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19889a;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19892d;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20109af;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20111ah;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20113aj;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.componentview.components.c.av */
/* compiled from: PG */
public class C20202av extends C19898a {

    /* renamed from: a */
    public final C56429h f56708a;

    /* renamed from: b */
    public final C20524l f56709b;

    /* renamed from: c */
    public C20111ah f56710c;

    /* renamed from: d */
    public C19893b f56711d;

    /* renamed from: j */
    public int f56712j;

    /* renamed from: k */
    private C56425d f56713k;

    public C20202av(C56425d dVar, Context context, C20601ca caVar, C20537f fVar, C20524l lVar, C20621l lVar2) {
        super(dVar, context, fVar, caVar, lVar2);
        this.f56709b = lVar;
        C56429h hVar = dVar.f150542d;
        this.f56708a = hVar == null ? C56429h.f150547k : hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        return this.f56713k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        return this.f57588z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        C19893b bVar;
        if (this.f56710c == null || this.f57601m == null) {
            C20520h.m38497b(5, "DictionaryDropdownComp", new IllegalStateException(), "BindEventListeners requirements not met", new Object[0]);
        } else {
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f56711d = (C19893b) this.f57601m;
        }
        if (this.f56710c != null && (bVar = this.f56711d) != null) {
            this.f56712j = bVar.mo25170i();
            this.f56711d.mo25166A(new C20201au(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20109af.f56358d);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20109af afVar = (C20109af) obj;
        C20111ah ahVar = afVar.f56361b;
        if (ahVar == null) {
            ahVar = C20111ah.f56362e;
        }
        this.f56710c = ahVar;
        if ((afVar.f56360a & 1) != 0) {
            C20111ah ahVar2 = this.f56710c;
            int i = ahVar2.f56364a;
            if (!((i & 1) == 0 || (i & 2) == 0 || ahVar2.f56367d.size() == 0)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C20113aj ajVar : this.f56710c.f56367d) {
                    arrayList.add(ajVar.f56371b);
                    arrayList2.add(ajVar.f56370a);
                }
                int indexOf = arrayList2.indexOf(this.f56710c.f56365b);
                C19889a aVar = (C19889a) C19892d.f55637k.createBuilder();
                aVar.mo25165a(arrayList);
                aVar.copyOnWrite();
                C19892d dVar2 = (C19892d) aVar.instance;
                dVar2.f55640a |= 1;
                dVar2.f55642c = indexOf;
                aVar.copyOnWrite();
                C19892d dVar3 = (C19892d) aVar.instance;
                dVar3.f55640a |= 4;
                dVar3.f55644e = true;
                aVar.copyOnWrite();
                C19892d dVar4 = (C19892d) aVar.instance;
                dVar4.f55640a |= 32;
                dVar4.f55647h = true;
                aVar.copyOnWrite();
                C19892d dVar5 = (C19892d) aVar.instance;
                dVar5.f55640a |= 16;
                dVar5.f55646g = 16.0f;
                aVar.copyOnWrite();
                C19892d dVar6 = (C19892d) aVar.instance;
                dVar6.f55645f = 3;
                dVar6.f55640a |= 8;
                C19909aj ajVar2 = (C19909aj) C19916aq.f55703s.createBuilder();
                C19903ad adVar = (C19903ad) C19904ae.f55685f.createBuilder();
                adVar.copyOnWrite();
                C19904ae aeVar = (C19904ae) adVar.instance;
                aeVar.f55687a |= 1;
                aeVar.f55688b = 4.0f;
                adVar.copyOnWrite();
                C19904ae aeVar2 = (C19904ae) adVar.instance;
                aeVar2.f55687a |= 4;
                aeVar2.f55690d = 4.0f;
                adVar.copyOnWrite();
                C19904ae aeVar3 = (C19904ae) adVar.instance;
                aeVar3.f55687a |= 2;
                aeVar3.f55689c = 10.0f;
                adVar.copyOnWrite();
                C19904ae aeVar4 = (C19904ae) adVar.instance;
                aeVar4.f55687a |= 8;
                aeVar4.f55691e = 10.0f;
                C19904ae aeVar5 = (C19904ae) adVar.build();
                ajVar2.copyOnWrite();
                C19916aq aqVar = (C19916aq) ajVar2.instance;
                aeVar5.getClass();
                aqVar.f55712h = aeVar5;
                aqVar.f55705a |= 32;
                ajVar2.copyOnWrite();
                C19916aq aqVar2 = (C19916aq) ajVar2.instance;
                aqVar2.f55705a |= 128;
                aqVar2.f55714j = true;
                C19994q qVar = (C19994q) C19995r.f56032g.createBuilder();
                qVar.copyOnWrite();
                C19995r rVar = (C19995r) qVar.instance;
                rVar.f56034a |= 1;
                rVar.f56035b = 0.0f;
                qVar.copyOnWrite();
                C19995r rVar2 = (C19995r) qVar.instance;
                rVar2.f56034a |= 2;
                rVar2.f56036c = 0.0f;
                qVar.copyOnWrite();
                C19995r rVar3 = (C19995r) qVar.instance;
                rVar3.f56034a |= 4;
                rVar3.f56037d = 0.0f;
                qVar.copyOnWrite();
                C19995r rVar4 = (C19995r) qVar.instance;
                rVar4.f56034a |= 8;
                rVar4.f56038e = 0.05f;
                C19995r rVar5 = (C19995r) qVar.build();
                ajVar2.copyOnWrite();
                C19916aq aqVar3 = (C19916aq) ajVar2.instance;
                rVar5.getClass();
                aqVar3.f55710f = rVar5;
                aqVar3.f55705a = 1 | aqVar3.f55705a;
                ajVar2.copyOnWrite();
                C19916aq aqVar4 = (C19916aq) ajVar2.instance;
                aqVar4.f55706b = 2;
                aqVar4.f55707c = Float.valueOf(2.0f);
                aVar.copyOnWrite();
                C19892d dVar7 = (C19892d) aVar.instance;
                C19916aq aqVar5 = (C19916aq) ajVar2.build();
                aqVar5.getClass();
                dVar7.f55649j = aqVar5;
                dVar7.f55640a |= 128;
                this.f56713k = C19893b.m37753m((C19892d) aVar.build());
                return;
            }
        }
        C20520h.m38497b(5, "DictionaryDropdownComp", new IllegalArgumentException(), "Incomplete DictionaryDropdownData", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo25182l() {
        return false;
    }
}
