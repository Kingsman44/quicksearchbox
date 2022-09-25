package com.google.android.libraries.search.p3055n.p3075e.p3077b;

import android.content.Context;
import com.google.android.libraries.assistant.soda.C19240ac;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.p1605d.C19268f;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.p3055n.p3058b.p3059a.C39278a;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5218j.C66764ae;
import com.google.speech.p5218j.C66899dp;
import com.google.speech.p5218j.C66901dr;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.e.b.e */
/* compiled from: PG */
public final class C39689e {

    /* renamed from: a */
    private static final C59071e f104455a = C59071e.m91332i("com.google.android.libraries.search.n.e.b.e");

    /* renamed from: b */
    private final C19268f f104456b;

    /* renamed from: c */
    private final C39278a f104457c;

    /* renamed from: d */
    private Optional f104458d = Optional.empty();

    /* renamed from: e */
    private volatile boolean f104459e = false;

    /* renamed from: f */
    private volatile Optional f104460f = Optional.empty();

    public C39689e(C19268f fVar, C39278a aVar) {
        this.f104456b = fVar;
        this.f104457c = aVar;
    }

    /* renamed from: d */
    private static C39687c m69138d(Context context, C19240ac acVar, C19347o oVar) {
        Soda soda = new Soda(context, oVar);
        C67150mx g = soda.mo24331g(acVar);
        C67152mz a = C67152mz.m97427a(g.f182527b);
        if (a == null) {
            a = C67152mz.NO_ERROR;
        }
        if (a != C67152mz.NO_ERROR) {
            C59052c cVar = (C59052c) ((C59052c) f104455a.mo56225c()).mo56372aa(53801);
            C67152mz a2 = C67152mz.m97427a(g.f182527b);
            if (a2 == null) {
                a2 = C67152mz.NO_ERROR;
            }
            cVar.mo56354G("Failed to initialize soda in ASR SodaPreloader: %s: %s", a2.name(), g.f182528c);
        }
        return new C39685a(soda, acVar);
    }

    /* renamed from: a */
    public final synchronized Soda mo41993a(Context context, C19240ac acVar, C19347o oVar) {
        int i;
        String str;
        String str2;
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        if (this.f104458d.isEmpty()) {
            ((C59052c) ((C59052c) f104455a.mo56224b()).mo56372aa(53800)).mo56386p("No SODA instance exists. Creating a new instance in preloader.");
            this.f104458d = Optional.m71637of(m69138d(context, acVar, oVar));
            i = 1;
        } else if (!((C39687c) this.f104458d.get()).mo41989b().equals(acVar)) {
            ((C59052c) ((C59052c) f104455a.mo56224b()).mo56372aa(53799)).mo56386p("SODA instance exists, but it has different init params. Recreating instance in preloader.");
            mo41995c();
            this.f104458d = Optional.m71637of(m69138d(context, acVar, oVar));
            i = 2;
        } else {
            ((C59052c) ((C59052c) f104455a.mo56224b()).mo56372aa(53798)).mo56386p("SODA instance exists and matches params. Updating callbacks and returning preloaded instance.");
            ((C39687c) this.f104458d.get()).mo41988a().mo24348o(oVar);
            i = 3;
        }
        this.f104459e = true;
        this.f104457c.mo41755b("Preloaded", "\tIsActive=true\n\tRequestType=".concat(C39688d.m69137a(i)));
        d.mo56162g();
        C66764ae aeVar = acVar.mo24394c().f182138j;
        if (aeVar == null) {
            aeVar = C66764ae.f181577i;
        }
        C19268f fVar = this.f104456b;
        double millis = (double) Duration.ofNanos(d.mo56159b()).toMillis();
        String a = C39688d.m69137a(i);
        String str3 = aeVar.f181580b;
        int a2 = C66899dp.m97371a(aeVar.f181581c);
        if (a2 != 0) {
            switch (a2) {
                case 1:
                    break;
                case 2:
                    str = "NGA";
                    break;
                case 3:
                    str = "AGSA_HOTWORD";
                    break;
                case 4:
                    str = "ANDROID_RECOGNITION_SERVICE";
                    break;
                case 5:
                    str = "MARBLE";
                    break;
                case 6:
                    str = "LIBASSISTANT";
                    break;
                case 7:
                    str = "GBOARD";
                    break;
                case 8:
                    str = "EMBEDDED_AUTO";
                    break;
                case 9:
                    str = "WEAR_OS";
                    break;
                case 10:
                    str = "HUB_MODE";
                    break;
                default:
                    str = "MORRIS";
                    break;
            }
        }
        str = "UNKNOWN_HOST_APP_ID";
        int a3 = C66901dr.m97372a(aeVar.f181582d);
        if (a3 != 0) {
            if (a3 != 1) {
                str2 = "FLAVOR_APA";
                ((C19569f) fVar.f53978b.mo6453a()).mo24824b(millis, a, str3, str, str2);
            }
        }
        str2 = "FLAVOR_UNKNOWN";
        ((C19569f) fVar.f53978b.mo6453a()).mo24824b(millis, a, str3, str, str2);
        return ((C39687c) this.f104458d.get()).mo41988a();
    }

    /* renamed from: b */
    public final synchronized Optional mo41994b() {
        if (this.f104458d.isPresent()) {
            return Optional.m71637of(((C39687c) this.f104458d.get()).mo41988a());
        }
        return Optional.empty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo41995c() {
        ((C59052c) ((C59052c) f104455a.mo56224b()).mo56372aa(53802)).mo56386p("Clearing SODA instance in preloader.");
        this.f104458d.ifPresent(C39686b.f104454a);
        this.f104458d = Optional.empty();
    }
}
