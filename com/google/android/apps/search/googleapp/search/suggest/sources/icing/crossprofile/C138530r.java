package com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142584i;
import com.google.android.enterprise.connectedapps.internal.C142587l;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.r */
/* compiled from: PG */
public final class C138530r {

    /* renamed from: a */
    public final BundleCallReceiver f376785a = new BundleCallReceiver();

    /* renamed from: a */
    public final byte[] mo114308a(Context context, long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        try {
            Bundle preparedCall = this.f376785a.getPreparedCall(j, i, bArr);
            if (j2 == 1391980638012389919L) {
                Context applicationContext = context.getApplicationContext();
                C142587l[] lVarArr = C138518g.f376764a.f376766c;
                if (i2 < 2) {
                    return this.f376785a.prepareResponse(j, lVarArr[i2].mo86984a(applicationContext, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            }
            throw new IllegalArgumentException("Unknown type identifier " + j2);
        } catch (RuntimeException e) {
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", e);
            byte[] prepareResponse = this.f376785a.prepareResponse(j, bundle);
            C142584i.m231220a(e);
            return prepareResponse;
        } catch (Error e2) {
            Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
            bundle2.putSerializable("throwable", e2);
            byte[] prepareResponse2 = this.f376785a.prepareResponse(j, bundle2);
            C142584i.m231221b();
            return prepareResponse2;
        }
    }
}
