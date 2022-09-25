package com.google.android.apps.gsa.nga.engine.education;

import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.assistant.p4008y.p4009a.C53577bj;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ah */
/* compiled from: PG */
public final class C75683ah implements C75686ak {

    /* renamed from: a */
    final /* synthetic */ C60870cx f210088a;

    /* renamed from: b */
    final /* synthetic */ Locale f210089b;

    /* renamed from: c */
    final /* synthetic */ C48468h f210090c;

    /* renamed from: d */
    final /* synthetic */ C75688am f210091d;

    public C75683ah(C75688am amVar, C60870cx cxVar, Locale locale, C48468h hVar) {
        this.f210091d = amVar;
        this.f210088a = cxVar;
        this.f210089b = locale;
        this.f210090c = hVar;
    }

    /* renamed from: c */
    private final C60870cx m121976c(C53577bj bjVar) {
        return C60922j.m93044g(this.f210088a, new C75681af(this, bjVar, this.f210089b, this.f210090c), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo71823a() {
        return m121976c(C53577bj.PRIORITY_HIGH);
    }

    /* renamed from: b */
    public final C60870cx mo71824b() {
        return m121976c(C53577bj.PRIORITY_LOW);
    }
}
