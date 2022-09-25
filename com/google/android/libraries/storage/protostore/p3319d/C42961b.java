package com.google.android.libraries.storage.protostore.p3319d;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.protostore.d.b */
/* compiled from: PG */
public final /* synthetic */ class C42961b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42964e f112366a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f112367b;

    public /* synthetic */ C42961b(C42964e eVar, MessageLite messageLite) {
        this.f112366a = eVar;
        this.f112367b = messageLite;
    }

    public final Object call() {
        C42964e eVar = this.f112366a;
        MessageLite messageLite = this.f112367b;
        C42813k kVar = eVar.f112373b;
        Uri uri = eVar.f112372a;
        try {
            return (MessageLite) kVar.mo45889c(uri, C42789m.m75558b(messageLite));
        } catch (FileNotFoundException e) {
            if (!kVar.mo45894h(uri)) {
                return messageLite;
            }
            throw e;
        }
    }
}
