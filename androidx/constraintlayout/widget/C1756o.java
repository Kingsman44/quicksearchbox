package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C1701a;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;
import androidx.constraintlayout.p079a.p082b.C1615a;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4535g.C59203do;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.o */
/* compiled from: PG */
public final class C1756o {

    /* renamed from: a */
    public static final int[] f5450a = {0, 4, 8};

    /* renamed from: g */
    private static final SparseIntArray f5451g;

    /* renamed from: h */
    private static final SparseIntArray f5452h;

    /* renamed from: b */
    public String f5453b;

    /* renamed from: c */
    public String f5454c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f5455d = 0;

    /* renamed from: e */
    public boolean f5456e = true;

    /* renamed from: f */
    public final HashMap f5457f = new HashMap();

    /* renamed from: i */
    private final HashMap f5458i = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5451g = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5452h = sparseIntArray2;
        int[] iArr = C1761t.f5459a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r5 = ((androidx.constraintlayout.widget.ConstraintLayout) r9.getParent()).mo4831K(r5);
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int[] m4798B(android.view.View r9, java.lang.String r10) {
        /*
            java.lang.String r0 = ","
            java.lang.String[] r10 = r10.split(r0)
            android.content.Context r0 = r9.getContext()
            int r1 = r10.length
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0010:
            int r5 = r10.length
            if (r3 >= r5) goto L_0x0067
            r5 = r10[r3]
            java.lang.String r5 = r5.trim()
            java.lang.Class<androidx.constraintlayout.widget.s> r6 = androidx.constraintlayout.widget.C1760s.class
            java.lang.reflect.Field r6 = r6.getField(r5)     // Catch:{ Exception -> 0x0025 }
            r7 = 0
            int r6 = r6.getInt(r7)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0027
        L_0x0025:
            r6 = 0
        L_0x0027:
            if (r6 != 0) goto L_0x0037
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r7 = "id"
            java.lang.String r8 = r0.getPackageName()
            int r6 = r6.getIdentifier(r5, r7, r8)
        L_0x0037:
            if (r6 != 0) goto L_0x005f
            boolean r6 = r9.isInEditMode()
            if (r6 == 0) goto L_0x005e
            android.view.ViewParent r6 = r9.getParent()
            boolean r6 = r6 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r6 == 0) goto L_0x005e
            android.view.ViewParent r6 = r9.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            java.lang.Object r5 = r6.mo4831K(r5)
            if (r5 == 0) goto L_0x005e
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x005e
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            int r5 = r4 + 1
            r1[r4] = r6
            int r3 = r3 + 1
            r4 = r5
            goto L_0x0010
        L_0x0067:
            if (r4 == r5) goto L_0x006e
            int[] r9 = java.util.Arrays.copyOf(r1, r4)
            return r9
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C1756o.m4798B(android.view.View, java.lang.String):int[]");
    }

    /* renamed from: C */
    private static final C1751j m4799C(Context context, AttributeSet attributeSet, boolean z) {
        C1751j jVar = new C1751j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? C1761t.f5461c : C1761t.f5459a);
        if (z) {
            m4800D(jVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (!(index == 1 || index == 23 || index == 24)) {
                    jVar.f5341d.f5416b = true;
                    jVar.f5342e.f5391c = true;
                    jVar.f5340c.f5430a = true;
                    jVar.f5343f.f5436b = true;
                }
                SparseIntArray sparseIntArray = f5451g;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        C1752k kVar = jVar.f5342e;
                        kVar.f5406r = m4802c(obtainStyledAttributes, index, kVar.f5406r);
                        break;
                    case 2:
                        C1752k kVar2 = jVar.f5342e;
                        kVar2.f5357K = obtainStyledAttributes.getDimensionPixelSize(index, kVar2.f5357K);
                        break;
                    case 3:
                        C1752k kVar3 = jVar.f5342e;
                        kVar3.f5405q = m4802c(obtainStyledAttributes, index, kVar3.f5405q);
                        break;
                    case 4:
                        C1752k kVar4 = jVar.f5342e;
                        kVar4.f5404p = m4802c(obtainStyledAttributes, index, kVar4.f5404p);
                        break;
                    case 5:
                        jVar.f5342e.f5347A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        C1752k kVar5 = jVar.f5342e;
                        kVar5.f5351E = obtainStyledAttributes.getDimensionPixelOffset(index, kVar5.f5351E);
                        break;
                    case 7:
                        C1752k kVar6 = jVar.f5342e;
                        kVar6.f5352F = obtainStyledAttributes.getDimensionPixelOffset(index, kVar6.f5352F);
                        break;
                    case 8:
                        C1752k kVar7 = jVar.f5342e;
                        kVar7.f5358L = obtainStyledAttributes.getDimensionPixelSize(index, kVar7.f5358L);
                        break;
                    case 9:
                        C1752k kVar8 = jVar.f5342e;
                        kVar8.f5412x = m4802c(obtainStyledAttributes, index, kVar8.f5412x);
                        break;
                    case 10:
                        C1752k kVar9 = jVar.f5342e;
                        kVar9.f5411w = m4802c(obtainStyledAttributes, index, kVar9.f5411w);
                        break;
                    case 11:
                        C1752k kVar10 = jVar.f5342e;
                        kVar10.f5364R = obtainStyledAttributes.getDimensionPixelSize(index, kVar10.f5364R);
                        break;
                    case 12:
                        C1752k kVar11 = jVar.f5342e;
                        kVar11.f5365S = obtainStyledAttributes.getDimensionPixelSize(index, kVar11.f5365S);
                        break;
                    case 13:
                        C1752k kVar12 = jVar.f5342e;
                        kVar12.f5361O = obtainStyledAttributes.getDimensionPixelSize(index, kVar12.f5361O);
                        break;
                    case 14:
                        C1752k kVar13 = jVar.f5342e;
                        kVar13.f5363Q = obtainStyledAttributes.getDimensionPixelSize(index, kVar13.f5363Q);
                        break;
                    case 15:
                        C1752k kVar14 = jVar.f5342e;
                        kVar14.f5366T = obtainStyledAttributes.getDimensionPixelSize(index, kVar14.f5366T);
                        break;
                    case 16:
                        C1752k kVar15 = jVar.f5342e;
                        kVar15.f5362P = obtainStyledAttributes.getDimensionPixelSize(index, kVar15.f5362P);
                        break;
                    case 17:
                        C1752k kVar16 = jVar.f5342e;
                        kVar16.f5394f = obtainStyledAttributes.getDimensionPixelOffset(index, kVar16.f5394f);
                        break;
                    case 18:
                        C1752k kVar17 = jVar.f5342e;
                        kVar17.f5395g = obtainStyledAttributes.getDimensionPixelOffset(index, kVar17.f5395g);
                        break;
                    case 19:
                        C1752k kVar18 = jVar.f5342e;
                        kVar18.f5396h = obtainStyledAttributes.getFloat(index, kVar18.f5396h);
                        break;
                    case 20:
                        C1752k kVar19 = jVar.f5342e;
                        kVar19.f5413y = obtainStyledAttributes.getFloat(index, kVar19.f5413y);
                        break;
                    case 21:
                        C1752k kVar20 = jVar.f5342e;
                        kVar20.f5393e = obtainStyledAttributes.getLayoutDimension(index, kVar20.f5393e);
                        break;
                    case 22:
                        C1754m mVar = jVar.f5340c;
                        mVar.f5431b = obtainStyledAttributes.getInt(index, mVar.f5431b);
                        C1754m mVar2 = jVar.f5340c;
                        mVar2.f5431b = f5450a[mVar2.f5431b];
                        break;
                    case 23:
                        C1752k kVar21 = jVar.f5342e;
                        kVar21.f5392d = obtainStyledAttributes.getLayoutDimension(index, kVar21.f5392d);
                        break;
                    case 24:
                        C1752k kVar22 = jVar.f5342e;
                        kVar22.f5354H = obtainStyledAttributes.getDimensionPixelSize(index, kVar22.f5354H);
                        break;
                    case 25:
                        C1752k kVar23 = jVar.f5342e;
                        kVar23.f5398j = m4802c(obtainStyledAttributes, index, kVar23.f5398j);
                        break;
                    case 26:
                        C1752k kVar24 = jVar.f5342e;
                        kVar24.f5399k = m4802c(obtainStyledAttributes, index, kVar24.f5399k);
                        break;
                    case 27:
                        C1752k kVar25 = jVar.f5342e;
                        kVar25.f5353G = obtainStyledAttributes.getInt(index, kVar25.f5353G);
                        break;
                    case 28:
                        C1752k kVar26 = jVar.f5342e;
                        kVar26.f5355I = obtainStyledAttributes.getDimensionPixelSize(index, kVar26.f5355I);
                        break;
                    case 29:
                        C1752k kVar27 = jVar.f5342e;
                        kVar27.f5400l = m4802c(obtainStyledAttributes, index, kVar27.f5400l);
                        break;
                    case 30:
                        C1752k kVar28 = jVar.f5342e;
                        kVar28.f5401m = m4802c(obtainStyledAttributes, index, kVar28.f5401m);
                        break;
                    case 31:
                        C1752k kVar29 = jVar.f5342e;
                        kVar29.f5359M = obtainStyledAttributes.getDimensionPixelSize(index, kVar29.f5359M);
                        break;
                    case 32:
                        C1752k kVar30 = jVar.f5342e;
                        kVar30.f5409u = m4802c(obtainStyledAttributes, index, kVar30.f5409u);
                        break;
                    case 33:
                        C1752k kVar31 = jVar.f5342e;
                        kVar31.f5410v = m4802c(obtainStyledAttributes, index, kVar31.f5410v);
                        break;
                    case 34:
                        C1752k kVar32 = jVar.f5342e;
                        kVar32.f5356J = obtainStyledAttributes.getDimensionPixelSize(index, kVar32.f5356J);
                        break;
                    case 35:
                        C1752k kVar33 = jVar.f5342e;
                        kVar33.f5403o = m4802c(obtainStyledAttributes, index, kVar33.f5403o);
                        break;
                    case 36:
                        C1752k kVar34 = jVar.f5342e;
                        kVar34.f5402n = m4802c(obtainStyledAttributes, index, kVar34.f5402n);
                        break;
                    case 37:
                        C1752k kVar35 = jVar.f5342e;
                        kVar35.f5414z = obtainStyledAttributes.getFloat(index, kVar35.f5414z);
                        break;
                    case 38:
                        jVar.f5338a = obtainStyledAttributes.getResourceId(index, jVar.f5338a);
                        break;
                    case 39:
                        C1752k kVar36 = jVar.f5342e;
                        kVar36.f5369W = obtainStyledAttributes.getFloat(index, kVar36.f5369W);
                        break;
                    case 40:
                        C1752k kVar37 = jVar.f5342e;
                        kVar37.f5368V = obtainStyledAttributes.getFloat(index, kVar37.f5368V);
                        break;
                    case 41:
                        C1752k kVar38 = jVar.f5342e;
                        kVar38.f5370X = obtainStyledAttributes.getInt(index, kVar38.f5370X);
                        break;
                    case 42:
                        C1752k kVar39 = jVar.f5342e;
                        kVar39.f5371Y = obtainStyledAttributes.getInt(index, kVar39.f5371Y);
                        break;
                    case 43:
                        C1754m mVar3 = jVar.f5340c;
                        mVar3.f5433d = obtainStyledAttributes.getFloat(index, mVar3.f5433d);
                        break;
                    case 44:
                        C1755n nVar = jVar.f5343f;
                        nVar.f5448n = true;
                        nVar.f5449o = obtainStyledAttributes.getDimension(index, nVar.f5449o);
                        break;
                    case 45:
                        C1755n nVar2 = jVar.f5343f;
                        nVar2.f5438d = obtainStyledAttributes.getFloat(index, nVar2.f5438d);
                        break;
                    case 46:
                        C1755n nVar3 = jVar.f5343f;
                        nVar3.f5439e = obtainStyledAttributes.getFloat(index, nVar3.f5439e);
                        break;
                    case 47:
                        C1755n nVar4 = jVar.f5343f;
                        nVar4.f5440f = obtainStyledAttributes.getFloat(index, nVar4.f5440f);
                        break;
                    case 48:
                        C1755n nVar5 = jVar.f5343f;
                        nVar5.f5441g = obtainStyledAttributes.getFloat(index, nVar5.f5441g);
                        break;
                    case 49:
                        C1755n nVar6 = jVar.f5343f;
                        nVar6.f5442h = obtainStyledAttributes.getDimension(index, nVar6.f5442h);
                        break;
                    case 50:
                        C1755n nVar7 = jVar.f5343f;
                        nVar7.f5443i = obtainStyledAttributes.getDimension(index, nVar7.f5443i);
                        break;
                    case 51:
                        C1755n nVar8 = jVar.f5343f;
                        nVar8.f5445k = obtainStyledAttributes.getDimension(index, nVar8.f5445k);
                        break;
                    case 52:
                        C1755n nVar9 = jVar.f5343f;
                        nVar9.f5446l = obtainStyledAttributes.getDimension(index, nVar9.f5446l);
                        break;
                    case 53:
                        C1755n nVar10 = jVar.f5343f;
                        nVar10.f5447m = obtainStyledAttributes.getDimension(index, nVar10.f5447m);
                        break;
                    case 54:
                        C1752k kVar40 = jVar.f5342e;
                        kVar40.f5372Z = obtainStyledAttributes.getInt(index, kVar40.f5372Z);
                        break;
                    case 55:
                        C1752k kVar41 = jVar.f5342e;
                        kVar41.f5373aa = obtainStyledAttributes.getInt(index, kVar41.f5373aa);
                        break;
                    case 56:
                        C1752k kVar42 = jVar.f5342e;
                        kVar42.f5374ab = obtainStyledAttributes.getDimensionPixelSize(index, kVar42.f5374ab);
                        break;
                    case 57:
                        C1752k kVar43 = jVar.f5342e;
                        kVar43.f5375ac = obtainStyledAttributes.getDimensionPixelSize(index, kVar43.f5375ac);
                        break;
                    case 58:
                        C1752k kVar44 = jVar.f5342e;
                        kVar44.f5376ad = obtainStyledAttributes.getDimensionPixelSize(index, kVar44.f5376ad);
                        break;
                    case 59:
                        C1752k kVar45 = jVar.f5342e;
                        kVar45.f5377ae = obtainStyledAttributes.getDimensionPixelSize(index, kVar45.f5377ae);
                        break;
                    case 60:
                        C1755n nVar11 = jVar.f5343f;
                        nVar11.f5437c = obtainStyledAttributes.getFloat(index, nVar11.f5437c);
                        break;
                    case 61:
                        C1752k kVar46 = jVar.f5342e;
                        kVar46.f5348B = m4802c(obtainStyledAttributes, index, kVar46.f5348B);
                        break;
                    case 62:
                        C1752k kVar47 = jVar.f5342e;
                        kVar47.f5349C = obtainStyledAttributes.getDimensionPixelSize(index, kVar47.f5349C);
                        break;
                    case 63:
                        C1752k kVar48 = jVar.f5342e;
                        kVar48.f5350D = obtainStyledAttributes.getFloat(index, kVar48.f5350D);
                        break;
                    case 64:
                        C1753l lVar = jVar.f5341d;
                        lVar.f5417c = m4802c(obtainStyledAttributes, index, lVar.f5417c);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            jVar.f5341d.f5419e = C1596f.f4399f[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            jVar.f5341d.f5419e = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 66:
                        jVar.f5341d.f5421g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        C1753l lVar2 = jVar.f5341d;
                        lVar2.f5424j = obtainStyledAttributes.getFloat(index, lVar2.f5424j);
                        break;
                    case 68:
                        C1754m mVar4 = jVar.f5340c;
                        mVar4.f5434e = obtainStyledAttributes.getFloat(index, mVar4.f5434e);
                        break;
                    case 69:
                        jVar.f5342e.f5378af = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        jVar.f5342e.f5379ag = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        C1752k kVar49 = jVar.f5342e;
                        kVar49.f5380ah = obtainStyledAttributes.getInt(index, kVar49.f5380ah);
                        break;
                    case 73:
                        C1752k kVar50 = jVar.f5342e;
                        kVar50.f5381ai = obtainStyledAttributes.getDimensionPixelSize(index, kVar50.f5381ai);
                        break;
                    case 74:
                        jVar.f5342e.f5384al = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        C1752k kVar51 = jVar.f5342e;
                        kVar51.f5388ap = obtainStyledAttributes.getBoolean(index, kVar51.f5388ap);
                        break;
                    case 76:
                        C1753l lVar3 = jVar.f5341d;
                        lVar3.f5420f = obtainStyledAttributes.getInt(index, lVar3.f5420f);
                        break;
                    case 77:
                        jVar.f5342e.f5385am = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        C1754m mVar5 = jVar.f5340c;
                        mVar5.f5432c = obtainStyledAttributes.getInt(index, mVar5.f5432c);
                        break;
                    case 79:
                        C1753l lVar4 = jVar.f5341d;
                        lVar4.f5422h = obtainStyledAttributes.getFloat(index, lVar4.f5422h);
                        break;
                    case 80:
                        C1752k kVar52 = jVar.f5342e;
                        kVar52.f5386an = obtainStyledAttributes.getBoolean(index, kVar52.f5386an);
                        break;
                    case 81:
                        C1752k kVar53 = jVar.f5342e;
                        kVar53.f5387ao = obtainStyledAttributes.getBoolean(index, kVar53.f5387ao);
                        break;
                    case 82:
                        C1753l lVar5 = jVar.f5341d;
                        lVar5.f5418d = obtainStyledAttributes.getInteger(index, lVar5.f5418d);
                        break;
                    case 83:
                        C1755n nVar12 = jVar.f5343f;
                        nVar12.f5444j = m4802c(obtainStyledAttributes, index, nVar12.f5444j);
                        break;
                    case 84:
                        C1753l lVar6 = jVar.f5341d;
                        lVar6.f5426l = obtainStyledAttributes.getInteger(index, lVar6.f5426l);
                        break;
                    case 85:
                        C1753l lVar7 = jVar.f5341d;
                        lVar7.f5425k = obtainStyledAttributes.getFloat(index, lVar7.f5425k);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type != 1) {
                            if (peekValue.type != 3) {
                                C1753l lVar8 = jVar.f5341d;
                                lVar8.f5428n = obtainStyledAttributes.getInteger(index, lVar8.f5429o);
                                break;
                            } else {
                                jVar.f5341d.f5427m = obtainStyledAttributes.getString(index);
                                if (jVar.f5341d.f5427m.indexOf("/") <= 0) {
                                    jVar.f5341d.f5428n = -1;
                                    break;
                                } else {
                                    jVar.f5341d.f5429o = obtainStyledAttributes.getResourceId(index, -1);
                                    jVar.f5341d.f5428n = -2;
                                    break;
                                }
                            }
                        } else {
                            jVar.f5341d.f5429o = obtainStyledAttributes.getResourceId(index, -1);
                            C1753l lVar9 = jVar.f5341d;
                            if (lVar9.f5429o == -1) {
                                break;
                            } else {
                                lVar9.f5428n = -2;
                                break;
                            }
                        }
                    case 87:
                        String hexString = Integer.toHexString(index);
                        int i2 = sparseIntArray.get(index);
                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                        sb.append("unused attribute 0x");
                        sb.append(hexString);
                        sb.append("   ");
                        sb.append(i2);
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 91:
                        C1752k kVar54 = jVar.f5342e;
                        kVar54.f5407s = m4802c(obtainStyledAttributes, index, kVar54.f5407s);
                        break;
                    case 92:
                        C1752k kVar55 = jVar.f5342e;
                        kVar55.f5408t = m4802c(obtainStyledAttributes, index, kVar55.f5408t);
                        break;
                    case 93:
                        C1752k kVar56 = jVar.f5342e;
                        kVar56.f5360N = obtainStyledAttributes.getDimensionPixelSize(index, kVar56.f5360N);
                        break;
                    case 94:
                        C1752k kVar57 = jVar.f5342e;
                        kVar57.f5367U = obtainStyledAttributes.getDimensionPixelSize(index, kVar57.f5367U);
                        break;
                    case 95:
                        m4804r(jVar.f5342e, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        m4804r(jVar.f5342e, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        C1752k kVar58 = jVar.f5342e;
                        kVar58.f5389aq = obtainStyledAttributes.getInt(index, kVar58.f5389aq);
                        break;
                    default:
                        String hexString2 = Integer.toHexString(index);
                        int i3 = sparseIntArray.get(index);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                        sb2.append("Unknown attribute 0x");
                        sb2.append(hexString2);
                        sb2.append("   ");
                        sb2.append(i3);
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                }
            }
            C1752k kVar59 = jVar.f5342e;
            if (kVar59.f5384al != null) {
                kVar59.f5383ak = null;
            }
        }
        obtainStyledAttributes.recycle();
        return jVar;
    }

    /* renamed from: D */
    private static void m4800D(C1751j jVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C1750i iVar = new C1750i();
        jVar.f5345h = iVar;
        jVar.f5341d.f5416b = false;
        jVar.f5342e.f5391c = false;
        jVar.f5340c.f5430a = false;
        jVar.f5343f.f5436b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f5452h.get(index)) {
                case 2:
                    iVar.mo4869b(2, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5357K));
                    break;
                case 5:
                    iVar.mo4870c(5, typedArray.getString(index));
                    break;
                case 6:
                    iVar.mo4869b(6, typedArray.getDimensionPixelOffset(index, jVar.f5342e.f5351E));
                    break;
                case 7:
                    iVar.mo4869b(7, typedArray.getDimensionPixelOffset(index, jVar.f5342e.f5352F));
                    break;
                case 8:
                    iVar.mo4869b(8, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5358L));
                    break;
                case 11:
                    iVar.mo4869b(11, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5364R));
                    break;
                case 12:
                    iVar.mo4869b(12, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5365S));
                    break;
                case 13:
                    iVar.mo4869b(13, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5361O));
                    break;
                case 14:
                    iVar.mo4869b(14, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5363Q));
                    break;
                case 15:
                    iVar.mo4869b(15, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5366T));
                    break;
                case 16:
                    iVar.mo4869b(16, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5362P));
                    break;
                case 17:
                    iVar.mo4869b(17, typedArray.getDimensionPixelOffset(index, jVar.f5342e.f5394f));
                    break;
                case 18:
                    iVar.mo4869b(18, typedArray.getDimensionPixelOffset(index, jVar.f5342e.f5395g));
                    break;
                case 19:
                    iVar.mo4868a(19, typedArray.getFloat(index, jVar.f5342e.f5396h));
                    break;
                case 20:
                    iVar.mo4868a(20, typedArray.getFloat(index, jVar.f5342e.f5413y));
                    break;
                case 21:
                    iVar.mo4869b(21, typedArray.getLayoutDimension(index, jVar.f5342e.f5393e));
                    break;
                case 22:
                    iVar.mo4869b(22, f5450a[typedArray.getInt(index, jVar.f5340c.f5431b)]);
                    break;
                case 23:
                    iVar.mo4869b(23, typedArray.getLayoutDimension(index, jVar.f5342e.f5392d));
                    break;
                case 24:
                    iVar.mo4869b(24, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5354H));
                    break;
                case 27:
                    iVar.mo4869b(27, typedArray.getInt(index, jVar.f5342e.f5353G));
                    break;
                case 28:
                    iVar.mo4869b(28, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5355I));
                    break;
                case 31:
                    iVar.mo4869b(31, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5359M));
                    break;
                case 34:
                    iVar.mo4869b(34, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5356J));
                    break;
                case 37:
                    iVar.mo4868a(37, typedArray.getFloat(index, jVar.f5342e.f5414z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, jVar.f5338a);
                    jVar.f5338a = resourceId;
                    iVar.mo4869b(38, resourceId);
                    break;
                case 39:
                    iVar.mo4868a(39, typedArray.getFloat(index, jVar.f5342e.f5369W));
                    break;
                case 40:
                    iVar.mo4868a(40, typedArray.getFloat(index, jVar.f5342e.f5368V));
                    break;
                case 41:
                    iVar.mo4869b(41, typedArray.getInt(index, jVar.f5342e.f5370X));
                    break;
                case 42:
                    iVar.mo4869b(42, typedArray.getInt(index, jVar.f5342e.f5371Y));
                    break;
                case 43:
                    iVar.mo4868a(43, typedArray.getFloat(index, jVar.f5340c.f5433d));
                    break;
                case 44:
                    iVar.mo4871d(44, true);
                    iVar.mo4868a(44, typedArray.getDimension(index, jVar.f5343f.f5449o));
                    break;
                case 45:
                    iVar.mo4868a(45, typedArray.getFloat(index, jVar.f5343f.f5438d));
                    break;
                case 46:
                    iVar.mo4868a(46, typedArray.getFloat(index, jVar.f5343f.f5439e));
                    break;
                case 47:
                    iVar.mo4868a(47, typedArray.getFloat(index, jVar.f5343f.f5440f));
                    break;
                case 48:
                    iVar.mo4868a(48, typedArray.getFloat(index, jVar.f5343f.f5441g));
                    break;
                case 49:
                    iVar.mo4868a(49, typedArray.getDimension(index, jVar.f5343f.f5442h));
                    break;
                case 50:
                    iVar.mo4868a(50, typedArray.getDimension(index, jVar.f5343f.f5443i));
                    break;
                case 51:
                    iVar.mo4868a(51, typedArray.getDimension(index, jVar.f5343f.f5445k));
                    break;
                case 52:
                    iVar.mo4868a(52, typedArray.getDimension(index, jVar.f5343f.f5446l));
                    break;
                case 53:
                    iVar.mo4868a(53, typedArray.getDimension(index, jVar.f5343f.f5447m));
                    break;
                case 54:
                    iVar.mo4869b(54, typedArray.getInt(index, jVar.f5342e.f5372Z));
                    break;
                case 55:
                    iVar.mo4869b(55, typedArray.getInt(index, jVar.f5342e.f5373aa));
                    break;
                case 56:
                    iVar.mo4869b(56, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5374ab));
                    break;
                case 57:
                    iVar.mo4869b(57, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5375ac));
                    break;
                case 58:
                    iVar.mo4869b(58, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5376ad));
                    break;
                case 59:
                    iVar.mo4869b(59, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5377ae));
                    break;
                case 60:
                    iVar.mo4868a(60, typedArray.getFloat(index, jVar.f5343f.f5437c));
                    break;
                case 62:
                    iVar.mo4869b(62, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5349C));
                    break;
                case 63:
                    iVar.mo4868a(63, typedArray.getFloat(index, jVar.f5342e.f5350D));
                    break;
                case 64:
                    iVar.mo4869b(64, m4802c(typedArray, index, jVar.f5341d.f5417c));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        iVar.mo4870c(65, C1596f.f4399f[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        iVar.mo4870c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    iVar.mo4869b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    iVar.mo4868a(67, typedArray.getFloat(index, jVar.f5341d.f5424j));
                    break;
                case 68:
                    iVar.mo4868a(68, typedArray.getFloat(index, jVar.f5340c.f5434e));
                    break;
                case 69:
                    iVar.mo4868a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    iVar.mo4868a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    iVar.mo4869b(72, typedArray.getInt(index, jVar.f5342e.f5380ah));
                    break;
                case 73:
                    iVar.mo4869b(73, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5381ai));
                    break;
                case 74:
                    iVar.mo4870c(74, typedArray.getString(index));
                    break;
                case 75:
                    iVar.mo4871d(75, typedArray.getBoolean(index, jVar.f5342e.f5388ap));
                    break;
                case 76:
                    iVar.mo4869b(76, typedArray.getInt(index, jVar.f5341d.f5420f));
                    break;
                case 77:
                    iVar.mo4870c(77, typedArray.getString(index));
                    break;
                case 78:
                    iVar.mo4869b(78, typedArray.getInt(index, jVar.f5340c.f5432c));
                    break;
                case 79:
                    iVar.mo4868a(79, typedArray.getFloat(index, jVar.f5341d.f5422h));
                    break;
                case 80:
                    iVar.mo4871d(80, typedArray.getBoolean(index, jVar.f5342e.f5386an));
                    break;
                case 81:
                    iVar.mo4871d(81, typedArray.getBoolean(index, jVar.f5342e.f5387ao));
                    break;
                case 82:
                    iVar.mo4869b(82, typedArray.getInteger(index, jVar.f5341d.f5418d));
                    break;
                case 83:
                    iVar.mo4869b(83, m4802c(typedArray, index, jVar.f5343f.f5444j));
                    break;
                case 84:
                    iVar.mo4869b(84, typedArray.getInteger(index, jVar.f5341d.f5426l));
                    break;
                case 85:
                    iVar.mo4868a(85, typedArray.getFloat(index, jVar.f5341d.f5425k));
                    break;
                case 86:
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type != 1) {
                        if (peekValue.type != 3) {
                            C1753l lVar = jVar.f5341d;
                            lVar.f5428n = typedArray.getInteger(index, lVar.f5429o);
                            iVar.mo4869b(88, jVar.f5341d.f5428n);
                            break;
                        } else {
                            jVar.f5341d.f5427m = typedArray.getString(index);
                            iVar.mo4870c(90, jVar.f5341d.f5427m);
                            if (jVar.f5341d.f5427m.indexOf("/") <= 0) {
                                jVar.f5341d.f5428n = -1;
                                iVar.mo4869b(88, -1);
                                break;
                            } else {
                                jVar.f5341d.f5429o = typedArray.getResourceId(index, -1);
                                iVar.mo4869b(89, jVar.f5341d.f5429o);
                                jVar.f5341d.f5428n = -2;
                                iVar.mo4869b(88, -2);
                                break;
                            }
                        }
                    } else {
                        jVar.f5341d.f5429o = typedArray.getResourceId(index, -1);
                        iVar.mo4869b(89, jVar.f5341d.f5429o);
                        C1753l lVar2 = jVar.f5341d;
                        if (lVar2.f5429o == -1) {
                            break;
                        } else {
                            lVar2.f5428n = -2;
                            iVar.mo4869b(88, -2);
                            break;
                        }
                    }
                case 87:
                    String hexString = Integer.toHexString(index);
                    int i2 = f5451g.get(index);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
                    sb.append("unused attribute 0x");
                    sb.append(hexString);
                    sb.append("   ");
                    sb.append(i2);
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 93:
                    iVar.mo4869b(93, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5360N));
                    break;
                case 94:
                    iVar.mo4869b(94, typedArray.getDimensionPixelSize(index, jVar.f5342e.f5367U));
                    break;
                case 95:
                    m4804r(iVar, typedArray, index, 0);
                    break;
                case 96:
                    m4804r(iVar, typedArray, index, 1);
                    break;
                case 97:
                    iVar.mo4869b(97, typedArray.getInt(index, jVar.f5342e.f5389aq));
                    break;
                case 98:
                    if (!MotionLayout.f4817a) {
                        if (typedArray.peekValue(index).type != 3) {
                            jVar.f5338a = typedArray.getResourceId(index, jVar.f5338a);
                            break;
                        } else {
                            jVar.f5339b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, jVar.f5338a);
                        jVar.f5338a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            jVar.f5339b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    iVar.mo4871d(99, typedArray.getBoolean(index, jVar.f5342e.f5397i));
                    break;
                default:
                    String hexString2 = Integer.toHexString(index);
                    int i3 = f5451g.get(index);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString2).length() + 34);
                    sb2.append("Unknown attribute 0x");
                    sb2.append(hexString2);
                    sb2.append("   ");
                    sb2.append(i3);
                    Log.w("ConstraintSet", sb2.toString());
                    break;
            }
        }
    }

    /* renamed from: E */
    private static final String m4801E(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    /* renamed from: c */
    public static int m4802c(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: d */
    public static C1751j m4803d(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C1751j jVar = new C1751j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, C1761t.f5461c);
        m4800D(jVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r9 == -1) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m4804r(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 1
            r3 = -1
            r4 = 5
            r5 = 23
            r6 = 21
            r7 = 0
            if (r0 == r1) goto L_0x0069
            if (r0 == r4) goto L_0x0025
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            r0 = -2
            if (r9 == r10) goto L_0x0023
            r10 = -3
            if (r9 == r10) goto L_0x002a
            if (r9 == r0) goto L_0x0029
            if (r9 == r3) goto L_0x0029
            goto L_0x002a
        L_0x0023:
            r7 = -2
            goto L_0x002b
        L_0x0025:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x0029:
            r7 = r9
        L_0x002a:
            r2 = 0
        L_0x002b:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C1745d
            if (r9 == 0) goto L_0x003d
            androidx.constraintlayout.widget.d r8 = (androidx.constraintlayout.widget.C1745d) r8
            if (r11 != 0) goto L_0x0038
            r8.width = r7
            r8.f5254W = r2
            return
        L_0x0038:
            r8.height = r7
            r8.f5255X = r2
            return
        L_0x003d:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C1752k
            if (r9 == 0) goto L_0x004f
            androidx.constraintlayout.widget.k r8 = (androidx.constraintlayout.widget.C1752k) r8
            if (r11 != 0) goto L_0x004a
            r8.f5392d = r7
            r8.f5386an = r2
            return
        L_0x004a:
            r8.f5393e = r7
            r8.f5387ao = r2
            return
        L_0x004f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C1750i
            if (r9 == 0) goto L_0x0068
            androidx.constraintlayout.widget.i r8 = (androidx.constraintlayout.widget.C1750i) r8
            if (r11 != 0) goto L_0x0060
            r8.mo4869b(r5, r7)
            r9 = 80
            r8.mo4871d(r9, r2)
            return
        L_0x0060:
            r8.mo4869b(r6, r7)
            r9 = 81
            r8.mo4871d(r9, r2)
        L_0x0068:
            return
        L_0x0069:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0071
            goto L_0x016a
        L_0x0071:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x016a
            int r0 = r0 + r3
            if (r10 >= r0) goto L_0x016a
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r2
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x016a
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00c3
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C1745d
            if (r10 == 0) goto L_0x00b0
            androidx.constraintlayout.widget.d r8 = (androidx.constraintlayout.widget.C1745d) r8
            if (r11 != 0) goto L_0x00aa
            r8.width = r7
            goto L_0x00ac
        L_0x00aa:
            r8.height = r7
        L_0x00ac:
            m4805s(r8, r9)
            return
        L_0x00b0:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C1752k
            if (r10 == 0) goto L_0x00b9
            androidx.constraintlayout.widget.k r8 = (androidx.constraintlayout.widget.C1752k) r8
            r8.f5347A = r9
            return
        L_0x00b9:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C1750i
            if (r10 == 0) goto L_0x016a
            androidx.constraintlayout.widget.i r8 = (androidx.constraintlayout.widget.C1750i) r8
            r8.mo4870c(r4, r9)
            return
        L_0x00c3:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x010d
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x010c }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C1745d     // Catch:{ NumberFormatException -> 0x010c }
            if (r10 == 0) goto L_0x00e1
            androidx.constraintlayout.widget.d r8 = (androidx.constraintlayout.widget.C1745d) r8     // Catch:{ NumberFormatException -> 0x010c }
            if (r11 != 0) goto L_0x00dc
            r8.width = r7     // Catch:{ NumberFormatException -> 0x010c }
            r8.f5239H = r9     // Catch:{ NumberFormatException -> 0x010c }
            return
        L_0x00dc:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x010c }
            r8.f5240I = r9     // Catch:{ NumberFormatException -> 0x010c }
            return
        L_0x00e1:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C1752k     // Catch:{ NumberFormatException -> 0x010c }
            if (r10 == 0) goto L_0x00f3
            androidx.constraintlayout.widget.k r8 = (androidx.constraintlayout.widget.C1752k) r8     // Catch:{ NumberFormatException -> 0x010c }
            if (r11 != 0) goto L_0x00ee
            r8.f5392d = r7     // Catch:{ NumberFormatException -> 0x010c }
            r8.f5369W = r9     // Catch:{ NumberFormatException -> 0x010c }
            return
        L_0x00ee:
            r8.f5393e = r7     // Catch:{ NumberFormatException -> 0x010c }
            r8.f5368V = r9     // Catch:{ NumberFormatException -> 0x010c }
            return
        L_0x00f3:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C1750i     // Catch:{ NumberFormatException -> 0x010c }
            if (r10 == 0) goto L_0x016a
            androidx.constraintlayout.widget.i r8 = (androidx.constraintlayout.widget.C1750i) r8     // Catch:{ NumberFormatException -> 0x010c }
            if (r11 != 0) goto L_0x0104
            r8.mo4869b(r5, r7)     // Catch:{ NumberFormatException -> 0x010c }
            r10 = 39
            r8.mo4868a(r10, r9)     // Catch:{ NumberFormatException -> 0x010c }
            return
        L_0x0104:
            r8.mo4869b(r6, r7)     // Catch:{ NumberFormatException -> 0x010c }
            r10 = 40
            r8.mo4868a(r10, r9)     // Catch:{ NumberFormatException -> 0x010c }
        L_0x010c:
            return
        L_0x010d:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x016a
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016a }
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x016a }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x016a }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C1745d     // Catch:{ NumberFormatException -> 0x016a }
            r0 = 2
            if (r10 == 0) goto L_0x013b
            androidx.constraintlayout.widget.d r8 = (androidx.constraintlayout.widget.C1745d) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x0134
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.f5249R = r9     // Catch:{ NumberFormatException -> 0x016a }
            r8.f5243L = r0     // Catch:{ NumberFormatException -> 0x016a }
            return
        L_0x0134:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.f5250S = r9     // Catch:{ NumberFormatException -> 0x016a }
            r8.f5244M = r0     // Catch:{ NumberFormatException -> 0x016a }
            return
        L_0x013b:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C1752k     // Catch:{ NumberFormatException -> 0x016a }
            if (r10 == 0) goto L_0x0151
            androidx.constraintlayout.widget.k r8 = (androidx.constraintlayout.widget.C1752k) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x014a
            r8.f5392d = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.f5378af = r9     // Catch:{ NumberFormatException -> 0x016a }
            r8.f5372Z = r0     // Catch:{ NumberFormatException -> 0x016a }
            return
        L_0x014a:
            r8.f5393e = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.f5379ag = r9     // Catch:{ NumberFormatException -> 0x016a }
            r8.f5373aa = r0     // Catch:{ NumberFormatException -> 0x016a }
            return
        L_0x0151:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C1750i     // Catch:{ NumberFormatException -> 0x016a }
            if (r9 == 0) goto L_0x016a
            androidx.constraintlayout.widget.i r8 = (androidx.constraintlayout.widget.C1750i) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x0162
            r8.mo4869b(r5, r7)     // Catch:{ NumberFormatException -> 0x016a }
            r9 = 54
            r8.mo4869b(r9, r0)     // Catch:{ NumberFormatException -> 0x016a }
            return
        L_0x0162:
            r8.mo4869b(r6, r7)     // Catch:{ NumberFormatException -> 0x016a }
            r9 = 55
            r8.mo4869b(r9, r0)     // Catch:{ NumberFormatException -> 0x016a }
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C1756o.m4804r(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: s */
    static void m4805s(C1745d dVar, String str) {
        int i;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf <= 0 || indexOf >= length - 1) {
                i = -1;
            } else {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i3 = i2;
                i2 = indexOf + 1;
                i = i3;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        dVar.f5238G = str;
    }

    /* renamed from: A */
    public final void mo4882A(float f) {
        mo4885e(R.id.og_popover).f5342e.f5414z = f;
    }

    /* renamed from: a */
    public final int mo4883a(int i) {
        return mo4885e(i).f5342e.f5393e;
    }

    /* renamed from: b */
    public final int mo4884b(int i) {
        return mo4885e(i).f5342e.f5392d;
    }

    /* renamed from: e */
    public final C1751j mo4885e(int i) {
        HashMap hashMap = this.f5457f;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.f5457f.put(valueOf, new C1751j());
        }
        return (C1751j) this.f5457f.get(valueOf);
    }

    /* renamed from: f */
    public final C1751j mo4886f(int i) {
        HashMap hashMap = this.f5457f;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            return (C1751j) this.f5457f.get(valueOf);
        }
        return null;
    }

    /* renamed from: g */
    public final void mo4887g(ConstraintLayout constraintLayout) {
        C1751j jVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap hashMap = this.f5457f;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                String valueOf2 = String.valueOf(C1701a.m4619b(childAt));
                Log.w("ConstraintSet", valueOf2.length() != 0 ? "id unknown ".concat(valueOf2) : new String("id unknown "));
            } else if (this.f5456e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f5457f.containsKey(valueOf) && (jVar = (C1751j) this.f5457f.get(valueOf)) != null) {
                C1742a.m4756e(childAt, jVar.f5344g);
            }
        }
    }

    /* renamed from: h */
    public final void mo4888h(ConstraintLayout constraintLayout) {
        mo4900v(constraintLayout);
        constraintLayout.f5206V = null;
        constraintLayout.requestLayout();
    }

    /* renamed from: i */
    public final void mo4889i(ConstraintLayout constraintLayout) {
        C1756o oVar = this;
        int childCount = constraintLayout.getChildCount();
        oVar.f5457f.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C1745d dVar = (C1745d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!oVar.f5456e || id != -1) {
                HashMap hashMap = oVar.f5457f;
                Integer valueOf = Integer.valueOf(id);
                if (!hashMap.containsKey(valueOf)) {
                    oVar.f5457f.put(valueOf, new C1751j());
                }
                C1751j jVar = (C1751j) oVar.f5457f.get(valueOf);
                if (jVar != null) {
                    HashMap hashMap2 = oVar.f5458i;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        C1742a aVar = (C1742a) hashMap2.get(str);
                        try {
                            if (str.equals("BackgroundColor")) {
                                hashMap3.put(str, new C1742a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                String valueOf2 = String.valueOf(str);
                                try {
                                    hashMap3.put(str, new C1742a(aVar, cls.getMethod(valueOf2.length() != 0 ? "getMap".concat(valueOf2) : new String("getMap"), new Class[0]).invoke(childAt, new Object[0])));
                                } catch (NoSuchMethodException e) {
                                    e = e;
                                } catch (IllegalAccessException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    e.printStackTrace();
                                }
                            }
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            e.printStackTrace();
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            e.printStackTrace();
                        } catch (InvocationTargetException e6) {
                            e = e6;
                            e.printStackTrace();
                        }
                    }
                    jVar.f5344g = hashMap3;
                    jVar.mo4877d(id, dVar);
                    jVar.f5340c.f5431b = childAt.getVisibility();
                    jVar.f5340c.f5433d = childAt.getAlpha();
                    jVar.f5343f.f5437c = childAt.getRotation();
                    jVar.f5343f.f5438d = childAt.getRotationX();
                    jVar.f5343f.f5439e = childAt.getRotationY();
                    jVar.f5343f.f5440f = childAt.getScaleX();
                    jVar.f5343f.f5441g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == C59203do.f157270a && ((double) pivotY) == C59203do.f157270a)) {
                        C1755n nVar = jVar.f5343f;
                        nVar.f5442h = pivotX;
                        nVar.f5443i = pivotY;
                    }
                    jVar.f5343f.f5445k = childAt.getTranslationX();
                    jVar.f5343f.f5446l = childAt.getTranslationY();
                    jVar.f5343f.f5447m = childAt.getTranslationZ();
                    C1755n nVar2 = jVar.f5343f;
                    if (nVar2.f5448n) {
                        nVar2.f5449o = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        C1752k kVar = jVar.f5342e;
                        kVar.f5388ap = barrier.f5199b.f4483b;
                        kVar.f5383ak = barrier.mo4861p();
                        C1752k kVar2 = jVar.f5342e;
                        kVar2.f5380ah = barrier.f5198a;
                        kVar2.f5381ai = barrier.f5199b.f4484c;
                    }
                }
                i++;
                oVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: j */
    public final void mo4890j(Context context, int i) {
        mo4889i((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: k */
    public final void mo4891k(int i, int i2, int i3, int i4) {
        HashMap hashMap = this.f5457f;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.f5457f.put(valueOf, new C1751j());
        }
        C1751j jVar = (C1751j) this.f5457f.get(valueOf);
        if (jVar != null) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i4 == 7) {
                                C1752k kVar = jVar.f5342e;
                                kVar.f5412x = i3;
                                kVar.f5411w = -1;
                            } else if (i4 == 6) {
                                C1752k kVar2 = jVar.f5342e;
                                kVar2.f5411w = i3;
                                kVar2.f5412x = -1;
                            } else {
                                String E = m4801E(i4);
                                StringBuilder sb = new StringBuilder(E.length() + 19);
                                sb.append("right to ");
                                sb.append(E);
                                sb.append(" undefined");
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else if (i4 == 6) {
                            C1752k kVar3 = jVar.f5342e;
                            kVar3.f5410v = i3;
                            kVar3.f5409u = -1;
                        } else if (i4 == 7) {
                            C1752k kVar4 = jVar.f5342e;
                            kVar4.f5409u = i3;
                            kVar4.f5410v = -1;
                        } else {
                            String E2 = m4801E(i4);
                            StringBuilder sb2 = new StringBuilder(E2.length() + 19);
                            sb2.append("right to ");
                            sb2.append(E2);
                            sb2.append(" undefined");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else if (i4 == 5) {
                        C1752k kVar5 = jVar.f5342e;
                        kVar5.f5406r = i3;
                        kVar5.f5405q = -1;
                        kVar5.f5404p = -1;
                        kVar5.f5402n = -1;
                        kVar5.f5403o = -1;
                    } else if (i4 == 3) {
                        C1752k kVar6 = jVar.f5342e;
                        kVar6.f5407s = i3;
                        kVar6.f5405q = -1;
                        kVar6.f5404p = -1;
                        kVar6.f5402n = -1;
                        kVar6.f5403o = -1;
                    } else if (i4 == 4) {
                        C1752k kVar7 = jVar.f5342e;
                        kVar7.f5408t = i3;
                        kVar7.f5405q = -1;
                        kVar7.f5404p = -1;
                        kVar7.f5402n = -1;
                        kVar7.f5403o = -1;
                    } else {
                        String E3 = m4801E(i4);
                        StringBuilder sb3 = new StringBuilder(E3.length() + 19);
                        sb3.append("right to ");
                        sb3.append(E3);
                        sb3.append(" undefined");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                } else if (i4 == 4) {
                    C1752k kVar8 = jVar.f5342e;
                    kVar8.f5405q = i3;
                    kVar8.f5404p = -1;
                    kVar8.f5406r = -1;
                    kVar8.f5407s = -1;
                    kVar8.f5408t = -1;
                } else if (i4 == 3) {
                    C1752k kVar9 = jVar.f5342e;
                    kVar9.f5404p = i3;
                    kVar9.f5405q = -1;
                    kVar9.f5406r = -1;
                    kVar9.f5407s = -1;
                    kVar9.f5408t = -1;
                } else {
                    String E4 = m4801E(i4);
                    StringBuilder sb4 = new StringBuilder(E4.length() + 19);
                    sb4.append("right to ");
                    sb4.append(E4);
                    sb4.append(" undefined");
                    throw new IllegalArgumentException(sb4.toString());
                }
            } else if (i4 == 3) {
                C1752k kVar10 = jVar.f5342e;
                kVar10.f5402n = i3;
                kVar10.f5403o = -1;
                kVar10.f5406r = -1;
                kVar10.f5407s = -1;
                kVar10.f5408t = -1;
            } else if (i4 == 4) {
                C1752k kVar11 = jVar.f5342e;
                kVar11.f5403o = i3;
                kVar11.f5402n = -1;
                kVar11.f5406r = -1;
                kVar11.f5407s = -1;
                kVar11.f5408t = -1;
            } else {
                String E5 = m4801E(i4);
                StringBuilder sb5 = new StringBuilder(E5.length() + 19);
                sb5.append("right to ");
                sb5.append(E5);
                sb5.append(" undefined");
                throw new IllegalArgumentException(sb5.toString());
            }
        }
    }

    /* renamed from: l */
    public final void mo4892l(int i, int i2, int i3, int i4, int i5) {
        C1752k kVar;
        C1752k kVar2;
        HashMap hashMap = this.f5457f;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.f5457f.put(valueOf, new C1751j());
        }
        C1751j jVar = (C1751j) this.f5457f.get(valueOf);
        if (jVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C1752k kVar3 = jVar.f5342e;
                        kVar3.f5398j = i3;
                        kVar3.f5399k = -1;
                    } else if (i4 == 2) {
                        C1752k kVar4 = jVar.f5342e;
                        kVar4.f5399k = i3;
                        kVar4.f5398j = -1;
                    } else {
                        String E = m4801E(i4);
                        StringBuilder sb = new StringBuilder(E.length() + 18);
                        sb.append("Left to ");
                        sb.append(E);
                        sb.append(" undefined");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    jVar.f5342e.f5354H = i5;
                    return;
                case 2:
                    if (i4 == 1) {
                        C1752k kVar5 = jVar.f5342e;
                        kVar5.f5400l = i3;
                        kVar5.f5401m = -1;
                    } else if (i4 == 2) {
                        C1752k kVar6 = jVar.f5342e;
                        kVar6.f5401m = i3;
                        kVar6.f5400l = -1;
                    } else {
                        String E2 = m4801E(i4);
                        StringBuilder sb2 = new StringBuilder(E2.length() + 19);
                        sb2.append("right to ");
                        sb2.append(E2);
                        sb2.append(" undefined");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    jVar.f5342e.f5355I = i5;
                    return;
                case 3:
                    if (i4 == 3) {
                        kVar = jVar.f5342e;
                        kVar.f5402n = i3;
                        kVar.f5403o = -1;
                    } else if (i4 == 4) {
                        kVar = jVar.f5342e;
                        kVar.f5403o = i3;
                        kVar.f5402n = -1;
                    } else {
                        String E3 = m4801E(i4);
                        StringBuilder sb3 = new StringBuilder(E3.length() + 19);
                        sb3.append("right to ");
                        sb3.append(E3);
                        sb3.append(" undefined");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    kVar.f5406r = -1;
                    kVar.f5407s = -1;
                    kVar.f5408t = -1;
                    jVar.f5342e.f5356J = i5;
                    return;
                case 4:
                    if (i4 == 4) {
                        kVar2 = jVar.f5342e;
                        kVar2.f5405q = i3;
                        kVar2.f5404p = -1;
                    } else if (i4 == 3) {
                        kVar2 = jVar.f5342e;
                        kVar2.f5404p = i3;
                        kVar2.f5405q = -1;
                    } else {
                        String E4 = m4801E(i4);
                        StringBuilder sb4 = new StringBuilder(E4.length() + 19);
                        sb4.append("right to ");
                        sb4.append(E4);
                        sb4.append(" undefined");
                        throw new IllegalArgumentException(sb4.toString());
                    }
                    kVar2.f5406r = -1;
                    kVar2.f5407s = -1;
                    kVar2.f5408t = -1;
                    jVar.f5342e.f5357K = i5;
                    return;
                case 5:
                    if (i4 == 5) {
                        C1752k kVar7 = jVar.f5342e;
                        kVar7.f5406r = i3;
                        kVar7.f5405q = -1;
                        kVar7.f5404p = -1;
                        kVar7.f5402n = -1;
                        kVar7.f5403o = -1;
                        return;
                    } else if (i4 == 3) {
                        C1752k kVar8 = jVar.f5342e;
                        kVar8.f5407s = i3;
                        kVar8.f5405q = -1;
                        kVar8.f5404p = -1;
                        kVar8.f5402n = -1;
                        kVar8.f5403o = -1;
                        return;
                    } else if (i4 == 4) {
                        C1752k kVar9 = jVar.f5342e;
                        kVar9.f5408t = i3;
                        kVar9.f5405q = -1;
                        kVar9.f5404p = -1;
                        kVar9.f5402n = -1;
                        kVar9.f5403o = -1;
                        return;
                    } else {
                        String E5 = m4801E(i4);
                        StringBuilder sb5 = new StringBuilder(E5.length() + 19);
                        sb5.append("right to ");
                        sb5.append(E5);
                        sb5.append(" undefined");
                        throw new IllegalArgumentException(sb5.toString());
                    }
                case 6:
                    if (i4 == 6) {
                        C1752k kVar10 = jVar.f5342e;
                        kVar10.f5410v = i3;
                        kVar10.f5409u = -1;
                    } else if (i4 == 7) {
                        C1752k kVar11 = jVar.f5342e;
                        kVar11.f5409u = i3;
                        kVar11.f5410v = -1;
                    } else {
                        String E6 = m4801E(i4);
                        StringBuilder sb6 = new StringBuilder(E6.length() + 19);
                        sb6.append("right to ");
                        sb6.append(E6);
                        sb6.append(" undefined");
                        throw new IllegalArgumentException(sb6.toString());
                    }
                    jVar.f5342e.f5359M = i5;
                    return;
                default:
                    if (i4 == 7) {
                        C1752k kVar12 = jVar.f5342e;
                        kVar12.f5412x = i3;
                        kVar12.f5411w = -1;
                    } else if (i4 == 6) {
                        C1752k kVar13 = jVar.f5342e;
                        kVar13.f5411w = i3;
                        kVar13.f5412x = -1;
                    } else {
                        String E7 = m4801E(i4);
                        StringBuilder sb7 = new StringBuilder(E7.length() + 19);
                        sb7.append("right to ");
                        sb7.append(E7);
                        sb7.append(" undefined");
                        throw new IllegalArgumentException(sb7.toString());
                    }
                    jVar.f5342e.f5358L = i5;
                    return;
            }
        }
    }

    /* renamed from: m */
    public final void mo4893m(int i, int i2) {
        mo4885e(i).f5342e.f5393e = i2;
    }

    /* renamed from: n */
    public final void mo4894n(int i, int i2) {
        mo4885e(i).f5342e.f5374ab = i2;
    }

    /* renamed from: o */
    public final void mo4895o(int i, int i2) {
        mo4885e(i).f5342e.f5392d = i2;
    }

    /* renamed from: p */
    public final void mo4896p(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1751j C = m4799C(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        C.f5342e.f5390b = true;
                    }
                    this.f5457f.put(Integer.valueOf(C.f5338a), C);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b0, code lost:
        if (r10.equals("Guideline") != false) goto L_0x00e6;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4897q(android.content.Context r17, org.xmlpull.v1.XmlPullParser r18) {
        /*
            r16 = this;
            r1 = r17
            int r2 = r18.getEventType()     // Catch:{ XmlPullParserException -> 0x06ab, IOException -> 0x06a3 }
            r4 = 0
        L_0x0007:
            r5 = 1
            if (r2 == r5) goto L_0x06a0
            if (r2 == 0) goto L_0x068e
            r6 = 2
            r7 = -1
            r8 = 3
            if (r2 == r6) goto L_0x0070
            if (r2 == r8) goto L_0x0019
        L_0x0013:
            r2 = r16
        L_0x0015:
            r6 = r18
            goto L_0x0695
        L_0x0019:
            java.lang.String r2 = r18.getName()     // Catch:{ XmlPullParserException -> 0x06ab, IOException -> 0x06a3 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x06ab, IOException -> 0x06a3 }
            java.lang.String r2 = r2.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x06ab, IOException -> 0x06a3 }
            int r10 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x06ab, IOException -> 0x06a3 }
            switch(r10) {
                case -2075718416: goto L_0x0049;
                case -190376483: goto L_0x003f;
                case 426575017: goto L_0x0035;
                case 2146106725: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0052
        L_0x002b:
            java.lang.String r10 = "constraintset"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0052
            r7 = 0
            goto L_0x0052
        L_0x0035:
            java.lang.String r9 = "constraintoverride"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0052
            r7 = 2
            goto L_0x0052
        L_0x003f:
            java.lang.String r9 = "constraint"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0052
            r7 = 1
            goto L_0x0052
        L_0x0049:
            java.lang.String r9 = "guideline"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0052
            r7 = 3
        L_0x0052:
            if (r7 == 0) goto L_0x006d
            if (r7 == r5) goto L_0x005b
            if (r7 == r6) goto L_0x005b
            if (r7 == r8) goto L_0x005b
            goto L_0x0013
        L_0x005b:
            r2 = r16
            java.util.HashMap r5 = r2.f5457f     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r6 = r4.f5338a     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r5.put(r6, r4)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r6 = r18
            r4 = 0
            goto L_0x0695
        L_0x006d:
            r2 = r16
            return
        L_0x0070:
            r2 = r16
            java.lang.String r10 = r18.getName()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r11 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r12 = 4
            switch(r11) {
                case -2025855158: goto L_0x00db;
                case -1984451626: goto L_0x00d1;
                case -1962203927: goto L_0x00c7;
                case -1269513683: goto L_0x00bd;
                case -1238332596: goto L_0x00b3;
                case -71750448: goto L_0x00aa;
                case 366511058: goto L_0x009f;
                case 1331510167: goto L_0x0095;
                case 1791837707: goto L_0x008a;
                case 1803088381: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x00e5
        L_0x0080:
            java.lang.String r6 = "Constraint"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 0
            goto L_0x00e6
        L_0x008a:
            java.lang.String r6 = "CustomAttribute"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 8
            goto L_0x00e6
        L_0x0095:
            java.lang.String r6 = "Barrier"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 3
            goto L_0x00e6
        L_0x009f:
            java.lang.String r6 = "CustomMethod"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 9
            goto L_0x00e6
        L_0x00aa:
            java.lang.String r11 = "Guideline"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00b3:
            java.lang.String r6 = "Transform"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 5
            goto L_0x00e6
        L_0x00bd:
            java.lang.String r6 = "PropertySet"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 4
            goto L_0x00e6
        L_0x00c7:
            java.lang.String r6 = "ConstraintOverride"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 1
            goto L_0x00e6
        L_0x00d1:
            java.lang.String r6 = "Motion"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 7
            goto L_0x00e6
        L_0x00db:
            java.lang.String r6 = "Layout"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00e5
            r6 = 6
            goto L_0x00e6
        L_0x00e5:
            r6 = -1
        L_0x00e6:
            java.lang.String r10 = "XML parser error must be within a Constraint "
            r11 = 56
            switch(r6) {
                case 0: goto L_0x0682;
                case 1: goto L_0x0677;
                case 2: goto L_0x0665;
                case 3: goto L_0x0655;
                case 4: goto L_0x05e6;
                case 5: goto L_0x052f;
                case 6: goto L_0x0200;
                case 7: goto L_0x0115;
                case 8: goto L_0x00ef;
                case 9: goto L_0x00ef;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x0015
        L_0x00ef:
            if (r4 == 0) goto L_0x00fa
            java.util.HashMap r5 = r4.f5344g     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r6 = r18
            androidx.constraintlayout.widget.C1742a.m4755d(r1, r6, r5)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x00fa:
            r6 = r18
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r18.getLineNumber()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.<init>(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r3 = r4.toString()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r1.<init>(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            throw r1     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x0115:
            r6 = r18
            if (r4 == 0) goto L_0x01e7
            androidx.constraintlayout.widget.l r10 = r4.f5341d     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.AttributeSet r11 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int[] r12 = androidx.constraintlayout.widget.C1761t.f5469k     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.content.res.TypedArray r11 = r1.obtainStyledAttributes(r11, r12)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5416b = r5     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r12 = r11.getIndexCount()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r13 = 0
        L_0x012c:
            if (r13 >= r12) goto L_0x01e2
            int r14 = r11.getIndex(r13)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.SparseIntArray r15 = androidx.constraintlayout.widget.C1753l.f5415a     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r15 = r15.get(r14)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            switch(r15) {
                case 1: goto L_0x01d6;
                case 2: goto L_0x01cd;
                case 3: goto L_0x01b2;
                case 4: goto L_0x01aa;
                case 5: goto L_0x01a1;
                case 6: goto L_0x0198;
                case 7: goto L_0x018f;
                case 8: goto L_0x0186;
                case 9: goto L_0x017d;
                case 10: goto L_0x013d;
                default: goto L_0x013b;
            }     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x013b:
            goto L_0x01de
        L_0x013d:
            android.util.TypedValue r15 = r11.peekValue(r14)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r15.type     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r9 = -2
            if (r3 != r5) goto L_0x0152
            int r3 = r11.getResourceId(r14, r7)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5429o = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            if (r3 == r7) goto L_0x01de
            r10.f5428n = r9     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x0152:
            int r3 = r15.type     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            if (r3 != r8) goto L_0x0174
            java.lang.String r3 = r11.getString(r14)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5427m = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r3 = r10.f5427m     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r15 = "/"
            int r3 = r3.indexOf(r15)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            if (r3 <= 0) goto L_0x0170
            int r3 = r11.getResourceId(r14, r7)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5429o = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5428n = r9     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x0170:
            r10.f5428n = r7     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x0174:
            int r3 = r10.f5429o     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r11.getInteger(r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5428n = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x017d:
            float r3 = r10.f5425k     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r3 = r11.getFloat(r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5425k = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x0186:
            int r3 = r10.f5426l     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r11.getInteger(r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5426l = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x018f:
            float r3 = r10.f5422h     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r3 = r11.getFloat(r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5422h = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x0198:
            int r3 = r10.f5418d     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r11.getInteger(r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5418d = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x01a1:
            int r3 = r10.f5417c     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = m4802c(r11, r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5417c = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x01aa:
            r3 = 0
            int r9 = r11.getInt(r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5421g = r9     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x01b2:
            android.util.TypedValue r3 = r11.peekValue(r14)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r3.type     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            if (r3 != r8) goto L_0x01c1
            java.lang.String r3 = r11.getString(r14)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5419e = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x01c1:
            java.lang.String[] r3 = androidx.constraintlayout.p079a.p080a.p081a.C1596f.f4399f     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r9 = 0
            int r14 = r11.getInteger(r14, r9)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3 = r3[r14]     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5419e = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x01cd:
            int r3 = r10.f5420f     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r11.getInt(r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5420f = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x01de
        L_0x01d6:
            float r3 = r10.f5424j     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r3 = r11.getFloat(r14, r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10.f5424j = r3     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x01de:
            int r13 = r13 + 1
            goto L_0x012c
        L_0x01e2:
            r11.recycle()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x01e7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r18.getLineNumber()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.<init>(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r3 = r4.toString()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r1.<init>(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            throw r1     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x0200:
            r6 = r18
            if (r4 == 0) goto L_0x0516
            androidx.constraintlayout.widget.k r3 = r4.f5342e     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int[] r8 = androidx.constraintlayout.widget.C1761t.f5468j     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.content.res.TypedArray r7 = r1.obtainStyledAttributes(r7, r8)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5391c = r5     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r8 = r7.getIndexCount()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r9 = 0
        L_0x0217:
            if (r9 >= r8) goto L_0x0511
            int r10 = r7.getIndex(r9)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.SparseIntArray r11 = androidx.constraintlayout.widget.C1752k.f5346a     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r11 = r11.get(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            switch(r11) {
                case 1: goto L_0x0505;
                case 2: goto L_0x04fc;
                case 3: goto L_0x04f3;
                case 4: goto L_0x04ea;
                case 5: goto L_0x04e3;
                case 6: goto L_0x04da;
                case 7: goto L_0x04d1;
                case 8: goto L_0x04c8;
                case 9: goto L_0x04bf;
                case 10: goto L_0x04b6;
                case 11: goto L_0x04ad;
                case 12: goto L_0x04a4;
                case 13: goto L_0x049a;
                case 14: goto L_0x0490;
                case 15: goto L_0x0486;
                case 16: goto L_0x047c;
                case 17: goto L_0x0472;
                case 18: goto L_0x0468;
                case 19: goto L_0x045e;
                case 20: goto L_0x0454;
                case 21: goto L_0x044a;
                case 22: goto L_0x0440;
                case 23: goto L_0x0436;
                case 24: goto L_0x042c;
                case 25: goto L_0x0422;
                case 26: goto L_0x0418;
                case 27: goto L_0x040e;
                case 28: goto L_0x0404;
                case 29: goto L_0x03fa;
                case 30: goto L_0x03f0;
                case 31: goto L_0x03e6;
                case 32: goto L_0x03dc;
                case 33: goto L_0x03d2;
                case 34: goto L_0x03c8;
                case 35: goto L_0x03be;
                case 36: goto L_0x03b4;
                case 37: goto L_0x03aa;
                case 38: goto L_0x03a0;
                case 39: goto L_0x0396;
                case 40: goto L_0x038c;
                case 41: goto L_0x0386;
                case 42: goto L_0x0381;
                default: goto L_0x0226;
            }
        L_0x0226:
            switch(r11) {
                case 61: goto L_0x0377;
                case 62: goto L_0x036d;
                case 63: goto L_0x0363;
                default: goto L_0x0229;
            }
        L_0x0229:
            java.lang.String r12 = "   "
            r13 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r14 = "ConstraintSet"
            switch(r11) {
                case 69: goto L_0x035b;
                case 70: goto L_0x0353;
                case 71: goto L_0x034c;
                case 72: goto L_0x0342;
                case 73: goto L_0x0338;
                case 74: goto L_0x0330;
                case 75: goto L_0x0326;
                case 76: goto L_0x031c;
                case 77: goto L_0x0312;
                case 78: goto L_0x0308;
                case 79: goto L_0x02fe;
                case 80: goto L_0x02f4;
                case 81: goto L_0x02ea;
                case 82: goto L_0x02e0;
                case 83: goto L_0x02d6;
                case 84: goto L_0x02cc;
                case 85: goto L_0x02c2;
                case 86: goto L_0x02b8;
                case 87: goto L_0x02ae;
                case 88: goto L_0x02a4;
                case 89: goto L_0x029c;
                case 90: goto L_0x0292;
                case 91: goto L_0x0262;
                default: goto L_0x0232;
            }
        L_0x0232:
            java.lang.String r11 = java.lang.Integer.toHexString(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.SparseIntArray r13 = androidx.constraintlayout.widget.C1752k.f5346a     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r13.get(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r13 = java.lang.String.valueOf(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r13 = r13.length()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r13 = r13 + 34
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r15.<init>(r13)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r13 = "Unknown attribute 0x"
            r15.append(r13)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r15.append(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r15.append(r12)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r15.append(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r10 = r15.toString()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.Log.w(r14, r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0262:
            java.lang.String r11 = java.lang.Integer.toHexString(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.SparseIntArray r13 = androidx.constraintlayout.widget.C1752k.f5346a     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r13.get(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r13 = java.lang.String.valueOf(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r13 = r13.length()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r13 = r13 + 33
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r15.<init>(r13)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r13 = "unused attribute 0x"
            r15.append(r13)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r15.append(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r15.append(r12)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r15.append(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r10 = r15.toString()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.Log.w(r14, r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0292:
            boolean r11 = r3.f5397i     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            boolean r10 = r7.getBoolean(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5397i = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x029c:
            java.lang.String r10 = r7.getString(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5385am = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02a4:
            boolean r11 = r3.f5387ao     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            boolean r10 = r7.getBoolean(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5387ao = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02ae:
            boolean r11 = r3.f5386an     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            boolean r10 = r7.getBoolean(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5386an = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02b8:
            int r11 = r3.f5376ad     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5376ad = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02c2:
            int r11 = r3.f5377ae     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5377ae = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02cc:
            int r11 = r3.f5374ab     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5374ab = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02d6:
            int r11 = r3.f5375ac     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5375ac = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02e0:
            int r11 = r3.f5373aa     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getInt(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5373aa = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02ea:
            int r11 = r3.f5372Z     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getInt(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5372Z = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02f4:
            int r11 = r3.f5360N     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5360N = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x02fe:
            int r11 = r3.f5367U     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5367U = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0308:
            int r11 = r3.f5408t     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5408t = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0312:
            int r11 = r3.f5407s     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5407s = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x031c:
            int r11 = r3.f5389aq     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getInt(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5389aq = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0326:
            boolean r11 = r3.f5388ap     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            boolean r10 = r7.getBoolean(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5388ap = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0330:
            java.lang.String r10 = r7.getString(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5384al = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0338:
            int r11 = r3.f5381ai     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5381ai = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0342:
            int r11 = r3.f5380ah     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getInt(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5380ah = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x034c:
            java.lang.String r10 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r14, r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0353:
            float r10 = r7.getFloat(r10, r13)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5379ag = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x035b:
            float r10 = r7.getFloat(r10, r13)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5378af = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0363:
            float r11 = r3.f5350D     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5350D = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x036d:
            int r11 = r3.f5349C     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5349C = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0377:
            int r11 = r3.f5348B     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5348B = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0381:
            m4804r(r3, r7, r10, r5)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0386:
            r11 = 0
            m4804r(r3, r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x038c:
            int r11 = r3.f5371Y     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getInt(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5371Y = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0396:
            int r11 = r3.f5370X     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getInt(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5370X = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03a0:
            float r11 = r3.f5368V     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5368V = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03aa:
            float r11 = r3.f5369W     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5369W = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03b4:
            float r11 = r3.f5414z     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5414z = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03be:
            int r11 = r3.f5402n     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5402n = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03c8:
            int r11 = r3.f5403o     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5403o = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03d2:
            int r11 = r3.f5356J     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5356J = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03dc:
            int r11 = r3.f5410v     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5410v = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03e6:
            int r11 = r3.f5409u     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5409u = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03f0:
            int r11 = r3.f5359M     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5359M = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x03fa:
            int r11 = r3.f5401m     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5401m = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0404:
            int r11 = r3.f5400l     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5400l = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x040e:
            int r11 = r3.f5355I     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5355I = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0418:
            int r11 = r3.f5353G     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getInt(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5353G = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0422:
            int r11 = r3.f5399k     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5399k = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x042c:
            int r11 = r3.f5398j     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5398j = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0436:
            int r11 = r3.f5354H     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5354H = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0440:
            int r11 = r3.f5392d     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getLayoutDimension(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5392d = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x044a:
            int r11 = r3.f5393e     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getLayoutDimension(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5393e = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0454:
            float r11 = r3.f5413y     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5413y = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x045e:
            float r11 = r3.f5396h     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5396h = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0468:
            int r11 = r3.f5395g     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelOffset(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5395g = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0472:
            int r11 = r3.f5394f     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelOffset(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5394f = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x047c:
            int r11 = r3.f5362P     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5362P = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0486:
            int r11 = r3.f5366T     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5366T = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0490:
            int r11 = r3.f5363Q     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5363Q = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x049a:
            int r11 = r3.f5361O     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5361O = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04a4:
            int r11 = r3.f5365S     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5365S = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04ad:
            int r11 = r3.f5364R     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5364R = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04b6:
            int r11 = r3.f5411w     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5411w = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04bf:
            int r11 = r3.f5412x     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5412x = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04c8:
            int r11 = r3.f5358L     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5358L = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04d1:
            int r11 = r3.f5352F     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelOffset(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5352F = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04da:
            int r11 = r3.f5351E     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelOffset(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5351E = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04e3:
            java.lang.String r10 = r7.getString(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5347A = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04ea:
            int r11 = r3.f5404p     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5404p = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04f3:
            int r11 = r3.f5405q     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5405q = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x04fc:
            int r11 = r3.f5357K     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = r7.getDimensionPixelSize(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5357K = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x050d
        L_0x0505:
            int r11 = r3.f5406r     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5406r = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x050d:
            int r9 = r9 + 1
            goto L_0x0217
        L_0x0511:
            r7.recycle()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x0516:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r18.getLineNumber()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.<init>(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r3 = r4.toString()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r1.<init>(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            throw r1     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x052f:
            r6 = r18
            if (r4 == 0) goto L_0x05cd
            androidx.constraintlayout.widget.n r3 = r4.f5343f     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int[] r8 = androidx.constraintlayout.widget.C1761t.f5477s     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.content.res.TypedArray r7 = r1.obtainStyledAttributes(r7, r8)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5436b = r5     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r8 = r7.getIndexCount()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r9 = 0
        L_0x0546:
            if (r9 >= r8) goto L_0x05c8
            int r10 = r7.getIndex(r9)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.SparseIntArray r11 = androidx.constraintlayout.widget.C1755n.f5435a     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r11 = r11.get(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            switch(r11) {
                case 1: goto L_0x05bc;
                case 2: goto L_0x05b3;
                case 3: goto L_0x05aa;
                case 4: goto L_0x05a1;
                case 5: goto L_0x0598;
                case 6: goto L_0x058f;
                case 7: goto L_0x0586;
                case 8: goto L_0x057d;
                case 9: goto L_0x0574;
                case 10: goto L_0x056b;
                case 11: goto L_0x0560;
                case 12: goto L_0x0557;
                default: goto L_0x0555;
            }     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x0555:
            goto L_0x05c4
        L_0x0557:
            int r11 = r3.f5444j     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r10 = m4802c(r7, r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5444j = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x0560:
            r3.f5448n = r5     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r11 = r3.f5449o     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getDimension(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5449o = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x056b:
            float r11 = r3.f5447m     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getDimension(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5447m = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x0574:
            float r11 = r3.f5446l     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getDimension(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5446l = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x057d:
            float r11 = r3.f5445k     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getDimension(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5445k = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x0586:
            float r11 = r3.f5443i     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getDimension(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5443i = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x058f:
            float r11 = r3.f5442h     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getDimension(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5442h = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x0598:
            float r11 = r3.f5441g     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5441g = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x05a1:
            float r11 = r3.f5440f     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5440f = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x05aa:
            float r11 = r3.f5439e     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5439e = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x05b3:
            float r11 = r3.f5438d     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5438d = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x05c4
        L_0x05bc:
            float r11 = r3.f5437c     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r10 = r7.getFloat(r10, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5437c = r10     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x05c4:
            int r9 = r9 + 1
            goto L_0x0546
        L_0x05c8:
            r7.recycle()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x05cd:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r18.getLineNumber()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.<init>(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r3 = r4.toString()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r1.<init>(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            throw r1     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x05e6:
            r6 = r18
            if (r4 == 0) goto L_0x063c
            androidx.constraintlayout.widget.m r3 = r4.f5340c     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int[] r9 = androidx.constraintlayout.widget.C1761t.f5474p     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            android.content.res.TypedArray r7 = r1.obtainStyledAttributes(r7, r9)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5430a = r5     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r9 = r7.getIndexCount()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r10 = 0
        L_0x05fd:
            if (r10 >= r9) goto L_0x0638
            int r11 = r7.getIndex(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            if (r11 != r5) goto L_0x060e
            float r11 = r3.f5433d     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r11 = r7.getFloat(r5, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5433d = r11     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0635
        L_0x060e:
            if (r11 != 0) goto L_0x0620
            int r11 = r3.f5431b     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r13 = 0
            int r11 = r7.getInt(r13, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5431b = r11     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int[] r13 = f5450a     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r11 = r13[r11]     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5431b = r11     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0635
        L_0x0620:
            if (r11 != r12) goto L_0x062b
            int r11 = r3.f5432c     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r11 = r7.getInt(r12, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5432c = r11     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0635
        L_0x062b:
            if (r11 != r8) goto L_0x0635
            float r11 = r3.f5434e     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            float r11 = r7.getFloat(r8, r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5434e = r11     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x0635:
            int r10 = r10 + 1
            goto L_0x05fd
        L_0x0638:
            r7.recycle()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x063c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            int r3 = r18.getLineNumber()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.<init>(r11)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r10)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            java.lang.String r3 = r4.toString()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r1.<init>(r3)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            throw r1     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x0655:
            r6 = r18
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4 = 0
            androidx.constraintlayout.widget.j r4 = m4799C(r1, r3, r4)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            androidx.constraintlayout.widget.k r3 = r4.f5342e     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5382aj = r5     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x0665:
            r6 = r18
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4 = 0
            androidx.constraintlayout.widget.j r4 = m4799C(r1, r3, r4)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            androidx.constraintlayout.widget.k r3 = r4.f5342e     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5390b = r5     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r3.f5391c = r5     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x0677:
            r6 = r18
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            androidx.constraintlayout.widget.j r4 = m4799C(r1, r3, r5)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x0682:
            r6 = r18
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r4 = 0
            androidx.constraintlayout.widget.j r4 = m4799C(r1, r3, r4)     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            goto L_0x0695
        L_0x068e:
            r2 = r16
            r6 = r18
            r18.getName()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
        L_0x0695:
            int r3 = r18.next()     // Catch:{ XmlPullParserException -> 0x069e, IOException -> 0x069c }
            r2 = r3
            goto L_0x0007
        L_0x069c:
            r0 = move-exception
            goto L_0x06a6
        L_0x069e:
            r0 = move-exception
            goto L_0x06ae
        L_0x06a0:
            r2 = r16
            return
        L_0x06a3:
            r0 = move-exception
            r2 = r16
        L_0x06a6:
            r1 = r0
            r1.printStackTrace()
            return
        L_0x06ab:
            r0 = move-exception
            r2 = r16
        L_0x06ae:
            r1 = r0
            r1.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C1756o.mo4897q(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: t */
    public final void mo4898t(int i, float f) {
        mo4885e(i).f5342e.f5396h = f;
        mo4885e(i).f5342e.f5395g = -1;
        mo4885e(i).f5342e.f5394f = -1;
    }

    /* renamed from: u */
    public final void mo4899u(int i, float f) {
        mo4885e(i).f5342e.f5413y = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo4900v(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f5457f.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap hashMap = this.f5457f;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                String valueOf2 = String.valueOf(C1701a.m4619b(childAt));
                Log.w("ConstraintSet", valueOf2.length() != 0 ? "id unknown ".concat(valueOf2) : new String("id unknown "));
            } else if (this.f5456e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f5457f.containsKey(valueOf)) {
                    hashSet.remove(valueOf);
                    C1751j jVar = (C1751j) this.f5457f.get(valueOf);
                    if (jVar != null) {
                        if (childAt instanceof Barrier) {
                            jVar.f5342e.f5382aj = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            C1752k kVar = jVar.f5342e;
                            barrier.f5198a = kVar.f5380ah;
                            int i2 = kVar.f5381ai;
                            C1615a aVar = barrier.f5199b;
                            aVar.f4484c = i2;
                            aVar.f4483b = kVar.f5388ap;
                            int[] iArr = kVar.f5383ak;
                            if (iArr != null) {
                                barrier.mo4858n(iArr);
                            } else {
                                String str = kVar.f5384al;
                                if (str != null) {
                                    kVar.f5383ak = m4798B(barrier, str);
                                    barrier.mo4858n(jVar.f5342e.f5383ak);
                                }
                            }
                        }
                        C1745d dVar = (C1745d) childAt.getLayoutParams();
                        dVar.mo4863a();
                        jVar.mo4875c(dVar);
                        C1742a.m4756e(childAt, jVar.f5344g);
                        childAt.setLayoutParams(dVar);
                        C1754m mVar = jVar.f5340c;
                        if (mVar.f5432c == 0) {
                            childAt.setVisibility(mVar.f5431b);
                        }
                        childAt.setAlpha(jVar.f5340c.f5433d);
                        childAt.setRotation(jVar.f5343f.f5437c);
                        childAt.setRotationX(jVar.f5343f.f5438d);
                        childAt.setRotationY(jVar.f5343f.f5439e);
                        childAt.setScaleX(jVar.f5343f.f5440f);
                        childAt.setScaleY(jVar.f5343f.f5441g);
                        C1755n nVar = jVar.f5343f;
                        if (nVar.f5444j != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(jVar.f5343f.f5444j);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    int left2 = childAt.getLeft();
                                    int top2 = childAt.getTop();
                                    childAt.setPivotX(left - ((float) left2));
                                    childAt.setPivotY(top - ((float) top2));
                                }
                            }
                        } else {
                            if (!Float.isNaN(nVar.f5442h)) {
                                childAt.setPivotX(jVar.f5343f.f5442h);
                            }
                            if (!Float.isNaN(jVar.f5343f.f5443i)) {
                                childAt.setPivotY(jVar.f5343f.f5443i);
                            }
                        }
                        childAt.setTranslationX(jVar.f5343f.f5445k);
                        childAt.setTranslationY(jVar.f5343f.f5446l);
                        childAt.setTranslationZ(jVar.f5343f.f5447m);
                        C1755n nVar2 = jVar.f5343f;
                        if (nVar2.f5448n) {
                            childAt.setElevation(nVar2.f5449o);
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("WARNING NO CONSTRAINTS for view ");
                    sb.append(id);
                    Log.v("ConstraintSet", sb.toString());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1751j jVar2 = (C1751j) this.f5457f.get(num);
            if (jVar2 != null) {
                if (jVar2.f5342e.f5382aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C1752k kVar2 = jVar2.f5342e;
                    int[] iArr2 = kVar2.f5383ak;
                    if (iArr2 != null) {
                        barrier2.mo4858n(iArr2);
                    } else {
                        String str2 = kVar2.f5384al;
                        if (str2 != null) {
                            kVar2.f5383ak = m4798B(barrier2, str2);
                            barrier2.mo4858n(jVar2.f5342e.f5383ak);
                        }
                    }
                    C1752k kVar3 = jVar2.f5342e;
                    barrier2.f5198a = kVar3.f5380ah;
                    barrier2.f5199b.f4484c = kVar3.f5381ai;
                    C1745d J = ConstraintLayout.m4740J();
                    barrier2.mo4859o();
                    jVar2.mo4875c(J);
                    constraintLayout.addView(barrier2, J);
                }
                if (jVar2.f5342e.f5390b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C1745d J2 = ConstraintLayout.m4740J();
                    jVar2.mo4875c(J2);
                    constraintLayout.addView(guideline, J2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof C1743b) {
                ((C1743b) childAt2).mo4840k(constraintLayout);
            }
        }
    }

    /* renamed from: x */
    public final void mo4902x(int i) {
        mo4901w(i, 1, 2);
    }

    /* renamed from: y */
    public final void mo4903y(float f) {
        mo4885e(R.id.for_you_icon).f5340c.f5433d = f;
    }

    /* renamed from: z */
    public final void mo4904z(int i) {
        mo4885e(R.id.og_popover_top_guideline).f5342e.f5394f = i;
        mo4885e(R.id.og_popover_top_guideline).f5342e.f5395g = -1;
        mo4885e(R.id.og_popover_top_guideline).f5342e.f5396h = -1.0f;
    }

    /* renamed from: w */
    public final void mo4901w(int i, int i2, int i3) {
        if (i2 == 1 || i2 == 2) {
            int i4 = i;
            mo4892l(i4, 1, 0, i2, 0);
            mo4892l(i4, 2, 0, i3, 0);
            C1751j jVar = (C1751j) this.f5457f.get(Integer.valueOf(i));
            if (jVar != null) {
                jVar.f5342e.f5413y = 0.5f;
                return;
            }
            return;
        }
        int i5 = i;
        mo4892l(i5, 3, 0, 3, 0);
        mo4892l(i5, 4, 0, i3, 0);
        C1751j jVar2 = (C1751j) this.f5457f.get(Integer.valueOf(i));
        if (jVar2 != null) {
            jVar2.f5342e.f5414z = 0.5f;
        }
    }
}
