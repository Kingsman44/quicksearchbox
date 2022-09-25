package com.google.android.libraries.lens.view.infopanel;

import android.view.ViewGroup;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.education.C25772b;
import com.google.android.libraries.lens.view.education.C25777g;
import com.google.android.libraries.lens.view.education.C25780j;
import com.google.android.libraries.lens.view.education.C25784n;
import com.google.android.libraries.lens.view.education.C25785o;
import com.google.android.libraries.lens.view.education.p2095a.C25771a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ag */
/* compiled from: PG */
public final class C26989ag {

    /* renamed from: a */
    public static final C58974d f73594a = C58974d.m91135i("LatexHeaderRenderer");

    /* renamed from: b */
    public final C25780j f73595b;

    /* renamed from: c */
    public final C28310af f73596c;

    /* renamed from: d */
    public final C25771a f73597d;

    /* renamed from: e */
    public final C28306ab f73598e;

    /* renamed from: f */
    public ViewGroup f73599f;

    /* renamed from: g */
    C25777g f73600g;

    public C26989ag(C25780j jVar, C28310af afVar, C25771a aVar, C28306ab abVar) {
        this.f73595b = jVar;
        this.f73596c = afVar;
        this.f73597d = aVar;
        this.f73598e = abVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32450a(boolean z) {
        C25777g gVar;
        ViewGroup viewGroup = this.f73599f;
        if (viewGroup != null) {
            int visibility = viewGroup.getVisibility();
            this.f73599f.setVisibility(true != z ? 8 : 0);
            if (visibility == 0 && !z && (gVar = this.f73600g) != null) {
                ((C25772b) gVar).f70042a.f70040d.setText(BuildConfig.FLAVOR);
                ((C25784n) ((C25785o) gVar).f70042a).f70053e.setText(BuildConfig.FLAVOR);
            }
        }
    }
}
