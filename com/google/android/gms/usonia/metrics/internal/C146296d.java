package com.google.android.gms.usonia.metrics.internal;

import androidx.core.p097i.C1967b;
import com.google.android.gms.usonia.directory.internal.C146268d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqi;
import com.google.common.p4552o.aqk;

/* renamed from: com.google.android.gms.usonia.metrics.internal.d */
/* compiled from: PG */
public final class C146296d implements C146298f {

    /* renamed from: a */
    public static final C59071e f395151a = C59071e.m91332i("com.google.android.gms.usonia.metrics.internal.d");

    /* renamed from: b */
    private final C146268d f395152b;

    /* renamed from: c */
    private final C1967b f395153c = C146294b.f395149a;

    public C146296d(C146268d dVar) {
        this.f395152b = dVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m238257a(Integer num) {
        if (num.intValue() != 0) {
            ((C59052c) ((C59052c) f395151a.mo56226d()).mo56372aa(42064)).mo56389s("Logging metric failed with error %s", num);
        }
    }

    /* renamed from: d */
    private final void m238258d(aqk aqk) {
        ProtoSafeParcelable protoSafeParcelable = new ProtoSafeParcelable();
        protoSafeParcelable.f395131a = aqk.toByteArray();
        this.f395152b.mo122809o(protoSafeParcelable, this.f395153c).mo122498q(new C146295c(aqk));
    }

    /* renamed from: b */
    public final void mo122861b(C146293a aVar, long j) {
        float f = (float) j;
        if (!aVar.f395147o.isEmpty()) {
            aqi aqi = (aqi) aqk.f159753e.createBuilder();
            String str = aVar.f395147o;
            aqi.copyOnWrite();
            aqk aqk = (aqk) aqi.instance;
            str.getClass();
            aqk.f159755a |= 1;
            aqk.f159756b = str;
            aqi.copyOnWrite();
            aqk aqk2 = (aqk) aqi.instance;
            aqk2.f159755a |= 4;
            aqk2.f159758d = f;
            m238258d((aqk) aqi.build());
            return;
        }
        throw new AssertionError("Provided metric constant has not defined a metric name.");
    }

    /* renamed from: c */
    public final void mo122862c(C146293a aVar, String str, long j) {
        float f = (float) j;
        if (aVar.f395147o.isEmpty()) {
            throw new AssertionError("Provided metric constant has not defined a metric name.");
        } else if (!aVar.f395148p.booleanValue()) {
            throw new IllegalArgumentException("Provided metric constant does not support secondary key, but one was provided.");
        } else if (!str.isEmpty()) {
            aqi aqi = (aqi) aqk.f159753e.createBuilder();
            String str2 = aVar.f395147o;
            aqi.copyOnWrite();
            aqk aqk = (aqk) aqi.instance;
            str2.getClass();
            aqk.f159755a |= 1;
            aqk.f159756b = str2;
            aqi.copyOnWrite();
            aqk aqk2 = (aqk) aqi.instance;
            str.getClass();
            aqk2.f159755a |= 2;
            aqk2.f159757c = str;
            aqi.copyOnWrite();
            aqk aqk3 = (aqk) aqi.instance;
            aqk3.f159755a |= 4;
            aqk3.f159758d = f;
            m238258d((aqk) aqi.build());
        } else {
            throw new IllegalArgumentException("Provided metric constant requires secondary key. Cannot be empty.");
        }
    }
}
