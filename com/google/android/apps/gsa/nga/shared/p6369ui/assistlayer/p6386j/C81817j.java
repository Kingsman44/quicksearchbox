package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j;

import android.graphics.Rect;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.j */
/* compiled from: PG */
public final class C81817j extends C81825r {

    /* renamed from: a */
    public Rect f223768a;

    /* renamed from: b */
    private boolean f223769b;

    /* renamed from: c */
    private byte f223770c;

    /* renamed from: a */
    public final C81826s mo75357a() {
        if (this.f223770c == 1 && this.f223768a != null) {
            return new C81818k(this.f223768a, this.f223769b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f223768a == null) {
            sb.append(" windowInsets");
        }
        if (this.f223770c == 0) {
            sb.append(" isBigNavbar");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75358b(boolean z) {
        this.f223769b = z;
        this.f223770c = 1;
    }
}
