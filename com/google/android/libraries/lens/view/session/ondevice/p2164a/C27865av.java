package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.C24823o;
import com.google.android.libraries.lens.ondevice.p2026f.C24472b;
import com.google.android.libraries.lens.ondevice.p2026f.C24486o;
import com.google.android.libraries.lens.ondevice.p2026f.C24490s;
import com.google.android.libraries.lens.ondevice.p2026f.C24491t;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.lens.p4701g.C62331d;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.av */
/* compiled from: PG */
public final /* synthetic */ class C27865av implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27877bg f75948a;

    public /* synthetic */ C27865av(C27877bg bgVar) {
        this.f75948a = bgVar;
    }

    public final C60870cx apply(Object obj) {
        C27877bg bgVar = this.f75948a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("No default hybrid translate cascade defined."));
        }
        C24823o oVar = bgVar.f75976b;
        C62331d d = ((C27891h) axVar.mo56107c()).mo33347d();
        C24795f b = ((C27891h) axVar.mo56107c()).mo33345b();
        oVar.f67848e.mo29921j();
        List c = oVar.f67847d.mo29999c(d);
        C24491t tVar = oVar.f67848e;
        C24490s a = C24491t.m45560a(tVar.mo29916d(c), b);
        ((C58970a) ((C58970a) C24491t.f67010a.mo56224b()).mo56372aa(48795)).mo56389s("Downloading model data for %s", c);
        tVar.f67012c.mo29906b(C58597ky.m90217h(((C24472b) a).f66985a.mo55229u(), C24486o.f67005a));
        return C60866ct.f164955a;
    }
}
