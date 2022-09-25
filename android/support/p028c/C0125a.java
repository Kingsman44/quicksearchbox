package android.support.p028c;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* renamed from: android.support.c.a */
/* compiled from: PG */
public final class C0125a {

    /* renamed from: a */
    private static final Set f324a = new HashSet();

    /* renamed from: b */
    private static final boolean f325b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder("VM with version ");
        sb.append(property);
        sb.append(true != z ? " does not have multidex support" : " has multidex support");
        Log.i("MultiDex", sb.toString());
        f325b = z;
    }

    /* renamed from: a */
    public static Field m128a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x017b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01c3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m129b(android.content.Context r14) {
        /*
            java.lang.String r0 = "Failed to list secondary dex dir content ("
            java.lang.String r1 = "Clearing old secondary dex dir ("
            java.lang.String r2 = ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\""
            java.lang.String r3 = "MultiDex is not guaranteed to work in SDK version "
            java.lang.String r4 = "MultiDex"
            java.lang.String r5 = "Installing application"
            android.util.Log.i(r4, r5)
            boolean r4 = f325b
            if (r4 != 0) goto L_0x01eb
            r4 = 0
            android.content.pm.ApplicationInfo r5 = r14.getApplicationInfo()     // Catch:{ RuntimeException -> 0x001c }
            goto L_0x0025
        L_0x0019:
            r14 = move-exception
            goto L_0x01c7
        L_0x001c:
            r5 = move-exception
            java.lang.String r6 = "MultiDex"
            java.lang.String r7 = "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching."
            android.util.Log.w(r6, r7, r5)     // Catch:{ Exception -> 0x0019 }
            r5 = r4
        L_0x0025:
            if (r5 != 0) goto L_0x002f
            java.lang.String r14 = "MultiDex"
            java.lang.String r0 = "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled."
            android.util.Log.i(r14, r0)     // Catch:{ Exception -> 0x0019 }
            return
        L_0x002f:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0019 }
            java.lang.String r7 = r5.sourceDir     // Catch:{ Exception -> 0x0019 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0019 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0019 }
            java.lang.String r5 = r5.dataDir     // Catch:{ Exception -> 0x0019 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0019 }
            java.util.Set r5 = f324a     // Catch:{ Exception -> 0x0019 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0019 }
            boolean r8 = r5.contains(r6)     // Catch:{ all -> 0x01c4 }
            if (r8 == 0) goto L_0x0049
            monitor-exit(r5)     // Catch:{ all -> 0x01c4 }
            goto L_0x01b6
        L_0x0049:
            r5.add(r6)     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r8.<init>(r3)     // Catch:{ all -> 0x01c4 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01c4 }
            r8.append(r3)     // Catch:{ all -> 0x01c4 }
            r8.append(r2)     // Catch:{ all -> 0x01c4 }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x01c4 }
            r8.append(r2)     // Catch:{ all -> 0x01c4 }
            java.lang.String r2 = "\""
            r8.append(r2)     // Catch:{ all -> 0x01c4 }
            java.lang.String r2 = "MultiDex"
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x01c4 }
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x01c4 }
            java.lang.ClassLoader r2 = r14.getClassLoader()     // Catch:{ RuntimeException -> 0x0080 }
            boolean r3 = r2 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x01c4 }
            if (r3 != 0) goto L_0x0089
            java.lang.String r2 = "MultiDex"
            java.lang.String r3 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x01c4 }
            goto L_0x0088
        L_0x0080:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r8 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r3, r8, r2)     // Catch:{ all -> 0x01c4 }
        L_0x0088:
            r2 = r4
        L_0x0089:
            if (r2 != 0) goto L_0x008e
            monitor-exit(r5)     // Catch:{ all -> 0x01c4 }
            goto L_0x01b6
        L_0x008e:
            r3 = 0
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0166 }
            java.io.File r9 = r14.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r10 = "secondary-dexes"
            r8.<init>(r9, r10)     // Catch:{ all -> 0x0166 }
            boolean r9 = r8.isDirectory()     // Catch:{ all -> 0x0166 }
            if (r9 == 0) goto L_0x016e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            r9.<init>(r1)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = r8.getPath()     // Catch:{ all -> 0x0166 }
            r9.append(r1)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = ")."
            r9.append(r1)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "MultiDex"
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0166 }
            android.util.Log.i(r1, r9)     // Catch:{ all -> 0x0166 }
            java.io.File[] r1 = r8.listFiles()     // Catch:{ all -> 0x0166 }
            if (r1 != 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            r1.<init>(r0)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r8.getPath()     // Catch:{ all -> 0x0166 }
            r1.append(r0)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = ")."
            r1.append(r0)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "MultiDex"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0166 }
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0166 }
            goto L_0x016e
        L_0x00dc:
            int r0 = r1.length     // Catch:{ all -> 0x0166 }
            r9 = 0
        L_0x00de:
            if (r9 >= r0) goto L_0x0138
            r10 = r1[r9]     // Catch:{ all -> 0x0166 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            r11.<init>()     // Catch:{ all -> 0x0166 }
            java.lang.String r12 = "Trying to delete old file "
            r11.append(r12)     // Catch:{ all -> 0x0166 }
            java.lang.String r12 = r10.getPath()     // Catch:{ all -> 0x0166 }
            r11.append(r12)     // Catch:{ all -> 0x0166 }
            java.lang.String r12 = " of size "
            r11.append(r12)     // Catch:{ all -> 0x0166 }
            long r12 = r10.length()     // Catch:{ all -> 0x0166 }
            r11.append(r12)     // Catch:{ all -> 0x0166 }
            java.lang.String r12 = "MultiDex"
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0166 }
            android.util.Log.i(r12, r11)     // Catch:{ all -> 0x0166 }
            boolean r11 = r10.delete()     // Catch:{ all -> 0x0166 }
            if (r11 != 0) goto L_0x0122
            java.lang.String r11 = "MultiDex"
            java.lang.String r12 = "Failed to delete old file "
            java.lang.String r10 = r10.getPath()     // Catch:{ all -> 0x0166 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0166 }
            java.lang.String r10 = r12.concat(r10)     // Catch:{ all -> 0x0166 }
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x0166 }
            goto L_0x0135
        L_0x0122:
            java.lang.String r11 = "MultiDex"
            java.lang.String r12 = "Deleted old file "
            java.lang.String r10 = r10.getPath()     // Catch:{ all -> 0x0166 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0166 }
            java.lang.String r10 = r12.concat(r10)     // Catch:{ all -> 0x0166 }
            android.util.Log.i(r11, r10)     // Catch:{ all -> 0x0166 }
        L_0x0135:
            int r9 = r9 + 1
            goto L_0x00de
        L_0x0138:
            boolean r0 = r8.delete()     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "MultiDex"
            java.lang.String r1 = "Failed to delete secondary dex dir "
            java.lang.String r8 = r8.getPath()     // Catch:{ all -> 0x0166 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = r1.concat(r8)     // Catch:{ all -> 0x0166 }
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0166 }
            goto L_0x016e
        L_0x0152:
            java.lang.String r0 = "MultiDex"
            java.lang.String r1 = "Deleted old secondary dex dir "
            java.lang.String r8 = r8.getPath()     // Catch:{ all -> 0x0166 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = r1.concat(r8)     // Catch:{ all -> 0x0166 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0166 }
            goto L_0x016e
        L_0x0166:
            r0 = move-exception
            java.lang.String r1 = "MultiDex"
            java.lang.String r8 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r1, r8, r0)     // Catch:{ all -> 0x01c4 }
        L_0x016e:
            java.lang.String r0 = "secondary-dexes"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01c4 }
            java.lang.String r8 = "code_cache"
            r1.<init>(r7, r8)     // Catch:{ all -> 0x01c4 }
            m131d(r1)     // Catch:{ IOException -> 0x017b }
            goto L_0x0189
        L_0x017b:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01c4 }
            java.io.File r7 = r14.getFilesDir()     // Catch:{ all -> 0x01c4 }
            java.lang.String r8 = "code_cache"
            r1.<init>(r7, r8)     // Catch:{ all -> 0x01c4 }
            m131d(r1)     // Catch:{ all -> 0x01c4 }
        L_0x0189:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x01c4 }
            r7.<init>(r1, r0)     // Catch:{ all -> 0x01c4 }
            m131d(r7)     // Catch:{ all -> 0x01c4 }
            android.support.c.d r0 = new android.support.c.d     // Catch:{ all -> 0x01c4 }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x01c4 }
            java.util.List r1 = r0.mo97a(r14, r3)     // Catch:{ all -> 0x01bf }
            m130c(r2, r7, r1)     // Catch:{ IOException -> 0x019e }
            goto L_0x01ae
        L_0x019e:
            r1 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r6 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r3, r6, r1)     // Catch:{ all -> 0x01bf }
            r1 = 1
            java.util.List r14 = r0.mo97a(r14, r1)     // Catch:{ all -> 0x01bf }
            m130c(r2, r7, r14)     // Catch:{ all -> 0x01bf }
        L_0x01ae:
            r0.close()     // Catch:{ IOException -> 0x01b2 }
            goto L_0x01b3
        L_0x01b2:
            r4 = move-exception
        L_0x01b3:
            if (r4 != 0) goto L_0x01be
            monitor-exit(r5)     // Catch:{ all -> 0x01c4 }
        L_0x01b6:
            java.lang.String r14 = "MultiDex"
            java.lang.String r0 = "install done"
            android.util.Log.i(r14, r0)
            return
        L_0x01be:
            throw r4     // Catch:{ all -> 0x01c4 }
        L_0x01bf:
            r14 = move-exception
            r0.close()     // Catch:{ IOException -> 0x01c3 }
        L_0x01c3:
            throw r14     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r14 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01c4 }
            throw r14     // Catch:{ Exception -> 0x0019 }
        L_0x01c7:
            java.lang.String r0 = "MultiDex"
            java.lang.String r1 = "MultiDex installation failure"
            android.util.Log.e(r0, r1, r14)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MultiDex installation failed ("
            r1.<init>(r2)
            java.lang.String r14 = r14.getMessage()
            r1.append(r14)
            java.lang.String r14 = ")."
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L_0x01eb:
            java.lang.String r14 = "MultiDex"
            java.lang.String r0 = "VM has multidex support, MultiDex support library is disabled."
            android.util.Log.i(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028c.C0125a.m129b(android.content.Context):void");
    }

    /* renamed from: c */
    private static void m130c(ClassLoader classLoader, File file, List list) {
        IOException[] iOExceptionArr;
        if (!list.isEmpty()) {
            Object obj = m128a(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            Class cls = obj.getClass();
            while (cls != null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, new Object[]{arrayList2, file, arrayList});
                    Field a = m128a(obj, "dexElements");
                    Object[] objArr2 = (Object[]) a.get(obj);
                    Class<?> componentType = objArr2.getClass().getComponentType();
                    int length = objArr2.length;
                    int length2 = objArr.length;
                    Object[] objArr3 = (Object[]) Array.newInstance(componentType, length + length2);
                    System.arraycopy(objArr2, 0, objArr3, 0, length);
                    System.arraycopy(objArr, 0, objArr3, length, length2);
                    a.set(obj, objArr3);
                    if (arrayList.size() > 0) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) arrayList.get(i));
                        }
                        Field a2 = m128a(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) a2.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            int size2 = arrayList.size();
                            int length3 = iOExceptionArr2.length;
                            IOException[] iOExceptionArr3 = new IOException[(size2 + length3)];
                            arrayList.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), length3);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        a2.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
        }
    }

    /* renamed from: d */
    private static void m131d(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory ".concat(String.valueOf(file.getPath())));
        }
    }
}
