package com.google.android.libraries.phenotype.registration;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import com.google.p343ac.p357d.C6659a;
import com.google.p343ac.p357d.C6663e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.phenotype.registration.a */
/* compiled from: PG */
public final class C31768a {
    /* JADX WARNING: Can't wrap try/catch for region: R(2:33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00ba */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap m59112a(android.content.pm.PackageInfo r10, java.util.List r11, android.content.pm.PackageManager r12) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0009:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00be
            java.lang.Object r1 = r11.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ServiceInfo r1 = r1.serviceInfo
            if (r1 == 0) goto L_0x0009
            java.lang.String r2 = "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService"
            java.lang.String r3 = r1.name
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0009
            android.os.Bundle r2 = r1.metaData
            if (r2 == 0) goto L_0x0009
            android.os.Bundle r2 = r1.metaData
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0031:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0009
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "com.google.android.gms.phenotype.heterodyne_info.binarypb"
            boolean r5 = r4.equals(r3)
            if (r5 != 0) goto L_0x004b
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x0031
        L_0x004b:
            android.os.Bundle r4 = r1.metaData
            r5 = 0
            int r3 = r4.getInt(r3, r5)
            if (r3 == 0) goto L_0x0031
            java.lang.String r4 = r10.packageName     // Catch:{ NotFoundException -> 0x00bb }
            android.content.res.Resources r4 = r12.getResourcesForApplication(r4)     // Catch:{ NotFoundException -> 0x00bb }
            java.io.InputStream r3 = r4.openRawResource(r3)     // Catch:{ NotFoundException -> 0x00bb }
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.m96144F(r3)     // Catch:{ all -> 0x009c }
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x009c }
            com.google.android.libraries.phenotype.a.a.b r7 = com.google.android.libraries.phenotype.p2418a.p2419a.C31631b.f85101c     // Catch:{ all -> 0x009c }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (com.google.protobuf.C63088z) r4, (com.google.protobuf.C62921ba) r6)     // Catch:{ all -> 0x009c }
            com.google.android.libraries.phenotype.a.a.b r4 = (com.google.android.libraries.phenotype.p2418a.p2419a.C31631b) r4     // Catch:{ all -> 0x009c }
            java.lang.String r6 = r4.f85104b     // Catch:{ all -> 0x009c }
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ all -> 0x009c }
            com.google.android.libraries.phenotype.a.a.a r4 = (com.google.android.libraries.phenotype.p2418a.p2419a.C31630a) r4     // Catch:{ all -> 0x009c }
            r4.copyOnWrite()     // Catch:{ all -> 0x009c }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ all -> 0x009c }
            com.google.android.libraries.phenotype.a.a.b r7 = (com.google.android.libraries.phenotype.p2418a.p2419a.C31631b) r7     // Catch:{ all -> 0x009c }
            int r8 = r7.f85103a     // Catch:{ all -> 0x009c }
            r8 = r8 & -2
            r7.f85103a = r8     // Catch:{ all -> 0x009c }
            com.google.android.libraries.phenotype.a.a.b r8 = com.google.android.libraries.phenotype.p2418a.p2419a.C31631b.f85101c     // Catch:{ all -> 0x009c }
            java.lang.String r8 = r8.f85104b     // Catch:{ all -> 0x009c }
            r7.f85104b = r8     // Catch:{ all -> 0x009c }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x009c }
            com.google.android.libraries.phenotype.a.a.b r4 = (com.google.android.libraries.phenotype.p2418a.p2419a.C31631b) r4     // Catch:{ all -> 0x009c }
            com.google.protobuf.z r4 = r4.toByteString()     // Catch:{ all -> 0x009c }
            r0.put(r6, r4)     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x0031
            r3.close()     // Catch:{ NotFoundException -> 0x00bb }
            goto L_0x0031
        L_0x009c:
            r4 = move-exception
            if (r3 == 0) goto L_0x00ba
            r3.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00ba
        L_0x00a3:
            r3 = move-exception
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x00ba }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r5] = r8     // Catch:{ Exception -> 0x00ba }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r9 = "addSuppressed"
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r9, r7)     // Catch:{ Exception -> 0x00ba }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00ba }
            r6[r5] = r3     // Catch:{ Exception -> 0x00ba }
            r7.invoke(r4, r6)     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            throw r4     // Catch:{ NotFoundException -> 0x00bb }
        L_0x00bb:
            goto L_0x0031
        L_0x00be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.registration.C31768a.m59112a(android.content.pm.PackageInfo, java.util.List, android.content.pm.PackageManager):java.util.HashMap");
    }

    /* renamed from: b */
    public static final List m59113b(PackageInfo packageInfo, PackageManager packageManager) {
        int i;
        int i2;
        int i3;
        if (packageInfo.applicationInfo == null || packageInfo.applicationInfo.metaData == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = packageInfo.applicationInfo.metaData.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (("com.google.android.gms.phenotype.registration.xml".equals(str) || str.startsWith("com.google.android.gms.phenotype.registration.xml:")) && (i3 = packageInfo.applicationInfo.metaData.getInt(str, 0)) != 0) {
                arrayList.addAll(m59118g(i3, packageInfo, 1, packageManager));
            }
        }
        if (packageInfo.services != null) {
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            int length = serviceInfoArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                ServiceInfo serviceInfo = serviceInfoArr[i4];
                if (serviceInfo == null || !"com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(serviceInfo.name)) {
                    i4++;
                } else if (serviceInfo.metaData != null) {
                    for (String str2 : serviceInfo.metaData.keySet()) {
                        if (("com.google.android.gms.phenotype.registration.xml".equals(str2) || str2.startsWith("com.google.android.gms.phenotype.registration.xml:")) && (i2 = serviceInfo.metaData.getInt(str2, 0)) != 0) {
                            arrayList.addAll(m59118g(i2, packageInfo, 2, packageManager));
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            C6663e eVar = (C6663e) arrayList.get(i);
            C6659a aVar = (C6659a) eVar.toBuilder();
            String str3 = packageInfo.packageName;
            aVar.copyOnWrite();
            C6663e eVar2 = (C6663e) aVar.instance;
            str3.getClass();
            eVar2.f19906d = 7;
            eVar2.f19907e = str3;
            if (eVar.f19904b != 2 || ((Integer) eVar.f19905c).intValue() == 0) {
                int i5 = packageInfo.versionCode;
                aVar.copyOnWrite();
                C6663e eVar3 = (C6663e) aVar.instance;
                eVar3.f19904b = 2;
                eVar3.f19905c = Integer.valueOf(i5);
            }
            aVar.copyOnWrite();
            C6663e eVar4 = (C6663e) aVar.instance;
            eVar4.f19912j = 2;
            eVar4.f19903a |= 256;
            arrayList2.add((C6663e) aVar.build());
        }
        return arrayList2;
    }

    /* renamed from: c */
    public static final String m59114c(String str, PackageInfo packageInfo, boolean z) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty configuration package");
        } else if (!z) {
            return str;
        } else {
            if (!str.contains("#")) {
                String str2 = packageInfo.packageName;
                return str + "#" + str2;
            }
            throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", new Object[]{"auto-subpackage", "configuration-package", "#", str}));
        }
    }

    /* renamed from: d */
    private static final void m59115d(XmlResourceParser xmlResourceParser, PackageManager packageManager) {
        String name = xmlResourceParser.getName();
        while (xmlResourceParser.next() != 3) {
            int eventType = xmlResourceParser.getEventType();
            if (eventType == 2) {
                m59115d(xmlResourceParser, packageManager);
            } else if (eventType == 4) {
                xmlResourceParser.next();
                m59116e(xmlResourceParser, name);
                return;
            } else {
                int eventType2 = xmlResourceParser.getEventType();
                throw new IllegalArgumentException("Unexpected event: " + eventType2);
            }
        }
        m59116e(xmlResourceParser, name);
    }

    /* renamed from: e */
    private static final void m59116e(XmlResourceParser xmlResourceParser, String str) {
        if (xmlResourceParser.getEventType() != 3) {
            int lineNumber = xmlResourceParser.getLineNumber();
            throw new IllegalArgumentException("Expected an end tag named " + str + " (line " + lineNumber + ")");
        } else if (!str.equals(xmlResourceParser.getName())) {
            int lineNumber2 = xmlResourceParser.getLineNumber();
            String name = xmlResourceParser.getName();
            throw new IllegalArgumentException("Mismatched end tag at line " + lineNumber2 + ". Expected " + str + " but was " + name);
        }
    }

    /* renamed from: f */
    private static final void m59117f(XmlResourceParser xmlResourceParser, String str) {
        if (xmlResourceParser.getEventType() != 2) {
            int lineNumber = xmlResourceParser.getLineNumber();
            throw new IllegalArgumentException("Expected a start tag named " + str + " (line " + lineNumber + ")");
        } else if (!str.equals(xmlResourceParser.getName())) {
            int lineNumber2 = xmlResourceParser.getLineNumber();
            String name = xmlResourceParser.getName();
            throw new IllegalArgumentException("Unexpected start tag at line " + lineNumber2 + ": " + name + ". Expected " + str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.List m59118g(int r18, android.content.pm.PackageInfo r19, int r20, android.content.pm.PackageManager r21) {
        /*
            r0 = r19
            r1 = r21
            java.lang.String r2 = "phenotype-registration"
            java.lang.String r3 = "phenotype-registrations"
            java.lang.String r4 = r0.packageName
            android.content.res.Resources r4 = r1.getResourcesForApplication(r4)
            r5 = r18
            android.content.res.XmlResourceParser r4 = r4.getXml(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.next()     // Catch:{ all -> 0x01f2 }
        L_0x001c:
            int r6 = r4.next()     // Catch:{ all -> 0x01f2 }
            r7 = 1
            if (r6 == r7) goto L_0x01ee
            int r6 = r4.getEventType()     // Catch:{ all -> 0x01f2 }
            r8 = 2
            if (r6 != r8) goto L_0x01d3
            java.lang.String r6 = r4.getName()     // Catch:{ all -> 0x01f2 }
            boolean r9 = r3.equals(r6)     // Catch:{ all -> 0x01f2 }
            if (r9 == 0) goto L_0x01cb
            m59117f(r4, r3)     // Catch:{ all -> 0x01f2 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x01f2 }
            r9.<init>()     // Catch:{ all -> 0x01f2 }
        L_0x003c:
            int r10 = r4.nextTag()     // Catch:{ all -> 0x01f2 }
            r11 = 3
            if (r10 == r11) goto L_0x01c4
            java.lang.String r10 = r4.getName()     // Catch:{ all -> 0x01f2 }
            boolean r12 = r2.equals(r10)     // Catch:{ all -> 0x01f2 }
            if (r12 == 0) goto L_0x01b8
            m59117f(r4, r2)     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r12 = com.google.p343ac.p357d.C6663e.f19901o     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.a r12 = (com.google.p343ac.p357d.C6659a) r12     // Catch:{ all -> 0x01f2 }
            r14 = 0
        L_0x0059:
            int r15 = r4.nextTag()     // Catch:{ all -> 0x01f2 }
            r16 = -1
            if (r15 == r11) goto L_0x016a
            java.lang.String r15 = r4.getName()     // Catch:{ all -> 0x01f2 }
            int r17 = r15.hashCode()     // Catch:{ all -> 0x01f2 }
            java.lang.String r13 = "log-sources"
            switch(r17) {
                case -995427962: goto L_0x009f;
                case -388887126: goto L_0x0095;
                case -260675356: goto L_0x008b;
                case 515651183: goto L_0x0081;
                case 770547247: goto L_0x0079;
                case 1674321665: goto L_0x006f;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x00a9
        L_0x006f:
            java.lang.String r11 = "configuration-version"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x00a9
            r11 = 1
            goto L_0x00aa
        L_0x0079:
            boolean r11 = r15.equals(r13)
            if (r11 == 0) goto L_0x00a9
            r11 = 2
            goto L_0x00aa
        L_0x0081:
            java.lang.String r11 = "configuration-package"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x00a9
            r11 = 0
            goto L_0x00aa
        L_0x008b:
            java.lang.String r11 = "auto-subpackage"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x00a9
            r11 = 4
            goto L_0x00aa
        L_0x0095:
            java.lang.String r11 = "delete-runtime-properties"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x00a9
            r11 = 5
            goto L_0x00aa
        L_0x009f:
            java.lang.String r11 = "params"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x00a9
            r11 = 3
            goto L_0x00aa
        L_0x00a9:
            r11 = -1
        L_0x00aa:
            if (r11 == 0) goto L_0x0149
            if (r11 == r7) goto L_0x0130
            if (r11 == r8) goto L_0x00fe
            r7 = 3
            if (r11 == r7) goto L_0x00e0
            r7 = 4
            if (r11 == r7) goto L_0x00d5
            r7 = 5
            if (r11 == r7) goto L_0x00bd
            m59115d(r4, r1)     // Catch:{ all -> 0x01f2 }
            goto L_0x00dd
        L_0x00bd:
            java.lang.String r7 = r4.nextText()     // Catch:{ all -> 0x01f2 }
            boolean r7 = java.lang.Boolean.parseBoolean(r7)     // Catch:{ all -> 0x01f2 }
            r12.copyOnWrite()     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bv r11 = r12.instance     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r11 = (com.google.p343ac.p357d.C6663e) r11     // Catch:{ all -> 0x01f2 }
            int r13 = r11.f19903a     // Catch:{ all -> 0x01f2 }
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r11.f19903a = r13     // Catch:{ all -> 0x01f2 }
            r11.f19914l = r7     // Catch:{ all -> 0x01f2 }
            goto L_0x00dd
        L_0x00d5:
            java.lang.String r7 = r4.nextText()     // Catch:{ all -> 0x01f2 }
            boolean r14 = java.lang.Boolean.parseBoolean(r7)     // Catch:{ all -> 0x01f2 }
        L_0x00dd:
            r11 = 2
            goto L_0x0162
        L_0x00e0:
            java.lang.String r7 = r4.nextText()     // Catch:{ all -> 0x01f2 }
            r11 = 8
            byte[] r7 = android.util.Base64.decode(r7, r11)     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.z r7 = com.google.protobuf.C63088z.m96139A(r7)     // Catch:{ all -> 0x01f2 }
            r12.copyOnWrite()     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bv r11 = r12.instance     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r11 = (com.google.p343ac.p357d.C6663e) r11     // Catch:{ all -> 0x01f2 }
            int r13 = r11.f19903a     // Catch:{ all -> 0x01f2 }
            r13 = r13 | 16
            r11.f19903a = r13     // Catch:{ all -> 0x01f2 }
            r11.f19911i = r7     // Catch:{ all -> 0x01f2 }
            goto L_0x00dd
        L_0x00fe:
            m59117f(r4, r13)     // Catch:{ all -> 0x01f2 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01f2 }
            r7.<init>()     // Catch:{ all -> 0x01f2 }
        L_0x0106:
            int r11 = r4.nextTag()     // Catch:{ all -> 0x01f2 }
            r8 = 3
            if (r11 == r8) goto L_0x0129
            java.lang.String r11 = r4.getName()     // Catch:{ all -> 0x01f2 }
            java.lang.String r8 = "log-source"
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x01f2 }
            if (r8 == 0) goto L_0x0121
            java.lang.String r8 = r4.nextText()     // Catch:{ all -> 0x01f2 }
            r7.add(r8)     // Catch:{ all -> 0x01f2 }
            goto L_0x0124
        L_0x0121:
            m59115d(r4, r1)     // Catch:{ all -> 0x01f2 }
        L_0x0124:
            m59116e(r4, r11)     // Catch:{ all -> 0x01f2 }
            r8 = 2
            goto L_0x0106
        L_0x0129:
            m59116e(r4, r13)     // Catch:{ all -> 0x01f2 }
            r12.mo13720a(r7)     // Catch:{ all -> 0x01f2 }
            goto L_0x00dd
        L_0x0130:
            java.lang.String r7 = r4.nextText()     // Catch:{ all -> 0x01f2 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x01f2 }
            r12.copyOnWrite()     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bv r8 = r12.instance     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r8 = (com.google.p343ac.p357d.C6663e) r8     // Catch:{ all -> 0x01f2 }
            r11 = 2
            r8.f19904b = r11     // Catch:{ all -> 0x01f2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01f2 }
            r8.f19905c = r7     // Catch:{ all -> 0x01f2 }
            goto L_0x0162
        L_0x0149:
            r11 = 2
            java.lang.String r7 = r4.nextText()     // Catch:{ all -> 0x01f2 }
            r12.copyOnWrite()     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bv r8 = r12.instance     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r8 = (com.google.p343ac.p357d.C6663e) r8     // Catch:{ all -> 0x01f2 }
            r7.getClass()     // Catch:{ all -> 0x01f2 }
            int r13 = r8.f19903a     // Catch:{ all -> 0x01f2 }
            r16 = 1
            r13 = r13 | 1
            r8.f19903a = r13     // Catch:{ all -> 0x01f2 }
            r8.f19908f = r7     // Catch:{ all -> 0x01f2 }
        L_0x0162:
            m59116e(r4, r15)     // Catch:{ all -> 0x01f2 }
            r7 = 1
            r8 = 2
            r11 = 3
            goto L_0x0059
        L_0x016a:
            r11 = 2
            m59116e(r4, r2)     // Catch:{ all -> 0x01f2 }
            r12.copyOnWrite()     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bv r7 = r12.instance     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r7 = (com.google.p343ac.p357d.C6663e) r7     // Catch:{ all -> 0x01f2 }
            int r8 = r20 + -1
            r7.f19913k = r8     // Catch:{ all -> 0x01f2 }
            int r8 = r7.f19903a     // Catch:{ all -> 0x01f2 }
            r8 = r8 | 512(0x200, float:7.175E-43)
            r7.f19903a = r8     // Catch:{ all -> 0x01f2 }
            java.lang.String r7 = r0.packageName     // Catch:{ all -> 0x01f2 }
            com.google.y.a.a.b r7 = com.google.p5274y.p5275a.p5276a.C67967d.m98227a(r1, r7)     // Catch:{ all -> 0x01f2 }
            long r7 = r7.f184184a     // Catch:{ all -> 0x01f2 }
            r12.copyOnWrite()     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r13 = (com.google.p343ac.p357d.C6663e) r13     // Catch:{ all -> 0x01f2 }
            int r15 = r13.f19903a     // Catch:{ all -> 0x01f2 }
            r15 = r15 | 2048(0x800, float:2.87E-42)
            r13.f19903a = r15     // Catch:{ all -> 0x01f2 }
            r13.f19915m = r7     // Catch:{ all -> 0x01f2 }
            java.lang.String r7 = r13.f19908f     // Catch:{ all -> 0x01f2 }
            java.lang.String r7 = m59114c(r7, r0, r14)     // Catch:{ all -> 0x01f2 }
            r12.copyOnWrite()     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bv r8 = r12.instance     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r8 = (com.google.p343ac.p357d.C6663e) r8     // Catch:{ all -> 0x01f2 }
            r7.getClass()     // Catch:{ all -> 0x01f2 }
            int r13 = r8.f19903a     // Catch:{ all -> 0x01f2 }
            r14 = 1
            r13 = r13 | r14
            r8.f19903a = r13     // Catch:{ all -> 0x01f2 }
            r8.f19908f = r7     // Catch:{ all -> 0x01f2 }
            com.google.protobuf.bv r7 = r12.build()     // Catch:{ all -> 0x01f2 }
            com.google.ac.d.e r7 = (com.google.p343ac.p357d.C6663e) r7     // Catch:{ all -> 0x01f2 }
            r9.add(r7)     // Catch:{ all -> 0x01f2 }
            goto L_0x01bd
        L_0x01b8:
            r11 = 2
            r14 = 1
            m59115d(r4, r1)     // Catch:{ all -> 0x01f2 }
        L_0x01bd:
            m59116e(r4, r10)     // Catch:{ all -> 0x01f2 }
            r7 = 1
            r8 = 2
            goto L_0x003c
        L_0x01c4:
            m59116e(r4, r3)     // Catch:{ all -> 0x01f2 }
            r5.addAll(r9)     // Catch:{ all -> 0x01f2 }
            goto L_0x01ce
        L_0x01cb:
            m59115d(r4, r1)     // Catch:{ all -> 0x01f2 }
        L_0x01ce:
            m59116e(r4, r6)     // Catch:{ all -> 0x01f2 }
            goto L_0x001c
        L_0x01d3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01f2 }
            int r1 = r4.getEventType()     // Catch:{ all -> 0x01f2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f2 }
            r2.<init>()     // Catch:{ all -> 0x01f2 }
            java.lang.String r3 = "Unexpected event: "
            r2.append(r3)     // Catch:{ all -> 0x01f2 }
            r2.append(r1)     // Catch:{ all -> 0x01f2 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01f2 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f2 }
            throw r0     // Catch:{ all -> 0x01f2 }
        L_0x01ee:
            r4.close()
            return r5
        L_0x01f2:
            r0 = move-exception
            r4.close()
            goto L_0x01f8
        L_0x01f7:
            throw r0
        L_0x01f8:
            goto L_0x01f7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.registration.C31768a.m59118g(int, android.content.pm.PackageInfo, int, android.content.pm.PackageManager):java.util.List");
    }
}
