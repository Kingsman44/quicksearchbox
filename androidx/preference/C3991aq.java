package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.InflateException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.preference.aq */
/* compiled from: PG */
final class C3991aq {

    /* renamed from: a */
    public static final /* synthetic */ int f12826a = 0;

    /* renamed from: b */
    private static final Class[] f12827b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final HashMap f12828c = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r0 = (androidx.preference.PreferenceGroup) m11509d(r7.getName(), r2, r9, r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r8 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r0.mo8335B(r11);
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        m11507b(r7, r8, r2, r9, r10, r11, r12);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.preference.Preference m11506a(org.xmlpull.v1.XmlPullParser r7, androidx.preference.PreferenceGroup r8, android.content.Context r9, java.lang.Object[] r10, androidx.preference.C3995au r11, java.lang.String[] r12) {
        /*
            monitor-enter(r10)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ all -> 0x007f }
            r0 = 0
            r10[r0] = r9     // Catch:{ all -> 0x007f }
        L_0x0008:
            int r0 = r7.next()     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            r1 = 2
            if (r0 == r1) goto L_0x002e
            r1 = 1
            if (r0 == r1) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            android.view.InflateException r8 = new android.view.InflateException     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            r9.<init>()     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            java.lang.String r11 = r7.getPositionDescription()     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            r9.append(r11)     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            java.lang.String r11 = ": No start tag found!"
            r9.append(r11)     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            java.lang.String r9 = r9.toString()     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            r8.<init>(r9)     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            throw r8     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
        L_0x002e:
            java.lang.String r0 = r7.getName()     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            androidx.preference.Preference r0 = m11509d(r0, r2, r9, r10, r12)     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            androidx.preference.PreferenceGroup r0 = (androidx.preference.PreferenceGroup) r0     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            if (r8 != 0) goto L_0x003e
            r0.mo8335B(r11)     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            r8 = r0
        L_0x003e:
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            m11507b(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ InflateException -> 0x007d, XmlPullParserException -> 0x006f, IOException -> 0x0049 }
            monitor-exit(r10)     // Catch:{ all -> 0x007f }
            return r8
        L_0x0049:
            r8 = move-exception
            android.view.InflateException r9 = new android.view.InflateException     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r11.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r7.getPositionDescription()     // Catch:{ all -> 0x007f }
            r11.append(r7)     // Catch:{ all -> 0x007f }
            java.lang.String r7 = ": "
            r11.append(r7)     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r8.getMessage()     // Catch:{ all -> 0x007f }
            r11.append(r7)     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x007f }
            r9.<init>(r7)     // Catch:{ all -> 0x007f }
            r9.initCause(r8)     // Catch:{ all -> 0x007f }
            throw r9     // Catch:{ all -> 0x007f }
        L_0x006f:
            r7 = move-exception
            android.view.InflateException r8 = new android.view.InflateException     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r7.getMessage()     // Catch:{ all -> 0x007f }
            r8.<init>(r9)     // Catch:{ all -> 0x007f }
            r8.initCause(r7)     // Catch:{ all -> 0x007f }
            throw r8     // Catch:{ all -> 0x007f }
        L_0x007d:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x007f }
        L_0x007f:
            r7 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x0082:
            throw r7
        L_0x0083:
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C3991aq.m11506a(org.xmlpull.v1.XmlPullParser, androidx.preference.PreferenceGroup, android.content.Context, java.lang.Object[], androidx.preference.au, java.lang.String[]):androidx.preference.Preference");
    }

    /* renamed from: b */
    private static final void m11507b(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet, Context context, Object[] objArr, C3995au auVar, String[] strArr) {
        Preference preference2 = preference;
        AttributeSet attributeSet2 = attributeSet;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() > depth) {
                    next = 3;
                } else {
                    return;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        XmlPullParser xmlPullParser2 = xmlPullParser;
                        preference2.f12749u = Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet2);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else {
                    XmlPullParser xmlPullParser3 = xmlPullParser;
                    if ("extra".equals(name)) {
                        context.getResources().parseBundleExtra("extra", attributeSet2, preference.mo8365q());
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                    break;
                                }
                            }
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e2);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference d = m11509d(name, attributeSet2, context, objArr, strArr);
                        ((PreferenceGroup) preference2).mo8379af(d);
                        m11507b(xmlPullParser, d, attributeSet, context, objArr, auVar, strArr);
                    }
                }
            } else {
                XmlPullParser xmlPullParser4 = xmlPullParser;
                Context context2 = context;
                Object[] objArr2 = objArr;
                String[] strArr2 = strArr;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r11 = new android.view.InflateException(r10.getPositionDescription() + ": Error inflating class " + r8);
        r11.initCause(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068 A[Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }, ExcHandler: Exception (r9v3 'e' java.lang.Exception A[CUSTOM_DECLARE, Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }]), Splitter:B:2:0x000d] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.preference.Preference m11508c(java.lang.String r8, java.lang.String[] r9, android.util.AttributeSet r10, android.content.Context r11, java.lang.Object[] r12) {
        /*
            java.util.HashMap r0 = f12828c
            java.lang.Object r0 = r0.get(r8)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.String r1 = ": Error inflating class "
            r2 = 1
            if (r0 != 0) goto L_0x006c
            java.lang.ClassLoader r11 = r11.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            r0 = 0
            if (r9 == 0) goto L_0x0055
            r3 = 0
            r5 = r3
            r4 = 0
        L_0x0017:
            r6 = 2
            if (r4 >= r6) goto L_0x0034
            r6 = r9[r4]     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0030, Exception -> 0x0068 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x0030, Exception -> 0x0068 }
            r7.append(r6)     // Catch:{ ClassNotFoundException -> 0x0030, Exception -> 0x0068 }
            r7.append(r8)     // Catch:{ ClassNotFoundException -> 0x0030, Exception -> 0x0068 }
            java.lang.String r6 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x0030, Exception -> 0x0068 }
            java.lang.Class r3 = java.lang.Class.forName(r6, r0, r11)     // Catch:{ ClassNotFoundException -> 0x0030, Exception -> 0x0068 }
            goto L_0x0034
        L_0x0030:
            r5 = move-exception
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0034:
            if (r3 != 0) goto L_0x0059
            if (r5 != 0) goto L_0x0054
            android.view.InflateException r9 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            r11.<init>()     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            java.lang.String r12 = r10.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            r11.append(r12)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            r11.append(r1)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            r11.append(r8)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            java.lang.String r11 = r11.toString()     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            r9.<init>(r11)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            throw r9     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
        L_0x0054:
            throw r5     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
        L_0x0055:
            java.lang.Class r3 = java.lang.Class.forName(r8, r0, r11)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
        L_0x0059:
            java.lang.Class[] r9 = f12827b     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            java.lang.reflect.Constructor r0 = r3.getConstructor(r9)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            r0.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            java.util.HashMap r9 = f12828c     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            r9.put(r8, r0)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r9 = move-exception
            goto L_0x0075
        L_0x006a:
            r8 = move-exception
            goto L_0x0094
        L_0x006c:
            r12[r2] = r10     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            java.lang.Object r9 = r0.newInstance(r12)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            androidx.preference.Preference r9 = (androidx.preference.Preference) r9     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x0068 }
            return r9
        L_0x0075:
            android.view.InflateException r11 = new android.view.InflateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r12.append(r10)
            r12.append(r1)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r11.<init>(r8)
            r11.initCause(r9)
            throw r11
        L_0x0094:
            goto L_0x0096
        L_0x0095:
            throw r8
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C3991aq.m11508c(java.lang.String, java.lang.String[], android.util.AttributeSet, android.content.Context, java.lang.Object[]):androidx.preference.Preference");
    }

    /* renamed from: d */
    private static final Preference m11509d(String str, AttributeSet attributeSet, Context context, Object[] objArr, String[] strArr) {
        try {
            if (str.indexOf(46) == -1) {
                return m11508c(str, strArr, attributeSet, context, objArr);
            }
            return m11508c(str, (String[]) null, attributeSet, context, objArr);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }
}
