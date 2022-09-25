package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58837ba;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57626cp;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.r */
/* compiled from: PG */
final class C116465r extends C0640fb {

    /* renamed from: a */
    final /* synthetic */ Interstitial f322925a;

    public C116465r(Interstitial interstitial) {
        this.f322925a = interstitial;
    }

    public final int getItemCount() {
        return this.f322925a.f322861c.size();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        int i2;
        int i3;
        C116467t tVar = (C116467t) ghVar;
        C116424c cVar = (C116424c) this.f322925a.f322861c.get(i);
        Interstitial interstitial = this.f322925a;
        ImageView imageView = tVar.f322928b;
        imageView.setClipToOutline(true);
        C57626cp cpVar = cVar.f322828m;
        if (cpVar == null || cpVar.f153924a.isEmpty()) {
            interstitial.f322865g.mo85429s(imageView);
            imageView.setImageDrawable(interstitial.getContext().getDrawable(R.drawable.thumbnail_empty));
        } else {
            C91193ay q = C91196ba.m149039q();
            C57626cp cpVar2 = cVar.f322828m;
            if (cpVar2 == null) {
                cpVar2 = C57626cp.f153922b;
            }
            ((C91222n) q).f254620a = cpVar2.f153924a;
            interstitial.f322865g.mo85420h(q.mo85445c(), imageView);
        }
        tVar.f322929c.setText(cVar.f322820d);
        TextView textView = tVar.f322930d;
        String str = cVar.f322829n;
        int i4 = 0;
        if ((cVar.f322824i || cVar.f322823h) && !C58837ba.m90859h(str)) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (cVar.f322824i) {
            tVar.f322931e.setVisibility(0);
            tVar.f322931e.setImageResource(R.drawable.quantum_gm_ic_public_white_24);
        } else if (cVar.f322823h) {
            tVar.f322931e.setVisibility(0);
            tVar.f322931e.setImageResource(R.drawable.quantum_gm_ic_people_white_24);
        } else {
            tVar.f322931e.setVisibility(4);
        }
        tVar.f322927a.setOnClickListener(new C89943l(new C116464q(this, cVar)));
        C28292j jVar = new C28292j(37320);
        aqp aqp = jVar.f76974b;
        aqp.copyOnWrite();
        aqs aqs = (aqs) aqp.instance;
        aqs aqs2 = aqs.f159780k;
        aqs.f159782a |= 8;
        aqs.f159787f = i;
        jVar.mo33794h(1);
        jVar.mo33795i(5);
        C28295m.m52919e(tVar.f322927a, jVar);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tVar.f322927a.getLayoutParams();
        if (i == 0) {
            i2 = this.f322925a.f322860b;
            i3 = 0;
        } else {
            i3 = i;
            i2 = 0;
        }
        marginLayoutParams.topMargin = i2;
        if (i3 == getItemCount() - 1) {
            i4 = this.f322925a.f322860b;
        }
        marginLayoutParams.bottomMargin = i4;
        tVar.f322927a.requestLayout();
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C116467t(LayoutInflater.from(this.f322925a.getContext()).inflate(R.layout.list_row_v2, viewGroup, false));
    }
}
