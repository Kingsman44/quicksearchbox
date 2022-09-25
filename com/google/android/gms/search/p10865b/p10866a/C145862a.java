package com.google.android.gms.search.p10865b.p10866a;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.search.C145915i;

/* renamed from: com.google.android.gms.search.b.a.a */
/* compiled from: PG */
public abstract class C145862a extends C143887ac {

    /* renamed from: a */
    private final String f394403a;

    public C145862a(Context context, Looper looper, int i, C143944s sVar, C143726aa aaVar, C143789cj cjVar, C145915i iVar) {
        super(context, looper, i, sVar, aaVar, cjVar);
        this.f394403a = iVar != null ? iVar.f394479a : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.icing.INDEX_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        Bundle bundle = new Bundle();
        bundle.putString("ComponentName", this.f394403a);
        return bundle;
    }

    /* renamed from: m */
    public final IInterface mo122241m() {
        try {
            return mo119451G();
        } catch (IllegalStateException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        }
    }
}
