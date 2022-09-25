package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import android.content.Context;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80494b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.common.base.C58817ah;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5208h.C66628cz;
import com.google.speech.p5208h.C66634da;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C103504bi implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f288413a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f288414b;

    public /* synthetic */ C103504bi(Context context, C69464a aVar) {
        this.f288413a = context;
        this.f288414b = aVar;
    }

    public final Object apply(Object obj) {
        C66626cx cxVar;
        Context context = this.f288413a;
        C69464a aVar = this.f288414b;
        C80494b bVar = (C80494b) obj;
        C66628cz czVar = (C66628cz) C66634da.f181292g.createBuilder();
        float f = bVar.f220967b;
        czVar.copyOnWrite();
        C66634da daVar = (C66634da) czVar.instance;
        daVar.f181295a |= 2;
        daVar.f181297c = f;
        float f2 = bVar.f220966a;
        czVar.copyOnWrite();
        C66634da daVar2 = (C66634da) czVar.instance;
        daVar2.f181295a |= 1;
        daVar2.f181296b = f2;
        C90021c cVar = (C90021c) aVar.mo17428b();
        if (cVar != null && cVar.mo79746e(C90014bt.f247382gB)) {
            cxVar = C66626cx.SMART_DISPLAY_ANDROID;
        } else if (C90685b.m148054b(context, cVar)) {
            cxVar = C66626cx.TABLET;
        } else {
            cxVar = C66626cx.PHONE;
        }
        czVar.copyOnWrite();
        C66634da daVar3 = (C66634da) czVar.instance;
        daVar3.f181299e = cxVar.f181272r;
        daVar3.f181295a |= 8;
        czVar.copyOnWrite();
        C66634da daVar4 = (C66634da) czVar.instance;
        daVar4.f181295a |= 16;
        daVar4.f181300f = false;
        return (C66634da) czVar.build();
    }
}
