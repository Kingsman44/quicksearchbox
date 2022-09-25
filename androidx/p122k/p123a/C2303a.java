package androidx.p122k.p123a;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: androidx.k.a.a */
/* compiled from: PG */
public abstract class C2303a extends BroadcastReceiver {

    /* renamed from: a */
    public static final SparseArray f6450a = new SparseArray();

    /* renamed from: b */
    public static int f6451b = 1;

    /* renamed from: a */
    public static void m6237a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0 || (intExtra = intent.getIntExtra("android.support.content.wakelockid", 0)) != 0) {
            SparseArray sparseArray = f6450a;
            synchronized (sparseArray) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }
}
