package com.google.android.apps.gsa.staticplugins.opa.tapas.p8551j;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4440ca.p4442b.p4443a.C57928d;
import java.io.File;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.j.a */
/* compiled from: PG */
public final /* synthetic */ class C112103a implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C112103a f311320a = new C112103a();

    private /* synthetic */ C112103a() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty() || !((File) optional.get()).exists()) {
            return C60856cj.m92900i(Optional.empty());
        }
        try {
            return C60856cj.m92900i(Optional.m71637of(new C57928d(((File) optional.get()).getAbsolutePath(), 10)));
        } catch (IOException unused) {
            return C60856cj.m92900i(Optional.empty());
        }
    }
}
