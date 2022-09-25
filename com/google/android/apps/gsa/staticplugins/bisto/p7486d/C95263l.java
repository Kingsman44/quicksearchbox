package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import android.content.Context;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89671n;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95357bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.l */
/* compiled from: PG */
public final class C95263l implements C89671n {

    /* renamed from: a */
    private static final C59071e f266546a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.d.l");

    /* renamed from: b */
    private boolean f266547b = false;

    /* renamed from: c */
    private final C96628d f266548c;

    /* renamed from: d */
    private final Context f266549d;

    /* renamed from: e */
    private final C95357bh f266550e;

    /* renamed from: f */
    private final C95355bf f266551f;

    /* renamed from: g */
    private int f266552g;

    public C95263l(Context context, C96628d dVar, C95357bh bhVar, C95355bf bfVar) {
        this.f266549d = context;
        this.f266548c = dVar;
        this.f266550e = bhVar;
        this.f266551f = bfVar;
    }

    /* renamed from: a */
    public final void mo83574a() {
        if (this.f266547b) {
            mo83575b();
        }
    }

    /* renamed from: b */
    public final void mo83575b() {
        this.f266550e.mo89293f(this.f266551f);
        this.f266547b = false;
    }

    /* renamed from: c */
    public final float[] mo83576c() {
        try {
            String j = this.f266548c.mo90297j("last_audio_file_uri", BuildConfig.FLAVOR);
            if (C58837ba.m90859h(j)) {
                C59104x c = f266546a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "HerbieRecorder");
                ((C59052c) ((C59052c) c).mo56372aa(14802)).mo56386p("invalid uriString");
                return new float[0];
            }
            C59071e eVar = f266546a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HerbieRecorder");
            ((C59052c) ((C59052c) b).mo56372aa(14798)).mo56389s("read from %s", j);
            InputStream b2 = C23335a.m43765b(this.f266549d.getContentResolver(), Uri.parse(j));
            if (b2 == null) {
                C59104x c2 = eVar.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "HerbieRecorder");
                ((C59052c) ((C59052c) c2).mo56372aa(14801)).mo56386p("Failed to get InputStream");
                return new float[0];
            }
            int i = this.f266552g;
            byte[] bArr = new byte[(i * 4)];
            FloatBuffer allocate = FloatBuffer.allocate(i * 10);
            while (true) {
                int read = b2.read(bArr);
                if (read >= 0) {
                    for (int i2 = 0; i2 < read; i2 += 2) {
                        allocate.put(((((float) bArr[i2 + 1]) * 256.0f) + ((float) bArr[i2])) / 32768.0f);
                    }
                } else {
                    int position = allocate.position();
                    float[] fArr = new float[position];
                    allocate.rewind();
                    allocate.get(fArr);
                    C59104x b3 = f266546a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "HerbieRecorder");
                    ((C59052c) ((C59052c) b3).mo56372aa(14799)).mo56395y("read %d frames from last inserted uri=%s", position, j);
                    b2.close();
                    return fArr;
                }
            }
        } catch (IOException e) {
            C59104x c3 = f266546a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "HerbieRecorder");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(14800)).mo56386p("failed to read audio");
            return new float[0];
        }
    }

    /* renamed from: d */
    public final void mo83577d(int i) {
        this.f266550e.mo89295h(this.f266551f);
        this.f266552g = i;
        this.f266547b = true;
    }
}
