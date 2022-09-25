package com.google.apps.tiktok.monitoring.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.googlehelp.C144291g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.u */
/* compiled from: PG */
public final class C47484u implements C47489z {

    /* renamed from: a */
    public final Context f123296a;

    /* renamed from: b */
    public final C47481r f123297b;

    /* renamed from: c */
    public final C69464a f123298c;

    /* renamed from: d */
    private final C47471i f123299d;

    /* renamed from: e */
    private final C60887da f123300e;

    public C47484u(Context context, C47471i iVar, C47481r rVar, C60887da daVar, C69464a aVar) {
        this.f123296a = context;
        this.f123299d = iVar;
        this.f123297b = rVar;
        this.f123300e = daVar;
        this.f123298c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo51338a(C58833ax axVar, C47488y yVar, C47475l lVar, Activity activity) {
        return C60922j.m93044g(this.f123299d.mo51330a(axVar, lVar, new C47482s(this, activity)), C47810es.m84963c(new C47483t(this, yVar, lVar)), this.f123300e);
    }

    /* renamed from: b */
    public final void mo51339b(Activity activity, Intent intent) {
        new C144291g(activity).mo119820c(intent);
    }
}
