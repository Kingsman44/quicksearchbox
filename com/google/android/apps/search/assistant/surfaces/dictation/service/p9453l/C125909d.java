package com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l;

import android.content.Context;
import com.google.android.gms.common.C143701ac;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.p4634b.C61382a;
import com.google.frameworks.client.data.android.p4634b.C61383b;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.l.d */
/* compiled from: PG */
public final class C125909d {

    /* renamed from: a */
    private static final C58528ij f346996a;

    /* renamed from: b */
    private static final C69762k f346997b = new C69762k("com\\.google\\.android\\.inputmethod.*");

    /* renamed from: c */
    private final boolean f346998c;

    static {
        C58528ij K = C58528ij.m90011K("com.google.android.inputmethod.latin", "com.google.android.inputmethod.latin.canary");
        C69664n.m101060f(K, "of(PROD_PACKAGE, CANARY_PACKAGE)");
        f346996a = K;
    }

    public C125909d(boolean z) {
        this.f346998c = z;
    }

    /* renamed from: a */
    public final C70235o mo107162a(Context context) {
        C69664n.m101061g(context, "context");
        if (this.f346998c) {
            return new C61382a(C143701ac.m233450a(context));
        }
        return new C61383b(context.getPackageManager(), f346996a, C143701ac.m233450a(context));
    }

    /* renamed from: b */
    public final boolean mo107163b(String str) {
        C69664n.m101061g(str, "packageName");
        if ((!this.f346998c || !f346997b.mo61434b(str)) && !f346996a.contains(str)) {
            return false;
        }
        return true;
    }
}
