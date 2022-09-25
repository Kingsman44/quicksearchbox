package com.google.android.libraries.flowlayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0651fm;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0668gc;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p094f.C1901n;
import androidx.core.p098j.p099a.C1998r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class FlowLayoutManager extends C0653fo implements C0668gc {

    /* renamed from: a */
    public static final int f59796a = C21393a.m40477d();

    /* renamed from: b */
    private static final Rect f59797b = new Rect();

    /* renamed from: c */
    private int f59798c;

    /* renamed from: d */
    private int f59799d;

    /* renamed from: e */
    private final List f59800e = new ArrayList();

    /* renamed from: f */
    private boolean f59801f;

    /* renamed from: g */
    private C21396d f59802g;

    /* renamed from: h */
    private C21403k f59803h;

    /* renamed from: i */
    private boolean f59804i;

    /* renamed from: j */
    private int f59805j = -1;

    /* renamed from: k */
    private int f59806k = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: l */
    private int f59807l;

    /* renamed from: m */
    private int f59808m;

    /* renamed from: n */
    private int f59809n;

    /* renamed from: o */
    private SavedState f59810o = null;

    /* compiled from: PG */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C21405m();

        /* renamed from: a */
        int f59811a;

        /* renamed from: b */
        float f59812b;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f59811a = parcel.readInt();
            this.f59812b = parcel.readFloat();
        }

        public SavedState(SavedState savedState) {
            this.f59811a = savedState.f59811a;
            this.f59812b = savedState.f59812b;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f59811a);
            parcel.writeFloat(this.f59812b);
        }
    }

    public FlowLayoutManager() {
        int i = f59796a;
        this.f59798c = i;
        this.f59799d = i;
        setItemPrefetchEnabled(false);
    }

    /* renamed from: a */
    private final int m40454a(C0661fw fwVar, C21404l lVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        int i7;
        int i8;
        int i9;
        C21404l lVar2 = lVar;
        int i10 = i;
        int i11 = i4;
        int i12 = i5;
        int c = lVar.mo26893c();
        if (c < i10) {
            if (!m40472s(fwVar, c, i3, (List) null, i4, 0, i5, lVar2.f59865f == c, z, i6)) {
                return c;
            }
            C21396d dVar = this.f59802g;
            C21399g gVar = dVar.f59821f;
            if (gVar.f59856s == 0) {
                C21398f fVar = dVar.f59818c;
                dVar.f59818c = null;
                C21397e eVar = (C21397e) C21397e.f59822a.mo5126a();
                if (eVar == null) {
                    eVar = new C21397e();
                }
                C21397e eVar2 = eVar;
                eVar2.f59865f = c;
                eVar2.f59864e = i12;
                eVar2.f59823b = i11;
                eVar2.mo26894d(fVar);
                int d = m40457d(fwVar, eVar2, i, i3, z, i6);
                lVar2.mo26915f(eVar2);
                return d;
            }
            C21398f fVar2 = dVar.f59818c;
            dVar.f59818c = null;
            C21402j jVar = (C21402j) C21402j.f59868a.mo5126a();
            if (jVar == null) {
                jVar = new C21402j();
            }
            C21402j jVar2 = jVar;
            jVar2.f59865f = c;
            jVar2.f59864e = i12;
            if (fVar2.f59840o) {
                int i13 = gVar.f59856s;
                boolean z2 = (i13 & 4) != 0;
                boolean z3 = (i13 & 2) != 0;
                int i14 = i13 & 1;
                if (z2 || z3 || i14 != 0) {
                    jVar2.f59869b = fVar2;
                    jVar2.f59870c = gVar.f59843b == -4;
                    if (z2) {
                        i7 = 0;
                    } else {
                        C21398f fVar3 = jVar2.f59869b;
                        i7 = fVar3.f59832g + fVar3.f59837l + fVar3.f59833h;
                    }
                    int h = C21399g.m40490h("layout_flmFlowInsetStart", gVar.f59858u, jVar2.f59869b.f59829d, false);
                    int h2 = C21399g.m40490h("layout_flmFlowInsetEnd", gVar.f59859v, jVar2.f59869b.f59829d, false);
                    if ((z3 || z2) && C21393a.m40475b(gVar.f59858u) && (i8 = jVar2.f59869b.f59827b) != 0 && (i9 = jVar2.f59864e) < i8) {
                        h += i8 - i9;
                    }
                    int h3 = C21399g.m40490h("layout_flmFlowWidth", gVar.f59861x, jVar2.f59869b.f59829d, true);
                    jVar2.f59871d = h3;
                    if (h3 < 0) {
                        h3 = Math.max(0, ((i11 - i7) - h) - h2);
                        jVar2.f59871d = h3;
                    }
                    if (z3) {
                        C21398f fVar4 = jVar2.f59869b;
                        fVar4.f59832g = (i11 - fVar4.f59833h) - fVar4.f59837l;
                        jVar2.f59873j = ((i11 - i7) - h2) - h3;
                    } else {
                        jVar2.f59873j = i7 + h;
                    }
                    jVar2.f59874k = gVar.mo26905e(jVar2.f59869b.f59829d);
                    jVar2.f59875l = gVar.mo26904d(jVar2.f59869b.f59829d);
                    int c2 = gVar.mo26903c(jVar2.f59869b.f59829d);
                    jVar2.f59872i = c2;
                    if (c2 < 0) {
                        jVar2.f59872i = Math.max(0, (jVar2.f59869b.f59838m - jVar2.f59874k) - jVar2.f59875l);
                    }
                    int e = m40458e(fwVar, jVar2, i, i2, i3);
                    lVar2.mo26915f(jVar2);
                    return e;
                }
                throw new IllegalArgumentException("Unknown flow value: 0x".concat(String.valueOf(Integer.toHexString(i13))));
            }
            throw new IllegalArgumentException("creator not measured");
        } else if (c <= i10) {
            return c;
        } else {
            int i15 = lVar2.f59865f;
            throw new IllegalArgumentException("¶@[" + i15 + "," + c + ") should not cover nextSectionStart@" + i10);
        }
    }

    /* renamed from: b */
    private final int m40455b(C0661fw fwVar, int i, int i2, int i3) {
        C21404l lVar;
        int i4;
        C21404l lVar2 = (C21404l) this.f59800e.get(i);
        m40471r();
        try {
            C1901n.m5168a("FLM: fillSection");
            loop0:
            while (true) {
                C21404l lVar3 = lVar2;
                while (i2 > 0) {
                    i++;
                    if (i == this.f59800e.size()) {
                        lVar = null;
                    } else {
                        lVar = (C21404l) this.f59800e.get(i);
                    }
                    C21404l lVar4 = lVar;
                    if (lVar4 == null) {
                        i4 = i3;
                    } else {
                        i4 = lVar4.f59865f;
                    }
                    m40466m(fwVar, lVar3, -1, i2, i4, i3);
                    C21396d dVar = this.f59802g;
                    i2 -= dVar.f59816a;
                    int i5 = dVar.f59817b;
                    if (i5 != -1) {
                        lVar2 = C21404l.m40519e(i5);
                        this.f59800e.add(i, lVar2);
                    } else if (lVar3.mo26893c() == i3) {
                        break loop0;
                    } else {
                        lVar3 = lVar4;
                    }
                }
                break loop0;
            }
            C1901n.m5169b();
            return i2;
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable th) {
            C1901n.m5169b();
            throw th;
        }
    }

    /* renamed from: c */
    private final int m40456c(C0661fw fwVar, C21400h hVar, int i, int i2, int i3, boolean z, int i4) {
        if (hVar instanceof C21397e) {
            return m40457d(fwVar, (C21397e) hVar, i, i3, z, i4);
        }
        return m40458e(fwVar, (C21402j) hVar, i, i2, i3);
    }

    /* renamed from: d */
    private final int m40457d(C0661fw fwVar, C21397e eVar, int i, int i2, boolean z, int i3) {
        C21397e eVar2 = eVar;
        if (!eVar2.f59825d.isEmpty()) {
            int c = eVar.mo26893c();
            int i4 = i;
            while (c < i4) {
                int i5 = eVar2.f59823b;
                int i6 = eVar2.f59824c;
                if (i5 - i6 <= 1) {
                    break;
                }
                if (!m40472s(fwVar, c, i2, eVar2.f59825d, i5, i6, eVar2.f59864e, false, z, i3)) {
                    break;
                }
                C21396d dVar = this.f59802g;
                C21398f fVar = dVar.f59818c;
                dVar.f59818c = null;
                eVar2.mo26894d(fVar);
                c++;
            }
            return c;
        }
        throw new IllegalArgumentException("Line must not be empty");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* renamed from: e */
    private final int m40458e(android.support.p033v7.widget.C0661fw r17, com.google.android.libraries.flowlayoutmanager.C21402j r18, int r19, int r20, int r21) {
        /*
            r16 = this;
            r0 = r18
            r11 = r20
            com.google.android.libraries.flowlayoutmanager.f r1 = r0.f59869b
            if (r1 == 0) goto L_0x009c
            int r12 = r18.mo26893c()
            com.google.android.libraries.flowlayoutmanager.l r9 = r0.f59876m
            r13 = -1
            if (r9 != 0) goto L_0x0045
            int r1 = r0.f59871d
            if (r1 == 0) goto L_0x0044
            int r1 = r0.f59872i
            if (r1 != 0) goto L_0x001a
            goto L_0x0044
        L_0x001a:
            com.google.android.libraries.flowlayoutmanager.l r14 = com.google.android.libraries.flowlayoutmanager.C21404l.m40519e(r12)
            int r7 = r0.f59871d
            int r1 = r0.f59864e
            int r2 = r0.f59873j
            int r8 = r1 + r2
            r9 = 1
            int r10 = r0.f59872i
            r1 = r16
            r2 = r17
            r3 = r14
            r4 = r19
            r5 = r20
            r6 = r21
            int r1 = r1.m40454a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r2 = r14.f59865f
            if (r1 != r2) goto L_0x0040
            r14.mo26917m()
            return r1
        L_0x0040:
            r0.f59876m = r14
            r15 = r14
            goto L_0x0092
        L_0x0044:
            return r12
        L_0x0045:
            int r1 = r9.mo26909i(r11)
            com.google.android.libraries.flowlayoutmanager.h r3 = r9.mo26914d()
            if (r3 == 0) goto L_0x0094
            int r2 = r3.f59867h
            r7 = 1
            int r4 = r0.f59872i
            int r1 = r1 - r2
            int r8 = r4 - r1
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            int r1 = r1.m40456c(r2, r3, r4, r5, r6, r7, r8)
            if (r1 <= r12) goto L_0x0069
            r9.f59867h = r13
        L_0x0069:
            r14 = r1
            r15 = r9
        L_0x006b:
            int r1 = r0.f59872i
            int r2 = r15.mo26909i(r11)
            int r7 = r0.f59871d
            int r3 = r0.f59864e
            int r4 = r0.f59873j
            int r8 = r3 + r4
            r9 = 1
            int r10 = r1 - r2
            r1 = r16
            r2 = r17
            r3 = r15
            r4 = r19
            r5 = r20
            r6 = r21
            int r1 = r1.m40454a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r1 > r14) goto L_0x0092
            if (r1 <= r12) goto L_0x0091
            r0.f59867h = r13
        L_0x0091:
            return r1
        L_0x0092:
            r14 = r1
            goto L_0x006b
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Empty nested paragraph found!"
            r0.<init>(r1)
            throw r0
        L_0x009c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Line must not be empty"
            r0.<init>(r1)
            goto L_0x00a5
        L_0x00a4:
            throw r0
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.m40458e(android.support.v7.widget.fw, com.google.android.libraries.flowlayoutmanager.j, int, int, int):int");
    }

    /* renamed from: g */
    private final int m40460g(int i) {
        int childCount = getChildCount();
        if (childCount != 0) {
            int i2 = 0;
            if (getPosition(getChildAt(0)) <= i) {
                if (getPosition(getChildAt(childCount - 1)) < i) {
                    return childCount ^ -1;
                }
                while (i2 < childCount) {
                    int i3 = (i2 + childCount) / 2;
                    int position = getPosition(getChildAt(i3));
                    if (position == i) {
                        return i3;
                    }
                    if (position < i) {
                        i2 = i3 + 1;
                    } else {
                        childCount = i3;
                    }
                }
                return i2 ^ -1;
            }
        }
        return -1;
    }

    /* renamed from: h */
    private final int m40461h(C0661fw fwVar, int i, int i2, int i3) {
        int i4;
        int i5 = i - i2;
        boolean z = true;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 != 1) {
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3++;
                }
            }
            i4 = i3;
        } else {
            int i6 = i3;
            i3--;
            i4 = i6;
        }
        if (i3 >= 0 && i3 < getChildCount()) {
            int position = getPosition(getChildAt(i3));
            if (position == i) {
                return i3;
            }
            boolean z2 = i3 == i4;
            if (position <= i) {
                z = false;
            }
            if (z2 != z) {
                Log.e("FlowLayoutManager", "Wrong hint precondition, falling back to binary search");
                i4 = -1;
            }
        }
        if (i4 < 0) {
            int g = m40460g(i);
            if (g >= 0) {
                return g;
            }
            i4 = g ^ -1;
        }
        try {
            addView(fwVar.mo3039p(i), i4);
            return i4;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x02c0 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02f2 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0125 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0137 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013e A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0149 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0153 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0159 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0179 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a7 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01aa A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c1 A[Catch:{ all -> 0x030a, RuntimeException -> 0x030f }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m40462i(android.support.p033v7.widget.C0661fw r24, android.support.p033v7.widget.C0670ge r25, int r26, int r27) {
        /*
            r23 = this;
            r7 = r23
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r25.mo3052a()     // Catch:{ RuntimeException -> 0x030f }
            r8 = 0
            if (r3 != 0) goto L_0x0016
            r23.removeAndRecycleAllViews(r24)     // Catch:{ RuntimeException -> 0x030f }
            r23.m40469p()     // Catch:{ RuntimeException -> 0x030f }
            return r8
        L_0x0016:
            if (r2 < 0) goto L_0x001c
            if (r2 >= r3) goto L_0x001c
            r5 = 1
            goto L_0x001d
        L_0x001c:
            r5 = 0
        L_0x001d:
            int r9 = r23.getPaddingTop()     // Catch:{ RuntimeException -> 0x030f }
            int r6 = r23.getHeight()     // Catch:{ RuntimeException -> 0x030f }
            int r10 = r23.getPaddingBottom()     // Catch:{ RuntimeException -> 0x030f }
            int r6 = r6 - r10
            int r10 = java.lang.Math.max(r9, r6)     // Catch:{ RuntimeException -> 0x030f }
            int r6 = r10 - r9
            if (r5 != 0) goto L_0x0034
            r11 = r9
            goto L_0x003c
        L_0x0034:
            int r11 = r7.f59798c     // Catch:{ RuntimeException -> 0x030f }
            int r11 = m40473t(r6, r11)     // Catch:{ RuntimeException -> 0x030f }
            int r11 = r9 - r11
        L_0x003c:
            int r12 = r7.f59799d     // Catch:{ RuntimeException -> 0x030f }
            int r6 = m40473t(r6, r12)     // Catch:{ RuntimeException -> 0x030f }
            int r6 = r6 + r10
            boolean r12 = r1.f2461f     // Catch:{ RuntimeException -> 0x030f }
            if (r12 == 0) goto L_0x004a
            r23.detachAndScrapAttachedViews(r24)     // Catch:{ RuntimeException -> 0x030f }
        L_0x004a:
            int r12 = r23.getChildCount()     // Catch:{ RuntimeException -> 0x030f }
            r13 = -1
            int r12 = r12 + r13
        L_0x0050:
            if (r12 < 0) goto L_0x006a
            android.view.View r14 = r7.getChildAt(r12)     // Catch:{ RuntimeException -> 0x030f }
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()     // Catch:{ RuntimeException -> 0x030f }
            com.google.android.libraries.flowlayoutmanager.g r15 = (com.google.android.libraries.flowlayoutmanager.C21399g) r15     // Catch:{ RuntimeException -> 0x030f }
            android.support.v7.widget.gh r15 = r15.f2420c     // Catch:{ RuntimeException -> 0x030f }
            boolean r15 = r15.needsUpdate()     // Catch:{ RuntimeException -> 0x030f }
            if (r15 == 0) goto L_0x0067
            r7.detachAndScrapView(r14, r0)     // Catch:{ RuntimeException -> 0x030f }
        L_0x0067:
            int r12 = r12 + -1
            goto L_0x0050
        L_0x006a:
            int r12 = r23.getWidth()     // Catch:{ RuntimeException -> 0x030f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ RuntimeException -> 0x030f }
            int r14 = r23.getPaddingStart()     // Catch:{ RuntimeException -> 0x030f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ RuntimeException -> 0x030f }
            int r15 = r23.getPaddingEnd()     // Catch:{ RuntimeException -> 0x030f }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ RuntimeException -> 0x030f }
            r8 = 2131431090(0x7f0b0eb2, float:1.84839E38)
            java.lang.Object r4 = r1.mo3053b(r8)     // Catch:{ RuntimeException -> 0x030f }
            boolean r4 = r12.equals(r4)     // Catch:{ RuntimeException -> 0x030f }
            r13 = 2131431088(0x7f0b0eb0, float:1.8483895E38)
            r8 = 2131431089(0x7f0b0eb1, float:1.8483897E38)
            if (r4 == 0) goto L_0x00a9
            java.lang.Object r4 = r1.mo3053b(r8)     // Catch:{ RuntimeException -> 0x030f }
            boolean r4 = r14.equals(r4)     // Catch:{ RuntimeException -> 0x030f }
            if (r4 == 0) goto L_0x00a9
            java.lang.Object r4 = r1.mo3053b(r13)     // Catch:{ RuntimeException -> 0x030f }
            boolean r4 = r15.equals(r4)     // Catch:{ RuntimeException -> 0x030f }
            if (r4 != 0) goto L_0x00b8
        L_0x00a9:
            r23.m40469p()     // Catch:{ RuntimeException -> 0x030f }
            r4 = 2131431090(0x7f0b0eb2, float:1.84839E38)
            r1.mo3055d(r4, r12)     // Catch:{ RuntimeException -> 0x030f }
            r1.mo3055d(r8, r14)     // Catch:{ RuntimeException -> 0x030f }
            r1.mo3055d(r13, r15)     // Catch:{ RuntimeException -> 0x030f }
        L_0x00b8:
            java.util.List r1 = r7.f59800e     // Catch:{ RuntimeException -> 0x030f }
            int r1 = r1.size()     // Catch:{ RuntimeException -> 0x030f }
            r4 = -1
            int r1 = r1 + r4
        L_0x00c0:
            if (r1 < 0) goto L_0x00d0
            java.util.List r4 = r7.f59800e     // Catch:{ RuntimeException -> 0x030f }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ RuntimeException -> 0x030f }
            com.google.android.libraries.flowlayoutmanager.l r4 = (com.google.android.libraries.flowlayoutmanager.C21404l) r4     // Catch:{ RuntimeException -> 0x030f }
            r4.mo26916l()     // Catch:{ RuntimeException -> 0x030f }
            int r1 = r1 + -1
            goto L_0x00c0
        L_0x00d0:
            r1 = 1
            if (r1 == r5) goto L_0x00d4
            r2 = 0
        L_0x00d4:
            java.util.List r1 = r7.f59800e     // Catch:{ RuntimeException -> 0x030f }
            int r1 = r1.size()     // Catch:{ RuntimeException -> 0x030f }
            if (r1 == 0) goto L_0x0122
            java.util.List r4 = r7.f59800e     // Catch:{ RuntimeException -> 0x030f }
            r8 = 0
            java.lang.Object r4 = r4.get(r8)     // Catch:{ RuntimeException -> 0x030f }
            com.google.android.libraries.flowlayoutmanager.l r4 = (com.google.android.libraries.flowlayoutmanager.C21404l) r4     // Catch:{ RuntimeException -> 0x030f }
            int r4 = r4.f59865f     // Catch:{ RuntimeException -> 0x030f }
            if (r4 <= r2) goto L_0x00ea
            goto L_0x0122
        L_0x00ea:
            java.util.List r4 = r7.f59800e     // Catch:{ RuntimeException -> 0x030f }
            int r8 = r1 + -1
            java.lang.Object r4 = r4.get(r8)     // Catch:{ RuntimeException -> 0x030f }
            com.google.android.libraries.flowlayoutmanager.l r4 = (com.google.android.libraries.flowlayoutmanager.C21404l) r4     // Catch:{ RuntimeException -> 0x030f }
            int r4 = r4.mo26893c()     // Catch:{ RuntimeException -> 0x030f }
            if (r4 > r2) goto L_0x00fd
            r4 = -1
            r1 = r1 ^ r4
            goto L_0x0123
        L_0x00fd:
            r4 = 0
        L_0x00fe:
            if (r4 >= r1) goto L_0x011e
            int r8 = r4 + r1
            int r8 = r8 / 2
            java.util.List r12 = r7.f59800e     // Catch:{ RuntimeException -> 0x030f }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ RuntimeException -> 0x030f }
            com.google.android.libraries.flowlayoutmanager.l r12 = (com.google.android.libraries.flowlayoutmanager.C21404l) r12     // Catch:{ RuntimeException -> 0x030f }
            int r13 = r12.f59865f     // Catch:{ RuntimeException -> 0x030f }
            if (r2 >= r13) goto L_0x0112
            r1 = r8
            goto L_0x00fe
        L_0x0112:
            int r4 = r12.mo26893c()     // Catch:{ RuntimeException -> 0x030f }
            if (r2 < r4) goto L_0x011c
            int r8 = r8 + 1
            r4 = r8
            goto L_0x00fe
        L_0x011c:
            r1 = r8
            goto L_0x0123
        L_0x011e:
            r1 = -1
            r4 = r4 ^ r1
            r1 = r4
            goto L_0x0123
        L_0x0122:
            r1 = -1
        L_0x0123:
            if (r1 >= 0) goto L_0x0129
            r1 = r1 ^ -1
            r4 = -1
            int r1 = r1 + r4
        L_0x0129:
            int r1 = r7.m40459f(r0, r1, r2, r3)     // Catch:{ RuntimeException -> 0x030f }
            java.util.List r4 = r7.f59800e     // Catch:{ RuntimeException -> 0x030f }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ RuntimeException -> 0x030f }
            com.google.android.libraries.flowlayoutmanager.l r4 = (com.google.android.libraries.flowlayoutmanager.C21404l) r4     // Catch:{ RuntimeException -> 0x030f }
            if (r5 == 0) goto L_0x013e
            int r2 = r4.mo26913a(r2)     // Catch:{ RuntimeException -> 0x030f }
            int r2 = r27 - r2
            goto L_0x013f
        L_0x013e:
            r2 = r9
        L_0x013f:
            int r8 = r6 - r2
            int r8 = r7.m40455b(r0, r1, r8, r3)     // Catch:{ RuntimeException -> 0x030f }
            int r8 = r6 - r8
            if (r5 == 0) goto L_0x0153
            int r12 = r10 - r8
            r13 = 0
            int r12 = java.lang.Math.max(r13, r12)     // Catch:{ RuntimeException -> 0x030f }
            int r2 = r2 + r12
            int r8 = r8 + r12
            goto L_0x0154
        L_0x0153:
            r12 = 0
        L_0x0154:
            r13 = r1
            r14 = r4
            r4 = r2
        L_0x0157:
            if (r4 <= r11) goto L_0x0177
            int r15 = r14.f59865f     // Catch:{ RuntimeException -> 0x030f }
            if (r15 <= 0) goto L_0x0177
            int r14 = r13 + -1
            int r15 = r15 + -1
            int r14 = r7.m40459f(r0, r14, r15, r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r14 != r13) goto L_0x016a
            int r1 = r1 + 1
            goto L_0x016b
        L_0x016a:
            r13 = r14
        L_0x016b:
            java.util.List r14 = r7.f59800e     // Catch:{ RuntimeException -> 0x030f }
            java.lang.Object r14 = r14.get(r13)     // Catch:{ RuntimeException -> 0x030f }
            com.google.android.libraries.flowlayoutmanager.l r14 = (com.google.android.libraries.flowlayoutmanager.C21404l) r14     // Catch:{ RuntimeException -> 0x030f }
            int r15 = r14.f59867h     // Catch:{ RuntimeException -> 0x030f }
            int r4 = r4 - r15
            goto L_0x0157
        L_0x0177:
            if (r5 == 0) goto L_0x0196
            int r5 = r4 - r9
            r15 = 0
            int r5 = java.lang.Math.max(r15, r5)     // Catch:{ RuntimeException -> 0x030f }
            int r4 = r4 - r5
            int r2 = r2 - r5
            int r8 = r8 - r5
            if (r5 <= 0) goto L_0x0194
            if (r12 != 0) goto L_0x0194
            if (r8 >= r6) goto L_0x0191
            int r2 = r6 - r2
            int r1 = r7.m40455b(r0, r1, r2, r3)     // Catch:{ RuntimeException -> 0x030f }
            int r8 = r6 - r1
        L_0x0191:
            r15 = r5
            r12 = 0
            goto L_0x0197
        L_0x0194:
            r15 = r5
            goto L_0x0197
        L_0x0196:
            r15 = 0
        L_0x0197:
            java.lang.String r1 = "FLM: renderAndRecycleViews"
            androidx.core.p094f.C1901n.m5168a(r1)     // Catch:{ all -> 0x030a }
            int r8 = java.lang.Math.min(r8, r6)     // Catch:{ all -> 0x030a }
            int r1 = r23.getLayoutDirection()     // Catch:{ all -> 0x030a }
            r2 = 1
            if (r1 != r2) goto L_0x01aa
            r17 = 1
            goto L_0x01ac
        L_0x01aa:
            r17 = 0
        L_0x01ac:
            int r1 = r3 << 8
            r7.f59807l = r1     // Catch:{ all -> 0x030a }
            r6 = 0
            r7.f59808m = r6     // Catch:{ all -> 0x030a }
            r7.f59809n = r6     // Catch:{ all -> 0x030a }
            r5 = r13
            r1 = -1
        L_0x01b7:
            if (r4 >= r8) goto L_0x02a3
            java.util.List r2 = r7.f59800e     // Catch:{ all -> 0x030a }
            int r2 = r2.size()     // Catch:{ all -> 0x030a }
            if (r5 >= r2) goto L_0x02a3
            java.util.List r2 = r7.f59800e     // Catch:{ all -> 0x030a }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x030a }
            r3 = r2
            com.google.android.libraries.flowlayoutmanager.l r3 = (com.google.android.libraries.flowlayoutmanager.C21404l) r3     // Catch:{ all -> 0x030a }
            java.util.List r2 = r3.f59879a     // Catch:{ all -> 0x030a }
            int r2 = r2.size()     // Catch:{ all -> 0x030a }
            r25 = r12
            r12 = 0
        L_0x01d3:
            if (r4 >= r8) goto L_0x028b
            if (r12 >= r2) goto L_0x028b
            java.util.List r6 = r3.f59879a     // Catch:{ all -> 0x030a }
            java.lang.Object r6 = r6.get(r12)     // Catch:{ all -> 0x030a }
            com.google.android.libraries.flowlayoutmanager.h r6 = (com.google.android.libraries.flowlayoutmanager.C21400h) r6     // Catch:{ all -> 0x030a }
            r26 = r2
            int r2 = r6.f59867h     // Catch:{ all -> 0x030a }
            int r2 = r2 + r4
            r27 = r3
            r3 = -1
            if (r1 != r3) goto L_0x0205
            if (r2 <= r11) goto L_0x0202
            int r1 = r6.f59865f     // Catch:{ all -> 0x030a }
            int r1 = r7.m40460g(r1)     // Catch:{ all -> 0x030a }
            if (r1 >= 0) goto L_0x01f5
            r1 = r1 ^ -1
        L_0x01f5:
            r3 = -1
            int r1 = r1 + r3
        L_0x01f7:
            if (r1 < 0) goto L_0x01ff
            r7.removeAndRecycleViewAt(r1, r0)     // Catch:{ all -> 0x030a }
            int r1 = r1 + -1
            goto L_0x01f7
        L_0x01ff:
            r1 = -1
            r3 = 0
            goto L_0x0207
        L_0x0202:
            r1 = -1
            r3 = -1
            goto L_0x0207
        L_0x0205:
            r3 = r1
            r1 = -1
        L_0x0207:
            if (r3 == r1) goto L_0x0266
            r1 = r23
            r18 = r26
            r19 = r2
            r2 = r4
            r20 = r27
            r21 = r3
            r3 = r6
            r26 = r8
            r8 = r4
            r4 = r21
            r22 = r11
            r11 = r5
            r5 = r24
            r27 = r15
            r16 = 0
            r15 = r6
            r6 = r17
            int r1 = r1.m40464k(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x030a }
            int r2 = r15.f59867h     // Catch:{ all -> 0x030a }
            int r4 = r8 + r2
            if (r4 <= r9) goto L_0x0279
            if (r8 < r10) goto L_0x0233
            goto L_0x0279
        L_0x0233:
            int r2 = r15.mo26893c()     // Catch:{ all -> 0x030a }
            int r3 = r15.f59865f     // Catch:{ all -> 0x030a }
            int r2 = r2 - r3
            int r2 = r2 << 8
            if (r8 > r9) goto L_0x024a
            int r3 = r3 << 8
            int r5 = r9 - r8
            int r5 = r5 * r2
            int r6 = r15.f59867h     // Catch:{ all -> 0x030a }
            int r5 = r5 / r6
            int r3 = r3 + r5
            r7.f59808m = r3     // Catch:{ all -> 0x030a }
        L_0x024a:
            int r3 = java.lang.Math.min(r4, r10)     // Catch:{ all -> 0x030a }
            int r4 = java.lang.Math.max(r8, r9)     // Catch:{ all -> 0x030a }
            int r3 = r3 - r4
            int r4 = r15.f59867h     // Catch:{ all -> 0x030a }
            if (r4 != 0) goto L_0x025d
            int r3 = r7.f59809n     // Catch:{ all -> 0x030a }
            int r3 = r3 + r2
            r7.f59809n = r3     // Catch:{ all -> 0x030a }
            goto L_0x0279
        L_0x025d:
            int r5 = r7.f59809n     // Catch:{ all -> 0x030a }
            int r2 = r2 * r3
            int r2 = r2 / r4
            int r5 = r5 + r2
            r7.f59809n = r5     // Catch:{ all -> 0x030a }
            goto L_0x0279
        L_0x0266:
            r18 = r26
            r20 = r27
            r19 = r2
            r21 = r3
            r26 = r8
            r22 = r11
            r27 = r15
            r16 = 0
            r11 = r5
            r1 = r21
        L_0x0279:
            int r12 = r12 + 1
            r8 = r26
            r15 = r27
            r5 = r11
            r2 = r18
            r4 = r19
            r3 = r20
            r11 = r22
            r6 = 0
            goto L_0x01d3
        L_0x028b:
            r26 = r8
            r22 = r11
            r27 = r15
            r16 = 0
            r8 = r4
            r11 = r5
            int r5 = r11 + 1
            r12 = r25
            r15 = r27
            r4 = r8
            r11 = r22
            r6 = 0
            r8 = r26
            goto L_0x01b7
        L_0x02a3:
            r11 = r5
            r25 = r12
            r27 = r15
            int r2 = r23.getChildCount()     // Catch:{ all -> 0x030a }
            r3 = -1
            int r2 = r2 + r3
        L_0x02ae:
            if (r2 < 0) goto L_0x02b8
            if (r2 < r1) goto L_0x02b8
            r7.removeAndRecycleViewAt(r2, r0)     // Catch:{ all -> 0x030a }
            int r2 = r2 + -1
            goto L_0x02ae
        L_0x02b8:
            java.util.List r0 = r7.f59800e     // Catch:{ all -> 0x030a }
            int r0 = r0.size()     // Catch:{ all -> 0x030a }
            if (r11 >= r0) goto L_0x02ea
            java.util.List r0 = r7.f59800e     // Catch:{ all -> 0x030a }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x030a }
            com.google.android.libraries.flowlayoutmanager.l r0 = (com.google.android.libraries.flowlayoutmanager.C21404l) r0     // Catch:{ all -> 0x030a }
            int r0 = r0.f59865f     // Catch:{ all -> 0x030a }
            int r0 = r0 + 5
            java.util.List r1 = r7.f59800e     // Catch:{ all -> 0x030a }
            int r1 = r1.size()     // Catch:{ all -> 0x030a }
            r2 = -1
            int r1 = r1 + r2
        L_0x02d4:
            int r5 = r11 + 2
            if (r1 < r5) goto L_0x02ea
            java.util.List r2 = r7.f59800e     // Catch:{ all -> 0x030a }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x030a }
            com.google.android.libraries.flowlayoutmanager.l r2 = (com.google.android.libraries.flowlayoutmanager.C21404l) r2     // Catch:{ all -> 0x030a }
            int r2 = r2.f59865f     // Catch:{ all -> 0x030a }
            if (r2 < r0) goto L_0x02ea
            r7.m40470q(r1)     // Catch:{ all -> 0x030a }
            int r1 = r1 + -1
            goto L_0x02d4
        L_0x02ea:
            int r0 = r14.f59865f     // Catch:{ all -> 0x030a }
            int r0 = r0 + -5
            int r13 = r13 + -3
        L_0x02f0:
            if (r13 < 0) goto L_0x0304
            java.util.List r1 = r7.f59800e     // Catch:{ all -> 0x030a }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x030a }
            com.google.android.libraries.flowlayoutmanager.l r1 = (com.google.android.libraries.flowlayoutmanager.C21404l) r1     // Catch:{ all -> 0x030a }
            int r1 = r1.f59865f     // Catch:{ all -> 0x030a }
            if (r1 >= r0) goto L_0x0301
            r7.m40470q(r13)     // Catch:{ all -> 0x030a }
        L_0x0301:
            int r13 = r13 + -1
            goto L_0x02f0
        L_0x0304:
            androidx.core.p094f.C1901n.m5169b()     // Catch:{ RuntimeException -> 0x030f }
            int r12 = r25 - r27
            return r12
        L_0x030a:
            r0 = move-exception
            androidx.core.p094f.C1901n.m5169b()     // Catch:{ RuntimeException -> 0x030f }
            throw r0     // Catch:{ RuntimeException -> 0x030f }
        L_0x030f:
            r0 = move-exception
            goto L_0x0312
        L_0x0311:
            throw r0
        L_0x0312:
            goto L_0x0311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.m40462i(android.support.v7.widget.fw, android.support.v7.widget.ge, int, int):int");
    }

    /* renamed from: j */
    private final int m40463j(int i, int i2, C21398f fVar, int i3, int i4, C0661fw fwVar, boolean z, C21402j jVar) {
        int i5;
        int h = m40461h(fwVar, i3, i3, i4);
        View childAt = getChildAt(h);
        int i6 = fVar.f59838m;
        if (jVar != null && jVar.f59870c && (i5 = jVar.f59877n) > 0) {
            m40468o(childAt, fVar.f59837l, i6 + i5);
            i6 = getDecoratedMeasuredHeight(childAt);
        } else if (!fVar.f59840o) {
            m40468o(childAt, fVar.f59837l, i6);
            fVar.mo26899a(this, childAt, true);
            i6 = fVar.f59838m;
        }
        int i7 = i + fVar.f59841p;
        int i8 = i7 + i6;
        int i9 = i2 + fVar.f59832g;
        int i10 = fVar.f59837l + i9;
        int width = z ? getWidth() - i10 : i9;
        if (z) {
            i10 = getWidth() - i9;
        }
        layoutDecorated(childAt, width, i7, i10, i8);
        if (this.f59803h != null) {
            ((RecyclerView) childAt.getParent()).getChildViewHolder(childAt);
            this.f59803h.mo26912a();
        }
        return h;
    }

    /* renamed from: k */
    private final int m40464k(int i, C21400h hVar, int i2, C0661fw fwVar, boolean z) {
        C21400h hVar2 = hVar;
        int i3 = 0;
        if (hVar2 instanceof C21397e) {
            C21397e eVar = (C21397e) hVar2;
            int paddingStart = getPaddingStart() + eVar.f59864e;
            int size = eVar.f59825d.size();
            int i4 = i2;
            while (i3 < size) {
                C21398f fVar = (C21398f) eVar.f59825d.get(i3);
                i4 = m40463j(i, paddingStart, fVar, eVar.f59865f + i3, i4, fwVar, z, (C21402j) null) + 1;
                paddingStart += fVar.f59832g + fVar.f59837l + fVar.f59833h;
                i3++;
            }
            return i4;
        }
        C21402j jVar = (C21402j) hVar2;
        int j = m40463j(i, getPaddingStart() + jVar.f59864e, jVar.f59869b, jVar.f59865f, i2, fwVar, z, jVar) + 1;
        C21404l lVar = jVar.f59876m;
        int size2 = lVar == null ? 0 : lVar.f59879a.size();
        int i5 = i + jVar.f59869b.f59841p + jVar.f59874k;
        int i6 = j;
        while (i3 < size2) {
            C21400h hVar3 = (C21400h) jVar.f59876m.f59879a.get(i3);
            i6 = m40464k(i5, hVar3, i6, fwVar, z);
            i5 += hVar3.f59867h;
            i3++;
        }
        return i6;
    }

    /* renamed from: l */
    private final View m40465l() {
        int height = getHeight();
        int childCount = getChildCount();
        View view = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!((C21399g) childAt.getLayoutParams()).f2420c.isRemoved()) {
                int decoratedTop = (getDecoratedTop(childAt) + getDecoratedBottom(childAt)) / 2;
                if (decoratedTop >= 0 && decoratedTop <= height) {
                    return childAt;
                }
                int i3 = decoratedTop < 0 ? -decoratedTop : decoratedTop - height;
                if (i3 < i) {
                    view = childAt;
                    i = i3;
                }
            }
        }
        return view;
    }

    /* renamed from: n */
    private final void m40467n(int i, int i2, int i3) {
        int i4;
        if (!this.f59800e.isEmpty()) {
            int size = this.f59800e.size();
            while (true) {
                size--;
                if (size < 0) {
                    i4 = 0;
                    break;
                }
                C21404l lVar = (C21404l) this.f59800e.get(size);
                int i5 = lVar.f59865f;
                if (i5 < i2 || (i5 <= 0 && !this.f59801f)) {
                    i4 = size + 1;
                } else {
                    lVar.mo26911k(i3);
                }
            }
            i4 = size + 1;
            while (true) {
                i4--;
                if (i4 >= 0 && ((C21404l) this.f59800e.get(i4)).mo26910j(i) == 2) {
                    m40470q(i4);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    private final void m40468o(View view, int i, int i2) {
        Rect rect = f59797b;
        calculateItemDecorationsForChild(view, rect);
        view.measure(View.MeasureSpec.makeMeasureSpec((i - rect.left) - rect.right, 1073741824), View.MeasureSpec.makeMeasureSpec((i2 - rect.top) - rect.bottom, 1073741824));
    }

    /* renamed from: p */
    private final void m40469p() {
        int size = this.f59800e.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C21404l) this.f59800e.get(size)).mo26917m();
            } else {
                this.f59800e.clear();
                return;
            }
        }
    }

    /* renamed from: q */
    private final void m40470q(int i) {
        ((C21404l) this.f59800e.remove(i)).mo26917m();
        if (i == 0) {
            this.f59801f = true;
        }
    }

    /* renamed from: r */
    private final void m40471r() {
        if (this.f59802g == null) {
            this.f59802g = new C21396d();
        }
        C21396d dVar = this.f59802g;
        dVar.f59816a = 0;
        dVar.f59817b = -1;
        dVar.f59819d = -1;
        dVar.f59820e = -1;
        dVar.f59821f = null;
        C21398f fVar = dVar.f59818c;
        if (fVar != null) {
            fVar.mo26900b();
            dVar.f59818c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02fb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x031d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x031e  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m40472s(android.support.p033v7.widget.C0661fw r18, int r19, int r20, java.util.List r21, int r22, int r23, int r24, boolean r25, boolean r26, int r27) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            com.google.android.libraries.flowlayoutmanager.d r5 = r0.f59802g
            int r6 = r5.f59819d
            int r5 = r5.f59820e
            r7 = r18
            int r5 = r0.m40461h(r7, r1, r6, r5)
            android.view.View r6 = r0.getChildAt(r5)
            com.google.android.libraries.flowlayoutmanager.d r7 = r0.f59802g
            int r8 = r7.f59819d
            r9 = 1
            if (r8 != r1) goto L_0x003b
            int r8 = r7.f59820e
            if (r8 != r5) goto L_0x0033
            com.google.android.libraries.flowlayoutmanager.f r5 = r7.f59818c
            if (r5 == 0) goto L_0x002b
            goto L_0x0118
        L_0x002b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cached next child missing ItemInfo"
            r1.<init>(r2)
            throw r1
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cached next child index incorrect"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            r7.f59819d = r1
            r7.f59820e = r5
            com.google.android.libraries.flowlayoutmanager.f r5 = r7.f59818c
            if (r5 == 0) goto L_0x0046
            r5.mo26900b()
        L_0x0046:
            com.google.android.libraries.flowlayoutmanager.d r5 = r0.f59802g
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.google.android.libraries.flowlayoutmanager.g r7 = (com.google.android.libraries.flowlayoutmanager.C21399g) r7
            r5.f59821f = r7
            com.google.android.libraries.flowlayoutmanager.d r5 = r0.f59802g
            androidx.core.i.f r7 = com.google.android.libraries.flowlayoutmanager.C21398f.f59826a
            java.lang.Object r7 = r7.mo5126a()
            com.google.android.libraries.flowlayoutmanager.f r7 = (com.google.android.libraries.flowlayoutmanager.C21398f) r7
            if (r7 != 0) goto L_0x0061
            com.google.android.libraries.flowlayoutmanager.f r7 = new com.google.android.libraries.flowlayoutmanager.f
            r7.<init>()
        L_0x0061:
            r5.f59818c = r7
            com.google.android.libraries.flowlayoutmanager.d r5 = r0.f59802g
            com.google.android.libraries.flowlayoutmanager.f r7 = r5.f59818c
            com.google.android.libraries.flowlayoutmanager.g r5 = r5.f59821f
            int r8 = r5.f59844g
            int r11 = r5.f59845h
            int r12 = r2 - r8
            int r12 = r12 - r11
            int r13 = r5.f59846i
            if (r13 <= 0) goto L_0x007e
            if (r12 <= r13) goto L_0x007e
            int r12 = r12 - r13
            int r14 = r12 >> 1
            int r8 = r8 + r14
            r12 = r12 & r9
            int r14 = r14 + r12
            int r11 = r11 + r14
            r12 = r13
        L_0x007e:
            int r13 = r5.f59848k
            r14 = 0
            if (r13 > 0) goto L_0x008d
            float r13 = r5.f59847j
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x008b
            r13 = 2143289344(0x7fc00000, float:NaN)
        L_0x008b:
            r9 = 0
            goto L_0x00a8
        L_0x008d:
            float r15 = (float) r12
            float r13 = (float) r13
            float r15 = r15 / r13
            float r13 = r5.f59847j
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x009b
            int r14 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r14 > 0) goto L_0x009b
            goto L_0x008b
        L_0x009b:
            double r13 = (double) r15
            double r13 = java.lang.Math.floor(r13)
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = java.lang.Math.max(r9, r13)
            float r13 = (float) r9
            goto L_0x008b
        L_0x00a8:
            int r10 = java.lang.Math.max(r9, r12)
            float r9 = (float) r10
            float r9 = r9 / r13
            r7.f59829d = r9
            r7.f59827b = r8
            r7.f59828c = r11
            int r8 = r5.mo26906f(r9)
            r7.f59830e = r8
            float r8 = r7.f59829d
            int r9 = r5.f59853p
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != r10) goto L_0x00c9
            int r8 = r5.mo26906f(r8)
            r12 = 0
            goto L_0x00d0
        L_0x00c9:
            java.lang.String r11 = "layout_flmMarginTopForFirstLine"
            r12 = 0
            int r8 = com.google.android.libraries.flowlayoutmanager.C21399g.m40490h(r11, r9, r8, r12)
        L_0x00d0:
            r7.f59831f = r8
            float r8 = r7.f59829d
            int r9 = r5.f59850m
            if (r9 != r10) goto L_0x00dd
            int r8 = androidx.core.p098j.C2104s.m5790c(r5)
            goto L_0x00e3
        L_0x00dd:
            java.lang.String r11 = "layout_flmMarginStart"
            int r8 = com.google.android.libraries.flowlayoutmanager.C21399g.m40490h(r11, r9, r8, r12)
        L_0x00e3:
            r7.f59832g = r8
            float r8 = r7.f59829d
            int r9 = r5.f59851n
            if (r9 != r10) goto L_0x00f0
            int r8 = androidx.core.p098j.C2104s.m5789b(r5)
            goto L_0x00f6
        L_0x00f0:
            java.lang.String r11 = "layout_flmMarginEnd"
            int r8 = com.google.android.libraries.flowlayoutmanager.C21399g.m40490h(r11, r9, r8, r12)
        L_0x00f6:
            r7.f59833h = r8
            float r8 = r7.f59829d
            int r8 = r5.mo26901a(r8)
            r7.f59834i = r8
            float r8 = r7.f59829d
            int r9 = r5.f59854q
            if (r9 != r10) goto L_0x010b
            int r8 = r5.mo26901a(r8)
            goto L_0x0112
        L_0x010b:
            java.lang.String r10 = "layout_flmMarginBottomForLastLine"
            r11 = 0
            int r8 = com.google.android.libraries.flowlayoutmanager.C21399g.m40490h(r10, r9, r8, r11)
        L_0x0112:
            r7.f59835j = r8
            int r5 = r5.f59855r
            r7.f59836k = r5
        L_0x0118:
            com.google.android.libraries.flowlayoutmanager.d r5 = r0.f59802g
            com.google.android.libraries.flowlayoutmanager.g r5 = r5.f59821f
            if (r3 == 0) goto L_0x0127
            boolean r7 = r21.isEmpty()
            if (r7 == 0) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r7 = 0
            goto L_0x0128
        L_0x0127:
            r7 = 1
        L_0x0128:
            boolean r8 = r5.mo26907g()
            if (r8 == 0) goto L_0x013b
            if (r26 != 0) goto L_0x0135
            if (r25 == 0) goto L_0x0135
            r1 = 0
            r8 = 0
            goto L_0x013e
        L_0x0135:
            com.google.android.libraries.flowlayoutmanager.d r2 = r0.f59802g
            r2.f59817b = r1
            r1 = 0
            return r1
        L_0x013b:
            r8 = r26
            r1 = 1
        L_0x013e:
            int r9 = r5.f59863z
            r9 = r9 & 12
            if (r8 == 0) goto L_0x015a
            r8 = 4
            if (r9 == r8) goto L_0x0157
            r8 = 8
            if (r9 == r8) goto L_0x0155
            if (r7 == 0) goto L_0x015a
            r8 = r27
            r9 = 1
            if (r8 <= r9) goto L_0x0153
            goto L_0x015a
        L_0x0153:
            r8 = 0
            return r8
        L_0x0155:
            r8 = 0
            return r8
        L_0x0157:
            if (r7 == 0) goto L_0x015a
            r1 = 0
        L_0x015a:
            com.google.android.libraries.flowlayoutmanager.d r8 = r0.f59802g
            com.google.android.libraries.flowlayoutmanager.f r8 = r8.f59818c
            int r9 = r5.mo26902b()
            r10 = 2
            r11 = -1
            if (r7 != 0) goto L_0x0197
            r12 = 1
            if (r9 == r12) goto L_0x0197
            if (r9 == r10) goto L_0x0195
            r12 = 3
            if (r9 == r12) goto L_0x0192
            int r9 = r21.size()
            int r9 = r9 + r11
            java.lang.Object r3 = r3.get(r9)
            com.google.android.libraries.flowlayoutmanager.f r3 = (com.google.android.libraries.flowlayoutmanager.C21398f) r3
            float r9 = r8.f59829d
            float r12 = r3.f59829d
            int r9 = java.lang.Float.compare(r9, r12)
            if (r9 != 0) goto L_0x0190
            int r9 = r8.f59827b
            int r12 = r3.f59827b
            if (r9 != r12) goto L_0x0190
            int r9 = r8.f59828c
            int r3 = r3.f59828c
            if (r9 != r3) goto L_0x0190
            goto L_0x0197
        L_0x0190:
            r15 = 0
            return r15
        L_0x0192:
            r15 = 0
            r1 = 0
            goto L_0x0198
        L_0x0195:
            r15 = 0
            return r15
        L_0x0197:
            r15 = 0
        L_0x0198:
            int r3 = r5.f59842a
            if (r3 != r11) goto L_0x01a0
            if (r4 < r2) goto L_0x019f
            goto L_0x01a0
        L_0x019f:
            return r15
        L_0x01a0:
            if (r1 == 0) goto L_0x01a8
            if (r7 == 0) goto L_0x01a8
            if (r4 < r2) goto L_0x01a8
            r9 = 0
            goto L_0x01a9
        L_0x01a8:
            r9 = r1
        L_0x01a9:
            int r1 = r4 - r23
            int r3 = r8.f59832g
            int r1 = r1 - r3
            int r3 = r8.f59833h
            int r1 = r1 - r3
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
            int r3 = r5.f59842a
            boolean r3 = com.google.android.libraries.flowlayoutmanager.C21393a.m40475b(r3)
            if (r3 == 0) goto L_0x020a
            int r3 = r8.f59827b
            if (r3 != 0) goto L_0x01c7
            int r3 = r8.f59828c
            if (r3 == 0) goto L_0x020a
            r3 = 0
        L_0x01c7:
            if (r3 <= 0) goto L_0x01d9
            int r3 = r3 - r24
            int r3 = r3 - r23
            int r7 = r8.f59832g
            int r3 = r3 - r7
            r7 = 0
            int r3 = java.lang.Math.max(r7, r3)
            r7 = r3
            r3 = r24
            goto L_0x01e9
        L_0x01d9:
            if (r7 == 0) goto L_0x01e6
            if (r24 != 0) goto L_0x01e6
            int r7 = r8.f59832g
            if (r7 != 0) goto L_0x01e4
            r7 = r3
            r3 = 0
            goto L_0x01e9
        L_0x01e4:
            r3 = 0
            goto L_0x01e8
        L_0x01e6:
            r3 = r24
        L_0x01e8:
            r7 = 0
        L_0x01e9:
            int r2 = r2 - r3
            int r2 = r2 - r4
            int r3 = r8.f59828c
            if (r3 <= 0) goto L_0x01f9
            int r3 = r3 - r2
            int r2 = r8.f59833h
            int r3 = r3 - r2
            r15 = 0
            int r2 = java.lang.Math.max(r15, r3)
            goto L_0x0203
        L_0x01f9:
            r15 = 0
            if (r2 != 0) goto L_0x0202
            int r2 = r8.f59833h
            if (r2 != 0) goto L_0x0202
            r2 = r3
            goto L_0x0203
        L_0x0202:
            r2 = 0
        L_0x0203:
            int r1 = r1 - r7
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r15, r1)
            goto L_0x020c
        L_0x020a:
            r2 = 0
            r7 = 0
        L_0x020c:
            android.graphics.Rect r3 = f59797b
            r0.calculateItemDecorationsForChild(r6, r3)
            int r4 = r3.left
            int r12 = r3.right
            int r4 = r4 + r12
            int r12 = r3.top
            int r3 = r3.bottom
            int r12 = r12 + r3
            int r1 = r1 - r4
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)
            float r3 = r8.f59829d
            java.lang.String r13 = "layout_flmWidth"
            int r14 = r5.f59842a
            r15 = 1
            int r3 = com.google.android.libraries.flowlayoutmanager.C21399g.m40490h(r13, r14, r3, r15)
            r13 = -3
            r14 = -2
            r16 = 1073741824(0x40000000, float:2.0)
            if (r3 == r13) goto L_0x0269
            if (r3 == r14) goto L_0x0261
            if (r3 == r11) goto L_0x025e
            int r13 = r5.f59842a
            boolean r13 = com.google.android.libraries.flowlayoutmanager.C21393a.m40475b(r13)
            if (r13 == 0) goto L_0x0245
            int r3 = r3 - r4
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            goto L_0x0247
        L_0x0245:
            if (r3 < 0) goto L_0x024a
        L_0x0247:
            r5.width = r3
            goto L_0x026c
        L_0x024a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown enum value for layout_flmWidth: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x025e:
            r5.width = r11
            goto L_0x026b
        L_0x0261:
            r5.width = r14
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x026e
        L_0x0269:
            r5.width = r1
        L_0x026b:
            r3 = r1
        L_0x026c:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x026e:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            float r4 = r8.f59829d
            java.lang.String r13 = "layout_flmHeight"
            int r15 = r5.f59843b
            r10 = 1
            int r13 = com.google.android.libraries.flowlayoutmanager.C21399g.m40490h(r13, r15, r4, r10)
            r10 = -4
            if (r13 == r10) goto L_0x02d2
            if (r13 == r14) goto L_0x02cd
            if (r13 == r11) goto L_0x02ad
            int r4 = r5.f59843b
            boolean r4 = com.google.android.libraries.flowlayoutmanager.C21393a.m40475b(r4)
            if (r4 == 0) goto L_0x0293
            int r13 = r13 - r12
            r4 = 0
            int r10 = java.lang.Math.max(r4, r13)
            goto L_0x0296
        L_0x0293:
            if (r13 < 0) goto L_0x0299
            r10 = r13
        L_0x0296:
            r5.height = r10
            goto L_0x02ca
        L_0x0299:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown value for layout_flmHeight: "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02ad:
            int r10 = r17.getHeight()
            int r13 = r17.getPaddingTop()
            int r10 = r10 - r13
            int r13 = r17.getPaddingBottom()
            int r10 = r10 - r13
            int r10 = r10 - r12
            int r12 = r5.mo26906f(r4)
            int r10 = r10 - r12
            int r4 = r5.mo26901a(r4)
            int r4 = r10 - r4
            r5.height = r11
            r10 = r4
        L_0x02ca:
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x02f5
        L_0x02cd:
            r5.height = r14
            r4 = 0
            r10 = 0
            goto L_0x02f5
        L_0x02d2:
            int r10 = r5.f59856s
            if (r10 == 0) goto L_0x02ee
            int r10 = r5.f59862y
            if (r10 < 0) goto L_0x02ee
            int r10 = r5.mo26903c(r4)
            int r12 = r5.mo26905e(r4)
            int r10 = r10 + r12
            int r4 = r5.mo26904d(r4)
            int r10 = r10 + r4
            r4 = 0
            int r10 = java.lang.Math.max(r4, r10)
            goto L_0x02f1
        L_0x02ee:
            r10 = 0
            r16 = 0
        L_0x02f1:
            r5.height = r11
            r4 = r16
        L_0x02f5:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r4)
            if (r9 == 0) goto L_0x0306
            if (r1 == 0) goto L_0x0304
            int r10 = android.view.View.MeasureSpec.getSize(r3)
            if (r10 > r1) goto L_0x0304
            goto L_0x0306
        L_0x0304:
            r10 = 0
            return r10
        L_0x0306:
            r10 = 0
            r6.measure(r3, r4)
            if (r9 == 0) goto L_0x031e
            int r3 = r6.getMeasuredWidth()
            if (r3 <= r1) goto L_0x0313
            return r10
        L_0x0313:
            int r1 = androidx.core.p098j.C2043bi.m5578g(r6)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r3
            if (r1 != 0) goto L_0x031d
            goto L_0x031e
        L_0x031d:
            return r10
        L_0x031e:
            r8.mo26899a(r0, r6, r10)
            int r1 = r5.f59856s
            r3 = 2
            r1 = r1 & r3
            if (r1 != r3) goto L_0x032d
            int r1 = r8.f59833h
            int r1 = r1 + r2
            r8.f59833h = r1
            goto L_0x0332
        L_0x032d:
            int r1 = r8.f59832g
            int r1 = r1 + r7
            r8.f59832g = r1
        L_0x0332:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.m40472s(android.support.v7.widget.fw, int, int, java.util.List, int, int, int, boolean, boolean, int):boolean");
    }

    /* renamed from: t */
    private static final int m40473t(int i, int i2) {
        if (C21393a.m40476c(i2)) {
            return i2;
        }
        return (int) ((((float) i) * Float.intBitsToFloat(i2)) + 0.5f);
    }

    public final boolean canScrollVertically() {
        return true;
    }

    public final boolean checkLayoutParams(C0654fp fpVar) {
        return fpVar instanceof C21399g;
    }

    public final void collectAdjacentPrefetchPositions(int i, int i2, C0670ge geVar, C0651fm fmVar) {
        if (i2 != 0 && !this.f59800e.isEmpty()) {
            if (i2 > 0) {
                View childAt = getChildAt(getChildCount() - 1);
                int position = getPosition(childAt) + 1;
                if (position < geVar.mo3052a()) {
                    fmVar.mo2729a(position, Math.max(0, getDecoratedBottom(childAt) - ((getHeight() - getPaddingBottom()) - getPaddingTop())));
                    return;
                }
                return;
            }
            View childAt2 = getChildAt(0);
            int position2 = getPosition(childAt2) - 1;
            if (position2 >= 0) {
                fmVar.mo2729a(position2, Math.max(0, -getDecoratedTop(childAt2)));
            }
        }
    }

    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        return new PointF(0.0f, (float) (i < getPosition(childAt) ? -1 : 1));
    }

    public final int computeVerticalScrollExtent(C0670ge geVar) {
        return this.f59809n;
    }

    public final int computeVerticalScrollOffset(C0670ge geVar) {
        return this.f59808m;
    }

    public final int computeVerticalScrollRange(C0670ge geVar) {
        return this.f59807l;
    }

    public final View findViewByPosition(int i) {
        int g = m40460g(i);
        if (g < 0) {
            return null;
        }
        return getChildAt(g);
    }

    public final /* bridge */ /* synthetic */ C0654fp generateDefaultLayoutParams() {
        return new C21399g();
    }

    public final /* synthetic */ C0654fp generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C21399g(context, attributeSet);
    }

    public final void measureChild(View view, int i, int i2) {
        if (!(view.getLayoutParams() instanceof C21399g)) {
            super.measureChild(view, i, i2);
            return;
        }
        throw new UnsupportedOperationException("Views using FlowLayoutManager.LayoutParams should not be measured with measureChild()");
    }

    public final void measureChildWithMargins(View view, int i, int i2) {
        if (!(view.getLayoutParams() instanceof C21399g)) {
            super.measureChildWithMargins(view, i, i2);
            return;
        }
        throw new UnsupportedOperationException("Views using FlowLayoutManager.LayoutParams should not be measured with measureChildWithMargins()");
    }

    public final void onAdapterChanged(C0640fb fbVar, C0640fb fbVar2) {
        if (this.f59804i) {
            this.f59803h = null;
            this.f59804i = false;
        }
        if (fbVar2 instanceof C21395c) {
            this.f59803h = (C21395c) fbVar2;
            this.f59804i = true;
        }
        m40469p();
    }

    public final void onDetachedFromWindow(RecyclerView recyclerView, C0661fw fwVar) {
        m40469p();
        super.onDetachedFromWindow(recyclerView, fwVar);
    }

    public final void onInitializeAccessibilityEvent(C0661fw fwVar, C0670ge geVar, AccessibilityEvent accessibilityEvent) {
        int i;
        int i2;
        super.onInitializeAccessibilityEvent(fwVar, geVar, accessibilityEvent);
        C1998r rVar = new C1998r(accessibilityEvent);
        if (rVar.f5926a.getItemCount() != 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    i = -1;
                    break;
                }
                View childAt = getChildAt(i3);
                if (childAt.getBottom() > 0) {
                    i = ((C21399g) childAt.getLayoutParams()).f2420c.getBindingAdapterPosition();
                    break;
                }
                i3++;
            }
            int height = getHeight();
            int childCount = getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    i2 = -1;
                    break;
                }
                View childAt2 = getChildAt(childCount);
                if (childAt2.getTop() < height) {
                    i2 = ((C21399g) childAt2.getLayoutParams()).f2420c.getBindingAdapterPosition();
                    break;
                }
                childCount--;
            }
            if (i != -1 && i2 != -1) {
                rVar.f5926a.setFromIndex(i);
                rVar.f5926a.setToIndex(i2);
            }
        }
    }

    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m40467n(i, i, i2);
    }

    public final void onItemsChanged(RecyclerView recyclerView) {
        m40469p();
    }

    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m40467n(Math.min(i, i2), Math.max(i + i3, i2 + i3), 0);
    }

    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m40467n(i, i + i2, -i2);
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }

    public final void onLayoutChildren(C0661fw fwVar, C0670ge geVar) {
        int i;
        SavedState savedState = this.f59810o;
        if (savedState != null) {
            this.f59805j = savedState.f59811a;
            this.f59806k = (int) (((float) getHeight()) * this.f59810o.f59812b);
            this.f59810o = null;
        }
        int i2 = this.f59805j;
        int i3 = -1;
        if (i2 != -1) {
            if (i2 < 0 || i2 >= geVar.mo3052a()) {
                this.f59805j = -1;
                this.f59806k = LinearLayoutManager.INVALID_OFFSET;
            } else if (this.f59806k == Integer.MIN_VALUE) {
                this.f59806k = getPaddingTop();
            }
        }
        int i4 = this.f59805j;
        if (i4 != -1) {
            i = this.f59806k;
            this.f59805j = -1;
            this.f59806k = LinearLayoutManager.INVALID_OFFSET;
            i3 = i4;
        } else {
            View l = m40465l();
            if (l != null) {
                i3 = getPosition(l);
                i = getDecoratedTop(l);
            } else {
                i = 0;
            }
        }
        try {
            C1901n.m5168a("FLM: layoutViewport");
            m40462i(fwVar, geVar, i3, i);
        } finally {
            C1901n.m5169b();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f59810o = (SavedState) parcelable;
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.f59810o;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        View l = m40465l();
        if (l == null) {
            savedState2.f59811a = -1;
            savedState2.f59812b = 0.0f;
        } else {
            savedState2.f59811a = getPosition(l);
            savedState2.f59812b = ((float) getDecoratedTop(l)) / ((float) getHeight());
        }
        return savedState2;
    }

    public final void scrollToPosition(int i) {
        this.f59805j = i;
        this.f59806k = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        this.f59800e.isEmpty();
        View l = m40465l();
        if (l == null) {
            return 0;
        }
        return i - m40462i(fwVar, geVar, getPosition(l), getDecoratedTop(l) - i);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        C21394b bVar = new C21394b(this, recyclerView.getContext());
        bVar.f2449g = i;
        startSmoothScroll(bVar);
    }

    public final /* bridge */ /* synthetic */ C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C21399g) {
            return new C21399g((C21399g) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C21399g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21399g(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        r1 = com.google.android.libraries.flowlayoutmanager.C21404l.m40519e(r0);
        r8.f59800e.add(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if (r0 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r8.f59801f = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        r2 = r1;
        r10 = r4;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m40459f(android.support.p033v7.widget.C0661fw r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = -1
            if (r10 != r0) goto L_0x0005
            r1 = 0
            goto L_0x000d
        L_0x0005:
            java.util.List r1 = r8.f59800e
            java.lang.Object r1 = r1.get(r10)
            com.google.android.libraries.flowlayoutmanager.l r1 = (com.google.android.libraries.flowlayoutmanager.C21404l) r1
        L_0x000d:
            java.lang.String r2 = " impossible to cover position "
            java.lang.String r3 = "Section at "
            if (r1 == 0) goto L_0x0030
            int r4 = r1.f59865f
            if (r4 > r11) goto L_0x0018
            goto L_0x0030
        L_0x0018:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r3)
            r12.append(r10)
            r12.append(r2)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            r9.<init>(r10)
            throw r9
        L_0x0030:
            int r4 = r10 + 1
            java.util.List r5 = r8.f59800e
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x005f
            java.util.List r5 = r8.f59800e
            java.lang.Object r5 = r5.get(r4)
            com.google.android.libraries.flowlayoutmanager.l r5 = (com.google.android.libraries.flowlayoutmanager.C21404l) r5
            int r5 = r5.f59865f
            if (r11 >= r5) goto L_0x0047
            goto L_0x005f
        L_0x0047:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r3)
            r12.append(r10)
            r12.append(r2)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            r9.<init>(r10)
            throw r9
        L_0x005f:
            if (r1 != 0) goto L_0x0063
            r2 = 0
            goto L_0x0067
        L_0x0063:
            int r2 = r1.mo26893c()
        L_0x0067:
            if (r2 > r11) goto L_0x00d1
            r0 = r11
            r3 = -1
            r5 = -1
        L_0x006c:
            if (r0 < r2) goto L_0x009d
            int r5 = r8.m40461h(r9, r0, r3, r5)     // Catch:{ RuntimeException -> 0x009b }
            android.view.View r3 = r8.getChildAt(r5)     // Catch:{ RuntimeException -> 0x009b }
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ RuntimeException -> 0x009b }
            com.google.android.libraries.flowlayoutmanager.g r3 = (com.google.android.libraries.flowlayoutmanager.C21399g) r3     // Catch:{ RuntimeException -> 0x009b }
            boolean r3 = r3.mo26907g()     // Catch:{ RuntimeException -> 0x009b }
            if (r3 != 0) goto L_0x008b
            if (r0 != 0) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            int r3 = r0 + -1
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x006c
        L_0x008b:
            com.google.android.libraries.flowlayoutmanager.l r1 = com.google.android.libraries.flowlayoutmanager.C21404l.m40519e(r0)     // Catch:{ RuntimeException -> 0x009b }
            java.util.List r10 = r8.f59800e     // Catch:{ RuntimeException -> 0x009b }
            r10.add(r4, r1)     // Catch:{ RuntimeException -> 0x009b }
            if (r0 != 0) goto L_0x0098
            r8.f59801f = r3     // Catch:{ RuntimeException -> 0x009b }
        L_0x0098:
            r2 = r1
            r10 = r4
            goto L_0x009e
        L_0x009b:
            r9 = move-exception
            throw r9
        L_0x009d:
            r2 = r1
        L_0x009e:
            java.lang.String r0 = "FLM: fillSection"
            androidx.core.p094f.C1901n.m5168a(r0)     // Catch:{ RuntimeException -> 0x00cb }
            r8.m40471r()     // Catch:{ RuntimeException -> 0x00cb }
            int r0 = r10 + 1
            java.util.List r1 = r8.f59800e     // Catch:{ RuntimeException -> 0x00cb }
            int r1 = r1.size()     // Catch:{ RuntimeException -> 0x00cb }
            if (r0 != r1) goto L_0x00b2
            r5 = r12
            goto L_0x00bd
        L_0x00b2:
            java.util.List r1 = r8.f59800e     // Catch:{ RuntimeException -> 0x00cb }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ RuntimeException -> 0x00cb }
            com.google.android.libraries.flowlayoutmanager.l r0 = (com.google.android.libraries.flowlayoutmanager.C21404l) r0     // Catch:{ RuntimeException -> 0x00cb }
            int r0 = r0.f59865f     // Catch:{ RuntimeException -> 0x00cb }
            r5 = r0
        L_0x00bd:
            r4 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r6 = r12
            r0.m40466m(r1, r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x00cb }
            androidx.core.p094f.C1901n.m5169b()
            return r10
        L_0x00c9:
            r9 = move-exception
            goto L_0x00cd
        L_0x00cb:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00c9 }
        L_0x00cd:
            androidx.core.p094f.C1901n.m5169b()
            throw r9
        L_0x00d1:
            r1.mo26909i(r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.m40459f(android.support.v7.widget.fw, int, int, int):int");
    }

    /* renamed from: m */
    private final void m40466m(C0661fw fwVar, C21404l lVar, int i, int i2, int i3, int i4) {
        int i5;
        C21404l lVar2 = lVar;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i;
        if (i9 != -1) {
            i5 = i9;
        } else if (i6 > 0) {
            i5 = -1;
        } else {
            throw new IllegalArgumentException("Both criteria met before any processing");
        }
        if (lVar2.f59865f >= i7) {
            throw new IllegalArgumentException("Section started after limit");
        } else if (i5 >= i7 || i7 > i8) {
            throw new IllegalArgumentException("positionToCover < nextSectionStart <= totalItemCount does not hold");
        } else {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            C21396d dVar = this.f59802g;
            dVar.f59817b = -1;
            dVar.f59816a = lVar2.mo26909i(i8);
            int i10 = lVar2.f59865f;
            C21400h d = lVar.mo26914d();
            if (d != null) {
                C21396d dVar2 = this.f59802g;
                int i11 = dVar2.f59816a - d.f59867h;
                dVar2.f59816a = i11;
                if (d.f59865f <= i5 || i11 < i6) {
                    int c = d.mo26893c();
                    i10 = m40456c(fwVar, d, i3, i4, width, false, -1);
                    if (i10 != c) {
                        lVar2.f59867h = -1;
                    }
                    this.f59802g.f59816a = lVar2.mo26909i(i8);
                } else {
                    return;
                }
            }
            while (true) {
                if ((i10 <= i5 || this.f59802g.f59816a < i6) && this.f59802g.f59817b == -1 && i10 < i7) {
                    i10 = m40454a(fwVar, lVar, i3, i4, width, width, 0, false, -1);
                    this.f59802g.f59816a = lVar2.mo26909i(i8);
                    i5 = i5;
                }
            }
            int i12 = i5;
            C21396d dVar3 = this.f59802g;
            if (dVar3.f59817b != -1 && i10 > i12 && dVar3.f59816a >= i6) {
                dVar3.f59817b = -1;
            }
        }
    }
}
