package com.facebook.litho;

import com.facebook.litho.p322a.C6078k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.litho.hb */
/* compiled from: PG */
public abstract class C6377hb extends C6365gr {

    /* renamed from: a */
    public final ArrayList f18872a = new ArrayList();

    public C6377hb(List list) {
        for (int i = 0; i < list.size(); i++) {
            C6365gr grVar = (C6365gr) list.get(i);
            if (grVar instanceof C6355gh) {
                C6355gh ghVar = (C6355gh) grVar;
                ghVar.mo13373a();
                ArrayList arrayList = ghVar.f18799a;
                if (arrayList.size() > 1) {
                    this.f18872a.add(new C6260fc(arrayList));
                } else {
                    this.f18872a.add((C6365gr) arrayList.get(0));
                }
            } else if (grVar != null) {
                this.f18872a.add(grVar);
            } else {
                throw new IllegalStateException("Null element is not allowed in transition set");
            }
        }
    }

    /* renamed from: a */
    public abstract C6078k mo13255a(List list);
}
