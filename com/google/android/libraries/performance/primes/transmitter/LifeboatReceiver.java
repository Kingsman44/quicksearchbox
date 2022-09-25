package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class LifeboatReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                C31617i iVar = (C31617i) C62942bv.parseFrom((C62942bv) C31617i.f85086c, byteArrayExtra, C62921ba.m95368a());
                BroadcastReceiver.PendingResult goAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(r2);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((C31618j) declaredConstructor.newInstance(new Object[0])).mo37272a(context, iVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", new Object[]{str}), th);
                    }
                }
                C60870cx o = C60856cj.m92906o(arrayList);
                Objects.requireNonNull(goAsync);
                o.mo4106b(new C31615g(goAsync), C60826bg.f164896a);
            } catch (C62974ct e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
