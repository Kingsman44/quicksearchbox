package com.google.android.apps.gsa.nga.engine.p6140t;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.t.g */
/* compiled from: PG */
public final /* synthetic */ class C77967g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C77968h f214723a;

    /* renamed from: b */
    public final /* synthetic */ Locale f214724b;

    public /* synthetic */ C77967g(C77968h hVar, Locale locale) {
        this.f214723a = hVar;
        this.f214724b = locale;
    }

    public final Object apply(Object obj) {
        C77968h hVar = this.f214723a;
        Locale locale = this.f214724b;
        List list = (List) obj;
        synchronized (hVar.f214725a) {
            if (hVar.f214726b) {
                hVar.mo72931e(list, locale);
                hVar.f214726b = false;
            }
        }
        return C118826c.f331422a;
    }
}
