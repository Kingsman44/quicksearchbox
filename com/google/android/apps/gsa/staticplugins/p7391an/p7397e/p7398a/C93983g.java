package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.g */
/* compiled from: PG */
final class C93983g extends C23243a {

    /* renamed from: a */
    final /* synthetic */ C93984h f262452a;

    /* renamed from: b */
    private View f262453b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93983g(C93984h hVar, View view) {
        super(R.id.account_particle, view);
        this.f262452a = hVar;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        super.mo28675a(dVar);
        View il = dVar.mo28297il();
        il.getClass();
        this.f262453b = il;
        mo88257c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo88257c() {
        int i;
        if (this.f262453b != null) {
            C93984h hVar = this.f262452a;
            if (hVar.f262461g != null) {
                if (((Boolean) ((C23249a) hVar.f262455a.mo88244k()).mo28725a()).booleanValue()) {
                    Resources resources = this.f262452a.f262457c.getResources();
                    int m = this.f262452a.mo88262m();
                    int j = this.f262452a.mo88259j();
                    int c = this.f262452a.mo83955c();
                    int i2 = this.f262452a.f262461g.top;
                    int l = this.f262452a.mo88261l();
                    i = Math.max(((Math.max(((m + j) + (c + c)) + i2, l) - this.f262452a.mo88260k()) - (l / 2)) - (resources.getDimensionPixelSize(R.dimen.account_particle_disc_estimated_height) / 2), this.f262452a.f262461g.top);
                } else {
                    i = this.f262452a.f262461g.top;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f262453b.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f262453b.setLayoutParams(marginLayoutParams);
            }
        }
    }
}
