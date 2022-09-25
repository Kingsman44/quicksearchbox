package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.libraries.notifications.p2293h.C30016i;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.a */
/* compiled from: PG */
final class C97643a extends C97727i {

    /* renamed from: a */
    public C30016i f272722a;

    /* renamed from: b */
    public int f272723b;

    /* renamed from: a */
    public final C97729k mo90781a() {
        int i;
        C30016i iVar = this.f272722a;
        if (iVar != null && (i = this.f272723b) != 0) {
            return new C97667b(iVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f272722a == null) {
            sb.append(" interceptionResult");
        }
        if (this.f272723b == 0) {
            sb.append(" suppressionStoreType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
