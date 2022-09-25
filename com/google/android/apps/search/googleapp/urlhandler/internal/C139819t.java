package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.Intent;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133759b;
import com.google.android.apps.search.googleapp.customtabs.p10155e.C133760c;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60492rx;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.t */
/* compiled from: PG */
public final /* synthetic */ class C139819t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139811l f380039a;

    /* renamed from: b */
    public final /* synthetic */ C60492rx f380040b;

    /* renamed from: c */
    public final /* synthetic */ C133759b f380041c;

    public /* synthetic */ C139819t(C139811l lVar, C60492rx rxVar, C133759b bVar) {
        this.f380039a = lVar;
        this.f380040b = rxVar;
        this.f380041c = bVar;
    }

    public final Object apply(Object obj) {
        C139811l lVar = this.f380039a;
        C60492rx rxVar = this.f380040b;
        C133759b bVar = this.f380041c;
        C133760c cVar = (C133760c) obj;
        Intent intent = new Intent(cVar.f364322a);
        C133731q qVar = cVar.f364323b;
        C139820u.m227326d(intent, lVar);
        C139821v m = UrlIntentResult.m227288m();
        Integer num = null;
        ProtoParsers.InternalDontUse internalDontUse = new ProtoParsers.InternalDontUse((byte[]) null, lVar);
        C139799a aVar = (C139799a) m;
        aVar.f379960a = internalDontUse;
        m.mo115290j(intent);
        if (qVar != null) {
            num = Integer.valueOf(qVar.f364235d);
        }
        boolean z = false;
        if (num == null) {
            m.mo115272c(false);
        } else {
            m.mo115272c(true);
            aVar.f379963d = num;
        }
        m.mo115291k(rxVar);
        m.mo115277h(!(cVar.f364324c == 2));
        if (cVar.f364324c == 1) {
            z = true;
        }
        m.mo115278i(z);
        m.mo115271b(bVar.f364319f);
        aVar.f379964e = 2;
        return m.mo115270a();
    }
}
