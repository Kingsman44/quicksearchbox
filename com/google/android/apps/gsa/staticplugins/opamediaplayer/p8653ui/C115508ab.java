package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.ThumbnailView;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.ab */
/* compiled from: PG */
public final /* synthetic */ class C115508ab implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115520an f320374a;

    public /* synthetic */ C115508ab(C115520an anVar) {
        this.f320374a = anVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C58833ax axVar;
        C115520an anVar = this.f320374a;
        anVar.f320391C = (C115466j) obj;
        if (!anVar.f320389A) {
            int i = (int) anVar.f320391C.f320307b;
            if (i < 0 || i >= anVar.f320390B.f136914b.size()) {
                axVar = C58836b.f156633a;
            } else {
                C52568wo woVar = ((C52174hz) anVar.f320390B.f136914b.get(i)).f136897d;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                axVar = C58833ax.m90834k(woVar);
            }
            if (axVar.mo56113h()) {
                C52568wo woVar2 = (C52568wo) axVar.mo56107c();
                String str = woVar2.f137998e;
                ThumbnailView thumbnailView = anVar.f320411k;
                C51012dc dcVar = woVar2.f138004k;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                thumbnailView.mo102127a(str, dcVar, anVar.f320403c, anVar.f320404d);
                anVar.mo102075q();
                C115466j jVar = anVar.f320391C;
                boolean z = jVar.f320316k;
                C115520an.m191607g(anVar.f320417q, z);
                C115520an.m191607g(anVar.f320416p, z);
                anVar.f320413m.setEnabled(z);
                anVar.f320424x.setEnabled(z);
                C115520an.m191607g(anVar.f320418r, jVar.f320317l);
                C115520an.m191607g(anVar.f320419s, jVar.f320318m);
                anVar.mo102074p(anVar.f320391C.f320313h);
                if (!anVar.f320412l.getText().toString().equals(str)) {
                    anVar.f320412l.setText(str);
                }
                anVar.mo102065e();
                anVar.mo102068k();
            }
        }
    }
}
