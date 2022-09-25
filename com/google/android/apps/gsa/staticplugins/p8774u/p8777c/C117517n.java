package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117485a;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117488d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.n */
/* compiled from: PG */
public final class C117517n extends C22939d implements C90233i {

    /* renamed from: a */
    public final C117488d f326201a;

    /* renamed from: b */
    public final Context f326202b;

    /* renamed from: c */
    public final C117485a f326203c;

    public C117517n(C22945j jVar, C117488d dVar, C117485a aVar, Context context) {
        super(jVar);
        this.f326201a = dVar;
        this.f326203c = aVar;
        this.f326202b = context;
    }

    /* renamed from: a */
    public final int mo83944a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo83945b() {
        return mo28297il();
    }

    /* renamed from: c */
    public final String mo83946c() {
        return (String) ((C117503ah) this.f326201a).f326167d.f63720e;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f326202b).inflate(R.layout.promo_bottom_sheet_dialog_container, (ViewGroup) null, false);
        ((C117503ah) this.f326201a).f326166c.mo28726b(new C117511h(this, frameLayout));
        mo28295iC(frameLayout);
    }
}
