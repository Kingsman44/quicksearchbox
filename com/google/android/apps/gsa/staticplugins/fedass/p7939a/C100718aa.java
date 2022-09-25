package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import android.text.TextUtils;
import com.google.android.apps.search.fedora.p10099e.C132803k;
import com.google.android.apps.search.fedora.p10099e.C132804l;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C100718aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f281601a;

    public /* synthetic */ C100718aa(String str) {
        this.f281601a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f281601a;
        C132804l lVar = (C132804l) obj;
        if (TextUtils.isEmpty(str)) {
            C132803k kVar = (C132803k) lVar.toBuilder();
            kVar.copyOnWrite();
            C132804l lVar2 = (C132804l) kVar.instance;
            lVar2.f362341a &= -2;
            lVar2.f362342b = C132804l.f362339e.f362342b;
            return (C132804l) kVar.build();
        }
        C132803k kVar2 = (C132803k) lVar.toBuilder();
        kVar2.copyOnWrite();
        C132804l lVar3 = (C132804l) kVar2.instance;
        str.getClass();
        lVar3.f362341a |= 1;
        lVar3.f362342b = str;
        return (C132804l) kVar2.build();
    }
}
