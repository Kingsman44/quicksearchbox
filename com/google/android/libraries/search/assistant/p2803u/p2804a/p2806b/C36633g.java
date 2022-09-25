package com.google.android.libraries.search.assistant.p2803u.p2804a.p2806b;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.search.assistant.u.a.b.g */
/* compiled from: PG */
public final /* synthetic */ class C36633g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f95479a;

    /* renamed from: b */
    public final /* synthetic */ int f95480b;

    public /* synthetic */ C36633g(String str, int i) {
        this.f95479a = str;
        this.f95480b = i;
    }

    public final Object apply(Object obj) {
        String str = this.f95479a;
        int i = this.f95480b;
        C36628b bVar = (C36628b) ((C36631e) obj).toBuilder();
        bVar.copyOnWrite();
        C36631e eVar = (C36631e) bVar.instance;
        C62995dn dnVar = eVar.f95476a;
        if (!dnVar.f170058b) {
            eVar.f95476a = dnVar.mo58980a();
        }
        eVar.f95476a.put(str, Integer.valueOf(i));
        return (C36631e) bVar.build();
    }
}
