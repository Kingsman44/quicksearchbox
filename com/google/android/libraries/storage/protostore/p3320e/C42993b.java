package com.google.android.libraries.storage.protostore.p3320e;

import com.google.android.libraries.storage.protostore.C42906bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.storage.protostore.e.b */
/* compiled from: PG */
public abstract class C42993b implements C42906bb {
    /* renamed from: a */
    public abstract C62921ba mo46032a();

    /* renamed from: b */
    public abstract MessageLite mo46033b();

    /* renamed from: c */
    public final MessageLite mo46037c(InputStream inputStream) {
        return (MessageLite) mo46033b().getParserForType().mo59013l(inputStream, mo46032a());
    }
}
