package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117091c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.aa */
/* compiled from: PG */
public final class C117100aa extends C22939d {

    /* renamed from: a */
    public FrameLayout f325101a;

    /* renamed from: b */
    private final C117091c f325102b;

    /* renamed from: c */
    private final Context f325103c;

    public C117100aa(C22945j jVar, C117091c cVar, Context context) {
        super(jVar);
        this.f325102b = cVar;
        this.f325103c = context;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f325103c).inflate(R.layout.customization_root, (ViewGroup) null, false);
        this.f325101a = frameLayout;
        mo28295iC(frameLayout);
        ((C117129bc) this.f325102b).f325166b.mo28685c(new C23243a(R.id.customization, this.f325101a));
        ((C117129bc) this.f325102b).f325165a.mo28685c(new C23243a(R.id.preview_parent, this.f325101a));
        ((TextView) this.f325101a.findViewById(R.id.feedback)).setOnClickListener(new C117184y(this));
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return C117185z.f325299a;
    }
}
