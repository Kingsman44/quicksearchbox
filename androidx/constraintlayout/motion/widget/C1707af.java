package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.p079a.p082b.C1615a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C1742a;
import androidx.constraintlayout.widget.C1743b;
import androidx.constraintlayout.widget.C1745d;
import androidx.constraintlayout.widget.C1751j;
import androidx.constraintlayout.widget.C1752k;
import androidx.constraintlayout.widget.C1753l;
import androidx.constraintlayout.widget.C1754m;
import androidx.constraintlayout.widget.C1755n;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.C1765x;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4535g.C59203do;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.af */
/* compiled from: PG */
public final class C1707af {

    /* renamed from: a */
    public final MotionLayout f4917a;

    /* renamed from: b */
    C1765x f4918b = null;

    /* renamed from: c */
    C1706ae f4919c = null;

    /* renamed from: d */
    public final ArrayList f4920d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f4921e = new ArrayList();

    /* renamed from: f */
    public final SparseArray f4922f;

    /* renamed from: g */
    public final SparseIntArray f4923g;

    /* renamed from: h */
    public int f4924h;

    /* renamed from: i */
    public int f4925i;

    /* renamed from: j */
    public MotionEvent f4926j;

    /* renamed from: k */
    public boolean f4927k;

    /* renamed from: l */
    public boolean f4928l;

    /* renamed from: m */
    public boolean f4929m;

    /* renamed from: n */
    final C1716ao f4930n;

    /* renamed from: o */
    float f4931o;

    /* renamed from: p */
    float f4932p;

    /* renamed from: q */
    public C1740y f4933q;

    /* renamed from: r */
    private C1706ae f4934r = null;

    /* renamed from: s */
    private final HashMap f4935s;

    public C1707af(Context context, MotionLayout motionLayout, int i) {
        SparseArray sparseArray = new SparseArray();
        this.f4922f = sparseArray;
        HashMap hashMap = new HashMap();
        this.f4935s = hashMap;
        this.f4923g = new SparseIntArray();
        this.f4924h = 400;
        this.f4925i = 0;
        this.f4927k = false;
        this.f4928l = false;
        this.f4917a = motionLayout;
        this.f4930n = new C1716ao(motionLayout);
        m4637p(context, i);
        sparseArray.put(R.id.motion_base, new C1756o());
        hashMap.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bb  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m4636o(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.o r0 = new androidx.constraintlayout.widget.o
            r0.<init>()
            r1 = 0
            r0.f5456e = r1
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0010:
            if (r4 >= r2) goto L_0x00e6
            java.lang.String r7 = r15.getAttributeName(r4)
            java.lang.String r8 = r15.getAttributeValue(r4)
            int r9 = r7.hashCode()
            r10 = -1496482599(0xffffffffa6cd7cd9, float:-1.4258573E-15)
            r11 = 2
            r12 = 1
            if (r9 == r10) goto L_0x0043
            r10 = -1153153640(0xffffffffbb444598, float:-0.0029948708)
            if (r9 == r10) goto L_0x0039
            r10 = 3355(0xd1b, float:4.701E-42)
            if (r9 == r10) goto L_0x002f
            goto L_0x004d
        L_0x002f:
            java.lang.String r9 = "id"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x004d
            r7 = 0
            goto L_0x004e
        L_0x0039:
            java.lang.String r9 = "constraintRotate"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x004d
            r7 = 2
            goto L_0x004e
        L_0x0043:
            java.lang.String r9 = "deriveConstraintsFrom"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x004d
            r7 = 1
            goto L_0x004e
        L_0x004d:
            r7 = -1
        L_0x004e:
            if (r7 == 0) goto L_0x00bb
            if (r7 == r12) goto L_0x00b6
            if (r7 == r11) goto L_0x0056
            goto L_0x00e2
        L_0x0056:
            int r7 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x005e }
            r0.f5455d = r7     // Catch:{ NumberFormatException -> 0x005e }
            goto L_0x00e2
        L_0x005e:
            int r7 = r8.hashCode()
            r9 = 4
            r10 = 3
            switch(r7) {
                case -768416914: goto L_0x0091;
                case 3317767: goto L_0x0087;
                case 3387192: goto L_0x007d;
                case 108511772: goto L_0x0073;
                case 1954540437: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x009b
        L_0x0069:
            java.lang.String r7 = "x_right"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x009b
            r7 = 3
            goto L_0x009c
        L_0x0073:
            java.lang.String r7 = "right"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x009b
            r7 = 1
            goto L_0x009c
        L_0x007d:
            java.lang.String r7 = "none"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x009b
            r7 = 0
            goto L_0x009c
        L_0x0087:
            java.lang.String r7 = "left"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x009b
            r7 = 2
            goto L_0x009c
        L_0x0091:
            java.lang.String r7 = "x_left"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x009b
            r7 = 4
            goto L_0x009c
        L_0x009b:
            r7 = -1
        L_0x009c:
            if (r7 == 0) goto L_0x00b3
            if (r7 == r12) goto L_0x00b0
            if (r7 == r11) goto L_0x00ad
            if (r7 == r10) goto L_0x00aa
            if (r7 == r9) goto L_0x00a7
            goto L_0x00e2
        L_0x00a7:
            r0.f5455d = r9
            goto L_0x00e2
        L_0x00aa:
            r0.f5455d = r10
            goto L_0x00e2
        L_0x00ad:
            r0.f5455d = r11
            goto L_0x00e2
        L_0x00b0:
            r0.f5455d = r12
            goto L_0x00e2
        L_0x00b3:
            r0.f5455d = r1
            goto L_0x00e2
        L_0x00b6:
            int r6 = m4638q(r14, r8)
            goto L_0x00e2
        L_0x00bb:
            int r5 = m4638q(r14, r8)
            java.util.HashMap r7 = r13.f4935s
            if (r8 != 0) goto L_0x00c6
            java.lang.String r8 = ""
            goto L_0x00d5
        L_0x00c6:
            r9 = 47
            int r9 = r8.indexOf(r9)
            if (r9 >= 0) goto L_0x00cf
            goto L_0x00d5
        L_0x00cf:
            int r9 = r9 + 1
            java.lang.String r8 = r8.substring(r9)
        L_0x00d5:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = androidx.constraintlayout.motion.widget.C1701a.m4620c(r14, r5)
            r0.f5453b = r7
        L_0x00e2:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x00e6:
            if (r5 == r3) goto L_0x00f7
            r0.mo4897q(r14, r15)
            if (r6 == r3) goto L_0x00f2
            android.util.SparseIntArray r14 = r13.f4923g
            r14.put(r5, r6)
        L_0x00f2:
            android.util.SparseArray r14 = r13.f4922f
            r14.put(r5, r0)
        L_0x00f7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1707af.m4636o(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r1.equals("OnSwipe") != false) goto L_0x0091;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4637p(android.content.Context r14, int r15) {
        /*
            r13 = this;
            android.content.res.Resources r0 = r14.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r15)
            int r1 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r2 = 0
            r3 = r2
        L_0x000e:
            r4 = 1
            if (r1 == r4) goto L_0x01b8
            if (r1 == 0) goto L_0x01af
            r5 = 2
            if (r1 == r5) goto L_0x0018
            goto L_0x01b2
        L_0x0018:
            java.lang.String r1 = r0.getName()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int r6 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r7 = 4
            r8 = 5
            java.lang.String r9 = "MotionScene"
            r10 = 8
            r11 = -1
            r12 = 0
            switch(r6) {
                case -1349929691: goto L_0x0086;
                case -1239391468: goto L_0x007b;
                case -687739768: goto L_0x0071;
                case 61998586: goto L_0x0066;
                case 269306229: goto L_0x005c;
                case 312750793: goto L_0x0052;
                case 327855227: goto L_0x0049;
                case 793277014: goto L_0x0041;
                case 1382829617: goto L_0x0037;
                case 1942574248: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0090
        L_0x002d:
            java.lang.String r5 = "include"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0037:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0041:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x0049:
            java.lang.String r6 = "OnSwipe"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0052:
            java.lang.String r5 = "OnClick"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0090
            r5 = 3
            goto L_0x0091
        L_0x005c:
            java.lang.String r5 = "Transition"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0066:
            java.lang.String r5 = "ViewTransition"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0090
            r5 = 9
            goto L_0x0091
        L_0x0071:
            java.lang.String r5 = "Include"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x007b:
            java.lang.String r5 = "KeyFrameSet"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0090
            r5 = 8
            goto L_0x0091
        L_0x0086:
            java.lang.String r5 = "ConstraintSet"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            switch(r5) {
                case 0: goto L_0x017c;
                case 1: goto L_0x0149;
                case 2: goto L_0x0104;
                case 3: goto L_0x00f6;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00e8;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00c2;
                case 8: goto L_0x00b4;
                case 9: goto L_0x0096;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x01b2
        L_0x0096:
            androidx.constraintlayout.motion.widget.am r1 = new androidx.constraintlayout.motion.widget.am     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.<init>(r14, r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            androidx.constraintlayout.motion.widget.ao r4 = r13.f4930n     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            java.util.ArrayList r5 = r4.f5008b     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r5.add(r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r4.f5009c = r2     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int r4 = r1.f4987b     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r4 != r7) goto L_0x00ad
            androidx.constraintlayout.motion.widget.C1716ao.m4662a(r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x00ad:
            if (r4 != r8) goto L_0x01b2
            androidx.constraintlayout.motion.widget.C1716ao.m4662a(r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x00b4:
            androidx.constraintlayout.motion.widget.h r1 = new androidx.constraintlayout.motion.widget.h     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.<init>(r14, r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r3 == 0) goto L_0x01b2
            java.util.ArrayList r4 = r3.f4909k     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r4.add(r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x00c2:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int[] r4 = androidx.constraintlayout.widget.C1761t.f5481w     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r1, r4)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int r4 = r1.getIndexCount()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r5 = 0
        L_0x00d1:
            if (r5 >= r4) goto L_0x00e3
            int r6 = r1.getIndex(r5)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r6 != 0) goto L_0x00e0
            int r6 = r1.getResourceId(r12, r11)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r13.mo4768g(r14, r6)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00e3:
            r1.recycle()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x00e8:
            r13.m4636o(r14, r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x00ed:
            androidx.constraintlayout.widget.x r1 = new androidx.constraintlayout.widget.x     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.<init>(r14, r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r13.f4918b = r1     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x00f6:
            if (r3 == 0) goto L_0x01b2
            java.util.ArrayList r1 = r3.f4911m     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            androidx.constraintlayout.motion.widget.ad r4 = new androidx.constraintlayout.motion.widget.ad     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r4.<init>(r14, r3, r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.add(r4)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x0104:
            if (r3 != 0) goto L_0x013d
            android.content.res.Resources r1 = r14.getResources()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            java.lang.String r1 = r1.getResourceEntryName(r15)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int r4 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int r5 = r5.length()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int r5 = r5 + 27
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r6.<init>(r5)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            java.lang.String r5 = " OnSwipe ("
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r6.append(r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            java.lang.String r1 = ".xml:"
            r6.append(r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r6.append(r4)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            java.lang.String r1 = ")"
            r6.append(r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            java.lang.String r1 = r6.toString()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            android.util.Log.v(r9, r1)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
        L_0x013d:
            if (r3 == 0) goto L_0x01b2
            androidx.constraintlayout.motion.widget.ai r1 = new androidx.constraintlayout.motion.widget.ai     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r13.f4917a     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.<init>(r14, r4, r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r3.f4910l = r1     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x0149:
            java.util.ArrayList r1 = r13.f4920d     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            androidx.constraintlayout.motion.widget.ae r3 = new androidx.constraintlayout.motion.widget.ae     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r3.<init>(r13, r14, r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.add(r3)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            androidx.constraintlayout.motion.widget.ae r1 = r13.f4919c     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r1 != 0) goto L_0x0166
            boolean r1 = r3.f4900b     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r1 != 0) goto L_0x0166
            r13.f4919c = r3     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            androidx.constraintlayout.motion.widget.ai r1 = r3.f4910l     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r1 == 0) goto L_0x0166
            boolean r4 = r13.f4929m     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.mo4780c(r4)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
        L_0x0166:
            boolean r1 = r3.f4900b     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r1 == 0) goto L_0x01b2
            int r1 = r3.f4901c     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r1 != r11) goto L_0x0171
            r13.f4934r = r3     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x0176
        L_0x0171:
            java.util.ArrayList r1 = r13.f4921e     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.add(r3)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
        L_0x0176:
            java.util.ArrayList r1 = r13.f4920d     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r1.remove(r3)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x017c:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int[] r5 = androidx.constraintlayout.widget.C1761t.f5471m     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r1, r5)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int r5 = r1.getIndexCount()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r6 = 0
        L_0x018b:
            if (r6 >= r5) goto L_0x01ab
            int r7 = r1.getIndex(r6)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r7 != 0) goto L_0x01a0
            int r7 = r13.f4924h     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            int r7 = r1.getInt(r12, r7)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r13.f4924h = r7     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            if (r7 >= r10) goto L_0x01a8
            r13.f4924h = r10     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01a8
        L_0x01a0:
            if (r7 != r4) goto L_0x01a8
            int r7 = r1.getInteger(r4, r12)     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            r13.f4925i = r7     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
        L_0x01a8:
            int r6 = r6 + 1
            goto L_0x018b
        L_0x01ab:
            r1.recycle()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x01b2
        L_0x01af:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
        L_0x01b2:
            int r1 = r0.next()     // Catch:{ XmlPullParserException -> 0x01be, IOException -> 0x01b9 }
            goto L_0x000e
        L_0x01b8:
            return
        L_0x01b9:
            r14 = move-exception
            r14.printStackTrace()
            return
        L_0x01be:
            r14 = move-exception
            r14.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1707af.m4637p(android.content.Context, int):void");
    }

    /* renamed from: q */
    private static final int m4638q(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str != null && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo4762a() {
        C1710ai aiVar;
        C1706ae aeVar = this.f4919c;
        if (aeVar == null || (aiVar = aeVar.f4910l) == null) {
            return 0.0f;
        }
        return aiVar.f4962s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo4763b() {
        C1710ai aiVar;
        C1706ae aeVar = this.f4919c;
        if (aeVar == null || (aiVar = aeVar.f4910l) == null) {
            return 0.0f;
        }
        return aiVar.f4961r;
    }

    /* renamed from: c */
    public final float mo4764c() {
        C1706ae aeVar = this.f4919c;
        if (aeVar != null) {
            return aeVar.f4907i;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final int mo4765d() {
        C1706ae aeVar = this.f4919c;
        return aeVar != null ? aeVar.f4906h : this.f4924h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo4766e() {
        C1706ae aeVar = this.f4919c;
        if (aeVar == null) {
            return -1;
        }
        return aeVar.f4901c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo4767f() {
        C1706ae aeVar = this.f4919c;
        if (aeVar == null) {
            return -1;
        }
        return aeVar.f4902d;
    }

    /* renamed from: g */
    public final int mo4768g(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (eventType == 2 && "ConstraintSet".equals(name)) {
                    return m4636o(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: h */
    public final void mo4769h(C1733r rVar) {
        C1706ae aeVar = this.f4919c;
        int i = 0;
        if (aeVar == null) {
            C1706ae aeVar2 = this.f4934r;
            if (aeVar2 != null) {
                ArrayList arrayList = aeVar2.f4909k;
                int size = arrayList.size();
                while (i < size) {
                    ((C1723h) arrayList.get(i)).mo4798a(rVar);
                    i++;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = aeVar.f4909k;
        int size2 = arrayList2.size();
        while (i < size2) {
            ((C1723h) arrayList2.get(i)).mo4798a(rVar);
            i++;
        }
    }

    /* renamed from: i */
    public final void mo4770i(int i, MotionLayout motionLayout) {
        C1756o oVar = (C1756o) this.f4922f.get(i);
        oVar.f5454c = oVar.f5453b;
        int i2 = this.f4923g.get(i);
        if (i2 > 0) {
            mo4770i(i2, motionLayout);
            C1756o oVar2 = (C1756o) this.f4922f.get(i2);
            if (oVar2 == null) {
                String valueOf = String.valueOf(C1701a.m4620c(this.f4917a.getContext(), i2));
                Log.e("MotionScene", valueOf.length() != 0 ? "ERROR! invalid deriveConstraintsFrom: @id/".concat(valueOf) : new String("ERROR! invalid deriveConstraintsFrom: @id/"));
                return;
            }
            String valueOf2 = String.valueOf(oVar.f5454c);
            String str = oVar2.f5454c;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf2);
            sb.append("/");
            sb.append(str);
            oVar.f5454c = sb.toString();
            for (Integer num : oVar2.f5457f.keySet()) {
                int intValue = num.intValue();
                C1751j jVar = (C1751j) oVar2.f5457f.get(num);
                HashMap hashMap = oVar.f5457f;
                Integer valueOf3 = Integer.valueOf(intValue);
                if (!hashMap.containsKey(valueOf3)) {
                    oVar.f5457f.put(valueOf3, new C1751j());
                }
                C1751j jVar2 = (C1751j) oVar.f5457f.get(valueOf3);
                if (jVar2 != null) {
                    C1752k kVar = jVar2.f5342e;
                    if (!kVar.f5391c) {
                        kVar.mo4878a(jVar.f5342e);
                    }
                    C1754m mVar = jVar2.f5340c;
                    if (!mVar.f5430a) {
                        mVar.mo4880a(jVar.f5340c);
                    }
                    C1755n nVar = jVar2.f5343f;
                    if (!nVar.f5436b) {
                        nVar.mo4881a(jVar.f5343f);
                    }
                    C1753l lVar = jVar2.f5341d;
                    if (!lVar.f5416b) {
                        lVar.mo4879a(jVar.f5341d);
                    }
                    for (String str2 : jVar.f5344g.keySet()) {
                        if (!jVar2.f5344g.containsKey(str2)) {
                            jVar2.f5344g.put(str2, (C1742a) jVar.f5344g.get(str2));
                        }
                    }
                }
            }
        } else {
            oVar.f5454c = String.valueOf(oVar.f5454c).concat("  layout");
            int childCount = motionLayout.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = motionLayout.getChildAt(i3);
                C1745d dVar = (C1745d) childAt.getLayoutParams();
                int id = childAt.getId();
                if (!oVar.f5456e || id != -1) {
                    HashMap hashMap2 = oVar.f5457f;
                    Integer valueOf4 = Integer.valueOf(id);
                    if (!hashMap2.containsKey(valueOf4)) {
                        oVar.f5457f.put(valueOf4, new C1751j());
                    }
                    C1751j jVar3 = (C1751j) oVar.f5457f.get(valueOf4);
                    if (jVar3 != null) {
                        if (!jVar3.f5342e.f5391c) {
                            jVar3.mo4877d(id, dVar);
                            if (childAt instanceof C1743b) {
                                jVar3.f5342e.f5383ak = ((C1743b) childAt).mo4861p();
                                if (childAt instanceof Barrier) {
                                    Barrier barrier = (Barrier) childAt;
                                    C1752k kVar2 = jVar3.f5342e;
                                    C1615a aVar = barrier.f5199b;
                                    kVar2.f5388ap = aVar.f4483b;
                                    kVar2.f5380ah = barrier.f5198a;
                                    kVar2.f5381ai = aVar.f4484c;
                                }
                            }
                            jVar3.f5342e.f5391c = true;
                        }
                        C1754m mVar2 = jVar3.f5340c;
                        if (!mVar2.f5430a) {
                            mVar2.f5431b = childAt.getVisibility();
                            jVar3.f5340c.f5433d = childAt.getAlpha();
                            jVar3.f5340c.f5430a = true;
                        }
                        C1755n nVar2 = jVar3.f5343f;
                        if (!nVar2.f5436b) {
                            nVar2.f5436b = true;
                            nVar2.f5437c = childAt.getRotation();
                            jVar3.f5343f.f5438d = childAt.getRotationX();
                            jVar3.f5343f.f5439e = childAt.getRotationY();
                            jVar3.f5343f.f5440f = childAt.getScaleX();
                            jVar3.f5343f.f5441g = childAt.getScaleY();
                            float pivotX = childAt.getPivotX();
                            float pivotY = childAt.getPivotY();
                            if (!(((double) pivotX) == C59203do.f157270a && ((double) pivotY) == C59203do.f157270a)) {
                                C1755n nVar3 = jVar3.f5343f;
                                nVar3.f5442h = pivotX;
                                nVar3.f5443i = pivotY;
                            }
                            jVar3.f5343f.f5445k = childAt.getTranslationX();
                            jVar3.f5343f.f5446l = childAt.getTranslationY();
                            jVar3.f5343f.f5447m = childAt.getTranslationZ();
                            C1755n nVar4 = jVar3.f5343f;
                            if (nVar4.f5448n) {
                                nVar4.f5449o = childAt.getElevation();
                            }
                        }
                    }
                    i3++;
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
        }
        for (C1751j jVar4 : oVar.f5457f.values()) {
            if (jVar4.f5345h != null) {
                if (jVar4.f5339b != null) {
                    for (Integer intValue2 : oVar.f5457f.keySet()) {
                        C1751j f = oVar.mo4886f(intValue2.intValue());
                        String str3 = f.f5342e.f5385am;
                        if (str3 != null && jVar4.f5339b.matches(str3)) {
                            jVar4.f5345h.mo4872e(f);
                            f.f5344g.putAll((HashMap) jVar4.f5344g.clone());
                        }
                    }
                } else {
                    jVar4.f5345h.mo4872e(oVar.mo4886f(jVar4.f5338a));
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo4771j(C1706ae aeVar) {
        C1710ai aiVar;
        this.f4919c = aeVar;
        if (aeVar != null && (aiVar = aeVar.f4910l) != null) {
            aiVar.mo4780c(this.f4929m);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r2 == -1) goto L_0x0016;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4772k(int r11, int r12) {
        /*
            r10 = this;
            androidx.constraintlayout.widget.x r0 = r10.f4918b
            r1 = -1
            if (r0 == 0) goto L_0x0015
            int r0 = r0.mo4911a(r11)
            if (r0 != r1) goto L_0x000c
            r0 = r11
        L_0x000c:
            androidx.constraintlayout.widget.x r2 = r10.f4918b
            int r2 = r2.mo4911a(r12)
            if (r2 != r1) goto L_0x0017
            goto L_0x0016
        L_0x0015:
            r0 = r11
        L_0x0016:
            r2 = r12
        L_0x0017:
            androidx.constraintlayout.motion.widget.ae r3 = r10.f4919c
            if (r3 == 0) goto L_0x0025
            int r4 = r3.f4901c
            if (r4 != r12) goto L_0x0025
            int r3 = r3.f4902d
            if (r3 == r11) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            return
        L_0x0025:
            java.util.ArrayList r3 = r10.f4920d
            int r4 = r3.size()
            r5 = 0
            r6 = 0
        L_0x002d:
            if (r6 >= r4) goto L_0x0054
            java.lang.Object r7 = r3.get(r6)
            androidx.constraintlayout.motion.widget.ae r7 = (androidx.constraintlayout.motion.widget.C1706ae) r7
            int r8 = r7.f4901c
            if (r8 != r2) goto L_0x003d
            int r9 = r7.f4902d
            if (r9 == r0) goto L_0x0043
        L_0x003d:
            if (r8 != r12) goto L_0x0051
            int r8 = r7.f4902d
            if (r8 != r11) goto L_0x0051
        L_0x0043:
            r10.f4919c = r7
            if (r7 == 0) goto L_0x0050
            androidx.constraintlayout.motion.widget.ai r11 = r7.f4910l
            if (r11 == 0) goto L_0x0050
            boolean r12 = r10.f4929m
            r11.mo4780c(r12)
        L_0x0050:
            return
        L_0x0051:
            int r6 = r6 + 1
            goto L_0x002d
        L_0x0054:
            androidx.constraintlayout.motion.widget.ae r11 = r10.f4934r
            java.util.ArrayList r3 = r10.f4921e
            int r4 = r3.size()
        L_0x005c:
            if (r5 >= r4) goto L_0x006c
            java.lang.Object r6 = r3.get(r5)
            androidx.constraintlayout.motion.widget.ae r6 = (androidx.constraintlayout.motion.widget.C1706ae) r6
            int r7 = r6.f4901c
            if (r7 != r12) goto L_0x0069
            r11 = r6
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x005c
        L_0x006c:
            androidx.constraintlayout.motion.widget.ae r12 = new androidx.constraintlayout.motion.widget.ae
            r12.<init>((androidx.constraintlayout.motion.widget.C1707af) r10, (androidx.constraintlayout.motion.widget.C1706ae) r11)
            r12.f4902d = r0
            r12.f4901c = r2
            if (r0 == r1) goto L_0x007c
            java.util.ArrayList r11 = r10.f4920d
            r11.add(r12)
        L_0x007c:
            r10.f4919c = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1707af.mo4772k(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo4773l(MotionLayout motionLayout, int i) {
        C1706ae aeVar;
        int i2;
        int i3;
        if (this.f4933q == null) {
            ArrayList arrayList = this.f4920d;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1706ae aeVar2 = (C1706ae) arrayList.get(i4);
                if (aeVar2.f4912n != 0 && ((aeVar = this.f4919c) != aeVar2 || !aeVar.mo4761b(2))) {
                    if (i == aeVar2.f4902d && ((i3 = aeVar2.f4912n) == 4 || i3 == 2)) {
                        motionLayout.mo4713B(4);
                        motionLayout.mo4740u(aeVar2);
                        if (aeVar2.f4912n == 4) {
                            motionLayout.mo4743x();
                            motionLayout.mo4713B(2);
                            motionLayout.mo4713B(3);
                        } else {
                            motionLayout.mo4735q(1.0f);
                            motionLayout.mo4720k(true);
                            motionLayout.mo4713B(2);
                            motionLayout.mo4713B(3);
                            motionLayout.mo4713B(4);
                            motionLayout.mo4723n();
                        }
                        return true;
                    } else if (i == aeVar2.f4901c && ((i2 = aeVar2.f4912n) == 3 || i2 == 1)) {
                        motionLayout.mo4713B(4);
                        motionLayout.mo4740u(aeVar2);
                        if (aeVar2.f4912n == 3) {
                            motionLayout.mo4718i(0.0f);
                            motionLayout.mo4713B(2);
                            motionLayout.mo4713B(3);
                        } else {
                            motionLayout.mo4735q(0.0f);
                            motionLayout.mo4720k(true);
                            motionLayout.mo4713B(2);
                            motionLayout.mo4713B(3);
                            motionLayout.mo4713B(4);
                            motionLayout.mo4723n();
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo4774m() {
        ArrayList arrayList = this.f4920d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((C1706ae) arrayList.get(i)).f4910l != null) {
                return true;
            }
            i = i2;
        }
        C1706ae aeVar = this.f4919c;
        return (aeVar == null || aeVar.f4910l == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final C1756o mo4775n(int i) {
        int a;
        C1765x xVar = this.f4918b;
        if (!(xVar == null || (a = xVar.mo4911a(i)) == -1)) {
            i = a;
        }
        if (this.f4922f.get(i) != null) {
            return (C1756o) this.f4922f.get(i);
        }
        String c = C1701a.m4620c(this.f4917a.getContext(), i);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 55);
        sb.append("Warning could not find ConstraintSet id/");
        sb.append(c);
        sb.append(" In MotionScene");
        Log.e("MotionScene", sb.toString());
        SparseArray sparseArray = this.f4922f;
        return (C1756o) sparseArray.get(sparseArray.keyAt(0));
    }
}
