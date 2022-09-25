package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30320b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30321c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;
import com.google.android.libraries.onegoogle.actions.C30803d;
import com.google.android.libraries.onegoogle.actions.C30805f;
import com.google.android.libraries.onegoogle.actions.C30806g;
import com.google.android.libraries.onegoogle.actions.C30807h;
import com.google.android.libraries.onegoogle.actions.C30808i;
import com.google.android.libraries.onegoogle.actions.C30810k;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.ab */
/* compiled from: PG */
final class C30704ab extends C30321c {

    /* renamed from: d */
    public final C30778v f82911d;

    /* renamed from: e */
    public final ViewGroup f82912e;

    public C30704ab(Context context, ViewGroup viewGroup, C30778v vVar, C30643a aVar, C30897z zVar) {
        super(context, C30782z.f83077a, zVar, viewGroup, new C30805f(aVar.f82733b, aVar.f82735d, aVar.f82736e, aVar.f82739h));
        this.f82912e = viewGroup;
        this.f82911d = vVar;
    }

    /* renamed from: b */
    public final void mo36401b(C30464e eVar) {
        C30901aa aaVar = new C30901aa(eVar.mo36064d());
        aaVar.f83317e = new C30780x(this);
        C30464e i = eVar.mo36068i(new C30938y(aaVar));
        C30810k kVar = this.f81992a;
        C30806g g = C30807h.m57523g();
        g.mo36491d(i.mo36061a());
        Drawable c = i.mo36063c();
        if (c != null) {
            C30803d dVar = (C30803d) g;
            dVar.f83113a = c;
            g.mo36492e(i.mo36072m());
            View.OnClickListener d = i.mo36064d();
            if (d != null) {
                dVar.f83114b = d;
                g.mo36493f(i.mo36062b());
                C30807h g2 = g.mo36510g();
                kVar.f83136e.f83110a = C58833ax.m90834k(Integer.valueOf(g2.mo36495b()));
                kVar.f83136e.mo35630b(kVar.f83135d);
                ImageView imageView = kVar.f83132a;
                Drawable c2 = g2.mo36496c();
                C30905ae.m57696b(c2, kVar.f83134c);
                imageView.setImageDrawable(c2);
                kVar.f83133b.setText(g2.mo36500f());
                kVar.itemView.setOnClickListener(new C30808i(kVar, g2));
                this.f81994c = i.mo36065e();
                LiveData liveData = this.f81994c;
                if (liveData != null) {
                    liveData.mo5704e(this.f81993b, new C30320b(this, i));
                } else {
                    super.mo35887a(i, C58836b.f156633a);
                }
            } else {
                throw new NullPointerException("Null onClickListener");
            }
        } else {
            throw new NullPointerException("Null icon");
        }
    }
}
