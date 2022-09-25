package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142584i;
import com.google.android.enterprise.connectedapps.internal.C142587l;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.af */
/* compiled from: PG */
public final class C101724af {

    /* renamed from: a */
    public final BundleCallReceiver f283823a = new BundleCallReceiver();

    /* renamed from: a */
    public final byte[] mo92528a(Context context, long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        try {
            Bundle preparedCall = this.f283823a.getPreparedCall(j, i, bArr);
            if (j2 == -6028071782175238970L) {
                Context applicationContext = context.getApplicationContext();
                C142587l[] lVarArr = C101744l.f283840a.f283842c;
                if (i2 < 3) {
                    return this.f283823a.prepareResponse(j, lVarArr[i2].mo86984a(applicationContext, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            } else if (j2 == -1360510311192262685L) {
                Context applicationContext2 = context.getApplicationContext();
                C142587l[] lVarArr2 = C101754u.f283846a.f283848c;
                if (i2 < 2) {
                    return this.f283823a.prepareResponse(j, lVarArr2[i2].mo86984a(applicationContext2, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            } else {
                throw new IllegalArgumentException("Unknown type identifier " + j2);
            }
        } catch (RuntimeException e) {
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", e);
            byte[] prepareResponse = this.f283823a.prepareResponse(j, bundle);
            C142584i.m231220a(e);
            return prepareResponse;
        } catch (Error e2) {
            Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
            bundle2.putSerializable("throwable", e2);
            byte[] prepareResponse2 = this.f283823a.prepareResponse(j, bundle2);
            C142584i.m231221b();
            return prepareResponse2;
        }
    }
}
