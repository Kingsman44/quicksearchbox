package com.google.android.libraries.lens.view.gallery;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gallery.data.C26393l;
import com.google.android.libraries.lens.view.gallery.data.C26403v;
import com.google.android.libraries.lens.view.gallery.p2111d.C26361g;
import com.google.android.libraries.lens.view.gallery.p2111d.C26362h;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.logging.p2185ve.C28306ab;

/* renamed from: com.google.android.libraries.lens.view.gallery.g */
/* compiled from: PG */
public final class C26420g {

    /* renamed from: a */
    public final C26403v f71896a;

    /* renamed from: b */
    public final C26362h f71897b;

    /* renamed from: c */
    public final C26320b f71898c;

    /* renamed from: d */
    public final C26393l f71899d;

    /* renamed from: e */
    public final C25466f f71900e;

    /* renamed from: f */
    public final C28306ab f71901f;

    /* renamed from: g */
    public final int f71902g;

    /* renamed from: h */
    public C26361g f71903h;

    /* renamed from: i */
    public int f71904i = -1;

    public C26420g(String str, C26362h hVar, C26320b bVar, C26393l lVar, C25466f fVar, C28306ab abVar) {
        this.f71896a = C26403v.m48686a(str);
        this.f71897b = hVar;
        this.f71898c = bVar;
        this.f71899d = lVar;
        this.f71900e = fVar;
        this.f71901f = abVar;
        this.f71902g = bVar.getContext().getResources().getDimensionPixelSize(R.dimen.lens_gallery_inner_padding);
    }

    /* renamed from: a */
    public final RecyclerView mo31625a() {
        View view = this.f71898c.getView();
        view.getClass();
        return (RecyclerView) view;
    }
}
