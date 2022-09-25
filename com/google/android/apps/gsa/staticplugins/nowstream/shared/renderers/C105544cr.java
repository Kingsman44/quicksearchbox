package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83412a;
import com.google.android.apps.gsa.sidekick.shared.cards.C91677af;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91940p;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105444n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cr */
/* compiled from: PG */
public final class C105544cr extends C22939d {

    /* renamed from: a */
    public final Context f294461a;

    /* renamed from: b */
    public C83412a f294462b;

    /* renamed from: c */
    public TextView f294463c;

    /* renamed from: d */
    public C91677af f294464d;

    /* renamed from: e */
    public final C21378h f294465e;

    /* renamed from: f */
    private final C105444n f294466f;

    public C105544cr(C22945j jVar, C105444n nVar, Context context, C21378h hVar, C58881cr crVar) {
        super(jVar);
        this.f294466f = nVar;
        this.f294465e = hVar;
        this.f294461a = new C91940p(context, false, ((Boolean) crVar.mo6453a()).booleanValue()).f256405a;
    }

    /* renamed from: im */
    public final void mo28298im() {
        this.f294464d.mo86155b();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f294461a).inflate(R.layout.offline_warning, (ViewGroup) null);
        this.f294463c = (TextView) inflate.findViewById(R.id.stale_warning_body);
        C91677af afVar = new C91677af(this.f294465e, System.currentTimeMillis());
        this.f294464d = afVar;
        afVar.mo86156c(this.f294463c);
        ((C105585ee) this.f294466f).f294595c.mo28726b(new C105541co(this));
        ((C105585ee) this.f294466f).f294593a.mo28726b(new C105542cp(this));
        ((C105585ee) this.f294466f).f294594b.mo28726b(new C105543cq(this));
        this.f294462b = C83412a.m132796a(this.f294461a, inflate);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            inflate.setLayoutParams(layoutParams);
        }
        this.f294462b.mo76751i(6);
        mo28295iC(this.f294462b);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f294464d.mo86154a(this.f294463c);
    }
}
