package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.C143603l;
import com.google.android.gms.cast.LaunchOptions;

/* renamed from: com.google.android.gms.cast.framework.j */
/* compiled from: PG */
final class C143463j extends C143546q {

    /* renamed from: a */
    final /* synthetic */ C143466m f389017a;

    public C143463j(C143466m mVar) {
        this.f389017a = mVar;
    }

    /* renamed from: a */
    public final int mo118704a() {
        return 223810000;
    }

    /* renamed from: b */
    public final void mo118705b(int i) {
        this.f389017a.mo118722e(i);
    }

    /* renamed from: c */
    public final void mo118706c(String str, String str2) {
        C143603l lVar = this.f389017a.f389023d;
        if (lVar != null && lVar.mo118485d()) {
            lVar.mo118482a(str, str2).mo122497p(new C143433i(this));
        }
    }

    /* renamed from: d */
    public final void mo118707d(String str, LaunchOptions launchOptions) {
        C143603l lVar = this.f389017a.f389023d;
        if (lVar != null && lVar.mo118485d()) {
            lVar.mo118483b(str, launchOptions).mo122497p(new C143432h(this));
        }
    }

    /* renamed from: e */
    public final void mo118708e(String str) {
        C143603l lVar = this.f389017a.f389023d;
        if (lVar != null && lVar.mo118485d()) {
            lVar.mo118489h(str);
        }
    }
}
