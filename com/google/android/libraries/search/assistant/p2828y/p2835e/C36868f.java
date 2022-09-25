package com.google.android.libraries.search.assistant.p2828y.p2835e;

import android.text.TextUtils;
import com.google.assistant.p3897e.p3917i.p3918a.C51262be;
import com.google.assistant.p3897e.p3917i.p3918a.C51264bg;
import com.google.assistant.p3897e.p3917i.p3918a.C51265bh;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.assistant.y.e.f */
/* compiled from: PG */
public final /* synthetic */ class C36868f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51262be f96014a;

    /* renamed from: b */
    public final /* synthetic */ C51265bh f96015b;

    public /* synthetic */ C36868f(C51262be beVar, C51265bh bhVar) {
        this.f96014a = beVar;
        this.f96015b = bhVar;
    }

    public final Object apply(Object obj) {
        C51262be beVar = this.f96014a;
        C51265bh bhVar = this.f96015b;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            beVar.mo53562a(str);
        }
        C51264bg bgVar = (C51264bg) beVar.build();
        bhVar.copyOnWrite();
        C51270bm bmVar = (C51270bm) bhVar.instance;
        C51270bm bmVar2 = C51270bm.f133476f;
        bgVar.getClass();
        bmVar.f133480c = bgVar;
        bmVar.f133479b = 1;
        return C58833ax.m90834k((C51270bm) bhVar.build());
    }
}
