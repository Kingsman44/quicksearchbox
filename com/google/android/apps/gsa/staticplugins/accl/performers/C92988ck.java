package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52144gw;
import com.google.assistant.p3897e.p3921j.C52150hb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ck */
/* compiled from: PG */
public final class C92988ck extends C22538o {

    /* renamed from: a */
    private final int f259387a;

    /* renamed from: b */
    private final C22695ah f259388b;

    public C92988ck(int i, C22695ah ahVar) {
        this.f259387a = i;
        this.f259388b = ahVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C52150hb hbVar = (C52150hb) m41992m(dwVar, "feedback_completion_args", C52150hb.f136843e.getParserForType());
        if (this.f259387a == 5) {
            Intent intent = new Intent("com.google.android.voicesearch.USER_INITIATED_FEEDBACK");
            if (!hbVar.f136846b.isEmpty()) {
                intent.putExtra("com.google.android.voicesearch.USER_INITIATIED_FEEDBACK_MESSAGE", hbVar.f136846b);
            }
            if (!hbVar.f136847c.isEmpty()) {
                Bundle bundle = new Bundle();
                for (C52144gw gwVar : hbVar.f136847c) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(gwVar.f136823a, gwVar.f136824b);
                    bundle.putBundle(gwVar.f136823a, bundle2);
                }
                intent.putExtra("com.google.android.voicesearch.SHERLOG_LINKS", bundle);
            }
            intent.putExtra("com.google.android.voicesearch.IS_ASSISTANT_AUTO_TNG_FEEDBACK", false);
            this.f259388b.mo27807a(intent);
        }
        return C60856cj.m92900i(C22402a.f61893a);
    }
}
