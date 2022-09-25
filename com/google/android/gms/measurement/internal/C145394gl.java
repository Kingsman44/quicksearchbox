package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.gl */
/* compiled from: PG */
final class C145394gl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145416hg f393073a;

    public C145394gl(C145416hg hgVar) {
        this.f393073a = hgVar;
    }

    public final void run() {
        String str;
        C145501q qVar = this.f393073a.f393144e;
        qVar.f393402a.mo120966as().mo120904g();
        if (qVar.mo121299b()) {
            if (qVar.mo121300c()) {
                qVar.f393402a.mo120971g().f392867t.mo120920b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                qVar.f393402a.mo120972j().mo121101o("auto", "_cmpx", bundle);
            } else {
                C145338ej ejVar = qVar.f393402a.mo120971g().f392867t;
                ejVar.mo120919a();
                String str2 = ejVar.f392844a;
                if (TextUtils.isEmpty(str2)) {
                    qVar.f393402a.mo120965ar().f392796d.mo120894a("Cache still valid but referrer not found");
                } else {
                    C145336eh ehVar = qVar.f393402a.mo120971g().f392868u;
                    ehVar.mo120915a();
                    long j = ((ehVar.f392834a / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(str2);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", j);
                    if (pair.first == null) {
                        str = "app";
                    } else {
                        str = (String) pair.first;
                    }
                    qVar.f393402a.mo120972j().mo121101o(str, "_cmp", (Bundle) pair.second);
                }
                qVar.f393402a.mo120971g().f392867t.mo120920b((String) null);
            }
            qVar.f393402a.mo120971g().f392868u.mo120916b(0);
        }
    }
}
