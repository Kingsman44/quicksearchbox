package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p769a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11058c;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C12193b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f38905a;

    /* renamed from: b */
    public final /* synthetic */ String f38906b = BuildConfig.FLAVOR;

    public /* synthetic */ C12193b(String str) {
        this.f38905a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f38905a;
        String str2 = this.f38906b;
        C62995dn dnVar = ((C11058c) obj).f36305a;
        return dnVar.containsKey(str) ? (String) dnVar.get(str) : str2;
    }
}
