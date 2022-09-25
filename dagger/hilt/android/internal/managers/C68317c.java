package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import com.google.android.apps.gsa.binaries.satin.app.C73965bw;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import dagger.hilt.android.internal.p5302a.C68308f;
import dagger.hilt.android.p5300a.C68293b;
import dagger.hilt.p5299a.C68288b;

/* renamed from: dagger.hilt.android.internal.managers.c */
/* compiled from: PG */
public final class C68317c implements C68288b {

    /* renamed from: a */
    private final C2368bp f184664a;

    /* renamed from: b */
    private volatile C68293b f184665b;

    /* renamed from: c */
    private final Object f184666c = new Object();

    /* renamed from: dagger.hilt.android.internal.managers.c$a */
    /* compiled from: PG */
    public interface C68318a {
        /* renamed from: rY */
        C73965bw mo60326rY();
    }

    /* renamed from: dagger.hilt.android.internal.managers.c$b */
    /* compiled from: PG */
    public interface C68319b {
        /* renamed from: a */
        C68308f mo60327a();
    }

    public C68317c(Context context, C47215a aVar) {
        this.f184664a = m98660a(aVar, context);
    }

    /* renamed from: a */
    private static final C2368bp m98660a(C2371bs bsVar, Context context) {
        return new C2368bp(bsVar, (C2363bk) new C68316b(context));
    }

    /* renamed from: jN */
    public final /* bridge */ /* synthetic */ Object mo17653jN() {
        if (this.f184665b == null) {
            synchronized (this.f184666c) {
                if (this.f184665b == null) {
                    this.f184665b = ((C68320d) this.f184664a.mo5770a(C68320d.class)).f184667a;
                }
            }
        }
        return this.f184665b;
    }

    public C68317c(ComponentActivity componentActivity) {
        this.f184664a = m98660a(componentActivity, componentActivity);
    }
}
