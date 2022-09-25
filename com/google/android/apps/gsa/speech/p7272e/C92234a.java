package com.google.android.apps.gsa.speech.p7272e;

import android.content.res.Resources;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92240b;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59332o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.speech.e.a */
/* compiled from: PG */
public final class C92234a implements C92240b {

    /* renamed from: a */
    private static final C59071e f257154a = C59071e.m91332i("com.google.android.apps.gsa.speech.e.a");

    /* renamed from: b */
    private static final int[] f257155b = {R.raw.ep_acoustic_model, R.raw.endpointer_dictation, R.raw.endpointer_voicesearch, R.raw.metadata};

    /* renamed from: c */
    private static final String[] f257156c = {"ep_acoustic_model", "endpointer_dictation.config", "endpointer_voicesearch.config", "metadata"};

    /* renamed from: d */
    private final Resources f257157d;

    public C92234a(Resources resources) {
        this.f257157d = resources;
    }

    /* renamed from: a */
    public final boolean mo86909a(C58881cr crVar, C92248j jVar) {
        if (jVar.mo86931j("en-US", C92252n.ENDPOINTER_VOICESEARCH) && jVar.mo86931j("en-US", C92252n.ENDPOINTER_DICTATION)) {
            return false;
        }
        File file = new File((File) crVar.mo6453a(), "en-US");
        if (file.exists() || file.mkdir()) {
            int i = 0;
            while (i < 4) {
                try {
                    File file2 = new File(file, f257156c[i]);
                    if (!file2.exists()) {
                        InputStream openRawResource = this.f257157d.openRawResource(f257155b[i]);
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        C59332o.m92211b(openRawResource, fileOutputStream);
                        fileOutputStream.close();
                    }
                    i++;
                } catch (IOException e) {
                    C59104x c = f257154a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "VS.EPModelCopier");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12265)).mo56386p("Error copying EP models");
                    return false;
                }
            }
            return true;
        }
        C59104x c2 = f257154a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "VS.EPModelCopier");
        ((C59052c) ((C59052c) c2).mo56372aa(12264)).mo56389s("Unable to create model dir: %s", file.getAbsolutePath());
        return false;
    }
}
