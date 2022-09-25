package com.google.android.libraries.assistant.assistantactions.p621c.p622a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C11061f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f36308a;

    /* renamed from: b */
    public final /* synthetic */ String f36309b = BuildConfig.FLAVOR;

    public /* synthetic */ C11061f(String str) {
        this.f36308a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f36308a;
        String str2 = this.f36309b;
        C62995dn dnVar = ((C11058c) obj).f36305a;
        return dnVar.containsKey(str) ? (String) dnVar.get(str) : str2;
    }
}
