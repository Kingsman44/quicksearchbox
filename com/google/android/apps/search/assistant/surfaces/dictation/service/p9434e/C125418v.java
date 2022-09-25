package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.common.p4526f.C59052c;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.v */
/* compiled from: PG */
public final /* synthetic */ class C125418v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125374ab f345891a;

    public /* synthetic */ C125418v(C125374ab abVar) {
        this.f345891a = abVar;
    }

    public final void accept(Object obj) {
        C125374ab abVar = this.f345891a;
        ((C59052c) ((C59052c) ((C59052c) C125374ab.f345782a.mo56225c()).mo56382g((Throwable) obj)).mo56372aa(36517)).mo56389s("%s failed to start [SD]", abVar.f345783b.f345877q);
        abVar.mo106943f(C63122a.FAILURE_START_AUDIO_LIBRARY_ERROR);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
