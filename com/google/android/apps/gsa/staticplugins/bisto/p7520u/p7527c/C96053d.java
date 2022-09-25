package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7527c;

import androidx.p060c.C0977g;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.p1730f.C21370a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.c.d */
/* compiled from: PG */
public final class C96053d {

    /* renamed from: a */
    private final Map f268934a = new C0977g();

    /* renamed from: b */
    private final C21370a f268935b;

    public C96053d(C21370a aVar) {
        this.f268935b = aVar;
    }

    /* renamed from: c */
    private final synchronized void m159308c() {
        Map.EL.forEach(this.f268934a, new C96050a(this.f268935b.mo26871c()));
    }

    /* renamed from: a */
    public final synchronized String mo89909a(String str) {
        C96052c cVar;
        m159308c();
        List list = (List) this.f268934a.get(str);
        long c = this.f268935b.mo26871c();
        cVar = new C96052c(String.format(Locale.getDefault(), "%x.%x", new Object[]{Long.valueOf(c), Long.valueOf(C90719ac.f253778a.mo85083a())}), c);
        if (list != null) {
            list.add(cVar);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cVar);
            this.f268934a.put(str, arrayList);
        }
        return cVar.f268933b;
    }

    /* renamed from: b */
    public final synchronized boolean mo89910b(String str, String str2) {
        m159308c();
        List list = (List) this.f268934a.get(str2);
        if (list == null) {
            return false;
        }
        return list.remove(new C96052c(str, 0));
    }
}
