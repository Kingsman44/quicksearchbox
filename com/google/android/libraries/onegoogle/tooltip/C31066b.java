package com.google.android.libraries.onegoogle.tooltip;

import android.graphics.Rect;
import androidx.core.p098j.C2043bi;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.b */
/* compiled from: PG */
public final /* synthetic */ class C31066b {
    /* renamed from: a */
    public static boolean m57973a(C31067c cVar) {
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) cVar).f81902c;
        return C2043bi.m5570ax(accountParticleDisc) && accountParticleDisc.isShown() && accountParticleDisc.getGlobalVisibleRect(new Rect());
    }
}
