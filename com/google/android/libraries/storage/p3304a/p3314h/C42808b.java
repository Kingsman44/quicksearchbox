package com.google.android.libraries.storage.p3304a.p3314h;

import com.google.common.p4541l.C59332o;
import com.google.p5238v.p5239a.p5259m.C67882l;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.a.h.b */
/* compiled from: PG */
public final /* synthetic */ class C42808b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ byte[] f112063a;

    /* renamed from: b */
    public final /* synthetic */ InputStream f112064b;

    public /* synthetic */ C42808b(byte[] bArr, InputStream inputStream) {
        this.f112063a = bArr;
        this.f112064b = inputStream;
    }

    public final Object call() {
        byte[] bArr = this.f112063a;
        InputStream inputStream = this.f112064b;
        byte[] bArr2 = C42809c.f112065a;
        try {
            return new C67882l(bArr).mo59877a(C59332o.m92213d(inputStream), C42809c.f112065a);
        } finally {
            inputStream.close();
        }
    }
}
