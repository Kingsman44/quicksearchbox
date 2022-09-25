package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8391b;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14106ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b.a */
/* compiled from: PG */
public final class C109614a {

    /* renamed from: h */
    private static final C58528ij f305254h = C58528ij.m90013M("android.intent.action.SET_TIMER", "android.intent.action.SET_ALARM", "android.intent.action.SHOW_TIMERS", "android.intent.action.SHOW_ALARMS");

    /* renamed from: a */
    public final C86124t f305255a;

    /* renamed from: b */
    public final C14638a f305256b;

    /* renamed from: c */
    public final KeyguardManager f305257c;

    /* renamed from: d */
    public final C91093c f305258d;

    /* renamed from: e */
    public final C14647d f305259e;

    /* renamed from: f */
    public Optional f305260f = Optional.empty();

    /* renamed from: g */
    public final C14106ag f305261g;

    public C109614a(Context context, C14638a aVar, KeyguardManager keyguardManager, C86124t tVar, C14647d dVar, C14106ag agVar) {
        this.f305258d = new C91093c(context);
        this.f305255a = tVar;
        this.f305256b = aVar;
        this.f305257c = keyguardManager;
        this.f305259e = dVar;
        this.f305261g = agVar;
    }

    /* renamed from: a */
    public final boolean mo97912a(Intent intent) {
        if (!this.f305255a.mo79746e(C90051dc.f248809aQ)) {
            return false;
        }
        if (f305254h.contains(intent.getAction())) {
            return true;
        }
        if (intent.getDataString() == null) {
            return false;
        }
        String dataString = intent.getDataString();
        dataString.getClass();
        if (!dataString.contains("com.google.android.deskclock")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo97913b(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f305260f.isEmpty()) {
            if (i == 2) {
                this.f305261g.mo21411b(C37182a.f97926cz.mo40813g(), Optional.empty());
                this.f305258d.mo65089a((Intent) this.f305260f.get());
            }
            this.f305260f = Optional.empty();
        }
    }
}
