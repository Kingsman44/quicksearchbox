package androidx.browser.p059a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p026a.C0122d;
import android.support.p026a.C0123e;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.browser.a.j */
/* compiled from: PG */
public class C0962j {

    /* renamed from: a */
    public final Context f3064a;

    /* renamed from: b */
    public final C0122d f3065b;

    /* renamed from: c */
    private final ComponentName f3066c;

    public C0962j(C0122d dVar, ComponentName componentName, Context context) {
        this.f3065b = dVar;
        this.f3066c = componentName;
        this.f3064a = context;
    }

    /* renamed from: c */
    public static String m2897c(Context context, List list, boolean z) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    /* renamed from: d */
    public static boolean m2898d(Context context, String str, C0966n nVar) {
        nVar.f3076a = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, nVar, 33);
    }

    /* renamed from: a */
    public final Bundle mo3580a(String str, Bundle bundle) {
        Parcel obtain;
        Parcel obtain2;
        try {
            C0122d dVar = this.f3065b;
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeString(str);
            C0123e.m127a(obtain, bundle);
            dVar.f321a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle2 = (Bundle) (obtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(obtain2) : null);
            obtain2.recycle();
            obtain.recycle();
            return bundle2;
        } catch (RemoteException unused) {
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r7.recycle();
        r6.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.recycle();
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x000c, B:4:0x0020, B:14:0x0054] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x003b=Splitter:B:8:0x003b, B:18:0x006b=Splitter:B:18:0x006b} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.browser.p059a.C0967o mo3581b(androidx.browser.p059a.C0955c r9, android.app.PendingIntent r10) {
        /*
            r8 = this;
            androidx.browser.a.i r0 = new androidx.browser.a.i
            r0.<init>(r9)
            r9 = 1
            java.lang.String r1 = "android.support.customtabs.ICustomTabsService"
            r2 = 0
            r3 = 0
            if (r10 == 0) goto L_0x004a
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0086 }
            r4.<init>()     // Catch:{ RemoteException -> 0x0086 }
            java.lang.String r5 = "android.support.customtabs.extra.SESSION_ID"
            r4.putParcelable(r5, r10)     // Catch:{ RemoteException -> 0x0086 }
            android.support.a.d r5 = r8.f3065b     // Catch:{ RemoteException -> 0x0086 }
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0086 }
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0086 }
            r6.writeInterfaceToken(r1)     // Catch:{ all -> 0x0042 }
            r6.writeStrongInterface(r0)     // Catch:{ all -> 0x0042 }
            android.support.p026a.C0123e.m127a(r6, r4)     // Catch:{ all -> 0x0042 }
            android.os.IBinder r1 = r5.f321a     // Catch:{ all -> 0x0042 }
            r4 = 10
            r1.transact(r4, r6, r7, r3)     // Catch:{ all -> 0x0042 }
            r7.readException()     // Catch:{ all -> 0x0042 }
            int r1 = r7.readInt()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r9 = 0
        L_0x003b:
            r7.recycle()     // Catch:{ RemoteException -> 0x0086 }
            r6.recycle()     // Catch:{ RemoteException -> 0x0086 }
            goto L_0x0071
        L_0x0042:
            r9 = move-exception
            r7.recycle()     // Catch:{ RemoteException -> 0x0086 }
            r6.recycle()     // Catch:{ RemoteException -> 0x0086 }
            throw r9     // Catch:{ RemoteException -> 0x0086 }
        L_0x004a:
            android.support.a.d r4 = r8.f3065b     // Catch:{ RemoteException -> 0x0086 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0086 }
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0086 }
            r5.writeInterfaceToken(r1)     // Catch:{ all -> 0x007e }
            r5.writeStrongInterface(r0)     // Catch:{ all -> 0x007e }
            android.os.IBinder r1 = r4.f321a     // Catch:{ all -> 0x007e }
            r4 = 3
            r1.transact(r4, r5, r6, r3)     // Catch:{ all -> 0x007e }
            r6.readException()     // Catch:{ all -> 0x007e }
            int r1 = r6.readInt()     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r9 = 0
        L_0x006b:
            r6.recycle()     // Catch:{ RemoteException -> 0x0086 }
            r5.recycle()     // Catch:{ RemoteException -> 0x0086 }
        L_0x0071:
            if (r9 != 0) goto L_0x0074
            return r2
        L_0x0074:
            androidx.browser.a.o r9 = new androidx.browser.a.o
            android.support.a.d r1 = r8.f3065b
            android.content.ComponentName r2 = r8.f3066c
            r9.<init>(r1, r0, r2, r10)
            return r9
        L_0x007e:
            r9 = move-exception
            r6.recycle()     // Catch:{ RemoteException -> 0x0086 }
            r5.recycle()     // Catch:{ RemoteException -> 0x0086 }
            throw r9     // Catch:{ RemoteException -> 0x0086 }
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.browser.p059a.C0962j.mo3581b(androidx.browser.a.c, android.app.PendingIntent):androidx.browser.a.o");
    }
}
