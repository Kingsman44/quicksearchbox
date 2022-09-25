package com.google.android.gms.learning.dynamite.training;

import android.net.Uri;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.TrainingInterval;
import com.google.android.libraries.micore.learning.p2258a.C29693c;
import com.google.android.libraries.micore.learning.p2258a.C29694d;
import com.google.android.libraries.micore.learning.p2258a.C29695e;
import com.google.android.libraries.micore.learning.p2258a.C29696f;
import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29701k;
import com.google.android.libraries.micore.learning.p2258a.C29702l;
import com.google.android.libraries.micore.learning.p2258a.C29703m;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.gms.learning.dynamite.training.bg */
/* compiled from: PG */
public final class C144691bg {
    /* renamed from: a */
    public static TrainingInterval m235192a(C29703m mVar) {
        int a = C29702l.m54787a(mVar.f80446a);
        int i = 1;
        if (a != 0 && a == 3) {
            i = 0;
        }
        C62910ar arVar = mVar.f80447b;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        return new TrainingInterval(i, C62948a.m95453d(arVar));
    }

    /* renamed from: b */
    public static C29695e m235193b(InAppTrainerOptions inAppTrainerOptions) {
        C29694d dVar = (C29694d) C29695e.f80425d.createBuilder();
        String str = inAppTrainerOptions.f391073d;
        dVar.copyOnWrite();
        str.getClass();
        ((C29695e) dVar.instance).f80427a = str;
        int i = inAppTrainerOptions.f391074e;
        dVar.copyOnWrite();
        ((C29695e) dVar.instance).f80428b = C29693c.m54784a(m235196e(i));
        TrainingInterval trainingInterval = inAppTrainerOptions.f391079k;
        if (trainingInterval != null) {
            C29703m d = m235195d(trainingInterval);
            dVar.copyOnWrite();
            d.getClass();
            ((C29695e) dVar.instance).f80429c = d;
        }
        return (C29695e) dVar.build();
    }

    /* renamed from: c */
    public static C29697g m235194c(InAppTrainerOptions inAppTrainerOptions) {
        C29696f fVar = (C29696f) C29697g.f80430f.createBuilder();
        String uri = inAppTrainerOptions.f391075g.toString();
        fVar.copyOnWrite();
        uri.getClass();
        ((C29697g) fVar.instance).f80432a = uri;
        String uri2 = inAppTrainerOptions.f391078j.toString();
        fVar.copyOnWrite();
        uri2.getClass();
        ((C29697g) fVar.instance).f80434c = uri2;
        C29703m d = m235195d(inAppTrainerOptions.f391079k);
        fVar.copyOnWrite();
        d.getClass();
        ((C29697g) fVar.instance).f80435d = d;
        Uri uri3 = inAppTrainerOptions.f391081m;
        if (uri3 != null) {
            String uri4 = uri3.toString();
            fVar.copyOnWrite();
            uri4.getClass();
            ((C29697g) fVar.instance).f80436e = uri4;
        }
        return (C29697g) fVar.build();
    }

    /* renamed from: d */
    public static C29703m m235195d(TrainingInterval trainingInterval) {
        if (trainingInterval == null) {
            return C29703m.f80444c;
        }
        C29701k kVar = (C29701k) C29703m.f80444c.createBuilder();
        int f = m235197f(trainingInterval.f391085a);
        kVar.copyOnWrite();
        ((C29703m) kVar.instance).f80446a = f - 2;
        C62910ar j = C62948a.m95459j(trainingInterval.f391086b);
        kVar.copyOnWrite();
        j.getClass();
        ((C29703m) kVar.instance).f80447b = j;
        return (C29703m) kVar.build();
    }

    /* renamed from: e */
    public static int m235196e(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 1 : 5;
        }
        return 4;
    }

    /* renamed from: f */
    public static int m235197f(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        throw new IllegalStateException("Unknown value for scheduling mode");
    }
}
