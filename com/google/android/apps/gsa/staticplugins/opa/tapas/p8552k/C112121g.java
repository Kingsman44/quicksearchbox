package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C29690f;
import java.nio.ByteBuffer;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.g */
/* compiled from: PG */
public final /* synthetic */ class C112121g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112127m f311345a;

    /* renamed from: b */
    public final /* synthetic */ C29690f f311346b;

    /* renamed from: c */
    public final /* synthetic */ String f311347c;

    public /* synthetic */ C112121g(C112127m mVar, C29690f fVar, String str) {
        this.f311345a = mVar;
        this.f311346b = fVar;
        this.f311347c = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112127m mVar = this.f311345a;
        C29690f fVar = this.f311346b;
        String str = this.f311347c;
        if (!((Boolean) obj).booleanValue()) {
            mVar.mo99407h(1, "JNI load was unsuccessful. Not loading resources.", new Object[0]);
            return false;
        }
        Optional c = mVar.mo99403c(fVar, str);
        if (c.isEmpty()) {
            return false;
        }
        return mVar.mo99404e((ByteBuffer) c.get(), fVar.f80414e);
    }
}
