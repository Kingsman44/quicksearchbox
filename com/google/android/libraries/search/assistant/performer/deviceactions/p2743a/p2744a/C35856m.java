package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C35856m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35862s f93947a;

    public /* synthetic */ C35856m(C35862s sVar) {
        this.f93947a = sVar;
    }

    public final C60870cx apply(Object obj) {
        C35862s sVar = this.f93947a;
        Optional optional = (Optional) obj;
        if (!sVar.f93959g || !optional.isPresent()) {
            return C60856cj.m92900i(false);
        }
        optional.get();
        String str = "1";
        if (true == str.equals(optional.get())) {
            str = "0";
        }
        return sVar.mo39870c(str);
    }
}
