package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142584i;
import com.google.android.enterprise.connectedapps.internal.C142587l;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.e */
/* compiled from: PG */
public final class C123668e {

    /* renamed from: a */
    public final BundleCallReceiver f341632a = new BundleCallReceiver();

    /* renamed from: a */
    public final byte[] mo106092a(Context context, long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        try {
            Bundle preparedCall = this.f341632a.getPreparedCall(j, i, bArr);
            if (j2 == 6283638987313294435L) {
                Context applicationContext = context.getApplicationContext();
                C142587l[] lVarArr = C123684t.f341650a.f341652c;
                if (i2 < 4) {
                    return this.f341632a.prepareResponse(j, lVarArr[i2].mo86984a(applicationContext, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            }
            throw new IllegalArgumentException("Unknown type identifier " + j2);
        } catch (RuntimeException e) {
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", e);
            byte[] prepareResponse = this.f341632a.prepareResponse(j, bundle);
            C142584i.m231220a(e);
            return prepareResponse;
        } catch (Error e2) {
            Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
            bundle2.putSerializable("throwable", e2);
            byte[] prepareResponse2 = this.f341632a.prepareResponse(j, bundle2);
            C142584i.m231221b();
            return prepareResponse2;
        }
    }
}
