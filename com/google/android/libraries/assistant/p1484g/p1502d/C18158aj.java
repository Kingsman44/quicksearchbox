package com.google.android.libraries.assistant.p1484g.p1502d;

import android.app.DirectAction;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.service.voice.VoiceInteractionSession;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.g.d.aj */
/* compiled from: PG */
public final class C18158aj extends C18154af {

    /* renamed from: a */
    public static final C58974d f51638a = C58974d.m91136j();

    /* renamed from: b */
    private final VoiceInteractionSession.ActivityId f51639b;

    /* renamed from: c */
    private final VoiceInteractionSession f51640c;

    public C18158aj(VoiceInteractionSession.ActivityId activityId, VoiceInteractionSession voiceInteractionSession) {
        this.f51639b = activityId;
        this.f51640c = voiceInteractionSession;
    }

    /* renamed from: e */
    public final void mo23639e(DirectAction directAction, Bundle bundle, C18149aa aaVar) {
        this.f51640c.performDirectAction(directAction, bundle, (CancellationSignal) null, C60826bg.f164896a, Consumer.Wrapper.convert(new C18157ai(aaVar)));
    }

    /* renamed from: f */
    public final void mo23640f(int i, C18152ad adVar) {
        if (i != this.f51639b.hashCode()) {
            try {
                adVar.mo20095a(C58485gu.m89845m());
            } catch (RemoteException e) {
                ((C58970a) ((C58970a) ((C58970a) f51638a.mo56226d()).mo56382g(e)).mo56372aa(47071)).mo56386p("Could not send direct actions response");
            }
        } else {
            this.f51640c.requestDirectActions(this.f51639b, (CancellationSignal) null, C60826bg.f164896a, Consumer.Wrapper.convert(new C18156ah(adVar)));
        }
    }
}
