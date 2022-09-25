package com.google.android.libraries.web.weblayer.p3460d.p3461a;

import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72621j;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.libraries.web.weblayer.d.a.a */
/* compiled from: PG */
final class C44218a implements C72621j {

    /* renamed from: a */
    final /* synthetic */ C69577g f115005a;

    public C44218a(C69577g gVar) {
        this.f115005a = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo46626a(Object obj) {
        String str;
        C69577g gVar = this.f115005a;
        if (obj != null) {
            C72604bm.m107399a();
            if (C72611bt.m107413a() >= 101) {
                try {
                    str = ((C72611bt) obj).f193174f.mo63774g();
                } catch (RemoteException e) {
                    throw new C72304a(e);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        gVar.mo61338mb(str);
    }
}
