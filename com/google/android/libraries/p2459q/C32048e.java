package com.google.android.libraries.p2459q;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.TimeZone;
import org.p5633c.p5634a.C72288l;

/* renamed from: com.google.android.libraries.q.e */
/* compiled from: PG */
public final class C32048e extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Log.d("fast-joda", "ACTION_TIMEZONE_CHANGED received.");
        try {
            C72288l o = C72288l.m106788o(TimeZone.getDefault());
            C72288l.m106790q(o);
            String str = o.f192423d;
            Log.d("fast-joda", "Updated default timezone to " + str);
        } catch (IllegalArgumentException e) {
            Log.e("fast-joda", "Failed to update default  timezone", e);
        }
    }
}
