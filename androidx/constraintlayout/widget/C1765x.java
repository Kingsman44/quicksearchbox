package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.SparseArray;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.x */
/* compiled from: PG */
public final class C1765x {

    /* renamed from: a */
    int f5491a = -1;

    /* renamed from: b */
    public final SparseArray f5492b = new SparseArray();

    public C1765x(Context context, XmlPullParser xmlPullParser) {
        new SparseArray();
        m4830b(context, xmlPullParser);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r0.equals("StateSet") != false) goto L_0x0078;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4830b(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = androidx.constraintlayout.widget.C1761t.f5476r
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = 0
        L_0x0010:
            if (r3 >= r1) goto L_0x0023
            int r4 = r0.getIndex(r3)
            if (r4 != 0) goto L_0x0020
            int r4 = r8.f5491a
            int r4 = r0.getResourceId(r2, r4)
            r8.f5491a = r4
        L_0x0020:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0023:
            r0.recycle()
            int r0 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            r1 = 0
        L_0x002b:
            r3 = 1
            if (r0 == r3) goto L_0x00a0
            if (r0 == 0) goto L_0x0098
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0046
            if (r0 == r5) goto L_0x003a
            goto L_0x009b
        L_0x003a:
            java.lang.String r0 = r10.getName()     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            boolean r0 = r4.equals(r0)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            if (r0 != 0) goto L_0x0045
            goto L_0x009b
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r0 = r10.getName()     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            int r7 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            switch(r7) {
                case 80204913: goto L_0x006d;
                case 1301459538: goto L_0x0063;
                case 1382829617: goto L_0x005c;
                case 1901439077: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0077
        L_0x0052:
            java.lang.String r3 = "Variant"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0077
            r3 = 3
            goto L_0x0078
        L_0x005c:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0063:
            java.lang.String r3 = "LayoutDescription"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0077
            r3 = 0
            goto L_0x0078
        L_0x006d:
            java.lang.String r3 = "State"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0077
            r3 = 2
            goto L_0x0078
        L_0x0077:
            r3 = -1
        L_0x0078:
            if (r3 == r6) goto L_0x008a
            if (r3 == r5) goto L_0x007d
            goto L_0x009b
        L_0x007d:
            androidx.constraintlayout.widget.w r0 = new androidx.constraintlayout.widget.w     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            if (r1 == 0) goto L_0x009b
            java.util.ArrayList r3 = r1.f5484b     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            r3.add(r0)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            goto L_0x009b
        L_0x008a:
            androidx.constraintlayout.widget.v r0 = new androidx.constraintlayout.widget.v     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            android.util.SparseArray r1 = r8.f5492b     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            int r3 = r0.f5483a     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            r1.put(r3, r0)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            r1 = r0
            goto L_0x009b
        L_0x0098:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
        L_0x009b:
            int r0 = r10.next()     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x00a1 }
            goto L_0x002b
        L_0x00a0:
            return
        L_0x00a1:
            r9 = move-exception
            r9.printStackTrace()
            return
        L_0x00a6:
            r9 = move-exception
            r9.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C1765x.m4830b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: a */
    public final int mo4911a(int i) {
        int a;
        if (i == -1) {
            C1763v vVar = (C1763v) this.f5492b.valueAt(0);
            if (vVar == null || (a = vVar.mo4910a()) == -1) {
                return -1;
            }
            if (a == -1) {
                return vVar.f5485c;
            }
            return ((C1764w) vVar.f5484b.get(a)).f5490e;
        }
        C1763v vVar2 = (C1763v) this.f5492b.get(i);
        if (vVar2 == null) {
            return -1;
        }
        int a2 = vVar2.mo4910a();
        if (a2 == -1) {
            return vVar2.f5485c;
        }
        return ((C1764w) vVar2.f5484b.get(a2)).f5490e;
    }
}
