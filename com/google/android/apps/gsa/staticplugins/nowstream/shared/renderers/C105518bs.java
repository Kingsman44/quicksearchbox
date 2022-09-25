package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105438h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bs */
/* compiled from: PG */
public final class C105518bs extends C22939d {

    /* renamed from: a */
    public final C105419b f294389a;

    /* renamed from: b */
    public final C91825b f294390b;

    /* renamed from: c */
    private final Context f294391c;

    /* renamed from: d */
    private final C105438h f294392d;

    /* renamed from: e */
    private FrameLayout f294393e;

    public C105518bs(C22945j jVar, Context context, C105438h hVar, C91825b bVar, C105419b bVar2) {
        super(jVar);
        this.f294391c = context;
        this.f294392d = hVar;
        this.f294390b = bVar;
        this.f294389a = bVar2;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f294391c).inflate(R.layout.minus_one_stub, (ViewGroup) null);
        this.f294393e = frameLayout;
        mo28295iC(frameLayout);
        ((C105579dz) this.f294392d).f294563c.mo28685c(new C23243a((ChildStub) this.f294393e.findViewById(R.id.content_stub)));
        ((C105579dz) this.f294392d).f294561a.mo28685c(new C105517br(this, this.f294393e));
        ((C105579dz) this.f294392d).f294562b.mo28726b(new C105514bo(this));
        ((C105579dz) this.f294392d).f294564d.mo28726b(new C105515bp(this));
    }
}
