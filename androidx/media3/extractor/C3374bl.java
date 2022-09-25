package androidx.media3.extractor;

import android.util.Base64;
import androidx.media3.common.C2599az;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.common.base.C58913w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.extractor.bl */
/* compiled from: PG */
public final class C3374bl {
    /* renamed from: a */
    public static int m9758a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static Metadata m9759b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] ar = C2612ak.m6968ar(str, "=");
            if (ar.length != 2) {
                C2633u.m7050e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (ar[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.m10391d(new C2604ac(Base64.decode(ar[1], 0))));
                } catch (RuntimeException e) {
                    C2633u.m7050e("VorbisUtil", C2633u.m7046a("Failed to parse vorbis picture", e));
                }
            } else {
                arrayList.add(new VorbisComment(ar[0], ar[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List) arrayList);
    }

    /* renamed from: c */
    public static C3371bi m9760c(C2604ac acVar, boolean z, boolean z2) {
        if (z) {
            m9761d(3, acVar, false);
        }
        acVar.mo6151s((int) acVar.mo6144l(), C58913w.f156754c);
        long l = acVar.mo6144l();
        String[] strArr = new String[((int) l)];
        for (int i = 0; ((long) i) < l; i++) {
            strArr[i] = acVar.mo6151s((int) acVar.mo6144l(), C58913w.f156754c);
        }
        if (!z2 || (acVar.mo6139g() & 1) != 0) {
            return new C3371bi(strArr);
        }
        throw C2599az.m6819a("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: d */
    public static boolean m9761d(int i, C2604ac acVar, boolean z) {
        int i2 = acVar.f7236c - acVar.f7235b;
        if (i2 < 7) {
            if (z) {
                return false;
            }
            throw C2599az.m6819a("too short header: " + i2, (Throwable) null);
        } else if (acVar.mo6139g() != i) {
            if (z) {
                return false;
            }
            throw C2599az.m6819a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), (Throwable) null);
        } else if (acVar.mo6139g() == 118 && acVar.mo6139g() == 111 && acVar.mo6139g() == 114 && acVar.mo6139g() == 98 && acVar.mo6139g() == 105 && acVar.mo6139g() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C2599az.m6819a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
