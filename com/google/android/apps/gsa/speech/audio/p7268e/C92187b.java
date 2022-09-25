package com.google.android.apps.gsa.speech.audio.p7268e;

import android.media.AudioTrack;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.speech.audio.e.b */
/* compiled from: PG */
public final /* synthetic */ class C92187b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C92194i f257016a;

    /* renamed from: b */
    public final /* synthetic */ int f257017b;

    public /* synthetic */ C92187b(C92194i iVar, int i) {
        this.f257016a = iVar;
        this.f257017b = i;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C92194i iVar = this.f257016a;
        byte[] b = iVar.f257035f.mo86843b(this.f257017b);
        if (b == null) {
            C58976aa aaVar = C58975e.f156826a;
            return Optional.empty();
        }
        AudioTrack a = iVar.f257035f.mo86842a(b, iVar.f257031b.mo71764y());
        if (a != null) {
            return Optional.m71637of(new C92193h(a, b.length >> 1));
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return Optional.empty();
    }
}
