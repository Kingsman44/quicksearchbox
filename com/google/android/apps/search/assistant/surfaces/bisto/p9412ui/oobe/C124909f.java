package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.assistant.p3861at.C49924ea;
import com.google.assistant.p3861at.C49925eb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.f */
/* compiled from: PG */
public final /* synthetic */ class C124909f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49924ea f344637a;

    public /* synthetic */ C124909f(C49924ea eaVar) {
        this.f344637a = eaVar;
    }

    public final void accept(Object obj) {
        C49924ea eaVar = this.f344637a;
        String str = (String) obj;
        eaVar.copyOnWrite();
        C49925eb ebVar = (C49925eb) eaVar.instance;
        C49925eb ebVar2 = C49925eb.f129768c;
        str.getClass();
        ebVar.f129770a |= 1;
        ebVar.f129771b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
