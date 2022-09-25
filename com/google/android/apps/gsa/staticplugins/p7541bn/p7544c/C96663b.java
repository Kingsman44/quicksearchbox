package com.google.android.apps.gsa.staticplugins.p7541bn.p7544c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.monet.C90165af;
import com.google.android.apps.gsa.staticplugins.p7541bn.p7543b.C96661a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bn.c.b */
/* compiled from: PG */
public final class C96663b extends C22939d {

    /* renamed from: a */
    public final C90165af f270446a;

    /* renamed from: b */
    private final C96661a f270447b;

    /* renamed from: c */
    private final Context f270448c;

    public C96663b(C22945j jVar, C96661a aVar, Context context, C90165af afVar) {
        super(jVar);
        this.f270447b = aVar;
        this.f270448c = context;
        this.f270446a = afVar;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f270448c).inflate(R.layout.launcherclientoverlay, (ViewGroup) null, false);
        mo28295iC(frameLayout);
        ((C96665d) this.f270447b).f270451a.mo28685c(new C23243a(R.id.minus_one_stub, frameLayout));
        ((C96665d) this.f270447b).f270452b.mo28685c(new C96662a(this));
    }
}
