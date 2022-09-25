package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C1761t;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.g */
/* compiled from: PG */
public final class C1722g extends C1718c {

    /* renamed from: f */
    public String f5035f = null;

    /* renamed from: g */
    public int f5036g = 0;

    /* renamed from: h */
    public int f5037h = -1;

    /* renamed from: i */
    public String f5038i = null;

    /* renamed from: j */
    public float f5039j = Float.NaN;

    /* renamed from: k */
    public float f5040k = 0.0f;

    /* renamed from: l */
    public float f5041l = 0.0f;

    /* renamed from: m */
    public float f5042m = Float.NaN;

    /* renamed from: n */
    public int f5043n = -1;

    /* renamed from: o */
    public float f5044o = Float.NaN;

    /* renamed from: p */
    public float f5045p = Float.NaN;

    /* renamed from: q */
    public float f5046q = Float.NaN;

    /* renamed from: r */
    public float f5047r = Float.NaN;

    /* renamed from: s */
    public float f5048s = Float.NaN;

    /* renamed from: t */
    public float f5049t = Float.NaN;

    /* renamed from: u */
    public float f5050u = Float.NaN;

    /* renamed from: v */
    public float f5051v = Float.NaN;

    /* renamed from: w */
    public float f5052w = Float.NaN;

    /* renamed from: x */
    public float f5053x = Float.NaN;

    /* renamed from: y */
    public float f5054y = Float.NaN;

    public C1722g() {
        this.f5016d = 4;
        this.f5017e = new HashMap();
    }

    /* renamed from: a */
    public final C1718c clone() {
        C1722g gVar = new C1722g();
        super.mo4797f(this);
        gVar.f5035f = this.f5035f;
        gVar.f5036g = this.f5036g;
        gVar.f5037h = this.f5037h;
        gVar.f5038i = this.f5038i;
        gVar.f5039j = this.f5039j;
        gVar.f5040k = this.f5040k;
        gVar.f5041l = this.f5041l;
        gVar.f5042m = this.f5042m;
        gVar.f5043n = this.f5043n;
        gVar.f5044o = this.f5044o;
        gVar.f5045p = this.f5045p;
        gVar.f5046q = this.f5046q;
        gVar.f5047r = this.f5047r;
        gVar.f5048s = this.f5048s;
        gVar.f5049t = this.f5049t;
        gVar.f5050u = this.f5050u;
        gVar.f5051v = this.f5051v;
        gVar.f5052w = this.f5052w;
        gVar.f5053x = this.f5053x;
        gVar.f5054y = this.f5054y;
        return gVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4792b(java.util.HashMap r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r17.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 22
            r2.<init>(r3)
            java.lang.String r3 = "add "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " values"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            int r3 = r2.length
            r4 = -1
            int r3 = r3 + r4
            r5 = 2
            int r3 = java.lang.Math.min(r5, r3)
            java.lang.String r6 = " "
            r7 = 1
            r9 = r6
            r8 = 1
        L_0x0034:
            if (r8 > r3) goto L_0x00bd
            r10 = r2[r8]
            java.lang.String r10 = r10.getFileName()
            r11 = r2[r8]
            int r11 = r11.getLineNumber()
            r12 = r2[r8]
            java.lang.String r12 = r12.getMethodName()
            java.lang.String r13 = java.lang.String.valueOf(r10)
            int r13 = r13.length()
            java.lang.String r14 = java.lang.String.valueOf(r12)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r13 = r13 + 16
            int r13 = r13 + r14
            r15.<init>(r13)
            java.lang.String r13 = ".("
            r15.append(r13)
            r15.append(r10)
            java.lang.String r10 = ":"
            r15.append(r10)
            r15.append(r11)
            java.lang.String r10 = ") "
            r15.append(r10)
            r15.append(r12)
            java.lang.String r10 = r15.toString()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r9.concat(r6)
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            java.lang.String r12 = java.lang.String.valueOf(r9)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r14 = r1.length()
            int r14 = r14 + r11
            int r11 = r10.length()
            int r14 = r14 + r11
            int r14 = r14 + r12
            r13.<init>(r14)
            r13.append(r1)
            r13.append(r9)
            r13.append(r10)
            r13.append(r9)
            java.lang.String r10 = "KeyCycle"
            java.lang.String r11 = r13.toString()
            android.util.Log.v(r10, r11)
            int r8 = r8 + 1
            goto L_0x0034
        L_0x00bd:
            java.util.Set r1 = r17.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00c5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0222
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = r17
            java.lang.Object r6 = r3.get(r2)
            androidx.constraintlayout.a.a.a.q r6 = (androidx.constraintlayout.p079a.p080a.p081a.C1607q) r6
            if (r6 == 0) goto L_0x00c5
            int r8 = r2.hashCode()
            switch(r8) {
                case -1249320806: goto L_0x0170;
                case -1249320805: goto L_0x0166;
                case -1225497657: goto L_0x015b;
                case -1225497656: goto L_0x0150;
                case -1225497655: goto L_0x0145;
                case -1001078227: goto L_0x013a;
                case -908189618: goto L_0x0130;
                case -908189617: goto L_0x0126;
                case -40300674: goto L_0x011c;
                case -4379043: goto L_0x0112;
                case 37232917: goto L_0x0107;
                case 92909918: goto L_0x00fc;
                case 156108012: goto L_0x00f0;
                case 1530034690: goto L_0x00e4;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            goto L_0x017a
        L_0x00e4:
            java.lang.String r8 = "wavePhase"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 12
            goto L_0x017b
        L_0x00f0:
            java.lang.String r8 = "waveOffset"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 11
            goto L_0x017b
        L_0x00fc:
            java.lang.String r8 = "alpha"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 0
            goto L_0x017b
        L_0x0107:
            java.lang.String r8 = "transitionPathRotate"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 5
            goto L_0x017b
        L_0x0112:
            java.lang.String r8 = "elevation"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 1
            goto L_0x017b
        L_0x011c:
            java.lang.String r8 = "rotation"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 2
            goto L_0x017b
        L_0x0126:
            java.lang.String r8 = "scaleY"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 7
            goto L_0x017b
        L_0x0130:
            java.lang.String r8 = "scaleX"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 6
            goto L_0x017b
        L_0x013a:
            java.lang.String r8 = "progress"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 13
            goto L_0x017b
        L_0x0145:
            java.lang.String r8 = "translationZ"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 10
            goto L_0x017b
        L_0x0150:
            java.lang.String r8 = "translationY"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 9
            goto L_0x017b
        L_0x015b:
            java.lang.String r8 = "translationX"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 8
            goto L_0x017b
        L_0x0166:
            java.lang.String r8 = "rotationY"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 4
            goto L_0x017b
        L_0x0170:
            java.lang.String r8 = "rotationX"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x017a
            r8 = 3
            goto L_0x017b
        L_0x017a:
            r8 = -1
        L_0x017b:
            switch(r8) {
                case 0: goto L_0x020d;
                case 1: goto L_0x0204;
                case 2: goto L_0x01fb;
                case 3: goto L_0x01f2;
                case 4: goto L_0x01e9;
                case 5: goto L_0x01e0;
                case 6: goto L_0x01d7;
                case 7: goto L_0x01ce;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01bc;
                case 10: goto L_0x01b3;
                case 11: goto L_0x01aa;
                case 12: goto L_0x01a1;
                case 13: goto L_0x0198;
                default: goto L_0x017e;
            }
        L_0x017e:
            java.lang.String r6 = "CUSTOM"
            boolean r6 = r2.startsWith(r6)
            if (r6 != 0) goto L_0x00c5
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r6 = r2.length()
            java.lang.String r8 = "  UNKNOWN  "
            if (r6 == 0) goto L_0x0216
            java.lang.String r2 = r8.concat(r2)
            goto L_0x021b
        L_0x0198:
            int r2 = r0.f5013a
            float r8 = r0.f5042m
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01a1:
            int r2 = r0.f5013a
            float r8 = r0.f5041l
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01aa:
            int r2 = r0.f5013a
            float r8 = r0.f5040k
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01b3:
            int r2 = r0.f5013a
            float r8 = r0.f5054y
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01bc:
            int r2 = r0.f5013a
            float r8 = r0.f5053x
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01c5:
            int r2 = r0.f5013a
            float r8 = r0.f5052w
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01ce:
            int r2 = r0.f5013a
            float r8 = r0.f5051v
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01d7:
            int r2 = r0.f5013a
            float r8 = r0.f5050u
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01e0:
            int r2 = r0.f5013a
            float r8 = r0.f5047r
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01e9:
            int r2 = r0.f5013a
            float r8 = r0.f5049t
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01f2:
            int r2 = r0.f5013a
            float r8 = r0.f5048s
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x01fb:
            int r2 = r0.f5013a
            float r8 = r0.f5046q
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x0204:
            int r2 = r0.f5013a
            float r8 = r0.f5045p
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x020d:
            int r2 = r0.f5013a
            float r8 = r0.f5044o
            r6.mo4535b(r2, r8)
            goto L_0x00c5
        L_0x0216:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r8)
        L_0x021b:
            java.lang.String r6 = "WARNING KeyCycle"
            android.util.Log.v(r6, r2)
            goto L_0x00c5
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1722g.mo4792b(java.util.HashMap):void");
    }

    /* renamed from: c */
    public final void mo4793c(HashSet hashSet) {
        if (!Float.isNaN(this.f5044o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f5045p)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f5046q)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f5048s)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f5049t)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f5050u)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f5051v)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f5047r)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f5052w)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f5053x)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f5054y)) {
            hashSet.add("translationZ");
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1761t.f5464f);
        SparseIntArray sparseIntArray = C1721f.f5034a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C1721f.f5034a.get(index)) {
                case 1:
                    if (!MotionLayout.f4817a) {
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f5014b = obtainStyledAttributes.getResourceId(index, this.f5014b);
                            break;
                        } else {
                            this.f5015c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f5014b);
                        this.f5014b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f5015c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    }
                case 2:
                    this.f5013a = obtainStyledAttributes.getInt(index, this.f5013a);
                    break;
                case 3:
                    this.f5035f = obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f5036g = obtainStyledAttributes.getInteger(index, this.f5036g);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f5037h = obtainStyledAttributes.getInt(index, this.f5037h);
                        break;
                    } else {
                        this.f5038i = obtainStyledAttributes.getString(index);
                        this.f5037h = 7;
                        break;
                    }
                case 6:
                    this.f5039j = obtainStyledAttributes.getFloat(index, this.f5039j);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.f5040k = obtainStyledAttributes.getFloat(index, this.f5040k);
                        break;
                    } else {
                        this.f5040k = obtainStyledAttributes.getDimension(index, this.f5040k);
                        break;
                    }
                case 8:
                    this.f5043n = obtainStyledAttributes.getInt(index, this.f5043n);
                    break;
                case 9:
                    this.f5044o = obtainStyledAttributes.getFloat(index, this.f5044o);
                    break;
                case 10:
                    this.f5045p = obtainStyledAttributes.getDimension(index, this.f5045p);
                    break;
                case 11:
                    this.f5046q = obtainStyledAttributes.getFloat(index, this.f5046q);
                    break;
                case 12:
                    this.f5048s = obtainStyledAttributes.getFloat(index, this.f5048s);
                    break;
                case 13:
                    this.f5049t = obtainStyledAttributes.getFloat(index, this.f5049t);
                    break;
                case 14:
                    this.f5047r = obtainStyledAttributes.getFloat(index, this.f5047r);
                    break;
                case 15:
                    this.f5050u = obtainStyledAttributes.getFloat(index, this.f5050u);
                    break;
                case 16:
                    this.f5051v = obtainStyledAttributes.getFloat(index, this.f5051v);
                    break;
                case 17:
                    this.f5052w = obtainStyledAttributes.getDimension(index, this.f5052w);
                    break;
                case 18:
                    this.f5053x = obtainStyledAttributes.getDimension(index, this.f5053x);
                    break;
                case 19:
                    this.f5054y = obtainStyledAttributes.getDimension(index, this.f5054y);
                    break;
                case 20:
                    this.f5042m = obtainStyledAttributes.getFloat(index, this.f5042m);
                    break;
                case 21:
                    this.f5041l = obtainStyledAttributes.getFloat(index, this.f5041l) / 360.0f;
                    break;
                default:
                    String hexString = Integer.toHexString(index);
                    int i2 = C1721f.f5034a.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb.append("unused attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i2);
                    Log.e("KeyCycle", sb.toString());
                    break;
            }
        }
    }
}
