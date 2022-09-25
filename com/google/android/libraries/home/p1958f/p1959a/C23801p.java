package com.google.android.libraries.home.p1958f.p1959a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73557g;
import com.google.android.apps.gsa.shared.p7195y.C91188at;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50179nm;
import com.google.assistant.p3861at.C50181no;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.p */
/* compiled from: PG */
final class C23801p extends Preference {

    /* renamed from: a */
    public final C50181no f65215a;

    /* renamed from: b */
    final /* synthetic */ C23782ah f65216b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23801p(C23782ah ahVar, Context context, C50181no noVar) {
        super(context);
        C69664n.m101061g(context, "context");
        C69664n.m101061g(noVar, "provider");
        this.f65216b = ahVar;
        this.f65215a = noVar;
        mo8347N(noVar.f130447b);
        int a = C50179nm.m85783a(noVar.f130449d);
        if (a != 0 && a == 2) {
            Resources resources = context.getResources();
            int i = noVar.f130453h;
            mo8329n(resources.getQuantityString(R.plurals.device_count, i, new Object[]{Integer.valueOf(i)}));
        }
        this.f12751w = false;
        mo8343J(noVar.f130446a);
        mo8340G(R.drawable.quantum_gm_ic_cloud_vd_theme_24);
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        C69664n.m101061g(axVar, "holder");
        super.mo8313a(axVar);
        axVar.f12846c = false;
        axVar.f12847d = false;
        View a = axVar.mo8435a(16908294);
        C69664n.m101059e(a, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) a;
        C73557g gVar = null;
        imageView.setImageTintList((ColorStateList) null);
        imageView.setMinimumWidth(imageView.getMaxWidth());
        imageView.setMinimumHeight(imageView.getMaxHeight());
        C73557g gVar2 = this.f65216b.f65169l;
        if (gVar2 == null) {
            C69664n.m101065k("providerIconLoader");
        } else {
            gVar = gVar2;
        }
        String str = this.f65215a.f130448c;
        if (!TextUtils.isEmpty(str)) {
            C91188at a2 = gVar.f194572a.mo85410a(imageView.getContext());
            C91193ay q = C91196ba.m149039q();
            C91222n nVar = (C91222n) q;
            nVar.f254620a = str;
            nVar.f254624e = Integer.valueOf(R.drawable.quantum_gm_ic_cloud_vd_theme_24);
            a2.mo85427p(a2.mo85413a(q.mo85445c(), imageView), imageView);
        }
    }
}
