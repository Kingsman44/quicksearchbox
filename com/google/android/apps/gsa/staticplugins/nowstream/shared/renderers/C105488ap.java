package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.monet.C90165af;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90326d;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105442l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ap */
/* compiled from: PG */
public abstract class C105488ap extends C105486an {

    /* renamed from: t */
    private ImageView f294261t;

    /* renamed from: u */
    private View f294262u;

    /* renamed from: v */
    private View f294263v;

    public C105488ap(C22945j jVar, C105442l lVar, Context context, C90326d dVar, C90320d dVar2, C90314b bVar, C91142g gVar, C90165af afVar) {
        super(jVar, lVar, context, dVar, dVar2, bVar, gVar, afVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo94838g(boolean z) {
        super.mo94838g(z);
        mo94846r();
        this.f294261t.setImageResource(true != z ? R.drawable.ic_logo_color : R.drawable.ic_logo_white);
    }

    /* renamed from: iw */
    public void mo28299iw() {
        super.mo28299iw();
        this.f294261t = (ImageView) this.f294242i.findViewById(R.id.logo);
        this.f294262u = this.f294242i.findViewById(R.id.light_theme_gradient_background);
        this.f294263v = this.f294242i.findViewById(R.id.header_container);
        ((C23249a) ((C105442l) this.f294234a).mo94610f()).mo28726b(new C105487ao(this));
        this.f294263v.setLayoutParams(new FrameLayout.LayoutParams(C90686c.m148055a(this.f294235b, 4), -2, 49));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo94842l(boolean z) {
        super.mo94842l(z);
        this.f294261t.setVisibility(true != z ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo94844p() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo94846r() {
        View view = this.f294262u;
        int i = 8;
        if (!this.f294244k && !((Boolean) ((C23249a) ((C105442l) this.f294234a).mo94613i()).mo28725a()).booleanValue() && !this.f294250q) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
