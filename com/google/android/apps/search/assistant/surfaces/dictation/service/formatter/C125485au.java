package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.unifiedime.C118585c;
import com.google.common.p4522b.C58490gz;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.au */
/* compiled from: PG */
public final /* synthetic */ class C125485au implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f346044a;

    public /* synthetic */ C125485au(C58490gz gzVar) {
        this.f346044a = gzVar;
    }

    public final void accept(Object obj) {
        this.f346044a.mo55429h((String) obj, C118585c.TOP_CONTACTS);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
