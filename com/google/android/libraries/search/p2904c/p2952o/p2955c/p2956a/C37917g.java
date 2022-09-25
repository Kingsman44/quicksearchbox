package com.google.android.libraries.search.p2904c.p2952o.p2955c.p2956a;

import android.os.ParcelFileDescriptor;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37703if;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.android.libraries.search.p2904c.p2911c.C37423a;
import com.google.android.libraries.search.p2904c.p2911c.C37433c;
import com.google.android.libraries.search.p2904c.p2916e.C37521a;
import com.google.android.libraries.search.p2904c.p2916e.C37559f;
import com.google.android.libraries.search.p2904c.p2916e.p2925c.C37546d;
import com.google.android.libraries.search.p2904c.p2916e.p2925c.C37555m;
import com.google.android.libraries.search.p2904c.p2916e.p2925c.C37556n;
import com.google.android.libraries.search.p2904c.p2928g.C37619d;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37830ac;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.android.libraries.search.p2904c.p2952o.p2955c.C37910a;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.o.c.a.g */
/* compiled from: PG */
public final class C37917g implements C37910a {

    /* renamed from: a */
    private static final C59071e f100511a = C59071e.m91332i("com.google.android.libraries.search.c.o.c.a.g");

    /* renamed from: b */
    private final Executor f100512b;

    /* renamed from: c */
    private final C60888db f100513c;

    /* renamed from: d */
    private final C37433c f100514d;

    /* renamed from: e */
    private final C37556n f100515e;

    public C37917g(Executor executor, C60888db dbVar, C37433c cVar, C37556n nVar) {
        this.f100512b = executor;
        this.f100513c = dbVar;
        this.f100514d = cVar;
        this.f100515e = nVar;
    }

    /* renamed from: c */
    private final C37402bg m66950c(C37521a aVar, C37360ay ayVar) {
        C37519dz dzVar;
        try {
            C58833ax c = aVar.mo41004c();
            if (!c.mo56113h()) {
                return new C37830ac(C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE, C37512ds.FAILED_CLOSING_DUE_TO_FAILED_OPENING_AUDIO_SOURCE);
            }
            C37423a a = this.f100514d.mo40955a(ayVar);
            int c2 = C37329d.m66335c(ayVar);
            C58836b bVar = C58836b.f156633a;
            C58833ax k = C58833ax.m90834k(a);
            C58836b bVar2 = C58836b.f156633a;
            new C37619d(c2, bVar, k, bVar2, bVar2, C38281b.f101419a, this.f100512b).mo41033b((C37559f) c.mo56107c());
            return new C37916f(a, aVar, ayVar, this.f100513c);
        } catch (C37902d e) {
            C37561eb ebVar = e.f100480a;
            if (ebVar.f99802a == 2) {
                dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar == null) {
                    dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            return new C37830ac(dzVar, C37512ds.FAILED_CLOSING_DUE_TO_FAILED_OPENING_AUDIO_SOURCE);
        }
    }

    /* renamed from: a */
    public final C37402bg mo41148a(ParcelFileDescriptor parcelFileDescriptor, C37360ay ayVar) {
        C59104x b = f100511a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ExtSessionProvider");
        ((C59052c) ((C59052c) b).mo56372aa(52856)).mo56386p("#audio# createPfdAudioRequestListeningSession");
        return m66950c(new C37546d(parcelFileDescriptor), ayVar);
    }

    /* renamed from: b */
    public final C37402bg mo41149b(C37410bo boVar) {
        C37703if ifVar;
        C37703if ifVar2;
        C59104x b = f100511a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ExtSessionProvider");
        ((C59052c) ((C59052c) b).mo56372aa(52857)).mo56386p("#audio# createUriAudioRequestListeningSession");
        if (boVar.f99333b == 13) {
            ifVar = (C37703if) boVar.f99334c;
        } else {
            ifVar = C37703if.f100132c;
        }
        boolean z = true;
        if (1 != (ifVar.f100134a & 1)) {
            z = false;
        }
        C58838bb.m90869d(z, "AudioRequestMicInputParams must have Uri string");
        C37556n nVar = this.f100515e;
        if (boVar.f99333b == 13) {
            ifVar2 = (C37703if) boVar.f99334c;
        } else {
            ifVar2 = C37703if.f100132c;
        }
        C37555m a = nVar.mo41021a(ifVar2.f100135b);
        C37360ay ayVar = boVar.f99337f;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        return m66950c(a, ayVar);
    }
}
