package com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C1877c;
import com.facebook.litho.p334j.C6399b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.tracing.C47591co;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.a.i */
/* compiled from: PG */
public final class C134789i implements C6399b {

    /* renamed from: a */
    final /* synthetic */ C69626l f367002a;

    /* renamed from: b */
    final /* synthetic */ C134785e f367003b;

    /* renamed from: c */
    final /* synthetic */ C134791k f367004c;

    /* renamed from: d */
    final /* synthetic */ String f367005d;

    /* renamed from: e */
    final /* synthetic */ Throwable f367006e;

    /* renamed from: f */
    final /* synthetic */ C69626l f367007f;

    /* renamed from: g */
    final /* synthetic */ C69626l f367008g;

    /* renamed from: h */
    final /* synthetic */ C69626l f367009h;

    public C134789i(C69626l lVar, C134785e eVar, C134791k kVar, String str, Throwable th, C69626l lVar2, C69626l lVar3, C69626l lVar4) {
        this.f367002a = lVar;
        this.f367003b = eVar;
        this.f367004c = kVar;
        this.f367005d = str;
        this.f367006e = th;
        this.f367007f = lVar2;
        this.f367008g = lVar3;
        this.f367009h = lVar4;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo13407a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        Context context = constraintLayout.getContext();
        View findViewById = constraintLayout.findViewById(R.id.googleapp_discover_icon);
        C69664n.m101058d(findViewById);
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = constraintLayout.findViewById(R.id.googleapp_discover_title);
        C69664n.m101058d(findViewById2);
        TextView textView = (TextView) findViewById2;
        View findViewById3 = constraintLayout.findViewById(R.id.googleapp_discover_message);
        C69664n.m101058d(findViewById3);
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = constraintLayout.findViewById(R.id.googleapp_discover_primary_button);
        C69664n.m101058d(findViewById4);
        MaterialButton materialButton = (MaterialButton) findViewById4;
        View findViewById5 = constraintLayout.findViewById(R.id.googleapp_discover_secondary_button);
        C69664n.m101058d(findViewById5);
        MaterialButton materialButton2 = (MaterialButton) findViewById5;
        View findViewById6 = constraintLayout.findViewById(R.id.googleapp_discover_feedback_button);
        C69664n.m101058d(findViewById6);
        MaterialButton materialButton3 = (MaterialButton) findViewById6;
        C134785e eVar = this.f367003b;
        C134791k kVar = this.f367004c;
        String str = this.f367005d;
        Throwable th = this.f367006e;
        C69626l lVar = this.f367007f;
        C69626l lVar2 = this.f367008g;
        Integer num = eVar.f366991b;
        if (num != null) {
            imageView.setImageDrawable(C1877c.m5125a(context, num.intValue()));
        }
        Integer num2 = eVar.f366992c;
        if (num2 != null) {
            textView.setText(num2.intValue());
        }
        if (!kVar.f367011a && !kVar.f367012b) {
            str = context.getString(eVar.f366993d);
        } else if (str == null) {
            if (th != null) {
                str = th.getClass().getSimpleName() + ": " + th.getMessage();
            } else {
                str = context.getString(eVar.f366993d);
                C69664n.m101060f(str, "{\n                    co…sage)\n                  }");
            }
        }
        textView2.setText(str);
        if (!(eVar.f366994e == 0 || lVar == null)) {
            materialButton.setVisibility(0);
            materialButton.setText(eVar.f366994e);
            int i = eVar.f366995f;
            if (i != 0) {
                materialButton.mo47553j(i);
            }
            materialButton.setOnClickListener(new C47591co(kVar.f367013c, "Clicked primary button", new C134790j(lVar)));
        }
        if (!(eVar.f366996g == 0 || lVar2 == null)) {
            materialButton2.setVisibility(0);
            materialButton2.setText(eVar.f366996g);
            materialButton2.setOnClickListener(new C47591co(kVar.f367013c, "Clicked secondary button", new C134790j(lVar2)));
        }
        if (kVar.f367015e) {
            materialButton3.setVisibility(0);
            materialButton3.setText(R.string.googleapp_discover_error_card_send_feedback_label);
            materialButton3.setOnClickListener(new C47591co(kVar.f367013c, "Clicked send feedback button", C134787g.f367000a));
        } else if (th != null && (kVar.f367011a || kVar.f367012b)) {
            materialButton3.setVisibility(0);
            materialButton3.setText(R.string.googleapp_discover_error_card_debug_action_label);
            materialButton3.mo47553j(R.drawable.quantum_gm_ic_bugfood_white_24);
            materialButton3.setOnClickListener(new C47591co(kVar.f367013c, "Clicked debug button", new C134788h(th)));
        }
        C69626l lVar3 = this.f367002a;
        if (lVar3 != null) {
            lVar3.mo5761a(constraintLayout);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo13408b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        C69626l lVar = this.f367009h;
        if (lVar != null) {
            lVar.mo5761a(constraintLayout);
        }
    }
}
