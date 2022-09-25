package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.c */
/* compiled from: PG */
public final class C94942c {

    /* renamed from: a */
    public static final C59071e f265580a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.e.c");

    /* renamed from: b */
    public static final Uri f265581b;

    /* renamed from: h */
    private static final String f265582h;

    /* renamed from: c */
    final C60888db f265583c;

    /* renamed from: d */
    final Executor f265584d;

    /* renamed from: e */
    public volatile C60870cx f265585e;

    /* renamed from: f */
    public volatile ParcelFileDescriptor[] f265586f;

    /* renamed from: g */
    public volatile OutputStream f265587g;

    static {
        String format = String.format("content://%s", new Object[]{"com.google.android.apps.gsa.voiceinteraction.hotword.HotwordAudioProvider"});
        f265582h = format;
        f265581b = Uri.parse(format);
    }

    public C94942c(C60888db dbVar, Executor executor) {
        this.f265583c = dbVar;
        this.f265584d = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo88852a() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f265585e;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f265585e = null;
        }
        OutputStream outputStream = this.f265587g;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                C59104x b = f265580a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AudioHandler");
                ((C59052c) ((C59052c) b).mo56372aa(17655)).mo56386p("Error closing output channel");
            }
        }
        this.f265587g = null;
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f265586f;
        if (parcelFileDescriptorArr != null) {
            try {
                parcelFileDescriptorArr[0].close();
            } catch (IOException unused2) {
                C59104x b2 = f265580a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "AudioHandler");
                ((C59052c) ((C59052c) b2).mo56372aa(17659)).mo56386p("Failed to close read stream");
            }
            try {
                parcelFileDescriptorArr[1].close();
            } catch (IOException unused3) {
                C59104x b3 = f265580a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "AudioHandler");
                ((C59052c) ((C59052c) b3).mo56372aa(17658)).mo56386p("Failed to close read stream");
            }
        }
        this.f265586f = null;
    }

    /* renamed from: b */
    public final void mo88853b() {
        C59104x b = f265580a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AudioHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17661)).mo56386p("stopAudio");
        mo88852a();
    }
}
