package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.apps.gsa.now.shared.p6421ui.C83412a;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91940p;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105441k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cd */
/* compiled from: PG */
public final class C105530cd extends C22939d {

    /* renamed from: a */
    public final Context f294412a;

    /* renamed from: b */
    public Button f294413b;

    /* renamed from: c */
    public ViewGroup f294414c;

    /* renamed from: d */
    public C83412a f294415d;

    /* renamed from: e */
    private final C105441k f294416e;

    public C105530cd(C22945j jVar, C105441k kVar, Context context, C58881cr crVar) {
        super(jVar);
        this.f294416e = kVar;
        this.f294412a = new C91940p(context, false, ((Boolean) crVar.mo6453a()).booleanValue()).f256405a;
    }

    /* renamed from: e */
    public final void mo94873e(boolean z) {
        C1929b.m5225f(this.f294413b.getCompoundDrawables()[1], C1878d.m5128a(this.f294412a, true != z ? R.color.agsa_color_light_on_surface_variant : R.color.agsa_color_dark_on_surface_variant));
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f294412a).inflate(R.layout.no_cards, (ViewGroup) null, false);
        this.f294414c = viewGroup;
        this.f294413b = (Button) viewGroup.findViewById(R.id.manage_interests_button);
        C83412a a = C83412a.m132796a(this.f294412a, this.f294414c);
        this.f294415d = a;
        a.mo76751i(6);
        mo28295iC(this.f294415d);
        ((C105582eb) this.f294416e).f294575d.mo28726b(new C105525bz(this));
        ((C105582eb) this.f294416e).f294574c.mo28726b(new C105527ca(this));
        ((C105582eb) this.f294416e).f294572a.mo28726b(new C105528cb(this));
        ((C105582eb) this.f294416e).f294573b.mo28726b(new C105529cc(this));
        mo94873e(((Boolean) ((C105582eb) this.f294416e).f294572a.f63720e).booleanValue());
    }
}
