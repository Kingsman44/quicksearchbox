package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.constraint.c */
/* compiled from: PG */
public final class C0146c {

    /* renamed from: a */
    private static final int[] f596a = {0, 4, 8};

    /* renamed from: b */
    private static final SparseIntArray f597b;

    /* renamed from: c */
    private final HashMap f598c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f597b = sparseIntArray;
        int[] iArr = C0147d.f599a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(103, 6);
        sparseIntArray.append(104, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(111, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(106, 11);
        sparseIntArray.append(110, 15);
        sparseIntArray.append(107, 12);
        sparseIntArray.append(98, 40);
        sparseIntArray.append(83, 39);
        sparseIntArray.append(82, 41);
        sparseIntArray.append(97, 42);
        sparseIntArray.append(81, 20);
        sparseIntArray.append(96, 37);
        sparseIntArray.append(71, 5);
        sparseIntArray.append(84, 60);
        sparseIntArray.append(93, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(65, 60);
        sparseIntArray.append(61, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(99, 54);
        sparseIntArray.append(77, 55);
        sparseIntArray.append(100, 56);
        sparseIntArray.append(78, 57);
        sparseIntArray.append(101, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    /* renamed from: h */
    private static int m234h(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: i */
    private static final String m235i(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "end" : "start" : "baseline" : "bottom" : "top" : "right";
    }

    /* renamed from: a */
    public final C0145b mo189a(int i) {
        HashMap hashMap = this.f598c;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.f598c.put(valueOf, new C0145b());
        }
        return (C0145b) this.f598c.get(valueOf);
    }

    /* renamed from: b */
    public final void mo190b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f598c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap hashMap = this.f598c;
            Integer valueOf = Integer.valueOf(id);
            if (hashMap.containsKey(valueOf)) {
                hashSet.remove(valueOf);
                C0145b bVar = (C0145b) this.f598c.get(valueOf);
                C0129a aVar = (C0129a) childAt.getLayoutParams();
                bVar.mo187a(aVar);
                childAt.setLayoutParams(aVar);
                childAt.setVisibility(bVar.f541G);
                childAt.setAlpha(bVar.f552R);
                childAt.setRotationX(bVar.f555U);
                childAt.setRotationY(bVar.f556V);
                childAt.setScaleX(bVar.f557W);
                childAt.setScaleY(bVar.f558X);
                childAt.setPivotX(bVar.f559Y);
                childAt.setPivotY(bVar.f560Z);
                childAt.setTranslationX(bVar.f562aa);
                childAt.setTranslationY(bVar.f563ab);
                childAt.setTranslationZ(bVar.f564ac);
                if (bVar.f553S) {
                    childAt.setElevation(bVar.f554T);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0145b bVar2 = (C0145b) this.f598c.get(num);
            if (bVar2.f561a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C0129a a = ConstraintLayout.m139a();
                bVar2.mo187a(a);
                constraintLayout.addView(guideline, a);
            }
        }
    }

    /* renamed from: c */
    public final void mo191c(int i, int i2) {
        HashMap hashMap = this.f598c;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            C0145b bVar = (C0145b) this.f598c.get(valueOf);
            if (i2 == 2) {
                bVar.f580k = -1;
                bVar.f579j = -1;
                bVar.f536B = -1;
                bVar.f544J = -1;
            } else if (i2 == 3) {
                bVar.f582m = -1;
                bVar.f581l = -1;
                bVar.f537C = -1;
                bVar.f543I = -1;
            } else if (i2 == 4) {
                bVar.f583n = -1;
                bVar.f584o = -1;
                bVar.f538D = -1;
                bVar.f545K = -1;
            } else if (i2 == 5) {
                bVar.f585p = -1;
            } else if (i2 != 6) {
                bVar.f588s = -1;
                bVar.f589t = -1;
                bVar.f539E = -1;
                bVar.f546L = -1;
            } else {
                bVar.f586q = -1;
                bVar.f587r = -1;
                bVar.f540F = -1;
                bVar.f547M = -1;
            }
        }
    }

    /* renamed from: d */
    public final void mo192d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f598c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            C0129a aVar = (C0129a) childAt.getLayoutParams();
            int id = childAt.getId();
            HashMap hashMap = this.f598c;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                this.f598c.put(valueOf, new C0145b());
            }
            C0145b bVar = (C0145b) this.f598c.get(valueOf);
            bVar.f573d = id;
            bVar.f577h = aVar.f371d;
            bVar.f578i = aVar.f372e;
            bVar.f579j = aVar.f373f;
            bVar.f580k = aVar.f374g;
            bVar.f581l = aVar.f375h;
            bVar.f582m = aVar.f376i;
            bVar.f583n = aVar.f377j;
            bVar.f584o = aVar.f378k;
            bVar.f585p = aVar.f379l;
            bVar.f586q = aVar.f380m;
            bVar.f587r = aVar.f381n;
            bVar.f588s = aVar.f382o;
            bVar.f589t = aVar.f383p;
            bVar.f590u = aVar.f390w;
            bVar.f591v = aVar.f391x;
            bVar.f592w = aVar.f392y;
            bVar.f593x = aVar.f353K;
            bVar.f594y = aVar.f354L;
            bVar.f595z = aVar.f355M;
            bVar.f576g = aVar.f370c;
            bVar.f574e = aVar.f368a;
            bVar.f575f = aVar.f369b;
            bVar.f571b = aVar.width;
            bVar.f572c = aVar.height;
            bVar.f535A = aVar.leftMargin;
            bVar.f536B = aVar.rightMargin;
            bVar.f537C = aVar.topMargin;
            bVar.f538D = aVar.bottomMargin;
            bVar.f548N = aVar.f344B;
            bVar.f549O = aVar.f343A;
            bVar.f551Q = aVar.f346D;
            bVar.f550P = aVar.f345C;
            bVar.f565ad = aVar.f347E;
            bVar.f566ae = aVar.f348F;
            bVar.f567af = aVar.f351I;
            bVar.f568ag = aVar.f352J;
            bVar.f569ah = aVar.f349G;
            bVar.f570ai = aVar.f350H;
            bVar.f539E = aVar.getMarginEnd();
            bVar.f540F = aVar.getMarginStart();
            bVar.f541G = childAt.getVisibility();
            bVar.f552R = childAt.getAlpha();
            bVar.f555U = childAt.getRotationX();
            bVar.f556V = childAt.getRotationY();
            bVar.f557W = childAt.getScaleX();
            bVar.f558X = childAt.getScaleY();
            bVar.f559Y = childAt.getPivotX();
            bVar.f560Z = childAt.getPivotY();
            bVar.f562aa = childAt.getTranslationX();
            bVar.f563ab = childAt.getTranslationY();
            bVar.f564ac = childAt.getTranslationZ();
            if (bVar.f553S) {
                bVar.f554T = childAt.getElevation();
            }
        }
    }

    /* renamed from: e */
    public final void mo193e(int i, int i2, int i3, int i4) {
        HashMap hashMap = this.f598c;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.f598c.put(valueOf, new C0145b());
        }
        C0145b bVar = (C0145b) this.f598c.get(valueOf);
        switch (i2) {
            case 1:
                if (i4 == 2) {
                    bVar.f578i = i3;
                    bVar.f577h = -1;
                    return;
                }
                throw new IllegalArgumentException("left to " + m235i(i4) + " undefined");
            case 2:
                if (i4 == 2) {
                    bVar.f580k = i3;
                    bVar.f579j = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m235i(i4) + " undefined");
            case 3:
                if (i4 == 3) {
                    bVar.f581l = i3;
                    bVar.f582m = -1;
                    bVar.f585p = -1;
                    return;
                } else if (i4 == 4) {
                    bVar.f582m = i3;
                    bVar.f581l = -1;
                    bVar.f585p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m235i(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    bVar.f584o = i3;
                    bVar.f583n = -1;
                    bVar.f585p = -1;
                    return;
                } else if (i4 == 3) {
                    bVar.f583n = i3;
                    bVar.f584o = -1;
                    bVar.f585p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m235i(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    bVar.f585p = i3;
                    bVar.f584o = -1;
                    bVar.f583n = -1;
                    bVar.f581l = -1;
                    bVar.f582m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m235i(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    bVar.f587r = i3;
                    bVar.f586q = -1;
                    return;
                } else if (i4 == 7) {
                    bVar.f586q = i3;
                    bVar.f587r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m235i(i4) + " undefined");
                }
            default:
                if (i4 == 7) {
                    bVar.f589t = i3;
                    bVar.f588s = -1;
                    return;
                } else if (i4 == 6) {
                    bVar.f588s = i3;
                    bVar.f589t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m235i(i4) + " undefined");
                }
        }
    }

    /* renamed from: f */
    public final void mo194f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    C0145b bVar = new C0145b();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, C0147d.f600b);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        SparseIntArray sparseIntArray = f597b;
                        int i3 = sparseIntArray.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    bVar.f585p = m234h(obtainStyledAttributes, index, bVar.f585p);
                                    break;
                                case 2:
                                    bVar.f538D = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f538D);
                                    break;
                                case 3:
                                    bVar.f584o = m234h(obtainStyledAttributes, index, bVar.f584o);
                                    break;
                                case 4:
                                    bVar.f583n = m234h(obtainStyledAttributes, index, bVar.f583n);
                                    break;
                                case 5:
                                    bVar.f592w = obtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    bVar.f593x = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f593x);
                                    break;
                                case 7:
                                    bVar.f594y = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f594y);
                                    break;
                                case 8:
                                    bVar.f539E = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f539E);
                                    break;
                                case 9:
                                    bVar.f583n = m234h(obtainStyledAttributes, index, bVar.f589t);
                                    break;
                                case 10:
                                    bVar.f588s = m234h(obtainStyledAttributes, index, bVar.f588s);
                                    break;
                                case 11:
                                    bVar.f545K = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f545K);
                                    break;
                                case 12:
                                    bVar.f546L = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f546L);
                                    break;
                                case 13:
                                    bVar.f542H = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f542H);
                                    break;
                                case 14:
                                    bVar.f544J = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f544J);
                                    break;
                                case 15:
                                    bVar.f547M = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f547M);
                                    break;
                                case 16:
                                    bVar.f543I = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f543I);
                                    break;
                                case 17:
                                    bVar.f574e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f574e);
                                    break;
                                case 18:
                                    bVar.f575f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f575f);
                                    break;
                                case 19:
                                    bVar.f576g = obtainStyledAttributes.getFloat(index, bVar.f576g);
                                    break;
                                case 20:
                                    bVar.f590u = obtainStyledAttributes.getFloat(index, bVar.f590u);
                                    break;
                                case 21:
                                    bVar.f572c = obtainStyledAttributes.getLayoutDimension(index, bVar.f572c);
                                    break;
                                case 22:
                                    int i4 = obtainStyledAttributes.getInt(index, bVar.f541G);
                                    bVar.f541G = i4;
                                    bVar.f541G = f596a[i4];
                                    break;
                                case 23:
                                    bVar.f571b = obtainStyledAttributes.getLayoutDimension(index, bVar.f571b);
                                    break;
                                case 24:
                                    bVar.f535A = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f535A);
                                    break;
                                case 25:
                                    bVar.f577h = m234h(obtainStyledAttributes, index, bVar.f577h);
                                    break;
                                case 26:
                                    bVar.f578i = m234h(obtainStyledAttributes, index, bVar.f578i);
                                    break;
                                case 27:
                                    bVar.f595z = obtainStyledAttributes.getInt(index, bVar.f595z);
                                    break;
                                case 28:
                                    bVar.f536B = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f536B);
                                    break;
                                case 29:
                                    bVar.f579j = m234h(obtainStyledAttributes, index, bVar.f579j);
                                    break;
                                case 30:
                                    bVar.f580k = m234h(obtainStyledAttributes, index, bVar.f580k);
                                    break;
                                case 31:
                                    bVar.f540F = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f540F);
                                    break;
                                case 32:
                                    bVar.f586q = m234h(obtainStyledAttributes, index, bVar.f586q);
                                    break;
                                case 33:
                                    bVar.f587r = m234h(obtainStyledAttributes, index, bVar.f587r);
                                    break;
                                case 34:
                                    bVar.f537C = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f537C);
                                    break;
                                case 35:
                                    bVar.f582m = m234h(obtainStyledAttributes, index, bVar.f582m);
                                    break;
                                case 36:
                                    bVar.f581l = m234h(obtainStyledAttributes, index, bVar.f581l);
                                    break;
                                case 37:
                                    bVar.f591v = obtainStyledAttributes.getFloat(index, bVar.f591v);
                                    break;
                                case 38:
                                    bVar.f573d = obtainStyledAttributes.getResourceId(index, bVar.f573d);
                                    break;
                                case 39:
                                    bVar.f549O = obtainStyledAttributes.getFloat(index, bVar.f549O);
                                    break;
                                case 40:
                                    bVar.f548N = obtainStyledAttributes.getFloat(index, bVar.f548N);
                                    break;
                                case 41:
                                    bVar.f550P = obtainStyledAttributes.getInt(index, bVar.f550P);
                                    break;
                                case 42:
                                    bVar.f551Q = obtainStyledAttributes.getInt(index, bVar.f551Q);
                                    break;
                                case 43:
                                    bVar.f552R = obtainStyledAttributes.getFloat(index, bVar.f552R);
                                    break;
                                case 44:
                                    bVar.f553S = true;
                                    bVar.f554T = obtainStyledAttributes.getFloat(index, bVar.f554T);
                                    break;
                                case 45:
                                    bVar.f555U = obtainStyledAttributes.getFloat(index, bVar.f555U);
                                    break;
                                case 46:
                                    bVar.f556V = obtainStyledAttributes.getFloat(index, bVar.f556V);
                                    break;
                                case 47:
                                    bVar.f557W = obtainStyledAttributes.getFloat(index, bVar.f557W);
                                    break;
                                case 48:
                                    bVar.f558X = obtainStyledAttributes.getFloat(index, bVar.f558X);
                                    break;
                                case 49:
                                    bVar.f559Y = obtainStyledAttributes.getFloat(index, bVar.f559Y);
                                    break;
                                case 50:
                                    bVar.f560Z = obtainStyledAttributes.getFloat(index, bVar.f560Z);
                                    break;
                                case 51:
                                    bVar.f562aa = obtainStyledAttributes.getFloat(index, bVar.f562aa);
                                    break;
                                case 52:
                                    bVar.f563ab = obtainStyledAttributes.getFloat(index, bVar.f563ab);
                                    break;
                                case 53:
                                    bVar.f564ac = obtainStyledAttributes.getFloat(index, bVar.f564ac);
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        } else {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        }
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        bVar.f561a = true;
                    }
                    this.f598c.put(Integer.valueOf(bVar.f573d), bVar);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void mo195g(int i) {
        mo189a(i).f590u = 1.0f;
    }
}
