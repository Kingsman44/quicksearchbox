package com.google.android.libraries.search.p2904c.p2916e.p2925c;

import android.os.ParcelFileDescriptor;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2916e.C37521a;
import com.google.android.libraries.search.p2904c.p2916e.C37557d;
import com.google.android.libraries.search.p2904c.p2916e.C37558e;
import com.google.android.libraries.search.p2904c.p2916e.C37559f;
import com.google.android.libraries.search.p2904c.p2916e.p2925c.p2926a.C37541a;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.c.e.c.d */
/* compiled from: PG */
public final class C37546d implements C37521a {

    /* renamed from: a */
    private static final C59071e f99756a = C59071e.m91332i("com.google.android.libraries.search.c.e.c.d");

    /* renamed from: b */
    private final ParcelFileDescriptor f99757b;

    /* renamed from: c */
    private C58833ax f99758c = C58836b.f156633a;

    public C37546d(ParcelFileDescriptor parcelFileDescriptor) {
        this.f99757b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final synchronized C37514du mo41002a() {
        C59071e eVar = f99756a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.PFDAudioSource");
        ((C59052c) ((C59052c) b).mo56372aa(52716)).mo56389s("#audio# close audio source(%s)", C37331f.m66337a(this));
        if (this.f99758c.mo56113h()) {
            try {
                ((C37541a) this.f99758c.mo56107c()).mo41012a();
                return C37846as.m66802h(C37516dw.CLOSED);
            } catch (IOException e) {
                C59104x d = f99756a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ALT.PFDAudioSource");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52718)).mo56389s("#audio# close audio source(%s) failed: error closing audio stream", C37331f.m66337a(this));
                return C37846as.m66801g(C37512ds.FAILED_CLOSING_AUDIO_PFD_STREAM_ERROR);
            }
        } else {
            C59104x d2 = eVar.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ALT.PFDAudioSource");
            ((C59052c) ((C59052c) d2).mo56372aa(52717)).mo56389s("#audio# close audio source(%s) failed: no audio stream", C37331f.m66337a(this));
            return C37846as.m66801g(C37512ds.FAILED_CLOSING_NO_AUDIO_PFD_STREAM);
        }
    }

    /* renamed from: b */
    public final C37558e mo41003b() {
        return new C37557d();
    }

    /* renamed from: c */
    public final synchronized C58833ax mo41004c() {
        C58833ax k;
        C59071e eVar = f99756a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.PFDAudioSource");
        ((C59052c) ((C59052c) b).mo56372aa(52721)).mo56389s("#audio# open audio source(%s)", C37331f.m66337a(this));
        if (this.f99757b != null) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ALT.PFDAudioSource");
            ((C59052c) ((C59052c) b2).mo56372aa(52719)).mo56386p("#audio# createAudioPfdStream returning AudioPfdStream");
            k = C58833ax.m90834k(new C37541a(this.f99757b));
            this.f99758c = k;
        } else {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.PFDAudioSource");
            ((C59052c) ((C59052c) d).mo56372aa(52720)).mo56386p("#audio# createAudioPfdStream failed: null file descriptor.");
            throw new C37902d("#createAudioPfdStream failed: null file descriptor.", C37846as.m66803i(C37519dz.FAILED_OPENING_FILE_DESCRIPTOR_ERROR));
        }
        return k.mo56113h() ? C58833ax.m90834k((C37559f) this.f99758c.mo56107c()) : C58836b.f156633a;
    }
}
