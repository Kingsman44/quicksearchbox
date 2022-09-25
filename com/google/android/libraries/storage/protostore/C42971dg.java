package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.android.libraries.storage.protostore.p3316a.C42874b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.storage.protostore.dg */
/* compiled from: PG */
public final /* synthetic */ class C42971dg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42981dq f112399a;

    public /* synthetic */ C42971dg(C42981dq dqVar) {
        this.f112399a = dqVar;
    }

    public final C60870cx apply(Object obj) {
        C42981dq dqVar = this.f112399a;
        Uri uri = (Uri) obj;
        Uri a = C42874b.m75731a(uri, ".bak");
        try {
            if (dqVar.f112417c.mo45894h(a)) {
                dqVar.f112417c.mo45893g(a, uri);
            }
            return C60866ct.f164955a;
        } catch (IOException e) {
            return C60856cj.m92899h(e);
        }
    }
}
