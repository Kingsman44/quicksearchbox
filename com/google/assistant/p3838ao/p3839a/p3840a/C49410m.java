package com.google.assistant.p3838ao.p3839a.p3840a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49550bg;
import com.google.assistant.p3838ao.p3839a.p3845e.C49597d;
import com.google.assistant.p3838ao.p3839a.p3849i.C49670a;
import com.google.protobuf.C62963cj;

/* renamed from: com.google.assistant.ao.a.a.m */
/* compiled from: PG */
final class C49410m implements C49382a {
    /* renamed from: a */
    public final /* synthetic */ boolean mo53258a(C49692r rVar, Object obj) {
        for (C49597d dVar : new C62963cj(((C49550bg) obj).f127858a, C49550bg.f127854b)) {
            if (!((Boolean) ((C49381a) rVar).f127639e.map(C49408k.f127664a).map(new C49409l(dVar)).orElse(false)).booleanValue()) {
                if (C49670a.f128205d.mo54952E(dVar, (String) rVar.mo53266p().orElse(BuildConfig.FLAVOR))) {
                }
            }
            return true;
        }
        return false;
    }
}
