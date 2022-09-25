package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.accounts.Account;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.shared.p5794e.C73744i;
import com.google.android.apps.gsa.assistant.settings.shared.ui.IdentityView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91193ay;
import com.google.android.apps.gsa.shared.p7195y.C91196ba;
import com.google.android.apps.gsa.shared.p7195y.C91210bo;
import com.google.android.apps.gsa.shared.p7195y.C91222n;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49842b;
import com.google.assistant.p3861at.C50282rh;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ag */
/* compiled from: PG */
public final /* synthetic */ class C9894ag implements C73744i {

    /* renamed from: a */
    public final /* synthetic */ C9907at f33953a;

    public /* synthetic */ C9894ag(C9907at atVar) {
        this.f33953a = atVar;
    }

    /* renamed from: a */
    public final int mo18098a(act act) {
        C9907at atVar = this.f33953a;
        C58976aa aaVar = C58975e.f156826a;
        View view = atVar.f33972c.getView();
        if (view == null) {
            return 0;
        }
        atVar.f33988s = true;
        if ((act.f128894a & 16) != 0) {
            C49842b bVar = act.f128899f;
            if (bVar == null) {
                bVar = C49842b.f129519l;
            }
            String str = bVar.f129528h;
            IdentityView findViewById = view.findViewById(R.id.settings_identity);
            findViewById.a(atVar.f33974e, str);
            IdentityView.b(findViewById.b, bVar.f129527g);
            Account a = atVar.f33975f.a();
            a.getClass();
            IdentityView.b(findViewById.c, a.name);
            ImageView imageView = (ImageView) view.findViewById(R.id.toolbar_icon);
            if (str.isEmpty()) {
                imageView.setImageResource(R.drawable.product_logo_avatar_anonymous_color_48);
            } else {
                C91189au auVar = atVar.f33974e;
                C91193ay q = C91196ba.m149039q();
                ((C91222n) q).f254620a = str;
                q.mo85444b(C91210bo.f254596c);
                auVar.mo85420h(q.mo85445c(), imageView);
            }
            TextView textView = (TextView) view.findViewById(R.id.collapsed_full_name);
            TextView textView2 = (TextView) view.findViewById(R.id.collapsed_email_address);
            textView.setText(bVar.f129527g);
            Account a2 = atVar.f33975f.a();
            a2.getClass();
            textView2.setText(a2.name);
            atVar.f33989t.mo47402l(new C9904aq(imageView, textView, textView2));
        }
        C50282rh rhVar = act.f128876C;
        if (rhVar == null) {
            rhVar = C50282rh.f130762c;
        }
        atVar.f33987r = rhVar;
        C9972p pVar = atVar.f33979j;
        pVar.f34153a.mo5708l(atVar.f33987r);
        atVar.mo18110d();
        atVar.mo18108b(atVar.f33987r, view);
        return 0;
    }
}
