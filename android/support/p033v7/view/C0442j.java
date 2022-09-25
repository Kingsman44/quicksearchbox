package android.support.p033v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.core.p087b.p088a.C1840a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.j */
/* compiled from: PG */
public final class C0442j extends MenuInflater {

    /* renamed from: a */
    static final Class[] f1491a;

    /* renamed from: b */
    static final Class[] f1492b;

    /* renamed from: c */
    final Object[] f1493c;

    /* renamed from: d */
    final Object[] f1494d;

    /* renamed from: e */
    final Context f1495e;

    /* renamed from: f */
    public Object f1496f;

    static {
        Class[] clsArr = {Context.class};
        f1491a = clsArr;
        f1492b = clsArr;
    }

    public C0442j(Context context) {
        super(context);
        this.f1495e = context;
        Object[] objArr = {context};
        this.f1493c = objArr;
        this.f1494d = objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0231  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1441b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.support.v7.view.i r2 = new android.support.v7.view.i
            r3 = r19
            r2.<init>(r0, r3)
            int r3 = r17.getEventType()
        L_0x000f:
            java.lang.String r4 = "menu"
            r5 = 2
            r6 = 1
            if (r3 != r5) goto L_0x0034
            java.lang.String r3 = r17.getName()
            boolean r7 = r3.equals(r4)
            if (r7 == 0) goto L_0x0024
            int r3 = r17.next()
            goto L_0x003a
        L_0x0024:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Expecting menu, got "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x0034:
            int r3 = r17.next()
            if (r3 != r6) goto L_0x0262
        L_0x003a:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x003e:
            if (r9 != 0) goto L_0x0261
            if (r3 == r6) goto L_0x0259
            java.lang.String r12 = "item"
            java.lang.String r13 = "group"
            r14 = 3
            if (r3 == r5) goto L_0x00a5
            if (r3 == r14) goto L_0x0050
        L_0x004b:
            r7 = r17
            r5 = 0
            goto L_0x0252
        L_0x0050:
            java.lang.String r3 = r17.getName()
            if (r10 == 0) goto L_0x0063
            boolean r14 = r3.equals(r11)
            if (r14 == 0) goto L_0x0063
            r7 = r17
            r5 = 0
            r10 = 0
            r11 = 0
            goto L_0x0252
        L_0x0063:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x006d
            r2.mo1431c()
            goto L_0x004b
        L_0x006d:
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0099
            boolean r3 = r2.f1472h
            if (r3 != 0) goto L_0x004b
            androidx.core.j.d r3 = r2.f1459A
            if (r3 == 0) goto L_0x0085
            boolean r3 = r3.mo1738c()
            if (r3 == 0) goto L_0x0085
            r2.mo1429a()
            goto L_0x004b
        L_0x0085:
            r2.f1472h = r6
            android.view.Menu r3 = r2.f1465a
            int r12 = r2.f1466b
            int r13 = r2.f1473i
            int r14 = r2.f1474j
            java.lang.CharSequence r15 = r2.f1475k
            android.view.MenuItem r3 = r3.add(r12, r13, r14, r15)
            r2.mo1432d(r3)
            goto L_0x004b
        L_0x0099:
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x004b
            r7 = r17
            r5 = 0
            r9 = 1
            goto L_0x0252
        L_0x00a5:
            if (r10 == 0) goto L_0x00a8
            goto L_0x004b
        L_0x00a8:
            java.lang.String r3 = r17.getName()
            boolean r13 = r3.equals(r13)
            r15 = 5
            r7 = 4
            if (r13 == 0) goto L_0x00e7
            android.support.v7.view.j r3 = r2.f1464F
            android.content.Context r3 = r3.f1495e
            int[] r12 = android.support.p033v7.p034a.C0338a.f1081q
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r1, r12)
            int r12 = r3.getResourceId(r6, r8)
            r2.f1466b = r12
            int r12 = r3.getInt(r14, r8)
            r2.f1467c = r12
            int r7 = r3.getInt(r7, r8)
            r2.f1468d = r7
            int r7 = r3.getInt(r15, r8)
            r2.f1469e = r7
            boolean r7 = r3.getBoolean(r5, r6)
            r2.f1470f = r7
            boolean r7 = r3.getBoolean(r8, r6)
            r2.f1471g = r7
            r3.recycle()
            goto L_0x004b
        L_0x00e7:
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x023d
            android.support.v7.view.j r3 = r2.f1464F
            android.content.Context r3 = r3.f1495e
            int[] r12 = android.support.p033v7.p034a.C0338a.f1082r
            android.support.v7.widget.ip r3 = android.support.p033v7.widget.C0735ip.m2472e(r3, r1, r12)
            android.content.res.TypedArray r12 = r3.f2596b
            int r12 = r12.getResourceId(r5, r8)
            r2.f1473i = r12
            int r12 = r2.f1467c
            android.content.res.TypedArray r13 = r3.f2596b
            int r12 = r13.getInt(r15, r12)
            int r13 = r2.f1468d
            r15 = -65536(0xffffffffffff0000, float:NaN)
            r12 = r12 & r15
            android.content.res.TypedArray r15 = r3.f2596b
            r5 = 6
            int r5 = r15.getInt(r5, r13)
            char r5 = (char) r5
            r5 = r5 | r12
            r2.f1474j = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r12 = 7
            java.lang.CharSequence r5 = r5.getText(r12)
            r2.f1475k = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r12 = 8
            java.lang.CharSequence r5 = r5.getText(r12)
            r2.f1476l = r5
            android.content.res.TypedArray r5 = r3.f2596b
            int r5 = r5.getResourceId(r8, r8)
            r2.f1477m = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r12 = 9
            java.lang.String r5 = r5.getString(r12)
            char r5 = android.support.p033v7.view.C0441i.m1436e(r5)
            r2.f1478n = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r12 = 16
            r13 = 4096(0x1000, float:5.74E-42)
            int r5 = r5.getInt(r12, r13)
            r2.f1479o = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r12 = 10
            java.lang.String r5 = r5.getString(r12)
            char r5 = android.support.p033v7.view.C0441i.m1436e(r5)
            r2.f1480p = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r12 = 20
            int r5 = r5.getInt(r12, r13)
            r2.f1481q = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r12 = 11
            boolean r5 = r5.hasValue(r12)
            if (r5 == 0) goto L_0x0177
            android.content.res.TypedArray r5 = r3.f2596b
            boolean r5 = r5.getBoolean(r12, r8)
            r2.f1482r = r5
            goto L_0x017b
        L_0x0177:
            int r5 = r2.f1469e
            r2.f1482r = r5
        L_0x017b:
            android.content.res.TypedArray r5 = r3.f2596b
            boolean r5 = r5.getBoolean(r14, r8)
            r2.f1483s = r5
            boolean r5 = r2.f1470f
            android.content.res.TypedArray r12 = r3.f2596b
            boolean r5 = r12.getBoolean(r7, r5)
            r2.f1484t = r5
            boolean r5 = r2.f1471g
            android.content.res.TypedArray r7 = r3.f2596b
            boolean r5 = r7.getBoolean(r6, r5)
            r2.f1485u = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r7 = 21
            r12 = -1
            int r5 = r5.getInt(r7, r12)
            r2.f1486v = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r7 = 12
            java.lang.String r5 = r5.getString(r7)
            r2.f1490z = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r7 = 13
            int r5 = r5.getResourceId(r7, r8)
            r2.f1487w = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r7 = 15
            java.lang.String r5 = r5.getString(r7)
            r2.f1488x = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r7 = 14
            java.lang.String r5 = r5.getString(r7)
            r2.f1489y = r5
            java.lang.String r5 = r2.f1489y
            if (r5 == 0) goto L_0x01ec
            int r7 = r2.f1487w
            if (r7 != 0) goto L_0x01e5
            java.lang.String r7 = r2.f1488x
            if (r7 != 0) goto L_0x01e5
            java.lang.Class[] r7 = f1492b
            android.support.v7.view.j r13 = r2.f1464F
            java.lang.Object[] r13 = r13.f1494d
            java.lang.Object r5 = r2.mo1430b(r5, r7, r13)
            androidx.core.j.d r5 = (androidx.core.p098j.C2089d) r5
            r2.f1459A = r5
            goto L_0x01ef
        L_0x01e5:
            java.lang.String r5 = "SupportMenuInflater"
            java.lang.String r7 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r5, r7)
        L_0x01ec:
            r5 = 0
            r2.f1459A = r5
        L_0x01ef:
            android.content.res.TypedArray r5 = r3.f2596b
            r7 = 17
            java.lang.CharSequence r5 = r5.getText(r7)
            r2.f1460B = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r7 = 22
            java.lang.CharSequence r5 = r5.getText(r7)
            r2.f1461C = r5
            android.content.res.TypedArray r5 = r3.f2596b
            r7 = 19
            boolean r5 = r5.hasValue(r7)
            if (r5 == 0) goto L_0x021d
            android.content.res.TypedArray r5 = r3.f2596b
            int r5 = r5.getInt(r7, r12)
            android.graphics.PorterDuff$Mode r7 = r2.f1463E
            android.graphics.PorterDuff$Mode r5 = android.support.p033v7.widget.C0571cn.m2114a(r5, r7)
            r2.f1463E = r5
            r5 = 0
            goto L_0x0220
        L_0x021d:
            r5 = 0
            r2.f1463E = r5
        L_0x0220:
            android.content.res.TypedArray r7 = r3.f2596b
            r12 = 18
            boolean r7 = r7.hasValue(r12)
            if (r7 == 0) goto L_0x0231
            android.content.res.ColorStateList r7 = r3.mo3245a(r12)
            r2.f1462D = r7
            goto L_0x0233
        L_0x0231:
            r2.f1462D = r5
        L_0x0233:
            android.content.res.TypedArray r3 = r3.f2596b
            r3.recycle()
            r2.f1472h = r8
            r7 = r17
            goto L_0x0252
        L_0x023d:
            r5 = 0
            boolean r7 = r3.equals(r4)
            if (r7 == 0) goto L_0x024e
            android.view.SubMenu r3 = r2.mo1429a()
            r7 = r17
            r0.m1441b(r7, r1, r3)
            goto L_0x0252
        L_0x024e:
            r7 = r17
            r11 = r3
            r10 = 1
        L_0x0252:
            int r3 = r17.next()
            r5 = 2
            goto L_0x003e
        L_0x0259:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected end of document"
            r1.<init>(r2)
            throw r1
        L_0x0261:
            return
        L_0x0262:
            r7 = r17
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.view.C0442j.m1441b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: a */
    public final Object mo1433a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? mo1433a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void inflate(int i, Menu menu) {
        if (menu instanceof C1840a) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.f1495e.getResources().getLayout(i);
                m1441b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (XmlPullParserException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else {
            super.inflate(i, menu);
        }
    }
}
