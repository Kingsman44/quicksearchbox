package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.protobuf.C62912at;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.aw */
/* compiled from: PG */
public final /* synthetic */ class C122175aw implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C122210bb f338859a;

    /* renamed from: b */
    public final /* synthetic */ Collection f338860b;

    public /* synthetic */ C122175aw(C122210bb bbVar, Collection collection) {
        this.f338859a = bbVar;
        this.f338860b = collection;
    }

    public final Object call() {
        this.f338859a.mo105571c(new C122178az(this.f338860b));
        return C62912at.f169862a;
    }
}
