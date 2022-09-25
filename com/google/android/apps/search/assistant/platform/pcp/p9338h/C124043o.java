package com.google.android.apps.search.assistant.platform.pcp.p9338h;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3803ag.p3809c.C48927aa;
import com.google.assistant.p3803ag.p3809c.C48932af;
import com.google.assistant.p3803ag.p3809c.C48933ag;
import com.google.assistant.p3803ag.p3809c.C48939am;
import com.google.assistant.p3803ag.p3809c.C48949aw;
import com.google.assistant.p3803ag.p3809c.C48951ay;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48966bm;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.h.o */
/* compiled from: PG */
public final class C124043o {

    /* renamed from: a */
    public final C58974d f342617a;

    /* renamed from: b */
    public final C21370a f342618b;

    /* renamed from: c */
    public final Context f342619c;

    public C124043o(C21370a aVar, C130603a aVar2, Context context) {
        this.f342618b = aVar;
        this.f342617a = aVar2.mo109740b(this);
        this.f342619c = context;
    }

    /* renamed from: a */
    public static void m203464a(C48952az azVar, C58526ih ihVar) {
        C48971br brVar;
        C48939am amVar;
        C48932af afVar;
        C48951ay ayVar;
        C48951ay ayVar2;
        C48952az azVar2;
        C124041m mVar = C124041m.TIME;
        int i = azVar.f126659a;
        int b = C48949aw.m85320b(i);
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                brVar = (C48971br) azVar.f126660b;
            } else {
                brVar = C48971br.f126689d;
            }
            int i3 = brVar.f126691a;
            int a = C48966bm.m85328a(i3);
            int i4 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i4 == 0 || i4 == 1) {
                ihVar.mo55373c(C124041m.TIME);
            } else if (i4 == 8) {
                ihVar.mo55373c(C124041m.PHONE_LOCK_STATE);
            } else if (i4 == 10) {
                if (i3 == 13) {
                    amVar = (C48939am) brVar.f126692b;
                } else {
                    amVar = C48939am.f126628c;
                }
                int a2 = C48933ag.m85310a(amVar.f126630a);
                int i5 = a2 - 1;
                if (a2 == 0) {
                    throw null;
                } else if (i5 == 0) {
                    ihVar.mo55373c(C124041m.WIRED_HEADPHONES_STATE);
                } else if (i5 == 1) {
                    ihVar.mo55373c(C124041m.BLUETOOTH_A2DP_STATE);
                }
            } else if (i4 == 11) {
                if (i3 == 14) {
                    afVar = (C48932af) brVar.f126692b;
                } else {
                    afVar = C48932af.f126610e;
                }
                int a3 = C48927aa.m85308a(afVar.f126614c);
                int i6 = a3 - 1;
                if (a3 == 0) {
                    throw null;
                } else if (i6 == 0) {
                    ihVar.mo55373c(C124041m.INSTALLED_APPS);
                } else if (i6 == 1) {
                    ihVar.mo55373c(C124041m.FOREGROUND_APP);
                }
            }
        } else if (i2 == 1) {
            if (i == 2) {
                ayVar = (C48951ay) azVar.f126660b;
            } else {
                ayVar = C48951ay.f126654b;
            }
            m203465b(ayVar, ihVar);
        } else if (i2 == 2) {
            if (i == 3) {
                ayVar2 = (C48951ay) azVar.f126660b;
            } else {
                ayVar2 = C48951ay.f126654b;
            }
            m203465b(ayVar2, ihVar);
        } else if (i2 == 3) {
            if (i == 4) {
                azVar2 = (C48952az) azVar.f126660b;
            } else {
                azVar2 = C48952az.f126657c;
            }
            m203464a(azVar2, ihVar);
        }
    }

    /* renamed from: b */
    private static void m203465b(C48951ay ayVar, C58526ih ihVar) {
        for (C48952az a : ayVar.f126656a) {
            m203464a(a, ihVar);
        }
    }
}
