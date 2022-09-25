package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import android.text.TextUtils;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.m */
/* compiled from: PG */
public final /* synthetic */ class C36889m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36899w f96050a;

    /* renamed from: b */
    public final /* synthetic */ C51593nl f96051b;

    /* renamed from: c */
    public final /* synthetic */ C36906e f96052c;

    public /* synthetic */ C36889m(C36899w wVar, C51593nl nlVar, C36906e eVar) {
        this.f96050a = wVar;
        this.f96051b = nlVar;
        this.f96052c = eVar;
    }

    public final Object apply(Object obj) {
        C36899w wVar = this.f96050a;
        C51593nl nlVar = this.f96051b;
        C36906e eVar = this.f96052c;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            nlVar.copyOnWrite();
            C51594nm nmVar = (C51594nm) nlVar.instance;
            C51594nm nmVar2 = C51594nm.f134474f;
            str.getClass();
            nmVar.f134476a |= 4;
            nmVar.f134480e = str;
        }
        wVar.mo40450g(nlVar, eVar);
        return (C51594nm) nlVar.build();
    }
}
