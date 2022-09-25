package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.C109037fg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.aw */
/* compiled from: PG */
public final /* synthetic */ class C113948aw implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315572a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f315573b;

    public /* synthetic */ C113948aw(C114071eg egVar, ImageView imageView) {
        this.f315572a = egVar;
        this.f315573b = imageView;
    }

    public final void onClick(View view) {
        C114071eg egVar = this.f315572a;
        ImageView imageView = this.f315573b;
        C109037fg fgVar = egVar.f315911bu;
        if (fgVar != null) {
            fgVar.f303205a.mo97416D(new C113961bg(egVar, imageView));
        }
    }
}
