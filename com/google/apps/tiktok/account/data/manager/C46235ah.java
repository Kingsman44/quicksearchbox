package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.data.manager.p3615a.C46225f;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.apps.tiktok.account.data.manager.ah */
/* compiled from: PG */
public final /* synthetic */ class C46235ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f121208a;

    public /* synthetic */ C46235ah(String str) {
        this.f121208a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f121208a;
        C62995dn dnVar = ((C46225f) obj).f121182a;
        return Boolean.valueOf(!(dnVar.containsKey(str) ? ((Boolean) dnVar.get(str)).booleanValue() : false));
    }
}
