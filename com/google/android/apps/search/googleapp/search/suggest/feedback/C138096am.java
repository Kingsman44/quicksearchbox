package com.google.android.apps.search.googleapp.search.suggest.feedback;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.am */
/* compiled from: PG */
public final class C138096am extends C62934bn implements C63001dt {
    public C138096am() {
        super(C138098ao.f375725f);
    }

    /* renamed from: a */
    public final void mo114147a(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        C138098ao aoVar = (C138098ao) this.instance;
        C138098ao aoVar2 = C138098ao.f375725f;
        C62995dn dnVar = aoVar.f375728b;
        if (!dnVar.f170058b) {
            aoVar.f375728b = dnVar.mo58980a();
        }
        aoVar.f375728b.put(str, str2);
    }
}
