package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91010j;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58485gu;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.aa.at */
/* compiled from: PG */
public final class C89022at implements C91010j {

    /* renamed from: a */
    public final int f241279a;

    /* renamed from: b */
    public final String f241280b;

    /* renamed from: c */
    public final C58485gu f241281c;

    /* renamed from: d */
    public final C58485gu f241282d;

    public C89022at(int i, String str, List list, List list2) {
        this.f241279a = i;
        this.f241280b = str;
        this.f241281c = C58485gu.m89842j(list);
        if (list2 != null) {
            this.f241282d = C58485gu.m89842j(list2);
        } else {
            this.f241282d = C58485gu.m89845m();
        }
    }

    /* renamed from: b */
    public static List m144767b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String alVar : (List) entry.getValue()) {
                    arrayList.add(new C89014al((String) entry.getKey(), alVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo83000a(String str, String str2) {
        C58485gu guVar = this.f241281c;
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            C89014al alVar = (C89014al) guVar.get(i);
            i++;
            if (alVar.f241218a.equalsIgnoreCase(str)) {
                return alVar.f241219b;
            }
        }
        return str2;
    }

    /* renamed from: c */
    public final void mo83001c(C89042bm bmVar) {
        if (bmVar.mo83011a(this.f241279a)) {
            return;
        }
        if (mo83002d()) {
            String a = mo83000a("Location", (String) null);
            a.getClass();
            throw new C89017ao(this, a);
        }
        throw new C89013ak(this);
    }

    /* renamed from: d */
    public final boolean mo83002d() {
        if (mo83000a("Location", (String) null) == null) {
            return false;
        }
        int i = this.f241279a;
        return i == 302 || i == 301 || i == 307 || i == 308;
    }

    /* renamed from: e */
    public final boolean mo83003e() {
        return C89042bm.f241318b.mo83011a(this.f241279a);
    }

    /* renamed from: f */
    public final List mo83004f() {
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = this.f241281c;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C89014al alVar = (C89014al) guVar.get(i);
            if (alVar.f241218a.equalsIgnoreCase("Set-Cookie")) {
                arrayList.add(alVar.f241219b);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    public final void mo27451g(C91005e eVar) {
        eVar.mo85277b("%d using %s ", C90752i.m148230d(Integer.valueOf(this.f241279a)), C90752i.m148229c(this.f241280b));
        C89014al.m144738a(eVar, this.f241281c);
        eVar.mo85277b(" redirects: [", new C90752i[0]);
        C58485gu guVar = this.f241282d;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C89024av.m144774a(eVar, (URL) guVar.get(i));
        }
        eVar.mo85277b("]", new C90752i[0]);
    }
}
