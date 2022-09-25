package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.m */
/* compiled from: PG */
final class C130004m implements Consumer {

    /* renamed from: a */
    public static final C130004m f356526a = new C130004m();

    public final /* synthetic */ void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            C59052c cVar = (C59052c) C129868c.f356274a.mo56225c();
            cVar.mo56379ah(new C59094n(38572));
            cVar.mo56386p("Navigation hint update failed.");
            return;
        }
        C59052c cVar2 = (C59052c) ((C59052c) C129868c.f356274a.mo56225c()).mo56382g(th);
        cVar2.mo56379ah(new C59094n(38571));
        cVar2.mo56386p("Navigation hint update failed.");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
