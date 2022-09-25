package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.p */
/* compiled from: PG */
public final /* synthetic */ class C112190p implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f311488a;

    public /* synthetic */ C112190p(C58490gz gzVar) {
        this.f311488a = gzVar;
    }

    public final void accept(Object obj, Object obj2) {
        String str = (String) obj;
        try {
            this.f311488a.mo55429h(C48672ag.m85258a(str), Integer.valueOf(Integer.parseInt((String) obj2)));
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C112194t.f311492a.mo56225c()).mo56382g(e)).mo56372aa(27642)).mo56389s("Could not load SourceType: %s", str);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
