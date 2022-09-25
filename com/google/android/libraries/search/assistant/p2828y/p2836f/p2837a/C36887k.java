package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import android.text.TextUtils;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.k */
/* compiled from: PG */
public final /* synthetic */ class C36887k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36899w f96046a;

    /* renamed from: b */
    public final /* synthetic */ C51500k f96047b;

    /* renamed from: c */
    public final /* synthetic */ C36906e f96048c;

    public /* synthetic */ C36887k(C36899w wVar, C51500k kVar, C36906e eVar) {
        this.f96046a = wVar;
        this.f96047b = kVar;
        this.f96048c = eVar;
    }

    public final Object apply(Object obj) {
        C36899w wVar = this.f96046a;
        C51500k kVar = this.f96047b;
        C36906e eVar = this.f96048c;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            kVar.copyOnWrite();
            C51527l lVar = (C51527l) kVar.instance;
            C51527l lVar2 = C51527l.f134273f;
            str.getClass();
            lVar.f134275a |= 8;
            lVar.f134279e = str;
        }
        wVar.mo40449f(kVar, eVar);
        return (C51527l) kVar.build();
    }
}
