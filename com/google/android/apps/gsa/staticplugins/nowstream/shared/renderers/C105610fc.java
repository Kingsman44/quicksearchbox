package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.now.shared.p6421ui.C83412a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91940p;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105413u;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105454x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fc */
/* compiled from: PG */
public final class C105610fc extends C22939d {

    /* renamed from: a */
    public final C105413u f294669a;

    /* renamed from: b */
    public final Context f294670b;

    /* renamed from: c */
    private final C105454x f294671c;

    public C105610fc(C22945j jVar, C105454x xVar, C105413u uVar, Context context, C58881cr crVar) {
        super(jVar);
        this.f294671c = xVar;
        this.f294669a = uVar;
        this.f294670b = new C91940p(context, false, ((Boolean) crVar.mo6453a()).booleanValue()).f256405a;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f294670b).inflate(R.layout.sign_in_lure, (ViewGroup) null);
        C83412a a = C83412a.m132796a(this.f294670b, inflate);
        a.mo76751i(6);
        mo28295iC(a);
        ((C105590ej) this.f294671c).f294619a.mo28726b(new C105606ez(this, a));
        ((C105590ej) this.f294671c).f294620b.mo28726b(new C105608fa(a));
        View findViewById = inflate.findViewById(R.id.sign_in_button);
        C28292j jVar = new C28292j(96327);
        jVar.mo33795i(5);
        C28295m.m52919e(findViewById, jVar);
        C89949q.m146521e(C28285c.m52874a(findViewById, 0), false);
        findViewById.setOnClickListener(new C105609fb(this));
    }
}
