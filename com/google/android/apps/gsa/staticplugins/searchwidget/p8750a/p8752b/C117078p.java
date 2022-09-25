package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.monet.p7070b.p7090i.C90245a;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117091c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.p */
/* compiled from: PG */
public final class C117078p extends C23056g {

    /* renamed from: a */
    private final C117091c f325072a;

    /* renamed from: b */
    private final C90464f f325073b;

    public C117078p(C23052c cVar, C117091c cVar2, C90464f fVar) {
        super(cVar);
        this.f325072a = cVar2;
        this.f325073b = fVar;
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        C58976aa aaVar = C58975e.f156826a;
        if ("CLICK".equals(str) && "FEEDBACK_BUTTON".equals(str2)) {
            Bitmap bitmap = (Bitmap) ((Bundle) parcelable).getParcelable("KEY_SCREENSHOT");
            C90461c cVar = new C90461c();
            cVar.f252699k = true;
            cVar.f252707s = R.string.feedback_entrypoint_widget_customization;
            cVar.f252697i = null;
            if (bitmap != null) {
                cVar.mo84203iI(Arrays.asList(new Bitmap[]{bitmap}));
            }
            this.f325073b.mo84209b(cVar, 1);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        if (((C117070h) this.f325072a).f325037b.mo28635p(xVar)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C117070h) this.f325072a).f325037b.mo28634o(xVar);
        }
        if (((C117070h) this.f325072a).f325036a.mo28635p(xVar)) {
            C58976aa aaVar2 = C58975e.f156826a;
            ((C117070h) this.f325072a).f325036a.mo28634o(xVar);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        ((C117070h) this.f325072a).f325037b.mo28623d(C90245a.f252094a, protoParcelable);
        ((C117070h) this.f325072a).f325036a.mo28623d(C90245a.f252097d, protoParcelable);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C23056g a = ((C117070h) this.f325072a).f325036a.mo28620a();
        a.getClass();
        C23056g a2 = ((C117070h) this.f325072a).f325037b.mo28620a();
        a2.getClass();
        ((C117060ah) a2).f325004d = (C117087y) a;
    }
}
