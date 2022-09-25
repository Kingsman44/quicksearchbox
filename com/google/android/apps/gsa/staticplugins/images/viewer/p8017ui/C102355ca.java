package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102296i;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102297j;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102299l;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ca */
/* compiled from: PG */
public final class C102355ca extends C22939d {

    /* renamed from: a */
    public final C21370a f285642a;

    /* renamed from: b */
    public final C58833ax f285643b;

    /* renamed from: c */
    public FrameLayout f285644c;

    /* renamed from: d */
    public C102328ba f285645d;

    /* renamed from: e */
    public C102328ba f285646e;

    /* renamed from: f */
    public boolean f285647f = true;

    /* renamed from: g */
    public long f285648g = 0;

    /* renamed from: h */
    private final C102296i f285649h;

    /* renamed from: i */
    private final C102299l f285650i;

    /* renamed from: j */
    private final Context f285651j;

    /* renamed from: k */
    private boolean f285652k = false;

    public C102355ca(C22945j jVar, C102296i iVar, C102299l lVar, Context context, C21370a aVar, C58833ax axVar) {
        super(jVar);
        this.f285649h = iVar;
        this.f285650i = lVar;
        this.f285651j = context;
        this.f285642a = aVar;
        this.f285643b = axVar;
    }

    /* renamed from: e */
    public final C102328ba mo93152e() {
        return this.f285647f ? this.f285645d : this.f285646e;
    }

    /* renamed from: f */
    public final void mo93153f() {
        C102328ba e = mo93152e();
        if (e != null) {
            C102374p.m169702b(e.mo28297il());
            e.f285588l = true;
        }
        C102328ba baVar = this.f285647f ? this.f285646e : this.f285645d;
        if (baVar != null) {
            baVar.f285588l = false;
        }
    }

    /* renamed from: g */
    public final void mo93154g(C102328ba baVar) {
        if (!((Boolean) ((C102341bn) this.f285650i).f285618c.f63720e).booleanValue() || this.f285652k) {
            baVar.mo93132f(true);
        }
        this.f285652k = true;
        C102296i iVar = this.f285649h;
        ((C102297j) iVar).f285411a.mo28345s("viewerShown", "SuperViewerEventsDispatcher", new Bundle());
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = new FrameLayout(this.f285651j);
        this.f285644c = frameLayout;
        mo28295iC(frameLayout);
        if (this.f285643b.mo56113h()) {
            ((Activity) this.f285643b.mo56107c()).getWindow().setStatusBarColor(-16777216);
        }
        ((C102341bn) this.f285650i).f285617b.mo28726b(new C102351bx(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f285647f = ((Boolean) ((C102341bn) this.f285650i).f285622g.f63720e).booleanValue();
        ((C102341bn) this.f285650i).f285621f.mo28685c(new C102352by(this));
        ((C102341bn) this.f285650i).f285623h.mo28685c(new C102353bz(this));
        ((C102341bn) this.f285650i).f285622g.mo28726b(new C102347bt(this));
        ((C102341bn) this.f285650i).f285620e.mo28726b(new C102348bu(this));
        ((C102341bn) this.f285650i).f285616a.mo28726b(C102349bv.f285635a);
        ((C102341bn) this.f285650i).f285619d.mo28726b(new C102350bw(this));
    }
}
