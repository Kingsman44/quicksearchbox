package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import android.content.Intent;
import android.os.Bundle;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.b */
/* compiled from: PG */
public final /* synthetic */ class C92952b implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C92955d f259300a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f259301b;

    public /* synthetic */ C92952b(C92955d dVar, Bundle bundle) {
        this.f259300a = dVar;
        this.f259301b = bundle;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        List list;
        C92955d dVar = this.f259300a;
        Bundle bundle = this.f259301b;
        C92934ai aiVar = dVar.f259306b;
        Objects.requireNonNull(cVar);
        C92932ag agVar = new C92932ag(aiVar, bundle, new C92925a(cVar));
        if (!aiVar.f259268e && !aiVar.f259269f) {
            aiVar.f259266c.bindService(new Intent().setComponent(aiVar.f259265b).setAction("android.voiceinteraction.GsaVoiceInteractionService"), aiVar.f259271h, 1);
            aiVar.f259270g = new ArrayList();
            aiVar.f259269f = true;
        }
        if (!aiVar.f259269f || (list = aiVar.f259270g) == null) {
            agVar.mo87485a(aiVar.f259268e);
            return "DevicePowerPerformer.showPowerMenu";
        }
        list.add(agVar);
        return "DevicePowerPerformer.showPowerMenu";
    }
}
