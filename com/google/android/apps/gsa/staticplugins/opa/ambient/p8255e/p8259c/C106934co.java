package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.libraries.p1635au.C19567d;
import com.google.assistant.p3886c.C50706ar;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.time.Duration;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.co */
/* compiled from: PG */
public final /* synthetic */ class C106934co implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106941cv f297859a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f297860b;

    /* renamed from: c */
    public final /* synthetic */ Optional f297861c;

    public /* synthetic */ C106934co(C106941cv cvVar, C106596h hVar, Optional optional) {
        this.f297859a = cvVar;
        this.f297860b = hVar;
        this.f297861c = optional;
    }

    public final Object apply(Object obj) {
        C106941cv cvVar = this.f297859a;
        C106596h hVar = this.f297860b;
        Optional optional = this.f297861c;
        C50706ar arVar = (C50706ar) obj;
        if (C50706ar.f131960a.equals(arVar)) {
            ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23413)).mo56386p("generateChip(): no media recommendations. Default chip will be sent.");
            return Optional.m71637of(cvVar.mo95716f(hVar));
        }
        if (optional.isPresent()) {
            Duration between = Duration.between((Temporal) optional.get(), cvVar.f297876d.mo57444a());
            if (between.abs().compareTo(Duration.ofMillis(cvVar.f297874b.mo79743a(C90017bw.f247953bO))) > 0) {
                ((C58970a) ((C58970a) cvVar.f297873a.mo56226d()).mo56372aa(23412)).mo56388r("Media recommendations timed out. Not sending card.: %d ms", between.toMillis());
                ((C19567d) cvVar.f297879g.f102890bU.mo6453a()).mo24822a(1, new Object[0]);
                return Optional.empty();
            }
        }
        cvVar.f297878f.mo77077a("6/9: Media suggestions generated.");
        return Optional.m71637of(cvVar.mo95715e(arVar, hVar));
    }
}
