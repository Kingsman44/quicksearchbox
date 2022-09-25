package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.p033v7.app.C0388i;
import android.support.p033v7.widget.C0678gm;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.features.p2362c.C30523a;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.material.p3506c.C44581b;
import com.google.common.base.C58847bk;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.ag */
/* compiled from: PG */
public final /* synthetic */ class C30658ag implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30669ar f82757a;

    public /* synthetic */ C30658ag(C30669ar arVar) {
        this.f82757a = arVar;
    }

    public final void onClick(View view) {
        C30669ar arVar = this.f82757a;
        Context context = arVar.getContext();
        int a = C30899a.m57682a(context, R.attr.ogCustomDialogIconColor);
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_gm_ic_info_outline_vd_theme_24);
        C30905ae.m57696b(c, a);
        C44581b bVar = new C44581b(context, C30899a.m57683b(context, R.attr.ogMaterialAlertDialogCentered).resourceId);
        bVar.mo47604w(R.string.og_account_switching_deactivated);
        C0388i iVar = bVar.f1347a;
        iVar.f1323d = c;
        iVar.f1326g = (CharSequence) ((C58847bk) ((C30523a) arVar.f82798m.mo56107c()).f82450a).f156646a;
        bVar.mo47601t(R.string.og_got_it, (DialogInterface.OnClickListener) null);
        bVar.create().show();
    }
}
