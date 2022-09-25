package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.c */
/* compiled from: PG */
final class C14904c extends AudioDeviceCallback {

    /* renamed from: a */
    final /* synthetic */ C14986h f44824a;

    /* renamed from: b */
    final /* synthetic */ C14905d f44825b;

    public C14904c(C14905d dVar, C14986h hVar) {
        this.f44825b = dVar;
        this.f44824a = hVar;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        int i = C14905d.f44826a;
        C58976aa aaVar = C58975e.f156826a;
        this.f44824a.mo21875g(C14742l.m31046b(this.f44825b.mo21813a()));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        int i = C14905d.f44826a;
        C58976aa aaVar = C58975e.f156826a;
        this.f44824a.mo21875g(C14742l.m31046b(this.f44825b.mo21813a()));
    }
}
