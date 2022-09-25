package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import dagger.hilt.android.C68291a;
import dagger.hilt.android.internal.managers.C68317c;
import dagger.hilt.android.p5300a.C68293b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: dagger.hilt.android.internal.managers.e */
/* compiled from: PG */
public final class C68321e implements C68288b {

    /* renamed from: a */
    private final Activity f184668a;

    /* renamed from: b */
    private volatile C68293b f184669b;

    /* renamed from: c */
    private final Object f184670c = new Object();

    public C68321e(Context context) {
        this.f184668a = (Activity) context;
    }

    /* renamed from: jN */
    public final /* bridge */ /* synthetic */ Object mo17653jN() {
        if (this.f184669b == null) {
            synchronized (this.f184670c) {
                if (this.f184669b == null) {
                    if (this.f184669b == null) {
                        Object lastNonConfigurationInstance = this.f184668a.getLastNonConfigurationInstance();
                        if (lastNonConfigurationInstance != null) {
                            this.f184669b = (C68293b) lastNonConfigurationInstance;
                        } else {
                            this.f184669b = ((C68317c.C68318a) C68291a.m98633a(this.f184668a, C68317c.C68318a.class)).mo60326rY().mo69395a();
                        }
                    }
                    this.f184669b = this.f184669b;
                }
            }
        }
        return this.f184669b;
    }
}
