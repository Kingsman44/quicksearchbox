package com.google.android.apps.gsa.staticplugins.p7967h.p7968a;

import android.location.Location;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.p6487s3.producers.C84300aa;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.search.core.google.C85975du;
import com.google.android.apps.gsa.speech.helper.C92304b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.a.a */
/* compiled from: PG */
public final class C101436a implements C92304b {

    /* renamed from: a */
    private static final C59071e f283006a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.h.a.a");

    /* renamed from: b */
    private final C74637ae f283007b;

    /* renamed from: c */
    private final C85881bd f283008c;

    /* renamed from: d */
    private final C84300aa f283009d = new C84300aa(5000);

    /* renamed from: e */
    private final C58833ax f283010e;

    /* renamed from: f */
    private final boolean f283011f;

    public C101436a(boolean z, C58833ax axVar, C74637ae aeVar, C85881bd bdVar) {
        this.f283007b = aeVar;
        this.f283008c = bdVar;
        this.f283011f = z;
        this.f283010e = axVar;
    }

    /* renamed from: a */
    public final String mo78321a() {
        Location location;
        C39226b bVar;
        if (!mo78322b()) {
            location = null;
        } else {
            if (this.f283010e.mo56113h()) {
                bVar = (C39226b) this.f283010e.mo56107c();
            } else {
                bVar = C39226b.TAG_CLASSIC_ASSISTANT_CLIENTSYNC_LO;
            }
            try {
                location = (Location) this.f283009d.mo77841a(this.f283007b.mo71022f(0, bVar));
            } catch (Exception unused) {
                C59104x c = f283006a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ACS.LocationHelper");
                ((C59052c) ((C59052c) c).mo56372aa(13933)).mo56386p("Failed to get latest location from GmsCore,fails back to LocationOracle cached location.");
                location = this.f283007b.mo71018a();
            }
        }
        C85975du duVar = new C85975du();
        duVar.f232481a = location;
        return duVar.mo79631a();
    }

    /* renamed from: b */
    public final boolean mo78322b() {
        return this.f283008c.mo79514e(true) && this.f283011f;
    }
}
