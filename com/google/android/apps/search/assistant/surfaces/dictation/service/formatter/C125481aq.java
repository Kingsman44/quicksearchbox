package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.common.p4526f.C59052c;
import java.util.Locale;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.aq */
/* compiled from: PG */
public final /* synthetic */ class C125481aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Locale f346035a;

    public /* synthetic */ C125481aq(Locale locale) {
        this.f346035a = locale;
    }

    public final void accept(Object obj) {
        C125472ah ahVar = (C125472ah) obj;
        ((C59052c) ((C59052c) C125482ar.f346036a.mo56224b()).mo56372aa(36600)).mo56389s("Loaded NativeFormatter for %s [SD]", this.f346035a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
