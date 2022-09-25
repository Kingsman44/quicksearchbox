package com.google.android.apps.gsa.shared.p6968aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.net.URL;

/* renamed from: com.google.android.apps.gsa.shared.aa.av */
/* compiled from: PG */
public final class C89024av {
    /* renamed from: a */
    public static void m144774a(C91005e eVar, URL url) {
        String str;
        C90752i[] iVarArr = new C90752i[8];
        iVarArr[0] = C90752i.m148229c(url.getProtocol());
        iVarArr[1] = C90752i.m148229c(url.getHost());
        int port = url.getPort();
        String str2 = BuildConfig.FLAVOR;
        if (port != -1) {
            str = ":" + url.getPort();
        } else {
            str = str2;
        }
        iVarArr[2] = C90752i.m148229c(str);
        iVarArr[3] = C90752i.m148229c(url.getPath());
        iVarArr[4] = C90752i.m148229c(url.getQuery() != null ? "?" : str2);
        iVarArr[5] = C90752i.m148233g(url.getQuery() != null ? url.getQuery() : str2);
        iVarArr[6] = C90752i.m148229c(url.getRef() != null ? "#" : str2);
        if (url.getRef() != null) {
            str2 = url.getRef();
        }
        iVarArr[7] = C90752i.m148233g(str2);
        eVar.mo85277b("%s://%s%s%s%s%s%s%s ", iVarArr);
    }
}
