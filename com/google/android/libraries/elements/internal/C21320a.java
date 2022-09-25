package com.google.android.libraries.elements.internal;

import android.support.rastermill.FrameSequenceDrawable;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.libraries.elements.internal.a */
/* compiled from: PG */
public final /* synthetic */ class C21320a implements FrameSequenceDrawable.OnFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ C21341b f59682a;

    public /* synthetic */ C21320a(C21341b bVar) {
        this.f59682a = bVar;
    }

    public final void onFinished(FrameSequenceDrawable frameSequenceDrawable) {
        C21341b bVar = this.f59682a;
        CommandOuterClass$Command commandOuterClass$Command = bVar.f59706a;
        if (commandOuterClass$Command != null) {
            bVar.f59709d.mo26124a(commandOuterClass$Command, C21311r.m40252k().mo26698a()).mo61453k();
        }
        frameSequenceDrawable.setLoopBehavior(1);
        frameSequenceDrawable.setLoopCount(1);
        frameSequenceDrawable.start();
    }
}
