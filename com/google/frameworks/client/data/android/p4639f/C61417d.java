package com.google.frameworks.client.data.android.p4639f;

import android.content.Context;
import android.os.StrictMode;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58801sm;
import dagger.p5294a.C68221g;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.ExperimentalCronetEngine;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.frameworks.client.data.android.f.d */
/* compiled from: PG */
public final /* synthetic */ class C61417d {
    /* renamed from: a */
    public static void m94027a(C58833ax axVar, ExperimentalCronetEngine.Builder builder) {
        C61419f fVar = (C61419f) ((C58847bk) axVar).f156646a;
        if (fVar.mo58038n()) {
            builder.enableHttpCache(1, (long) fVar.mo58017b());
        } else {
            builder.enableHttpCache(0, 0);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static ExperimentalCronetEngine.Builder m94028b(Context context, Set set, Set set2, C58833ax axVar, C69464a aVar) {
        C61419f fVar = (C61419f) ((C58847bk) axVar).f156646a;
        if (fVar.mo58019d() != null) {
            context = fVar.mo58019d();
        }
        ExperimentalCronetEngine.Builder a = fVar.mo58020e() != null ? fVar.mo58020e().mo58039a() : null;
        if (a == null) {
            a = new ExperimentalCronetEngine.Builder(context);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C61422i iVar = (C61422i) it.next();
            a.addQuicHint(iVar.mo58034c(), iVar.mo58033b(), iVar.mo58032a());
        }
        C58833ax axVar2 = (C58833ax) ((C68221g) aVar).f184583a;
        if (axVar2.mo56113h() && set2.isEmpty()) {
            throw new IllegalArgumentException("Google digests were provided, but no hostnames were pinned - this is either a security vulnerability or a waste of APK size. Add hostnames, or remove the dep on google digests.");
        } else if (set2.isEmpty() || axVar2.mo56113h()) {
            C58801sm G = ((C58471gg) set2).mo55229u().listIterator(0);
            while (G.hasNext()) {
                C61421h hVar = (C61421h) G.next();
                a.addPublicKeyPins(hVar.mo58040a(), (Set) axVar2.mo56107c(), hVar.mo58042c(), hVar.mo58041b());
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                C61419f fVar2 = (C61419f) ((C58847bk) axVar).f156646a;
                a.enableQuic(fVar2.mo58030m());
                a.enableBrotli(fVar2.mo58026i());
                if (fVar2.mo58024h() != null) {
                    a.setLibraryLoader(fVar2.mo58024h());
                }
                if (fVar2.mo58022f() != null) {
                    a.setExperimentalOptions(fVar2.mo58022f());
                }
                if (fVar2.mo58018c() != 20) {
                    a.setThreadPriority(fVar2.mo58018c());
                }
                StrictMode.setThreadPolicy(threadPolicy);
                return a;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Pinning was requested, but digests weren't provided. Add a dependency on the google digests.");
        }
    }
}
