package p3186j$.time;

/* renamed from: j$.time.l */
abstract /* synthetic */ class C41007l {

    /* renamed from: a */
    static final /* synthetic */ int[] f107408a;

    /* renamed from: b */
    static final /* synthetic */ int[] f107409b;

    /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
    static {
        /*
            j$.time.temporal.ChronoUnit[] r0 = p3186j$.time.temporal.ChronoUnit.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            f107409b = r0
            r1 = 1
            j$.time.temporal.ChronoUnit r2 = p3186j$.time.temporal.ChronoUnit.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            r0 = 2
            int[] r2 = f107409b     // Catch:{ NoSuchFieldError -> 0x001d }
            j$.time.temporal.ChronoUnit r3 = p3186j$.time.temporal.ChronoUnit.YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            r2 = 3
            int[] r3 = f107409b     // Catch:{ NoSuchFieldError -> 0x0028 }
            j$.time.temporal.ChronoUnit r4 = p3186j$.time.temporal.ChronoUnit.DECADES     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            r3 = 4
            int[] r4 = f107409b     // Catch:{ NoSuchFieldError -> 0x0033 }
            j$.time.temporal.ChronoUnit r5 = p3186j$.time.temporal.ChronoUnit.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            r4 = 5
            int[] r5 = f107409b     // Catch:{ NoSuchFieldError -> 0x003e }
            j$.time.temporal.ChronoUnit r6 = p3186j$.time.temporal.ChronoUnit.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x003e }
            int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r5 = f107409b     // Catch:{ NoSuchFieldError -> 0x0049 }
            j$.time.temporal.ChronoUnit r6 = p3186j$.time.temporal.ChronoUnit.ERAS     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r7 = 6
            r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            j$.time.temporal.ChronoField[] r5 = p3186j$.time.temporal.ChronoField.values()
            int r5 = r5.length
            int[] r5 = new int[r5]
            f107408a = r5
            j$.time.temporal.ChronoField r6 = p3186j$.time.temporal.ChronoField.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x005a }
            int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
            r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
        L_0x005a:
            int[] r1 = f107408a     // Catch:{ NoSuchFieldError -> 0x0064 }
            j$.time.temporal.ChronoField r5 = p3186j$.time.temporal.ChronoField.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0064 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
            r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
        L_0x0064:
            int[] r0 = f107408a     // Catch:{ NoSuchFieldError -> 0x006e }
            j$.time.temporal.ChronoField r1 = p3186j$.time.temporal.ChronoField.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x006e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            int[] r0 = f107408a     // Catch:{ NoSuchFieldError -> 0x0078 }
            j$.time.temporal.ChronoField r1 = p3186j$.time.temporal.ChronoField.YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
            r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
        L_0x0078:
            int[] r0 = f107408a     // Catch:{ NoSuchFieldError -> 0x0082 }
            j$.time.temporal.ChronoField r1 = p3186j$.time.temporal.ChronoField.ERA     // Catch:{ NoSuchFieldError -> 0x0082 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
            r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.C41007l.<clinit>():void");
    }
}
