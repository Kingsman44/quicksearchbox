package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2652bn;
import androidx.media3.common.C2668l;
import androidx.media3.common.p136b.C2633u;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58724pq;

/* renamed from: androidx.media3.exoplayer.h.cr */
/* compiled from: PG */
public final class C3107cr implements C2668l {

    /* renamed from: a */
    public static final C3107cr f9108a = new C3107cr(new C2652bn[0]);

    /* renamed from: b */
    public final int f9109b;

    /* renamed from: c */
    private final C58485gu f9110c;

    /* renamed from: d */
    private int f9111d;

    public C3107cr(C2652bn... bnVarArr) {
        this.f9110c = C58485gu.m89844l(bnVarArr);
        this.f9109b = bnVarArr.length;
        int i = 0;
        while (i < ((C58724pq) this.f9110c).f156474d) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                C58485gu guVar = this.f9110c;
                if (i3 >= ((C58724pq) guVar).f156474d) {
                    break;
                }
                if (((C2652bn) guVar.get(i)).equals(this.f9110c.get(i3))) {
                    C2633u.m7048c("TrackGroupArray", C2633u.m7046a(BuildConfig.FLAVOR, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray.")));
                }
                i3++;
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final int mo7096a(C2652bn bnVar) {
        int indexOf = this.f9110c.indexOf(bnVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: b */
    public final C2652bn mo7097b(int i) {
        return (C2652bn) this.f9110c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3107cr crVar = (C3107cr) obj;
            return this.f9109b == crVar.f9109b && C58597ky.m90218i(this.f9110c, crVar.f9110c);
        }
    }

    public final int hashCode() {
        int i = this.f9111d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f9110c.hashCode();
        this.f9111d = hashCode;
        return hashCode;
    }
}
