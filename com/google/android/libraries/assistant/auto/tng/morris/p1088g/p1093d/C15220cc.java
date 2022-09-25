package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14480ku;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14481kv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14482kw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14590ow;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53308jb;
import com.google.assistant.p3994s.p3995a.C53435nu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.cc */
/* compiled from: PG */
public final class C15220cc {

    /* renamed from: a */
    public final C14986h f45675a;

    /* renamed from: b */
    public ViewGroup f45676b;

    /* renamed from: c */
    public Button f45677c;

    /* renamed from: d */
    public ImageView f45678d;

    /* renamed from: e */
    public TextView f45679e;

    /* renamed from: f */
    public TextView f45680f;

    /* renamed from: g */
    public C14590ow f45681g;

    /* renamed from: h */
    private final C14132bf f45682h;

    /* renamed from: i */
    private final C15352z f45683i;

    public C15220cc(C14986h hVar, C14132bf bfVar, C15352z zVar) {
        this.f45675a = hVar;
        this.f45682h = bfVar;
        this.f45683i = zVar;
    }

    /* renamed from: a */
    public final void mo22093a(C14590ow owVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        if (!owVar.equals(this.f45681g)) {
            C53435nu nuVar = owVar.f44106a;
            if (nuVar == null) {
                nuVar = C53435nu.f140233n;
            }
            if (this.f45676b == null) {
                ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.onboarding_popup_task, viewGroup, true)).findViewById(R.id.onboarding_popup_task_container);
                this.f45676b = viewGroup2;
                C14132bf bfVar = this.f45682h;
                viewGroup2.getClass();
                C53308jb jbVar = nuVar.f140246k;
                if (jbVar == null) {
                    jbVar = C53308jb.f139794f;
                }
                bfVar.mo21444a(viewGroup2, jbVar.f139799d);
                C15219cb cbVar = new C15219cb(this);
                ViewGroup viewGroup3 = this.f45676b;
                viewGroup3.getClass();
                viewGroup3.findViewById(R.id.onboarding_popup_task_scroll_container).setOnTouchListener(new C14144n(contextThemeWrapper, this.f45682h, cbVar));
                ViewGroup viewGroup4 = this.f45676b;
                viewGroup4.getClass();
                View findViewById = viewGroup4.findViewById(R.id.onboarding_popup_task_scrim);
                this.f45682h.mo21444a(findViewById, 157435);
                findViewById.setOnClickListener(new C14129bc(this.f45682h, Optional.empty(), new C15213bw(this)));
                ViewGroup viewGroup5 = this.f45676b;
                viewGroup5.getClass();
                View findViewById2 = viewGroup5.findViewById(R.id.onboarding_popup_task_dismiss_chevron);
                this.f45682h.mo21444a(findViewById2, 157702);
                findViewById2.setOnClickListener(new C14129bc(this.f45682h, Optional.empty(), new C15214bx(this)));
                ViewGroup viewGroup6 = this.f45676b;
                viewGroup6.getClass();
                this.f45679e = (TextView) viewGroup6.findViewById(R.id.onboarding_popup_task_title);
                ViewGroup viewGroup7 = this.f45676b;
                viewGroup7.getClass();
                this.f45680f = (TextView) viewGroup7.findViewById(R.id.onboarding_popup_task_description);
                ViewGroup viewGroup8 = this.f45676b;
                viewGroup8.getClass();
                this.f45678d = (ImageView) viewGroup8.findViewById(R.id.onboarding_popup_task_icon);
                ViewGroup viewGroup9 = this.f45676b;
                viewGroup9.getClass();
                Button button = (Button) viewGroup9.findViewById(R.id.onboarding_popup_task_cta_button);
                this.f45677c = button;
                this.f45682h.mo21444a(button, 157436);
                Button button2 = this.f45677c;
                button2.getClass();
                button2.setOnClickListener(new C14129bc(this.f45682h, Optional.empty(), new C15215by(this)));
                ViewGroup viewGroup10 = this.f45676b;
                viewGroup10.getClass();
                View findViewById3 = viewGroup10.findViewById(R.id.onboarding_popup_task_dismiss_button);
                this.f45682h.mo21444a(findViewById3, 157437);
                findViewById3.setOnClickListener(new C14129bc(this.f45682h, Optional.empty(), new C15216bz(this)));
                C14986h hVar = this.f45675a;
                C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
                C14480ku kuVar = (C14480ku) C14482kw.f43766d.createBuilder();
                kuVar.copyOnWrite();
                ((C14482kw) kuVar.instance).f43769b = C14481kv.m30622a(7);
                kuVar.copyOnWrite();
                C14482kw kwVar = (C14482kw) kuVar.instance;
                nuVar.getClass();
                kwVar.f43770c = nuVar;
                kwVar.f43768a = 1 | kwVar.f43768a;
                gtVar.copyOnWrite();
                C14492lf lfVar = (C14492lf) gtVar.instance;
                C14482kw kwVar2 = (C14482kw) kuVar.build();
                kwVar2.getClass();
                lfVar.f43801d = kwVar2;
                lfVar.f43800c = 18;
                hVar.mo21875g((C14492lf) gtVar.build());
            }
            TextView textView = this.f45679e;
            textView.getClass();
            textView.setText(nuVar.f140240e);
            TextView textView2 = this.f45680f;
            textView2.getClass();
            textView2.setText(nuVar.f140242g);
            ImageView imageView = this.f45678d;
            imageView.getClass();
            imageView.setVisibility(0);
            C15352z zVar = this.f45683i;
            ImageView imageView2 = this.f45678d;
            imageView2.getClass();
            C51012dc dcVar = nuVar.f140244i;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            zVar.mo22231n(imageView2, dcVar.f132817c, C15218ca.f45673a);
            this.f45681g = owVar;
        }
    }

    /* renamed from: b */
    public final void mo22094b() {
        C14986h hVar = this.f45675a;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14480ku kuVar = (C14480ku) C14482kw.f43766d.createBuilder();
        kuVar.copyOnWrite();
        ((C14482kw) kuVar.instance).f43769b = C14481kv.m30622a(9);
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14482kw kwVar = (C14482kw) kuVar.build();
        kwVar.getClass();
        lfVar.f43801d = kwVar;
        lfVar.f43800c = 18;
        hVar.mo21875g((C14492lf) gtVar.build());
    }
}
