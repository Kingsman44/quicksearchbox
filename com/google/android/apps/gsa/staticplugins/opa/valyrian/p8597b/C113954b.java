package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.onegoogle.owners.C31012n;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.b.b */
/* compiled from: PG */
public final class C113954b {

    /* renamed from: a */
    public final Context f315581a;

    /* renamed from: b */
    private final C68214a f315582b;

    /* renamed from: c */
    private final C31012n f315583c;

    /* renamed from: d */
    private final C22871g f315584d;

    public C113954b(Context context, C68214a aVar, C31012n nVar, C22871g gVar) {
        this.f315581a = context;
        this.f315582b = aVar;
        this.f315583c = nVar;
        this.f315584d = gVar;
    }

    /* renamed from: a */
    public final void mo100815a(ImageView imageView) {
        String F = ((C86054o) this.f315582b.mo27525b()).mo79659F();
        if (F != null && imageView != null) {
            this.f315584d.mo28211k(this.f315583c.mo36641e(F, 32), "load avatar", new C113953a(this, imageView));
        }
    }

    /* renamed from: b */
    public final void mo100816b(ImageView imageView) {
        imageView.setImageDrawable(this.f315581a.getResources().getDrawable(R.drawable.product_logo_avatar_anonymous_color_36));
    }
}
