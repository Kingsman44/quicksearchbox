package com.google.android.libraries.search.p3094q.p3095a;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p417d.p418a.C8539as;

/* renamed from: com.google.android.libraries.search.q.a.f */
/* compiled from: PG */
public final /* synthetic */ class C39901f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C39901f f104911a = new C39901f();

    private /* synthetic */ C39901f() {
    }

    public final Object apply(Object obj) {
        C8539as asVar = (C8539as) obj;
        if ((asVar.f29626a & 64) != 0) {
            long j = asVar.f29630e;
            ((C59052c) ((C59052c) C39904i.f104914a.mo56224b()).mo56372aa(53886)).mo56388r("is_applicable:%d", j);
            return Boolean.valueOf((j & 2) != 0);
        }
        throw new C39897b("User prefs do not contain location information");
    }
}
