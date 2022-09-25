package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9157a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121092b;
import com.google.common.base.C58817ah;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.a.b */
/* compiled from: PG */
public final /* synthetic */ class C121074b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C121074b f336482a = new C121074b();

    private /* synthetic */ C121074b() {
    }

    public final Object apply(Object obj) {
        C121092b bVar = (C121092b) obj;
        if ((bVar.f336506a & 1) == 0 || bVar.f336507b.isEmpty()) {
            return Locale.getDefault();
        }
        return Locale.forLanguageTag(bVar.f336507b);
    }
}
