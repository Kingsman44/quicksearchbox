package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142584i;
import com.google.android.enterprise.connectedapps.internal.C142587l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.b */
/* compiled from: PG */
public final class C113821b {

    /* renamed from: a */
    public final BundleCallReceiver f315228a = new BundleCallReceiver();

    /* renamed from: a */
    public final byte[] mo100677a(Context context, long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        Bundle bundle;
        try {
            Bundle preparedCall = this.f315228a.getPreparedCall(j, i, bArr);
            if (j2 != 6018492542292217453L) {
                if (j2 != -7446043385737290294L) {
                    throw new IllegalArgumentException("Unknown type identifier " + j2);
                }
            }
            Context applicationContext = context.getApplicationContext();
            if (j2 == 6018492542292217453L) {
                C142587l[] lVarArr = C113817ab.f315222a.f315224c;
                if (i2 <= 0) {
                    bundle = lVarArr[i2].mo86984a(applicationContext, preparedCall, aiVar);
                } else {
                    throw new IllegalArgumentException("Invalid method identifier" + i2);
                }
            } else {
                C142587l[] lVarArr2 = C113840t.f315245a.f315247c;
                if (i2 <= 0) {
                    bundle = lVarArr2[i2].mo86984a(applicationContext, preparedCall, aiVar);
                } else {
                    throw new IllegalArgumentException("Invalid method identifier" + i2);
                }
            }
            return this.f315228a.prepareResponse(j, bundle);
        } catch (RuntimeException e) {
            Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
            bundle2.putSerializable("throwable", e);
            byte[] prepareResponse = this.f315228a.prepareResponse(j, bundle2);
            C142584i.m231220a(e);
            return prepareResponse;
        } catch (Error e2) {
            Bundle bundle3 = new Bundle(Bundler.class.getClassLoader());
            bundle3.putSerializable("throwable", e2);
            byte[] prepareResponse2 = this.f315228a.prepareResponse(j, bundle3);
            C142584i.m231221b();
            return prepareResponse2;
        }
    }
}
