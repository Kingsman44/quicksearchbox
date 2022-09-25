package com.google.android.libraries.home.p1948c.p1949a;

import android.content.Context;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23644f;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23649k;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23651m;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.android.libraries.home.p1940a.p1943c.C23571er;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23447av;
import com.google.android.libraries.home.p1955d.p1956a.C23765a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.c.a.n */
/* compiled from: PG */
public final class C23632n implements C23623e {

    /* renamed from: a */
    public static final C23632n f64652a = new C23632n();

    /* renamed from: b */
    private static final C59071e f64653b = C59071e.m91331h();

    private C23632n() {
    }

    /* renamed from: a */
    public final C23642d mo28939a(Context context, C23404ag agVar) {
        Iterable<String> iterable;
        C69664n.m101061g(agVar, "device");
        C23447av avVar = (C23447av) ((C23571er) C23765a.m44264a(agVar.mo28854a(C23574eu.TEMPERATURE_SETTING, C23447av.class)));
        String str = null;
        String str2 = avVar != null ? avVar.f64168h.f64494c : null;
        if (avVar != null) {
            str = avVar.f64169i.f64494c;
        }
        if (avVar != null) {
            iterable = avVar.f64162b;
        } else {
            iterable = C69498ao.f185920a;
        }
        try {
            String str3 = C23574eu.TEMPERATURE_SETTING.f64575as;
            C23644f fVar = C23644f.f64662a;
            C23649k a = C23633o.m44116a(str2);
            C23649k a2 = C23633o.m44116a(str);
            ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
            for (String a3 : iterable) {
                arrayList.add(C23633o.m44116a(a3));
            }
            return new C23651m(str3, fVar, a, a2, C69540x.m100846ab(arrayList));
        } catch (IllegalArgumentException e) {
            C59052c cVar = (C59052c) ((C59052c) f64653b.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(48673));
            cVar.mo56359L("Invalid combination of mode values: mode %s, activeMode %s, availableModes {%s}", str2, str, iterable);
            return C23644f.f64662a;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ CharSequence mo28940b(Context context, C23404ag agVar) {
        return C23622d.m44099a(agVar);
    }
}
