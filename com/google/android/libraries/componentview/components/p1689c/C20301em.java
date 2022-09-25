package com.google.android.libraries.componentview.components.p1689c;

import com.google.android.libraries.componentview.components.p1689c.p1690a.C20150bt;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20153bw;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20156bz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.c.em */
/* compiled from: PG */
public final class C20301em {

    /* renamed from: a */
    public C20153bw f57041a;

    /* renamed from: b */
    public HashMap f57042b = new HashMap();

    /* renamed from: c */
    public List f57043c = new ArrayList();

    public C20301em(C20154bx bxVar) {
        this.f57041a = (C20153bw) bxVar.toBuilder();
        if (mo25347c()) {
            for (C20156bz bzVar : Collections.unmodifiableList(((C20154bx) this.f57041a.instance).f56538g)) {
                this.f57042b.put(bzVar.f56541a, new C20300el(bzVar));
                this.f57043c.add(bzVar.f56541a);
            }
        }
    }

    /* renamed from: a */
    public final C20150bt mo25345a(String str, String str2) {
        C20300el elVar = (C20300el) this.f57042b.get(str);
        if (elVar != null) {
            return (C20150bt) elVar.f57036a.get(str2);
        }
        return null;
    }

    /* renamed from: b */
    public final List mo25346b(String str) {
        C20300el elVar = (C20300el) this.f57042b.get(str);
        if (elVar != null) {
            return elVar.f57037b;
        }
        return new ArrayList();
    }

    /* renamed from: c */
    public final boolean mo25347c() {
        C20153bw bwVar = this.f57041a;
        return (bwVar == null || ((C20154bx) bwVar.instance).f56538g.size() == 0) ? false : true;
    }
}
