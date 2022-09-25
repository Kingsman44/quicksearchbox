package com.google.android.libraries.assistant.auto.tng.common.p922k.p923a;

import com.google.common.base.C58817ah;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.k.a.b */
/* compiled from: PG */
public final /* synthetic */ class C13275b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13275b f40967a = new C13275b();

    private /* synthetic */ C13275b() {
    }

    public final Object apply(Object obj) {
        List i = C58869cf.m90936b(new C58903m('-')).mo56155i(((String) obj).replace('_', '-'));
        return i.size() == 2 ? new Locale((String) i.get(0), (String) i.get(1)) : Locale.US;
    }
}
