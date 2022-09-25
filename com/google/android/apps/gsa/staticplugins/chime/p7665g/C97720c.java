package com.google.android.apps.gsa.staticplugins.chime.p7665g;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.g.c */
/* compiled from: PG */
public final class C97720c implements C90991b {

    /* renamed from: a */
    public final HashMap f272844a = new HashMap();

    /* renamed from: b */
    public final HashMap f272845b = new HashMap();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C90476a aVar = C91018d.f254254a;
        C91018d.m148680c();
        fVar.mo85291r("ChimeStateDumper");
        ArrayList arrayList = new ArrayList(this.f272844a.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C90998g gVar = (C90998g) this.f272844a.get(str);
            if (gVar != null) {
                gVar.mo85271g(fVar, str, (C90997f) null, false);
            }
        }
        ArrayList arrayList2 = new ArrayList(this.f272845b.keySet());
        Collections.sort(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            fVar.mo85289p(str2, (C90991b) this.f272845b.get(str2));
        }
    }
}
