package com.google.android.libraries.mdi.download.p2236d;

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

/* renamed from: com.google.android.libraries.mdi.download.d.bl */
/* compiled from: PG */
public final /* synthetic */ class C28897bl implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78484a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78485b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f78486c;

    /* renamed from: d */
    public final /* synthetic */ C29398ev f78487d;

    public /* synthetic */ C28897bl(C29117fe feVar, C29334dr drVar, C29328dl dlVar, C29398ev evVar) {
        this.f78484a = feVar;
        this.f78485b = drVar;
        this.f78486c = dlVar;
        this.f78487d = evVar;
    }

    public final C60870cx apply(Object obj) {
        char c;
        C29117fe feVar = this.f78484a;
        C29334dr drVar = this.f78485b;
        C29328dl dlVar = this.f78486c;
        C29398ev evVar = this.f78487d;
        C29402ez ezVar = (C29402ez) obj;
        long j = drVar.f79509k;
        try {
            if (ezVar.f79716d) {
                C29045l.m53932d("%s: Android sharing CASE 1 for file %s, filegroup %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
                C60870cx u = feVar.mo34595u(drVar, dlVar, ezVar, evVar, ezVar.f79718f, j, 3);
                C28886ba baVar = C28886ba.f78457a;
                return C60922j.m93045h(u, C47810es.m84966f(baVar), feVar.f78980i);
            }
            long j2 = j;
            String str = dlVar.f79485n;
            if (TextUtils.isEmpty(str)) {
                c = 2;
            } else if (C29089c.m53979b(feVar.f78972a, str, drVar, dlVar, feVar.f78978g)) {
                C29045l.m53932d("%s: Android sharing CASE 2 for file %s, filegroup %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
                c = 2;
                try {
                    C60870cx u2 = feVar.mo34595u(drVar, dlVar, ezVar, evVar, str, j2, 4);
                    C28887bb bbVar = C28887bb.f78458a;
                    return C60922j.m93045h(u2, C47810es.m84966f(bbVar), feVar.f78980i);
                } catch (C29088b e) {
                    e = e;
                    C29117fe.m54054w(feVar.f78973b, drVar, dlVar, e.f78939a);
                    Object[] objArr = new Object[3];
                    objArr[0] = "FileGroupManager";
                    objArr[1] = dlVar.f79473b;
                    objArr[c] = drVar.f79501c;
                    C29045l.m53932d("%s: File couldn't be shared before download %s, filegroup %s", objArr);
                    return C60866ct.f164955a;
                }
            } else {
                c = 2;
                int a = C29324dh.m54215a(dlVar.f79483l);
                if (a != 0) {
                    if (a == 2) {
                        C29390en a2 = C29390en.m54308a(ezVar.f79715c);
                        if (a2 == null) {
                            a2 = C29390en.NONE;
                        }
                        if (a2 == C29390en.DOWNLOAD_COMPLETE) {
                            C29045l.m53932d("%s: Android sharing CASE 3 for file %s, filegroup %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
                            String str2 = str;
                            C29089c.m53978a(feVar.f78972a, str2, feVar.mo34579b(dlVar, evVar, ezVar), drVar, dlVar, feVar.f78978g, false);
                            C60870cx u3 = feVar.mo34595u(drVar, dlVar, ezVar, evVar, str, j2, 6);
                            C28888bc bcVar = C28888bc.f78459a;
                            return C60922j.m93045h(u3, C47810es.m84966f(bcVar), feVar.f78980i);
                        }
                    }
                }
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = "FileGroupManager";
            objArr2[1] = dlVar.f79473b;
            objArr2[c] = drVar.f79501c;
            C29045l.m53932d("%s: File couldn't be shared before download %s, filegroup %s", objArr2);
            return C60866ct.f164955a;
        } catch (C29088b e2) {
            e = e2;
            c = 2;
            C29117fe.m54054w(feVar.f78973b, drVar, dlVar, e.f78939a);
            Object[] objArr22 = new Object[3];
            objArr22[0] = "FileGroupManager";
            objArr22[1] = dlVar.f79473b;
            objArr22[c] = drVar.f79501c;
            C29045l.m53932d("%s: File couldn't be shared before download %s, filegroup %s", objArr22);
            return C60866ct.f164955a;
        }
    }
}
