package com.google.android.gms.p10793f;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.f.m */
/* compiled from: PG */
public abstract class C144168m {

    /* renamed from: a */
    private final String f390478a = "com.google.android.gms.ads.adshield.AdShieldCreatorImpl";

    /* renamed from: b */
    private Object f390479b;

    protected C144168m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo117452a(IBinder iBinder);

    /* renamed from: b */
    public final Object mo119700b(Context context) {
        if (this.f390479b == null) {
            C143919bh.m233958a(context);
            Context c = C143700ab.m233441c(context);
            if (c != null) {
                try {
                    this.f390479b = mo117452a((IBinder) c.getClassLoader().loadClass(this.f390478a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new C144167l("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new C144167l("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new C144167l("Could not access creator.", e3);
                }
            } else {
                throw new C144167l();
            }
        }
        return this.f390479b;
    }
}
