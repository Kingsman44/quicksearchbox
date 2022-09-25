package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.apps.search.assistant.libraries.p8956c.p8957a.C119257c;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.r */
/* compiled from: PG */
public final /* synthetic */ class C129735r implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ C129703a f356011a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f356012b;

    public /* synthetic */ C129735r(C129703a aVar, AtomicBoolean atomicBoolean) {
        this.f356011a = aVar;
        this.f356012b = atomicBoolean;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C129703a aVar = this.f356011a;
        AtomicBoolean atomicBoolean = this.f356012b;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ((C59052c) C129736s.f356013a.mo56226d()).mo56382g(exc)).mo56372aa(38439)).mo56386p("connection attempt failed");
        if (!C119257c.m197952a(exc)) {
            return false;
        }
        aVar.f355937a.mo19974a(C37176a.f97047eF);
        atomicBoolean.set(true);
        return true;
    }
}
