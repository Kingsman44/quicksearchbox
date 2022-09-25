package com.google.android.libraries.onegoogle.accountmenu.p2352b;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c.C97359ab;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c.C97369al;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c.C97379h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30460a;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30463d;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.actions.C30809j;
import com.google.android.libraries.onegoogle.actions.C30810k;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.b.c */
/* compiled from: PG */
public class C30321c extends C0673gh {

    /* renamed from: a */
    public final C30810k f81992a;

    /* renamed from: b */
    public final C2391v f81993b;

    /* renamed from: c */
    public LiveData f81994c;

    /* renamed from: d */
    private final C30809j f81995d;

    /* renamed from: e */
    private final FrameLayout f81996e = ((FrameLayout) this.itemView.findViewById(R.id.og_highlight_container));

    /* renamed from: f */
    private final TextView f81997f = ((TextView) this.itemView.findViewById(R.id.og_trailing_text));

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30321c(android.content.Context r2, androidx.lifecycle.C2391v r3, com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z r4, android.view.ViewGroup r5, com.google.android.libraries.onegoogle.actions.C30809j r6) {
        /*
            r1 = this;
            com.google.android.libraries.onegoogle.actions.k r0 = new com.google.android.libraries.onegoogle.actions.k
            r0.<init>(r2, r4, r5, r6)
            android.view.View r2 = r0.itemView
            r1.<init>(r2)
            r1.f81993b = r3
            r1.f81992a = r0
            r1.f81995d = r6
            android.view.View r2 = r1.itemView
            r3 = 2131433851(0x7f0b197b, float:1.84895E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r1.f81996e = r2
            android.view.View r2 = r1.itemView
            r3 = 2131433894(0x7f0b19a6, float:1.8489587E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f81997f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.p2352b.C30321c.<init>(android.content.Context, androidx.lifecycle.v, com.google.android.libraries.onegoogle.c.b.z, android.view.ViewGroup, com.google.android.libraries.onegoogle.actions.j):void");
    }

    /* renamed from: a */
    public final void mo35887a(C30464e eVar, C58833ax axVar) {
        if (axVar.mo56113h()) {
            this.f81997f.setText(((C30463d) axVar.mo56107c()).mo36060c());
            this.f81997f.setVisibility(0);
        } else {
            this.f81997f.setVisibility(8);
        }
        C30460a o = eVar.mo36074o();
        eVar.mo36061a();
        if (o != null) {
            this.f81996e.removeAllViews();
            C97379h hVar = o.f82278b;
            String str = o.f82277a;
            C97359ab abVar = hVar.f271953a;
            if (!abVar.f63126Q.mo28316z() || !((Boolean) ((C97369al) abVar.f271888b).f271936g.f63720e).booleanValue()) {
                str = null;
            }
            if (str != null) {
                C30319a.m56482a(this.f81996e, this.f81995d, str);
            }
        }
        View view = this.itemView;
        String m = eVar.mo36072m();
        if (axVar.mo56113h() && ((C30463d) axVar.mo56107c()).mo36059b().mo56113h()) {
            m = m + "\n" + ((String) ((C30463d) axVar.mo56107c()).mo36059b().mo56107c());
        }
        CharSequence contentDescription = this.f81996e.getContentDescription();
        if (contentDescription != null) {
            m = m + "\n" + contentDescription.toString();
        }
        view.setContentDescription(m);
    }
}
