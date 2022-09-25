package com.google.android.libraries.search.assistant.notification.p2711b;

import com.google.common.base.C58817ah;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.l */
/* compiled from: PG */
public final /* synthetic */ class C34864l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f92460a;

    public /* synthetic */ C34864l(String str) {
        this.f92460a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f92460a;
        Optional optional = (Optional) obj;
        Pattern pattern = C34866n.f92462a;
        return optional.isPresent() ? (String) optional.get() : str;
    }
}
