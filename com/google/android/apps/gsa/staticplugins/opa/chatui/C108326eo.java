package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.eo */
/* compiled from: PG */
public final class C108326eo extends C108232bc {

    /* renamed from: a */
    public CharSequence f301334a;

    /* renamed from: b */
    private final C86124t f301335b;

    public C108326eo(C86124t tVar) {
        super((byte[]) null);
        this.f301335b = tVar;
        this.f301029k.mo85049c(0, 68);
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 58565;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 17;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar != null) {
            return C28293k.m52908e(jVar, new C28293k[0]);
        }
        return null;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        if (this.f301335b.mo79746e(C90014bt.f247674lc)) {
            CharSequence charSequence = this.f301334a;
            if (charSequence == null) {
                blVar.f301098y.setText(R.string.opa_lockhart_oobe_listening);
            } else {
                blVar.f301098y.setText(charSequence);
            }
        }
    }

    /* renamed from: jz */
    public final int mo96576jz(BitFlags bitFlags) {
        return BitFlags.m148144f(bitFlags.f253762b, 4) ? 2 : 1;
    }
}
