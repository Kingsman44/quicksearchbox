package com.google.android.apps.search.webglide.p10702e;

import androidx.viewpager2.widget.C4313p;
import com.google.android.apps.search.webglide.defaultviewer.C142215n;
import com.google.android.apps.search.webglide.p10699b.C142176g;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4571q.C60433a;
import com.google.common.p4552o.p4571q.C60434b;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.webglide.e.e */
/* compiled from: PG */
public final class C142222e extends C4313p {

    /* renamed from: a */
    private final C142215n f385823a;

    /* renamed from: b */
    private final C142216a f385824b;

    /* renamed from: c */
    private final C142176g f385825c;

    public C142222e(C142215n nVar, C142216a aVar, C142176g gVar) {
        this.f385823a = nVar;
        this.f385824b = aVar;
        this.f385825c = gVar;
    }

    /* renamed from: a */
    public final void mo9201a(int i) {
    }

    /* renamed from: b */
    public final void mo9202b(int i) {
        C142185p h = this.f385823a.mo117061h(i);
        HashSet hashSet = new HashSet();
        if (this.f385825c.f385697f) {
            hashSet.add(h.f385726b);
        }
        if (this.f385825c.f385696e) {
            hashSet.add(h.f385733i);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C142216a aVar = this.f385824b;
            if (!str.isEmpty()) {
                C60433a aVar2 = (C60433a) C60434b.f163553c.createBuilder();
                aVar2.copyOnWrite();
                C60434b bVar = (C60434b) aVar2.instance;
                str.getClass();
                bVar.f163556a |= 1;
                bVar.f163557b = str;
                aVar.f385819a.mo41590b(C59743a.WEBGLIDE_ACTION_LOG_EVENT, C60434b.f163554d, (C60434b) aVar2.build());
            }
        }
    }

    /* renamed from: d */
    public final void mo9233d(int i, float f, int i2) {
    }
}
