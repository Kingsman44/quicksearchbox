package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.eq */
/* compiled from: PG */
public final /* synthetic */ class C105597eq implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105598er f294639a;

    public /* synthetic */ C105597eq(C105598er erVar) {
        this.f294639a = erVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105598er erVar = this.f294639a;
        String str = (String) ((C58833ax) obj).mo56109e(BuildConfig.FLAVOR);
        if (!str.equals(erVar.f294640t)) {
            erVar.f294640t = str;
            erVar.mo94926r();
        }
    }
}
