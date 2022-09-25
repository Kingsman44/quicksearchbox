package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.CheckableFlipComponent;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108541ac;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.a.n */
/* compiled from: PG */
public final class C84002n extends C0640fb {

    /* renamed from: a */
    public List f228831a;

    /* renamed from: b */
    public C83990b f228832b;

    /* renamed from: c */
    public boolean f228833c;

    /* renamed from: d */
    public boolean f228834d;

    /* renamed from: e */
    public int f228835e = R.layout.checkable_flip_list_picker_row;

    /* renamed from: a */
    public final List mo77447a() {
        ArrayList arrayList = new ArrayList();
        for (C83993e eVar : this.f228831a) {
            if (eVar.mo77436a() == 1) {
                C83992d dVar = (C83992d) eVar;
                if (dVar.mo77444i()) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo77449c(boolean z, TextView textView, TextView textView2) {
        int i;
        int i2;
        int i3;
        int i4;
        Context context = textView.getContext();
        if (z) {
            C83990b bVar = this.f228832b;
            int i5 = R.color.google_blue500;
            if (bVar == null || (i3 = bVar.f228816c) == 0) {
                i3 = R.color.google_blue500;
            }
            textView.setTextColor(C1878d.m5128a(context, i3));
            C83990b bVar2 = this.f228832b;
            if (!(bVar2 == null || (i4 = bVar2.f228817d) == 0)) {
                i5 = i4;
            }
            textView2.setTextColor(C1878d.m5128a(context, i5));
            return;
        }
        C83990b bVar3 = this.f228832b;
        int i6 = R.color.list_secondary_color;
        if (bVar3 == null || (i = bVar3.f228814a) == 0) {
            i = R.color.list_secondary_color;
        }
        textView.setTextColor(C1878d.m5128a(context, i));
        C83990b bVar4 = this.f228832b;
        if (!(bVar4 == null || (i2 = bVar4.f228815b) == 0)) {
            i6 = i2;
        }
        textView2.setTextColor(C1878d.m5128a(context, i6));
    }

    public final int getItemCount() {
        List list = this.f228831a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int getItemViewType(int i) {
        return ((C83993e) this.f228831a.get(i)).mo77436a();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            C83999k kVar = (C83999k) ghVar;
            C83992d dVar = (C83992d) this.f228831a.get(i);
            View view = kVar.f228826a;
            Integer valueOf = Integer.valueOf(i);
            view.setTag(valueOf);
            kVar.f228827b.setText(dVar.mo77439d());
            kVar.f228828c.setText(dVar.mo77440e());
            if (dVar instanceof C108541ac) {
                C108541ac acVar = (C108541ac) dVar;
                CheckableFlipComponent checkableFlipComponent = kVar.f228829d;
                if (checkableFlipComponent.f228790d) {
                    checkableFlipComponent.f228790d = false;
                }
            }
            if (TextUtils.isEmpty(dVar.mo77440e())) {
                kVar.f228828c.setVisibility(8);
            } else {
                kVar.f228828c.setVisibility(0);
                if (dVar.mo77445j()) {
                    kVar.f228828c.setSingleLine(false);
                    kVar.f228828c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                }
                if (dVar.mo77442g()) {
                    kVar.f228828c.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            kVar.f228829d.setTag(valueOf);
            if (dVar.mo77437b() != 0) {
                CheckableFlipComponent checkableFlipComponent2 = kVar.f228829d;
                checkableFlipComponent2.f228787a = C1877c.m5125a(checkableFlipComponent2.getContext(), dVar.mo77437b());
                checkableFlipComponent2.mo77428b();
            } else if (dVar.mo77438c() != null) {
                CheckableFlipComponent checkableFlipComponent3 = kVar.f228829d;
                Drawable c = dVar.mo77438c();
                c.getClass();
                checkableFlipComponent3.f228787a = c;
                checkableFlipComponent3.mo77428b();
            }
            kVar.f228829d.setClickable(false);
            kVar.f228829d.setFocusable(false);
            kVar.f228829d.f228793g = new C83996h(this, kVar);
            kVar.f228826a.setOnClickListener(new C83997i(this, kVar));
            boolean i2 = dVar.mo77444i();
            CheckableFlipComponent checkableFlipComponent4 = kVar.f228829d;
            mo77449c(i2, kVar.f228827b, kVar.f228828c);
            checkableFlipComponent4.f228789c.mo77453b(!i2);
            checkableFlipComponent4.f228788b = i2;
        } else if (itemViewType == 3 || itemViewType == 7) {
            ((C83998j) ghVar).f228825a.setText(((C83991c) this.f228831a.get(i)).f228818a);
        } else if (itemViewType == 6) {
            View view2 = ((C84001m) ghVar).f228830a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.height = ((C83995g) this.f228831a.get(i)).f228820a;
            view2.setLayoutParams(layoutParams);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new C83999k(this, from.inflate(this.f228835e, viewGroup, false));
        }
        if (i == 4) {
            return new C84000l(from.inflate(0, viewGroup, false));
        }
        if (i == 5) {
            return new C84000l(from.inflate(0, viewGroup, false));
        }
        if (i == 3) {
            return new C83998j(from.inflate(R.layout.checkable_flip_list_category, viewGroup, false), false);
        }
        if (i == 7) {
            return new C83998j(from.inflate(R.layout.checkable_flip_list_category_no_horizontal_margin, viewGroup, false), true);
        }
        if (i == 2) {
            return new C84000l(from.inflate(R.layout.divider, viewGroup, false));
        }
        if (i == 6) {
            return new C84001m(from.inflate(R.layout.space, viewGroup, false));
        }
        return null;
    }

    /* renamed from: b */
    public final void mo77448b(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            List list = this.f228831a;
            if (list == null) {
                i2 = 0;
            } else {
                i2 = list.size();
            }
            if (i3 >= i2) {
                break;
            }
            if (((C83993e) this.f228831a.get(i3)).mo77436a() == 1) {
                C83992d dVar = (C83992d) this.f228831a.get(i3);
                if (i3 != i && dVar.mo77444i()) {
                    dVar.mo77441f(false);
                    if (!this.f228834d) {
                        notifyItemChanged(i3);
                    }
                }
            }
            i3++;
        }
        if (this.f228834d) {
            this.mObservable.mo2879a();
        }
    }
}
