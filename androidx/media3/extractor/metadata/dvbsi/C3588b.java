package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.extractor.metadata.C3585b;
import androidx.media3.extractor.metadata.C3586c;
import com.google.common.base.C58913w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.extractor.metadata.dvbsi.b */
/* compiled from: PG */
public final class C3588b extends C3586c {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Metadata mo7492b(C3585b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        C2603ab abVar = new C2603ab(byteBuffer.array(), byteBuffer.limit());
        abVar.mo6126k(12);
        int b = (abVar.mo6117b() + abVar.mo6119d(12)) - 4;
        abVar.mo6126k(44);
        abVar.mo6127l(abVar.mo6119d(12));
        abVar.mo6126k(16);
        ArrayList arrayList = new ArrayList();
        while (abVar.mo6117b() < b) {
            abVar.mo6126k(48);
            int d = abVar.mo6119d(8);
            abVar.mo6126k(4);
            int b2 = abVar.mo6117b() + abVar.mo6119d(12);
            String str = null;
            String str2 = null;
            while (abVar.mo6117b() < b2) {
                int d2 = abVar.mo6119d(8);
                int d3 = abVar.mo6119d(8);
                int b3 = abVar.mo6117b() + d3;
                if (d2 == 2) {
                    int d4 = abVar.mo6119d(16);
                    abVar.mo6126k(8);
                    if (d4 != 3) {
                    }
                    while (abVar.mo6117b() < b3) {
                        str = abVar.mo6120e(abVar.mo6119d(8), C58913w.f156752a);
                        int d5 = abVar.mo6119d(8);
                        for (int i = 0; i < d5; i++) {
                            abVar.mo6127l(abVar.mo6119d(8));
                        }
                    }
                } else if (d2 == 21) {
                    str2 = abVar.mo6120e(d3, C58913w.f156752a);
                }
                abVar.mo6124i(b3 * 8);
            }
            abVar.mo6124i(b2 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new AppInfoTable(d, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List) arrayList);
    }
}
