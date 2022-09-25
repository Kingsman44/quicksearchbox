package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.monet.C90165af;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90277f;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90326d;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105452v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.eu */
/* compiled from: PG */
public final class C105601eu extends C105598er implements C90277f {

    /* renamed from: u */
    private ImageButton f294651u;

    /* renamed from: v */
    private ImageView f294652v;

    public C105601eu(C22945j jVar, C105452v vVar, Context context, C90165af afVar, C90326d dVar, C90320d dVar2, C91142g gVar, C90314b bVar) {
        super(jVar, vVar, context, dVar, dVar2, bVar, gVar, afVar);
    }

    /* renamed from: a */
    public final void mo83981a(Runnable runnable) {
        this.f294651u.setOnClickListener(new C105600et(runnable));
    }

    /* renamed from: b */
    public final void mo83982b(Bitmap bitmap) {
        this.f294651u.setBackground(new BitmapDrawable(this.f294235b.getResources(), bitmap));
    }

    /* renamed from: c */
    public final void mo83983c(String str) {
        this.f294651u.setContentDescription(this.f294235b.getString(R.string.accessibility_switch_to_oem_minus_one_button, new Object[]{str}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo94837e() {
        return R.layout.rounded_minus_one_header;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo94838g(boolean z) {
        super.mo94838g(z);
        this.f294652v.setImageResource(true != z ? R.drawable.ic_logo_color : R.drawable.ic_logo_white);
    }

    /* renamed from: im */
    public final void mo28298im() {
        super.mo28298im();
        this.f294651u.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        super.mo28299iw();
        ImageButton imageButton = (ImageButton) this.f294242i.findViewById(R.id.oem_partner_button);
        imageButton.getClass();
        this.f294651u = imageButton;
        this.f294652v = (ImageView) this.f294242i.findViewById(R.id.shared_oem_google_logo);
        View findViewById = this.f294242i.findViewById(R.id.oem_partner_switcher_container);
        findViewById.getClass();
        findViewById.setVisibility(0);
        View findViewById2 = this.f294242i.findViewById(R.id.super_g);
        findViewById2.getClass();
        findViewById2.setVisibility(8);
        View findViewById3 = this.f294242i.findViewById(R.id.voice_hint_text);
        findViewById3.getClass();
        findViewById3.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo94845q() {
        return false;
    }
}
