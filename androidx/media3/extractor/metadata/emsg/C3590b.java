package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.metadata.C3585b;
import androidx.media3.extractor.metadata.C3586c;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.metadata.emsg.b */
/* compiled from: PG */
public final class C3590b extends C3586c {
    /* renamed from: c */
    public static final EventMessage m10387c(C2604ac acVar) {
        String B = acVar.mo6132B();
        B.getClass();
        String B2 = acVar.mo6132B();
        B2.getClass();
        return new EventMessage(B, B2, acVar.mo6145m(), acVar.mo6145m(), Arrays.copyOfRange(acVar.f7234a, acVar.f7235b, acVar.f7236c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Metadata mo7492b(C3585b bVar, ByteBuffer byteBuffer) {
        return new Metadata(-9223372036854775807L, m10387c(new C2604ac(byteBuffer.array(), byteBuffer.limit())));
    }
}
