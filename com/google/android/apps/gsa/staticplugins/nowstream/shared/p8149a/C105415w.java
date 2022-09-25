package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.sidekick.shared.util.C91973ax;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105279dt;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.p375ai.p378b.C7891nu;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.w */
/* compiled from: PG */
public final class C105415w implements C23113i {

    /* renamed from: a */
    private final C105413u f294031a;

    public C105415w(C105413u uVar) {
        this.f294031a = uVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SignInLureEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onSignIn")) {
                C105413u uVar = this.f294031a;
                C91973ax axVar = new C91973ax(C7891nu.NOW_OPT_IN_PROMO_CARD);
                axVar.f256475g = 4;
                ((C105279dt) uVar).f293736a.mo65089a(axVar.mo86664a());
            }
        }
    }
}
