package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119133o;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import org.json.JSONObject;
import p5285d.p5290b.p5291a.p5292a.C68177bm;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.q */
/* compiled from: PG */
public final /* synthetic */ class C89313q implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C89313q f242134a = new C89313q();

    private /* synthetic */ C89313q() {
    }

    public final Object apply(Object obj) {
        C119133o oVar = (C119133o) obj;
        Integer valueOf = Integer.valueOf(oVar.f332286a);
        String str = oVar.f332287b;
        int b = C68177bm.m98503b(oVar.f332288c);
        if (b == 0) {
            b = 1;
        }
        return new JSONObject(C58495hd.m89904r("index", valueOf, "text", str, "type", Integer.valueOf(C68177bm.m98502a(b)), "offset", Integer.valueOf(oVar.f332289d), "length", Integer.valueOf(oVar.f332290e)));
    }
}
