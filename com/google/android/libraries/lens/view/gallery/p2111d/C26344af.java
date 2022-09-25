package com.google.android.libraries.lens.view.gallery.p2111d;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.lens.view.gallery.data.C26403v;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59972v;
import com.google.common.p4552o.p4563i.C59973w;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.af */
/* compiled from: PG */
final class C26344af implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C58485gu f71613a;

    /* renamed from: b */
    final /* synthetic */ C28448r f71614b;

    /* renamed from: c */
    final /* synthetic */ C25684e f71615c;

    /* renamed from: d */
    final /* synthetic */ C26345ag f71616d;

    /* renamed from: e */
    private boolean f71617e = false;

    public C26344af(C26345ag agVar, C58485gu guVar, C28448r rVar, C25684e eVar) {
        this.f71616d = agVar;
        this.f71613a = guVar;
        this.f71614b = rVar;
        this.f71615c = eVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f71617e) {
            C26403v vVar = (C26403v) this.f71613a.get(i);
            C28448r rVar = this.f71614b;
            C28446p a = C28447q.m53152a(128161);
            C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
            C59972v vVar2 = (C59972v) C59973w.f162085d.createBuilder();
            int c = vVar.mo31603c();
            vVar2.copyOnWrite();
            C59973w wVar = (C59973w) vVar2.instance;
            wVar.f162089c = c - 1;
            wVar.f162087a |= 2;
            C59973w wVar2 = (C59973w) vVar2.build();
            bhVar.copyOnWrite();
            C59900bi biVar = (C59900bi) bhVar.instance;
            wVar2.getClass();
            biVar.f161896d = wVar2;
            biVar.f161893a |= 256;
            a.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
            a.mo33898b(C45954d.m82060a(this.f71615c.f69824a));
            rVar.mo33855a(a.mo33897a());
            C47393f.m84237h(new C26368n(vVar), this.f71616d.f71620b);
            this.f71616d.f71620b.setSelection(0, false);
        }
        this.f71617e = !this.f71617e;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
