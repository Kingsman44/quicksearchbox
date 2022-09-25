package com.google.android.libraries.onegoogle.accountmenu.features.p2373g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import androidx.lifecycle.C2332ag;
import com.google.android.libraries.onegoogle.account.disc.C30173aa;
import com.google.android.libraries.onegoogle.account.disc.C30176ad;
import com.google.android.libraries.onegoogle.account.disc.C30209i;
import com.google.android.libraries.onegoogle.account.disc.C30210j;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.features.C30638u;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.g.f */
/* compiled from: PG */
public final class C30612f extends C30176ad {

    /* renamed from: b */
    private final C30638u f82698b;

    /* renamed from: c */
    private final C30158c f82699c;

    /* renamed from: d */
    private final C58833ax f82700d;

    public C30612f(Context context, C30638u uVar, C30158c cVar) {
        this.f82698b = uVar;
        this.f82699c = cVar;
        int a = uVar.mo36313a();
        int i = new C30643a(context).f82733b;
        Drawable c = C0678gm.m2375e().mo3100c(context, a);
        C30905ae.m57696b(c, i);
        this.f82700d = C58833ax.m90834k(new C30209i(c, (String) null, C30173aa.OBAKE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35628b(Object obj) {
        Object obj2;
        C2332ag agVar = this.f81607a;
        if (this.f82698b.mo36315d(obj, this.f82699c)) {
            C30210j jVar = new C30210j();
            jVar.f81671a = this.f82700d;
            obj2 = C58833ax.m90834k(jVar.mo35622a());
        } else {
            obj2 = C58836b.f156633a;
        }
        agVar.mo5706i(obj2);
    }
}
