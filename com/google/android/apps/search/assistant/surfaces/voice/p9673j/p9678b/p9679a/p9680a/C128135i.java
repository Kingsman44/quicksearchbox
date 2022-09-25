package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128189u;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C128135i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128148v f352518a;

    /* renamed from: b */
    public final /* synthetic */ C128189u f352519b;

    /* renamed from: c */
    public final /* synthetic */ Duration f352520c;

    public /* synthetic */ C128135i(C128148v vVar, C128189u uVar, Duration duration) {
        this.f352518a = vVar;
        this.f352519b = uVar;
        this.f352520c = duration;
    }

    public final void accept(Object obj) {
        C62722b bVar;
        C128148v vVar = this.f352518a;
        C128189u uVar = this.f352519b;
        Duration duration = this.f352520c;
        Throwable th = (Throwable) obj;
        C59104x b = C128148v.f352539a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreSuggestionsSrv");
        ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(37770)).mo56353F("Fetching data from '%s' provider has failed (timeAllowance=%d ms).", uVar.name(), duration.toMillis());
        C37215b bVar2 = vVar.f352542d;
        C37252a j = C37176a.f97033ds.mo40816j("source", uVar.name());
        if (th instanceof TimeoutException) {
            bVar = C62722b.DEADLINE_EXCEEDED;
        } else {
            bVar = C62722b.INTERNAL;
        }
        j.mo40781e(bVar);
        bVar2.mo19974a(j);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
