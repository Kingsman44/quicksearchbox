package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: com.google.android.libraries.componentview.components.c.bv */
/* compiled from: PG */
public final class C20229bv extends LinearLayout {

    /* renamed from: a */
    final C20230bw f56807a;

    public C20229bv(Context context, C20230bw bwVar) {
        super(context);
        this.f56807a = bwVar;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            C20230bw bwVar = this.f56807a;
            if (bwVar.f56808a) {
                if (!bwVar.f56809b) {
                    bwVar.f56809b = true;
                    C20233bz bzVar = (C20233bz) bwVar.f56307r;
                    if (bzVar != null) {
                        bzVar.mo25300f(this, 0);
                    }
                }
                bwVar.f56808a = false;
            }
        }
    }
}
