package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C1761t;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.e */
/* compiled from: PG */
public final class C1720e extends C1718c {

    /* renamed from: f */
    public int f5019f = -1;

    /* renamed from: g */
    public float f5020g = Float.NaN;

    /* renamed from: h */
    public float f5021h = Float.NaN;

    /* renamed from: i */
    public float f5022i = Float.NaN;

    /* renamed from: j */
    public float f5023j = Float.NaN;

    /* renamed from: k */
    public float f5024k = Float.NaN;

    /* renamed from: l */
    public float f5025l = Float.NaN;

    /* renamed from: m */
    public float f5026m = Float.NaN;

    /* renamed from: n */
    public float f5027n = Float.NaN;

    /* renamed from: o */
    public float f5028o = Float.NaN;

    /* renamed from: p */
    public float f5029p = Float.NaN;

    /* renamed from: q */
    public float f5030q = Float.NaN;

    /* renamed from: r */
    public float f5031r = Float.NaN;

    /* renamed from: s */
    public float f5032s = Float.NaN;

    /* renamed from: t */
    public float f5033t = Float.NaN;

    public C1720e() {
        this.f5016d = 1;
        this.f5017e = new HashMap();
    }

    /* renamed from: a */
    public final C1718c clone() {
        C1720e eVar = new C1720e();
        super.mo4797f(this);
        eVar.f5019f = this.f5019f;
        eVar.f5020g = this.f5020g;
        eVar.f5021h = this.f5021h;
        eVar.f5022i = this.f5022i;
        eVar.f5023j = this.f5023j;
        eVar.f5024k = this.f5024k;
        eVar.f5025l = this.f5025l;
        eVar.f5026m = this.f5026m;
        eVar.f5027n = this.f5027n;
        eVar.f5028o = this.f5028o;
        eVar.f5029p = this.f5029p;
        eVar.f5030q = this.f5030q;
        eVar.f5031r = this.f5031r;
        eVar.f5032s = this.f5032s;
        eVar.f5033t = this.f5033t;
        return eVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r1.equals("transitionPathRotate") != false) goto L_0x00dc;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4792b(java.util.HashMap r6) {
        /*
            r5 = this;
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01cf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            androidx.constraintlayout.a.a.a.q r2 = (androidx.constraintlayout.p079a.p080a.p081a.C1607q) r2
            if (r2 == 0) goto L_0x0008
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003d
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap r3 = r5.f5017e
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.C1742a) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.motion.a.r r2 = (androidx.constraintlayout.motion.p084a.C1692r) r2
            int r3 = r5.f5013a
            android.util.SparseArray r2 = r2.f4814e
            r2.append(r3, r1)
            goto L_0x0008
        L_0x003d:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1249320806: goto L_0x00d1;
                case -1249320805: goto L_0x00c7;
                case -1225497657: goto L_0x00bc;
                case -1225497656: goto L_0x00b1;
                case -1225497655: goto L_0x00a6;
                case -1001078227: goto L_0x009b;
                case -908189618: goto L_0x0090;
                case -908189617: goto L_0x0085;
                case -760884510: goto L_0x007b;
                case -760884509: goto L_0x0071;
                case -40300674: goto L_0x0066;
                case -4379043: goto L_0x005b;
                case 37232917: goto L_0x0051;
                case 92909918: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x00db
        L_0x0046:
            java.lang.String r3 = "alpha"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 0
            goto L_0x00dc
        L_0x0051:
            java.lang.String r3 = "transitionPathRotate"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x005b:
            java.lang.String r3 = "elevation"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 1
            goto L_0x00dc
        L_0x0066:
            java.lang.String r3 = "rotation"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 2
            goto L_0x00dc
        L_0x0071:
            java.lang.String r3 = "transformPivotY"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 6
            goto L_0x00dc
        L_0x007b:
            java.lang.String r3 = "transformPivotX"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 5
            goto L_0x00dc
        L_0x0085:
            java.lang.String r3 = "scaleY"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 9
            goto L_0x00dc
        L_0x0090:
            java.lang.String r3 = "scaleX"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 8
            goto L_0x00dc
        L_0x009b:
            java.lang.String r3 = "progress"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 13
            goto L_0x00dc
        L_0x00a6:
            java.lang.String r3 = "translationZ"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 12
            goto L_0x00dc
        L_0x00b1:
            java.lang.String r3 = "translationY"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 11
            goto L_0x00dc
        L_0x00bc:
            java.lang.String r3 = "translationX"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 10
            goto L_0x00dc
        L_0x00c7:
            java.lang.String r3 = "rotationY"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 4
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r3 = "rotationX"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00db
            r4 = 3
            goto L_0x00dc
        L_0x00db:
            r4 = -1
        L_0x00dc:
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01ad;
                case 2: goto L_0x019c;
                case 3: goto L_0x018b;
                case 4: goto L_0x017a;
                case 5: goto L_0x0169;
                case 6: goto L_0x0158;
                case 7: goto L_0x0147;
                case 8: goto L_0x0136;
                case 9: goto L_0x0125;
                case 10: goto L_0x0114;
                case 11: goto L_0x0103;
                case 12: goto L_0x00f2;
                case 13: goto L_0x00e1;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x0008
        L_0x00e1:
            float r1 = r5.f5033t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5033t
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x00f2:
            float r1 = r5.f5032s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5032s
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x0103:
            float r1 = r5.f5031r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5031r
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x0114:
            float r1 = r5.f5030q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5030q
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x0125:
            float r1 = r5.f5029p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5029p
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x0136:
            float r1 = r5.f5028o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5028o
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x0147:
            float r1 = r5.f5027n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5027n
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x0158:
            float r1 = r5.f5024k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5026m
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x0169:
            float r1 = r5.f5023j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5025l
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x017a:
            float r1 = r5.f5024k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5024k
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x018b:
            float r1 = r5.f5023j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5023j
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x019c:
            float r1 = r5.f5022i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5022i
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x01ad:
            float r1 = r5.f5021h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5021h
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x01be:
            float r1 = r5.f5020g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r5.f5013a
            float r3 = r5.f5020g
            r2.mo4535b(r1, r3)
            goto L_0x0008
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1720e.mo4792b(java.util.HashMap):void");
    }

    /* renamed from: c */
    public final void mo4793c(HashSet hashSet) {
        if (!Float.isNaN(this.f5020g)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f5021h)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f5022i)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f5023j)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f5024k)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f5025l)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f5026m)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f5030q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f5031r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f5032s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f5027n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f5028o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f5029p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f5033t)) {
            hashSet.add("progress");
        }
        if (this.f5017e.size() > 0) {
            for (String valueOf : this.f5017e.keySet()) {
                String valueOf2 = String.valueOf(valueOf);
                hashSet.add(valueOf2.length() != 0 ? "CUSTOM,".concat(valueOf2) : new String("CUSTOM,"));
            }
        }
    }

    /* renamed from: d */
    public final void mo4795d(Context context, AttributeSet attributeSet) {
        C1719d.m4670a(this, context.obtainStyledAttributes(attributeSet, C1761t.f5463e));
    }

    /* renamed from: e */
    public final void mo4796e(HashMap hashMap) {
        if (this.f5019f != -1) {
            if (!Float.isNaN(this.f5020g)) {
                hashMap.put("alpha", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5021h)) {
                hashMap.put("elevation", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5022i)) {
                hashMap.put("rotation", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5023j)) {
                hashMap.put("rotationX", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5024k)) {
                hashMap.put("rotationY", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5025l)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5026m)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5030q)) {
                hashMap.put("translationX", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5031r)) {
                hashMap.put("translationY", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5032s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5027n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5028o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5029p)) {
                hashMap.put("scaleY", Integer.valueOf(this.f5019f));
            }
            if (!Float.isNaN(this.f5033t)) {
                hashMap.put("progress", Integer.valueOf(this.f5019f));
            }
            if (this.f5017e.size() > 0) {
                for (String valueOf : this.f5017e.keySet()) {
                    String valueOf2 = String.valueOf(valueOf);
                    hashMap.put(valueOf2.length() != 0 ? "CUSTOM,".concat(valueOf2) : new String("CUSTOM,"), Integer.valueOf(this.f5019f));
                }
            }
        }
    }
}
