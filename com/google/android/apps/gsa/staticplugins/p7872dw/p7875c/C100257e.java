package com.google.android.apps.gsa.staticplugins.p7872dw.p7875c;

import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.c.e */
/* compiled from: PG */
public final /* synthetic */ class C100257e implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100274v f280384a;

    public /* synthetic */ C100257e(C100274v vVar) {
        this.f280384a = vVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C100274v vVar = this.f280384a;
        if (((Boolean) obj).booleanValue()) {
            vVar.f280404d.setVisibility(0);
            if (vVar.f280404d.hasFocus()) {
                vVar.f280404d.clearFocus();
                return;
            }
            return;
        }
        vVar.f280404d.setVisibility(4);
        C90772bp.m148317y(vVar.f280401a, vVar.f280404d);
    }
}
