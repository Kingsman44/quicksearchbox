package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.mdi.download.C29324dh;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29088b;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29089c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.bi */
/* compiled from: PG */
public final /* synthetic */ class C28894bi implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78475a;

    /* renamed from: b */
    public final /* synthetic */ C29328dl f78476b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78477c;

    /* renamed from: d */
    public final /* synthetic */ C29398ev f78478d;

    public /* synthetic */ C28894bi(C29117fe feVar, C29328dl dlVar, C29334dr drVar, C29398ev evVar) {
        this.f78475a = feVar;
        this.f78476b = dlVar;
        this.f78477c = drVar;
        this.f78478d = evVar;
    }

    public final C60870cx apply(Object obj) {
        int i;
        int i2;
        C29117fe feVar = this.f78475a;
        C29328dl dlVar = this.f78476b;
        C29334dr drVar = this.f78477c;
        C29398ev evVar = this.f78478d;
        C29402ez ezVar = (C29402ez) obj;
        String str = dlVar.f79485n;
        long j = drVar.f79509k;
        C29390en a = C29390en.m54308a(ezVar.f79715c);
        if (a == null) {
            a = C29390en.NONE;
        }
        if (a != C29390en.DOWNLOAD_COMPLETE) {
            return C60866ct.f164955a;
        }
        if (!ezVar.f79716d) {
            long j2 = j;
            try {
                if (!TextUtils.isEmpty(str)) {
                    Uri b = feVar.mo34579b(dlVar, evVar, ezVar);
                    if (C29089c.m53979b(feVar.f78972a, str, drVar, dlVar, feVar.f78978g)) {
                        C29045l.m53932d("%s: Android sharing after downloaded, CASE 1 for file %s, filegroup %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
                        i2 = 2;
                        try {
                            C60870cx u = feVar.mo34595u(drVar, dlVar, ezVar, evVar, str, j2, 5);
                            C29069ej ejVar = new C29069ej(feVar, drVar, dlVar, evVar, j2);
                            return C60922j.m93045h(u, C47810es.m84966f(ejVar), feVar.f78980i);
                        } catch (C29088b e) {
                            e = e;
                            C29117fe.m54054w(feVar.f78973b, drVar, dlVar, e.f78939a);
                            Object[] objArr = new Object[3];
                            objArr[0] = "FileGroupManager";
                            objArr[1] = dlVar.f79473b;
                            objArr[i] = drVar.f79501c;
                            C29045l.m53932d("%s: File couldn't be shared after download %s, filegroup %s", objArr);
                            return feVar.mo34591n(drVar, dlVar, evVar, j2);
                        }
                    } else {
                        i = 2;
                        int a2 = C29324dh.m54215a(dlVar.f79483l);
                        if (a2 != 0) {
                            if (a2 == 2) {
                                C29045l.m53932d("%s: Android sharing after downloaded, CASE 2 for file %s, filegroup %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
                                C29089c.m53978a(feVar.f78972a, str, b, drVar, dlVar, feVar.f78978g, true);
                                C60870cx u2 = feVar.mo34595u(drVar, dlVar, ezVar, evVar, str, j2, 7);
                                C29070ek ekVar = new C29070ek(feVar, drVar, dlVar, evVar, j2);
                                return C60922j.m93045h(u2, C47810es.m84966f(ekVar), feVar.f78980i);
                            }
                        }
                    }
                } else {
                    i = 2;
                }
                int a3 = C29324dh.m54215a(dlVar.f79483l);
                if (a3 != 0) {
                    if (a3 == i) {
                        C29117fe.m54054w(feVar.f78973b, drVar, dlVar, 16);
                    }
                }
            } catch (C29088b e2) {
                e = e2;
                i2 = 2;
                C29117fe.m54054w(feVar.f78973b, drVar, dlVar, e.f78939a);
                Object[] objArr2 = new Object[3];
                objArr2[0] = "FileGroupManager";
                objArr2[1] = dlVar.f79473b;
                objArr2[i] = drVar.f79501c;
                C29045l.m53932d("%s: File couldn't be shared after download %s, filegroup %s", objArr2);
                return feVar.mo34591n(drVar, dlVar, evVar, j2);
            }
            Object[] objArr22 = new Object[3];
            objArr22[0] = "FileGroupManager";
            objArr22[1] = dlVar.f79473b;
            objArr22[i] = drVar.f79501c;
            C29045l.m53932d("%s: File couldn't be shared after download %s, filegroup %s", objArr22);
            return feVar.mo34591n(drVar, dlVar, evVar, j2);
        } else if (!C29117fe.m54052t(ezVar, j)) {
            return C60866ct.f164955a;
        } else {
            C29045l.m53932d("%s: File already shared after downloaded but lease has to be updated for file %s, filegroup %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
            C29398ev evVar2 = evVar;
            long j3 = j;
            C60870cx u3 = feVar.mo34595u(drVar, dlVar, ezVar, evVar2, ezVar.f79718f, j3, 27);
            C29068ei eiVar = new C29068ei(feVar, drVar, dlVar, evVar2, j3);
            return C60922j.m93045h(u3, C47810es.m84966f(eiVar), feVar.f78980i);
        }
    }
}
