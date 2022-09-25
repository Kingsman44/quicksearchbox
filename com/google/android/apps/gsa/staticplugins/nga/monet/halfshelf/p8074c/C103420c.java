package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8074c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b.C103412a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.c.c */
/* compiled from: PG */
final class C103420c extends C103429l {

    /* renamed from: a */
    public final Context f288267a;

    /* renamed from: c */
    private final C103412a f288268c;

    public C103420c(C22945j jVar, C103412a aVar, Context context) {
        super(jVar, context);
        this.f288268c = aVar;
        this.f288267a = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo93783e() {
        return true;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f288267a).inflate(R.layout.nga_half_shelf_image, (ViewGroup) null, false);
        mo28295iC(inflate);
        ((C103430m) this.f288268c).f288284b.mo28726b(new C103418a(this));
        ((C103430m) this.f288268c).f288283a.mo28726b(new C103419b(this, (ImageView) inflate.findViewById(R.id.nga_half_shelf_image_view)));
    }
}
