package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14478ks;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14479kt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.r */
/* compiled from: PG */
public final class C15262r {

    /* renamed from: a */
    public final C14986h f45789a;

    /* renamed from: b */
    public ViewGroup f45790b;

    /* renamed from: c */
    private final C14132bf f45791c;

    public C15262r(C14986h hVar, C14132bf bfVar) {
        this.f45789a = hVar;
        this.f45791c = bfVar;
    }

    /* renamed from: a */
    public final void mo22148a(ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        if (this.f45790b == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(R.layout.disable_morris, viewGroup, true);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.disable_morris);
            this.f45790b = viewGroup2;
            this.f45791c.mo21444a(viewGroup2, 110495);
            C15261q qVar = new C15261q(this);
            ViewGroup viewGroup3 = this.f45790b;
            viewGroup3.getClass();
            viewGroup3.findViewById(R.id.disable_morris_scroll_container).setOnTouchListener(new C14144n(contextThemeWrapper, this.f45791c, qVar));
            ViewGroup viewGroup4 = this.f45790b;
            viewGroup4.getClass();
            View findViewById = viewGroup4.findViewById(R.id.disable_morris_scrim);
            this.f45791c.mo21444a(findViewById, 110830);
            findViewById.setOnClickListener(new C14129bc(this.f45791c, Optional.empty(), new C15259o(this)));
            ViewGroup viewGroup5 = this.f45790b;
            viewGroup5.getClass();
            viewGroup5.findViewById(R.id.dismiss_chevron).setOnClickListener(new C14129bc(this.f45791c, Optional.empty(), new C15259o(this)));
            ViewGroup viewGroup6 = this.f45790b;
            viewGroup6.getClass();
            Button button = (Button) viewGroup6.findViewById(R.id.disable_morris_confirm_button);
            this.f45791c.mo21444a(button, 110497);
            button.setOnClickListener(new C14129bc(this.f45791c, Optional.empty(), new C15260p(this)));
            ViewGroup viewGroup7 = this.f45790b;
            viewGroup7.getClass();
            Button button2 = (Button) viewGroup7.findViewById(R.id.disable_morris_cancel_button);
            this.f45791c.mo21444a(button2, 110496);
            button2.setOnClickListener(new C14129bc(this.f45791c, Optional.empty(), new C15259o(this)));
        }
    }

    /* renamed from: b */
    public final void mo22149b() {
        C14986h hVar = this.f45789a;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14478ks ksVar = (C14478ks) C14479kt.f43760e.createBuilder();
        ksVar.copyOnWrite();
        ((C14479kt) ksVar.instance).f43763b = 7;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14479kt ktVar = (C14479kt) ksVar.build();
        ktVar.getClass();
        lfVar.f43801d = ktVar;
        lfVar.f43800c = 17;
        hVar.mo21875g((C14492lf) gtVar.build());
    }
}
