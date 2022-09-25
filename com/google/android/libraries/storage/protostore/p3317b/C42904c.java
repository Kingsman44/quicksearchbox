package com.google.android.libraries.storage.protostore.p3317b;

import com.google.android.libraries.storage.protostore.C43007j;
import com.google.android.libraries.storage.protostore.C43008k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import java.io.IOException;

/* renamed from: com.google.android.libraries.storage.protostore.b.c */
/* compiled from: PG */
public final class C42904c extends C43007j {

    /* renamed from: a */
    private final MessageLite f112245a;

    public C42904c(MessageLite messageLite) {
        this.f112245a = messageLite;
    }

    /* renamed from: a */
    public final C60870cx mo45985a(IOException iOException, C43008k kVar) {
        if (!(iOException.getCause() instanceof C62974ct)) {
            return C60856cj.m92899h(iOException);
        }
        return C60846c.m92879h(kVar.mo45996a(C60856cj.m92900i(this.f112245a)), IOException.class, new C42903b(iOException), C60826bg.f164896a);
    }
}
