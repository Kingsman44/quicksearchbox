package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.e */
/* compiled from: PG */
public abstract class C63008e implements C63010eb {

    /* renamed from: a */
    private static final C62921ba f170084a = C62921ba.f169869a;

    /* renamed from: q */
    private static final void m95678q(MessageLite messageLite) {
        C63043fh fhVar;
        if (messageLite != null && !messageLite.isInitialized()) {
            if (messageLite instanceof C62947c) {
                fhVar = ((C62947c) messageLite).newUninitializedMessageException();
            } else if (messageLite instanceof C62981d) {
                C62981d dVar = (C62981d) messageLite;
                throw null;
            } else {
                fhVar = new C63043fh();
            }
            throw fhVar.mo59085a();
        }
    }

    /* renamed from: a */
    public final MessageLite mo59003a(InputStream inputStream, C62921ba baVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return mo59005c(new C62881a(inputStream, C62897ae.m95108J(read, inputStream)), baVar);
        } catch (IOException e) {
            throw new C62974ct(e);
        }
    }

    /* renamed from: b */
    public final MessageLite mo59004b(C63088z zVar, C62921ba baVar) {
        try {
            C62897ae l = zVar.mo59040l();
            MessageLite messageLite = (MessageLite) mo58879p(l, baVar);
            l.mo58658A(0);
            return messageLite;
        } catch (C62974ct e) {
            throw e;
        } catch (C62974ct e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public final MessageLite mo59005c(InputStream inputStream, C62921ba baVar) {
        C62897ae M = C62897ae.m95110M(inputStream);
        MessageLite messageLite = (MessageLite) mo58879p(M, baVar);
        try {
            M.mo58658A(0);
            return messageLite;
        } catch (C62974ct e) {
            throw e;
        }
    }

    /* renamed from: d */
    public MessageLite mo58878d(byte[] bArr, int i, int i2, C62921ba baVar) {
        throw null;
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo59006e(InputStream inputStream) {
        MessageLite a = mo59003a(inputStream, f170084a);
        m95678q(a);
        return a;
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo59007f(InputStream inputStream, C62921ba baVar) {
        MessageLite a = mo59003a(inputStream, baVar);
        m95678q(a);
        return a;
    }

    /* renamed from: g */
    public final /* synthetic */ Object mo59008g(C63088z zVar) {
        MessageLite b = mo59004b(zVar, f170084a);
        m95678q(b);
        return b;
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo59009h(InputStream inputStream) {
        MessageLite c = mo59005c(inputStream, f170084a);
        m95678q(c);
        return c;
    }

    /* renamed from: i */
    public final /* synthetic */ Object mo59010i(byte[] bArr) {
        MessageLite d = mo58878d(bArr, 0, bArr.length, f170084a);
        m95678q(d);
        return d;
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo59011j(C63088z zVar, C62921ba baVar) {
        MessageLite b = mo59004b(zVar, baVar);
        m95678q(b);
        return b;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo59012k(C62897ae aeVar, C62921ba baVar) {
        MessageLite messageLite = (MessageLite) mo58879p(aeVar, baVar);
        m95678q(messageLite);
        return messageLite;
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo59013l(InputStream inputStream, C62921ba baVar) {
        MessageLite c = mo59005c(inputStream, baVar);
        m95678q(c);
        return c;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Object mo59014m(ByteBuffer byteBuffer, C62921ba baVar) {
        try {
            C62897ae N = C62897ae.m95111N(byteBuffer);
            MessageLite messageLite = (MessageLite) mo58879p(N, baVar);
            N.mo58658A(0);
            m95678q(messageLite);
            return messageLite;
        } catch (C62974ct e) {
            throw e;
        } catch (C62974ct e2) {
            throw e2;
        }
    }

    /* renamed from: n */
    public final /* synthetic */ Object mo59015n(byte[] bArr, C62921ba baVar) {
        MessageLite d = mo58878d(bArr, 0, bArr.length, baVar);
        m95678q(d);
        return d;
    }

    /* renamed from: o */
    public final /* synthetic */ Object mo59016o(byte[] bArr, int i, int i2, C62921ba baVar) {
        MessageLite d = mo58878d(bArr, i, i2, baVar);
        m95678q(d);
        return d;
    }
}
