package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.ae */
/* compiled from: PG */
public final /* synthetic */ class C35612ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35617aj f93459a;

    /* renamed from: b */
    public final /* synthetic */ C35615ah f93460b;

    /* renamed from: c */
    public final /* synthetic */ List f93461c;

    /* renamed from: d */
    public final /* synthetic */ int f93462d;

    /* renamed from: e */
    public final /* synthetic */ String f93463e;

    public /* synthetic */ C35612ae(C35617aj ajVar, C35615ah ahVar, List list, int i, String str) {
        this.f93459a = ajVar;
        this.f93460b = ahVar;
        this.f93461c = list;
        this.f93462d = i;
        this.f93463e = str;
    }

    public final C60870cx apply(Object obj) {
        C35617aj ajVar = this.f93459a;
        C35615ah ahVar = this.f93460b;
        List list = this.f93461c;
        int i = this.f93462d;
        String str = this.f93463e;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            return C60856cj.m92898g();
        }
        C59104x d = C35616ai.f93468a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ReadExecutor");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(51755)).mo56386p("Failed to execute online tts request, falling back to offline TTS mode.");
        ajVar.mo21080e();
        return ahVar.mo39745b().mo21073a((BundledMessageNotification) list.get(i), str);
    }
}
