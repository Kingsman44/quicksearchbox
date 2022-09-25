package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Iterator;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C124222h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124234t f343004a;

    public /* synthetic */ C124222h(C124234t tVar) {
        this.f343004a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124234t tVar = this.f343004a;
        String str = null;
        if (tVar.f343029h.isEmpty()) {
            tVar.f343032k = null;
            return C60866ct.f164955a;
        }
        Iterator it = tVar.f343029h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (Collection.EL.stream(tVar.f343028g).anyMatch(new C124225k(str2))) {
                str = str2;
                break;
            }
        }
        boolean z = false;
        if (str != null && !str.equals(tVar.f343032k)) {
            z = true;
        }
        tVar.f343032k = str;
        if (!z) {
            return C60866ct.f164955a;
        }
        String str3 = tVar.f343032k;
        str3.getClass();
        return tVar.mo106339b(str3, C124234t.f343023b);
    }
}
