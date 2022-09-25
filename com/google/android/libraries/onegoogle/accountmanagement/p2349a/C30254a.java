package com.google.android.libraries.onegoogle.accountmanagement.p2349a;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0388i;
import android.support.p033v7.widget.C0678gm;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133332t;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133337y;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2347c.C30170d;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.material.p3506c.C44581b;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.a.a */
/* compiled from: PG */
public final class C30254a {

    /* renamed from: a */
    public final C30170d f81803a;

    /* renamed from: b */
    private final String f81804b;

    /* renamed from: c */
    private final C133332t f81805c;

    public C30254a(C30170d dVar, String str, C133332t tVar) {
        this.f81803a = dVar;
        this.f81804b = str;
        this.f81805c = tVar;
    }

    /* renamed from: a */
    public final void mo35766a(Context context) {
        int a = C30899a.m57682a(context, R.attr.ogCustomDialogIconColor);
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_gm_ic_info_outline_vd_theme_24);
        C30905ae.m57696b(c, a);
        C44581b bVar = new C44581b(context, C30899a.m57683b(context, R.attr.ogMaterialAlertDialogCentered).resourceId);
        bVar.mo47604w(R.string.og_account_switching_deactivated);
        C0388i iVar = bVar.f1347a;
        iVar.f1323d = c;
        iVar.f1326g = this.f81804b;
        bVar.mo47601t(R.string.og_got_it, (DialogInterface.OnClickListener) null);
        Fragment fragment = this.f81805c.f363316a;
        C133337y yVar = new C133337y();
        yVar.f363322a = bVar;
        yVar.showNow(fragment.getParentFragmentManager(), "DeactivatedAccountsDialogFragment");
    }
}
