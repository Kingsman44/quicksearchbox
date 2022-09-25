package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ho */
/* compiled from: PG */
public final class C108407ho extends C108232bc {

    /* renamed from: a */
    public static final /* synthetic */ int f301521a = 0;

    /* renamed from: b */
    private final C108403hk f301522b;

    public C108407ho(C108403hk hkVar) {
        super((byte[]) null);
        this.f301522b = hkVar;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 0;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 29;
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
        ViewGroup viewGroup = blVar.f301064N;
        viewGroup.setVisibility(0);
        viewGroup.findViewById(R.id.share_mini_card_button).setOnClickListener(this.f301522b);
        viewGroup.findViewById(R.id.share_mini_card_btn_close_container).setOnClickListener(new C108406hn(viewGroup));
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301064N.setVisibility(8);
    }
}
