package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.e */
/* compiled from: PG */
public final class C110067e extends C83907bm {

    /* renamed from: b */
    public C83893b f306644b;

    /* renamed from: c */
    public C68214a f306645c;

    /* renamed from: d */
    public C68214a f306646d;

    /* renamed from: e */
    public C58881cr f306647e;

    /* renamed from: f */
    Button f306648f;

    /* renamed from: g */
    ImageButton f306649g;

    /* renamed from: h */
    ImageButton f306650h;

    /* renamed from: i */
    ImageButton f306651i;

    /* renamed from: j */
    boolean f306652j = true;

    /* renamed from: k */
    boolean f306653k = true;

    /* renamed from: l */
    C58528ij f306654l;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo98348e(View view) {
        C58800sl lA = this.f306654l.iterator();
        while (lA.hasNext()) {
            ((ImageButton) lA.next()).setSelected(false);
        }
        C58976aa aaVar = C58975e.f156826a;
        view.getId();
        view.setSelected(true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.charging_mode_backdrop, viewGroup, false);
        C28295m.m52919e(opaPageLayout, new C28292j(75812));
        opaPageLayout.mo77370b(R.layout.charging_mode_backdrop_content);
        ((HeaderLayout) opaPageLayout.findViewById(R.id.opa_header)).f228720c.setVisibility(8);
        opaPageLayout.f228726a.mo77362c(0);
        Button button = (Button) opaPageLayout.findViewById(R.id.charging_backdrop_done_button);
        this.f306648f = button;
        button.setOnClickListener(new C89943l(new C110063a(this)));
        ImageButton imageButton = (ImageButton) opaPageLayout.findViewById(R.id.charging_backdrop_analog_clock_button);
        this.f306649g = imageButton;
        imageButton.setSelected(true);
        this.f306649g.setOnClickListener(new C89943l(new C110064b(this)));
        ImageButton imageButton2 = (ImageButton) opaPageLayout.findViewById(R.id.charging_backdrop_digital_clock_button);
        this.f306650h = imageButton2;
        imageButton2.setOnClickListener(new C89943l(new C110065c(this)));
        ImageButton imageButton3 = (ImageButton) opaPageLayout.findViewById(R.id.charging_backdrop_photo_button);
        this.f306651i = imageButton3;
        imageButton3.setOnClickListener(new C89943l(new C110066d(this)));
        this.f306654l = C58528ij.m90012L(this.f306649g, this.f306650h, this.f306651i);
        return opaPageLayout;
    }
}
