package com.google.apps.p3589d.p3596g;

import com.google.apps.p3589d.p3591b.C45717h;
import com.google.apps.p3589d.p3591b.C45724o;
import com.google.apps.p3589d.p3593d.C45763v;

/* renamed from: com.google.apps.d.g.t */
/* compiled from: PG */
public final /* synthetic */ class C45852t implements C45717h {

    /* renamed from: a */
    public final /* synthetic */ C45832ah f120551a;

    /* renamed from: b */
    public final /* synthetic */ C45724o f120552b;

    public /* synthetic */ C45852t(C45832ah ahVar, C45724o oVar) {
        this.f120551a = ahVar;
        this.f120552b = oVar;
    }

    /* renamed from: a */
    public final void mo49821a(Object obj, Object obj2) {
        C45832ah ahVar = this.f120551a;
        C45724o oVar = this.f120552b;
        String str = (String) obj;
        C45763v vVar = C45833ai.f120502c;
        String a = ahVar.mo49977a(obj2);
        if (a != null) {
            int i = 0;
            while (i < str.length()) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt < 128) {
                    i += Character.charCount(codePointAt);
                } else {
                    return;
                }
            }
            String str2 = (String) oVar.f120221a.get(a);
            if (str2 != null) {
                if (str.length() > str2.length()) {
                    return;
                }
                if (str.length() == str2.length() && str.compareTo(str2) > 0) {
                    return;
                }
            }
            oVar.f120221a.put(a, str);
        }
    }
}
