package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cu */
/* compiled from: PG */
public final /* synthetic */ class C118187cu implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C118189cw f328114a;

    public /* synthetic */ C118187cu(C118189cw cwVar) {
        this.f328114a = cwVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        Uri[] uriArr;
        C118189cw cwVar = this.f328114a;
        if (cwVar.f328121f != null) {
            if (i == -1 && intent != null) {
                if (intent.getData() == null) {
                    Uri uri = cwVar.f328123h;
                    if (uri != null) {
                        uriArr = new Uri[]{uri};
                    }
                } else {
                    Uri data = intent.getData();
                    C58893dc.m90996a(data);
                    uriArr = new Uri[]{data};
                }
                cwVar.f328121f.onReceiveValue(uriArr);
            }
            uriArr = null;
            cwVar.f328121f.onReceiveValue(uriArr);
        }
        cwVar.f328121f = null;
        cwVar.f328122g = null;
        cwVar.f328123h = null;
        return true;
    }
}
