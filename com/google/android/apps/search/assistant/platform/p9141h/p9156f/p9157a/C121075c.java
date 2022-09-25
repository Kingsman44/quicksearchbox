package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9157a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121091a;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121092b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.a.c */
/* compiled from: PG */
public final /* synthetic */ class C121075c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f336483a;

    public /* synthetic */ C121075c(List list) {
        this.f336483a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f336483a;
        C121091a aVar = (C121091a) ((C121092b) obj).toBuilder();
        aVar.copyOnWrite();
        ((C121092b) aVar.instance).f336508c = C62942bv.emptyProtobufList();
        if (list != null) {
            C58801sm G = ((C58485gu) list).listIterator(0);
            while (G.hasNext()) {
                aVar.mo105048a(((Locale) G.next()).toLanguageTag());
            }
        }
        return (C121092b) aVar.build();
    }
}
