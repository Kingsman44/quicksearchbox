package com.google.android.libraries.search.p2904c.p2916e.p2925c;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.p5836c.C74455f;
import com.google.android.libraries.p11029ao.p11032c.C147805f;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
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
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.c.e.c.m */
/* compiled from: PG */
public final class C37555m implements C37521a {

    /* renamed from: a */
    private static final C59071e f99793a = C59071e.m91332i("com.google.android.libraries.search.c.e.c.m");

    /* renamed from: b */
    private final String f99794b;

    /* renamed from: c */
    private final Context f99795c;

    /* renamed from: d */
    private C58833ax f99796d = C58836b.f156633a;

    public C37555m(String str, Context context) {
        this.f99794b = str;
        this.f99795c = context;
    }

    /* renamed from: a */
    public final synchronized C37514du mo41002a() {
        C59071e eVar = f99793a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
        ((C59052c) ((C59052c) b).mo56372aa(52732)).mo56389s("#audio# close audio source(%s)", C37331f.m66337a(this));
        if (this.f99796d.mo56113h()) {
            try {
                ((C37541a) this.f99796d.mo56107c()).mo41012a();
                return C37846as.m66802h(C37516dw.CLOSED);
            } catch (IOException e) {
                C59104x d = f99793a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52734)).mo56389s("#audio# close audio source(%s) failed: error closing audio stream", C37331f.m66337a(this));
                return C37846as.m66801g(C37512ds.FAILED_CLOSING_AUDIO_URI_STREAM_ERROR);
            }
        } else {
            C59104x d2 = eVar.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
            ((C59052c) ((C59052c) d2).mo56372aa(52733)).mo56389s("#audio# close audio source(%s) failed: no audio stream", C37331f.m66337a(this));
            return C37846as.m66801g(C37512ds.FAILED_CLOSING_NO_AUDIO_URI_STREAM);
        }
    }

    /* renamed from: b */
    public final C37558e mo41003b() {
        return new C37557d();
    }

    /* renamed from: c */
    public final synchronized C58833ax mo41004c() {
        C147805f fVar;
        C58833ax k;
        C59071e eVar = f99793a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
        ((C59052c) ((C59052c) b).mo56372aa(52743)).mo56389s("#audio# open audio source(%s)", C37331f.m66337a(this));
        Uri parse = Uri.parse(this.f99794b);
        try {
            if (C74455f.m120404a(parse)) {
                fVar = C147805f.f398780b;
            } else {
                String authority = parse.getAuthority();
                if (authority != null) {
                    ProviderInfo resolveContentProvider = this.f99795c.getPackageManager().resolveContentProvider(authority, 0);
                    if (resolveContentProvider != null) {
                        fVar = C147805f.m240906a(resolveContentProvider.packageName);
                    } else {
                        C59104x d = eVar.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
                        ((C59052c) ((C59052c) d).mo56372aa(52740)).mo56386p("#audio# createAudioUriStream failed: content provider not found.");
                        throw new C37902d("#createAudioUriStream failed: content provider not found.", C37846as.m66803i(C37519dz.FAILED_OPENING_CONTENT_PROVIDER_NOT_FOUND));
                    }
                } else {
                    C59104x d2 = eVar.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
                    ((C59052c) ((C59052c) d2).mo56372aa(52741)).mo56386p("#audio# createAudioUriStream failed: URI authority absent.");
                    throw new C37902d("#createAudioUriStream failed: URI authority absent.", C37846as.m66803i(C37519dz.FAILED_OPENING_URI_AUTHORITY_ABSENT));
                }
            }
            AssetFileDescriptor a = C147806g.m240907a(this.f99795c, parse, C33259r.f88929b, fVar);
            if (a != null) {
                ParcelFileDescriptor parcelFileDescriptor = a.getParcelFileDescriptor();
                if (parcelFileDescriptor != null) {
                    C59104x b2 = eVar.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
                    ((C59052c) ((C59052c) b2).mo56372aa(52735)).mo56386p("#audio# createAudioUriStream returning AudioPfdStream");
                    k = C58833ax.m90834k(new C37541a(parcelFileDescriptor));
                    this.f99796d = k;
                } else {
                    C59104x d3 = eVar.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
                    ((C59052c) ((C59052c) d3).mo56372aa(52738)).mo56386p("#audio# createAudioUriStream failed: opening file descriptor failed.");
                    throw new C37902d("#createAudioUriStream failed: opening file descriptor failed.", C37846as.m66803i(C37519dz.FAILED_OPENING_FILE_DESCRIPTOR_ERROR));
                }
            } else {
                C59104x d4 = eVar.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
                ((C59052c) ((C59052c) d4).mo56372aa(52739)).mo56386p("#audio# createAudioUriStream failed: opening file descriptor failed.");
                throw new C37902d("#createAudioUriStream failed: opening file descriptor failed.", C37846as.m66803i(C37519dz.FAILED_OPENING_FILE_DESCRIPTOR_ERROR));
            }
        } catch (SecurityException e) {
            C59104x d5 = f99793a.mo56226d();
            d5.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
            ((C59052c) ((C59052c) d5).mo56372aa(52736)).mo56386p("#audio# createAudioUriStream failed: error opening file descriptor.");
            throw new C37902d("#createAudioUriStream failed: error opening file descriptor.", C37846as.m66803i(C37519dz.FAILED_OPENING_FILE_SECURITY), e);
        } catch (FileNotFoundException e2) {
            C59104x d6 = f99793a.mo56226d();
            d6.mo56378ag(C58975e.f156826a, "ALT.URIAudioSource");
            ((C59052c) ((C59052c) d6).mo56372aa(52737)).mo56386p("#audio# createAudioUriStream failed: file not found.");
            throw new C37902d("#createAudioUriStream failed: file not found.", C37846as.m66803i(C37519dz.FAILED_OPENING_FILE_NOT_FOUND), e2);
        }
        return k.mo56113h() ? C58833ax.m90834k((C37559f) this.f99796d.mo56107c()) : C58836b.f156633a;
    }
}
