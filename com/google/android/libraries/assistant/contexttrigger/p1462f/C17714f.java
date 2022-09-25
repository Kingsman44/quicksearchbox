package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3803ag.p3807b.p3808a.C48888ac;
import com.google.assistant.p3803ag.p3807b.p3808a.C48893ah;
import com.google.assistant.p3803ag.p3807b.p3808a.C48897al;
import com.google.assistant.p3803ag.p3809c.C48950ax;
import com.google.assistant.p3803ag.p3809c.C48952az;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.f */
/* compiled from: PG */
public final /* synthetic */ class C17714f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C17716h f50912a;

    /* renamed from: b */
    public final /* synthetic */ C48950ax f50913b;

    public /* synthetic */ C17714f(C17716h hVar, C48950ax axVar) {
        this.f50912a = hVar;
        this.f50913b = axVar;
    }

    public final void accept(Object obj) {
        C17716h hVar = this.f50912a;
        C48950ax axVar = this.f50913b;
        C48897al alVar = (C48897al) ((C48893ah) obj).instance;
        String str = alVar.f126529b == 4 ? (String) alVar.f126530c : BuildConfig.FLAVOR;
        C48888ac acVar = (C48888ac) hVar.f50920d.get(str);
        acVar.getClass();
        C48952az azVar = acVar.f126512d;
        if (azVar == null) {
            azVar = C48952az.f126657c;
        }
        axVar.mo53202b(azVar);
        hVar.f50920d.remove(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
