package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105694g;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105702o;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.p375ai.p378b.C7642eo;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.a.d */
/* compiled from: PG */
public final class C105751d implements C23113i {

    /* renamed from: a */
    private final C105749b f295111a;

    public C105751d(C105749b bVar) {
        this.f295111a = bVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        C105702o oVar;
        if ("SignInErrorEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onPullToRefreshEntriesEvent") && (oVar = ((C105694g) this.f295111a).f294950a) != null) {
                C7642eo eoVar = C7642eo.PULL_TO_REFRESH;
                C105687ar arVar = oVar.f294966a;
                arVar.mo94987y(true);
                arVar.f294878q.mo86208b(eoVar);
            }
        }
    }
}
