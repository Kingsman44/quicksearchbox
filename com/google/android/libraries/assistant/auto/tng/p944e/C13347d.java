package com.google.android.libraries.assistant.auto.tng.p944e;

import com.google.android.libraries.componentview.services.application.LogData;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.e.d */
/* compiled from: PG */
public final /* synthetic */ class C13347d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ LogData f41072a;

    public /* synthetic */ C13347d(LogData logData) {
        this.f41072a = logData;
    }

    public final Object apply(Object obj) {
        C38750am amVar = (C38750am) obj;
        C60321oe l = C28285c.m52885l(this.f41072a.mo25464g(), 5);
        if (l == null) {
            ((C59052c) ((C59052c) C13349f.f41074a.mo56226d()).mo56372aa(44692)).mo56386p("Could not get VE data from clicked element. Not logging.");
            return null;
        }
        C59743a aVar = C59743a.NATIVE_VISUAL_ELEMENTS_LOG_EVENT;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 472;
        amVar.mo41598j(aVar, tzVar, l, true);
        return null;
    }
}
