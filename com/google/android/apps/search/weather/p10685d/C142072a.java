package com.google.android.apps.search.weather.p10685d;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.search.p3025k.C38561o;
import java.net.URISyntaxException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.weather.d.a */
/* compiled from: PG */
public final class C142072a extends C38561o {
    public C142072a(Optional optional, Fragment fragment) {
        super(optional, fragment, 3);
    }

    /* renamed from: b */
    protected static final Intent m230645b(C142076e eVar) {
        try {
            return Intent.parseUri(eVar.f385466b, 1);
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed intent: URI", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo41488a(Object obj) {
        return m230645b((C142076e) obj);
    }
}
