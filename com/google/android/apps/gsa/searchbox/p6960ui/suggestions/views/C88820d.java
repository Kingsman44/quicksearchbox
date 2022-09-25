package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.common.base.C58832aw;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.d */
/* compiled from: PG */
final class C88820d extends C90953s {

    /* renamed from: a */
    final /* synthetic */ String f240472a;

    /* renamed from: b */
    final /* synthetic */ String f240473b;

    /* renamed from: c */
    final /* synthetic */ Uri f240474c;

    /* renamed from: d */
    final /* synthetic */ C88705f f240475d;

    /* renamed from: e */
    final /* synthetic */ C88821e f240476e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88820d(C88821e eVar, String str, String str2, Uri uri, C88705f fVar) {
        super("Search.AsyncIcon");
        this.f240476e = eVar;
        this.f240472a = str;
        this.f240473b = str2;
        this.f240474c = uri;
        this.f240475d = fVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        String str;
        Drawable drawable = (Drawable) obj;
        if (drawable == null && (((str = this.f240472a) == null || str.equals((Object) null)) && "android.resource".equals(this.f240473b))) {
            View view = this.f240476e.f240477a;
            if (view instanceof ImageView) {
                ((ImageView) view).setImageURI(this.f240474c);
                this.f240476e.mo82610c(((ImageView) this.f240476e.f240477a).getDrawable(), (Uri) null);
                return;
            }
        }
        if (C58832aw.m90831a(this.f240474c, this.f240476e.f240478b)) {
            this.f240476e.mo82608a(drawable, this.f240474c, this.f240472a, this.f240475d);
        }
    }
}
