package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111250m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111254q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8588i.C113497a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60904dr;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.o */
/* compiled from: PG */
public final class C111270o implements C111250m {

    /* renamed from: a */
    protected final Context f309636a;

    /* renamed from: b */
    public C111274s f309637b;

    /* renamed from: c */
    private final C22871g f309638c;

    /* renamed from: d */
    private final C111255r f309639d;

    /* renamed from: e */
    private final List f309640e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private final Executor f309641f;

    /* renamed from: g */
    private final AtomicBoolean f309642g = new AtomicBoolean(false);

    /* renamed from: h */
    private final C68214a f309643h;

    /* renamed from: i */
    private View f309644i;

    public C111270o(Context context, C22871g gVar, C22871g gVar2, C111255r rVar, C68214a aVar) {
        this.f309636a = context;
        this.f309638c = gVar;
        this.f309639d = rVar;
        this.f309641f = new C60904dr(new C111267l(gVar2));
        this.f309643h = aVar;
    }

    /* renamed from: a */
    public final C111255r mo99079a() {
        return this.f309639d;
    }

    /* renamed from: b */
    public final String mo99080b() {
        return TextUtils.join("\n", new ArrayList(((C111274s) Objects.requireNonNull(this.f309637b)).f309652a));
    }

    /* renamed from: c */
    public final String mo99081c() {
        return this.f309639d.f309593v;
    }

    /* renamed from: d */
    public final void mo99082d(ViewGroup viewGroup) {
        if (this.f309644i == null) {
            RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(this.f309636a).inflate(R.layout.debug_panel_page, (ViewGroup) null);
            this.f309644i = recyclerView;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f309636a);
            recyclerView.setLayoutManager(linearLayoutManager);
            C0569cl clVar = new C0569cl(recyclerView.getContext(), linearLayoutManager.getOrientation());
            Drawable drawable = this.f309636a.getDrawable(R.drawable.debug_panel_item_divider);
            if (drawable != null) {
                clVar.f2212a = drawable;
            }
            recyclerView.addItemDecoration$ar$ds(clVar);
            C111274s sVar = new C111274s();
            this.f309637b = sVar;
            recyclerView.setAdapter((C0640fb) Objects.requireNonNull(sVar));
            this.f309644i = recyclerView;
        }
        View view = this.f309644i;
        if (!(view == null || view.getParent() == null)) {
            ((ViewGroup) this.f309644i.getParent()).removeView(this.f309644i);
        }
        viewGroup.addView(this.f309644i);
    }

    /* renamed from: e */
    public final void mo99083e(String str) {
        this.f309641f.execute(new C111265j(this, String.valueOf(((C113497a) this.f309643h.mo27525b()).mo100249a()).concat(" "), str));
    }

    /* renamed from: f */
    public final void mo99084f(String str, String str2) {
        this.f309641f.execute(new C111264i(this, String.valueOf(((C113497a) this.f309643h.mo27525b()).mo100249a()).concat(" "), str, str2));
    }

    /* renamed from: g */
    public final void mo99085g(boolean z) {
        if (this.f309642g.get() != z) {
            this.f309642g.set(z);
            if (z) {
                this.f309638c.mo28212l("Update displayed logs", new C111269n(this));
            }
        }
    }

    /* renamed from: h */
    public final void mo99096h() {
        if (!this.f309640e.isEmpty()) {
            ((C111274s) Objects.requireNonNull(this.f309637b)).f309652a.addAll(0, this.f309640e);
            this.f309640e.clear();
        }
    }

    /* renamed from: i */
    public final void mo99097i(C111254q qVar) {
        if (!this.f309642g.get()) {
            this.f309640e.add(0, qVar);
        } else {
            this.f309638c.mo28212l("update dataset", new C111268m(this, qVar));
        }
    }
}
