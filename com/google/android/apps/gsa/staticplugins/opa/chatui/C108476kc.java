package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.kc */
/* compiled from: PG */
public final class C108476kc extends C108232bc {

    /* renamed from: a */
    public static final C59071e f301726a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.kc");

    /* renamed from: b */
    public final C91097g f301727b;

    /* renamed from: c */
    public final String f301728c;

    public C108476kc(C91097g gVar, String str) {
        super((byte[]) null);
        this.f301727b = gVar;
        this.f301728c = str;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 88540;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 22;
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
        LinearLayout linearLayout = blVar.f301051A;
        linearLayout.getClass();
        linearLayout.setOnClickListener(new C108475kb(this));
    }
}
