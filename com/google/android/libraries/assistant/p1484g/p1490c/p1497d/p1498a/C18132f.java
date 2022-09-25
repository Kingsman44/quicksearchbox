package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b.C18121c;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C18132f implements C18121c {

    /* renamed from: a */
    public final /* synthetic */ Class f51617a;

    public /* synthetic */ C18132f(Class cls) {
        this.f51617a = cls;
    }

    /* renamed from: a */
    public final Object mo23617a(Bundle bundle, String str) {
        Class cls = this.f51617a;
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        return Enum.valueOf(cls, string);
    }
}
