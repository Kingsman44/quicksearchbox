package com.google.android.apps.search.assistant.surfaces.dictation.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.C119331j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.C125343u;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142584i;
import com.google.android.enterprise.connectedapps.internal.C142587l;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.crossprofile.b */
/* compiled from: PG */
public final class C125179b {

    /* renamed from: a */
    public final BundleCallReceiver f345328a = new BundleCallReceiver();

    /* renamed from: a */
    public final byte[] mo106822a(Context context, long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        try {
            Bundle preparedCall = this.f345328a.getPreparedCall(j, i, bArr);
            if (j2 == 4441183631946776897L) {
                Context applicationContext = context.getApplicationContext();
                C142587l[] lVarArr = C119331j.f332718a.f332720c;
                if (i2 < 2) {
                    return this.f345328a.prepareResponse(j, lVarArr[i2].mo86984a(applicationContext, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            } else if (j2 == -5410975862190968627L) {
                Context applicationContext2 = context.getApplicationContext();
                C142587l[] lVarArr2 = C125343u.f345716a.f345718c;
                if (i2 < 4) {
                    return this.f345328a.prepareResponse(j, lVarArr2[i2].mo86984a(applicationContext2, preparedCall, aiVar));
                }
                throw new IllegalArgumentException("Invalid method identifier" + i2);
            } else {
                throw new IllegalArgumentException("Unknown type identifier " + j2);
            }
        } catch (RuntimeException e) {
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", e);
            byte[] prepareResponse = this.f345328a.prepareResponse(j, bundle);
            C142584i.m231220a(e);
            return prepareResponse;
        } catch (Error e2) {
            Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
            bundle2.putSerializable("throwable", e2);
            byte[] prepareResponse2 = this.f345328a.prepareResponse(j, bundle2);
            C142584i.m231221b();
            return prepareResponse2;
        }
    }
}
