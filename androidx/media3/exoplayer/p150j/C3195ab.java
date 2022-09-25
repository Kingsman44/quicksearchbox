package androidx.media3.exoplayer.p150j;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2653bo;
import androidx.media3.common.C2655bq;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.C2872ca;
import androidx.media3.exoplayer.p145h.C3107cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58710pc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.j.ab */
/* compiled from: PG */
public final class C3195ab extends C3200ag {

    /* renamed from: a */
    public static final C58710pc f9596a = C58710pc.m90487d(C3216l.f9643a);

    /* renamed from: b */
    public static final C58710pc f9597b = C58710pc.m90487d(C3217m.f9644a);

    /* renamed from: c */
    public final Object f9598c;

    /* renamed from: d */
    public final boolean f9599d;

    /* renamed from: e */
    public C3221q f9600e;

    /* renamed from: f */
    public C3225u f9601f;

    /* renamed from: g */
    public C2664h f9602g;

    @Deprecated
    public C3195ab() {
        C3221q qVar = C3221q.f9673A;
        throw null;
    }

    /* renamed from: a */
    protected static int m9356a(C2680x xVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(xVar.f7487e)) {
            return 4;
        }
        String c = m9358c(str);
        String c2 = m9358c(xVar.f7487e);
        if (c2 == null || c == null) {
            if (!z || c2 != null) {
                return 0;
            }
            return 1;
        } else if (c2.startsWith(c) || c.startsWith(c2)) {
            return 3;
        } else {
            if (C2612ak.m6968ar(c2, "-")[0].equals(C2612ak.m6968ar(c, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: b */
    public static int m9357b(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    protected static String m9358c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    public static boolean m9359f(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* renamed from: g */
    public static final Pair m9360g(int i, C3199af afVar, int[][][] iArr, C3227w wVar, Comparator comparator) {
        int i2;
        Object obj;
        C3199af afVar2 = afVar;
        ArrayList arrayList = new ArrayList();
        int i3 = afVar2.f9605a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == afVar2.f9606b[i4]) {
                C3107cr crVar = afVar2.f9607c[i4];
                int i5 = 0;
                while (i5 < crVar.f9109b) {
                    C2652bn b = crVar.mo7097b(i5);
                    List a = wVar.mo7211a(i4, b, iArr[i4][i5]);
                    boolean[] zArr = new boolean[b.f7354a];
                    int i6 = 0;
                    while (i6 < b.f7354a) {
                        C3228x xVar = (C3228x) a.get(i6);
                        int b2 = xVar.mo7202b();
                        if (zArr[i6] || b2 == 0) {
                            i2 = i3;
                        } else {
                            if (b2 == 1) {
                                obj = C58485gu.m89846n(xVar);
                                i2 = i3;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(xVar);
                                int i7 = i6 + 1;
                                while (i7 < b.f7354a) {
                                    C3228x xVar2 = (C3228x) a.get(i7);
                                    int i8 = i3;
                                    if (xVar2.mo7202b() == 2 && xVar.mo7203c(xVar2)) {
                                        arrayList2.add(xVar2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    C3199af afVar3 = afVar;
                                    i3 = i8;
                                }
                                i2 = i3;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        C3199af afVar4 = afVar;
                        i3 = i2;
                    }
                    int i9 = i3;
                    i5++;
                    C3199af afVar5 = afVar;
                }
            }
            C3227w wVar2 = wVar;
            i4++;
            afVar2 = afVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((C3228x) list.get(i10)).f9706c;
        }
        C3228x xVar3 = (C3228x) list.get(0);
        return Pair.create(new C3196ac(xVar3.f9705b, iArr2), Integer.valueOf(xVar3.f9704a));
    }

    /* renamed from: h */
    public static void m9361h(C3107cr crVar, C2655bq bqVar) {
        int i = 0;
        while (i < crVar.f9109b) {
            if (((C2653bo) bqVar.f7399y.get(crVar.mo7097b(i))) == null) {
                i++;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: d */
    public final void mo7204d() {
        boolean z;
        C3203aj ajVar;
        C3225u uVar;
        synchronized (this.f9598c) {
            z = false;
            if (this.f9600e.f9683K && !this.f9599d && C2612ak.f7249a >= 32 && (uVar = this.f9601f) != null && uVar.f9692b) {
                z = true;
            }
        }
        if (z && (ajVar = this.f9611h) != null) {
            ((C2872ca) ajVar).f8070a.mo6170i(10);
        }
    }

    /* renamed from: e */
    public final void mo7205e(C2664h hVar) {
        boolean z;
        synchronized (this.f9598c) {
            z = !this.f9602g.equals(hVar);
            this.f9602g = hVar;
        }
        if (z) {
            mo7204d();
        }
    }

    public C3195ab(Context context) {
        C3225u uVar;
        C3221q a = C3221q.m9426a(context);
        this.f9598c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f9600e = a;
        this.f9602g = C2664h.f7421a;
        boolean z = false;
        if (context != null && C2612ak.m6959ai(context)) {
            z = true;
        }
        this.f9599d = z;
        if (!z && context != null && C2612ak.f7249a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                uVar = null;
            } else {
                uVar = new C3225u(audioManager.getSpatializer());
            }
            this.f9601f = uVar;
        }
        if (this.f9600e.f9683K && context == null) {
            C2633u.m7050e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
