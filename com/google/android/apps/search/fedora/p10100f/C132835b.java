package com.google.android.apps.search.fedora.p10100f;

import android.text.TextUtils;
import com.google.android.apps.search.fedora.p10099e.C132788as;
import com.google.android.apps.search.fedora.p10099e.C132789at;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.fedora.f.b */
/* compiled from: PG */
public final /* synthetic */ class C132835b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f362440a;

    public /* synthetic */ C132835b(String str) {
        this.f362440a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f362440a;
        C132789at atVar = (C132789at) obj;
        if (TextUtils.isEmpty(str)) {
            C132788as asVar = (C132788as) atVar.toBuilder();
            asVar.copyOnWrite();
            C132789at atVar2 = (C132789at) asVar.instance;
            atVar2.f362291a &= -3;
            atVar2.f362293c = C132789at.f362289d.f362293c;
            return (C132789at) asVar.build();
        }
        C132788as asVar2 = (C132788as) atVar.toBuilder();
        asVar2.copyOnWrite();
        C132789at atVar3 = (C132789at) asVar2.instance;
        str.getClass();
        atVar3.f362291a |= 2;
        atVar3.f362293c = str;
        return (C132789at) asVar2.build();
    }
}
