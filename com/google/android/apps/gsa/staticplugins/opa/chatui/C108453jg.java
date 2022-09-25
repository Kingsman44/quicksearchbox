package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.jg */
/* compiled from: PG */
public final class C108453jg extends C108232bc {

    /* renamed from: a */
    public CharSequence f301668a;

    /* renamed from: b */
    public final C68214a f301669b;

    /* renamed from: c */
    public final C91097g f301670c;

    public C108453jg(C91097g gVar, C68214a aVar) {
        super((byte[]) null);
        this.f301670c = gVar;
        this.f301669b = aVar;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 83596;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 21;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar == null) {
            return null;
        }
        jVar.mo33795i(5);
        return C28293k.m52908e(this.f301030l, new C28293k[0]);
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        blVar.f301062L.setText(this.f301668a);
        blVar.f301061K.setOnClickListener(new C89943l(new C108452jf(this)));
    }
}
