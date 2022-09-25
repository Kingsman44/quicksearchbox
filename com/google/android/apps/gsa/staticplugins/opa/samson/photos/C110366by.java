package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.C4268a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91210bo;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.by */
/* compiled from: PG */
public final class C110366by extends C4268a {

    /* renamed from: c */
    private final LiveData f307596c;

    /* renamed from: d */
    private final C68214a f307597d;

    /* renamed from: e */
    private final C68214a f307598e;

    public C110366by(LiveData liveData, C68214a aVar, C68214a aVar2) {
        this.f307596c = liveData;
        this.f307597d = aVar;
        this.f307598e = aVar2;
    }

    /* renamed from: b */
    private static C91196ba m183770b(String str, boolean z) {
        C91193ay q = C91196ba.m149039q();
        C91222n nVar = (C91222n) q;
        nVar.f254620a = str;
        if (z) {
            nVar.f254625f = C91210bo.m149076f(new RectF(0.0f, 0.0f, 1.0f, 1.0f));
        }
        return q.mo85445c();
    }

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        C110365bx bxVar = (C110365bx) obj;
        viewGroup.removeView(bxVar.f307594b);
        View view = bxVar.f307594b;
        ((C91189au) this.f307598e.mo27525b()).mo85429s((ImageView) view.findViewById(R.id.photo_page_primary_photo));
        ((C91189au) this.f307598e.mo27525b()).mo85429s((ImageView) view.findViewById(R.id.photo_page_related_photo));
    }

    /* renamed from: gw */
    public final Object mo649gw(ViewGroup viewGroup, int i) {
        List list = (List) this.f307596c.mo3842a();
        list.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_pager_item, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.photo_page_primary_photo);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.photo_page_related_photo);
        if (((C86124t) this.f307597d.mo27525b()).mo79746e(C90014bt.f247136bU)) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        boolean z = viewGroup.getContext().getResources().getConfiguration().orientation == 1;
        C110363bv bvVar = (C110363bv) list.get(i);
        boolean c = bvVar.mo98598c();
        boolean z2 = ((z && !c && ((C86124t) this.f307597d.mo27525b()).mo79746e(C90014bt.f247127bL)) || (!z && c && ((C86124t) this.f307597d.mo27525b()).mo79746e(C90014bt.f247128bM))) && bvVar.mo98596a().mo56113h();
        boolean z3 = z2 || bvVar.mo98598c() == z || ((C86124t) this.f307597d.mo27525b()).mo79746e(C90014bt.f247135bT);
        inflate.findViewById(R.id.photo_page_progress_bar).setVisibility(0);
        int i2 = true != z2 ? 8 : 0;
        ((ImageView) inflate.findViewById(R.id.photo_page_related_photo)).setVisibility(i2);
        ((Space) inflate.findViewById(R.id.photo_page_spacer)).setVisibility(i2);
        C60870cx h = ((C91189au) this.f307598e.mo27525b()).mo85420h(m183770b(bvVar.mo98597b(), z3), imageView);
        C60870cx i3 = C60856cj.m92900i(C118826c.f331422a);
        if (z2) {
            i3 = ((C91189au) this.f307598e.mo27525b()).mo85420h(m183770b((String) bvVar.mo98596a().mo56107c(), z3), imageView2);
        }
        C60856cj.m92895d(h, i3).mo57334a(new C110364bw(inflate), C60826bg.f164896a);
        viewGroup.addView(inflate);
        return new C110365bx(bvVar, inflate, i);
    }

    /* renamed from: i */
    public final boolean mo652i(View view, Object obj) {
        return view == ((C110365bx) obj).f307594b;
    }

    /* renamed from: k */
    public final int mo9175k() {
        List list = (List) this.f307596c.mo3842a();
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo9176l(Object obj) {
        C110365bx bxVar = (C110365bx) obj;
        List list = (List) this.f307596c.mo3842a();
        list.getClass();
        C110363bv bvVar = bxVar.f307593a;
        if (bxVar.f307595c < list.size() && bxVar.f307593a.equals(list.get(bxVar.f307595c))) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (bxVar.f307593a.equals((C110363bv) list.get(i))) {
                bxVar.f307595c = i;
                return i;
            }
        }
        return -2;
    }
}
