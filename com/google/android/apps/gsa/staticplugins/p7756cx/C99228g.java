package com.google.android.apps.gsa.staticplugins.p7756cx;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91757c;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.C145778g;
import com.google.android.libraries.p11024al.p11025a.C147746b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.g */
/* compiled from: PG */
public final /* synthetic */ class C99228g implements C91757c {

    /* renamed from: a */
    public final /* synthetic */ C99233l f277594a;

    /* renamed from: b */
    public final /* synthetic */ String f277595b;

    public /* synthetic */ C99228g(C99233l lVar, String str) {
        this.f277594a = lVar;
        this.f277595b = str;
    }

    /* renamed from: a */
    public final Object mo86253a(C143851w wVar) {
        C99233l lVar = this.f277594a;
        C60870cx g = C60922j.m93044g(lVar.f277608f.mo124430a(C145778g.f394146c, wVar, this.f277595b), new C147746b(wVar), C60826bg.f164896a);
        boolean z = false;
        if (C90877ak.m148472f(g) != null && ((Status) C90877ak.m148472f(g)).mo119097c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
