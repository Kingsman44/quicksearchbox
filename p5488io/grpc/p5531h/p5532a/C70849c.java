package p5488io.grpc.p5531h.p5532a;

import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import p5488io.grpc.C70293cv;

/* renamed from: io.grpc.h.a.c */
/* compiled from: PG */
final class C70849c implements C70293cv {

    /* renamed from: a */
    private final MessageLite f189013a;

    public C70849c(MessageLite messageLite) {
        this.f189013a = messageLite;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23994a(byte[] bArr) {
        try {
            return (MessageLite) this.f189013a.getParserForType().mo59015n(bArr, C70850d.f189014a);
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ byte[] mo23995b(Object obj) {
        return ((MessageLite) obj).toByteArray();
    }
}
