package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import java.lang.reflect.Field;

/* compiled from: PG */
public final class DynamiteModule {

    /* renamed from: a */
    public static final C144152n f390445a = new C144143e();

    /* renamed from: b */
    public static final C144152n f390446b = new C144144f();

    /* renamed from: c */
    public static final C144152n f390447c = new C144145g();

    /* renamed from: d */
    public static final C144152n f390448d = new C144146h();

    /* renamed from: f */
    private static Boolean f390449f = null;

    /* renamed from: g */
    private static String f390450g = null;

    /* renamed from: h */
    private static boolean f390451h = false;

    /* renamed from: i */
    private static int f390452i = -1;

    /* renamed from: j */
    private static Boolean f390453j;

    /* renamed from: k */
    private static final ThreadLocal f390454k = new ThreadLocal();

    /* renamed from: l */
    private static final ThreadLocal f390455l = new C144141c();

    /* renamed from: m */
    private static final C144150l f390456m = new C144142d();

    /* renamed from: n */
    private static C144153o f390457n;

    /* renamed from: o */
    private static C144154p f390458o;

    /* renamed from: e */
    public final Context f390459e;

    /* compiled from: PG */
    public class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    private DynamiteModule(Context context) {
        C143919bh.m233958a(context);
        this.f390459e = context;
    }

    /* renamed from: a */
    public static int m234352a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C143912ba.m233950b(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x0084=Splitter:B:46:0x0084, B:31:0x0054=Splitter:B:31:0x0054, B:17:0x003a=Splitter:B:17:0x003a} */
    /* renamed from: b */
    public static int m234353b(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0206 }
            java.lang.Boolean r1 = f390449f     // Catch:{ all -> 0x0203 }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00c2
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            if (r5 != r6) goto L_0x0035
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x0035:
            if (r5 == 0) goto L_0x003d
            m234357g(r5)     // Catch:{ k -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x003d:
            boolean r5 = m234359i(r9)     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0046
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x0203 }
            return r3
        L_0x0046:
            boolean r5 = f390451h     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0091
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            boolean r5 = r5.equals(r2)     // Catch:{ all -> 0x009c }
            if (r5 == 0) goto L_0x0053
            goto L_0x0091
        L_0x0053:
            r5 = 1
            int r5 = m234355e(r9, r10, r11, r5)     // Catch:{ k -> 0x0087 }
            java.lang.String r6 = f390450g     // Catch:{ k -> 0x0087 }
            if (r6 == 0) goto L_0x0084
            boolean r6 = r6.isEmpty()     // Catch:{ k -> 0x0087 }
            if (r6 == 0) goto L_0x0063
            goto L_0x0084
        L_0x0063:
            java.lang.ClassLoader r6 = com.google.android.gms.dynamite.C144140b.m234362a()     // Catch:{ k -> 0x0087 }
            if (r6 != 0) goto L_0x0077
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch:{ k -> 0x0087 }
            java.lang.String r7 = f390450g     // Catch:{ k -> 0x0087 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r7)     // Catch:{ k -> 0x0087 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ k -> 0x0087 }
            r6.<init>(r7, r8)     // Catch:{ k -> 0x0087 }
        L_0x0077:
            m234357g(r6)     // Catch:{ k -> 0x0087 }
            r1.set(r2, r6)     // Catch:{ k -> 0x0087 }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ k -> 0x0087 }
            f390449f = r6     // Catch:{ k -> 0x0087 }
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x0203 }
            return r5
        L_0x0084:
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x0203 }
            return r5
        L_0x0087:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r1.set(r2, r5)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x0091:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r1.set(r2, r5)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            goto L_0x00c0
        L_0x009c:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
        L_0x009f:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0203 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0203 }
            r4.<init>()     // Catch:{ all -> 0x0203 }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x0203 }
            r4.append(r1)     // Catch:{ all -> 0x0203 }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0203 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0203 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0203 }
        L_0x00c0:
            f390449f = r1     // Catch:{ all -> 0x0203 }
        L_0x00c2:
            monitor-exit(r0)     // Catch:{ all -> 0x0203 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0206 }
            if (r0 == 0) goto L_0x00ea
            int r9 = m234355e(r9, r10, r11, r3)     // Catch:{ k -> 0x00ce }
            return r9
        L_0x00ce:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0206 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0206 }
            r11.<init>()     // Catch:{ all -> 0x0206 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r11.append(r0)     // Catch:{ all -> 0x0206 }
            r11.append(r10)     // Catch:{ all -> 0x0206 }
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0206 }
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x0206 }
            return r3
        L_0x00ea:
            com.google.android.gms.dynamite.o r0 = m234360j(r9)     // Catch:{ all -> 0x0206 }
            if (r0 != 0) goto L_0x00f2
            goto L_0x01fa
        L_0x00f2:
            int r1 = r0.mo119693e()     // Catch:{ RemoteException -> 0x01d9 }
            r4 = 3
            if (r1 < r4) goto L_0x0188
            java.lang.ThreadLocal r1 = f390454k     // Catch:{ RemoteException -> 0x01d9 }
            java.lang.Object r1 = r1.get()     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.gms.dynamite.i r1 = (com.google.android.gms.dynamite.C144147i) r1     // Catch:{ RemoteException -> 0x01d9 }
            if (r1 == 0) goto L_0x010d
            android.database.Cursor r1 = r1.f390462a     // Catch:{ RemoteException -> 0x01d9 }
            if (r1 == 0) goto L_0x010d
            int r3 = r1.getInt(r3)     // Catch:{ RemoteException -> 0x01d9 }
            goto L_0x01fa
        L_0x010d:
            com.google.android.gms.f.k r1 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x01d9 }
            r1.<init>(r9)     // Catch:{ RemoteException -> 0x01d9 }
            java.lang.ThreadLocal r4 = f390455l     // Catch:{ RemoteException -> 0x01d9 }
            java.lang.Object r4 = r4.get()     // Catch:{ RemoteException -> 0x01d9 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ RemoteException -> 0x01d9 }
            long r4 = r4.longValue()     // Catch:{ RemoteException -> 0x01d9 }
            android.os.Parcel r6 = r0.mo17260gA()     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.p445a.C8850c.m23499h(r6, r1)     // Catch:{ RemoteException -> 0x01d9 }
            r6.writeString(r10)     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.p445a.C8850c.m23495d(r6, r11)     // Catch:{ RemoteException -> 0x01d9 }
            r6.writeLong(r4)     // Catch:{ RemoteException -> 0x01d9 }
            r10 = 7
            android.os.Parcel r10 = r0.mo17261gT(r10, r6)     // Catch:{ RemoteException -> 0x01d9 }
            android.os.IBinder r11 = r10.readStrongBinder()     // Catch:{ RemoteException -> 0x01d9 }
            if (r11 != 0) goto L_0x013b
            r0 = r2
            goto L_0x014d
        L_0x013b:
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r0 = r11.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x01d9 }
            boolean r1 = r0 instanceof com.google.android.gms.p10793f.C144165j     // Catch:{ RemoteException -> 0x01d9 }
            if (r1 == 0) goto L_0x0148
            com.google.android.gms.f.j r0 = (com.google.android.gms.p10793f.C144165j) r0     // Catch:{ RemoteException -> 0x01d9 }
            goto L_0x014d
        L_0x0148:
            com.google.android.gms.f.h r0 = new com.google.android.gms.f.h     // Catch:{ RemoteException -> 0x01d9 }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x01d9 }
        L_0x014d:
            r10.recycle()     // Catch:{ RemoteException -> 0x01d9 }
            java.lang.Object r10 = com.google.android.gms.p10793f.C144166k.m234388a(r0)     // Catch:{ RemoteException -> 0x01d9 }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x01d9 }
            if (r10 == 0) goto L_0x0173
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x0185, all -> 0x0181 }
            if (r11 != 0) goto L_0x015f
            goto L_0x0173
        L_0x015f:
            int r11 = r10.getInt(r3)     // Catch:{ RemoteException -> 0x0185, all -> 0x0181 }
            if (r11 <= 0) goto L_0x016c
            boolean r0 = m234358h(r10)     // Catch:{ RemoteException -> 0x0185, all -> 0x0181 }
            if (r0 == 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r2 = r10
        L_0x016d:
            if (r2 == 0) goto L_0x01d5
            r2.close()     // Catch:{ all -> 0x0206 }
            goto L_0x01d5
        L_0x0173:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x0185, all -> 0x0181 }
            if (r10 == 0) goto L_0x01fa
            r10.close()     // Catch:{ all -> 0x0206 }
            goto L_0x01fa
        L_0x0181:
            r11 = move-exception
            r2 = r10
            goto L_0x01fd
        L_0x0185:
            r11 = move-exception
            r2 = r10
            goto L_0x01db
        L_0x0188:
            r5 = 2
            if (r1 != r5) goto L_0x01b1
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r4)     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.gms.f.k r1 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x01d9 }
            r1.<init>(r9)     // Catch:{ RemoteException -> 0x01d9 }
            android.os.Parcel r4 = r0.mo17260gA()     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.p445a.C8850c.m23499h(r4, r1)     // Catch:{ RemoteException -> 0x01d9 }
            r4.writeString(r10)     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.p445a.C8850c.m23495d(r4, r11)     // Catch:{ RemoteException -> 0x01d9 }
            r10 = 5
            android.os.Parcel r10 = r0.mo17261gT(r10, r4)     // Catch:{ RemoteException -> 0x01d9 }
            int r11 = r10.readInt()     // Catch:{ RemoteException -> 0x01d9 }
            r10.recycle()     // Catch:{ RemoteException -> 0x01d9 }
            goto L_0x01d5
        L_0x01b1:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r5 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r5)     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.gms.f.k r1 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x01d9 }
            r1.<init>(r9)     // Catch:{ RemoteException -> 0x01d9 }
            android.os.Parcel r5 = r0.mo17260gA()     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.p445a.C8850c.m23499h(r5, r1)     // Catch:{ RemoteException -> 0x01d9 }
            r5.writeString(r10)     // Catch:{ RemoteException -> 0x01d9 }
            com.google.android.p445a.C8850c.m23495d(r5, r11)     // Catch:{ RemoteException -> 0x01d9 }
            android.os.Parcel r10 = r0.mo17261gT(r4, r5)     // Catch:{ RemoteException -> 0x01d9 }
            int r11 = r10.readInt()     // Catch:{ RemoteException -> 0x01d9 }
            r10.recycle()     // Catch:{ RemoteException -> 0x01d9 }
        L_0x01d5:
            r3 = r11
            goto L_0x01fa
        L_0x01d7:
            r11 = r10
            goto L_0x01fd
        L_0x01d9:
            r10 = move-exception
            r11 = r10
        L_0x01db:
            java.lang.String r10 = r11.getMessage()     // Catch:{ all -> 0x01fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r11.<init>()     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r11.append(r0)     // Catch:{ all -> 0x01fb }
            r11.append(r10)     // Catch:{ all -> 0x01fb }
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x01fb }
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x01fb }
            if (r2 == 0) goto L_0x01fa
            r2.close()     // Catch:{ all -> 0x0206 }
        L_0x01fa:
            return r3
        L_0x01fb:
            r10 = move-exception
            goto L_0x01d7
        L_0x01fd:
            if (r2 == 0) goto L_0x0202
            r2.close()     // Catch:{ all -> 0x0206 }
        L_0x0202:
            throw r11     // Catch:{ all -> 0x0206 }
        L_0x0203:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0203 }
            throw r10     // Catch:{ all -> 0x0206 }
        L_0x0206:
            r10 = move-exception
            com.google.android.gms.common.util.C144005e.m234184a(r9, r10)
            goto L_0x020c
        L_0x020b:
            throw r10
        L_0x020c:
            goto L_0x020b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m234353b(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r5v14, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v18, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v24, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v29, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v31, types: [android.os.IInterface] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01cb, code lost:
        r18 = r14;
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r2);
        r4 = m234360j(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ea, code lost:
        if (r4 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ec, code lost:
        r5 = r4.mo119693e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f1, code lost:
        if (r5 < 3) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f3, code lost:
        r5 = (com.google.android.gms.dynamite.C144147i) r8.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f9, code lost:
        if (r5 == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01fb, code lost:
        r6 = new com.google.android.gms.p10793f.C144166k(r1);
        r7 = new com.google.android.gms.p10793f.C144166k(r5.f390462a);
        r5 = r4.mo17260gA();
        com.google.android.p445a.C8850c.m23499h(r5, r6);
        r5.writeString(r3);
        r5.writeInt(r2);
        com.google.android.p445a.C8850c.m23499h(r5, r7);
        r2 = r4.mo17261gT(8, r5);
        r4 = r2.readStrongBinder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0221, code lost:
        if (r4 != null) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0223, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0225, code lost:
        r5 = r4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x022d, code lost:
        if ((r5 instanceof com.google.android.gms.p10793f.C144165j) == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022f, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0233, code lost:
        r7 = new com.google.android.gms.p10793f.C144163h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0238, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0244, code lost:
        throw new com.google.android.gms.dynamite.C144149k("No cached result cursor holder");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0246, code lost:
        if (r5 != 2) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0248, code lost:
        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
        r5 = new com.google.android.gms.p10793f.C144166k(r1);
        r6 = r4.mo17260gA();
        com.google.android.p445a.C8850c.m23499h(r6, r5);
        r6.writeString(r3);
        r6.writeInt(r2);
        r2 = r4.mo17261gT(4, r6);
        r4 = r2.readStrongBinder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x026a, code lost:
        if (r4 != null) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x026c, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026e, code lost:
        r5 = r4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0276, code lost:
        if ((r5 instanceof com.google.android.gms.p10793f.C144165j) == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0278, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x027c, code lost:
        r7 = new com.google.android.gms.p10793f.C144163h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0281, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0285, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
        r5 = new com.google.android.gms.p10793f.C144166k(r1);
        r6 = r4.mo17260gA();
        com.google.android.p445a.C8850c.m23499h(r6, r5);
        r6.writeString(r3);
        r6.writeInt(r2);
        r2 = r4.mo17261gT(2, r6);
        r4 = r2.readStrongBinder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a7, code lost:
        if (r4 != null) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02a9, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ab, code lost:
        r5 = r4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b3, code lost:
        if ((r5 instanceof com.google.android.gms.p10793f.C144165j) == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b5, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b9, code lost:
        r7 = new com.google.android.gms.p10793f.C144163h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02be, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c1, code lost:
        r2 = com.google.android.gms.p10793f.C144166k.m234388a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c5, code lost:
        if (r2 == null) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c7, code lost:
        r4 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        if (r12 != 0) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d4, code lost:
        r11.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02d8, code lost:
        r11.set(java.lang.Long.valueOf(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02df, code lost:
        r1 = r10.f390462a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e1, code lost:
        if (r1 == null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02e3, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02e6, code lost:
        r8.set(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02e9, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02f1, code lost:
        throw new com.google.android.gms.dynamite.C144149k("Failed to load remote module.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02f9, code lost:
        throw new com.google.android.gms.dynamite.C144149k("Failed to create IDynamiteLoader.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02fa, code lost:
        r18 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0303, code lost:
        throw new com.google.android.gms.dynamite.C144149k("Failed to determine which loading route to use.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0316, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0318, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x031a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r16 == null) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b5, code lost:
        if (r16.booleanValue() == false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r2);
        r4 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r5 = f390458o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        if (r5 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r4 = (com.google.android.gms.dynamite.C144147i) r8.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        if (r4 == null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e2, code lost:
        if (r4.f390462a == null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        r15 = r19.getApplicationContext();
        r4 = r4.f390462a;
        new com.google.android.gms.p10793f.C144166k((java.lang.Object) null);
        r6 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        r18 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        if (f390452i < 2) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f9, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r7 = java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0100, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0105, code lost:
        if (r7.booleanValue() == false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0107, code lost:
        android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
        r6 = new com.google.android.gms.p10793f.C144166k(r15);
        r7 = new com.google.android.gms.p10793f.C144166k(r4);
        r4 = r5.mo17260gA();
        com.google.android.p445a.C8850c.m23499h(r4, r6);
        r4.writeString(r3);
        r4.writeInt(r2);
        com.google.android.p445a.C8850c.m23499h(r4, r7);
        r2 = r5.mo17261gT(3, r4);
        r4 = r2.readStrongBinder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0131, code lost:
        if (r4 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0133, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0135, code lost:
        r5 = r4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013d, code lost:
        if ((r5 instanceof com.google.android.gms.p10793f.C144165j) == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013f, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0143, code lost:
        r7 = new com.google.android.gms.p10793f.C144163h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0148, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014c, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
        r6 = new com.google.android.gms.p10793f.C144166k(r15);
        r7 = new com.google.android.gms.p10793f.C144166k(r4);
        r4 = r5.mo17260gA();
        com.google.android.p445a.C8850c.m23499h(r4, r6);
        r4.writeString(r3);
        r4.writeInt(r2);
        com.google.android.p445a.C8850c.m23499h(r4, r7);
        r2 = r5.mo17261gT(2, r4);
        r4 = r2.readStrongBinder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0176, code lost:
        if (r4 != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017a, code lost:
        r5 = r4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0182, code lost:
        if ((r5 instanceof com.google.android.gms.p10793f.C144165j) == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0184, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0188, code lost:
        r7 = new com.google.android.gms.p10793f.C144163h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018d, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0190, code lost:
        r2 = (android.content.Context) com.google.android.gms.p10793f.C144166k.m234388a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0196, code lost:
        if (r2 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        r4 = new com.google.android.gms.dynamite.DynamiteModule(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a6, code lost:
        throw new com.google.android.gms.dynamite.C144149k("Failed to get module context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a8, code lost:
        r18 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01aa, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01af, code lost:
        r18 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b8, code lost:
        throw new com.google.android.gms.dynamite.C144149k("No result cursor");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b9, code lost:
        r18 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c2, code lost:
        throw new com.google.android.gms.dynamite.C144149k("DynamiteLoaderV2 was not cached.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c4, code lost:
        r18 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0362 A[Catch:{ all -> 0x03d6 }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m234354d(android.content.Context r19, com.google.android.gms.dynamite.C144152n r20, java.lang.String r21) {
        /*
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "Selected remote version of "
            java.lang.String r5 = "Selected remote version of "
            java.lang.String r6 = "No acceptable module "
            java.lang.String r7 = "Considering local module "
            java.lang.ThreadLocal r8 = f390454k
            java.lang.Object r9 = r8.get()
            com.google.android.gms.dynamite.i r9 = (com.google.android.gms.dynamite.C144147i) r9
            com.google.android.gms.dynamite.i r10 = new com.google.android.gms.dynamite.i
            r10.<init>()
            r8.set(r10)
            java.lang.ThreadLocal r11 = f390455l
            java.lang.Object r12 = r11.get()
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03d6 }
            java.lang.Long r14 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x03d6 }
            r11.set(r14)     // Catch:{ all -> 0x03d6 }
            com.google.android.gms.dynamite.l r14 = f390456m     // Catch:{ all -> 0x03d6 }
            com.google.android.gms.dynamite.m r14 = r2.mo119692a(r1, r3, r14)     // Catch:{ all -> 0x03d6 }
            int r15 = r14.f390464a     // Catch:{ all -> 0x03d6 }
            r16 = r6
            int r6 = r14.f390465b     // Catch:{ all -> 0x03d6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d6 }
            r2.<init>(r7)     // Catch:{ all -> 0x03d6 }
            r2.append(r3)     // Catch:{ all -> 0x03d6 }
            java.lang.String r7 = ":"
            r2.append(r7)     // Catch:{ all -> 0x03d6 }
            r2.append(r15)     // Catch:{ all -> 0x03d6 }
            java.lang.String r7 = " and remote module "
            r2.append(r7)     // Catch:{ all -> 0x03d6 }
            r2.append(r3)     // Catch:{ all -> 0x03d6 }
            java.lang.String r7 = ":"
            r2.append(r7)     // Catch:{ all -> 0x03d6 }
            r2.append(r6)     // Catch:{ all -> 0x03d6 }
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x03d6 }
            android.util.Log.i(r6, r2)     // Catch:{ all -> 0x03d6 }
            int r2 = r14.f390466c     // Catch:{ all -> 0x03d6 }
            if (r2 == 0) goto L_0x03a8
            r6 = -1
            if (r2 != r6) goto L_0x0075
            int r7 = r14.f390464a     // Catch:{ all -> 0x03d6 }
            if (r7 == 0) goto L_0x03a8
        L_0x0075:
            r7 = 1
            if (r2 != r7) goto L_0x007c
            int r15 = r14.f390465b     // Catch:{ all -> 0x03d6 }
            if (r15 == 0) goto L_0x03a8
        L_0x007c:
            if (r2 != r6) goto L_0x009e
            com.google.android.gms.dynamite.DynamiteModule r1 = m234356f(r1, r3)     // Catch:{ all -> 0x03d6 }
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x008c
            r11.remove()
            goto L_0x0093
        L_0x008c:
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r11.set(r2)
        L_0x0093:
            android.database.Cursor r2 = r10.f390462a
            if (r2 == 0) goto L_0x009a
            r2.close()
        L_0x009a:
            r8.set(r9)
            return r1
        L_0x009e:
            if (r2 != r7) goto L_0x03a0
            int r2 = r14.f390465b     // Catch:{ k -> 0x033e }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r15 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r15)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            boolean r16 = m234359i(r19)     // Catch:{ all -> 0x0310 }
            if (r16 == 0) goto L_0x0304
            java.lang.Boolean r16 = f390449f     // Catch:{ all -> 0x0310 }
            monitor-exit(r15)     // Catch:{ all -> 0x0310 }
            if (r16 == 0) goto L_0x02fa
            boolean r15 = r16.booleanValue()     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            r7 = 0
            if (r15 == 0) goto L_0x01cb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            r5.append(r3)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            java.lang.String r4 = ", version >= "
            r5.append(r4)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            r5.append(r2)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = r5.toString()     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            android.util.Log.i(r4, r5)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            com.google.android.gms.dynamite.p r5 = f390458o     // Catch:{ all -> 0x01c3 }
            monitor-exit(r4)     // Catch:{ all -> 0x01c3 }
            if (r5 == 0) goto L_0x01b9
            java.lang.Object r4 = r8.get()     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            com.google.android.gms.dynamite.i r4 = (com.google.android.gms.dynamite.C144147i) r4     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            if (r4 == 0) goto L_0x01af
            android.database.Cursor r15 = r4.f390462a     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            if (r15 == 0) goto L_0x01af
            android.content.Context r15 = r19.getApplicationContext()     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            android.database.Cursor r4 = r4.f390462a     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            com.google.android.gms.f.k r6 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            r6.<init>(r7)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r6 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r6)     // Catch:{ RemoteException -> 0x0330, k -> 0x032b, all -> 0x031c }
            int r7 = f390452i     // Catch:{ all -> 0x01a7 }
            r18 = r14
            r14 = 2
            if (r7 < r14) goto L_0x00fb
            r7 = 1
            goto L_0x00fc
        L_0x00fb:
            r7 = 0
        L_0x00fc:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x01ad }
            monitor-exit(r6)     // Catch:{ all -> 0x01ad }
            boolean r6 = r7.booleanValue()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r6 == 0) goto L_0x014c
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r7 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r6, r7)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.f.k r6 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r6.<init>(r15)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.f.k r7 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r7.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.Parcel r4 = r5.mo17260gA()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.p445a.C8850c.m23499h(r4, r6)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.writeString(r3)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.writeInt(r2)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.p445a.C8850c.m23499h(r4, r7)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r2 = 3
            android.os.Parcel r2 = r5.mo17261gT(r2, r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.IBinder r4 = r2.readStrongBinder()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r4 != 0) goto L_0x0135
            r7 = 0
            goto L_0x0148
        L_0x0135:
            java.lang.String r5 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            boolean r6 = r5 instanceof com.google.android.gms.p10793f.C144165j     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r6 == 0) goto L_0x0143
            r7 = r5
            com.google.android.gms.f.j r7 = (com.google.android.gms.p10793f.C144165j) r7     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x0148
        L_0x0143:
            com.google.android.gms.f.h r7 = new com.google.android.gms.f.h     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r7.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x0148:
            r2.recycle()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x0190
        L_0x014c:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r7 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r6, r7)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.f.k r6 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r6.<init>(r15)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.f.k r7 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r7.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.Parcel r4 = r5.mo17260gA()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.p445a.C8850c.m23499h(r4, r6)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.writeString(r3)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.writeInt(r2)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.p445a.C8850c.m23499h(r4, r7)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r2 = 2
            android.os.Parcel r2 = r5.mo17261gT(r2, r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.IBinder r4 = r2.readStrongBinder()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r4 != 0) goto L_0x017a
            r7 = 0
            goto L_0x018d
        L_0x017a:
            java.lang.String r5 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            boolean r6 = r5 instanceof com.google.android.gms.p10793f.C144165j     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r6 == 0) goto L_0x0188
            r7 = r5
            com.google.android.gms.f.j r7 = (com.google.android.gms.p10793f.C144165j) r7     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x018d
        L_0x0188:
            com.google.android.gms.f.h r7 = new com.google.android.gms.f.h     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r7.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x018d:
            r2.recycle()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x0190:
            java.lang.Object r2 = com.google.android.gms.p10793f.C144166k.m234388a(r7)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r2 == 0) goto L_0x019f
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x02ce
        L_0x019f:
            com.google.android.gms.dynamite.k r2 = new com.google.android.gms.dynamite.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r4 = "Failed to get module context"
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x01a7:
            r0 = move-exception
            r18 = r14
        L_0x01aa:
            r2 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x01ad }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x01ad:
            r0 = move-exception
            goto L_0x01aa
        L_0x01af:
            r18 = r14
            com.google.android.gms.dynamite.k r2 = new com.google.android.gms.dynamite.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r4 = "No result cursor"
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x01b9:
            r18 = r14
            com.google.android.gms.dynamite.k r2 = new com.google.android.gms.dynamite.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x01c3:
            r0 = move-exception
            r18 = r14
        L_0x01c6:
            r2 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x01c9 }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x01c9:
            r0 = move-exception
            goto L_0x01c6
        L_0x01cb:
            r18 = r14
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.<init>(r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.append(r3)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r5 = ", version >= "
            r4.append(r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.append(r2)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.util.Log.i(r5, r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.dynamite.o r4 = m234360j(r19)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r4 == 0) goto L_0x02f2
            int r5 = r4.mo119693e()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r6 = 3
            if (r5 < r6) goto L_0x0245
            java.lang.Object r5 = r8.get()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.dynamite.i r5 = (com.google.android.gms.dynamite.C144147i) r5     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r5 == 0) goto L_0x023d
            com.google.android.gms.f.k r6 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r6.<init>(r1)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.database.Cursor r5 = r5.f390462a     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.f.k r7 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r7.<init>(r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.Parcel r5 = r4.mo17260gA()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.p445a.C8850c.m23499h(r5, r6)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r5.writeString(r3)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r5.writeInt(r2)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.p445a.C8850c.m23499h(r5, r7)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r2 = 8
            android.os.Parcel r2 = r4.mo17261gT(r2, r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.IBinder r4 = r2.readStrongBinder()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r4 != 0) goto L_0x0225
            r7 = 0
            goto L_0x0238
        L_0x0225:
            java.lang.String r5 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            boolean r6 = r5 instanceof com.google.android.gms.p10793f.C144165j     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r6 == 0) goto L_0x0233
            r7 = r5
            com.google.android.gms.f.j r7 = (com.google.android.gms.p10793f.C144165j) r7     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x0238
        L_0x0233:
            com.google.android.gms.f.h r7 = new com.google.android.gms.f.h     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r7.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x0238:
            r2.recycle()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x02c1
        L_0x023d:
            com.google.android.gms.dynamite.k r2 = new com.google.android.gms.dynamite.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r4 = "No cached result cursor holder"
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x0245:
            r6 = 2
            if (r5 != r6) goto L_0x0285
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = "IDynamite loader version = 2"
            android.util.Log.w(r5, r6)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.f.k r5 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r5.<init>(r1)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.Parcel r6 = r4.mo17260gA()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.p445a.C8850c.m23499h(r6, r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r6.writeString(r3)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r6.writeInt(r2)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r2 = 4
            android.os.Parcel r2 = r4.mo17261gT(r2, r6)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.IBinder r4 = r2.readStrongBinder()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r4 != 0) goto L_0x026e
            r7 = 0
            goto L_0x0281
        L_0x026e:
            java.lang.String r5 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            boolean r6 = r5 instanceof com.google.android.gms.p10793f.C144165j     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r6 == 0) goto L_0x027c
            r7 = r5
            com.google.android.gms.f.j r7 = (com.google.android.gms.p10793f.C144165j) r7     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x0281
        L_0x027c:
            com.google.android.gms.f.h r7 = new com.google.android.gms.f.h     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r7.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x0281:
            r2.recycle()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x02c1
        L_0x0285:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r5, r6)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.gms.f.k r5 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r5.<init>(r1)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.Parcel r6 = r4.mo17260gA()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            com.google.android.p445a.C8850c.m23499h(r6, r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r6.writeString(r3)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r6.writeInt(r2)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r2 = 2
            android.os.Parcel r2 = r4.mo17261gT(r2, r6)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.os.IBinder r4 = r2.readStrongBinder()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r4 != 0) goto L_0x02ab
            r7 = 0
            goto L_0x02be
        L_0x02ab:
            java.lang.String r5 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            boolean r6 = r5 instanceof com.google.android.gms.p10793f.C144165j     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r6 == 0) goto L_0x02b9
            r7 = r5
            com.google.android.gms.f.j r7 = (com.google.android.gms.p10793f.C144165j) r7     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            goto L_0x02be
        L_0x02b9:
            com.google.android.gms.f.h r7 = new com.google.android.gms.f.h     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r7.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x02be:
            r2.recycle()     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x02c1:
            java.lang.Object r2 = com.google.android.gms.p10793f.C144166k.m234388a(r7)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            if (r2 == 0) goto L_0x02ea
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x02ce:
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x02d8
            r11.remove()
            goto L_0x02df
        L_0x02d8:
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r11.set(r1)
        L_0x02df:
            android.database.Cursor r1 = r10.f390462a
            if (r1 == 0) goto L_0x02e6
            r1.close()
        L_0x02e6:
            r8.set(r9)
            return r4
        L_0x02ea:
            com.google.android.gms.dynamite.k r2 = new com.google.android.gms.dynamite.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r4 = "Failed to load remote module."
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x02f2:
            com.google.android.gms.dynamite.k r2 = new com.google.android.gms.dynamite.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x02fa:
            r18 = r14
            com.google.android.gms.dynamite.k r2 = new com.google.android.gms.dynamite.k     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            java.lang.String r4 = "Failed to determine which loading route to use."
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x0304:
            r18 = r14
            com.google.android.gms.dynamite.k r2 = new com.google.android.gms.dynamite.k     // Catch:{ all -> 0x030e }
            java.lang.String r4 = "Remote loading disabled"
            r2.<init>(r4)     // Catch:{ all -> 0x030e }
            throw r2     // Catch:{ all -> 0x030e }
        L_0x030e:
            r0 = move-exception
            goto L_0x0313
        L_0x0310:
            r0 = move-exception
            r18 = r14
        L_0x0313:
            r2 = r0
            monitor-exit(r15)     // Catch:{ all -> 0x030e }
            throw r2     // Catch:{ RemoteException -> 0x031a, k -> 0x0318, all -> 0x0316 }
        L_0x0316:
            r0 = move-exception
            goto L_0x031f
        L_0x0318:
            r0 = move-exception
            goto L_0x032e
        L_0x031a:
            r0 = move-exception
            goto L_0x0333
        L_0x031c:
            r0 = move-exception
            r18 = r14
        L_0x031f:
            r2 = r0
            com.google.android.gms.common.util.C144005e.m234184a(r1, r2)     // Catch:{ k -> 0x033c }
            com.google.android.gms.dynamite.k r4 = new com.google.android.gms.dynamite.k     // Catch:{ k -> 0x033c }
            java.lang.String r5 = "Failed to load remote module."
            r4.<init>(r5, r2)     // Catch:{ k -> 0x033c }
            throw r4     // Catch:{ k -> 0x033c }
        L_0x032b:
            r0 = move-exception
            r18 = r14
        L_0x032e:
            r2 = r0
            throw r2     // Catch:{ k -> 0x033c }
        L_0x0330:
            r0 = move-exception
            r18 = r14
        L_0x0333:
            r2 = r0
            com.google.android.gms.dynamite.k r4 = new com.google.android.gms.dynamite.k     // Catch:{ k -> 0x033c }
            java.lang.String r5 = "Failed to load remote module."
            r4.<init>(r5, r2)     // Catch:{ k -> 0x033c }
            throw r4     // Catch:{ k -> 0x033c }
        L_0x033c:
            r0 = move-exception
            goto L_0x0341
        L_0x033e:
            r0 = move-exception
            r18 = r14
        L_0x0341:
            r2 = r0
            java.lang.String r4 = r2.getMessage()     // Catch:{ all -> 0x03d6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d6 }
            r5.<init>()     // Catch:{ all -> 0x03d6 }
            java.lang.String r6 = "Failed to load remote module: "
            r5.append(r6)     // Catch:{ all -> 0x03d6 }
            r5.append(r4)     // Catch:{ all -> 0x03d6 }
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x03d6 }
            android.util.Log.w(r4, r5)     // Catch:{ all -> 0x03d6 }
            r4 = r18
            int r4 = r4.f390464a     // Catch:{ all -> 0x03d6 }
            if (r4 == 0) goto L_0x0398
            com.google.android.gms.dynamite.j r5 = new com.google.android.gms.dynamite.j     // Catch:{ all -> 0x03d6 }
            r5.<init>(r4)     // Catch:{ all -> 0x03d6 }
            r4 = r20
            com.google.android.gms.dynamite.m r4 = r4.mo119692a(r1, r3, r5)     // Catch:{ all -> 0x03d6 }
            int r4 = r4.f390466c     // Catch:{ all -> 0x03d6 }
            r5 = -1
            if (r4 != r5) goto L_0x0398
            com.google.android.gms.dynamite.DynamiteModule r1 = m234356f(r1, r3)     // Catch:{ all -> 0x03d6 }
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0382
            java.lang.ThreadLocal r2 = f390455l
            r2.remove()
            goto L_0x038b
        L_0x0382:
            java.lang.ThreadLocal r2 = f390455l
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r2.set(r3)
        L_0x038b:
            android.database.Cursor r2 = r10.f390462a
            if (r2 == 0) goto L_0x0392
            r2.close()
        L_0x0392:
            java.lang.ThreadLocal r2 = f390454k
            r2.set(r9)
            return r1
        L_0x0398:
            com.google.android.gms.dynamite.k r1 = new com.google.android.gms.dynamite.k     // Catch:{ all -> 0x03d6 }
            java.lang.String r3 = "Remote load failed. No local fallback found."
            r1.<init>(r3, r2)     // Catch:{ all -> 0x03d6 }
            throw r1     // Catch:{ all -> 0x03d6 }
        L_0x03a0:
            com.google.android.gms.dynamite.k r1 = new com.google.android.gms.dynamite.k     // Catch:{ all -> 0x03d6 }
            java.lang.String r2 = "VersionPolicy returned invalid code:0"
            r1.<init>(r2)     // Catch:{ all -> 0x03d6 }
            throw r1     // Catch:{ all -> 0x03d6 }
        L_0x03a8:
            r4 = r14
            com.google.android.gms.dynamite.k r1 = new com.google.android.gms.dynamite.k     // Catch:{ all -> 0x03d6 }
            int r2 = r4.f390464a     // Catch:{ all -> 0x03d6 }
            int r4 = r4.f390465b     // Catch:{ all -> 0x03d6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d6 }
            r6 = r16
            r5.<init>(r6)     // Catch:{ all -> 0x03d6 }
            r5.append(r3)     // Catch:{ all -> 0x03d6 }
            java.lang.String r3 = " found. Local version is "
            r5.append(r3)     // Catch:{ all -> 0x03d6 }
            r5.append(r2)     // Catch:{ all -> 0x03d6 }
            java.lang.String r2 = " and remote version is "
            r5.append(r2)     // Catch:{ all -> 0x03d6 }
            r5.append(r4)     // Catch:{ all -> 0x03d6 }
            java.lang.String r2 = "."
            r5.append(r2)     // Catch:{ all -> 0x03d6 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x03d6 }
            r1.<init>(r2)     // Catch:{ all -> 0x03d6 }
            throw r1     // Catch:{ all -> 0x03d6 }
        L_0x03d6:
            r0 = move-exception
            r1 = r0
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x03e4
            java.lang.ThreadLocal r2 = f390455l
            r2.remove()
            goto L_0x03ed
        L_0x03e4:
            java.lang.ThreadLocal r2 = f390455l
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r2.set(r3)
        L_0x03ed:
            android.database.Cursor r2 = r10.f390462a
            if (r2 == 0) goto L_0x03f4
            r2.close()
        L_0x03f4:
            java.lang.ThreadLocal r2 = f390454k
            r2.set(r9)
            goto L_0x03fb
        L_0x03fa:
            throw r1
        L_0x03fb:
            goto L_0x03fa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m234354d(android.content.Context, com.google.android.gms.dynamite.n, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (m234358h(r10) != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00de  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m234355e(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f390455l     // Catch:{ Exception -> 0x009d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x009d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x009d }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x009d }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x009d }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x009d }
            r12.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x009d }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x009d }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x009d }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x009d }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x009d }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x009d }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x009d }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x009d }
            if (r10 == 0) goto L_0x00a5
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            if (r11 == 0) goto L_0x00a5
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            if (r12 <= 0) goto L_0x008d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008a }
            f390450g = r2     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008a }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008a }
            f390452i = r2     // Catch:{ all -> 0x008a }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008a }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f390451h = r9     // Catch:{ all -> 0x008a }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            boolean r1 = m234358h(r10)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            if (r1 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008a:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r11     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
        L_0x008d:
            r0 = r10
        L_0x008e:
            if (r13 == 0) goto L_0x009f
            if (r11 != 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            com.google.android.gms.dynamite.k r10 = new com.google.android.gms.dynamite.k     // Catch:{ Exception -> 0x009d }
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch:{ Exception -> 0x009d }
            throw r10     // Catch:{ Exception -> 0x009d }
        L_0x009b:
            r10 = move-exception
            goto L_0x00dc
        L_0x009d:
            r10 = move-exception
            goto L_0x00bb
        L_0x009f:
            if (r0 == 0) goto L_0x00a4
            r0.close()
        L_0x00a4:
            return r12
        L_0x00a5:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            com.google.android.gms.dynamite.k r11 = new com.google.android.gms.dynamite.k     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
            throw r11     // Catch:{ Exception -> 0x00b8, all -> 0x00b4 }
        L_0x00b4:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x00dc
        L_0x00b8:
            r11 = move-exception
            r0 = r10
            r10 = r11
        L_0x00bb:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.C144149k     // Catch:{ all -> 0x009b }
            if (r11 == 0) goto L_0x00c1
            throw r10     // Catch:{ all -> 0x009b }
        L_0x00c1:
            com.google.android.gms.dynamite.k r11 = new com.google.android.gms.dynamite.k     // Catch:{ all -> 0x009b }
            java.lang.String r12 = r10.getMessage()     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r13.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "V2 version check failed: "
            r13.append(r1)     // Catch:{ all -> 0x009b }
            r13.append(r12)     // Catch:{ all -> 0x009b }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x009b }
            r11.<init>(r12, r10)     // Catch:{ all -> 0x009b }
            throw r11     // Catch:{ all -> 0x009b }
        L_0x00dc:
            if (r0 == 0) goto L_0x00e1
            r0.close()
        L_0x00e1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m234355e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: f */
    private static DynamiteModule m234356f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m234357g(java.lang.ClassLoader r2) {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r2 != 0) goto L_0x0019
            r2 = 0
            goto L_0x002d
        L_0x0019:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            boolean r1 = r0 instanceof com.google.android.gms.dynamite.C144154p     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r2 = r0
            com.google.android.gms.dynamite.p r2 = (com.google.android.gms.dynamite.C144154p) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            goto L_0x002d
        L_0x0027:
            com.google.android.gms.dynamite.p r0 = new com.google.android.gms.dynamite.p     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r2 = r0
        L_0x002d:
            f390458o = r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            return
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r2 = move-exception
            goto L_0x0039
        L_0x0034:
            r2 = move-exception
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            goto L_0x0039
        L_0x0038:
            r2 = move-exception
        L_0x0039:
            com.google.android.gms.dynamite.k r0 = new com.google.android.gms.dynamite.k
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m234357g(java.lang.ClassLoader):void");
    }

    /* renamed from: h */
    private static boolean m234358h(Cursor cursor) {
        C144147i iVar = (C144147i) f390454k.get();
        if (iVar == null || iVar.f390462a != null) {
            return false;
        }
        iVar.f390462a = cursor;
        return true;
    }

    /* renamed from: i */
    private static boolean m234359i(Context context) {
        if (Boolean.TRUE.equals((Object) null) || Boolean.TRUE.equals(f390453j)) {
            return true;
        }
        boolean z = false;
        if (f390453j == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C143876h.f389991d.mo119362j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f390453j = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f390451h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* renamed from: j */
    private static C144153o m234360j(Context context) {
        C144153o oVar;
        synchronized (DynamiteModule.class) {
            C144153o oVar2 = f390457n;
            if (oVar2 != null) {
                return oVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    oVar = queryLocalInterface instanceof C144153o ? (C144153o) queryLocalInterface : new C144153o(iBinder);
                }
                if (oVar != null) {
                    f390457n = oVar;
                    return oVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: c */
    public final IBinder mo119687c(String str) {
        try {
            return (IBinder) this.f390459e.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C144149k("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
