package com.google.android.apps.gsa.opa.smartspace.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110575ah;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110589au;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110613bq;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110627cc;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142584i;
import com.google.android.enterprise.connectedapps.internal.C142587l;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.crossprofile.d */
/* compiled from: PG */
public final class C83756d {

    /* renamed from: a */
    public final BundleCallReceiver f228293a = new BundleCallReceiver();

    /* renamed from: a */
    public final byte[] mo77090a(Context context, long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        try {
            Bundle preparedCall = this.f228293a.getPreparedCall(j, i, bArr);
            if (j2 == 5367002715227671530L) {
                Context applicationContext = context.getApplicationContext();
                C142587l[] lVarArr = C110575ah.f308247a.f308249c;
                if (i2 < 8) {
                    return this.f228293a.prepareResponse(j, lVarArr[i2].mo86984a(applicationContext, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            } else if (j2 == -6570574682266572963L) {
                Context applicationContext2 = context.getApplicationContext();
                C142587l[] lVarArr2 = C110613bq.f308283a.f308285c;
                if (i2 < 6) {
                    return this.f228293a.prepareResponse(j, lVarArr2[i2].mo86984a(applicationContext2, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            } else if (j2 == -3686767252661019653L) {
                Context applicationContext3 = context.getApplicationContext();
                C142587l[] lVarArr3 = C110589au.f308256a.f308258c;
                if (i2 < 2) {
                    return this.f228293a.prepareResponse(j, lVarArr3[i2].mo86984a(applicationContext3, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            } else if (j2 == -2407921657992417870L) {
                Context applicationContext4 = context.getApplicationContext();
                C142587l[] lVarArr4 = C110627cc.f308292a.f308294c;
                if (i2 <= 0) {
                    return this.f228293a.prepareResponse(j, lVarArr4[i2].mo86984a(applicationContext4, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            } else {
                throw new IllegalArgumentException("Unknown type identifier " + j2);
            }
        } catch (RuntimeException e) {
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", e);
            byte[] prepareResponse = this.f228293a.prepareResponse(j, bundle);
            C142584i.m231220a(e);
            return prepareResponse;
        } catch (Error e2) {
            Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
            bundle2.putSerializable("throwable", e2);
            byte[] prepareResponse2 = this.f228293a.prepareResponse(j, bundle2);
            C142584i.m231221b();
            return prepareResponse2;
        }
    }
}
