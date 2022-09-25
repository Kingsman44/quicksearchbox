package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a.C105749b;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a.C105750c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.f */
/* compiled from: PG */
public final /* synthetic */ class C105727f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C105729h f295068a;

    public /* synthetic */ C105727f(C105729h hVar) {
        this.f295068a = hVar;
    }

    public final void onClick(View view) {
        C105729h hVar = this.f295068a;
        if (hVar.f63126Q.mo28316z()) {
            C105749b bVar = hVar.f295070a;
            ((C105750c) bVar).f295110a.mo28345s("onPullToRefreshEntriesEvent", "SignInErrorEventsDispatcher", new Bundle());
        }
    }
}
