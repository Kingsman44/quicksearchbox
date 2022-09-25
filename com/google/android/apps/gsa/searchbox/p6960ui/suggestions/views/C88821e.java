package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.common.base.C58832aw;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.e */
/* compiled from: PG */
public final class C88821e {

    /* renamed from: a */
    public final View f240477a;

    /* renamed from: b */
    public Uri f240478b;

    /* renamed from: c */
    private final C91043j f240479c;

    /* renamed from: d */
    private Uri f240480d;

    /* renamed from: e */
    private Drawable f240481e;

    public C88821e(View view, C91043j jVar) {
        this.f240477a = view;
        this.f240479c = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo82608a(Drawable drawable, Uri uri, String str, C88705f fVar) {
        if (drawable != null) {
            mo82610c(drawable, uri);
        } else if (str == null) {
            mo82610c((Drawable) null, (Uri) null);
        } else if (str.equals((Object) null)) {
            mo82609b(str, (String) null, fVar, false);
        } else {
            mo82609b(str, (String) null, fVar, false);
        }
    }

    /* renamed from: b */
    public final void mo82609b(String str, String str2, C88705f fVar, boolean z) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f240478b = parse;
            if (!C58832aw.m90831a(parse, this.f240480d)) {
                String scheme = parse.getScheme();
                C60870cx b = fVar.mo82428b(parse);
                if (!b.isDone()) {
                    mo82610c((Drawable) null, (Uri) null);
                }
                fVar.mo82427a().mo85428r(b, "Search.AsyncIcon.ImageCallback", new C88820d(this, str2, scheme, parse, fVar));
            } else if (z) {
                mo82610c(this.f240481e, this.f240480d);
            } else if (this.f240481e == null) {
                this.f240477a.setVisibility(4);
            } else {
                this.f240477a.setVisibility(0);
            }
        } else {
            this.f240478b = null;
            mo82608a((Drawable) null, (Uri) null, str2, fVar);
        }
    }

    /* renamed from: c */
    public final void mo82610c(Drawable drawable, Uri uri) {
        this.f240480d = uri;
        this.f240481e = drawable;
        this.f240479c.mo17709a(drawable);
        if (drawable == null) {
            this.f240477a.setVisibility(4);
            return;
        }
        this.f240477a.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }
}
