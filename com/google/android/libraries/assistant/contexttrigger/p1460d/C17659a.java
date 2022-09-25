package com.google.android.libraries.assistant.contexttrigger.p1460d;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.a */
/* compiled from: PG */
public final class C17659a {

    /* renamed from: a */
    private static final C59071e f50794a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.d.a");

    /* renamed from: b */
    private static final C58528ij f50795b = C58528ij.m90015O("vehicle", "automobile", "mb bluetooth", "himbox", "abarth", "alfa romeo", "allroad", "aston martin", "bentley", "bmw", "bugatti", "cadillac", "chevrolet", "chevy", "chrysler", "citroen", "corvette", "dacia", "daewoo", "daihatsu", "daimler", "datsun", "ferrari", "hummer", "hyundai", "infiniti", "innocenti", "lancia", "maserati", "maybach", "mercedes", "mercury", "mitsubishi", "my rogue", "opel", "peugeot", "pontiac", "porsche", "prius", "renault", "santa fe", "seat", "skoda", "ssangyong", "subaru", "suzuki", "volkswagen", "btc45", "atmobile", "rfbtaux", "deh-150", "bv7942", "deh-x6700", "avhx2700bs", "bv9973", "kdr540", "blue&me", "handsfreelink", "vauxhall", "automotive", "motorcycle", "toyota", "deh-x6600bt", "elantra", "altima");

    /* renamed from: c */
    private static final C58528ij f50796c = C58528ij.m90015O("car", "ktm", "kia", "fiat", "audi", "ford", "jeep", "coupe", "lada", "opel", "himbox", "hb01", "iveco", "dodge", "josse", "motor", "motors", "lotus", "spectre", "royce", "saab", "skoda", "tesla", "honda", "rover", "lexus", "maxima", "mazda", "dacia", "peugeot", "renault", "seat", "lancia", "buick", "jaguar", "volvo", "vw", "nissan", "uconnect", "gmc");

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c8, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m34947a(android.bluetooth.BluetoothDevice r12) {
        /*
            java.lang.String r0 = r12.getName()
            r1 = 0
            java.lang.Class r2 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            java.lang.String r3 = "getAlias"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            if (r2 == 0) goto L_0x004f
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            java.lang.Object r2 = r2.invoke(r12, r3)     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            com.google.common.f.e r3 = f50794a     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            r4 = 46943(0xb75f, float:6.5781E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            java.lang.String r4 = "refreshAndGetAlias(Name: %s, Alias: %s"
            java.lang.String r5 = r12.getName()     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            r3.mo56354G(r4, r5, r2)     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r2)     // Catch:{ NoSuchMethodException -> 0x0040, SecurityException -> 0x003e, IllegalAccessException -> 0x003c, InvocationTargetException -> 0x003a }
            goto L_0x0051
        L_0x003a:
            r2 = move-exception
            goto L_0x0041
        L_0x003c:
            r2 = move-exception
            goto L_0x0041
        L_0x003e:
            r2 = move-exception
            goto L_0x0041
        L_0x0040:
            r2 = move-exception
        L_0x0041:
            com.google.common.f.e r3 = f50794a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Error in getAlias."
            r5 = 46944(0xb760, float:6.5783E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)
        L_0x004f:
            java.lang.String r2 = ""
        L_0x0051:
            android.bluetooth.BluetoothClass r12 = r12.getBluetoothClass()
            if (r12 != 0) goto L_0x0059
            r12 = 0
            goto L_0x005d
        L_0x0059:
            int r12 = r12.getDeviceClass()
        L_0x005d:
            com.google.common.f.e r3 = f50794a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 46945(0xb761, float:6.5784E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "#device name: %s alias: %s major: %d"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r3.mo56359L(r4, r0, r2, r5)
            r3 = 1056(0x420, float:1.48E-42)
            r4 = 1
            if (r12 != r3) goto L_0x007d
            return r4
        L_0x007d:
            r12 = 2
            java.lang.String[] r3 = new java.lang.String[r12]
            r3[r1] = r0
            r3[r4] = r2
            r0 = 0
        L_0x0085:
            if (r0 >= r12) goto L_0x00cc
            r2 = r3[r0]
            com.google.common.b.ij r5 = f50795b
            com.google.common.b.ij r6 = f50796c
            if (r2 != 0) goto L_0x0090
            goto L_0x00c9
        L_0x0090:
            java.lang.String r7 = "(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])| |_|-"
            java.lang.String[] r7 = r2.split(r7)
            int r8 = r7.length
            r9 = 0
        L_0x0098:
            if (r9 >= r8) goto L_0x00ac
            r10 = r7[r9]
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r10 = r10.toLowerCase(r11)
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x00a9
            goto L_0x00c8
        L_0x00a9:
            int r9 = r9 + 1
            goto L_0x0098
        L_0x00ac:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x00b6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c9
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L_0x00b6
        L_0x00c8:
            return r4
        L_0x00c9:
            int r0 = r0 + 1
            goto L_0x0085
        L_0x00cc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1460d.C17659a.m34947a(android.bluetooth.BluetoothDevice):boolean");
    }
}
