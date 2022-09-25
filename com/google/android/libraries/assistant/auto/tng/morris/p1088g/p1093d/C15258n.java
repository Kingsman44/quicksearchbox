package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14395hq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14396hr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.n */
/* compiled from: PG */
public final class C15258n {

    /* renamed from: a */
    public final C14986h f45783a;

    /* renamed from: b */
    public ViewGroup f45784b;

    /* renamed from: c */
    private final C14132bf f45785c;

    public C15258n(C14986h hVar, C14132bf bfVar) {
        this.f45783a = hVar;
        this.f45785c = bfVar;
    }

    /* renamed from: a */
    public final void mo22144a(ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        if (this.f45784b == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(R.layout.confirm_not_driving, viewGroup, true);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.confirm_not_driving);
            this.f45784b = viewGroup2;
            this.f45785c.mo21444a(viewGroup2, 124556);
            ViewGroup viewGroup3 = this.f45784b;
            viewGroup3.getClass();
            View findViewById = viewGroup3.findViewById(R.id.confirm_not_driving_scrim);
            C14132bf bfVar = this.f45785c;
            findViewById.getClass();
            bfVar.mo21444a(findViewById, 124558);
            findViewById.setOnClickListener(new C14129bc(this.f45785c, Optional.empty(), new C15255k(this)));
            ViewGroup viewGroup4 = this.f45784b;
            viewGroup4.getClass();
            viewGroup4.findViewById(R.id.dismiss_chevron).setOnClickListener(new C14129bc(this.f45785c, Optional.empty(), new C15255k(this)));
            C15257m mVar = new C15257m(this);
            ViewGroup viewGroup5 = this.f45784b;
            viewGroup5.getClass();
            viewGroup5.findViewById(R.id.confirm_not_driving_scroll_container).setOnTouchListener(new C14144n(contextThemeWrapper, this.f45785c, mVar));
            ViewGroup viewGroup6 = this.f45784b;
            viewGroup6.getClass();
            View findViewById2 = viewGroup6.findViewById(R.id.confirm_not_driving_button);
            C14132bf bfVar2 = this.f45785c;
            findViewById2.getClass();
            bfVar2.mo21444a(findViewById2, 124557);
            findViewById2.setOnClickListener(new C14129bc(this.f45785c, Optional.empty(), new C15256l(this)));
        }
    }

    /* renamed from: b */
    public final void mo22145b() {
        C14986h hVar = this.f45783a;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14395hq hqVar = (C14395hq) C14396hr.f43557b.createBuilder();
        hqVar.copyOnWrite();
        ((C14396hr) hqVar.instance).f43559a = 4;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14396hr hrVar = (C14396hr) hqVar.build();
        hrVar.getClass();
        lfVar.f43801d = hrVar;
        lfVar.f43800c = 19;
        hVar.mo21875g((C14492lf) gtVar.build());
    }
}
