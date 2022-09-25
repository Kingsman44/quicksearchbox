package androidx.media3.extractor.p163j.p171h;

import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p135a.C2567c;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.p163j.C3470b;
import androidx.media3.extractor.p163j.C3482c;
import androidx.media3.extractor.p163j.C3493e;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: androidx.media3.extractor.j.h.a */
/* compiled from: PG */
public final class C3511a extends C3470b {

    /* renamed from: f */
    private final C2604ac f10967f = new C2604ac();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C3482c mo7433l(byte[] bArr, int i, boolean z) {
        C2567c cVar;
        this.f10967f.mo6157y(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            C2604ac acVar = this.f10967f;
            int i2 = acVar.f7236c - acVar.f7235b;
            if (i2 <= 0) {
                return new C3512b(arrayList);
            }
            if (i2 >= 8) {
                int b = acVar.mo6134b();
                if (this.f10967f.mo6134b() == 1987343459) {
                    C2604ac acVar2 = this.f10967f;
                    int i3 = b - 8;
                    CharSequence charSequence = null;
                    C2566b bVar = null;
                    while (i3 > 0) {
                        if (i3 >= 8) {
                            int b2 = acVar2.mo6134b();
                            int b3 = acVar2.mo6134b();
                            int i4 = b2 - 8;
                            String M = C2612ak.m6930M(acVar2.f7234a, acVar2.f7235b, i4);
                            acVar2.mo6131A(acVar2.f7235b + i4);
                            i3 = (i3 - 8) - i4;
                            if (b3 == 1937011815) {
                                bVar = C3521k.m10165b(M);
                            } else if (b3 == 1885436268) {
                                charSequence = C3521k.m10164a((String) null, M.trim(), Collections.emptyList());
                            }
                        } else {
                            throw new C3493e("Incomplete vtt cue box header found.");
                        }
                    }
                    if (charSequence == null) {
                        charSequence = BuildConfig.FLAVOR;
                    }
                    if (bVar != null) {
                        bVar.f7065a = charSequence;
                        cVar = bVar.mo6076a();
                    } else {
                        cVar = C3521k.m10166c(charSequence);
                    }
                    arrayList.add(cVar);
                } else {
                    C2604ac acVar3 = this.f10967f;
                    acVar3.mo6131A(acVar3.f7235b + (b - 8));
                }
            } else {
                throw new C3493e("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
    }
}
