package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hm */
/* compiled from: PG */
public final class C108405hm extends C108232bc {

    /* renamed from: a */
    private final C108403hk f301519a;

    public C108405hm(C108403hk hkVar) {
        super((byte[]) null);
        this.f301519a = hkVar;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 0;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 28;
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
        ViewGroup viewGroup = blVar.f301063M;
        viewGroup.setVisibility(0);
        viewGroup.findViewById(R.id.sharing_fab).setOnClickListener(this.f301519a);
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301063M.setVisibility(8);
    }
}
