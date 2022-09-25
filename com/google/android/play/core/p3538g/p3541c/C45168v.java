package com.google.android.play.core.p3538g.p3541c;

import com.google.android.play.core.p3529c.C45053a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.g.c.v */
/* compiled from: PG */
public final class C45168v {

    /* renamed from: c */
    private static final C45053a f117907c = new C45053a("LocalTestingConfigParser");

    /* renamed from: a */
    public final XmlPullParser f117908a;

    /* renamed from: b */
    public final C45162p f117909b = C45163q.m80408c();

    public C45168v(XmlPullParser xmlPullParser) {
        this.f117908a = xmlPullParser;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.play.core.p3538g.p3541c.C45163q m80415a(java.io.File r7) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "local_testing_config.xml"
            r0.<init>(r7, r1)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L_0x0010
            com.google.android.play.core.g.c.q r7 = com.google.android.play.core.p3538g.p3541c.C45163q.f117903a
            return r7
        L_0x0010:
            r7 = 1
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x005b, XmlPullParserException -> 0x0059, RuntimeException -> 0x0057 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x005b, XmlPullParserException -> 0x0059, RuntimeException -> 0x0057 }
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ all -> 0x003b }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ all -> 0x003b }
            r0.setInput(r3)     // Catch:{ all -> 0x003b }
            com.google.android.play.core.g.c.v r4 = new com.google.android.play.core.g.c.v     // Catch:{ all -> 0x003b }
            r4.<init>(r0)     // Catch:{ all -> 0x003b }
            com.google.android.play.core.g.c.t r0 = new com.google.android.play.core.g.c.t     // Catch:{ all -> 0x003b }
            r0.<init>(r4)     // Catch:{ all -> 0x003b }
            java.lang.String r5 = "local-testing-config"
            r4.mo49009b(r5, r0)     // Catch:{ all -> 0x003b }
            com.google.android.play.core.g.c.p r0 = r4.f117909b     // Catch:{ all -> 0x003b }
            com.google.android.play.core.g.c.q r0 = r0.mo49007d()     // Catch:{ all -> 0x003b }
            r3.close()     // Catch:{ IOException -> 0x005b, XmlPullParserException -> 0x0059, RuntimeException -> 0x0057 }
            return r0
        L_0x003b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0056
        L_0x0040:
            r3 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0056 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r2] = r5     // Catch:{ Exception -> 0x0056 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0056 }
            r5[r2] = r3     // Catch:{ Exception -> 0x0056 }
            r4.invoke(r0, r5)     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ IOException -> 0x005b, XmlPullParserException -> 0x0059, RuntimeException -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            goto L_0x005c
        L_0x0059:
            r0 = move-exception
            goto L_0x005c
        L_0x005b:
            r0 = move-exception
        L_0x005c:
            com.google.android.play.core.c.a r3 = f117907c
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r1
            java.lang.String r0 = r0.getMessage()
            r4[r7] = r0
            java.lang.String r7 = "%s can not be parsed, using default. Error: %s"
            r3.mo48887e(r7, r4)
            com.google.android.play.core.g.c.q r7 = com.google.android.play.core.p3538g.p3541c.C45163q.f117903a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3538g.p3541c.C45168v.m80415a(java.io.File):com.google.android.play.core.g.c.q");
    }

    /* renamed from: b */
    public final void mo49009b(String str, C45167u uVar) {
        while (true) {
            int next = this.f117908a.next();
            if (next != 3 && next != 1) {
                if (this.f117908a.getEventType() == 2) {
                    if (this.f117908a.getName().equals(str)) {
                        uVar.mo49008a();
                    } else {
                        throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", new Object[]{str, this.f117908a.getName()}), this.f117908a, (Throwable) null);
                    }
                }
            } else {
                return;
            }
        }
    }
}
