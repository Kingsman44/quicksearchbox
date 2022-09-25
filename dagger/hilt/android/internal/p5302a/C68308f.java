package dagger.hilt.android.internal.p5302a;

import com.google.apps.tiktok.coroutines.C46651d;
import dagger.hilt.android.C68296b;
import dagger.hilt.android.internal.C68309b;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71423ax;

/* renamed from: dagger.hilt.android.internal.a.f */
/* compiled from: PG */
public final class C68308f implements C68296b {

    /* renamed from: a */
    public final Set f184650a = new HashSet();

    /* renamed from: b */
    public boolean f184651b = false;

    /* renamed from: a */
    public final void mo60321a() {
        C68309b.m98647a();
        this.f184651b = true;
        for (C46651d dVar : this.f184650a) {
            C71423ax.m104198c(dVar.f121904a, (CancellationException) null);
        }
    }
}
