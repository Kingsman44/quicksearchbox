package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.j */
/* compiled from: PG */
final class C18364j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f52087a;

    /* renamed from: b */
    final /* synthetic */ String f52088b;

    /* renamed from: c */
    final /* synthetic */ C18365k f52089c;

    /* renamed from: d */
    final /* synthetic */ int f52090d;

    public C18364j(C18365k kVar, int i, int i2, String str) {
        this.f52089c = kVar;
        this.f52087a = i;
        this.f52090d = i2;
        this.f52088b = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C18365k.f52091a.mo56226d()).mo56382g(th)).mo56372aa(47299)).mo56387q("Error when trying to download DSP models. Will retry %d more times", this.f52087a - 1);
        this.f52089c.mo23846b(this.f52090d, this.f52088b, this.f52087a - 1);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        ((C58970a) ((C58970a) C18365k.f52091a.mo56224b()).mo56372aa(47300)).mo56386p("Successfully downloaded DSP models.");
    }
}
