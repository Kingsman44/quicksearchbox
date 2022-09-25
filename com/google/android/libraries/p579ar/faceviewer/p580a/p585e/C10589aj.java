package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import com.google.android.libraries.p579ar.faceviewer.runtime.ExperienceJni;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protos.youtube.p5162a.p5163a.C65979ai;
import com.google.protos.youtube.p5162a.p5163a.C65980aj;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.aj */
/* compiled from: PG */
public final /* synthetic */ class C10589aj implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C10589aj f35417a = new C10589aj();

    private /* synthetic */ C10589aj() {
    }

    public final Object apply(Object obj) {
        ExperienceJni experienceJni = ((C10622w) obj).f35494a;
        try {
            return (C65980aj) ((C65979ai) ((C65979ai) C65980aj.f179453c.createBuilder()).mergeFrom(experienceJni.nativeGetWebConfigProto(experienceJni.f35575b), C62921ba.m95368a())).build();
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) ExperienceJni.f35574a.mo56225c()).mo56382g(e)).mo56372aa(42305)).mo56386p("Error parsing WeebConfig.");
            return null;
        }
    }
}
