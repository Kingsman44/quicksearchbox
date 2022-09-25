package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.android.libraries.storage.protostore.p3316a.C42874b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.storage.protostore.br */
/* compiled from: PG */
public final /* synthetic */ class C42922br implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42929by f112284a;

    /* renamed from: b */
    public final /* synthetic */ Uri f112285b;

    public /* synthetic */ C42922br(C42929by byVar, Uri uri) {
        this.f112284a = byVar;
        this.f112285b = uri;
    }

    public final C60870cx apply(Object obj) {
        C42929by byVar = this.f112284a;
        Uri a = C42874b.m75731a(this.f112285b, ".bak");
        try {
            if (!byVar.f112297c.mo45894h(a)) {
                return C60856cj.m92900i(obj);
            }
            Object h = byVar.mo45999h(a);
            byVar.f112297c.mo45892f(a);
            return C60856cj.m92900i(h);
        } catch (IOException e) {
            return C60856cj.m92899h(e);
        }
    }
}
