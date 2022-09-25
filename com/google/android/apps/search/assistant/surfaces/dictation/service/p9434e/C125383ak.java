package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125097by;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126294ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126310as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126348y;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126349z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.ak */
/* compiled from: PG */
public final class C125383ak implements C126294ac, C126310as {

    /* renamed from: a */
    public static final C59071e f345815a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.e.ak");

    /* renamed from: b */
    public final C125373aa f345816b;

    /* renamed from: c */
    public final Executor f345817c;

    /* renamed from: d */
    public C125374ab f345818d;

    /* renamed from: e */
    private final C125937z f345819e;

    public C125383ak(C125937z zVar, C125373aa aaVar, Executor executor) {
        this.f345819e = zVar;
        this.f345816b = aaVar;
        this.f345817c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo106949a(C125097by byVar) {
        C125381ai aiVar = new C125381ai(this, byVar);
        return C60856cj.m92903l(C47810es.m84977q(aiVar), this.f345817c);
    }

    /* renamed from: b */
    public final C60870cx mo106950b(C119297s sVar) {
        C60870cx c = mo106951c();
        C125378af afVar = new C125378af(sVar);
        return C60922j.m93045h(c, C47810es.m84966f(afVar), this.f345817c);
    }

    /* renamed from: c */
    public final C60870cx mo106951c() {
        C125376ad adVar = new C125376ad(this);
        return C60856cj.m92904m(C47810es.m84978r(adVar), this.f345817c);
    }

    /* renamed from: d */
    public final C60870cx mo106952d(C126292aa aaVar, int i, C126348y yVar) {
        if (!this.f345819e.mo107202a().mo107196o()) {
            C126349z d = aaVar.mo107511d();
            d.mo107550e(C119299u.DEFAULT);
            aaVar = d.mo107546a();
        }
        C125379ag agVar = new C125379ag(this, aaVar, yVar, i);
        return C60856cj.m92905n(C47810es.m84965e(agVar), this.f345817c);
    }
}
