package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.common.base.C58817ah;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.c */
/* compiled from: PG */
public final /* synthetic */ class C13517c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13517c f41452a = new C13517c();

    private /* synthetic */ C13517c() {
    }

    public final Object apply(Object obj) {
        Locale locale;
        String str = (String) obj;
        if (str.isEmpty()) {
            return Locale.US;
        }
        List i = C58869cf.m90936b(new C58903m('-')).mo56155i(str);
        if (i.size() == 2) {
            locale = new Locale((String) i.get(0), (String) i.get(1));
        } else {
            locale = new Locale((String) i.get(0));
        }
        return locale;
    }
}
