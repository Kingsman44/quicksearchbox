package dagger.hilt.android.internal.p5302a;

import android.os.Bundle;
import androidx.lifecycle.C2319a;
import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2362bj;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4091g;
import com.google.android.apps.gsa.binaries.satin.app.ayx;
import java.util.Map;
import java.util.Set;

/* renamed from: dagger.hilt.android.internal.a.e */
/* compiled from: PG */
public final class C68306e implements C2363bk {

    /* renamed from: a */
    private final Set f184647a;

    /* renamed from: b */
    private final C2363bk f184648b;

    /* renamed from: c */
    private final C2319a f184649c;

    /* renamed from: dagger.hilt.android.internal.a.e$a */
    /* compiled from: PG */
    public interface C68307a {
        /* renamed from: a */
        Map mo60320a();
    }

    public C68306e(C4091g gVar, Bundle bundle, Set set, C2363bk bkVar, ayx ayx) {
        this.f184647a = set;
        this.f184648b = bkVar;
        this.f184649c = new C68305d(gVar, bundle, ayx);
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        if (this.f184647a.contains(cls.getName())) {
            return this.f184649c.mo634a(cls);
        }
        return this.f184648b.mo634a(cls);
    }

    /* renamed from: b */
    public final /* synthetic */ C2358bf mo635b(Class cls, C2322c cVar) {
        return C2362bj.m6360a(this, cls);
    }
}
