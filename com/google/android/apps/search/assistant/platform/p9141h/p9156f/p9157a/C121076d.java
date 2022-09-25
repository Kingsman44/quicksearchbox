package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9157a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121092b;
import com.google.common.base.C58817ah;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.a.d */
/* compiled from: PG */
public final /* synthetic */ class C121076d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C121076d f336484a = new C121076d();

    private /* synthetic */ C121076d() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (String str : ((C121092b) obj).f336508c) {
            if (str != null) {
                arrayList.add(Locale.forLanguageTag(str));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Locale.getDefault());
        }
        return arrayList;
    }
}
