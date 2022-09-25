package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104436am;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104847h;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104848i;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104849j;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b.C104850k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7620dt;
import com.google.p375ai.p378b.C7621du;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.eq */
/* compiled from: PG */
public final /* synthetic */ class C104815eq implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C104816er f292057a;

    public /* synthetic */ C104815eq(C104816er erVar) {
        this.f292057a = erVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C104816er erVar = this.f292057a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C104850k kVar = erVar.f292060c;
            Context context = erVar.f292058a;
            C7621du duVar = (C7621du) axVar.mo56107c();
            C104436am amVar = erVar.f292059b;
            TypedValue typedValue = new TypedValue();
            C0391l lVar = new C0391l(context, context.getTheme().resolveAttribute(16843529, typedValue, true) ? typedValue.resourceId : 0);
            lVar.f1347a.f1333n = false;
            C0392m create = lVar.create();
            create.requestWindowFeature(1);
            Window window = create.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            create.mo1197b().mo1191s(true != kVar.f292192a ? 1 : 2);
            View inflate = create.getLayoutInflater().inflate(R.layout.why_this_ad, (ViewGroup) null);
            create.f1349a.mo1109d(inflate);
            ((TextView) inflate.findViewById(R.id.advertiser_name)).setText(duVar.f26336b);
            LayoutInflater layoutInflater = create.getLayoutInflater();
            if ((duVar.f26335a & 4) != 0 && duVar.f26339e.size() > 0) {
                TextView textView = (TextView) inflate.findViewById(R.id.list_header_text);
                textView.setText(duVar.f26338d);
                textView.setVisibility(0);
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.reason_list);
                for (C7620dt dtVar : duVar.f26339e) {
                    View inflate2 = layoutInflater.inflate(R.layout.reason_list, linearLayout, false);
                    TextView textView2 = (TextView) inflate2.findViewById(R.id.learn_more);
                    ((TextView) inflate2.findViewById(R.id.item_text)).setText(dtVar.f26330c);
                    int i = dtVar.f26328a;
                    if (i == 3 || i == 4 || i == 5) {
                        textView2.setVisibility(0);
                        textView2.setOnClickListener(new C104849j(amVar, dtVar));
                    } else {
                        textView2.setVisibility(8);
                    }
                    linearLayout.addView(inflate2);
                }
            }
            Context context2 = create.getContext();
            if ((duVar.f26335a & 2) != 0) {
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.domain_switch_layout);
                linearLayout2.setVisibility(0);
                ((TextView) linearLayout2.findViewById(R.id.domain_switch_text)).setText(String.format("%s %s", new Object[]{context2.getString(R.string.why_this_ad_switch_text), duVar.f26337c}));
            }
            ((TextView) inflate.findViewById(R.id.close)).setOnClickListener(new C104847h(kVar, inflate, amVar));
            ((TextView) inflate.findViewById(R.id.setting)).setOnClickListener(new C104848i(amVar));
            kVar.f292193b = create;
            create.show();
        }
    }
}
