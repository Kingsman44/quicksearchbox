package com.google.android.libraries.storage.p3304a.p3312f;

import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.storage.a.f.m */
/* compiled from: PG */
public final class C42789m implements C42797g {

    /* renamed from: a */
    private final C63010eb f112053a;

    /* renamed from: b */
    private final C62921ba f112054b = C62921ba.f169869a;

    public C42789m(C63010eb ebVar) {
        this.f112053a = ebVar;
    }

    /* renamed from: b */
    public static C42789m m75558b(MessageLite messageLite) {
        return new C42789m(messageLite.getParserForType());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        InputStream b = new C42790n().mo34512a(fVar);
        try {
            MessageLite messageLite = (MessageLite) this.f112053a.mo59013l(b, this.f112054b);
            if (b != null) {
                b.close();
            }
            return messageLite;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
