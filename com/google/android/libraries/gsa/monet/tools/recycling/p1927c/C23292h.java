package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a.C105738q;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a.C105739r;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23095a;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.C23308a;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.RecyclingChildCoordinator$RecyclingChildData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.h */
/* compiled from: PG */
public final class C23292h extends C0640fb {

    /* renamed from: a */
    public final List f63774a = new ArrayList();

    /* renamed from: b */
    public final Map f63775b = new HashMap();

    /* renamed from: c */
    public boolean f63776c;

    /* renamed from: d */
    private final C23300p f63777d;

    /* renamed from: e */
    private final C22945j f63778e;

    /* renamed from: f */
    private final C23308a f63779f;

    public C23292h(C23300p pVar, C22945j jVar, C23308a aVar) {
        this.f63777d = pVar;
        this.f63778e = jVar;
        this.f63779f = aVar;
    }

    /* renamed from: g */
    public static final void m43691g(C0673gh ghVar) {
        C23067b.m43228a(ghVar instanceof C23291g);
        ((C23291g) ghVar).mo28779a();
    }

    /* renamed from: a */
    public final int mo28781a(String str) {
        for (int i = 0; i < this.f63774a.size(); i++) {
            if (((C23293i) this.f63774a.get(i)).f63782b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C23291g onCreateViewHolder(ViewGroup viewGroup, int i) {
        C23308a aVar = this.f63779f;
        if (i < 0 || i >= aVar.f63805a.size()) {
            throw new IllegalArgumentException(String.format(Locale.US, "Can't find feature type %d in map.", new Object[]{Integer.valueOf(i)}));
        }
        C22939d i2 = this.f63778e.mo28305i((C23129y) aVar.f63805a.get(i));
        View il = i2.mo28297il();
        i2.mo28293ae(il);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(this.f63777d.mo28802jq());
        frameLayout.addView(il);
        return new C23291g(this, frameLayout, i2, this.f63778e);
    }

    /* renamed from: c */
    public final C23293i mo28783c(int i) {
        if (i >= 0 && i < this.f63774a.size()) {
            return (C23293i) this.f63774a.get(i);
        }
        C23095a.m43281d("MonetAdapter", "RecyclerView requested item that is not currently in the data set.", new Object[0]);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo28784d(int i, int i2) {
        this.f63774a.add(i2, (C23293i) this.f63774a.remove(i));
        this.mObservable.mo2880b(i, i2);
    }

    /* renamed from: e */
    public final void onBindViewHolder(C23291g gVar, int i) {
        C23293i c = mo28783c(i);
        if (c != null) {
            gVar.f63771d = c.f63784d.f63675b;
            gVar.f63772e = c.f63782b;
            gVar.f63770c = c.f63781a;
            gVar.f63769b.mo28306q(gVar.f63768a, c.f63782b);
            C23296l lVar = c.f63781a;
            C22939d dVar = gVar.f63768a;
            String str = c.f63784d.f63675b;
            lVar.f63787H.add(dVar);
            lVar.mo28790jh(dVar, str);
            for (C105738q qVar : lVar.f63788I) {
                if (qVar.f295097c == null) {
                    qVar.f295097c = new HashSet();
                }
                qVar.f295097c.add(dVar);
                qVar.f295098d.f295103c.put(C105738q.m176028e(dVar), new C105739r(qVar.f295095a));
            }
            C23292h hVar = gVar.f63773f;
            if (hVar.f63776c) {
                hVar.f63775b.put(c.f63782b, gVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo28786f(int i) {
        C23291g gVar;
        C23293i iVar = (C23293i) this.f63774a.remove(i);
        if (this.f63776c && (gVar = (C23291g) this.f63775b.get(iVar.f63782b)) != null) {
            gVar.mo28780b();
        }
    }

    public final int getItemCount() {
        return this.f63774a.size();
    }

    public final long getItemId(int i) {
        C23293i c;
        if (!this.mHasStableIds || (c = mo28783c(i)) == null) {
            return -1;
        }
        return c.f63783c;
    }

    public final int getItemViewType(int i) {
        C23293i c = mo28783c(i);
        if (c == null) {
            return 0;
        }
        RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData = c.f63784d;
        C23308a aVar = this.f63779f;
        C23129y yVar = recyclingChildCoordinator$RecyclingChildData.f63803c;
        Integer num = (Integer) aVar.f63806b.get(yVar);
        if (num == null) {
            num = Integer.valueOf(aVar.f63805a.size());
            aVar.f63805a.add(yVar);
            aVar.f63806b.put(yVar, num);
        }
        return num.intValue();
    }

    public final /* synthetic */ boolean onFailedToRecycleView(C0673gh ghVar) {
        C23291g gVar = (C23291g) ghVar;
        C22939d dVar = gVar.f63768a;
        if ((dVar instanceof C23301q) && (((C23301q) dVar).mo28805s() || gVar.isRecyclable())) {
            return true;
        }
        gVar.mo28779a();
        return false;
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C23291g gVar = (C23291g) ghVar;
        gVar.mo28780b();
        C22939d dVar = gVar.f63768a;
        if (dVar instanceof C23302r) {
            ((C23302r) dVar).mo28806t();
        }
    }
}
