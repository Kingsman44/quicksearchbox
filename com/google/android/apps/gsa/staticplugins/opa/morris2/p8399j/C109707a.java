package com.google.android.apps.gsa.staticplugins.opa.morris2.p8399j;

import android.app.UiModeManager;
import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.morris2.framework.C109638o;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.lang.Thread;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.j.a */
/* compiled from: PG */
public final class C109707a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final C59071e f305612a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.j.a");

    /* renamed from: b */
    private final C14647d f305613b;

    /* renamed from: c */
    private final C109638o f305614c;

    /* renamed from: d */
    private final C14115ap f305615d;

    /* renamed from: e */
    private final UiModeManager f305616e;

    /* renamed from: f */
    private final Thread.UncaughtExceptionHandler f305617f = Thread.getDefaultUncaughtExceptionHandler();

    public C109707a(Context context, C14647d dVar, C109638o oVar, C14115ap apVar) {
        this.f305616e = (UiModeManager) context.getSystemService("uimode");
        this.f305613b = dVar;
        this.f305614c = oVar;
        this.f305615d = apVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C59104x c = f305612a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.ExceptionHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25173)).mo56354G("MorrisUncaughtException: thread: %s, throwable: %s", thread, th);
        this.f305615d.mo21431e(C37182a.f98072fm.mo40813g());
        UiModeManager uiModeManager = this.f305616e;
        if (uiModeManager != null) {
            uiModeManager.disableCarMode(0);
        }
        C109638o oVar = this.f305614c;
        C59104x b = C109638o.f305343a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.LifecycleMng");
        ((C59052c) ((C59052c) b).mo56372aa(24841)).mo56386p("#onMorrisCrashed");
        if (!oVar.f305344b.isEmpty()) {
            C58800sl lA = oVar.f305344b.iterator();
            while (lA.hasNext()) {
                ((C14985g) lA.next()).mo21501a();
            }
        }
        this.f305613b.mo21596F(3);
        this.f305615d.mo21428b(C37182a.f98073fn.mo40805c(C62722b.OK), this.f305613b.mo21608v());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f305617f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
