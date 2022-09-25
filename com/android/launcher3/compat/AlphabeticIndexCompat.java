package com.android.launcher3.compat;

import android.content.Context;
import com.android.launcher3.Utilities;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: PG */
public class AlphabeticIndexCompat {
    private static final String MID_DOT = "∙";
    private static final String TAG = "AlphabeticIndexCompat";
    private final BaseIndex mBaseIndex;
    private final String mDefaultMiscLabel;

    /* compiled from: PG */
    class AlphabeticIndexV16 extends BaseIndex {
        private Object mAlphabeticIndex;
        private Method mGetBucketIndexMethod;
        private Method mGetBucketLabelMethod;

        public AlphabeticIndexV16(Context context) {
            super();
            Locale locale = context.getResources().getConfiguration().locale;
            Class<?> cls = Class.forName("libcore.icu.AlphabeticIndex");
            this.mGetBucketIndexMethod = cls.getDeclaredMethod("getBucketIndex", new Class[]{String.class});
            this.mGetBucketLabelMethod = cls.getDeclaredMethod("getBucketLabel", new Class[]{Integer.TYPE});
            this.mAlphabeticIndex = cls.getConstructor(new Class[]{Locale.class}).newInstance(new Object[]{locale});
            if (!locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                cls.getDeclaredMethod("addLabels", new Class[]{Locale.class}).invoke(this.mAlphabeticIndex, new Object[]{Locale.ENGLISH});
            }
        }

        /* access modifiers changed from: protected */
        public int getBucketIndex(String str) {
            try {
                return ((Integer) this.mGetBucketIndexMethod.invoke(this.mAlphabeticIndex, new Object[]{str})).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return super.getBucketIndex(str);
            }
        }

        /* access modifiers changed from: protected */
        public String getBucketLabel(int i) {
            try {
                return (String) this.mGetBucketLabelMethod.invoke(this.mAlphabeticIndex, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                e.printStackTrace();
                return super.getBucketLabel(i);
            }
        }
    }

    /* compiled from: PG */
    class AlphabeticIndexVN extends BaseIndex {
        private Object mAlphabeticIndex;
        private Method mGetBucketIndexMethod;
        private Method mGetBucketMethod;
        private Method mGetLabelMethod;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AlphabeticIndexVN(android.content.Context r11) {
            /*
                r10 = this;
                r0 = 0
                r10.<init>()
                java.lang.Class<android.content.res.Configuration> r0 = android.content.res.Configuration.class
                r1 = 0
                java.lang.Class[] r2 = new java.lang.Class[r1]
                java.lang.String r3 = "getLocales"
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
                android.content.res.Resources r11 = r11.getResources()
                android.content.res.Configuration r11 = r11.getConfiguration()
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Object r11 = r0.invoke(r11, r2)
                java.lang.Class r0 = r11.getClass()
                java.lang.String r2 = "size"
                java.lang.Class[] r3 = new java.lang.Class[r1]
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Object r0 = r0.invoke(r11, r2)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                java.lang.Class r2 = r11.getClass()
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]
                java.lang.Class r5 = java.lang.Integer.TYPE
                r4[r1] = r5
                java.lang.String r5 = "get"
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)
                if (r0 != 0) goto L_0x004b
                java.util.Locale r4 = java.util.Locale.ENGLISH
                goto L_0x0059
            L_0x004b:
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                r4[r1] = r5
                java.lang.Object r4 = r2.invoke(r11, r4)
                java.util.Locale r4 = (java.util.Locale) r4
            L_0x0059:
                java.lang.String r5 = "android.icu.text.AlphabeticIndex"
                java.lang.Class r5 = java.lang.Class.forName(r5)
                java.lang.Class[] r6 = new java.lang.Class[r3]
                java.lang.Class<java.util.Locale> r7 = java.util.Locale.class
                r6[r1] = r7
                java.lang.reflect.Constructor r6 = r5.getConstructor(r6)
                java.lang.Object[] r7 = new java.lang.Object[r3]
                r7[r1] = r4
                java.lang.Object r4 = r6.newInstance(r7)
                r10.mAlphabeticIndex = r4
                java.lang.Class[] r4 = new java.lang.Class[r3]
                java.lang.Class<java.util.Locale[]> r6 = java.util.Locale[].class
                r4[r1] = r6
                java.lang.String r6 = "addLabels"
                java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)
                r5 = 1
            L_0x0080:
                if (r5 >= r0) goto L_0x00a0
                java.lang.Object[] r6 = new java.lang.Object[r3]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                r6[r1] = r7
                java.lang.Object r6 = r2.invoke(r11, r6)
                java.util.Locale r6 = (java.util.Locale) r6
                java.lang.Object r7 = r10.mAlphabeticIndex
                java.lang.Object[] r8 = new java.lang.Object[r3]
                java.util.Locale[] r9 = new java.util.Locale[r3]
                r9[r1] = r6
                r8[r1] = r9
                r4.invoke(r7, r8)
                int r5 = r5 + 1
                goto L_0x0080
            L_0x00a0:
                java.lang.Object r11 = r10.mAlphabeticIndex
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.util.Locale[] r2 = new java.util.Locale[r3]
                java.util.Locale r5 = java.util.Locale.ENGLISH
                r2[r1] = r5
                r0[r1] = r2
                r4.invoke(r11, r0)
                java.lang.Object r11 = r10.mAlphabeticIndex
                java.lang.Class r11 = r11.getClass()
                java.lang.String r0 = "buildImmutableIndex"
                java.lang.Class[] r2 = new java.lang.Class[r1]
                java.lang.reflect.Method r11 = r11.getDeclaredMethod(r0, r2)
                java.lang.Object r0 = r10.mAlphabeticIndex
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Object r11 = r11.invoke(r0, r2)
                r10.mAlphabeticIndex = r11
                java.lang.Class r11 = r11.getClass()
                java.lang.Class[] r0 = new java.lang.Class[r3]
                java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
                r0[r1] = r2
                java.lang.String r2 = "getBucketIndex"
                java.lang.reflect.Method r11 = r11.getDeclaredMethod(r2, r0)
                r10.mGetBucketIndexMethod = r11
                java.lang.Object r11 = r10.mAlphabeticIndex
                java.lang.Class r11 = r11.getClass()
                java.lang.Class[] r0 = new java.lang.Class[r3]
                java.lang.Class r2 = java.lang.Integer.TYPE
                r0[r1] = r2
                java.lang.String r2 = "getBucket"
                java.lang.reflect.Method r11 = r11.getDeclaredMethod(r2, r0)
                r10.mGetBucketMethod = r11
                java.lang.Class r11 = r11.getReturnType()
                java.lang.String r0 = "getLabel"
                java.lang.Class[] r1 = new java.lang.Class[r1]
                java.lang.reflect.Method r11 = r11.getDeclaredMethod(r0, r1)
                r10.mGetLabelMethod = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.compat.AlphabeticIndexCompat.AlphabeticIndexVN.<init>(android.content.Context):void");
        }

        /* access modifiers changed from: protected */
        public int getBucketIndex(String str) {
            try {
                return ((Integer) this.mGetBucketIndexMethod.invoke(this.mAlphabeticIndex, new Object[]{str})).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return super.getBucketIndex(str);
            }
        }

        /* access modifiers changed from: protected */
        public String getBucketLabel(int i) {
            try {
                return (String) this.mGetLabelMethod.invoke(this.mGetBucketMethod.invoke(this.mAlphabeticIndex, new Object[]{Integer.valueOf(i)}), new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
                return super.getBucketLabel(i);
            }
        }
    }

    /* compiled from: PG */
    class BaseIndex {
        private static final String BUCKETS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-";
        private static final int UNKNOWN_BUCKET_INDEX = 36;

        private BaseIndex() {
        }

        /* access modifiers changed from: protected */
        public int getBucketIndex(String str) {
            if (str.isEmpty()) {
                return UNKNOWN_BUCKET_INDEX;
            }
            int indexOf = BUCKETS.indexOf(str.substring(0, 1).toUpperCase());
            return indexOf != -1 ? indexOf : UNKNOWN_BUCKET_INDEX;
        }

        /* access modifiers changed from: protected */
        public String getBucketLabel(int i) {
            return BUCKETS.substring(i, i + 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019 A[SYNTHETIC, Splitter:B:9:0x0019] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AlphabeticIndexCompat(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Unable to load the system index"
            java.lang.String r1 = "AlphabeticIndexCompat"
            r5.<init>()
            r2 = 0
            boolean r3 = com.android.launcher3.Utilities.ATLEAST_NOUGAT     // Catch:{ Exception -> 0x0012 }
            if (r3 == 0) goto L_0x0016
            com.android.launcher3.compat.AlphabeticIndexCompat$AlphabeticIndexVN r3 = new com.android.launcher3.compat.AlphabeticIndexCompat$AlphabeticIndexVN     // Catch:{ Exception -> 0x0012 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r3 = move-exception
            android.util.Log.d(r1, r0, r3)
        L_0x0016:
            r3 = r2
        L_0x0017:
            if (r3 != 0) goto L_0x0024
            com.android.launcher3.compat.AlphabeticIndexCompat$AlphabeticIndexV16 r4 = new com.android.launcher3.compat.AlphabeticIndexCompat$AlphabeticIndexV16     // Catch:{ Exception -> 0x0020 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0020 }
            r3 = r4
            goto L_0x0024
        L_0x0020:
            r4 = move-exception
            android.util.Log.d(r1, r0, r4)
        L_0x0024:
            if (r3 != 0) goto L_0x002b
            com.android.launcher3.compat.AlphabeticIndexCompat$BaseIndex r3 = new com.android.launcher3.compat.AlphabeticIndexCompat$BaseIndex
            r3.<init>()
        L_0x002b:
            r5.mBaseIndex = r3
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.lang.String r6 = r6.getLanguage()
            java.util.Locale r0 = java.util.Locale.JAPANESE
            java.lang.String r0 = r0.getLanguage()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x004c
            java.lang.String r6 = "他"
        L_0x0049:
            r5.mDefaultMiscLabel = r6
            return
        L_0x004c:
            java.lang.String r6 = "∙"
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.compat.AlphabeticIndexCompat.<init>(android.content.Context):void");
    }

    public String computeSectionName(CharSequence charSequence) {
        String trim = Utilities.trim(charSequence);
        BaseIndex baseIndex = this.mBaseIndex;
        String bucketLabel = baseIndex.getBucketLabel(baseIndex.getBucketIndex(trim));
        if (!Utilities.trim(bucketLabel).isEmpty() || trim.length() <= 0) {
            return bucketLabel;
        }
        int codePointAt = trim.codePointAt(0);
        if (Character.isDigit(codePointAt)) {
            return "#";
        }
        return Character.isLetter(codePointAt) ? this.mDefaultMiscLabel : MID_DOT;
    }
}
