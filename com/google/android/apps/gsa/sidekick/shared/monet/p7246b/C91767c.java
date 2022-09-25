package com.google.android.apps.gsa.sidekick.shared.monet.p7246b;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23290f;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23291g;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.b.c */
/* compiled from: PG */
public final class C91767c implements C91765a {

    /* renamed from: a */
    public C91771g f255909a;

    /* renamed from: b */
    public final C23290f f255910b;

    /* renamed from: c */
    public List f255911c = new ArrayList();

    /* renamed from: d */
    private final C22945j f255912d;

    /* renamed from: e */
    private final C68214a f255913e;

    /* renamed from: f */
    private final List f255914f = new ArrayList();

    public C91767c(C68214a aVar, C22945j jVar, C23290f fVar) {
        this.f255913e = aVar;
        this.f255912d = jVar;
        this.f255910b = fVar;
    }

    /* renamed from: s */
    private final void m150337s() {
        C91771g gVar = this.f255909a;
        if (gVar != null && this.f255912d.mo28316z()) {
            gVar.mo86271k(this.f255912d.mo28342l(), mo86264e(), mo86265f());
        }
    }

    /* renamed from: a */
    public final int mo86261a(String str) {
        return this.f255910b.mo28770R(str);
    }

    /* renamed from: b */
    public final int mo86262b(String str) {
        return this.f255910b.mo28771S(str);
    }

    /* renamed from: c */
    public final void mo86263c(C91775k kVar) {
        for (C91766b bVar : this.f255914f) {
            if (bVar.f255907d == -2147483647) {
                C91765a aVar = bVar.f255904a;
                if (aVar == null) {
                    String str = bVar.f255905b;
                    int a = kVar.f255927b.mo28781a(str);
                    int i = 0;
                    if (a == -1) {
                        ((C59052c) ((C59052c) C91775k.f255926a.mo56226d()).mo56372aa(11910)).mo56389s("Feature %s not found", str);
                    } else {
                        int itemViewType = kVar.f255927b.getItemViewType(a);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.f255929d, 1073741824);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        C23291g b = kVar.f255927b.onCreateViewHolder(kVar.f255928c, itemViewType);
                        kVar.f255927b.onBindViewHolder(b, a);
                        b.itemView.measure(makeMeasureSpec, makeMeasureSpec2);
                        View view = b.itemView;
                        view.layout(0, 0, view.getMeasuredWidth(), b.itemView.getMeasuredHeight());
                        i = b.itemView.getHeight();
                        b.mo28779a();
                    }
                    bVar.f255907d = i;
                } else {
                    aVar.mo86263c(kVar);
                }
            }
        }
        m150337s();
    }

    /* renamed from: e */
    public final int mo86264e() {
        int i = 0;
        for (C91766b bVar : this.f255914f) {
            int i2 = bVar.f255907d;
            if (i2 == -2147483647) {
                return -2147483647;
            }
            i += i2;
        }
        return i;
    }

    /* renamed from: f */
    public final int mo86265f() {
        for (C91766b bVar : this.f255914f) {
            int i = bVar.f255908e;
            if (i != -2147483647) {
                return i;
            }
        }
        return -2147483647;
    }

    /* renamed from: g */
    public final int mo86266g(int i, List list, int i2) {
        int intValue;
        if (list.isEmpty() || i2 < 0 || i2 >= list.size() || (intValue = ((Integer) list.get(i2)).intValue()) < 0 || intValue >= this.f255914f.size()) {
            return -2147483647;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < intValue) {
            int i5 = ((C91766b) this.f255914f.get(i3)).f255907d;
            if (i5 == -2147483647) {
                return -2147483647;
            }
            i4 += i5;
            i3++;
        }
        int i6 = i2 + 1;
        if (i6 >= list.size() || ((Integer) list.get(i6)).intValue() == 0) {
            return i - i4;
        }
        C91770f fVar = ((C91766b) this.f255914f.get(i3)).f255906c;
        if (fVar == null) {
            return -2147483647;
        }
        return fVar.mo86266g(i, list, i6) - i4;
    }

    /* renamed from: h */
    public final int mo86267h() {
        Collection collection;
        int i;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f255914f.size()) {
            C91766b bVar = (C91766b) this.f255914f.get(i2);
            C91770f fVar = bVar.f255906c;
            if (fVar != null) {
                i = fVar.mo86267h();
                collection = bVar.f255906c.mo86270j();
            } else {
                collection = new ArrayList();
                i = -2147483647;
            }
            if (i == -2147483647) {
                int i4 = bVar.f255907d;
                if (i4 == -2147483647) {
                    i3 = -2147483647;
                } else if (i3 != -2147483647) {
                    i3 += i4;
                }
                i2++;
            } else if (i3 != -2147483647) {
                ArrayList arrayList = new ArrayList(collection);
                this.f255911c = arrayList;
                arrayList.add(0, 0);
                return i - i3;
            } else {
                ArrayList arrayList2 = new ArrayList(collection);
                this.f255911c = arrayList2;
                arrayList2.add(0, Integer.valueOf(i2));
                return i;
            }
        }
        return -2147483647;
    }

    /* renamed from: iH */
    public final String mo86268iH() {
        return this.f255912d.mo28342l();
    }

    /* renamed from: iZ */
    public final int mo86269iZ() {
        int iZ;
        for (C91766b bVar : this.f255914f) {
            C91770f fVar = bVar.f255906c;
            if (fVar != null && (iZ = fVar.mo86269iZ()) != -2147483647) {
                return iZ;
            }
        }
        return -2147483647;
    }

    /* renamed from: j */
    public final List mo86270j() {
        return C58485gu.m89842j(this.f255911c);
    }

    /* renamed from: k */
    public final void mo86271k(String str, int i, int i2) {
        for (C91766b bVar : this.f255914f) {
            if (bVar.f255905b.equals(str)) {
                bVar.f255907d = i;
                bVar.f255908e = i2;
            }
        }
        m150337s();
    }

    /* renamed from: l */
    public final void mo86272l(C91770f fVar) {
        for (C91766b bVar : this.f255914f) {
            if (fVar.mo86268iH().equals(bVar.f255905b)) {
                C58838bb.m90883r(bVar.f255904a == null);
                bVar.f255906c = fVar;
            }
        }
        fVar.mo86278r(this);
    }

    /* renamed from: m */
    public final void mo86273m(C91770f fVar) {
        for (C91766b bVar : this.f255914f) {
            if (bVar.f255906c == fVar) {
                C58838bb.m90883r(bVar.f255904a == null);
                bVar.f255906c = null;
            }
        }
        fVar.mo86278r((C91771g) null);
    }

    /* renamed from: n */
    public final void mo86274n(int i, String str) {
        if (i < 0) {
            this.f255914f.add(0, new C91766b(str));
        } else if (i >= this.f255914f.size()) {
            this.f255914f.add(new C91766b(str));
        } else {
            this.f255914f.add(i, new C91766b(str));
        }
        m150337s();
    }

    /* renamed from: o */
    public final void mo86275o(int i, int i2) {
        this.f255914f.add(i2, (C91766b) this.f255914f.remove(i));
    }

    /* renamed from: p */
    public final void mo86276p(int i) {
        if (this.f255914f.isEmpty()) {
            ((C89911f) this.f255913e.mo27525b()).mo83755a((Throwable) null, 70029460, 29).mo83721a();
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f255914f.size()) {
            i = this.f255914f.size() - 1;
        }
        if (((C91766b) this.f255914f.get(i)).f255906c != null) {
            ((C91766b) this.f255914f.get(i)).f255906c.mo86278r((C91771g) null);
        }
        this.f255914f.remove(i);
        m150337s();
    }

    /* renamed from: q */
    public final void mo86277q(int i, C91765a aVar) {
        if (i < 0) {
            this.f255914f.add(0, new C91766b(aVar));
        } else if (i >= this.f255914f.size()) {
            this.f255914f.add(new C91766b(aVar));
        } else {
            this.f255914f.add(i, new C91766b(aVar));
        }
        m150337s();
    }

    /* renamed from: r */
    public final void mo86278r(C91771g gVar) {
        this.f255909a = gVar;
    }
}
