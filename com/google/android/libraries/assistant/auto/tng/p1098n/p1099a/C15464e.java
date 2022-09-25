package com.google.android.libraries.assistant.auto.tng.p1098n.p1099a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16783a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.n.a.e */
/* compiled from: PG */
public final class C15464e implements C35470f {

    /* renamed from: a */
    private static final C58528ij f46379a = C58528ij.m90013M("android.intent.action.SET_TIMER", "android.intent.action.SET_ALARM", "android.intent.action.SHOW_TIMERS", "android.intent.action.SHOW_ALARMS");

    /* renamed from: b */
    private final Context f46380b;

    /* renamed from: c */
    private final C12865i f46381c;

    /* renamed from: d */
    private final C16783a f46382d;

    /* renamed from: e */
    private final C15481g f46383e;

    public C15464e(Context context, C12865i iVar, C16783a aVar, C15481g gVar) {
        this.f46380b = context;
        this.f46381c = iVar;
        this.f46382d = aVar;
        this.f46383e = gVar;
    }

    /* renamed from: f */
    public final C60870cx mo20101f(Intent intent) {
        this.f46383e.mo22352b(C37179a.f97651eK);
        this.f46381c.mo20750c(this.f46382d.mo23011b(intent));
        String action = intent.getAction();
        if (action != null && (action.equals("com.google.android.apps.gsa.staticplugins.opa.morris.SHOW_OVERLAY") || action.equals("com.google.android.apps.gsa.staticplugins.opa.morris.SHOW_FULLSCREEN"))) {
            return C60866ct.f164955a;
        }
        intent.addFlags(268435456);
        String dataString = intent.getDataString();
        if (f46379a.contains(intent.getAction()) || (dataString != null && dataString.contains("com.google.android.deskclock"))) {
            intent.addFlags(C89885b.HTTP_VALUE);
        }
        this.f46380b.startActivity(intent);
        this.f46383e.mo22352b(C37179a.f97653eM);
        return C60866ct.f164955a;
    }
}
