package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110602bg;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.ai */
/* compiled from: PG */
public final /* synthetic */ class C110801ai implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308708a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308709b;

    /* renamed from: c */
    public final /* synthetic */ C50818do f308710c;

    /* renamed from: d */
    public final /* synthetic */ C83800p f308711d;

    public /* synthetic */ C110801ai(C110812at atVar, C58872ci ciVar, C50818do doVar, C83800p pVar) {
        this.f308708a = atVar;
        this.f308709b = ciVar;
        this.f308710c = doVar;
        this.f308711d = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110812at atVar = this.f308708a;
        C58872ci ciVar = this.f308709b;
        C50818do doVar = this.f308710c;
        C83800p pVar = this.f308711d;
        String str = (String) obj;
        atVar.f308739m.mo109923au(ciVar.mo56158a(TimeUnit.MILLISECONDS), false);
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (a.equals(C50794cr.CALENDAR)) {
            atVar.f308737k.mo77192a(C118569b.SMARTSPACE_CALENDAR_UPDATE_STORAGE, 1);
        }
        C110602bg bgVar = atVar.f308728b;
        ((C58970a) ((C58970a) bgVar.f308278c.mo56224b()).mo56372aa(26613)).mo56386p("CrossProfileServiceManagerMediator#handleNewCardUpdate");
        C83741am b = pVar.mo77056b();
        C58485gu e = pVar.mo77059e();
        boolean c = bgVar.mo98806c();
        if (!e.isEmpty()) {
            C60870cx b2 = bgVar.f308280e.mo98825a().mo98811b(b, (Bitmap) e.get(0));
            if (c) {
                bgVar.mo98805b(b2);
                bgVar.f308280e.mo98827c().mo98811b(b, (Bitmap) e.get(0));
            }
        } else {
            C60870cx a2 = bgVar.f308280e.mo98825a().mo98810a(b);
            if (c) {
                bgVar.mo98805b(a2);
                bgVar.f308280e.mo98827c().mo98810a(b);
            }
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }
}
