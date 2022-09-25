package androidx.media3.extractor.metadata;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.extractor.metadata.c */
/* compiled from: PG */
public abstract class C3586c implements C3584a {
    /* renamed from: a */
    public final Metadata mo7491a(C3585b bVar) {
        ByteBuffer byteBuffer = bVar.f6955c;
        byteBuffer.getClass();
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        C2601a.m6830b(z);
        if (bVar.mo5954fh(LinearLayoutManager.INVALID_OFFSET)) {
            return null;
        }
        return mo7492b(bVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Metadata mo7492b(C3585b bVar, ByteBuffer byteBuffer);
}
