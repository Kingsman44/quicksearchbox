package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.metadata.id3.C3603g;
import androidx.media3.extractor.metadata.id3.C3605i;
import java.io.EOFException;

/* renamed from: androidx.media3.extractor.ap */
/* compiled from: PG */
public final class C3341ap {

    /* renamed from: a */
    private final C2604ac f10079a = new C2604ac(10);

    /* renamed from: a */
    public final Metadata mo7334a(C3327ab abVar, C3603g gVar) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                ((C3627q) abVar).mo7320o(this.f10079a.f7234a, 0, 10, false);
                this.f10079a.mo6131A(0);
                if (this.f10079a.mo6140h() != 4801587) {
                    break;
                }
                C2604ac acVar = this.f10079a;
                acVar.mo6131A(acVar.f7235b + 3);
                int f = this.f10079a.mo6138f();
                int i2 = f + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f10079a.f7234a, 0, bArr, 0, 10);
                    ((C3627q) abVar).mo7320o(bArr, 10, f, false);
                    metadata = new C3605i(gVar).mo7581c(bArr, i2);
                } else {
                    ((C3627q) abVar).mo7319n(f, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        C3627q qVar = (C3627q) abVar;
        qVar.f11568e = 0;
        qVar.mo7319n(i, false);
        return metadata;
    }
}
