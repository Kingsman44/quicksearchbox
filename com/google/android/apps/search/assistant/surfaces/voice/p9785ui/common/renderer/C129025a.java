package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer;

import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62974ct;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a */
/* compiled from: PG */
public final /* synthetic */ class C129025a {
    /* renamed from: a */
    public static C129228e m210612a(C51809dy dyVar, C33480d dVar, Function function) {
        try {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            return (C129228e) dVar.mo38884e(dwVar.f135932a).map(function).orElse(C129228e.f354974b);
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C129107b.f354686a.mo56226d()).mo56382g(e)).mo56372aa(38086)).mo56389s("Error while rendering ClientOp : %s", dyVar.f135936b);
            return C129228e.f354973a;
        }
    }
}
