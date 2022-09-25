package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0673gh;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14738h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14145o;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14146p;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14265cv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14266cw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14268cy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14362gk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14365gn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14392hn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14393ho;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.am */
/* compiled from: PG */
public final class C15004am extends C0673gh implements View.OnClickListener, C14145o {

    /* renamed from: a */
    public final Button f44968a;

    /* renamed from: b */
    public C28353e f44969b;

    /* renamed from: c */
    final /* synthetic */ C15005an f44970c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15004am(C15005an anVar, View view) {
        super(view);
        this.f44970c = anVar;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.app_button_container);
        this.f44968a = (Button) view.findViewById(R.id.app_button);
    }

    /* renamed from: a */
    public final void mo21470a() {
        C14266cw cwVar = this.f44970c.f44984n;
        cwVar.getClass();
        int b = C14268cy.m30587b(((C14265cv) cwVar.f43162e.get(getAbsoluteAdapterPosition())).f43154d);
        if (b != 0 && b == 7) {
            C14132bf bfVar = this.f44970c.f44977g;
            Button button = this.f44968a;
            button.getClass();
            bfVar.mo21444a(button, 139138);
        } else if (this.f44970c.f44975e.mo79746e(C90051dc.f248788W)) {
            C14132bf bfVar2 = this.f44970c.f44977g;
            Button button2 = this.f44968a;
            button2.getClass();
            C28353e eVar = this.f44969b;
            eVar.getClass();
            bfVar2.mo21445b(button2, 106593, eVar);
        } else {
            C14132bf bfVar3 = this.f44970c.f44977g;
            Button button3 = this.f44968a;
            button3.getClass();
            bfVar3.mo21444a(button3, 106593);
        }
    }

    /* renamed from: b */
    public final void mo21471b() {
        this.f44970c.f44977g.mo21447d(this.f44968a);
    }

    /* renamed from: c */
    public final void mo21889c(Drawable drawable, ContextThemeWrapper contextThemeWrapper) {
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.experience_launcher_experience_buttons_image_size);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
    }

    public final void onClick(View view) {
        C14266cw cwVar = this.f44970c.f44984n;
        cwVar.getClass();
        C14265cv cvVar = (C14265cv) cwVar.f43162e.get(getAbsoluteAdapterPosition());
        int b = C14268cy.m30587b(cvVar.f43154d);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            String str = cvVar.f43152b;
            String str2 = cvVar.f43155e;
            C37215b bVar = this.f44970c.f44978h;
            C37252a c = C37182a.f97784aP.mo40779c();
            C14146p.m30449c(c, str, str2);
            bVar.mo19974a(c);
            this.f44970c.f44973c.mo21875g(C14738h.m31025c(str, str2));
        } else if (i == 2) {
            C14986h hVar = this.f44970c.f44973c;
            String str3 = cvVar.f43152b;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14392hn hnVar = (C14392hn) C14393ho.f43534d.createBuilder();
            hnVar.copyOnWrite();
            ((C14393ho) hnVar.instance).f43537b = 2;
            hnVar.copyOnWrite();
            C14393ho hoVar = (C14393ho) hnVar.instance;
            str3.getClass();
            hoVar.f43536a = 1 | hoVar.f43536a;
            hoVar.f43538c = str3;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14393ho hoVar2 = (C14393ho) hnVar.build();
            hoVar2.getClass();
            lfVar.f43801d = hoVar2;
            lfVar.f43800c = 7;
            hVar.mo21875g((C14492lf) gtVar.build());
        } else if (i == 3) {
            this.f44970c.f44973c.mo21875g(C14745o.m31065h());
        } else if (i == 5) {
            C14986h hVar2 = this.f44970c.f44973c;
            C14371gt gtVar2 = (C14371gt) C14492lf.f43796e.createBuilder();
            C14362gk gkVar = (C14362gk) C14365gn.f43466q.createBuilder();
            gkVar.copyOnWrite();
            ((C14365gn) gkVar.instance).f43468a = 27;
            gtVar2.copyOnWrite();
            C14492lf lfVar2 = (C14492lf) gtVar2.instance;
            C14365gn gnVar = (C14365gn) gkVar.build();
            gnVar.getClass();
            lfVar2.f43801d = gnVar;
            lfVar2.f43800c = 3;
            hVar2.mo21875g((C14492lf) gtVar2.build());
        }
    }
}
