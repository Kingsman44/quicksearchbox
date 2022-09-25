package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.r */
/* compiled from: PG */
public final /* synthetic */ class C125414r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125374ab f345885a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f345886b;

    public /* synthetic */ C125414r(C125374ab abVar, C2164c cVar) {
        this.f345885a = abVar;
        this.f345886b = cVar;
    }

    public final void accept(Object obj) {
        C125374ab abVar = this.f345885a;
        C2164c cVar = this.f345886b;
        ((C59052c) ((C59052c) ((C59052c) C125374ab.f345782a.mo56226d()).mo56382g((Throwable) obj)).mo56372aa(36514)).mo56386p("Dictation shutdown error. [SD]");
        abVar.mo106941d(cVar, C63122a.FAILURE_SHUTDOWN_ERROR);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
