package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88403aa;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88475y;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88476z;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.d.m */
/* compiled from: PG */
public final class C97098m {

    /* renamed from: a */
    public final Context f271298a;

    /* renamed from: b */
    public final C97097l f271299b;

    /* renamed from: c */
    public boolean f271300c = false;

    public C97098m(Context context) {
        this.f271298a = context;
        this.f271299b = new C97097l(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Notification mo90465a() {
        if (this.f271300c) {
            C1839z a = this.f271299b.mo90464a();
            String string = this.f271298a.getString(R.string.notification_dismiss);
            C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
            C62940bt btVar = C88403aa.f239031b;
            C88475y yVar = (C88475y) C88476z.f239182c.createBuilder();
            yVar.copyOnWrite();
            C88476z zVar = (C88476z) yVar.instance;
            zVar.f239184a |= 1;
            zVar.f239185b = true;
            baVar.mo58885m(btVar, (C88476z) yVar.build());
            a.mo5016e(R.drawable.ic_close_normal, string, C88483e.m142827a(this.f271298a, "bubble", (C88431bb) baVar.build(), 0));
        }
        return this.f271299b.mo90464a().mo5013a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo90466b(int i) {
        this.f271299b.mo90464a().f5679J.icon = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo90467c(String str) {
        this.f271299b.mo90464a().f5685e = C1839z.m5037c(str);
    }
}
