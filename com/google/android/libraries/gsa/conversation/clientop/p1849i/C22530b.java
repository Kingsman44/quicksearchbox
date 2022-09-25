package com.google.android.libraries.gsa.conversation.clientop.p1849i;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.adc;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.i.b */
/* compiled from: PG */
public final class C22530b extends C22538o {

    /* renamed from: a */
    private final C22529a f62137a;

    public C22530b(C22529a aVar) {
        this.f62137a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("url.OPEN")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            adc adc = (adc) m41992m(dwVar, "open_url_args", adc.f134873c.getParserForType());
            C22529a aVar = this.f62137a;
            if ((adc.f134875a & 1) == 0) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unable to open url: no url found."));
            }
            if (!URLUtil.isValidUrl(adc.f134876b)) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unable to open url: invalid url found."));
            }
            if (aVar.f62136c.isKeyguardLocked()) {
                ((C59052c) ((C59052c) C22529a.f62134a.mo56226d()).mo56372aa(48311)).mo56389s("%s", "Screen is locked, op-op for open url.");
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.CANCELLED, "Screen is locked, op-op for open url."));
            }
            if (!((C22695ah) aVar.f62135b.mo27525b()).mo27807a(new Intent("android.intent.action.VIEW", Uri.parse(adc.f134876b)))) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, "Unable to open url: startActivity failed for an unknown reason (returned false)."));
            }
            return C60856cj.m92900i(C22402a.f61893a);
        }
        throw new C22428d(dyVar);
    }
}
