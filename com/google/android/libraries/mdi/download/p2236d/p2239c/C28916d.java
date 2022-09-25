package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29338dv;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.delta.C29320a;
import com.google.android.libraries.mdi.download.delta.vcdiff.C29321a;
import com.google.android.libraries.mdi.download.delta.vcdiff.VcDiffFileDecoder;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import com.google.common.base.C58890d;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.c.d */
/* compiled from: PG */
public final /* synthetic */ class C28916d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28917e f78537a;

    /* renamed from: b */
    public final /* synthetic */ C29398ev f78538b;

    /* renamed from: c */
    public final /* synthetic */ Uri f78539c;

    /* renamed from: d */
    public final /* synthetic */ Uri f78540d;

    public /* synthetic */ C28916d(C28917e eVar, C29398ev evVar, Uri uri, Uri uri2) {
        this.f78537a = eVar;
        this.f78538b = evVar;
        this.f78539c = uri;
        this.f78540d = uri2;
    }

    public final C60870cx apply(Object obj) {
        int i;
        C28917e eVar = this.f78537a;
        C29398ev evVar = this.f78538b;
        Uri uri = this.f78539c;
        Uri uri2 = this.f78540d;
        C29402ez ezVar = (C29402ez) obj;
        Uri uri3 = null;
        if (ezVar != null) {
            C29390en a = C29390en.m54308a(ezVar.f79715c);
            if (a == null) {
                a = C29390en.NONE;
            }
            if (a == C29390en.DOWNLOAD_COMPLETE) {
                uri3 = C29090d.m53984e(eVar.f78541a, eVar.f78555o, ezVar.f79714b, evVar.f79703d, eVar.f78544d, eVar.f78552l, false);
            }
        }
        if (uri3 == null) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        try {
            if (eVar.f78543c.mo45894h(uri)) {
                eVar.f78543c.mo45892f(uri);
            }
            C29321a aVar = eVar.f78554n;
            if (!VcDiffFileDecoder.f79466a) {
                throw new C29320a("VcDiff decoding library is not initialized!");
            } else if (VcDiffFileDecoder.m54211a(aVar.mo34653a(uri3), aVar.mo34653a(uri2), aVar.mo34653a(uri))) {
                eVar.f78543c.mo45892f(uri2);
                C60125aq aqVar = (C60125aq) C60126ar.f162612j.createBuilder();
                String str = eVar.f78548h.f79682b;
                aqVar.copyOnWrite();
                C60126ar arVar = (C60126ar) aqVar.instance;
                str.getClass();
                arVar.f162614a |= 1;
                arVar.f162615b = str;
                int i2 = eVar.f78549i;
                aqVar.copyOnWrite();
                C60126ar arVar2 = (C60126ar) aqVar.instance;
                arVar2.f162614a = 2 | arVar2.f162614a;
                arVar2.f162616c = i2;
                String str2 = eVar.f78548h.f79683c;
                aqVar.copyOnWrite();
                C60126ar arVar3 = (C60126ar) aqVar.instance;
                str2.getClass();
                arVar3.f162614a |= 4;
                arVar3.f162617d = str2;
                long j = eVar.f78550j;
                aqVar.copyOnWrite();
                C60126ar arVar4 = (C60126ar) aqVar.instance;
                arVar4.f162614a |= 64;
                arVar4.f162621h = j;
                String str3 = eVar.f78551k;
                aqVar.copyOnWrite();
                C60126ar arVar5 = (C60126ar) aqVar.instance;
                str3.getClass();
                arVar5.f162614a |= 128;
                arVar5.f162622i = str3;
                C60126ar arVar6 = (C60126ar) aqVar.build();
                C29037d dVar = eVar.f78547g;
                C29328dl dlVar = eVar.f78545e;
                long j2 = (long) dlVar.f79475d;
                long j3 = (long) eVar.f78546f.f79526c;
                String str4 = dlVar.f79473b;
                int i3 = 0;
                while (true) {
                    if (i3 >= eVar.f78545e.f79482k.size()) {
                        i = 0;
                        break;
                    } else if (C58890d.m90990e(((C29338dv) eVar.f78545e.f79482k.get(i3)).f79527d, eVar.f78546f.f79527d)) {
                        i = i3 + 1;
                        break;
                    } else {
                        i3++;
                    }
                }
                dVar.mo34547l(arVar6, 4, j2, j3, str4, i);
                return C60866ct.f164955a;
            } else {
                throw new C29320a("Failed to decode.");
            }
        } catch (C42764q e) {
            throw new C29320a((Throwable) e);
        } catch (IOException e2) {
            C29045l.m53938j(e2, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", eVar.f78546f.f79525b, eVar.f78545e.f79477f);
            eVar.f78544d.mo34497a(e2, "Failed to decode delta file.", new Object[0]);
            C28736bn bnVar2 = new C28736bn();
            bnVar2.f78062a = C28737bo.DELTA_DOWNLOAD_DECODE_IO_ERROR;
            bnVar2.f78064c = e2;
            return C60856cj.m92899h(bnVar2.mo34334a());
        }
    }
}
