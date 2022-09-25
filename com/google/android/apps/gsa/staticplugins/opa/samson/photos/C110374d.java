package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Context;
import android.support.p033v7.p037c.p038a.C0409a;
import android.support.p033v7.p037c.p038a.C0415g;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.googlequicksearchbox.R;
import com.google.p4715m.p4716a.p4720b.p4721a.C62674b;
import com.google.p4715m.p4716a.p4720b.p4721a.C62677e;
import com.google.p4715m.p4716a.p4720b.p4721a.C62678f;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68226l;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.d */
/* compiled from: PG */
public final class C110374d extends C0640fb {

    /* renamed from: a */
    public final C0415g f307619a;

    /* renamed from: b */
    private final C110382l f307620b;

    /* renamed from: c */
    private final Set f307621c;

    /* renamed from: d */
    private final C110370cb f307622d;

    public C110374d(C110382l lVar, C90851k kVar, C110370cb cbVar, Set set) {
        this.f307620b = lVar;
        this.f307622d = cbVar;
        this.f307621c = set;
        C110341b bVar = new C110341b(this);
        C0409a aVar = new C0409a(new C110368c());
        aVar.f1386a = kVar.mo85210c("album async differ");
        this.f307619a = new C0415g(bVar, aVar.mo1378a());
    }

    public final int getItemCount() {
        return this.f307619a.f1404f.size() + 1;
    }

    public final int getItemViewType(int i) {
        return i <= 0 ? 0 : 1;
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        int i2;
        String b;
        C110381k kVar = (C110381k) ghVar;
        if (kVar.f307641j != 0) {
            C62678f fVar = (C62678f) this.f307619a.f1404f.get(i - 1);
            C110312a a = C110312a.m183698a(fVar);
            if (this.f307621c.contains(a)) {
                this.f307622d.mo98600a(fVar);
                this.f307621c.remove(a);
            }
            if (kVar.f307641j == 1) {
                kVar.itemView.setOnClickListener(new C110378h(kVar));
                int i3 = fVar.f169226j;
                int a2 = C62677e.m94899a(i3);
                if (a2 != 0 && a2 == 2) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        if (i4 < fVar.f169224h.size()) {
                            kVar.mo98610c(kVar.f307636e[i4], (String) fVar.f169224h.get(i4));
                        } else {
                            kVar.mo98611d(kVar.f307636e[i4]);
                        }
                    }
                    kVar.f307637f.setVisibility(8);
                    kVar.f307638g.setText(fVar.f169219c);
                    kVar.mo98613f(fVar.f169223g, true);
                    kVar.mo98612e(kVar.itemView.getContext().getResources().getDimensionPixelOffset(R.dimen.album_hero_item_vert_margin));
                    kVar.f307640i.setOnCheckedChangeListener(new C110379i(kVar));
                    kVar.f307640i.setChecked(false);
                    return;
                }
                int a3 = C62677e.m94899a(i3);
                if (a3 != 0 && a3 == 3) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        if (i5 < fVar.f169224h.size()) {
                            kVar.mo98610c(kVar.f307636e[i5], (String) fVar.f169224h.get(i5));
                        } else {
                            kVar.mo98611d(kVar.f307636e[i5]);
                        }
                    }
                    kVar.f307637f.setVisibility(8);
                    kVar.f307638g.setText(fVar.f169219c);
                    if ((fVar.f169217a & 256) != 0) {
                        b = fVar.f169223g;
                    } else {
                        if (fVar.f169221e > 0) {
                            Context context = kVar.f307639h.getContext();
                            int i6 = fVar.f169221e;
                            C62674b bVar = fVar.f169225i;
                            if (bVar == null) {
                                bVar = C62674b.f169210b;
                            }
                            b = C110381k.m183785b(context, i6, bVar.f169212a);
                        }
                        i2 = kVar.itemView.getContext().getResources().getDimensionPixelOffset(R.dimen.album_hero_item_vert_margin);
                    }
                    kVar.mo98613f(b, false);
                    i2 = kVar.itemView.getContext().getResources().getDimensionPixelOffset(R.dimen.album_hero_item_vert_margin);
                } else {
                    ImageView[] imageViewArr = kVar.f307636e;
                    for (int i7 = 0; i7 < 3; i7++) {
                        imageViewArr[i7].setVisibility(8);
                    }
                    C91193ay q = C91196ba.m149039q();
                    C91222n nVar = (C91222n) q;
                    nVar.f254620a = fVar.f169220d;
                    nVar.f254621b = new Size(kVar.f307637f.getWidth(), kVar.f307637f.getHeight());
                    nVar.f254622c = Integer.valueOf(R.color.google_grey100);
                    ((C91189au) kVar.f307632a.mo27525b()).mo85420h(q.mo85445c(), kVar.f307637f);
                    kVar.f307637f.setVisibility(0);
                    kVar.f307638g.setText(fVar.f169219c);
                    Context context2 = kVar.f307639h.getContext();
                    int i8 = fVar.f169221e;
                    C62674b bVar2 = fVar.f169225i;
                    if (bVar2 == null) {
                        bVar2 = C62674b.f169210b;
                    }
                    kVar.mo98613f(C110381k.m183785b(context2, i8, bVar2.f169212a), true);
                    i2 = kVar.itemView.getContext().getResources().getDimensionPixelOffset(R.dimen.album_item_vert_margin);
                }
                kVar.mo98612e(i2);
                Set set = (Set) kVar.f307642k.f307611c.mo3842a();
                set.getClass();
                boolean contains = set.contains(C110312a.m183698a(fVar));
                kVar.f307640i.setOnCheckedChangeListener(new C110380j(kVar, fVar));
                kVar.f307640i.setChecked(contains);
            }
        }
    }

    public final /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        HeaderLayout headerLayout;
        if (i == 0) {
            HeaderLayout headerLayout2 = (HeaderLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_header, viewGroup, false);
            C84018m.m133908c(headerLayout2.f228718a, C84018m.m133906a(R.string.photo_onboarding_title_string, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
            C84018m.m133908c(headerLayout2.f228719b, C84018m.m133906a(R.string.photo_onboarding_content_string, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
            headerLayout2.mo77365b(R.drawable.product_logo_photos_color_48, R.string.photos_settings_google_photos_content_description);
            headerLayout = headerLayout2;
        } else {
            headerLayout = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_item_view, viewGroup, false);
        }
        ViewGroup viewGroup2 = headerLayout;
        C110382l lVar = this.f307620b;
        C110370cb cbVar = this.f307622d;
        viewGroup2.getClass();
        C68214a a = C68219e.m98518a(((C68226l) lVar.f307644a).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) lVar.f307645b).f184585a);
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) lVar.f307646c).f184585a);
        a3.getClass();
        C91090a aVar = (C91090a) ((C68221g) lVar.f307647d).f184583a;
        aVar.getClass();
        C110340az azVar = (C110340az) lVar.f307648e.mo17428b();
        azVar.getClass();
        return new C110381k(i, viewGroup2, cbVar, a, a2, a3, aVar, azVar);
    }
}
