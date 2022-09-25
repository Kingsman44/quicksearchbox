package com.google.android.apps.gsa.staticplugins.p7614bx.p7623e;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58832aw;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5451f.p5452a.p5453a.p5454a.C69393ao;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69455t;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.e.e */
/* compiled from: PG */
public final /* synthetic */ class C97441e implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C97442f f272130a;

    public /* synthetic */ C97441e(C97442f fVar) {
        this.f272130a = fVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C69393ao aoVar;
        C97442f fVar = this.f272130a;
        C69396ar arVar = (C69396ar) obj;
        if (!C58832aw.m90831a(arVar, C69396ar.f185678d)) {
            if (arVar.f185680a == 4) {
                aoVar = (C69393ao) arVar.f185681b;
            } else {
                aoVar = C69393ao.f185657i;
            }
            TextView textView = fVar.f272134c;
            C69455t tVar = aoVar.f185660b;
            if (tVar == null) {
                tVar = C69455t.f185861c;
            }
            fVar.mo90720f(textView, tVar);
            TextView textView2 = fVar.f272135d;
            C69455t tVar2 = aoVar.f185661c;
            if (tVar2 == null) {
                tVar2 = C69455t.f185861c;
            }
            fVar.mo90720f(textView2, tVar2);
            TextView textView3 = fVar.f272136e;
            C69455t tVar3 = aoVar.f185662d;
            if (tVar3 == null) {
                tVar3 = C69455t.f185861c;
            }
            fVar.mo90720f(textView3, tVar3);
            TextView textView4 = fVar.f272137f;
            C69455t tVar4 = aoVar.f185663e;
            if (tVar4 == null) {
                tVar4 = C69455t.f185861c;
            }
            fVar.mo90720f(textView4, tVar4);
            fVar.f272136e.setOnClickListener(new C97439c(fVar, aoVar));
            fVar.f272137f.setOnClickListener(new C97440d(fVar));
            try {
                String str = aoVar.f185664f;
                if (!C58837ba.m90859h(str)) {
                    ((GradientDrawable) fVar.mo28297il().getBackground()).setColor(Color.parseColor(str));
                }
            } catch (IllegalArgumentException unused) {
                C58976aa aaVar = C58975e.f156826a;
            }
            fVar.f272132a.mo90712f();
            fVar.mo90721g();
            return;
        }
        fVar.mo90721g();
    }
}
