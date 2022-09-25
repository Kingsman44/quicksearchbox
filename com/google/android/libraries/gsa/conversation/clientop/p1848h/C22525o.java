package com.google.android.libraries.gsa.conversation.clientop.p1848h;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C52008hg;
import com.google.assistant.p3897e.p3921j.p3926e.C52009hh;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.h.o */
/* compiled from: PG */
public final class C22525o extends C22538o {

    /* renamed from: a */
    private final C22524n f62127a;

    public C22525o(C22524n nVar) {
        this.f62127a = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("ui.SHOW_TOAST")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52009hh hhVar = (C52009hh) m41992m(dwVar, "show_toast_args", C52009hh.f136493d.getParserForType());
            C22524n nVar = this.f62127a;
            int i = 1;
            if ((hhVar.f136495a & 1) != 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                int a = C52008hg.m86467a(hhVar.f136497c);
                if (a == 0 || a == 1) {
                    i = 0;
                }
                handler.post(new C22523m(nVar, hhVar, i));
                return C22538o.f62144n;
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
