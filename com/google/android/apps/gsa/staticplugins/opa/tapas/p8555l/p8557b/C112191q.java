package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.q */
/* compiled from: PG */
public final /* synthetic */ class C112191q implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f311489a;

    public /* synthetic */ C112191q(C58490gz gzVar) {
        this.f311489a = gzVar;
    }

    public final void accept(Object obj, Object obj2) {
        String str = (String) obj;
        try {
            this.f311489a.mo55429h(C48580an.m85240a(str), Integer.valueOf(Integer.parseInt((String) obj2)));
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C112194t.f311492a.mo56225c()).mo56382g(e)).mo56372aa(27643)).mo56389s("Could not load SuggestionType: %s", str);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
